package X;

import com.whatsapp.productinfra.reportingtoken.cron.ReportingTokenCleanupDailyCron$onDailyCron$1;

/* renamed from: X.6sn  reason: invalid class name and case insensitive filesystem */
public final class C144776sn implements C159417jK {
    public final C29621Xi A00;
    public final C005502l A01;
    public final C19970wo A02;
    public final C20810yC A03;
    public final AnonymousClass040 A04;

    public void BV1() {
        int A07 = this.A03.A07(6723);
        if (A07 > 60) {
            A07 = 60;
        } else if (A07 < 0) {
            return;
        }
        C36331k8.A1T(new ReportingTokenCleanupDailyCron$onDailyCron$1(this, (C023509x) null, System.currentTimeMillis() - (((long) A07) * 86400000)), this.A04);
    }

    public C144776sn(C19970wo r1, C29621Xi r2, C20810yC r3, C005502l r4, AnonymousClass040 r5) {
        C36321k7.A1B(r1, r3, r2, r4, r5);
        this.A02 = r1;
        this.A03 = r3;
        this.A00 = r2;
        this.A01 = r4;
        this.A04 = r5;
    }
}
