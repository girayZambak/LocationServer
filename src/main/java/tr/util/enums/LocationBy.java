package tr.util.enums;

public enum LocationBy {
    GPS(1L),
    INTERNET(2L);

    private Long value;

    private LocationBy(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return this.value;
    }

}
