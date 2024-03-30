package X;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.6S7  reason: invalid class name */
public class AnonymousClass6S7 {
    public KeyStore A00;
    public final C24611Dc A01;
    public final C118165nR A02;

    private void A00(Context context, String str) {
        try {
            this.A01.A09("onboarding", "generate rsa key pairs for", new C119975ql[]{new C119975ql("alias", str)});
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(2, 1);
            KeyPairGeneratorSpec build = C90514aH.A0O(new KeyPairGeneratorSpec.Builder(context).setAlias(str).setSubject(new X500Principal(AnonymousClass000.A0p("CN=", str, AnonymousClass000.A0u()))), BigInteger.TEN, instance, instance2).build();
            KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            instance3.initialize(build);
            instance3.generateKeyPair();
        } catch (Exception e) {
            this.A01.A08("onboarding", (String) null, e);
            throw AnonymousClass001.A0B(e);
        }
    }

    private void A01(String str, String str2) {
        String str3;
        C24611Dc r6 = this.A01;
        r6.A09("onboarding", "generate and store aes key", new C119975ql[]{new C119975ql("alias", str2)});
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        try {
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) this.A00.getEntry(str2, (KeyStore.ProtectionParameter) null);
            if (Build.VERSION.SDK_INT >= 23) {
                str3 = "RSA/ECB/OAEPPadding";
            } else {
                str3 = "RSA/ECB/PKCS1Padding";
            }
            Cipher instance = Cipher.getInstance(str3);
            instance.init(1, privateKeyEntry.getCertificate().getPublicKey());
            ByteArrayOutputStream A0Q = C90524aI.A0Q();
            CipherOutputStream cipherOutputStream = new CipherOutputStream(A0Q, instance);
            cipherOutputStream.write(bArr);
            cipherOutputStream.close();
            C36341k9.A0x(this.A02.A00.edit(), str, Base64.encodeToString(A0Q.toByteArray(), 0));
        } catch (Exception e) {
            r6.A08("onboarding", (String) null, e);
            throw AnonymousClass001.A0B(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0084, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        r8.A01.A08("onboarding", (java.lang.String) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008e, code lost:
        throw X.AnonymousClass001.A0B(r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6S7(android.content.Context r9, X.C19970wo r10, X.C19890wg r11) {
        /*
            r8 = this;
            r8.<init>()
            java.lang.String r1 = "CLKeyStorageManager"
            java.lang.String r4 = "onboarding"
            java.lang.String r0 = "IN"
            X.1Dc r3 = X.C24611Dc.A00(r1, r4, r0)
            r8.A01 = r3
            X.5nR r0 = new X.5nR
            r0.<init>(r11)
            r8.A02 = r0
            X.1Db r0 = new X.1Db
            r0.<init>(r10, r11)
            android.content.SharedPreferences r2 = r0.A03()
            java.lang.String r0 = "psp_test_tool_enabled"
            r1 = 0
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 != 0) goto L_0x008f
            r5 = 0
            java.lang.String r0 = "initializing KS"
            r3.A06(r0)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ Exception -> 0x0084 }
            r8.A00 = r0     // Catch:{ Exception -> 0x0084 }
            r0.load(r5)     // Catch:{ Exception -> 0x0084 }
            r7 = r8
            monitor-enter(r7)     // Catch:{ Exception -> 0x0084 }
            X.5nR r0 = r8.A02     // Catch:{ all -> 0x0081 }
            java.lang.String r6 = "use_ks"
            android.content.SharedPreferences r3 = r0.A00     // Catch:{ all -> 0x0081 }
            boolean r0 = r3.getBoolean(r6, r1)     // Catch:{ all -> 0x0081 }
            if (r0 != 0) goto L_0x007f
            java.security.KeyStore r0 = r8.A00     // Catch:{ Exception -> 0x0069 }
            r0.load(r5)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r2 = "k0"
            r8.A00(r9, r2)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r1 = "token"
            r8.A00(r9, r1)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r0 = "aes_k0"
            r8.A01(r0, r2)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r0 = "aes_token"
            r8.A01(r0, r1)     // Catch:{ Exception -> 0x0069 }
            r1 = 1
            android.content.SharedPreferences$Editor r0 = r3.edit()     // Catch:{ Exception -> 0x0069 }
            X.C36331k8.A0w(r0, r6, r1)     // Catch:{ Exception -> 0x0069 }
            goto L_0x007f
        L_0x0069:
            r3 = move-exception
            X.1Dc r2 = r8.A01     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = " Skip Android KeyStore setup because: "
            r1.append(r0)     // Catch:{ all -> 0x0081 }
            X.C36351kA.A1K(r3, r1)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0081 }
            r2.A08(r4, r0, r3)     // Catch:{ all -> 0x0081 }
        L_0x007f:
            monitor-exit(r7)     // Catch:{ Exception -> 0x0084 }
            return
        L_0x0081:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ Exception -> 0x0084 }
            throw r0     // Catch:{ Exception -> 0x0084 }
        L_0x0084:
            r1 = move-exception
            X.1Dc r0 = r8.A01
            r0.A08(r4, r5, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r1)
            throw r0
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6S7.<init>(android.content.Context, X.0wo, X.0wg):void");
    }
}
