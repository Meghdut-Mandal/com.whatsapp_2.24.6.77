package X;

import android.util.Pair;
import java.util.UUID;

/* renamed from: X.1ft  reason: invalid class name and case insensitive filesystem */
public final class C33761ft {
    public final C21010yW A00;

    public C33761ft(C21010yW r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final void A01(int i) {
        C44792Ow r1 = new C44792Ow();
        r1.A00 = Integer.valueOf(i);
        this.A00.Blv(r1);
    }

    public final void A02(int i, String str) {
        C44792Ow r1 = new C44792Ow();
        r1.A00 = Integer.valueOf(i);
        if (str != null) {
            r1.A01 = str;
        }
        this.A00.Blv(r1);
    }

    public final void A03(String str, int i) {
        C45582Rx r1 = new C45582Rx();
        r1.A01 = Integer.valueOf(i);
        r1.A05 = str;
        this.A00.Blv(r1);
    }

    public final Pair A00() {
        String obj = UUID.randomUUID().toString();
        AnonymousClass00C.A08(obj);
        C44532Nw r1 = new C44532Nw();
        r1.A00 = obj;
        this.A00.Bly(r1);
        return new Pair("anid", obj);
    }
}
