package io.training.micronaut.listener;

import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.context.event.StartupEvent;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Singleton;

@Slf4j
@Singleton
public class SampleEventListener implements ApplicationEventListener<StartupEvent> {


    @Override
    public void onApplicationEvent(StartupEvent event) {
        log.info("##############################startup");
    }
}
