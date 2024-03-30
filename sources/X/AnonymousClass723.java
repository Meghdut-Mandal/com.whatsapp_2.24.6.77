package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.723  reason: invalid class name */
public final /* synthetic */ class AnonymousClass723 implements FilenameFilter {
    public static final /* synthetic */ AnonymousClass723 A00 = new AnonymousClass723();

    public final boolean accept(File file, String str) {
        if (!str.startsWith("os_stacktrace_") || !str.endsWith(".stacktrace")) {
            return false;
        }
        return true;
    }
}
