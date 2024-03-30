package X;

import java.util.Map;

/* renamed from: X.5U2  reason: invalid class name */
public enum AnonymousClass5U2 {
    ;
    
    public static final Map A00 = null;

    /* access modifiers changed from: public */
    static {
        A00 = AnonymousClass001.A0J();
        for (AnonymousClass5U2 r3 : values()) {
            if (r3 == A02) {
                A00.put("class", r3);
            } else if (r3 != A03) {
                A00.put(r3.name().replace('_', '-'), r3);
            }
        }
    }

    public static AnonymousClass5U2 A00(String str) {
        AnonymousClass5U2 r0 = (AnonymousClass5U2) A00.get(str);
        if (r0 == null) {
            return A03;
        }
        return r0;
    }

    public static AnonymousClass5U2 A01(String str, int i) {
        return new AnonymousClass5U2(str, i);
    }
}
