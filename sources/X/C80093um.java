package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.3um  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80093um implements FileFilter {
    public static final /* synthetic */ C80093um A00 = new C80093um();

    public final boolean accept(File file) {
        if (!file.isFile()) {
            return false;
        }
        AnonymousClass1GW.A0N(AnonymousClass6YY.A07(file.getAbsolutePath()));
        try {
            if (file.isHidden() || !file.canRead()) {
                return false;
            }
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
