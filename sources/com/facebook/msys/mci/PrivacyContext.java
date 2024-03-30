package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;
import java.util.Collections;
import java.util.Set;

public class PrivacyContext {
    public final NativeHolder mNativeHolder;

    public static native PrivacyContext newPrivacyContext(Set set);

    public native Set getKeys();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof PrivacyContext)) {
            return false;
        }
        return getKeys().equals(((PrivacyContext) obj).getKeys());
    }

    public PrivacyContext(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static PrivacyContext newPrivacyContext(String str) {
        return newPrivacyContext(Collections.singleton(str));
    }

    public int hashCode() {
        return getKeys().hashCode();
    }
}
