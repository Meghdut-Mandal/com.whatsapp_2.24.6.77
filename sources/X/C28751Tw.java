package X;

import java.util.Set;

/* renamed from: X.1Tw  reason: invalid class name and case insensitive filesystem */
public final class C28751Tw implements AnonymousClass04G {
    public final AnonymousClass08K A00;
    public final AnonymousClass04G A01;
    public final Set A02;

    public AnonymousClass04R B3o(Class cls) {
        if (this.A02.contains(cls.getName())) {
            return this.A00.B3o(cls);
        }
        return this.A01.B3o(cls);
    }

    public AnonymousClass04R B46(AnonymousClass04K r3, Class cls) {
        if (this.A02.contains(cls.getName())) {
            return this.A00.B46(r3, cls);
        }
        return this.A01.B46(r3, cls);
    }

    public C28751Tw(AnonymousClass04G r2, C28731Tu r3, Set set) {
        this.A02 = set;
        this.A01 = r2;
        this.A00 = new C28761Tx(r3, this);
    }
}
