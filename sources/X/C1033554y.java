package X;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Collections;
import java.util.Enumeration;
import javax.crypto.SecretKey;

/* renamed from: X.54y  reason: invalid class name and case insensitive filesystem */
public class C1033554y extends AnonymousClass137 {
    public KeyStore A00;
    public final C20810yC A01;

    public static StringBuilder A01() {
        StringBuilder sb = new StringBuilder();
        sb.append("EncryptedKeyHelperAESKeyStore/");
        return sb;
    }

    private KeyStore A02() {
        if (this.A00 == null || !this.A01.A0E(1862)) {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            this.A00 = instance;
            instance.load((KeyStore.LoadStoreParameter) null);
        }
        return this.A00;
    }

    private SecretKey A04(KeyStore keyStore) {
        KeyStore.SecretKeyEntry secretKeyEntry = (KeyStore.SecretKeyEntry) keyStore.getEntry("aes_auth_key", (KeyStore.ProtectionParameter) null);
        if (secretKeyEntry != null) {
            return secretKeyEntry.getSecretKey();
        }
        Enumeration<String> aliases = keyStore.aliases();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Missing key alias ");
        A0u.append("aes_auth_key");
        A0u.append("; available aliases = ");
        throw new KeyStoreException(AnonymousClass000.A0q(TextUtils.join(",", Collections.list(aliases)), A0u));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C1264463z A06(byte[] r11) {
        /*
            r10 = this;
            java.lang.String r3 = "ged"
            java.security.KeyStore r1 = r10.A02()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            java.lang.String r2 = "aes_auth_key"
            boolean r0 = r1.containsAlias(r2)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            if (r0 == 0) goto L_0x001b
            java.lang.Class<java.security.KeyStore$SecretKeyEntry> r0 = java.security.KeyStore.SecretKeyEntry.class
            boolean r0 = r1.entryInstanceOf(r2, r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            if (r0 == 0) goto L_0x001b
            javax.crypto.SecretKey r2 = r10.A03()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            goto L_0x005a
        L_0x001b:
            java.lang.String r1 = "AES"
            java.lang.String r0 = "AndroidKeyStore"
            javax.crypto.KeyGenerator r4 = javax.crypto.KeyGenerator.getInstance(r1, r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            r0 = 3
            android.security.keystore.KeyGenParameterSpec$Builder r1 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            r1.<init>(r2, r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            java.lang.String r0 = "GCM"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            android.security.keystore.KeyGenParameterSpec$Builder r1 = r1.setBlockModes(r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            java.lang.String r0 = "NoPadding"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r1.setEncryptionPaddings(r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            r2 = 0
            android.security.keystore.KeyGenParameterSpec$Builder r1 = r0.setUserAuthenticationRequired(r2)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            boolean r0 = X.C19550w8.A05()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            if (r0 == 0) goto L_0x004f
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r1.setUserConfirmationRequired(r2)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            r0.setUserPresenceRequired(r2)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
        L_0x004f:
            android.security.keystore.KeyGenParameterSpec r0 = r1.build()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            r4.init(r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            javax.crypto.SecretKey r2 = r4.generateKey()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
        L_0x005a:
            if (r2 == 0) goto L_0x0075
            javax.crypto.Cipher r1 = X.C90514aH.A19()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            r0 = 1
            r1.init(r0, r2)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            byte[] r7 = r1.getIV()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            byte[] r6 = r1.doFinal(r11)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            r9 = 0
            r5 = 0
            X.63z r4 = new X.63z     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            r8 = r5
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            return r4
        L_0x0075:
            java.lang.String r1 = "could not get key store entry"
            java.security.KeyStoreException r0 = new java.security.KeyStoreException     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            r0.<init>(r1)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
            throw r0     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x007d }
        L_0x007d:
            r2 = move-exception
            java.lang.StringBuilder r1 = A01()
            java.lang.String r0 = "key store issue on decryption"
            goto L_0x008c
        L_0x0085:
            r2 = move-exception
            java.lang.StringBuilder r1 = A01()
            java.lang.String r0 = "crypto issue on encryption"
        L_0x008c:
            X.C36351kA.A1Q(r0, r1, r2)
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto L_0x0099
            java.lang.Throwable r2 = r2.getCause()
        L_0x0099:
            r10.A05(r3, r2)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1033554y.A06(byte[]):X.63z");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A08(X.C1264463z r9, java.lang.Integer r10) {
        /*
            r8 = this;
            java.lang.String r7 = "gd-"
            int r0 = r9.A00
            r6 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.StringBuilder r1 = A01()
            java.lang.String r0 = "getDecrypted invalid type"
            X.C36321k7.A1Z(r1, r0)
            return r6
        L_0x0011:
            javax.crypto.SecretKey r5 = r8.A03()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x003f, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0037 }
            if (r5 == 0) goto L_0x002f
            javax.crypto.Cipher r4 = X.C90514aH.A19()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x003f, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0037 }
            r3 = 2
            r2 = 128(0x80, float:1.794E-43)
            byte[] r1 = r9.A03     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x003f, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0037 }
            javax.crypto.spec.GCMParameterSpec r0 = new javax.crypto.spec.GCMParameterSpec     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x003f, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0037 }
            r0.<init>(r2, r1)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x003f, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0037 }
            r4.init(r3, r5, r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x003f, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0037 }
            byte[] r0 = r9.A02     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x003f, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0037 }
            byte[] r0 = r4.doFinal(r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x003f, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0037 }
            return r0
        L_0x002f:
            java.lang.String r1 = "could not get key store entry"
            java.security.KeyStoreException r0 = new java.security.KeyStoreException     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x003f, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0037 }
            r0.<init>(r1)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x003f, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0037 }
            throw r0     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x003f, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0037 }
        L_0x0037:
            r3 = move-exception
            java.lang.StringBuilder r1 = A01()
            java.lang.String r0 = "key store issue on decryption"
            goto L_0x0046
        L_0x003f:
            r3 = move-exception
            java.lang.StringBuilder r1 = A01()
            java.lang.String r0 = "crypto issue on decryption"
        L_0x0046:
            X.C36351kA.A1Q(r0, r1, r3)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r7)
            int r1 = r10.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0068
            java.lang.String r0 = "selftest"
        L_0x0056:
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r2)
            java.lang.Throwable r0 = r3.getCause()
            if (r0 == 0) goto L_0x0064
            java.lang.Throwable r3 = r3.getCause()
        L_0x0064:
            r8.A05(r1, r3)
            return r6
        L_0x0068:
            java.lang.String r0 = "active"
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1033554y.A08(X.63z, java.lang.Integer):byte[]");
    }

    public C1033554y(C19700wN r1, C21100yf r2, C20810yC r3, C19890wg r4) {
        super(r1, r2, r4);
        this.A01 = r3;
    }

    private SecretKey A03() {
        try {
            return A04(A02());
        } catch (UnrecoverableKeyException e) {
            e = e;
            C36321k7.A1Z(A01(), " KeyStore error, will wait and retry with new keystore");
            if (e.getCause() != null) {
                e = e.getCause();
            }
            A05("gd", e);
            SystemClock.sleep(50);
            return A04(A02());
        }
    }

    public void A07() {
        try {
            A02().deleteEntry("aes_auth_key");
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            C36321k7.A1Z(A01(), "failed to clear keyStore");
        }
    }
}
