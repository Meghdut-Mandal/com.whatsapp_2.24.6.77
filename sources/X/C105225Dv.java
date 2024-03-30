package X;

import java.util.AbstractCollection;

/* renamed from: X.5Dv  reason: invalid class name and case insensitive filesystem */
public class C105225Dv extends AnonymousClass5EQ {
    public final int A00;
    public final C160727lU A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && super.equals(obj) && this.A00 == ((C105225Dv) obj).A00;
        }
        return true;
    }

    public C105225Dv(C160727lU r2, int i) {
        super(16);
        this.A00 = i;
        this.A01 = r2;
    }

    public static void A00(C160727lU r1, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C105225Dv(r1, i));
    }
}
