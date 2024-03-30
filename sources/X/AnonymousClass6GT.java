package X;

import java.io.File;

/* renamed from: X.6GT  reason: invalid class name */
public abstract class AnonymousClass6GT {
    public static final boolean A01(File file) {
        if (file != null && file.exists()) {
            if (!file.isDirectory()) {
                return true;
            }
            String[] list = file.list();
            return (list == null || list.length == 0) ? false : true;
        }
    }

    public static final void A00(File file) {
        boolean isFile = file.isFile();
        boolean A01 = A01(file);
        if (isFile) {
            if (A01) {
                AnonymousClass00C.A0B(file);
            } else {
                return;
            }
        } else if (A01 && file.isDirectory()) {
            String[] list = file.list();
            if (list != null) {
                for (String A0w : list) {
                    A00(C36441kJ.A0w(file, A0w));
                }
            }
        } else {
            return;
        }
        file.delete();
    }
}
