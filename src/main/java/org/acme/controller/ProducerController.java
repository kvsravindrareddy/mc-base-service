package org.acme.controller;

import org.acme.service.MessageService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/producer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProducerController {

    @Inject
    private MessageService messageService;

    @POST
    @Path("/kafka/{topicName}")
    public void sendToTopic(@PathParam("topicName")String topicName) {
        messageService.publisMessage(topicName, "hello");
    }
}