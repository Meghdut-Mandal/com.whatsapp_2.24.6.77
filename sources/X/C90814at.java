package X;

import android.content.BroadcastReceiver;

/* renamed from: X.4at  reason: invalid class name and case insensitive filesystem */
public abstract class C90814at extends BroadcastReceiver {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003d, code lost:
        if (X.C132916Vu.A03(r12, r0.getCreatorPackage()) == false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r12, android.content.Intent r13) {
        /*
            r11 = this;
            r2 = r11
            com.whatsapp.phoneid.PhoneIdRequestReceiver r2 = (com.whatsapp.phoneid.PhoneIdRequestReceiver) r2
            X.1Vf r0 = r2.A01
            X.61Z r7 = r0.BFs()
            X.6lI r0 = r2.A02
            X.61Z r6 = r0.BFs()
            java.lang.String r1 = r13.getAction()
            java.lang.String r0 = "com.facebook.GET_PHONE_ID"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r8 = 1
            android.os.Bundle r3 = r11.getResultExtras(r8)
            java.lang.Class<android.app.PendingIntent> r1 = android.app.PendingIntent.class
            java.lang.String r0 = "auth"
            java.lang.Object r0 = X.C05420Pq.A00(r3, r1, r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            java.lang.String r1 = r12.getPackageName()
            boolean r10 = X.AnonymousClass6ID.A01(r12)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r0.getCreatorPackage()
            boolean r0 = X.C132916Vu.A03(r12, r0)
            r9 = 1
            if (r0 != 0) goto L_0x0040
        L_0x003f:
            r9 = 0
        L_0x0040:
            android.content.pm.PackageManager r0 = r12.getPackageManager()
            android.content.pm.Signature r0 = X.C132916Vu.A00(r0, r1)
            java.lang.String r1 = X.C132916Vu.A02(r0)
            java.util.Set r0 = X.AnonymousClass6ID.A00()
            boolean r5 = r0.contains(r1)
            X.0yC r2 = r2.A00
            if (r2 == 0) goto L_0x0088
            X.0yV r1 = X.C21000yV.A01
            r0 = 3651(0xe43, float:5.116E-42)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x0088
        L_0x0062:
            r4 = -1
            java.lang.String r3 = "timestamp"
            if (r9 != 0) goto L_0x007c
            if (r10 == 0) goto L_0x007c
            if (r8 == 0) goto L_0x007b
            if (r5 != 0) goto L_0x007b
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            long r0 = r6.A00
            r2.putLong(r3, r0)
            java.lang.String r0 = r6.A01
        L_0x0078:
            r11.setResult(r4, r0, r2)
        L_0x007b:
            return
        L_0x007c:
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            long r0 = r7.A00
            r2.putLong(r3, r0)
            java.lang.String r0 = r7.A01
            goto L_0x0078
        L_0x0088:
            r8 = 0
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90814at.onReceive(android.content.Context, android.content.Intent):void");
    }
}
