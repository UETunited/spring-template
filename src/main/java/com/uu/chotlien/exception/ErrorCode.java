package com.uu.chotlien.exception;

public enum ErrorCode {
    EMAIL_REGISTERED("CL0001"),
    UNAUTHORIZED("CL401"),
    NOT_FOUND("CL404");
    public final String value;

    private ErrorCode(String value) {
        this.value = value;
    }
}
