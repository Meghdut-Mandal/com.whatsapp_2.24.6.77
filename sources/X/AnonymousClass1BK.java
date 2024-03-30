package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.1BK  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1BK implements Comparator {
    public static final /* synthetic */ AnonymousClass1BK A00 = new AnonymousClass1BK();

    public final int compare(Object obj, Object obj2) {
        return ((File) obj).getName().substring(0, 2).compareTo(((File) obj2).getName().substring(0, 2));
    }
}
