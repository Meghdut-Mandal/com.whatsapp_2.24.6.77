package X;

import java.util.Map;

/* renamed from: X.8yx  reason: invalid class name and case insensitive filesystem */
public enum C188048yx {
    ;
    
    public static final Map A00 = null;

    /* access modifiers changed from: public */
    static {
        A00 = AnonymousClass001.A0J();
        for (C188048yx r2 : values()) {
            if (r2 == A02) {
                A00.put("switch", r2);
            } else if (r2 != A03) {
                A00.put(r2.name(), r2);
            }
        }
    }

    public static C188048yx A00(String str, int i) {
        return new C188048yx(str, i);
    }
}
