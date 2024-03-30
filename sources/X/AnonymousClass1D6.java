package X;

import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.1D6  reason: invalid class name */
public abstract class AnonymousClass1D6 implements AnonymousClass00L {
    public static AnonymousClass1D7 A00() {
        if (AnonymousClass1D7.A01 == null) {
            synchronized (AnonymousClass1D7.class) {
                if (AnonymousClass1D7.A01 == null) {
                    AnonymousClass1D7.A01 = new AnonymousClass1D7(JniBridge.getInstance());
                }
            }
        }
        AnonymousClass1D7 r0 = AnonymousClass1D7.A01;
        C19620wF.A00(r0);
        return r0;
    }
}
