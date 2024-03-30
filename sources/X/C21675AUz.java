package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.AUz  reason: case insensitive filesystem */
public class C21675AUz implements Iterable, B0L {
    public Collection A00;

    public ArrayList BDp(B6O b6o) {
        if (b6o == null) {
            return C36441kJ.A15(this.A00);
        }
        ArrayList A0I = AnonymousClass001.A0I();
        for (Object next : this.A00) {
            if (b6o.BPQ(next)) {
                A0I.add(next);
            }
        }
        return A0I;
    }

    public Iterator iterator() {
        return C90474aD.A0r(this.A00);
    }

    public C21675AUz(B0L b0l) {
        this.A00 = C36441kJ.A15(b0l.BDp((B6O) null));
    }
}
