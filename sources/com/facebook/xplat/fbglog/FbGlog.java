package com.facebook.xplat.fbglog;

import X.AnonymousClass10O;
import X.AnonymousClass6YR;
import X.AnonymousClass95L;
import java.util.List;

public class FbGlog {
    public static AnonymousClass95L A00;

    public static native void setLogLevel(int i);

    public static native void setSkipSubscribe(boolean z);

    static {
        AnonymousClass10O.A00("fb");
    }

    public static synchronized void ensureSubscribedToBLogLevelChanges() {
        synchronized (FbGlog.class) {
            if (A00 == null) {
                AnonymousClass95L r2 = new AnonymousClass95L();
                A00 = r2;
                List list = AnonymousClass6YR.A00;
                synchronized (AnonymousClass6YR.class) {
                    list.add(r2);
                }
                setLogLevel(AnonymousClass6YR.A01.BEI());
            }
        }
    }
}
