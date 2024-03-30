package com.facebook.native_bridge;

public interface Promise {
    void setException(String str);

    void setValue(Object obj);
}
