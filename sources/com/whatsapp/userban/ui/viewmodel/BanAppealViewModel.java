package com.whatsapp.userban.ui.viewmodel;

import X.AnonymousClass01L;
import X.AnonymousClass04R;
import X.AnonymousClass07B;
import X.AnonymousClass1N3;
import X.AnonymousClass1WF;
import X.AnonymousClass2V3;
import X.AnonymousClass3DY;
import X.AnonymousClass3KW;
import X.AnonymousClass3SV;
import X.AnonymousClass737;
import X.C001700s;
import X.C18740tg;
import X.C18800tq;
import X.C18840tu;
import X.C19420v0;
import X.C20380xT;
import X.C20810yC;
import X.C25271Fq;
import X.C28201Rs;
import X.C29501Ww;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C55682v1;
import X.C65563So;
import android.app.Activity;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class BanAppealViewModel extends AnonymousClass04R {
    public int A00;
    public final C001700s A01 = C36431kI.A0S();
    public final C001700s A02 = C36431kI.A0S();
    public final AnonymousClass3DY A03;
    public final AnonymousClass1N3 A04;
    public final C25271Fq A05;
    public final C20380xT A06;
    public final AnonymousClass3KW A07;
    public final C65563So A08;
    public final C28201Rs A09 = C36441kJ.A0t();
    public final C28201Rs A0A = C36441kJ.A0t();
    public final C29501Ww A0B;

    public void A0S() {
        Log.i("BanAppealViewModel/fetchBanAppealStatus");
        C65563So r4 = this.A08;
        C19420v0 r2 = r4.A06;
        C36341k9.A16(this.A0A, A01(this, C55682v1.A00(C36371kC.A0t(C36341k9.A0E(r2), "support_ban_appeal_state")), false));
        if (!this.A07.A01()) {
            Log.i("BanAppealViewModel/fetchBanAppealStatus returning since phone number not verified yet");
            return;
        }
        Log.i("BanAppealViewModel/fetchBanAppealStatus trying to fetch ban appeal status");
        AnonymousClass3SV r3 = new AnonymousClass3SV(this, 0);
        String A0t = C36371kC.A0t(C36341k9.A0E(r2), "support_ban_appeal_token");
        if (A0t == null) {
            r3.BXN(C36371kC.A0n());
            return;
        }
        C18800tq r1 = r4.A03.A00.A00;
        C20810yC A0V = C36341k9.A0V(r1);
        r4.A0A.Boy(new AnonymousClass737(r4, new AnonymousClass2V3(C36381kD.A0U(r1), C36351kA.A0Y(r1), A0V, (AnonymousClass1WF) r1.A3W.get(), C18840tu.A00(r1.A96), A0t, r1.A3T, r1.A0d), r3, 16));
    }

    public void A0T() {
        if (this.A00 != 2 || !C36371kC.A1U(C36341k9.A0E(this.A08.A06), "support_ban_appeal_user_banned_from_chat_disconnect")) {
            C36341k9.A18(this.A09, true);
        } else {
            C36341k9.A16(this.A0A, 1);
        }
    }

    public void A0U(Activity activity, boolean z) {
        this.A05.A03(42, "BanAppealActivity");
        this.A0B.A03();
        C19420v0 r2 = this.A08.A06;
        C36341k9.A0u(C19420v0.A00(r2), "support_ban_appeal_state");
        C36341k9.A0u(C19420v0.A00(r2), "support_ban_appeal_token");
        C36341k9.A0u(C19420v0.A00(r2), "support_ban_appeal_violation_type");
        C36341k9.A0u(C19420v0.A00(r2), "support_ban_appeal_unban_reason");
        C36341k9.A0u(C19420v0.A00(r2), "support_ban_appeal_unban_reason_url");
        if (!z) {
            C36341k9.A0u(C19420v0.A00(r2), "support_ban_appeal_user_banned_from_chat_disconnect");
        }
        Log.i("BanAppealRepository/clearFormReviewDraft");
        C36341k9.A0u(C19420v0.A00(r2), "support_ban_appeal_form_review_draft");
        C36361kB.A0t(activity);
    }

    public BanAppealViewModel(AnonymousClass3DY r2, AnonymousClass1N3 r3, C25271Fq r4, C29501Ww r5, C20380xT r6, AnonymousClass3KW r7, C65563So r8) {
        this.A07 = r7;
        this.A03 = r2;
        this.A04 = r3;
        this.A06 = r6;
        this.A08 = r8;
        this.A0B = r5;
        this.A05 = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(com.whatsapp.userban.ui.viewmodel.BanAppealViewModel r2, java.lang.String r3, boolean r4) {
        /*
            int r0 = r3.hashCode()
            r1 = 4
            switch(r0) {
                case -358171056: goto L_0x0018;
                case 272787191: goto L_0x001b;
                case 527514546: goto L_0x0024;
                case 1166090011: goto L_0x0030;
                case 1951953694: goto L_0x0050;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid BanAppealState: "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r3, r1)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0018:
            java.lang.String r0 = "UNKNOWN_IN_CLIENT"
            goto L_0x0032
        L_0x001b:
            java.lang.String r0 = "UNBANNED"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x004f
            goto L_0x0008
        L_0x0024:
            java.lang.String r0 = "IN_REVIEW"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0008
            r1 = 3
            if (r4 != 0) goto L_0x004f
            goto L_0x004e
        L_0x0030:
            java.lang.String r0 = "NO_APPEAL_OPENED"
        L_0x0032:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0008
            int r1 = r2.A00
            r0 = 2
            if (r1 != r0) goto L_0x004e
            X.3So r0 = r2.A08
            X.0v0 r0 = r0.A06
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)
            java.lang.String r0 = "support_ban_appeal_user_banned_from_chat_disconnect"
            boolean r0 = X.C36371kC.A1U(r1, r0)
            r1 = 2
            if (r0 != 0) goto L_0x004f
        L_0x004e:
            r1 = 1
        L_0x004f:
            return r1
        L_0x0050:
            java.lang.String r0 = "BANNED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0008
            r1 = 5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.userban.ui.viewmodel.BanAppealViewModel.A01(com.whatsapp.userban.ui.viewmodel.BanAppealViewModel, java.lang.String, boolean):int");
    }

    public static void A02(Activity activity, boolean z) {
        C18740tg.A06(activity);
        AnonymousClass07B supportActionBar = ((AnonymousClass01L) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(z);
            int i = R.string.f12nameremoved;
            if (z) {
                i = R.string.f12nameremoved;
            }
            supportActionBar.A0I(i);
        }
    }
}
