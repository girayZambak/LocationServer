package tr.util.classes;

public enum ExceptionType {
    DATABASE_EXCEPTION("001", "DataBaseException"),
    UNDEFINED_USER_EXCEPTION("002", "Kullan�c� ad� tan�ms�z!"),
    UNDEFINED_SESSION_CODE_EXCEPTION("003", "Oturum kodu tan�ms�z!"),
    UNDEFINED_ROLE_ID_EXCEPTION("004", "Makam id tan�ms�z!"),
    AUTH_COMMUNICATION_ERROR("005", "Yetkilendirme sunucusu ile ileti�im hatas� oldu!"),
    AUTH_CONNECTION_LOST("006", "Yetkilendirme sunucusu ile ba�lant� kurulamad�!"),
    SESSION_UNVALID("007", "Ge�ersiz oturum!"),
    UNAUTHORIZED_PROJECT("008", "Proje i�in yetki yok!"),
    UNAUTHORIZED_ACTION("009", "Eylem i�in yetki yok"),
    UNKWOWN_USER_EXCEPTION("010", "Kullan�c� bilgisi bulunamad�!");

    private String exceptionKod;
    private String exceptionTanim;

    private ExceptionType(String exceptionKod, String exceptionTanim) {
        this.exceptionKod = exceptionKod;
        this.exceptionTanim = exceptionTanim;
    }

    public String getExceptionKod() {
        return this.exceptionKod;
    }

    public void setExceptionKod(String exceptionKod) {
        this.exceptionKod = exceptionKod;
    }

    public String getExceptionTanim() {
        return this.exceptionTanim;
    }

    public void setExceptionTanim(String exceptionTanim) {
        this.exceptionTanim = exceptionTanim;
    }
}
