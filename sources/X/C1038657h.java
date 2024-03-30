package X;

import com.whatsapp.util.Log;

/* renamed from: X.57h  reason: invalid class name and case insensitive filesystem */
public final class C1038657h extends AnonymousClass1DJ {
    public boolean A00;
    public boolean A01;
    public final C24461Cn A02;
    public final C19420v0 A03;
    public final C20810yC A04;
    public final C19770wU A05;
    public final C21570zS A06;

    public void A01() {
        if (!this.A00 && this.A04.A0E(4774)) {
            C24461Cn r6 = this.A02;
            if (C36371kC.A08(C36411kG.A0E(r6.A01), "bg_gpb_eligible_timestamp") == -1) {
                Log.i("GoogleBackupABPropsObserver/handleGracePeriodBannerAbProp start GPB eligible timestamp");
                r6.A06("bg_gpb_eligible_timestamp");
                if (AnonymousClass6YN.A0E(this.A03)) {
                    C1497072l.A00(this.A05, this, 8);
                } else {
                    Log.i("GoogleBackupABPropsObserver/handleGracePeriodBannerAbProp mark user for enforcement");
                    r6.A07(true);
                }
            }
        }
        if (!this.A01 && this.A04.A0E(6178) && !AnonymousClass6YN.A0E(this.A03)) {
            Log.i("GoogleBackupABPropsObserver/handleNewUserEnforcementAbProp mark user for enforcement");
            this.A02.A07(true);
        }
    }

    public void A02() {
        C20810yC r1 = this.A04;
        this.A00 = r1.A0E(4774);
        this.A01 = r1.A0E(6178);
    }

    public C1038657h(C24461Cn r1, C19420v0 r2, C20810yC r3, C19770wU r4, C21570zS r5) {
        C36321k7.A1B(r3, r4, r5, r2, r1);
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = r5;
        this.A03 = r2;
        this.A02 = r1;
    }
}
