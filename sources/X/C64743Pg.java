package X;

import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import com.whatsapp.spamreport.ReportSpamDialogFragment;

/* renamed from: X.3Pg  reason: invalid class name and case insensitive filesystem */
public final class C64743Pg {
    public int A00 = 1;
    public UserJid A01;
    public C64933Qa A02;
    public C88114Rl A03;
    public boolean A04;
    public boolean A05 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public boolean A08 = true;
    public final C20810yC A09;
    public final AnonymousClass11F A0A;
    public final String A0B;
    public final boolean A0C;

    public C64743Pg(C20810yC r2, AnonymousClass11F r3, String str, boolean z) {
        C36321k7.A16(r2, r3, str, 1);
        this.A0A = r3;
        this.A0B = str;
        this.A09 = r2;
        this.A0C = z;
    }

    public final void A02(C44072La r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = false;
        this.A06 = r2.A0M();
        this.A00 = 2;
    }

    public static C64743Pg A00(C20810yC r3, AnonymousClass11F r4, AnonymousClass3T1 r5, String str, boolean z) {
        C64743Pg r2 = new C64743Pg(r3, r4, str, z);
        r2.A00 = 0;
        r2.A08 = false;
        r2.A01 = r5.A0L();
        r2.A05 = false;
        r2.A07 = false;
        return r2;
    }

    public final ReportSpamDialogFragment A01() {
        C20810yC r3 = this.A09;
        if (C36421kH.A1Z(r3)) {
            AnonymousClass11F r1 = this.A0A;
            if ((r1 instanceof UserJid) || (r1 instanceof C177528dw)) {
                this.A07 = false;
                this.A05 = false;
            }
        }
        if (r3.A0E(6185)) {
            AnonymousClass11F r12 = this.A0A;
            if ((r12 instanceof UserJid) || (r12 instanceof C177528dw)) {
                this.A06 = true;
                this.A08 = false;
            }
        }
        AnonymousClass11F r2 = this.A0A;
        UserJid userJid = this.A01;
        String str = this.A0B;
        boolean z = this.A0C;
        int i = this.A00;
        boolean z2 = this.A08;
        boolean z3 = this.A05;
        boolean z4 = this.A07;
        boolean z5 = this.A06;
        boolean z6 = this.A04;
        C64933Qa r6 = this.A02;
        C88114Rl r5 = this.A03;
        ReportSpamDialogFragment reportSpamDialogFragment = new ReportSpamDialogFragment();
        Bundle A0B2 = C36351kA.A0B(r2, "jid");
        A0B2.putString("senderJid", C36381kD.A0w(userJid));
        A0B2.putString("flow", str);
        A0B2.putBoolean("hasLoggedInPairedDevices", z);
        A0B2.putInt("upsellAction", i);
        A0B2.putBoolean("upsellCheckboxActionDefault", z2);
        A0B2.putBoolean("shouldDeleteChatOnBlock", z3);
        A0B2.putBoolean("shouldOpenHomeScreenAction", z4);
        A0B2.putBoolean("shouldDisplayUpsellCheckbox", z5);
        A0B2.putBoolean("notifyObservableDialogHost", z6);
        if (r6 != null) {
            AnonymousClass3UJ.A08(A0B2, r6);
        }
        reportSpamDialogFragment.A0J = r5;
        reportSpamDialogFragment.A17(A0B2);
        return reportSpamDialogFragment;
    }
}
