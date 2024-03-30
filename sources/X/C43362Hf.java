package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2Hf  reason: invalid class name and case insensitive filesystem */
public final class C43362Hf extends AnonymousClass2Fk {
    public final /* synthetic */ AnonymousClass2I3 A00;

    public void A0A(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass11F A0W = C36341k9.A0W(it);
            AnonymousClass2I3 r2 = this.A00;
            if (C36411kG.A1V(r2.A03, A0W)) {
                r2.A03 = r2.A1C.A01(C64933Qa.A01(r2.A0K));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43362Hf(AnonymousClass2I3 r1) {
        super(r1);
        this.A00 = r1;
    }

    public void A09(Collection collection) {
        if (collection != null) {
            AnonymousClass2I3 r1 = this.A00;
            if (C007103b.A0j(collection, r1.A03.A0H)) {
                r1.A1Y();
            }
        }
    }
}
