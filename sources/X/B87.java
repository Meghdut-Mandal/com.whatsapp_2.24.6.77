package X;

import android.content.DialogInterface;

public class B87 implements DialogInterface.OnCancelListener {
    public Object A00;
    public final int A01;

    public B87(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(C39001qm r1, Object obj, int i) {
        r1.A0e(new B87(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r0.open();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        X.AnonymousClass3SJ.A00(r1, r0);
        com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity.A11(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        X.AnonymousClass3SJ.A00(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCancel(android.content.DialogInterface r4) {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x001f;
                case 1: goto L_0x002b;
                case 2: goto L_0x000b;
                case 3: goto L_0x003a;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0015;
                case 7: goto L_0x0042;
                case 8: goto L_0x004a;
                case 9: goto L_0x0051;
                case 10: goto L_0x0058;
                case 11: goto L_0x005f;
                case 12: goto L_0x006c;
                case 13: goto L_0x0073;
                case 14: goto L_0x007a;
                case 15: goto L_0x0081;
                case 16: goto L_0x0088;
                case 17: goto L_0x008f;
                case 18: goto L_0x0096;
                case 19: goto L_0x00a0;
                case 20: goto L_0x00a8;
                case 21: goto L_0x00bb;
                case 22: goto L_0x00c2;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A00
            X.C36411kG.A1N(r0)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r0 = r3.A00
            X.AyW r0 = (X.C22920AyW) r0
            if (r0 == 0) goto L_0x000a
            r0.BVd()
            return
        L_0x0015:
            java.lang.Object r0 = r3.A00
            X.B1D r0 = (X.B1D) r0
            if (r0 == 0) goto L_0x000a
            r0.Bfi()
            return
        L_0x001f:
            java.lang.Object r1 = r3.A00
            X.4y9 r1 = (X.C101704y9) r1
            java.lang.String r0 = "settings-gdrive/gps-unavailable-and-user-declined-install"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.ConditionVariable r0 = r1.A0P
            goto L_0x0036
        L_0x002b:
            java.lang.Object r1 = r3.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r1 = (com.whatsapp.backup.google.SettingsGoogleDrive) r1
            java.lang.String r0 = "settings-gdrive/gps-unavailable-and-user-declined-install"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.ConditionVariable r0 = r1.A0w
        L_0x0036:
            r0.open()
            return
        L_0x003a:
            java.lang.Object r0 = r3.A00
            X.A8W r0 = (X.A8W) r0
            android.app.Activity r0 = r0.A02
            r1 = 1
            goto L_0x009c
        L_0x0042:
            java.lang.Object r0 = r3.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r0 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r0
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity.A11(r0)
            return
        L_0x004a:
            java.lang.Object r1 = r3.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r1
            r0 = 19
            goto L_0x0065
        L_0x0051:
            java.lang.Object r1 = r3.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r1
            r0 = 11
            goto L_0x0065
        L_0x0058:
            java.lang.Object r1 = r3.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r1
            r0 = 12
            goto L_0x0065
        L_0x005f:
            java.lang.Object r1 = r3.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r1
            r0 = 10
        L_0x0065:
            X.AnonymousClass3SJ.A00(r1, r0)
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity.A11(r1)
            return
        L_0x006c:
            java.lang.Object r0 = r3.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 100
            goto L_0x009c
        L_0x0073:
            java.lang.Object r0 = r3.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 11
            goto L_0x009c
        L_0x007a:
            java.lang.Object r0 = r3.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 12
            goto L_0x009c
        L_0x0081:
            java.lang.Object r0 = r3.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 13
            goto L_0x009c
        L_0x0088:
            java.lang.Object r0 = r3.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 15
            goto L_0x009c
        L_0x008f:
            java.lang.Object r0 = r3.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 10
            goto L_0x009c
        L_0x0096:
            java.lang.Object r0 = r3.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 19
        L_0x009c:
            X.AnonymousClass3SJ.A00(r0, r1)
            return
        L_0x00a0:
            java.lang.Object r0 = r3.A00
            android.app.Activity r0 = (android.app.Activity) r0
            X.C36351kA.A11(r0)
            return
        L_0x00a8:
            java.lang.Object r2 = r3.A00
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 0
            android.content.Intent r0 = r2.getIntent()
            r2.setResult(r1, r0)
            r2.finish()
            r2.overridePendingTransition(r1, r1)
            return
        L_0x00bb:
            java.lang.Object r1 = r3.A00
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            return
        L_0x00c2:
            java.lang.Object r1 = r3.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B87.onCancel(android.content.DialogInterface):void");
    }
}
