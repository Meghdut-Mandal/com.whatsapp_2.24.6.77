package X;

import android.view.View;
import java.util.Comparator;

/* renamed from: X.0Ag  reason: invalid class name and case insensitive filesystem */
public class C02420Ag implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        float A00 = A00((View) obj);
        float A002 = A00((View) obj2);
        if (A00 > A002) {
            return -1;
        }
        if (A00 < A002) {
            return 1;
        }
        return 0;
    }

    public static float A00(View view) {
        return view.getZ();
    }
}
