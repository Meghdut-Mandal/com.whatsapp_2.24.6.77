package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.9ii  reason: invalid class name and case insensitive filesystem */
public class C201059ii {
    public final AnonymousClass9Bb A00;

    public File A02(C188618zt r6, InputStream inputStream, String str) {
        FileOutputStream fileOutputStream;
        File A0w = C36441kJ.A0w(A00(this), A01(r6, str, true));
        try {
            fileOutputStream = new FileOutputStream(A0w);
            byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return A0w;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    public static File A00(C201059ii r1) {
        File A0w = C36441kJ.A0w(r1.A00.A00.getCacheDir(), "lottie_network_cache");
        if (A0w.isFile()) {
            A0w.delete();
        }
        if (!A0w.exists()) {
            A0w.mkdirs();
        }
        return A0w;
    }

    public static String A01(C188618zt r5, String str, boolean z) {
        String str2;
        if (z) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(".temp");
            str2 = AnonymousClass000.A0q(r5.extension, A0u);
        } else {
            str2 = r5.extension;
        }
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (replaceAll.length() > length) {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(replaceAll.getBytes());
                StringBuilder A0u2 = AnonymousClass000.A0u();
                for (byte valueOf : digest) {
                    Object[] A0L = AnonymousClass001.A0L();
                    A0L[0] = Byte.valueOf(valueOf);
                    A0u2.append(String.format("%02x", A0L));
                }
                replaceAll = A0u2.toString();
            } catch (NoSuchAlgorithmException unused) {
                replaceAll = replaceAll.substring(0, length);
            }
        }
        StringBuilder A0u3 = AnonymousClass000.A0u();
        AnonymousClass000.A1D("lottie_cache_", replaceAll, str2, A0u3);
        return A0u3.toString();
    }

    public C201059ii(AnonymousClass9Bb r1) {
        this.A00 = r1;
    }
}
