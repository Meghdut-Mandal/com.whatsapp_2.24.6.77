package X;

/* renamed from: X.3gh  reason: invalid class name and case insensitive filesystem */
public final class C71393gh implements C159417jK {
    public final C20810yC A00;
    public final C62633Gx A01;

    public void BV1() {
        if (this.A00.A0E(7222)) {
            C62633Gx r7 = this.A01;
            AnonymousClass005 r5 = r7.A01.A00;
            if (C36371kC.A1U(C36391kE.A0H(r5), "automatic_account_report_enabled")) {
                long A0B = C36341k9.A0B(C36391kE.A0H(r5), "automatic_account_report_requested_ts_sec");
                int A07 = r7.A02.A07(7233);
                if (A07 < 30) {
                    A07 = 2592000;
                }
                if (C36401kF.A1U(((C36371kC.A09(r7.A00) - A0B) > ((long) A07) ? 1 : ((C36371kC.A09(r7.A00) - A0B) == ((long) A07) ? 0 : -1)))) {
                    r7.A00(C51622o7.ACCOUNT);
                }
            }
            if (C36371kC.A1U(C36391kE.A0H(r5), "automatic_channel_report_enabled")) {
                long A0B2 = C36341k9.A0B(C36391kE.A0H(r5), "automatic_channels_report_requested_ts_sec");
                int A072 = r7.A02.A07(7233);
                if (A072 < 30) {
                    A072 = 2592000;
                }
                if (C36401kF.A1U(((C36371kC.A09(r7.A00) - A0B2) > ((long) A072) ? 1 : ((C36371kC.A09(r7.A00) - A0B2) == ((long) A072) ? 0 : -1)))) {
                    r7.A00(C51622o7.NEWSLETTER);
                }
            }
        }
    }

    public C71393gh(C20810yC r1, C62633Gx r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
