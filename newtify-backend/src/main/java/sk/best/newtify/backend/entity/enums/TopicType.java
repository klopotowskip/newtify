package sk.best.newtify.backend.entity.enums;

import com.fasterxml.jackson.annotation.JsonValue;


public enum TopicType {

    NEWS("NEWS"),

    GAMING("GAMING"),

    FASHION("FASHION"),

    FINANCE("FINANCE"),

    MOVIE("MOVIE"),

    MUSIC("MUSIC");

    private String value;

    TopicType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TopicType fromValue(String value){
        return valueOf(value);
    }
}

