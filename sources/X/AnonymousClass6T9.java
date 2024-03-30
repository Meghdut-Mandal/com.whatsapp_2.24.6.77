package X;

import android.content.Context;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.6T9  reason: invalid class name */
public class AnonymousClass6T9 {
    public Context A00;

    public String A02(String str) {
        Context context = this.A00;
        File A0w = C36441kJ.A0w(context.getFilesDir(), "__relative_root_1");
        File A0w2 = C36441kJ.A0w(context.getFilesDir(), "__relative_root_2");
        String A002 = A00(A0w, str);
        if (A002.equals(A00(A0w2, str))) {
            return A002;
        }
        throw C90524aI.A0X(AnonymousClass000.A0p("Invalid relative path: ", str, AnonymousClass000.A0u()));
    }

    public AnonymousClass6T9(Context context) {
        this.A00 = context;
    }

    public static String A00(File file, String str) {
        File canonicalFile = file.getCanonicalFile();
        File canonicalFile2 = C36441kJ.A0w(canonicalFile, str).getCanonicalFile();
        String path = canonicalFile.getPath();
        String path2 = canonicalFile2.getPath();
        if (!path2.startsWith(path)) {
            throw C90524aI.A0X(AnonymousClass000.A0p("Invalid relative path (escapes parent): ", path2, AnonymousClass000.A0u()));
        } else if (!path2.equals(path)) {
            String substring = path2.substring(path.length() + 1);
            if (substring.length() != 0) {
                return substring;
            }
            throw C90524aI.A0X(C36321k7.A0D("Invalid relative path (points to root): ", path2));
        } else {
            throw C90524aI.A0X(C36321k7.A0D("Invalid relative path (points to root): ", path2));
        }
    }

    public static void A01(CancellationSignal cancellationSignal, InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                cancellationSignal.throwIfCanceled();
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public void A03(CancellationSignal cancellationSignal, File file, File file2, byte[] bArr) {
        FileInputStream A0U;
        File canonicalFile = file.getCanonicalFile();
        File canonicalFile2 = file2.getCanonicalFile();
        if (!canonicalFile.equals(canonicalFile2)) {
            File parentFile = canonicalFile2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            if (!canonicalFile.renameTo(canonicalFile2)) {
                File canonicalFile3 = canonicalFile.getCanonicalFile();
                File canonicalFile4 = canonicalFile2.getCanonicalFile();
                if (!canonicalFile3.equals(canonicalFile4)) {
                    File parentFile2 = canonicalFile4.getParentFile();
                    if (parentFile2 != null) {
                        parentFile2.mkdirs();
                    }
                    try {
                        FileOutputStream A0W = C90524aI.A0W(canonicalFile4);
                        try {
                            A0U = C90524aI.A0U(canonicalFile3);
                            A01(cancellationSignal, A0U, A0W, bArr);
                            A0U.close();
                            A0W.close();
                        } catch (Throwable th) {
                            A0W.close();
                            throw th;
                        }
                    } catch (IOException e) {
                        canonicalFile4.delete();
                        throw e;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                canonicalFile.delete();
                return;
            }
            return;
        }
        return;
        throw th;
    }
}
