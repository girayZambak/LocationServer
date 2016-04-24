package tr.util.classes;

public enum ExceptionType {
    DATABASE_EXCEPTION("001", "DataBaseException"),
    UNDEFINED_USER_EXCEPTION("002", "Kullanýcý adý tanýmsýz!"),
    UNDEFINED_SESSION_CODE_EXCEPTION("003", "Oturum kodu tanýmsýz!"),
    UNDEFINED_ROLE_ID_EXCEPTION("004", "Makam id tanýmsýz!"),
    AUTH_COMMUNICATION_ERROR("005", "Yetkilendirme sunucusu ile iletiþim hatasý oldu!"),
    AUTH_CONNECTION_LOST("006", "Yetkilendirme sunucusu ile baðlantý kurulamadý!"),
    SESSION_UNVALID("007", "Geçersiz oturum!"),
    UNAUTHORIZED_PROJECT("008", "Proje için yetki yok!"),
    UNAUTHORIZED_ACTION("009", "Eylem için yetki yok"),
    UNKWOWN_USER_EXCEPTION("010", "Kullanýcý bilgisi bulunamadý!");

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
