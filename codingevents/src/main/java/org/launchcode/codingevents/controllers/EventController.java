package org.launchcode.codingevents.controllers;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    private static HashMap<String, String> events = null;

    @PostConstruct
    public void init() throws Exception {
        events = new HashMap<>();
        {
            events.put("Coding Event", "Meet other coders!");
            events.put("Event for Coding", "Meet even more coders!");
            events.put("Coding with Coders", "Meet coders who want to code!");
        }
    };

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("events", events);
        return "events/index";
    }

    // location /events/create
    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }

    @PostMapping("create")
    public String createEvent(@RequestParam String eventName, String eventDescription) {
        events.put(eventName, eventDescription);
        return "redirect:/events";
    }


}