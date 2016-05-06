package tr.util.enums;

public enum EmergencyStatusEnum {
    ACTIVE(1L),
    PASSIVE(2L);

    private Long value;

    private EmergencyStatusEnum(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return this.value;
    }

}
