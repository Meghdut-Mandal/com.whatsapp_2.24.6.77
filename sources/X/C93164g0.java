package X;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.sql.Date;
import org.json.JSONObject;

/* renamed from: X.4g0  reason: invalid class name and case insensitive filesystem */
public class C93164g0 extends AnonymousClass01L {
    public Context A00;
    public String A01 = "";
    public JSONObject A02;
    public AnonymousClass66Z A03;
    public AnonymousClass6PJ A04;
    public C133166Xa A05;

    public C93164g0(Context context) {
        try {
            this.A00 = context;
            this.A03 = new AnonymousClass66Z(context);
            this.A05 = new C133166Xa();
        } catch (Exception e) {
            throw e;
        }
    }

    public static boolean A0F() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            instance.initialize(new KeyGenParameterSpec.Builder("demo_key", 1).build());
            PrivateKey privateKey = instance.generateKeyPair().getPrivate();
            return ((KeyInfo) KeyFactory.getInstance(privateKey.getAlgorithm(), "AndroidKeyStore").getKeySpec(privateKey, KeyInfo.class)).isInsideSecureHardware();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void A01(String str, C93164g0 r13) {
        Boolean bool;
        String A012 = r13.A04.A01("ServerRiskParams");
        String A013 = r13.A04.A01("ClientRiskRules");
        if (A012.equals("")) {
            r13.A04.A03(str, "ServerRiskParams");
            if (A013.equals("")) {
                r13.A04.A03("{\"ATC\":\"0\",\"OTC\":\"0\",\"COTA\":\"0\"}", "ClientRiskRules");
            }
        } else {
            try {
                bool = AnonymousClass6HT.A00(C36441kJ.A1C(A012));
            } catch (Exception unused) {
                bool = C36381kD.A0j();
            }
            if (bool.booleanValue()) {
                Date date = new Date(Long.parseLong(C90504aG.A0x(Base64.decode(C36441kJ.A1C(A012).getString("riskRules"), 2)).getString("timestamp")));
                JSONObject A0x = C90504aG.A0x(C90514aH.A1b("riskRules", C36441kJ.A1C(str), 2));
                r13.A02 = A0x;
                if (new Date(Long.parseLong(A0x.getString("timestamp"))).after(date)) {
                    r13.A04.A03(str, "ServerRiskParams");
                    if (A013.equals("")) {
                        A013 = "{\"ATC\":\"0\",\"OTC\":\"0\",\"COTA\":\"0\"}";
                    }
                    JSONObject A1C = C36441kJ.A1C(A013);
                    A1C.put("OTC", "0");
                    r13.A04.A03(C90484aE.A0l("0", "COTA", A1C), "ClientRiskRules");
                } else {
                    throw new Exception("Could not update State");
                }
            } else {
                throw new Exception("Could not update State");
            }
        }
        r13.A04.A03("", "PendingTxn");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        if (0 == 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (r4 != false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A07() {
        /*
            java.lang.String r1 = android.os.Build.TAGS
            if (r1 == 0) goto L_0x0022
            java.lang.String r0 = "test-keys"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0022
        L_0x000c:
            r0 = 1
        L_0x000d:
            r4 = 1
            r3 = r0 ^ 1
            boolean r0 = A0F()
            r3 = r3 & r0
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r0 = 23
            boolean r0 = X.C36371kC.A1T(r2, r0)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0075
            return r4
        L_0x0022:
            java.lang.String r0 = "/system/app/Superuser.apk"
            java.lang.String r1 = "/sbin/su"
            java.lang.String r2 = "/system/bin/su"
            java.lang.String r3 = "/system/xbin/su"
            java.lang.String r4 = "/data/local/xbin/su"
            java.lang.String r5 = "/data/local/bin/su"
            java.lang.String r6 = "/system/sd/xbin/su"
            java.lang.String r7 = "/system/bin/failsafe/su"
            java.lang.String r8 = "/data/local/su"
            java.lang.String r9 = "/su/bin/su"
            java.lang.String[] r2 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            r1 = 0
        L_0x003b:
            r0 = r2[r1]
            boolean r0 = X.C90484aE.A1W(r0)
            if (r0 != 0) goto L_0x000c
            int r1 = r1 + 1
            r0 = 10
            if (r1 < r0) goto L_0x003b
            r4 = 0
            r3 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x006b }
            java.lang.String r1 = "/system/xbin/which"
            java.lang.String r0 = "su"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}     // Catch:{ all -> 0x006b }
            java.lang.Process r3 = r2.exec(r0)     // Catch:{ all -> 0x006b }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ all -> 0x006b }
            java.io.BufferedReader r0 = X.C90484aE.A0b(r0)     // Catch:{ all -> 0x006b }
            java.lang.String r0 = r0.readLine()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x006d
            r4 = 1
            goto L_0x006d
        L_0x006b:
            if (r3 == 0) goto L_0x0073
        L_0x006d:
            r3.destroy()
            if (r4 == 0) goto L_0x0073
            goto L_0x000c
        L_0x0073:
            r0 = 0
            goto L_0x000d
        L_0x0075:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93164g0.A07():boolean");
    }

    public boolean A2E(String str, String str2, String str3) {
        String A13 = C36441kJ.A13(C133166Xa.A03(C90464aC.A0e(str2, str, str3)));
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            instance.deleteEntry(A13);
            AnonymousClass6PJ A002 = AnonymousClass6PJ.A00(this.A00, A13);
            this.A04 = A002;
            A002.A02();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
