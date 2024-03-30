package X;

/* renamed from: X.3hM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71803hM implements AnonymousClass4QH {
    public final /* synthetic */ AnonymousClass11F A00;
    public final /* synthetic */ Long A01;

    public /* synthetic */ C71803hM(AnonymousClass11F r1, Long l) {
        this.A00 = r1;
        this.A01 = l;
    }

    public final void BwV(AnonymousClass3T1 r6) {
        AnonymousClass11F r2 = this.A00;
        Long l = this.A01;
        if (r2 != null && !C64933Qa.A01(r6).equals(r2)) {
            return;
        }
        if (l == null || r6.A1O <= l.longValue()) {
            r6.A15 = false;
        }
    }
}
