/*
 * Copyright (C) 2018. Huawei Technologies Co., LTD. All rights reserved.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of Apache License, Version 2.0.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Apache License, Version 2.0 for more details.
 */
package com.smn.request.sms;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * sms callback entity
 *
 * @author zhangyx
 * @version 0.8
 */
public class SmsCallback {
    /**
     * callback event type
     */
    @JsonProperty("event_type")
    private String eventType;

    /**
     * topic urn
     */
    @JsonProperty("topic_urn")
    private String topicUrn;

    /**
     * no args construct
     */
    public SmsCallback() {

    }

    /**
     * construct
     *
     * @param eventType the eventType to set
     * @param topicUrn  the topicUrn to st
     */
    public SmsCallback(String eventType, String topicUrn) {
        this.eventType = eventType;
        this.topicUrn = topicUrn;
    }

    /**
     * @return the event_type
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * @param eventType the eventType to set
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * @return eht topic_urn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    /**
     * @param topicUrn the topic_urn to set
     */
    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }
}
