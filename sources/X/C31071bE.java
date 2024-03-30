package X;

import android.os.Process;
import android.os.UserManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.1bE  reason: invalid class name and case insensitive filesystem */
public class C31071bE {
    public Boolean A00;
    public final C21060yb A01;
    public final C19630wG A02;
    public final C19420v0 A03;
    public final C31081bF A04;
    public final C21100yf A05;
    public final AnonymousClass13J A06;

    public boolean A01() {
        boolean booleanValue;
        C21100yf r1 = this.A05;
        boolean z = true;
        if (!r1.A09(C21100yf.A0F)) {
            z = false;
        }
        boolean A09 = r1.A09(C21100yf.A0E);
        synchronized (this) {
            Boolean bool = this.A00;
            if (bool == null) {
                C21060yb r2 = this.A01;
                UserManager userManager = r2.A02;
                if (userManager == null) {
                    userManager = (UserManager) C21060yb.A03(r2, PublicKeyCredentialControllerUtility.JSON_KEY_USER, true);
                    r2.A02 = userManager;
                }
                boolean z2 = true;
                if (userManager != null) {
                    try {
                        if (userManager.getSerialNumberForUser(Process.myUserHandle()) != 0) {
                            z2 = false;
                        }
                    } catch (Exception e) {
                        Log.e("FbnsTokenManager/isAdminUser", e);
                    }
                }
                bool = Boolean.valueOf(z2);
                this.A00 = bool;
            }
            booleanValue = bool.booleanValue();
        }
        if (!z) {
            return false;
        }
        if (!A09 || booleanValue) {
            return true;
        }
        return false;
    }

    public C31071bE(C21100yf r1, C21060yb r2, C19630wG r3, C19420v0 r4, C31081bF r5, AnonymousClass13J r6) {
        this.A02 = r3;
        this.A05 = r1;
        this.A06 = r6;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0065, code lost:
        if (r3 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if (240677001 != r3) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = r7.A01()
            if (r0 == 0) goto L_0x00af
            X.0v0 r5 = r7.A03
            X.005 r3 = r5.A00
            java.lang.Object r2 = r3.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "fbns_token"
            r0 = 0
            java.lang.String r4 = r2.getString(r1, r0)
            java.lang.Object r2 = r3.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "fbns_app_vers"
            r0 = 0
            int r3 = r2.getInt(r1, r0)
            r1 = 240677001(0xe587089, float:2.667824E-30)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0036
            boolean r0 = r8.equals(r4)
            if (r0 == 0) goto L_0x0036
            r2 = 0
            if (r1 == r3) goto L_0x0037
        L_0x0036:
            r2 = 1
        L_0x0037:
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r5)
            java.lang.String r0 = "last_server_fbns_token"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r8)
            r0.apply()
            if (r2 == 0) goto L_0x00e2
            X.0wG r0 = r7.A02
            android.content.Context r4 = r0.A00
            java.lang.String r6 = X.AnonymousClass6JD.A0C
            java.util.List r5 = X.C113685fw.A00
            java.util.Iterator r1 = r5.iterator()
        L_0x0052:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = X.AnonymousClass6GW.A01(r4, r3)
            if (r0 == 0) goto L_0x0052
            r2 = 1
            if (r3 != 0) goto L_0x0068
        L_0x0067:
            r2 = 0
        L_0x0068:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "FbnsTokenManager/requestFbnsToken fbns-enabled:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 == 0) goto L_0x00af
            if (r3 == 0) goto L_0x00af
            java.lang.String r0 = "com.facebook.rti.fbns.intent.REGISTER"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "pkg_name"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "appid"
            r2.putExtra(r0, r6)
            boolean r0 = r5.contains(r3)
            if (r0 != 0) goto L_0x00b0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "FBNSPreloadIPC/Unknown package "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00af:
            return
        L_0x00b0:
            java.lang.String r0 = "com.oculus.horizon"
            boolean r0 = r3.equals(r0)     // Catch:{ IllegalStateException -> 0x00d9, SecurityException -> 0x00af, RuntimeException -> 0x00cf }
            if (r0 == 0) goto L_0x00c9
            java.lang.String r1 = "com.oculus.horizon.push.HorizonFbnsService"
        L_0x00ba:
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ IllegalStateException -> 0x00d9, SecurityException -> 0x00af, RuntimeException -> 0x00cf }
            r0.<init>(r3, r1)     // Catch:{ IllegalStateException -> 0x00d9, SecurityException -> 0x00af, RuntimeException -> 0x00cf }
            r2.setComponent(r0)     // Catch:{ IllegalStateException -> 0x00d9, SecurityException -> 0x00af, RuntimeException -> 0x00cf }
            X.AnonymousClass6GW.A00(r4, r2)     // Catch:{ IllegalStateException -> 0x00d9, SecurityException -> 0x00af, RuntimeException -> 0x00cf }
            r4.startService(r2)     // Catch:{ IllegalStateException -> 0x00d9, SecurityException -> 0x00af, RuntimeException -> 0x00cf }
            goto L_0x00ce
        L_0x00c9:
            java.lang.String r1 = "com.facebook.oxygen.services.fbns.PreloadedFbnsService"
            goto L_0x00ba
        L_0x00cc:
            r3 = 0
            goto L_0x0067
        L_0x00ce:
            return
        L_0x00cf:
            r2 = move-exception
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L_0x00e1
            return
        L_0x00d9:
            r2 = move-exception
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x00e1
            return
        L_0x00e1:
            throw r2
        L_0x00e2:
            java.lang.String r0 = "FbnsTokenManager/verifyFbnsToken no-need-to-refresh"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31071bE.A00(java.lang.String):void");
    }
}
