package org.springframework;

import org.springframework.messaging.Message;


/**
 * Created by kparikh on 9/16/14.
 */
public class NoOpProcessor {
    public Message transform(Message payload) {
        return payload;
    }
}
