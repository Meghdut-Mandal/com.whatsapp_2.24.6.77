package com.whatsapp.waffle.wfac.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01L;
import X.AnonymousClass04R;
import X.AnonymousClass07B;
import X.AnonymousClass0XN;
import X.AnonymousClass190;
import X.AnonymousClass3TI;
import X.AnonymousClass66X;
import X.C19770wU;
import X.C25271Fq;
import X.C28201Rs;
import X.C29501Ww;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36411kG;
import X.C36441kJ;
import X.C64703Pc;
import android.app.Activity;
import com.whatsapp.R;

public final class WfacBanViewModel extends AnonymousClass04R {
    public int A00 = 1;
    public String A01 = "other";
    public final C25271Fq A02;
    public final C28201Rs A03 = C36441kJ.A0t();
    public final AnonymousClass66X A04;
    public final C29501Ww A05;
    public final C19770wU A06;
    public final C64703Pc A07;

    public WfacBanViewModel(C25271Fq r3, C29501Ww r4, C19770wU r5, C64703Pc r6, AnonymousClass66X r7) {
        AnonymousClass00C.A0D(r4, 1);
        C36321k7.A19(r7, r3, r6, r5);
        this.A05 = r4;
        this.A04 = r7;
        this.A02 = r3;
        this.A07 = r6;
        this.A06 = r5;
    }

    public static final void A02(Activity activity) {
        AnonymousClass07B supportActionBar = ((AnonymousClass01L) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(false);
            supportActionBar.A0I(R.string.f12nameremoved);
        }
    }

    public final int A0S() {
        int i = C36411kG.A0E(this.A04.A00.A01).getInt("wfac_ban_violation_source", -1);
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return -1;
        }
        return 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0037, code lost:
        if (r0.length() == 0) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T() {
        /*
            r4 = this;
            java.lang.String r0 = "WfacBanViewModel/updateBanState"
            X.AnonymousClass3TI.A01(r0)
            X.66X r0 = r4.A04
            java.lang.String r0 = r0.A00()
            int r1 = A01(r0)
            X.1Rs r0 = r4.A03
            X.C36341k9.A16(r0, r1)
            X.3Pc r1 = r4.A07
            X.12U r0 = r1.A05
            int r3 = r0.A00()
            r0 = 21
            if (r3 != r0) goto L_0x0039
            X.66X r0 = r1.A06
            X.5rX r0 = r0.A00
            X.00T r0 = r0.A01
            android.content.SharedPreferences r1 = X.C36411kG.A0E(r0)
            java.lang.String r0 = "wfac_ban_status_token"
            java.lang.String r0 = X.C36371kC.A0t(r1, r0)
            if (r0 == 0) goto L_0x0039
            int r0 = r0.length()
            r2 = 1
            if (r0 != 0) goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WfacManager/canFetchBanStatus canFetchBanStatus "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", reg_state: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r3)
            X.AnonymousClass3TI.A01(r0)
            if (r2 != 0) goto L_0x0056
            java.lang.String r0 = "WfacBanViewModel/updateBanState cannot fetch ban status"
            X.AnonymousClass3TI.A01(r0)
        L_0x0056:
            X.0wU r2 = r4.A06
            r1 = 9
            X.74f r0 = new X.74f
            r0.<init>(r4, r1)
            r2.Boy(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.waffle.wfac.ui.WfacBanViewModel.A0T():void");
    }

    public final void A0U(Activity activity) {
        AnonymousClass3TI.A01("WfacBanViewModel/resetRegistration");
        this.A02.A03(76, "WfacBanActivity");
        this.A05.A03();
        AnonymousClass00T r2 = this.A04.A00.A01;
        C36341k9.A0u(C36351kA.A0A(r2), "wfac_ban_state");
        C36341k9.A0u(C36351kA.A0A(r2), "wfac_ban_status_token");
        C36341k9.A0u(C36351kA.A0A(r2), "wfac_ban_violation_type");
        C36341k9.A0u(C36351kA.A0A(r2), "wfac_ban_violation_reason");
        C36341k9.A0u(C36351kA.A0A(r2), "wfac_ban_violation_source");
        activity.startActivity(AnonymousClass190.A02(activity));
        AnonymousClass0XN.A00(activity);
    }

    public static final int A01(String str) {
        String str2;
        switch (str.hashCode()) {
            case -358171056:
                str2 = "UNKNOWN_IN_CLIENT";
                break;
            case 191367207:
                str2 = "CHECKPOINTED";
                break;
            case 272787191:
                if (str.equals("UNBANNED")) {
                    return 2;
                }
                break;
            case 1951953694:
                if (str.equals("BANNED")) {
                    return 3;
                }
                break;
        }
        if (str.equals(str2)) {
            return 1;
        }
        throw AnonymousClass001.A0E(AnonymousClass000.A0p("Invalid BanState: ", str, AnonymousClass000.A0u()));
    }
}
