package tr.util.enums;

public enum ActiveEnum {
    ACTIVE(true),
    PASSIVE(false);

    private Boolean value;

    private ActiveEnum(Boolean value) {
        this.value = value;
    }

    public Boolean getValue() {
        return this.value;
    }

}
