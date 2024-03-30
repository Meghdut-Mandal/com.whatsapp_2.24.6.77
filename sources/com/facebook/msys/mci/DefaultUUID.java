package com.facebook.msys.mci;

import X.C36361kB;

public class DefaultUUID implements UUID {
    public static final UUID mUUID = new DefaultUUID();

    public static UUID get() {
        return mUUID;
    }

    public String createString() {
        return C36361kB.A0l();
    }
}
