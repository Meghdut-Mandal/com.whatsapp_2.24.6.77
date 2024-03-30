package X;

/* renamed from: X.2Mm  reason: invalid class name and case insensitive filesystem */
public class C44212Mm extends AnonymousClass1DJ {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass196 A04;
    public final AnonymousClass1AK A05;
    public final C20810yC A06;
    public final C19770wU A07;

    public void A01() {
        if (!this.A02 && C36391kE.A1X(this.A06)) {
            this.A07.Boz(C80213v2.A00(this, 7), "note_to_self_enabled");
        }
        if (!this.A00 && this.A06.A0E(3530)) {
            this.A07.Boz(C80213v2.A00(this, 8), "external_web_beta_sync_enabled");
        }
        if (!this.A01 && this.A06.A0E(2775)) {
            this.A07.Boz(C80213v2.A00(this, 9), "favorite_sticker_sync_enabled");
        }
        if (!this.A03 && this.A06.A0E(7955)) {
            this.A07.Boz(C80213v2.A00(this, 10), "privacy_setting_disable_link_previews_sync_enabled");
        }
        AnonymousClass196 r3 = this.A04;
        r3.A0W.Boy(new C35671j4(r3, 29));
    }

    public void A02() {
        C20810yC r1 = this.A06;
        this.A02 = C36391kE.A1X(r1);
        this.A00 = r1.A0E(3530);
        this.A01 = r1.A0E(2775);
        this.A03 = r1.A0E(7955);
    }

    public C44212Mm(AnonymousClass196 r1, AnonymousClass1AK r2, C20810yC r3, C19770wU r4) {
        this.A06 = r3;
        this.A07 = r4;
        this.A04 = r1;
        this.A05 = r2;
    }
}
