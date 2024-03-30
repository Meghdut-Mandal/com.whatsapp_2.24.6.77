package X;

import java.util.Comparator;

/* renamed from: X.3wy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C81413wy implements Comparator {
    public final /* synthetic */ boolean A00;

    public /* synthetic */ C81413wy(boolean z) {
        this.A00 = z;
    }

    public final int compare(Object obj, Object obj2) {
        boolean z = this.A00;
        int compare = Long.compare(((AnonymousClass3LF) obj).A00.A0I, ((AnonymousClass3LF) obj2).A00.A0I);
        if (z) {
            return -compare;
        }
        return compare;
    }
}
