package com.rie.LightingMQ.broker.requestHandlers;

import com.rie.LightingMQ.broker.RequestHandler;
import com.rie.LightingMQ.message.Message;
import com.rie.LightingMQ.message.Topic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by Charley on 2017/7/18.
 */
public class DefaultPublishRequestHandler implements RequestHandler{

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultPublishRequestHandler.class);

    @Override
    public Message requestHandle(Message request) {

        List<Topic> contents = request.getBody();

        if (contents != null) {
            System.out.println("have contents");
        }
        else {
            System.out.println("no contents");
        }
        Message response = Message.newResponseMessage();
        response.setSeqId(request.getSeqId());
        return response;
    }
}