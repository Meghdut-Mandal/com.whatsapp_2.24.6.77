package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.0hZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C12140hZ implements Comparator {
    public final /* synthetic */ Comparator A00;

    public /* synthetic */ C12140hZ(Comparator comparator) {
        this.A00 = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        Comparator comparator = this.A00;
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        C04800Mb r0 = C04800Mb.A04;
        entry.getClass();
        entry2.getClass();
        return comparator.compare(entry.getKey(), entry2.getKey());
    }
}
