package org.springframework;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * Created by kparikh on 9/16/14.
 */
public class NoOpProcessor {

    private ObjectMapper mapper = new ObjectMapper();

    public String transform(String payload) {
        return payload;
    }
}