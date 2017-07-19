package com.rie.LightingMQ.broker;

/**
 * Created by Charley on 2017/7/18.
 */
public enum RequestHandlerType {

    FETCH((short)1),
    PRODUCE((short)2),
    REPLICA((short)3);

    public final short value;

    RequestHandlerType(short i) {
        this.value  = i;
    }

    final static int size = values().length;

    public static RequestHandlerType valueOf(int index) {

        RequestHandlerType result = null;
        if (index >= 0 || index < size) {
            result = values()[index];
        }
        return result;
    }
}
