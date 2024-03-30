package net.minidev.json.annotate;

public @interface JsonIgnore {
    boolean value() default true;
}
