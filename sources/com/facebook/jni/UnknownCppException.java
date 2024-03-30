package com.facebook.jni;

public class UnknownCppException extends CppException {
    public UnknownCppException(String str) {
        super(str);
    }

    public UnknownCppException() {
        super("Unknown");
    }
}
