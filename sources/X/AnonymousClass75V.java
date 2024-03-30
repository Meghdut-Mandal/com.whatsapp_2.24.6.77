package X;

import java.util.Comparator;

/* renamed from: X.75V  reason: invalid class name */
public final class AnonymousClass75V implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass68B r4 = (AnonymousClass68B) obj;
        AnonymousClass68B r5 = (AnonymousClass68B) obj2;
        if (r4 == null || r5 == null) {
            return 0;
        }
        boolean z = r4.A0R;
        if (!(r5.A0R ^ z)) {
            return r5.A00 - r4.A00;
        }
        if (z) {
            return -1;
        }
        return 1;
    }
}
