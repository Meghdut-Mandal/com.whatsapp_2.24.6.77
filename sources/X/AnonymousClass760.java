package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.760  reason: invalid class name */
public final /* synthetic */ class AnonymousClass760 implements Comparator {
    public static final /* synthetic */ AnonymousClass760 A00 = new AnonymousClass760();

    public final int compare(Object obj, Object obj2) {
        return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
    }
}
