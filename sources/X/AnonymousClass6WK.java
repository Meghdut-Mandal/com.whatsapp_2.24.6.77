package X;

import android.security.KeyPairGeneratorSpec;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6WK  reason: invalid class name */
public class AnonymousClass6WK {
    public KeyStore A00;
    public JSONObject A01;
    public boolean A02;
    public final C19630wG A03;
    public final C24601Db A04;
    public final C24611Dc A05 = C24611Dc.A00("PaymentTrustedDeviceManager", "infra", "COMMON");
    public final C111495cN A06;

    private synchronized void A00() {
        byte[] decode;
        if (!this.A02) {
            A05();
            try {
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                this.A00 = instance;
                instance.load((KeyStore.LoadStoreParameter) null);
                C24601Db r2 = this.A04;
                if (!C36371kC.A1U(r2.A03(), "payment_trusted_device_credential_use_keystore") && !C36371kC.A1U(r2.A03(), "payment_trusted_device_credential_use_keystore")) {
                    try {
                        Calendar instance2 = Calendar.getInstance();
                        Calendar instance3 = Calendar.getInstance();
                        instance3.add(1, 50);
                        KeyPairGeneratorSpec build = C90514aH.A0O(new KeyPairGeneratorSpec.Builder(this.A03.A00).setAlias("payment_trusted_device_key_alias").setSubject(new X500Principal("CN=payment_trusted_device_key_alias")), BigInteger.TEN, instance2, instance3).build();
                        KeyPairGenerator instance4 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        instance4.initialize(build);
                        instance4.generateKeyPair();
                    } catch (Exception e) {
                        C90464aC.A17(this.A05, e, "generate RSA key pairs fails: ", AnonymousClass000.A0u());
                    }
                    A01();
                }
                this.A02 = true;
            } catch (Exception e2) {
                C90464aC.A17(this.A05, e2, "keystore init fails: ", AnonymousClass000.A0u());
            }
            String A0t = C36371kC.A0t(this.A04.A03(), "payment_trusted_device_credential");
            if (!TextUtils.isEmpty(A0t) && (decode = Base64.decode(A0t, 3)) != null) {
                A06(decode, 1);
            }
        }
    }

    private byte[] A02(byte[] bArr) {
        byte[] bArr2;
        byte[] A032;
        try {
            String string = this.A04.A03().getString("payment_trusted_device_credential_encrypted_aes", (String) null);
            if (TextUtils.isEmpty(string) || (bArr2 = Base64.decode(string, 3)) == null) {
                bArr2 = A01();
            }
            if (bArr2 == null || (A032 = A03(bArr2)) == null) {
                return null;
            }
            byte[] bArr3 = new byte[16];
            new SecureRandom().nextBytes(bArr3);
            SecretKeySpec A0m = C90494aF.A0m(A032);
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, A0m, new IvParameterSpec(bArr3));
            byte[] doFinal = instance.doFinal(bArr);
            int length = doFinal.length;
            byte[] bArr4 = new byte[(16 + length)];
            System.arraycopy(bArr3, 0, bArr4, 0, 16);
            System.arraycopy(doFinal, 0, bArr4, 16, length);
            return bArr4;
        } catch (Exception e) {
            C90464aC.A17(this.A05, e, "encrypt key fails: ", AnonymousClass000.A0u());
            return null;
        }
    }

    private byte[] A03(byte[] bArr) {
        CipherInputStream cipherInputStream;
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(2, ((KeyStore.PrivateKeyEntry) this.A00.getEntry("payment_trusted_device_key_alias", (KeyStore.ProtectionParameter) null)).getPrivateKey());
            ByteArrayInputStream A0P = C90524aI.A0P(bArr);
            try {
                cipherInputStream = new CipherInputStream(A0P, instance);
                ArrayList A0I = AnonymousClass001.A0I();
                while (true) {
                    int read = cipherInputStream.read();
                    if (read == -1) {
                        break;
                    }
                    A0I.add(Byte.valueOf((byte) read));
                }
                int size = A0I.size();
                byte[] bArr2 = new byte[size];
                for (int i = 0; i < size; i++) {
                    bArr2[i] = ((Byte) A0I.get(i)).byteValue();
                }
                cipherInputStream.close();
                A0P.close();
                return bArr2;
            } catch (Throwable th) {
                A0P.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            C90464aC.A17(this.A05, e, "RSA decrypt fails: ", AnonymousClass000.A0u());
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0021 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A06(byte[] r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 3
            java.lang.String r2 = android.util.Base64.encodeToString(r4, r0)     // Catch:{ JSONException -> 0x0021 }
            org.json.JSONObject r1 = r3.A01     // Catch:{ JSONException -> 0x0021 }
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ JSONException -> 0x0021 }
            r1.put(r0, r2)     // Catch:{ JSONException -> 0x0021 }
            X.1Db r1 = r3.A04     // Catch:{ JSONException -> 0x0021 }
            org.json.JSONObject r0 = r3.A01     // Catch:{ JSONException -> 0x0021 }
            java.lang.String r2 = r0.toString()     // Catch:{ JSONException -> 0x0021 }
            android.content.SharedPreferences$Editor r1 = X.C90494aF.A0E(r1)     // Catch:{ JSONException -> 0x0021 }
            java.lang.String r0 = "payments_trusted_device_credential_network_map"
            X.C36341k9.A0x(r1, r0, r2)     // Catch:{ JSONException -> 0x0021 }
            goto L_0x0028
        L_0x0021:
            X.1Dc r1 = r3.A05     // Catch:{ all -> 0x002a }
            java.lang.String r0 = "setNetworkCredential failed"
            r1.A05(r0)     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r3)
            return
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WK.A06(byte[], int):void");
    }

    private byte[] A01() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        byte[] bArr2 = null;
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, ((KeyStore.PrivateKeyEntry) this.A00.getEntry("payment_trusted_device_key_alias", (KeyStore.ProtectionParameter) null)).getCertificate().getPublicKey());
            ByteArrayOutputStream A0Q = C90524aI.A0Q();
            CipherOutputStream cipherOutputStream = new CipherOutputStream(A0Q, instance);
            cipherOutputStream.write(bArr);
            cipherOutputStream.close();
            bArr2 = A0Q.toByteArray();
        } catch (Exception e) {
            C90464aC.A17(this.A05, e, "RSA encrypt fails: ", AnonymousClass000.A0u());
        }
        if (bArr2 != null) {
            C24601Db r1 = this.A04;
            C36341k9.A0x(C90494aF.A0E(r1), "payment_trusted_device_credential_encrypted_aes", Base64.encodeToString(bArr2, 3));
        }
        Arrays.fill(bArr, (byte) 0);
        return bArr2;
    }

    public void A05() {
        JSONObject A1B;
        try {
            String A0t = C36371kC.A0t(this.A04.A03(), "payments_trusted_device_credential_network_map");
            if (A0t != null) {
                A1B = C36441kJ.A1C(A0t);
            } else {
                A1B = C36441kJ.A1B();
            }
            this.A01 = A1B;
        } catch (JSONException e) {
            this.A05.A05(C36331k8.A0i("JSONObject instantiation ", AnonymousClass000.A0u(), e));
            this.A01 = C36441kJ.A1B();
        }
    }

    public AnonymousClass6WK(C19630wG r4, C24601Db r5, C111495cN r6) {
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = r6;
    }

    public PrivateKey A04(int i) {
        byte[] bArr;
        byte[] A032;
        A00();
        A05();
        byte[] bArr2 = null;
        String optString = this.A01.optString(String.valueOf(i), (String) null);
        if (!TextUtils.isEmpty(optString)) {
            bArr2 = Base64.decode(optString, 3);
        }
        if (bArr2 == null) {
            A00();
            try {
                KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
                instance.initialize(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                PrivateKey privateKey = instance.genKeyPair().getPrivate();
                byte[] A022 = A02(privateKey.getEncoded());
                if (A022 != null) {
                    A06(A022, i);
                    C24601Db r3 = this.A04;
                    if (!C36371kC.A1U(r3.A03(), "payment_trusted_device_credential_use_keystore")) {
                        C36331k8.A0w(C90494aF.A0E(r3), "payment_trusted_device_credential_use_keystore", true);
                    }
                    Arrays.fill(A022, (byte) 0);
                    return privateKey;
                }
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                C90464aC.A17(this.A05, e, "generate RSA key fails: ", AnonymousClass000.A0u());
            }
            return null;
        }
        try {
            C24601Db r5 = this.A04;
            if (!C36371kC.A1U(r5.A03(), "payment_trusted_device_credential_use_keystore")) {
                byte[] A023 = A02(bArr2);
                if (A023 != null) {
                    A06(bArr2, i);
                    C36331k8.A0w(C90494aF.A0E(r5), "payment_trusted_device_credential_use_keystore", true);
                    Arrays.fill(A023, (byte) 0);
                }
            } else {
                try {
                    String string = r5.A03().getString("payment_trusted_device_credential_encrypted_aes", (String) null);
                    if (TextUtils.isEmpty(string) || (bArr = Base64.decode(string, 3)) == null) {
                        bArr = A01();
                    }
                    if (bArr == null || (A032 = A03(bArr)) == null) {
                        bArr2 = null;
                    } else {
                        byte[] bArr3 = new byte[16];
                        System.arraycopy(bArr2, 0, bArr3, 0, 16);
                        int length = bArr2.length - 16;
                        byte[] bArr4 = new byte[length];
                        System.arraycopy(bArr2, 16, bArr4, 0, length);
                        bArr2 = C90484aE.A1a(C90494aF.A0m(A032), Cipher.getInstance("AES/CBC/PKCS5Padding"), bArr3, bArr4);
                    }
                } catch (Exception e2) {
                    C90464aC.A17(this.A05, e2, "decrypt key fails: ", AnonymousClass000.A0u());
                    bArr2 = null;
                }
            }
            if (bArr2 == null) {
                return null;
            }
            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArr2);
            KeyFactory instance2 = KeyFactory.getInstance("RSA");
            Arrays.fill(bArr2, (byte) 0);
            return instance2.generatePrivate(pKCS8EncodedKeySpec);
        } catch (Exception e3) {
            C90464aC.A17(this.A05, e3, "loadRSAKey fails, ", AnonymousClass000.A0u());
            return null;
        }
    }
}
