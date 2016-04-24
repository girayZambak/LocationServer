package tr.util.enums;

public enum ConfirmTypeEnum {
    SAVE_USER(1L),
    LOGIN_USER(2L);

    private Long value;

    private ConfirmTypeEnum(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return this.value;
    }

}
