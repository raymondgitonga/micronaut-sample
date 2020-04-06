package com.tosh;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

@Controller("/conferences")
public class ConferenceController {

    @Inject
    private ConferenceService conferenceService;


    @Get("/random")
    public Conference randomConf() {
        return conferenceService.randomConf();
    }
}
