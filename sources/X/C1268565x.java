package X;

import java.util.Map;

/* renamed from: X.65x  reason: invalid class name and case insensitive filesystem */
public final class C1268565x {
    public final Map A00 = C36431kI.A1G();

    public final synchronized AnonymousClass9XM A00(String str) {
        return (AnonymousClass9XM) this.A00.get(str);
    }

    public final synchronized void A01(String str) {
        this.A00.remove(str);
    }
}
