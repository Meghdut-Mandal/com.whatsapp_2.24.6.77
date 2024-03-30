package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.75u  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1505775u implements Comparator {
    public static final /* synthetic */ C1505775u A00 = new C1505775u();

    public final int compare(Object obj, Object obj2) {
        try {
            return Integer.parseInt(((File) obj).getName().substring(8)) - Integer.parseInt(((File) obj2).getName().substring(8));
        } catch (Exception unused) {
            return 0;
        }
    }
}
