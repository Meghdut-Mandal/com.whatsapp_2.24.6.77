package X;

import android.util.LruCache;

/* renamed from: X.9iD  reason: invalid class name and case insensitive filesystem */
public class C200779iD {
    public static final C200779iD A01 = new C200779iD();
    public LruCache A00;

    public static synchronized C200779iD A00() {
        C200779iD r0;
        synchronized (C200779iD.class) {
            r0 = A01;
        }
        return r0;
    }
}
