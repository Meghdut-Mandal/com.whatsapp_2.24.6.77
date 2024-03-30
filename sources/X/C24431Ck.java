package X;

import android.text.TextUtils;
import android.util.Base64;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1Ck  reason: invalid class name and case insensitive filesystem */
public class C24431Ck {
    public static final byte[] A08 = "backup encryption".getBytes();
    public static final byte[] A09 = "metadata authentication".getBytes();
    public static final byte[] A0A = "metadata encryption".getBytes();
    public final AnonymousClass164 A00;
    public final C24411Ci A01;
    public final C24341Cb A02;
    public final C19420v0 A03;
    public final C24441Cl A04;
    public final C24451Cm A05 = new C24451Cm(new Random(), 3, 200);
    public final C19770wU A06;
    public final C000100b A07;

    public void A02() {
        C19420v0 r3 = this.A03;
        r3.A1z(false);
        r3.A20(false);
        C19420v0.A00(r3).putInt("encrypted_backup_fleet_migration_state", 0).apply();
        C19420v0.A00(r3).putBoolean("encrypted_backup_show_forced_reg_after_logout", false).apply();
        AnonymousClass6YY.A0P(new File(this.A01.A00.A00.getFilesDir(), "encrypted_backup.key"));
        Log.i("encb/EncBackupManager/encrypted backup has been disabled");
    }

    public C24431Ck(AnonymousClass164 r7, C24411Ci r8, C24341Cb r9, C19420v0 r10, C24441Cl r11, C19770wU r12, C000100b r13) {
        this.A06 = r12;
        this.A07 = r13;
        this.A00 = r7;
        this.A02 = r9;
        this.A01 = r8;
        this.A03 = r10;
        this.A04 = r11;
    }

    public String A00(String str) {
        if (!TextUtils.isEmpty(str) && this.A03.A2I()) {
            try {
                C24411Ci r4 = this.A01;
                byte[] A032 = r4.A03();
                boolean z = false;
                if (A032 != null) {
                    z = true;
                }
                C18740tg.A0F(z, "root key is not defined");
                byte[] A002 = AnonymousClass6R0.A00(A032, A0A, 32);
                byte[] A033 = r4.A03();
                boolean z2 = false;
                if (A033 != null) {
                    z2 = true;
                }
                C18740tg.A0F(z2, "root key is not defined");
                byte[] A003 = AnonymousClass6R0.A00(A033, A09, 32);
                boolean z3 = true;
                boolean z4 = false;
                if (A002.length == 32) {
                    z4 = true;
                }
                C18740tg.A0E(z4, "wrong length of enc key");
                boolean z5 = false;
                if (A003.length == 32) {
                    z5 = true;
                }
                C18740tg.A0E(z5, "wrong length of auth key");
                ByteBuffer wrap = ByteBuffer.wrap(Base64.decode(str, 2));
                int i = wrap.get();
                boolean z6 = false;
                if (i == 16) {
                    z6 = true;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected size of iv (");
                sb.append(i);
                sb.append(")");
                C18740tg.A0E(z6, sb.toString());
                byte[] bArr = new byte[i];
                wrap.get(bArr);
                int i2 = wrap.get();
                if (i2 != 32) {
                    z3 = false;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unexpected size of mac (");
                sb2.append(i2);
                sb2.append(")");
                C18740tg.A0E(z3, sb2.toString());
                byte[] bArr2 = new byte[i2];
                wrap.get(bArr2);
                byte[] bArr3 = new byte[wrap.remaining()];
                wrap.get(bArr3);
                Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
                instance.init(new SecretKeySpec(A003, DefaultCrypto.HMAC_SHA256));
                instance.update(bArr);
                instance.update(bArr3);
                if (MessageDigest.isEqual(instance.doFinal(), bArr2)) {
                    Cipher instance2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    instance2.init(2, new SecretKeySpec(A002, "AES"), new IvParameterSpec(bArr));
                    return new String(instance2.doFinal(bArr3));
                }
                throw new SecurityException("cannot authenticate");
            } catch (SecurityException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                Log.e("encb/EncBackupManager/failed to decrypt backup metadata", e);
            }
        }
        return null;
    }

    public String A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!this.A03.A2I()) {
            return str;
        }
        try {
            C24411Ci r4 = this.A01;
            byte[] A032 = r4.A03();
            boolean z = false;
            if (A032 != null) {
                z = true;
            }
            C18740tg.A0F(z, "root key is not defined");
            byte[] A002 = AnonymousClass6R0.A00(A032, A0A, 32);
            byte[] A033 = r4.A03();
            boolean z2 = false;
            if (A033 != null) {
                z2 = true;
            }
            C18740tg.A0F(z2, "root key is not defined");
            byte[] A003 = AnonymousClass6R0.A00(A033, A09, 32);
            byte[] A0H = C18750th.A0H(16);
            boolean z3 = false;
            boolean z4 = false;
            if (A002.length == 32) {
                z4 = true;
            }
            C18740tg.A0E(z4, "wrong length of enc key");
            boolean z5 = false;
            if (A003.length == 32) {
                z5 = true;
            }
            C18740tg.A0E(z5, "wrong length of auth key");
            int length = A0H.length;
            if (length == 16) {
                z3 = true;
            }
            C18740tg.A0E(z3, "wrong length of iv");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, new SecretKeySpec(A002, "AES"), new IvParameterSpec(A0H));
            byte[] doFinal = instance.doFinal(str.getBytes());
            Mac instance2 = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
            instance2.init(new SecretKeySpec(A003, DefaultCrypto.HMAC_SHA256));
            instance2.update(A0H);
            instance2.update(doFinal);
            byte[] doFinal2 = instance2.doFinal();
            int length2 = doFinal2.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 1 + 1 + length2 + doFinal.length);
            allocate.put((byte) length);
            allocate.put(A0H);
            allocate.put((byte) length2);
            allocate.put(doFinal2);
            allocate.put(doFinal);
            return Base64.encodeToString(allocate.array(), 2);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            Log.e("encb/EncBackupManager/failed to encrypt backup metadata", e);
            return null;
        }
    }

    public void A03(String str) {
        byte[] bytes = str.getBytes();
        byte[] A0H = C18750th.A0H(64);
        int length = bytes.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) bytes[i];
        }
        try {
            this.A01.A01(new C121215sm(C18750th.A08("PBKDF2WithHmacSHA512", A0H, cArr, 100000, 512).getEncoded(), A0H, 100000));
            C19420v0.A00(this.A03).putInt("encrypted_backup_num_attempts_remaining", 5).apply();
        } catch (IOException e) {
            Log.e("encb/EncBackupManager/storePasswordHash failed", e);
        }
    }
}
