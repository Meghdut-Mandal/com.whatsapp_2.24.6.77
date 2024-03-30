package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.76B  reason: invalid class name */
public final /* synthetic */ class AnonymousClass76B implements Comparator {
    public static final /* synthetic */ AnonymousClass76B A00 = new AnonymousClass76B();

    public final int compare(Object obj, Object obj2) {
        return Long.valueOf(((File) obj).lastModified()).compareTo(Long.valueOf(((File) obj2).lastModified()));
    }
}
