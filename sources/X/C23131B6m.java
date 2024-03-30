package X;

import android.content.BroadcastReceiver;

/* renamed from: X.B6m  reason: case insensitive filesystem */
public class C23131B6m extends BroadcastReceiver {
    public Object A00;
    public final int A01;

    public C23131B6m(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011a, code lost:
        if (r4.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011c, code lost:
        r0 = false;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012b, code lost:
        if (r4.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012d, code lost:
        r0 = true;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x014b;
                case 1: goto L_0x0143;
                case 2: goto L_0x013b;
                case 3: goto L_0x002b;
                case 4: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r7.A00
            X.8it r1 = (X.C179008it) r1
            X.8az r0 = r1.A00
            if (r0 == 0) goto L_0x0133
            r1.A4K()
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r2 = r7.A00
            X.83W r2 = (X.AnonymousClass83W) r2
            android.net.ConnectivityManager r0 = r2.A03
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L_0x0010
            int r1 = r0.getType()
            int r0 = r2.A01
            if (r1 == r0) goto L_0x0010
            r2.A04()
            r2.A01 = r1
            return
        L_0x002b:
            r0 = 1
            X.AnonymousClass00C.A0D(r9, r0)
            java.lang.Object r6 = r7.A00
            X.80l r6 = (X.C1683980l) r6
            boolean r0 = r6 instanceof X.C1683780j
            if (r0 == 0) goto L_0x007b
            r4 = 0
            java.lang.String r0 = r9.getAction()
            if (r0 == 0) goto L_0x0010
            X.6VD r3 = X.AnonymousClass6VD.A00()
            java.lang.String r2 = X.AnonymousClass98M.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Received "
            r1.append(r0)
            java.lang.String r0 = r9.getAction()
            X.AnonymousClass6VD.A03(r3, r0, r2, r1)
            java.lang.String r2 = r9.getAction()
            if (r2 == 0) goto L_0x0010
            int r1 = r2.hashCode()
            r0 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r1 == r0) goto L_0x0078
            r0 = -730838620(0xffffffffd47049a4, float:-4.12811054E12)
            if (r1 != r0) goto L_0x0010
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            java.lang.Boolean r0 = X.C36371kC.A0m()
        L_0x0074:
            r6.A04(r0)
            return
        L_0x0078:
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_LOW"
            goto L_0x00d6
        L_0x007b:
            boolean r0 = r6 instanceof X.C1683880k
            if (r0 == 0) goto L_0x009f
            X.80k r6 = (X.C1683880k) r6
            java.lang.String r1 = r9.getAction()
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0010
            X.6VD r2 = X.AnonymousClass6VD.A00()
            java.lang.String r1 = X.C202789mf.A00
            java.lang.String r0 = "Network broadcast received"
            r2.A04(r1, r0)
            android.net.ConnectivityManager r0 = r6.A00
            X.9WR r0 = X.C202789mf.A01(r0)
            goto L_0x0074
        L_0x009f:
            boolean r0 = r6 instanceof X.C1683680i
            if (r0 == 0) goto L_0x00ee
            r4 = 0
            java.lang.String r0 = r9.getAction()
            if (r0 == 0) goto L_0x0010
            X.6VD r3 = X.AnonymousClass6VD.A00()
            java.lang.String r2 = X.AnonymousClass98J.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Received "
            r1.append(r0)
            java.lang.String r0 = r9.getAction()
            X.AnonymousClass6VD.A03(r3, r0, r2, r1)
            java.lang.String r2 = r9.getAction()
            if (r2 == 0) goto L_0x0010
            int r1 = r2.hashCode()
            r0 = -1980154005(0xffffffff89f93f6b, float:-6.0004207E-33)
            if (r1 == r0) goto L_0x00e1
            r0 = 490310653(0x1d398bfd, float:2.4556918E-21)
            if (r1 != r0) goto L_0x0010
            java.lang.String r0 = "android.intent.action.BATTERY_LOW"
        L_0x00d6:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            goto L_0x0074
        L_0x00e1:
            java.lang.String r0 = "android.intent.action.BATTERY_OKAY"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            java.lang.Boolean r0 = X.C36371kC.A0m()
            goto L_0x0074
        L_0x00ee:
            r5 = 0
            java.lang.String r4 = r9.getAction()
            if (r4 == 0) goto L_0x0010
            X.6VD r3 = X.AnonymousClass6VD.A00()
            java.lang.String r2 = X.AnonymousClass98I.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Received "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r4, r1)
            r3.A04(r2, r0)
            int r0 = r4.hashCode()
            r1 = 1
            switch(r0) {
                case -1886648615: goto L_0x0111;
                case -54942926: goto L_0x0114;
                case 948344062: goto L_0x0122;
                case 1019184907: goto L_0x0125;
                default: goto L_0x0110;
            }
        L_0x0110:
            return
        L_0x0111:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            goto L_0x0116
        L_0x0114:
            java.lang.String r0 = "android.os.action.DISCHARGING"
        L_0x0116:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0010
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            goto L_0x0074
        L_0x0122:
            java.lang.String r0 = "android.os.action.CHARGING"
            goto L_0x0127
        L_0x0125:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
        L_0x0127:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0010
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L_0x0074
        L_0x0133:
            X.1Dc r1 = r1.A03
            java.lang.String r0 = "onLibraryResult got resend otp but bankaccount is null"
            r1.A06(r0)
            return
        L_0x013b:
            java.lang.Object r0 = r7.A00
            androidx.test.core.app.InstrumentationActivityInvoker$EmptyFloatingActivity r0 = (androidx.test.core.app.InstrumentationActivityInvoker$EmptyFloatingActivity) r0
            r0.finish()
            return
        L_0x0143:
            java.lang.Object r0 = r7.A00
            androidx.test.core.app.InstrumentationActivityInvoker$EmptyActivity r0 = (androidx.test.core.app.InstrumentationActivityInvoker$EmptyActivity) r0
            r0.finish()
            return
        L_0x014b:
            java.lang.Object r1 = r7.A00
            androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity r1 = (androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity) r1
            r0 = 0
            r1.finishActivity(r0)
            r1.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23131B6m.onReceive(android.content.Context, android.content.Intent):void");
    }
}
