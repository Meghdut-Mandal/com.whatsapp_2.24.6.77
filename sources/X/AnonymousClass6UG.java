package X;

import android.util.Base64;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.6UG  reason: invalid class name */
public abstract class AnonymousClass6UG {
    public static String A01(File file, MessageDigest messageDigest) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(AnonymousClass1GW.A0J(file));
        try {
            A03(bufferedInputStream, messageDigest);
            String encodeToString = Base64.encodeToString(messageDigest.digest(), 2);
            bufferedInputStream.close();
            return encodeToString;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public static void A03(InputStream inputStream, MessageDigest messageDigest) {
        byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                messageDigest.update(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static String A00(File file) {
        try {
            return A01(file, C90504aG.A0s());
        } catch (NoSuchAlgorithmException e) {
            throw new IOException(e);
        }
    }

    public static String A02(InputStream inputStream) {
        MessageDigest A0s = C90504aG.A0s();
        A03(inputStream, A0s);
        return C36441kJ.A13(A0s.digest());
    }
}
