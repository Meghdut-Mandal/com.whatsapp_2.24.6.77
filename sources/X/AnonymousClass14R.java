package X;

import java.io.File;
import java.io.FileInputStream;

/* renamed from: X.14R  reason: invalid class name */
public abstract class AnonymousClass14R {
    public static byte[] A00(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] A04 = AnonymousClass14X.A04(fileInputStream);
            fileInputStream.close();
            return A04;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
