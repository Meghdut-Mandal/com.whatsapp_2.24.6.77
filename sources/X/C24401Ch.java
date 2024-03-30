package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.1Ch  reason: invalid class name and case insensitive filesystem */
public class C24401Ch {
    public final C24411Ci A00;
    public final C21060yb A01;
    public final C19630wG A02;
    public final C19420v0 A03;
    public final C20840yF A04;

    public static int A00(C24401Ch r3, File file, FileDescriptor fileDescriptor) {
        FileInputStream fileInputStream;
        Log.i("MigrateFileDirectlyHelper/replaceFile");
        try {
            AnonymousClass5RK r32 = new AnonymousClass5RK(r3.A04.A00, file);
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                AnonymousClass6YY.A0K(fileInputStream.getChannel(), Channels.newChannel(r32));
                r32.close();
                fileInputStream.close();
                r32.close();
                return 19;
            } catch (Throwable th) {
                r32.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("MigrateFileDirectlyHelper/replaceFile/error while moving file. File to replace is ");
            sb.append(file.toString());
            sb.append(" error message is: ");
            sb.append(e);
            Log.e(sb.toString());
            if (e.getMessage() == null || !e.getMessage().contains("No space")) {
                return 15;
            }
            return 5;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public static Uri A01(String str, String str2, String str3) {
        Uri.Builder appendPath = new Uri.Builder().scheme("content").authority("com.whatsapp.provider.MigrationContentProvider").appendPath(str);
        if (str2 != null) {
            appendPath.appendQueryParameter("query_param_country_code", str2);
        }
        if (str3 != null) {
            appendPath.appendQueryParameter("query_param_phone_number", str3);
        }
        return appendPath.build();
    }

    public int A03(File file, String str) {
        ParcelFileDescriptor A05;
        C19420v0 r0 = this.A03;
        String A0f = r0.A0f();
        String A0h = r0.A0h();
        StringBuilder sb = new StringBuilder();
        sb.append("MigrateFileDirectlyHelper/migrateFile/registered cc is ");
        sb.append(A0f);
        sb.append(" phone number");
        sb.append(AnonymousClass14B.A09('*', A0h));
        Log.i(sb.toString());
        try {
            A05 = this.A01.A0O().A05(A01(str, A0f, A0h), "r");
            if (A05 != null) {
                if (A05.getFileDescriptor() != null) {
                    int A002 = A00(this, file, A05.getFileDescriptor());
                    A05.close();
                    return A002;
                }
            }
            Log.i("MigrateFileDirectlyHelper/migrateFile/consumer file is null");
            if (A05 == null) {
                return 15;
            }
            A05.close();
            return 15;
        } catch (IOException | SecurityException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MigrateFileDirectlyHelper/migrateFile/error while fetching internal file: ");
            sb2.append(str);
            sb2.append(" from consumer app. error message is: ");
            sb2.append(e);
            Log.e(sb2.toString());
            return 15;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public C24401Ch(C24411Ci r1, C21060yb r2, C19630wG r3, C19420v0 r4, C20840yF r5) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
    }

    public static byte[] A02(Bundle bundle, String str, byte[] bArr) {
        byte[] byteArray = bundle.getByteArray(str);
        if (byteArray == null) {
            Log.e("MigrateFileDirectlyHelper/getEncryptedData erk is null");
            return null;
        }
        try {
            PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArr));
            Cipher instance = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            instance.init(2, generatePrivate);
            return instance.doFinal(byteArray);
        } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            Log.e("MigrateFileDirectlyHelper/getEncryptedData failed to decrypt erk");
            return null;
        }
    }
}
