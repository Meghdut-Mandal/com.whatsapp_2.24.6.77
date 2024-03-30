package X;

import android.util.Pair;
import java.util.Comparator;

/* renamed from: X.76F  reason: invalid class name */
public final /* synthetic */ class AnonymousClass76F implements Comparator {
    public static final /* synthetic */ AnonymousClass76F A00 = new AnonymousClass76F();

    public final int compare(Object obj, Object obj2) {
        return ((Integer) ((Pair) obj2).second).compareTo((Integer) ((Pair) obj).second);
    }
}
