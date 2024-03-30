package X;

import java.util.List;

/* renamed from: X.6G4  reason: invalid class name */
public abstract class AnonymousClass6G4 {
    public static final void A00(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Index ");
            A0u.append(i);
            A0u.append(" is out of bounds. The list has ");
            A0u.append(size);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0q(" elements.", A0u));
        }
    }

    public static final void A01(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Indices are out of order. fromIndex (");
            A0u.append(i);
            A0u.append(") is greater than toIndex (");
            A0u.append(i2);
            throw AnonymousClass000.A0c(").", A0u);
        } else if (i < 0) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("fromIndex (");
            A0u2.append(i);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0q(") is less than 0.", A0u2));
        } else if (i2 > size) {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("toIndex (");
            A0u3.append(i2);
            A0u3.append(") is more than than the list size (");
            throw new IndexOutOfBoundsException(C36321k7.A0G(A0u3, size));
        }
    }
}
