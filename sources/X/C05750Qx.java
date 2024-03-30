package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0Qx  reason: invalid class name and case insensitive filesystem */
public abstract class C05750Qx {
    public static final C12960iw A00(Integer num, int i) {
        int i2;
        if (i == -2) {
            if (num == C023109s.A00) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C12960iw.A05;
                AnonymousClass0W2 r0 = C18010sR.A00;
                i2 = AnonymousClass0W2.A00;
            }
            return new AnonymousClass0n8(1, num);
        } else if (i != -1) {
            if (i != 0) {
                i2 = Integer.MAX_VALUE;
                if (i != Integer.MAX_VALUE) {
                    if (num == C023109s.A00) {
                        return new C12960iw(i);
                    }
                    return new AnonymousClass0n8(i, num);
                }
            } else {
                if (num == C023109s.A00) {
                    return new C12960iw(0);
                }
                return new AnonymousClass0n8(1, num);
            }
        } else if (num == C023109s.A00) {
            return new AnonymousClass0n8(1, C023109s.A01);
        } else {
            throw AnonymousClass001.A08("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        return new C12960iw(i2);
    }
}
