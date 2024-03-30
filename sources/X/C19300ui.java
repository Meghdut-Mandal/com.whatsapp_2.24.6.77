package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* renamed from: X.0ui  reason: invalid class name and case insensitive filesystem */
public final class C19300ui {
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0091, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0092, code lost:
        if (r7 != null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.C112945ei.A00.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009e, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a1, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ac, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass668 A00(android.content.Context r12, X.AnonymousClass668 r13, boolean r14) {
        /*
            java.lang.String r5 = "FirebaseInstanceId"
            r11 = 3
            boolean r0 = android.util.Log.isLoggable(r5, r11)
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = "Writing ID to properties file"
            android.util.Log.d(r5, r0)
        L_0x000e:
            java.util.Properties r8 = new java.util.Properties
            r8.<init>()
            java.lang.String r1 = r13.A01
            java.lang.String r0 = "id"
            r8.setProperty(r0, r1)
            long r0 = r13.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "cre"
            r8.setProperty(r0, r1)
            java.io.File r1 = A04(r12)
            r4 = 0
            r1.createNewFile()     // Catch:{ IOException -> 0x00ad }
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x00ad }
            r6.<init>(r1, r0)     // Catch:{ IOException -> 0x00ad }
            java.nio.channels.FileChannel r7 = r6.getChannel()     // Catch:{ all -> 0x009f }
            r7.lock()     // Catch:{ all -> 0x008f }
            r0 = 0
            if (r14 == 0) goto L_0x007e
            long r9 = r7.size()     // Catch:{ all -> 0x008f }
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x007e
            r7.position(r0)     // Catch:{ 0ue | IOException -> 0x0055 }
            X.668 r13 = A03(r7)     // Catch:{ 0ue | IOException -> 0x0055 }
            r7.close()     // Catch:{ all -> 0x009f }
            r6.close()     // Catch:{ IOException -> 0x00ad }
            return r13
        L_0x0055:
            r3 = move-exception
            boolean r2 = android.util.Log.isLoggable(r5, r11)     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x007e
            java.lang.String r9 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x008f }
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x008f }
            int r2 = r2.length()     // Catch:{ all -> 0x008f }
            int r2 = r2 + 58
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r3.<init>(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "Tried reading ID before writing new one, but failed with: "
            r3.append(r2)     // Catch:{ all -> 0x008f }
            r3.append(r9)     // Catch:{ all -> 0x008f }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x008f }
            android.util.Log.d(r5, r2)     // Catch:{ all -> 0x008f }
        L_0x007e:
            r7.truncate(r0)     // Catch:{ all -> 0x008f }
            java.io.OutputStream r0 = java.nio.channels.Channels.newOutputStream(r7)     // Catch:{ all -> 0x008f }
            r8.store(r0, r4)     // Catch:{ all -> 0x008f }
            r7.close()     // Catch:{ all -> 0x009f }
            r6.close()     // Catch:{ IOException -> 0x00ad }
            return r13
        L_0x008f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r2 = move-exception
            if (r7 == 0) goto L_0x009e
            r7.close()     // Catch:{ all -> 0x0098 }
            goto L_0x009e
        L_0x0098:
            r1 = move-exception
            X.5zb r0 = X.C112945ei.A00     // Catch:{ all -> 0x009f }
            r0.A00(r3, r1)     // Catch:{ all -> 0x009f }
        L_0x009e:
            throw r2     // Catch:{ all -> 0x009f }
        L_0x009f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x00a6 }
            goto L_0x00ac
        L_0x00a6:
            r1 = move-exception
            X.5zb r0 = X.C112945ei.A00     // Catch:{ IOException -> 0x00ad }
            r0.A00(r3, r1)     // Catch:{ IOException -> 0x00ad }
        L_0x00ac:
            throw r2     // Catch:{ IOException -> 0x00ad }
        L_0x00ad:
            r0 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r0 = r0.length()
            int r0 = r0 + 21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Failed to write key: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19300ui.A00(android.content.Context, X.668, boolean):X.668");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass668 A01(android.content.SharedPreferences r5) {
        /*
            java.lang.String r0 = "cre"
            java.lang.String r0 = X.C19290uh.A00(r0)
            r4 = 0
            java.lang.String r0 = r5.getString(r0, r4)
            if (r0 == 0) goto L_0x0012
            long r1 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0012 }
            goto L_0x0014
        L_0x0012:
            r1 = 0
        L_0x0014:
            java.lang.String r0 = "id"
            java.lang.String r0 = X.C19290uh.A00(r0)
            java.lang.String r3 = r5.getString(r0, r4)
            if (r3 != 0) goto L_0x0035
            java.lang.String r0 = "|P|"
            java.lang.String r0 = X.C19290uh.A00(r0)
            java.lang.String r0 = r5.getString(r0, r4)
            if (r0 != 0) goto L_0x002d
            return r4
        L_0x002d:
            java.security.PublicKey r0 = A05(r0)
            java.lang.String r3 = X.C19270uf.A02(r0)
        L_0x0035:
            X.668 r0 = new X.668
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19300ui.A01(android.content.SharedPreferences):X.668");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        if (r5 != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.C112945ei.A00.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0035, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0036, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0037, code lost:
        X.C112945ei.A00.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003c, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass668 A02(java.io.File r10) {
        /*
            java.io.FileInputStream r4 = new java.io.FileInputStream
            r4.<init>(r10)
            java.nio.channels.FileChannel r5 = r4.getChannel()     // Catch:{ all -> 0x002f }
            r6 = 0
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 1
            r5.lock(r6, r8, r10)     // Catch:{ all -> 0x001f }
            X.668 r0 = A03(r5)     // Catch:{ all -> 0x001f }
            r5.close()     // Catch:{ all -> 0x002f }
            r4.close()
            return r0
        L_0x001f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r2 = move-exception
            if (r5 == 0) goto L_0x002e
            r5.close()     // Catch:{ all -> 0x0028 }
            goto L_0x002e
        L_0x0028:
            r1 = move-exception
            X.5zb r0 = X.C112945ei.A00     // Catch:{ all -> 0x002f }
            r0.A00(r3, r1)     // Catch:{ all -> 0x002f }
        L_0x002e:
            throw r2     // Catch:{ all -> 0x002f }
        L_0x002f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x0036 }
            throw r2
        L_0x0036:
            r1 = move-exception
            X.5zb r0 = X.C112945ei.A00
            r0.A00(r3, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19300ui.A02(java.io.File):X.668");
    }

    public static AnonymousClass668 A03(FileChannel fileChannel) {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        try {
            long parseLong = Long.parseLong(properties.getProperty("cre"));
            String property = properties.getProperty(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            if (property == null) {
                String property2 = properties.getProperty("pub");
                if (property2 != null) {
                    property = C19270uf.A02(A05(property2));
                } else {
                    throw new C19260ue();
                }
            }
            return new AnonymousClass668(property, parseLong);
        } catch (NumberFormatException e) {
            throw new C19260ue(e);
        }
    }

    public static File A04(Context context) {
        String obj;
        if (TextUtils.isEmpty("")) {
            obj = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString("".getBytes(DefaultCrypto.UTF_8), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                obj = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        File A01 = AnonymousClass00E.A01(context);
        if (A01 == null || !A01.isDirectory()) {
            Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
            A01 = context.getFilesDir();
        }
        return new File(A01, obj);
    }

    public static PublicKey A05(String str) {
        try {
            try {
                return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                throw new C19260ue(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new C19260ue(e2);
        }
    }

    public static final void A06(Context context, AnonymousClass668 r4) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (r4.equals(A01(sharedPreferences))) {
                return;
            }
        } catch (C19260ue unused) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(C19290uh.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID), r4.A01);
        edit.putString(C19290uh.A00("cre"), String.valueOf(r4.A00));
        edit.commit();
    }

    public final AnonymousClass668 A07(Context context) {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
            AnonymousClass668 r4 = new AnonymousClass668(C19270uf.A02(instance.generateKeyPair().getPublic()), System.currentTimeMillis());
            AnonymousClass668 A00 = A00(context, r4, true);
            if (A00 == null || A00.equals(r4)) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Generated new key");
                }
                A06(context, r4);
                return r4;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
            }
            return A00;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
