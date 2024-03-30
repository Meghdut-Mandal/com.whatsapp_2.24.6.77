package com.whatsapp.dialogs;

import X.AnonymousClass000;
import X.C21060yb;
import X.C36351kA;
import X.C88774Tz;
import android.content.Context;

public class PromptDialogFragment extends Hilt_PromptDialogFragment {
    public C21060yb A00;
    public C88774Tz A01;

    public void A1O(Context context) {
        super.A1O(context);
        try {
            this.A01 = (C88774Tz) context;
        } catch (ClassCastException unused) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C36351kA.A1K(context, A0u);
            throw new ClassCastException(AnonymousClass000.A0q(" must implement PromptDialogClickListener", A0u));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        if (r3.getBoolean("cancelable") != false) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1a(android.os.Bundle r7) {
        /*
            r6 = this;
            android.os.Bundle r3 = r6.A0b()
            java.lang.String r1 = "dialog_id"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x00a6
            int r5 = r3.getInt(r1)
            X.1qm r4 = X.AnonymousClass3LW.A03(r6)
            java.lang.String r1 = "title"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r3.getString(r1)
            r4.setTitle(r0)
        L_0x0023:
            java.lang.String r1 = "message"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0032
            java.lang.CharSequence r0 = r3.getCharSequence(r1)
            r4.A0Z(r0)
        L_0x0032:
            java.lang.String r1 = "neutral_button"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0047
            java.lang.String r2 = r3.getString(r1)
            r1 = 5
            X.4Xw r0 = new X.4Xw
            r0.<init>(r6, r5, r1)
            r4.A0R(r0, r2)
        L_0x0047:
            java.lang.String r1 = "positive_button"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x005c
            java.lang.String r2 = r3.getString(r1)
            r1 = 6
            X.4Xw r0 = new X.4Xw
            r0.<init>(r6, r5, r1)
            r4.A0S(r0, r2)
        L_0x005c:
            java.lang.String r1 = "negative_button"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0071
            java.lang.String r2 = r3.getString(r1)
            r1 = 7
            X.4Xw r0 = new X.4Xw
            r0.<init>(r6, r5, r1)
            r4.A0Q(r0, r2)
        L_0x0071:
            java.lang.String r1 = "cancelable"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0080
            boolean r1 = r3.getBoolean(r1)
            r0 = 0
            if (r1 == 0) goto L_0x0081
        L_0x0080:
            r0 = 1
        L_0x0081:
            r4.A0a(r0)
            r6.A1g(r0)
            X.0FM r2 = r4.create()
            r2.setCanceledOnTouchOutside(r0)
            java.lang.String r1 = "is_message_clickable"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x00a5
            boolean r0 = r3.getBoolean(r1)
            if (r0 == 0) goto L_0x00a5
            r1 = 2
            X.3Ls r0 = new X.3Ls
            r0.<init>(r2, r6, r1)
            r2.setOnShowListener(r0)
        L_0x00a5:
            return r2
        L_0x00a6:
            java.lang.String r0 = "dialog_id should be provided."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dialogs.PromptDialogFragment.A1a(android.os.Bundle):android.app.Dialog");
    }
}
