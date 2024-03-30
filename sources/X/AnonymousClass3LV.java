package X;

import java.io.File;

/* renamed from: X.3LV  reason: invalid class name */
public abstract class AnonymousClass3LV {
    public static final String A00(C133346Xy r9) {
        int length;
        int length2;
        File[] listFiles = ((File) r9.A06.getValue()).listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            return "stagingAccountFolders null or empty";
        }
        String str = "";
        int i = 0;
        do {
            File file = listFiles[i];
            StringBuilder A0u = AnonymousClass000.A0u();
            String name = file.getName();
            AnonymousClass00C.A08(name);
            A0u.append(A01(name));
            String A0q = AnonymousClass000.A0q(" ->", A0u);
            File[] listFiles2 = file.listFiles();
            if (listFiles2 == null || (length2 = listFiles2.length) == 0) {
                A0q = AnonymousClass000.A0q("stagingAccountFiles null or empty", AnonymousClass000.A0v(A0q));
            } else {
                int i2 = 0;
                do {
                    File file2 = listFiles2[i2];
                    StringBuilder A0v = AnonymousClass000.A0v(A0q);
                    A0v.append(' ');
                    A0q = AnonymousClass000.A0q(file2.getName(), A0v);
                    i2++;
                } while (i2 < length2);
            }
            str = AnonymousClass000.A0t(C36331k8.A0k(str, A0q), 10);
            i++;
        } while (i < length);
        return str;
    }

    public static final String A01(String str) {
        String A0B = AnonymousClass14B.A0B(str, 8);
        if (A0B != null) {
            return A0B;
        }
        return str;
    }
}
