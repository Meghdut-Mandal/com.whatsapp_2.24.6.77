package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.75z  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1506275z implements Comparator {
    public static final /* synthetic */ C1506275z A00 = new C1506275z();

    public final int compare(Object obj, Object obj2) {
        return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
    }
}
