package com.whatsapp.permissions;

import X.C19970wo;
import X.C21010yW;
import X.C36331k8;
import X.C44412Nk;
import android.content.DialogInterface;

public final class NotificationPermissionBottomSheet extends Hilt_NotificationPermissionBottomSheet {
    public C19970wo A00;
    public C21010yW A01;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0040, code lost:
        if (r1 != false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(android.os.Bundle r6, android.view.View r7) {
        /*
            r5 = this;
            r4 = 0
            X.AnonymousClass00C.A0D(r7, r4)
            super.A1S(r6, r7)
            r0 = 2131432659(0x7f0b14d3, float:1.8487082E38)
            android.widget.TextView r2 = X.C36391kE.A0P(r7, r0)
            android.content.Context r1 = r7.getContext()
            r0 = 2131102153(0x7f0609c9, float:1.7816736E38)
            X.C36331k8.A0r(r1, r2, r0)
            android.content.res.Resources r1 = X.C36341k9.A0F(r7)
            r0 = 2131168580(0x7f070d44, float:1.7951466E38)
            float r0 = r1.getDimension(r0)
            r2.setTextSize(r4, r0)
            r0 = 2131434448(0x7f0b1bd0, float:1.849071E38)
            android.widget.TextView r2 = X.C36341k9.A0M(r7, r0)
            X.0v0 r1 = r5.A04
            if (r1 == 0) goto L_0x009c
            boolean r0 = X.C19550w8.A09()
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            boolean r1 = r1.A2U(r0)
            r0 = 2131889106(0x7f120bd2, float:1.9412866E38)
            if (r1 == 0) goto L_0x0045
        L_0x0042:
            r0 = 2131892840(0x7f121a68, float:1.942044E38)
        L_0x0045:
            r2.setText(r0)
            r0 = 3
            X.AnonymousClass3Y5.A00(r2, r5, r0)
            r0 = 2131428555(0x7f0b04cb, float:1.8478758E38)
            android.view.View r1 = X.C36361kB.A0G(r7, r0)
            r0 = 4
            X.AnonymousClass3Y5.A00(r1, r5, r0)
            X.0v0 r1 = r5.A04
            if (r1 == 0) goto L_0x0095
            X.0wo r0 = r5.A00
            if (r0 == 0) goto L_0x008e
            long r2 = X.C19970wo.A00(r0)
            android.content.SharedPreferences$Editor r1 = X.C36331k8.A05(r1)
            java.lang.String r0 = "notification_nag_last_shown_time_key"
            X.C36341k9.A0w(r1, r0, r2)
            X.0v0 r3 = r5.A04
            if (r3 == 0) goto L_0x0087
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r3)
            java.lang.String r2 = "notification_nag_count_key"
            int r0 = r0.getInt(r2, r4)
            int r1 = r0 + 1
            android.content.SharedPreferences$Editor r0 = X.C36331k8.A05(r3)
            X.C36341k9.A0v(r0, r2, r1)
            A03(r5, r4)
            return
        L_0x0087:
            java.lang.String r0 = "waSharedPreferences"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x008e:
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0095:
            java.lang.String r0 = "waSharedPreferences"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x009c:
            java.lang.String r0 = "waSharedPreferences"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.permissions.NotificationPermissionBottomSheet.A1S(android.os.Bundle, android.view.View):void");
    }

    public void onCancel(DialogInterface dialogInterface) {
        A03(this, 1);
        A1c();
    }

    public static final void A03(NotificationPermissionBottomSheet notificationPermissionBottomSheet, int i) {
        C44412Nk r1 = new C44412Nk();
        r1.A00 = Integer.valueOf(i);
        C21010yW r0 = notificationPermissionBottomSheet.A01;
        if (r0 != null) {
            r0.Bly(r1);
            return;
        }
        throw C36331k8.A0d("wamRuntime");
    }
}
