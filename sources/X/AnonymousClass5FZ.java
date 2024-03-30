package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.5FZ  reason: invalid class name */
public final class AnonymousClass5FZ extends C19580wB {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5FZ(AnonymousClass005 r2) {
        super(r2);
        AnonymousClass00C.A0D(r2, 1);
    }

    public void A01(List list) {
        AnonymousClass00C.A0D(list, 0);
        Iterator A0p = C90474aD.A0p(this);
        while (A0p.hasNext()) {
            ((AnonymousClass5FZ) A0p.next()).A01(list);
        }
    }

    public void A00() {
        Iterator A0p = C90474aD.A0p(this);
        while (A0p.hasNext()) {
            ((AnonymousClass5FZ) A0p.next()).A00();
        }
    }
}
