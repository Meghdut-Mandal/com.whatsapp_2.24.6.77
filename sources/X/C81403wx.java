package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.3wx  reason: invalid class name and case insensitive filesystem */
public final class C81403wx implements Comparator {
    public final Collator A00;

    public C81403wx(C18820ts r3) {
        Collator A0p = C36361kB.A0p(r3);
        A0p.setDecomposition(1);
        this.A00 = A0p;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C70243ep r4 = (C70243ep) obj;
        C70243ep r5 = (C70243ep) obj2;
        C36321k7.A0w(r4, r5);
        return this.A00.compare(r4.A00, r5.A00);
    }
}
