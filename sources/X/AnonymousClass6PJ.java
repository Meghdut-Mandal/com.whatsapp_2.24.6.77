package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* renamed from: X.6PJ  reason: invalid class name */
public class AnonymousClass6PJ {
    public static String A03;
    public static AnonymousClass6PJ A04;
    public C133166Xa A00 = new C133166Xa();
    public Context A01;
    public SecretKey A02;

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|(1:4)(1:5)|6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x004b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A03(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            android.content.Context r2 = r8.A01     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "VAULT"
            r0 = 0
            android.content.SharedPreferences r7 = r2.getSharedPreferences(r1, r0)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = A03     // Catch:{ all -> 0x008f }
            r3 = 0
            java.lang.String r2 = r7.getString(r0, r3)     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x008f }
            java.lang.String r0 = A03     // Catch:{ all -> 0x008f }
            r1.append(r0)     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "IV"
            java.lang.String r0 = X.AnonymousClass000.A0q(r5, r1)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r7.getString(r0, r3)     // Catch:{ all -> 0x008f }
            r4 = 2
            if (r2 == 0) goto L_0x0044
            byte[] r3 = android.util.Base64.decode(r2, r4)     // Catch:{ all -> 0x008f }
            byte[] r2 = android.util.Base64.decode(r0, r4)     // Catch:{ all -> 0x008f }
            javax.crypto.Cipher r1 = X.C90514aH.A19()     // Catch:{ all -> 0x008f }
            javax.crypto.SecretKey r0 = r8.A02     // Catch:{ all -> 0x008f }
            X.C90504aG.A1P(r0, r1, r2)     // Catch:{ all -> 0x008f }
            byte[] r2 = r1.doFinal(r3)     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "UTF-8"
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x008f }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x008f }
            goto L_0x0046
        L_0x0044:
            java.lang.String r0 = "{}"
        L_0x0046:
            org.json.JSONObject r0 = X.C36441kJ.A1C(r0)     // Catch:{ JSONException -> 0x004b }
            goto L_0x004f
        L_0x004b:
            org.json.JSONObject r0 = X.C36441kJ.A1B()     // Catch:{ all -> 0x008f }
        L_0x004f:
            java.lang.String r1 = X.C90484aE.A0l(r9, r10, r0)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = "UTF-8"
            byte[] r6 = r1.getBytes(r0)     // Catch:{ all -> 0x008f }
            javax.crypto.Cipher r2 = X.C90514aH.A19()     // Catch:{ all -> 0x008f }
            r1 = 1
            javax.crypto.SecretKey r0 = r8.A02     // Catch:{ all -> 0x008f }
            r2.init(r1, r0)     // Catch:{ all -> 0x008f }
            byte[] r3 = r2.getIV()     // Catch:{ all -> 0x008f }
            byte[] r0 = r2.doFinal(r6)     // Catch:{ all -> 0x008f }
            android.content.SharedPreferences$Editor r2 = r7.edit()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = A03     // Catch:{ all -> 0x008f }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r4)     // Catch:{ all -> 0x008f }
            X.C36341k9.A0x(r2, r1, r0)     // Catch:{ all -> 0x008f }
            android.content.SharedPreferences$Editor r2 = r7.edit()     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x008f }
            java.lang.String r0 = A03     // Catch:{ all -> 0x008f }
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r5, r1)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = android.util.Base64.encodeToString(r3, r4)     // Catch:{ all -> 0x008f }
            X.C36341k9.A0x(r2, r1, r0)     // Catch:{ all -> 0x008f }
            monitor-exit(r8)
            return
        L_0x008f:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6PJ.A03(java.lang.String, java.lang.String):void");
    }

    public static AnonymousClass6PJ A00(Context context, String str) {
        AnonymousClass6PJ r3 = A04;
        if (!AnonymousClass000.A1W(r3) && !(true ^ str.equals(A03))) {
            return r3;
        }
        AnonymousClass6PJ r32 = new AnonymousClass6PJ(context, str);
        A04 = r32;
        return r32;
    }

    public String A01(String str) {
        try {
            SharedPreferences sharedPreferences = this.A01.getSharedPreferences("VAULT", 0);
            String string = sharedPreferences.getString(A03, (String) null);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(A03);
            String string2 = sharedPreferences.getString(AnonymousClass000.A0q("IV", A0u), (String) null);
            if (string != null) {
                byte[] decode = Base64.decode(string, 2);
                byte[] decode2 = Base64.decode(string2, 2);
                Cipher A19 = C90514aH.A19();
                C90504aG.A1P(this.A02, A19, decode2);
                return C90504aG.A0x(A19.doFinal(decode)).optString(str, "");
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public AnonymousClass6PJ(Context context, String str) {
        A03 = str;
        this.A01 = context;
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            this.A02 = (SecretKey) instance.getKey(AnonymousClass000.A0q("-NPCI-Vault", AnonymousClass000.A0v(str)), (char[]) null);
            Cipher.getInstance("AES/GCM/NoPadding").init(1, this.A02);
        } catch (InvalidKeyException unused) {
            A02();
        }
    }

    public void A02() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(A03);
        this.A02 = C133166Xa.A02(AnonymousClass000.A0q("-NPCI-Vault", A0u));
        Cipher A19 = C90514aH.A19();
        A19.init(1, this.A02);
        byte[] iv = A19.getIV();
        byte[] doFinal = A19.doFinal("{}".getBytes(DefaultCrypto.UTF_8));
        SharedPreferences sharedPreferences = this.A01.getSharedPreferences("VAULT", 0);
        C36341k9.A0x(sharedPreferences.edit(), A03, Base64.encodeToString(doFinal, 2));
        SharedPreferences.Editor edit = sharedPreferences.edit();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append(A03);
        C36341k9.A0x(edit, AnonymousClass000.A0q("IV", A0u2), Base64.encodeToString(iv, 2));
    }
}
