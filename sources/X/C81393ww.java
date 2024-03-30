package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.3ww  reason: invalid class name and case insensitive filesystem */
public class C81393ww implements Comparator {
    public final Collator A00;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = ((C62583Gs) obj).A06;
        String str2 = ((C62583Gs) obj2).A06;
        if (str == null) {
            if (str2 == null) {
                return 0;
            }
            return 1;
        } else if (str2 == null) {
            return -1;
        } else {
            return this.A00.compare(str, str2);
        }
    }

    public C81393ww(C18820ts r3) {
        Collator A0p = C36361kB.A0p(r3);
        this.A00 = A0p;
        A0p.setDecomposition(1);
    }
}
