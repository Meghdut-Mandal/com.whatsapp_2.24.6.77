package X;

import java.util.Map;

/* renamed from: X.8yw  reason: invalid class name and case insensitive filesystem */
public enum C188038yw {
    nth_child,
    nth_of_type,
    nth_last_of_type,
    UNSUPPORTED;
    
    public static final Map A00 = null;

    /* access modifiers changed from: public */
    static {
        A00 = AnonymousClass001.A0J();
        for (C188038yw r3 : values()) {
            if (r3 != UNSUPPORTED) {
                A00.put(r3.name().replace('_', '-'), r3);
            }
        }
    }
}
