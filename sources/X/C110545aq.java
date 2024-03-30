package X;

/* renamed from: X.5aq  reason: invalid class name and case insensitive filesystem */
public abstract class C110545aq {
    public static int A00(int i) {
        int i2 = 1;
        int i3 = 0;
        if (i != 1) {
            i3 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i != 4) {
                        throw AnonymousClass000.A0d("unrecognized SignalMessageType; value=", AnonymousClass000.A0u(), i);
                    }
                }
            }
            return i2;
        }
        return i3;
    }

    public static AnonymousClass630 A01(AnonymousClass6EZ r1, AnonymousClass189 r2, byte[] bArr) {
        AnonymousClass9K2 A09 = r2.A09(r1, bArr);
        return new AnonymousClass630(A09.A02, 2, A00(A09.A00));
    }
}
