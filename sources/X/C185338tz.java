package X;

/* renamed from: X.8tz  reason: invalid class name and case insensitive filesystem */
public final class C185338tz extends C118095nK implements C23048B1t {
    public String BIF() {
        return "payload-too-large";
    }

    public Long B9o() {
        return 413L;
    }

    public C185338tz(C203399nx r10) {
        C203399nx r2 = r10;
        String[] A0L = C203399nx.A0L(r10);
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        C203379ns.A03(r2, String.class, A0P, A0Q, "payload-too-large", A0L, false);
        C203379ns.A03(r2, Long.class, A0P, A0Q, 413L, C165597tg.A1Z(), false);
        this.A00 = r10;
    }
}
