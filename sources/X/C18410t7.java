package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* renamed from: X.0t7  reason: invalid class name and case insensitive filesystem */
public class C18410t7 implements Comparator {
    public final int A00;

    public C18410t7(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        if (this.A00 != 0) {
            return ((AnonymousClass05Z) obj).A04 - ((AnonymousClass05Z) obj2).A04;
        }
        AnonymousClass0TL r5 = (AnonymousClass0TL) obj;
        AnonymousClass0TL r6 = (AnonymousClass0TL) obj2;
        RecyclerView recyclerView = r5.A03;
        if (AnonymousClass000.A1W(recyclerView) == AnonymousClass000.A1W(r6.A03)) {
            boolean z = r5.A04;
            if (z == r6.A04) {
                int i = r6.A02 - r5.A02;
                if (i != 0) {
                    return i;
                }
                int i2 = r5.A00 - r6.A00;
                if (i2 == 0) {
                    return 0;
                }
                return i2;
            } else if (z) {
                return -1;
            } else {
                return 1;
            }
        } else if (recyclerView == null) {
            return 1;
        } else {
            return -1;
        }
    }
}
