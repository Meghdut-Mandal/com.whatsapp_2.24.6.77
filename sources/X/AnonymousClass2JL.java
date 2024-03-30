package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2JL  reason: invalid class name */
public final class AnonymousClass2JL extends C70763fg {
    public final C19730wQ A00;

    public boolean BtJ(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        if (!super.BtJ(collection) || this.A00.A0L()) {
            return false;
        }
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (C66013Ui.A0n(C36391kE.A0l(it))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2JL(C19730wQ r1, AnonymousClass3O0 r2) {
        super(r2);
        C36321k7.A0x(r2, r1);
        this.A00 = r1;
    }
}
