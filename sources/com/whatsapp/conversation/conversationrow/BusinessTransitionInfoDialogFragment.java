package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass16D;
import X.AnonymousClass17X;
import X.AnonymousClass190;
import X.AnonymousClass1H2;
import X.AnonymousClass2QH;
import X.C20380xT;
import X.C21010yW;
import X.C24801Dv;
import android.content.DialogInterface;

public class BusinessTransitionInfoDialogFragment extends Hilt_BusinessTransitionInfoDialogFragment {
    public C24801Dv A00;
    public AnonymousClass16D A01;
    public AnonymousClass17X A02;
    public AnonymousClass1H2 A03;
    public C21010yW A04;
    public AnonymousClass2QH A05;
    public AnonymousClass190 A06;
    public C20380xT A07;

    public void onCancel(DialogInterface dialogInterface) {
        AnonymousClass2QH r1 = this.A05;
        if (r1 != null) {
            r1.A01 = 0;
            this.A04.Bly(r1);
        }
        super.onCancel(dialogInterface);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r4 == 5) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r4 == 4) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1a(android.os.Bundle r10) {
        /*
            r9 = this;
            android.os.Bundle r3 = r9.A0b()
            java.lang.String r0 = "jid"
            X.11F r2 = X.C36351kA.A0i(r3, r0)
            java.lang.String r0 = "message"
            java.lang.String r7 = r3.getString(r0)
            java.lang.String r0 = "transitionId"
            int r4 = r3.getInt(r0)
            java.lang.String r1 = "systemAction"
            r0 = -1
            int r1 = r3.getInt(r1, r0)
            r0 = 69
            if (r1 != r0) goto L_0x0057
            if (r2 == 0) goto L_0x0057
            X.2QH r3 = new X.2QH
            r3.<init>()
            r9.A05 = r3
            boolean r0 = r2 instanceof X.AnonymousClass144
            if (r0 == 0) goto L_0x00e5
            boolean r0 = X.AnonymousClass143.A0G(r2)
            if (r0 == 0) goto L_0x00e5
            X.17X r0 = r9.A02
            X.AnonymousClass2QH.A00(r0, r3, r2)
            r0 = 2
        L_0x003a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A00 = r0
        L_0x0040:
            X.2QH r3 = r9.A05
            r0 = 2
            if (r4 == r0) goto L_0x0050
            r0 = 3
            r1 = 1
            if (r4 == r0) goto L_0x0051
            r0 = 4
            if (r4 == r0) goto L_0x0050
            r0 = 5
            r1 = 0
            if (r4 != r0) goto L_0x0051
        L_0x0050:
            r1 = 2
        L_0x0051:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A03 = r0
        L_0x0057:
            X.1qm r3 = X.AnonymousClass3LW.A04(r9)
            r0 = 5
            if (r4 == r0) goto L_0x0062
            r1 = 4
            r0 = 0
            if (r4 != r1) goto L_0x0063
        L_0x0062:
            r0 = 1
        L_0x0063:
            r5 = 1
            if (r0 == 0) goto L_0x00d7
            android.content.Context r0 = r9.A0a()
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r0)
            com.whatsapp.jid.UserJid r8 = X.C36401kF.A0b(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x00d5
            if (r8 == 0) goto L_0x00d5
            java.util.HashMap r2 = X.AnonymousClass001.A0J()
            r0 = 0
            X.4VV r1 = new X.4VV
            r1.<init>(r9, r8, r0)
            java.lang.String r0 = "coex-verify-encryption"
            r2.put(r0, r1)
            android.text.SpannableStringBuilder r2 = X.AnonymousClass6YV.A03(r7, r2)
        L_0x008e:
            android.content.Context r1 = r9.A0a()
            X.1H2 r0 = r9.A03
            java.lang.CharSequence r0 = X.AnonymousClass3UG.A05(r1, r0, r2)
            r6.setText(r0)
            X.C36391kE.A1J(r6)
            r1 = 1103101952(0x41c00000, float:24.0)
            android.content.res.Resources r0 = X.C36341k9.A0G(r9)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = android.util.TypedValue.applyDimension(r5, r1, r0)
            int r0 = (int) r0
            r6.setPadding(r0, r0, r0, r0)
            r0 = 5
            r6.setTextAlignment(r0)
            r3.setView(r6)
        L_0x00b7:
            r3.A0a(r5)
            r0 = 2
            X.4Xw r1 = new X.4Xw
            r1.<init>(r9, r4, r0)
            r0 = 2131896681(0x7f122969, float:1.942823E38)
            r3.A0g(r1, r0)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 31
            X.4XM r0 = new X.4XM
            r0.<init>(r9, r1)
            X.0FM r0 = X.C36431kI.A0R(r0, r3, r2)
            return r0
        L_0x00d5:
            r2 = 0
            goto L_0x008e
        L_0x00d7:
            android.content.Context r1 = r9.A0a()
            X.1H2 r0 = r9.A03
            java.lang.CharSequence r0 = X.AnonymousClass3UG.A05(r1, r0, r7)
            r3.A0Z(r0)
            goto L_0x00b7
        L_0x00e5:
            boolean r0 = r2 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0040
            X.16D r1 = r9.A01
            r0 = r2
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r1.A0q(r0)
            boolean r0 = X.C36431kI.A1Q(r0)
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment.A1a(android.os.Bundle):android.app.Dialog");
    }
}
