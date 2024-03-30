package X;

import java.util.Set;

/* renamed from: X.6Kt  reason: invalid class name and case insensitive filesystem */
public final class C130356Kt {
    public Set A00 = C36441kJ.A17();
    public Set A01 = C36441kJ.A17();
    public Set A02 = C36441kJ.A17();
    public final AnonymousClass00S A03 = new C152027Ix(this);
    public final C006302t A04;

    public C130356Kt(C006302t r2) {
        this.A04 = r2;
    }

    public static final void A00(C130356Kt r2, Object obj, Set set) {
        if (set.add(obj) && r2.A02.size() + r2.A00.size() + r2.A01.size() == 1) {
            r2.A04.invoke(r2.A03);
        }
    }
}
