package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.tasks.zzw;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.6Xt  reason: invalid class name and case insensitive filesystem */
public abstract class C133306Xt {
    public static final Object A00 = C36441kJ.A11();
    public static final byte[] A01 = {0, 2};

    public static AnonymousClass166 A00(byte[] bArr) {
        ObjectInputStream objectInputStream;
        if (bArr != null) {
            try {
                objectInputStream = new ObjectInputStream(C90524aI.A0P(bArr));
                AnonymousClass166 r0 = (AnonymousClass166) objectInputStream.readObject();
                objectInputStream.close();
                return r0;
            } catch (IOException | ClassNotFoundException e) {
                Log.e("BackupTokenUtils/convertByteArrayToLRUCache/failed with exception:", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return new AnonymousClass166(5);
        throw th;
    }

    public static void A02(Context context, C19420v0 r9, String str) {
        byte[] bArr;
        String str2;
        String str3;
        int[] iArr = {1, 2};
        int i = 0;
        do {
            int i2 = iArr[i];
            AnonymousClass166 A002 = A00(A05(context, i2));
            String A05 = C18750th.A05(str);
            if (!TextUtils.isEmpty(A05)) {
                A002.remove(A05);
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("BackupTokenUtils/deleteBackupToken/updated LRUCache size is ");
            C36321k7.A1Y(A0u, A002.size());
            if (A002.size() == 0) {
                synchronized (A00) {
                    File filesDir = context.getFilesDir();
                    if (i2 == 2) {
                        str2 = "foa_backup_token";
                    } else {
                        str2 = "backup_token";
                    }
                    C36441kJ.A0w(filesDir, str2).delete();
                }
                SharedPreferences.Editor A003 = C19420v0.A00(r9);
                if (i2 == 2) {
                    str3 = "backup_token_foa_file_timestamp";
                } else {
                    C36341k9.A0u(A003, "backup_token_file_timestamp");
                    A003 = C19420v0.A00(r9);
                    str3 = "backup_token_source";
                }
                C36341k9.A0u(A003, str3);
            } else {
                try {
                    ByteArrayOutputStream A0Q = C90524aI.A0Q();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(A0Q);
                    objectOutputStream.writeObject(A002);
                    objectOutputStream.flush();
                    bArr = A0Q.toByteArray();
                } catch (IOException e) {
                    Log.e("BackupTokenUtils/deleteBackupToken/write token byte array failed/IOException:", e);
                    bArr = null;
                }
                A03(context, (C590532l) null, bArr, i2);
            }
            i++;
        } while (i < 2);
    }

    public static void A03(Context context, C590532l r7, byte[] bArr, int i) {
        String str;
        Log.i("BackupTokenUtils/saveEncryptedBackupToken/update block store");
        if (i == 1) {
            C98754ry r5 = new C98754ry(context);
            C118725od r4 = new C118725od();
            C07180Wq r3 = new C07180Wq((AnonymousClass0OR) null);
            r3.A03 = new C04520Ky[]{C114115gf.A04};
            r3.A01 = new A3H(r5);
            r3.A02 = false;
            r3.A00 = 1651;
            zzw A012 = C07590Yl.A01(r5, r3.A00(), 0);
            A012.addOnSuccessListener(new C141606nW(r5, r4, r7, bArr));
            A012.addOnFailureListener(new C164277rY(r7, 2));
        }
        synchronized (A00) {
            try {
                File filesDir = context.getFilesDir();
                if (i == 2) {
                    str = "foa_backup_token";
                } else {
                    str = "backup_token";
                }
                C18750th.A0A(C36441kJ.A0w(filesDir, str), bArr);
                Log.i("BackupTokenUtils/saveEncryptedBackupToken/successfully write to backup_token file");
            } catch (IOException e) {
                Log.e("BackupTokenUtils/saveEncryptedBackupToken/unable to write to backup_token file:", e);
            }
        }
    }

    public static void A04(C19420v0 r3, Exception exc, int i) {
        String str;
        if (exc != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(AnonymousClass000.A0k(exc));
            str = C36331k8.A0i(" | ", A0u, exc);
        } else if (i == 0) {
            str = "null_token";
        } else {
            str = "success";
        }
        C36321k7.A1Q("BackupTokenUtils/saveBackupTokenRetrievalErrorMessage/Block Store token error message: ", str, AnonymousClass000.A0u());
        if (str.length() > 256) {
            str = C90514aH.A0z(str, 256);
        }
        C36341k9.A0x(C19420v0.A00(r3), "backup_token_retrieval_error", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r8.length == 0) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r8.length == 0) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A06(android.content.Context r10, X.C19420v0 r11, java.lang.String r12, int r13) {
        /*
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = r13
            byte[] r8 = A05(r10, r13)
            if (r8 == 0) goto L_0x0010
            int r1 = r8.length
            r0 = 1
            if (r1 != 0) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r13 = 0
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/no data read from backup_token file"
        L_0x0016:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0019:
            return r13
        L_0x001a:
            int r1 = r8.length
            r0 = 42
            if (r1 > r0) goto L_0x0047
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/single token found"
        L_0x0021:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = X.AnonymousClass6JD.A0V
            r2.append(r0)
            int r0 = r12.length()
            int r1 = r0 + -4
            r0 = 0
            int r0 = java.lang.Math.max(r1, r0)
            java.lang.String r0 = r12.substring(r0)
            java.lang.String r12 = X.AnonymousClass000.A0q(r0, r2)
            byte[] r11 = A01
            java.lang.String r10 = "AES/OFB/NoPadding"
            if (r8 == 0) goto L_0x0019
            goto L_0x0086
        L_0x0047:
            X.166 r2 = A00(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/LRUCache size is "
            r1.append(r0)
            int r0 = r2.size()
            X.C36321k7.A1Y(r1, r0)
            java.lang.String r0 = X.C18750th.A05(r12)
            java.lang.Object r8 = r2.get(r0)
            byte[] r8 = (byte[]) r8
            if (r8 == 0) goto L_0x006b
            int r1 = r8.length
            r0 = 1
            if (r1 != 0) goto L_0x006c
        L_0x006b:
            r0 = 0
        L_0x006c:
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/decrypt token from LRUCache"
            goto L_0x0021
        L_0x0071:
            r0 = 1
            if (r3 != r0) goto L_0x0083
            byte[] r8 = r11.A2X()
            if (r8 == 0) goto L_0x007d
            int r1 = r8.length
            if (r1 != 0) goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/decrypt token from shared preferences"
            goto L_0x0021
        L_0x0083:
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/no token saved for this phone number"
            goto L_0x0016
        L_0x0086:
            r9 = 2
            r3 = 4
            r7 = 6
            r6 = 16
            r5 = 22
            r2 = 42
            int r4 = r8.length     // Catch:{ Exception -> 0x00e1 }
            if (r4 < r2) goto L_0x00c3
            byte[] r0 = new byte[r9]     // Catch:{ Exception -> 0x00e1 }
            r1 = 0
            java.lang.System.arraycopy(r8, r1, r0, r1, r9)     // Catch:{ Exception -> 0x00e1 }
            boolean r0 = java.util.Arrays.equals(r0, r11)     // Catch:{ Exception -> 0x00e1 }
            if (r0 == 0) goto L_0x00db
            byte[] r0 = new byte[r3]     // Catch:{ Exception -> 0x00e1 }
            java.lang.System.arraycopy(r8, r9, r0, r1, r3)     // Catch:{ Exception -> 0x00e1 }
            byte[] r3 = new byte[r6]     // Catch:{ Exception -> 0x00e1 }
            java.lang.System.arraycopy(r8, r7, r3, r1, r6)     // Catch:{ Exception -> 0x00e1 }
            byte[] r0 = A07(r0, r12)     // Catch:{ Exception -> 0x00e1 }
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x00e1 }
            r2.<init>(r0, r10)     // Catch:{ Exception -> 0x00e1 }
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r10)     // Catch:{ Exception -> 0x00e1 }
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec     // Catch:{ Exception -> 0x00e1 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x00e1 }
            r1.init(r9, r2, r0)     // Catch:{ Exception -> 0x00e1 }
            int r4 = r4 - r5
            byte[] r13 = r1.doFinal(r8, r5, r4)     // Catch:{ Exception -> 0x00e1 }
            return r13
        L_0x00c3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r0 = "size mismatch expected length:"
            r1.append(r0)     // Catch:{ Exception -> 0x00e1 }
            r1.append(r2)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r0 = ", actual length:"
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r4)     // Catch:{ Exception -> 0x00e1 }
            java.security.InvalidParameterException r0 = new java.security.InvalidParameterException     // Catch:{ Exception -> 0x00e1 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00e1 }
            goto L_0x00e0
        L_0x00db:
            X.0tz r0 = new X.0tz     // Catch:{ Exception -> 0x00e1 }
            r0.<init>()     // Catch:{ Exception -> 0x00e1 }
        L_0x00e0:
            throw r0     // Catch:{ Exception -> 0x00e1 }
        L_0x00e1:
            r1 = move-exception
            java.lang.String r0 = "BackupTokenUtils/decrypt/unable to decrypt"
            com.whatsapp.util.Log.e(r0, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133306Xt.A06(android.content.Context, X.0v0, java.lang.String, int):byte[]");
    }

    public static void A01(Context context, C19970wo r11, C19420v0 r12, C590532l r13, String str, byte[] bArr, int i) {
        byte[] bArr2;
        String str2;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(AnonymousClass6JD.A0V);
        String A0q = AnonymousClass000.A0q(str.substring(Math.max(str.length() - 4, 0)), A0u);
        byte[] bArr3 = A01;
        try {
            byte[] A0H = C18750th.A0H(4);
            byte[] A0H2 = C18750th.A0H(16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(A07(A0H, A0q), "AES/OFB/NoPadding");
            Cipher instance = Cipher.getInstance("AES/OFB/NoPadding");
            instance.init(1, secretKeySpec, new IvParameterSpec(A0H2));
            byte[] doFinal = instance.doFinal(bArr);
            bArr2 = new byte[(2 + A0H.length + A0H2.length + doFinal.length)];
            byte[][] bArr4 = new byte[4][];
            bArr4[0] = bArr3;
            C90464aC.A1D(A0H, A0H2, doFinal, bArr4);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[] bArr5 = bArr4[i2];
                System.arraycopy(bArr5, 0, bArr2, i3, bArr5.length);
                i3 += bArr5.length;
                i2++;
                if (i2 >= 4) {
                    break;
                }
            }
        } catch (Exception e) {
            Log.e("BackupTokenUtils/encrypt/unable to encrypt", e);
            bArr2 = null;
        }
        Log.i("BackupTokenUtils/encryptAndSaveToken/save token to LRUCache");
        int i4 = i;
        AnonymousClass166 A002 = A00(A05(context, i4));
        String A05 = C18750th.A05(str);
        if (!(TextUtils.isEmpty(A05) || bArr2 == null || bArr2.length == 0)) {
            A002.put(A05, bArr2);
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("BackupTokenUtils/encryptAndSaveToken/updated LRUCache size is ");
        C36321k7.A1Y(A0u2, A002.size());
        ByteArrayOutputStream A0Q = C90524aI.A0Q();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(A0Q);
        objectOutputStream.writeObject(A002);
        objectOutputStream.flush();
        byte[] byteArray = A0Q.toByteArray();
        if (!(byteArray == null || byteArray.length == 0)) {
            A03(context, r13, byteArray, i4);
        }
        long A003 = C19970wo.A00(r11);
        if (i4 == 2) {
            str2 = "backup_token_foa_file_timestamp";
        } else {
            str2 = "backup_token_file_timestamp";
        }
        r12.A1h(str2, A003);
    }

    public static byte[] A05(Context context, int i) {
        String str;
        byte[] A0J;
        File filesDir = context.getFilesDir();
        if (i == 2) {
            str = "foa_backup_token";
        } else {
            str = "backup_token";
        }
        File A0w = C36441kJ.A0w(filesDir, str);
        if (!A0w.exists()) {
            Log.i("BackupTokenUtils/getBackupTokenFromLocalFile/no content found");
            return null;
        }
        synchronized (A00) {
            A0J = C18750th.A0J(A0w);
        }
        return A0J;
    }

    public static byte[] A07(byte[] bArr, String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) bytes[i];
        }
        return C90494aF.A0m(C18750th.A08("PBKDF2WithHmacSHA1And8BIT", bArr, cArr, 16, 128).getEncoded()).getEncoded();
    }
}
