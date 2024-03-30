package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.3wv  reason: invalid class name and case insensitive filesystem */
public class C81383wv implements Comparator {
    public final Collator A00;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        Integer A01 = C63693La.A01(str, str2);
        if (A01 == null) {
            return this.A00.compare(str, str2);
        }
        return A01.intValue();
    }

    public C81383wv(C18820ts r3) {
        Collator A0p = C36361kB.A0p(r3);
        this.A00 = A0p;
        A0p.setDecomposition(1);
    }
}
