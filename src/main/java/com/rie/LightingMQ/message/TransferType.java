package com.rie.LightingMQ.message;

/**
 * Created by Charley on 2017/7/17.
 */
public enum TransferType {

    CALL((byte)1),
    REPLY((byte)2),
    EXCEPTION((byte)3);

    public final byte value;

    TransferType(byte b) {
        this.value = b;
    }

    final static int size = values().length;

    public static TransferType valueOf(int index) {

        TransferType result = null;

        if (index > 0 || index < size) {
            result = values()[index];
        }
        return result;
    }
}