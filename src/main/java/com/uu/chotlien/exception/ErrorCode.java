package com.uu.chotlien.exception;

public enum ErrorCode {
    EMAIL_REGISTERED("CL0001");
    public final String value;

    private ErrorCode(String value) {
        this.value = value;
    }
}
