package com.whatsapp.profile;

import X.AnonymousClass04R;
import X.AnonymousClass194;
import X.AnonymousClass3QF;
import X.AnonymousClass4SE;
import X.C001700s;
import X.C023509x;
import X.C109325Xd;
import X.C19730wQ;
import X.C19750wS;
import X.C19970wo;
import X.C223613z;
import X.C36321k7;
import X.C36331k8;
import X.C36401kF;
import X.C36431kI;
import X.C48652ho;
import X.C48662hp;
import X.C55692v2;
import X.C55702v3;
import X.C61873Dt;
import com.whatsapp.jid.UserJid;

public final class UsernameViewModel extends AnonymousClass04R implements AnonymousClass4SE, AnonymousClass194 {
    public long A00;
    public String A01;
    public boolean A02;
    public final C001700s A03 = C36431kI.A0S();
    public final C19730wQ A04;
    public final C61873Dt A05;
    public final C19750wS A06;
    public final C19970wo A07;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.whatsapp.profile.UsernameViewModel r8, X.C023509x r9) {
        /*
            boolean r0 = r9 instanceof X.C82623z0
            if (r0 == 0) goto L_0x0046
            r7 = r9
            X.3z0 r7 = (X.C82623z0) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0046
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r1 = r7.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 != r5) goto L_0x004c
            java.lang.Object r8 = r7.L$0
            com.whatsapp.profile.UsernameViewModel r8 = (com.whatsapp.profile.UsernameViewModel) r8
            X.AnonymousClass0AN.A00(r1)
        L_0x0024:
            r0 = 0
            r8.A02 = r0
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x002a:
            X.AnonymousClass0AN.A00(r1)
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r8.A00
            long r3 = r3 - r0
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0024
            long r1 = r1 - r3
            r7.L$0 = r8
            r7.label = r5
            java.lang.Object r0 = X.C07330Xf.A00(r7, r1)
            if (r0 != r6) goto L_0x0024
            return r6
        L_0x0046:
            X.3z0 r7 = new X.3z0
            r7.<init>(r8, r9)
            goto L_0x0012
        L_0x004c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.UsernameViewModel.A01(com.whatsapp.profile.UsernameViewModel, X.09x):java.lang.Object");
    }

    public static final void A02(UsernameViewModel usernameViewModel, Integer num, String str) {
        usernameViewModel.A03.A0C(new AnonymousClass3QF(num, str, usernameViewModel.A01, usernameViewModel.A02));
    }

    public void A0R() {
        this.A06.unregisterObserver(this);
    }

    public void BfC(C55692v2 r7) {
        if (r7 instanceof C48652ho) {
            String str = ((C48652ho) r7).A00;
            if (str.length() > 0) {
                this.A04.A0I(str);
            }
        } else if ((r7 instanceof C48662hp) && ((C48662hp) r7).A00 == 404) {
            this.A04.A0I("");
        } else {
            return;
        }
        C36401kF.A1I(this, (Integer) null);
    }

    public void BkB(UserJid userJid, String str, String str2) {
        if (userJid == C223613z.A00) {
            A02(this, (Integer) null, str2);
        }
    }

    public UsernameViewModel(C19730wQ r2, C19750wS r3, C19970wo r4, C61873Dt r5) {
        C36321k7.A18(r2, r3, r5, r4);
        this.A04 = r2;
        this.A06 = r3;
        this.A05 = r5;
        this.A07 = r4;
        r3.registerObserver(this);
    }

    public void A0S(C55702v3 r4) {
        C36331k8.A1T(new UsernameViewModel$onResult$1(this, r4, (C023509x) null), C109325Xd.A00(this));
    }
}
