package com.marvin.shell.listener;

import com.marvin.shell.event.ShellEvent;
import com.marvin.shell.event.ShellEvents;
import com.marvin.component.event.subscriber.SubscriberInterface;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

public class ShellSubscriber implements SubscriberInterface<ShellEvent> {

    @Override
    public Map<String, Consumer<ShellEvent>> getSubscribedEvents() {
        Map<String, Consumer<ShellEvent>> map = new ConcurrentHashMap<>();
        map.put(ShellEvents.START, this::start);
        map.put(ShellEvents.BEFORE_LOAD, this::beforeLoad);
        map.put(ShellEvents.AFTER_LOAD, this::afterLoad);
        map.put(ShellEvents.TERMINATE, this::terminate);
        return map;
    }
    
    private void start(ShellEvent event){
        System.out.println("test");
    }
    
    private void beforeLoad(ShellEvent event){
        System.out.println("test");
    }
    
    private void afterLoad(ShellEvent event){
        System.out.println("test");
    }
    
    private void terminate(ShellEvent event){
        System.out.println("test");
    }
}
