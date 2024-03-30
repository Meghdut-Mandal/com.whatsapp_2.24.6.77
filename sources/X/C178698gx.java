package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.8gx  reason: invalid class name and case insensitive filesystem */
public final class C178698gx extends AnonymousClass6F2 implements C162097o1 {
    public C159627jf A00;
    public final C20830yE A01;
    public final C19630wG A02;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058 A[Catch:{ IllegalArgumentException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e A[Catch:{ IllegalArgumentException -> 0x008a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C128786Dp r9, X.C159627jf r10, X.AnonymousClass6PH r11, java.util.Map r12) {
        /*
            r8 = this;
            r0 = 0
            X.C36321k7.A16(r12, r9, r10, r0)
            r8.A00 = r10
            java.lang.String r0 = "permission"
            java.lang.Object r4 = r12.get(r0)
            boolean r0 = r4 instanceof java.lang.String
            r3 = 0
            if (r0 == 0) goto L_0x0022
            java.lang.String r4 = (java.lang.String) r4
        L_0x0013:
            java.lang.String r2 = "no_valid_permission"
            if (r4 != 0) goto L_0x0024
            java.lang.String r1 = "permission is null"
            X.6PH r0 = new X.6PH
            r0.<init>(r3, r2, r1)
            r10.BXS(r0, r3)
            return
        L_0x0022:
            r4 = r3
            goto L_0x0013
        L_0x0024:
            X.8yU r0 = X.C187758yU.valueOf(r4)     // Catch:{ IllegalArgumentException -> 0x008a }
            int r1 = r0.ordinal()     // Catch:{ IllegalArgumentException -> 0x008a }
            r0 = 0
            if (r1 == r0) goto L_0x0046
            r0 = 1
            if (r1 != r0) goto L_0x0041
            X.0yE r1 = r8.A01     // Catch:{ IllegalArgumentException -> 0x008a }
            java.lang.String r0 = "android.permission.SEND_SMS"
            int r0 = r1.A02(r0)     // Catch:{ IllegalArgumentException -> 0x008a }
            if (r0 != 0) goto L_0x004f
            boolean r0 = r1.A0F()     // Catch:{ IllegalArgumentException -> 0x008a }
            goto L_0x004c
        L_0x0041:
            X.0jS r0 = X.C36441kJ.A18()     // Catch:{ IllegalArgumentException -> 0x008a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x008a }
        L_0x0046:
            X.0yE r0 = r8.A01     // Catch:{ IllegalArgumentException -> 0x008a }
            boolean r0 = r0.A0F()     // Catch:{ IllegalArgumentException -> 0x008a }
        L_0x004c:
            if (r0 == 0) goto L_0x004f
            goto L_0x0052
        L_0x004f:
            X.8yg r1 = X.C187878yg.NOT_GRANTED     // Catch:{ IllegalArgumentException -> 0x008a }
            goto L_0x0054
        L_0x0052:
            X.8yg r1 = X.C187878yg.GRANTED     // Catch:{ IllegalArgumentException -> 0x008a }
        L_0x0054:
            X.8yg r0 = X.C187878yg.NOT_GRANTED     // Catch:{ IllegalArgumentException -> 0x008a }
            if (r1 != r0) goto L_0x007e
            X.0wG r0 = r8.A02     // Catch:{ IllegalArgumentException -> 0x008a }
            android.content.Context r7 = r0.A00     // Catch:{ IllegalArgumentException -> 0x008a }
            java.lang.String r6 = r9.A04     // Catch:{ IllegalArgumentException -> 0x008a }
            android.content.Intent r5 = X.C36431kI.A0D()     // Catch:{ IllegalArgumentException -> 0x008a }
            java.lang.String r1 = r7.getPackageName()     // Catch:{ IllegalArgumentException -> 0x008a }
            java.lang.String r0 = "com.whatsapp.payments.phoenix.flowconfigurationservice.resource.permission.FcsRequestPermissionActivity"
            r5.setClassName(r1, r0)     // Catch:{ IllegalArgumentException -> 0x008a }
            java.lang.String r0 = "extra_fds_manager_id"
            r5.putExtra(r0, r6)     // Catch:{ IllegalArgumentException -> 0x008a }
            java.lang.String r0 = "extra_permission"
            r5.putExtra(r0, r4)     // Catch:{ IllegalArgumentException -> 0x008a }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r5.setFlags(r0)     // Catch:{ IllegalArgumentException -> 0x008a }
            r7.startActivity(r5)     // Catch:{ IllegalArgumentException -> 0x008a }
            return
        L_0x007e:
            java.lang.String r1 = "permission_result"
            java.lang.String r0 = "GRANTED"
            java.util.Map r0 = X.C36391kE.A11(r1, r0)     // Catch:{ IllegalArgumentException -> 0x008a }
            r10.BiH(r0)     // Catch:{ IllegalArgumentException -> 0x008a }
            return
        L_0x008a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "request_permission/execute: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " is not a valid permission to request"
            X.C36321k7.A1Z(r1, r0)
            java.lang.String r1 = "permission string is not valid or supported"
            X.6PH r0 = new X.6PH
            r0.<init>(r3, r2, r1)
            r10.BXS(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178698gx.A07(X.6Dp, X.7jf, X.6PH, java.util.Map):void");
    }

    public void B7N(Map map) {
        if (map == null) {
            Log.e("request_permission/finish: result is null");
            this.A00 = null;
            return;
        }
        C159627jf r3 = this.A00;
        if (r3 != null) {
            if (AnonymousClass00C.A0J(map.get("permission_result"), "null_permission")) {
                r3.BXS(new AnonymousClass6PH((Integer) null, "no_valid_permission", "FcsRequestPermissionActivity: permission provided is null"), (Map) null);
            } else {
                r3.BiH(map);
            }
            this.A00 = null;
            return;
        }
        Log.e("request_permission/finish: callback is null");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C178698gx(C19630wG r1, C20830yE r2, C105705Fs r3) {
        super(r3);
        C36321k7.A11(r1, r2, r3);
        this.A02 = r1;
        this.A01 = r2;
    }

    public String A06() {
        return "request_permission";
    }
}
