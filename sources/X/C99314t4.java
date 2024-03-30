package X;

import android.content.Context;

/* renamed from: X.4t4  reason: invalid class name and case insensitive filesystem */
public final class C99314t4 extends AnonymousClass0NP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C35011i0 A02;
    public final /* synthetic */ Integer A03;

    public C99314t4(Context context, C35011i0 r2, Integer num, int i) {
        this.A02 = r2;
        this.A01 = context;
        this.A00 = i;
        this.A03 = num;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj, int i) {
        C35011i0 r2 = this.A02;
        Context context = this.A01;
        int i2 = this.A00;
        Integer num = this.A03;
        C35011i0.A00(context, r2, num, "status_fragment", i2);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error code: ");
        A0u.append(i2);
        ((AnonymousClass1UZ) r2.A0G.get()).A05("SEE_CROSSPOST_ERROR", AnonymousClass000.A0l(num, ", error subcode: ", A0u));
    }
}
