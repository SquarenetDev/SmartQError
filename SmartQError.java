package com.squarenet.smartq;

public enum SmartQError {
    SUCCESS("성공", 1004),
    NO_DATA("데이터 없음", 1005),
    NOT_FOUND("대상 없음", 1006),
    CANCEL("취소", 1007),
    FAIL("실패", 1008),
    EXIST_USER("등록된 사용자", 1009),
    NOT_EXIST_USER("등록되지 않은 사용자", 1010),
    NO_PARAM("파라미터 없음", 1011),
    NOT_SUPPORT("지원되지 않음", 1012),
    NOT_REGIST("등록되지 않음", 1013),
    UNKNOWN_ERROR("알수 없는 에러", 1014),
    NOT_REGIST_BIO("생체인증 등록되지 않음", 1015),
    LOCK_BIO("생체인증 잠김", 1016),
    ALREADY_REGIST("중복된 등록", 1017),
    NETWORK_ERROR("네트워크 오류", 1018);

    private String errorMessage;
    private int errorCode;

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
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage =  errorMessage;
    }
}

