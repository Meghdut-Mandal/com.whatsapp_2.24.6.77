package com.whatsapp.userban.ui.fragment;

import X.C21060yb;
import X.C32681e1;
import X.C36361kB;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;

public class BanAppealUnbannedDecisionFragment extends Hilt_BanAppealUnbannedDecisionFragment {
    public C21060yb A00;
    public BanAppealViewModel A01;
    public C32681e1 A02;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.A1G(bundle, layoutInflater, viewGroup);
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(android.os.Bundle r14, android.view.View r15) {
        /*
            r13 = this;
            super.A1S(r14, r15)
            com.whatsapp.userban.ui.viewmodel.BanAppealViewModel r0 = X.C36351kA.A0o(r13)
            r13.A01 = r0
            X.01I r0 = r13.A0i()
            r4 = 0
            com.whatsapp.userban.ui.viewmodel.BanAppealViewModel.A02(r0, r4)
            r0 = 2131427910(0x7f0b0246, float:1.847745E38)
            android.widget.ImageView r2 = X.C36401kF.A0G(r15, r0)
            android.content.res.Resources r1 = X.C36341k9.A0G(r13)
            r0 = 2131232971(0x7f0808cb, float:1.8082066E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.setImageDrawable(r0)
            r0 = 2131430737(0x7f0b0d51, float:1.8483183E38)
            android.widget.TextView r1 = X.C36391kE.A0O(r15, r0)
            r0 = 2131895161(0x7f122379, float:1.9425147E38)
            r1.setText(r0)
            r0 = 2131434429(0x7f0b1bbd, float:1.8490672E38)
            com.whatsapp.TextEmojiLabel r3 = X.C36401kF.A0O(r15, r0)
            r0 = 2131434430(0x7f0b1bbe, float:1.8490674E38)
            android.widget.TextView r2 = X.C36391kE.A0O(r15, r0)
            com.whatsapp.userban.ui.viewmodel.BanAppealViewModel r5 = r13.A01
            X.3So r0 = r5.A08
            X.0v0 r0 = r0.A06
            X.005 r8 = r0.A00
            android.content.SharedPreferences r1 = X.C36391kE.A0H(r8)
            java.lang.String r0 = "support_ban_appeal_unban_reason"
            java.lang.String r6 = X.C36371kC.A0t(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BanAppealRepository/getUnbanReason "
            X.C36321k7.A1Q(r0, r6, r1)
            java.lang.String r7 = "OOPS"
            boolean r0 = r7.equals(r6)
            if (r0 == 0) goto L_0x007c
            r6 = r7
        L_0x0065:
            android.content.SharedPreferences r1 = X.C36391kE.A0H(r8)
            java.lang.String r0 = "support_ban_appeal_unban_reason_url"
            r8 = 0
            java.lang.String r9 = r1.getString(r0, r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BanAppealRepository/getUnbanReasonUrl "
            X.C36321k7.A1Q(r0, r9, r1)
            if (r9 == 0) goto L_0x0093
            goto L_0x007f
        L_0x007c:
            java.lang.String r6 = "OTHER"
            goto L_0x0065
        L_0x007f:
            X.1N3 r0 = r5.A04     // Catch:{ Exception -> 0x008a }
            android.net.Uri r0 = r0.A00(r9)     // Catch:{ Exception -> 0x008a }
            android.util.Pair r1 = X.C36441kJ.A0Q(r6, r0)     // Catch:{ Exception -> 0x008a }
            goto L_0x00a5
        L_0x008a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BanAppealViewModel/getUnbanReasonData Exception when creating uri from unban reason url: "
            X.C36321k7.A1P(r0, r9, r1)
        L_0x0093:
            boolean r0 = r7.equals(r6)
            X.0xT r5 = r5.A06
            if (r0 == 0) goto L_0x0113
            java.lang.String r0 = "android"
            android.net.Uri r0 = X.C20380xT.A00(r8, r5, r0, r8, r8)
        L_0x00a1:
            android.util.Pair r1 = X.C36441kJ.A0Q(r6, r0)
        L_0x00a5:
            java.lang.Object r0 = r1.first
            java.lang.Object r6 = r1.second
            boolean r0 = r7.equals(r0)
            r5 = 8
            if (r0 == 0) goto L_0x00dc
            r0 = 2131895162(0x7f12237a, float:1.942515E38)
            r3.setText(r0)
            r2.setVisibility(r4)
            r0 = 2131895164(0x7f12237c, float:1.9425153E38)
            r2.setText(r0)
        L_0x00c0:
            r0 = 2131427481(0x7f0b0099, float:1.847658E38)
            X.C36351kA.A1A(r15, r0, r5)
            r0 = 2131427482(0x7f0b009a, float:1.8476581E38)
            android.widget.TextView r1 = X.C36391kE.A0O(r15, r0)
            r1.setVisibility(r4)
            r0 = 2131895165(0x7f12237d, float:1.9425155E38)
            r1.setText(r0)
            r0 = 42
            X.AnonymousClass3Y9.A00(r1, r13, r0)
            return
        L_0x00dc:
            X.1e1 r7 = r13.A02
            android.content.Context r8 = r3.getContext()
            r0 = 2131895163(0x7f12237b, float:1.9425151E38)
            java.lang.String r9 = r13.A0n(r0)
            java.lang.String r0 = "using-whatsapp-responsibly-link"
            java.lang.String[] r11 = new java.lang.String[]{r0}
            r1 = 1
            java.lang.String[] r12 = new java.lang.String[r1]
            java.lang.String r0 = r6.toString()
            r12[r4] = r0
            java.lang.Runnable[] r10 = new java.lang.Runnable[r1]
            X.3wR r0 = X.C81083wR.A00
            r10[r4] = r0
            android.text.SpannableString r1 = r7.A01(r8, r9, r10, r11, r12)
            X.0yb r0 = r13.A00
            X.C36331k8.A16(r3, r0)
            X.0yC r0 = r13.A05
            X.C36331k8.A1A(r0, r3)
            r3.setText(r1)
            r2.setVisibility(r5)
            goto L_0x00c0
        L_0x0113:
            java.lang.String r1 = "security-and-privacy"
            java.lang.String r0 = "how-to-use-whatsapp-responsibly"
            android.net.Uri r0 = r5.A04(r1, r0)
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.userban.ui.fragment.BanAppealUnbannedDecisionFragment.A1S(android.os.Bundle, android.view.View):void");
    }
}
