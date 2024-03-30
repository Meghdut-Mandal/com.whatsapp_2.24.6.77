package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.3wz  reason: invalid class name and case insensitive filesystem */
public class C81423wz implements Comparator {
    public final Collator A00;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return this.A00.compare(((C65643Sx) obj).A03(), ((C65643Sx) obj2).A03());
    }

    public C81423wz(C18820ts r3) {
        Collator A0p = C36361kB.A0p(r3);
        this.A00 = A0p;
        A0p.setDecomposition(1);
    }
}
