package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.1K1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1K1 implements FileFilter {
    public static final /* synthetic */ AnonymousClass1K1 A00 = new AnonymousClass1K1();

    public final boolean accept(File file) {
        String name = file.getName();
        if (!name.startsWith("cpu")) {
            return false;
        }
        for (int i = 3; i < name.length(); i++) {
            if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
