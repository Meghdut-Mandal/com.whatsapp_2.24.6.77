package X;

import android.view.View;
import java.util.Comparator;

/* renamed from: X.05Y  reason: invalid class name */
public class AnonymousClass05Y implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C02390Ac r1 = (C02390Ac) ((View) obj).getLayoutParams();
        C02390Ac r3 = (C02390Ac) ((View) obj2).getLayoutParams();
        boolean z = r1.A05;
        if (z == r3.A05) {
            return r1.A04 - r3.A04;
        }
        if (z) {
            return 1;
        }
        return -1;
    }
}
