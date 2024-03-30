package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.72A  reason: invalid class name */
public final /* synthetic */ class AnonymousClass72A implements FilenameFilter {
    public static final /* synthetic */ AnonymousClass72A A00 = new AnonymousClass72A();

    public final boolean accept(File file, String str) {
        AnonymousClass00C.A0B(str);
        AnonymousClass00C.A0D(str, 0);
        return str.endsWith(".json");
    }
}
