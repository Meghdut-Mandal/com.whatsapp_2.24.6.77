package X;

import android.util.LruCache;

/* renamed from: X.8qf  reason: invalid class name and case insensitive filesystem */
public final class C183358qf extends AnonymousClass12N {
    public final LruCache A00 = new LruCache(5);
    public final LruCache A01 = new LruCache(100);
    public final C20810yC A02;
    public final C24611Dc A03 = C165607th.A0a("IndiaUpiP2mCheckoutSessionCacheManager");

    public final void A0A(String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A03.A04(AnonymousClass000.A0p("Removing cached checkout session for ", str, AnonymousClass000.A0u()));
        this.A01.remove(str);
    }

    public final void A09(C186238vd r6, String str, String str2) {
        C184408sO r0;
        Long l;
        if (this.A02.A0E(7302) && AnonymousClass00C.A0J(str2, "UPI") && (r0 = r6.A01) != null && (l = r0.A00) != null && l.longValue() > 0) {
            this.A01.put(str, new C199719fq(r6));
        }
    }

    public String BHv() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("P2mCheckoutSessionCache - ");
        A0u.append(this.A01.size() + this.A00.size());
        return AnonymousClass000.A0q(" items", A0u);
    }

    public void Bjh(AnonymousClass5SK r2, boolean z) {
        this.A01.evictAll();
        this.A00.evictAll();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C183358qf(C20810yC r3, C220112n r4) {
        super(r4);
        C36321k7.A0x(r3, r4);
        this.A02 = r3;
    }
}
