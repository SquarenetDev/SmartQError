package com.squarenet.smartq;

public enum SmartQError {
    SUCCESS("성공", 1004),
    NO_DATA("데이터 없음", 1005),
    NOT_FOUND("대상 없음", 1006),
    CANCEL("취소", 1007),
    FAIL("실패", 1008),
    EXIST_USER("등록된 사용자", 1009),
    NOT_EXIST_USER("등록되지 않은 사용자", 1010);
    
    final private String errorMessage;
    final private int errorCode;

    SmartQError(String errorMessage, int errorCode) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode+"";
    }
    public String getErrorMessage() {
        return errorMessage;
    }
}

