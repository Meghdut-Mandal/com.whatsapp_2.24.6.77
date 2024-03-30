package X;

/* renamed from: X.3GQ  reason: invalid class name */
public final class AnonymousClass3GQ {
    public C21700zf A00;
    public final AnonymousClass173 A01;
    public final C20810yC A02;

    public final void A00(String str) {
        if (this.A02.A0E(2396)) {
            C21700zf r1 = this.A00;
            if (r1 != null) {
                r1.A0C(4);
            }
            C21710zg r3 = new C21710zg(185473396);
            C21700zf A012 = this.A01.A01(r3, "QrScanFlow");
            this.A00 = A012;
            r3.A04 = true;
            AnonymousClass00C.A0B(A012);
            A012.A0D(str, -1);
            A012.A0A("entry_point", str, false);
            A012.A07("scan_qr_code");
        }
    }

    public final void A01(short s) {
        C21700zf r1;
        if (this.A02.A0E(2396) && (r1 = this.A00) != null) {
            r1.A06("scan_qr_code");
            r1.A0C(s);
            this.A00 = null;
        }
    }

    public AnonymousClass3GQ(AnonymousClass173 r1, C20810yC r2) {
        C36321k7.A0x(r2, r1);
        this.A02 = r2;
        this.A01 = r1;
    }
}
