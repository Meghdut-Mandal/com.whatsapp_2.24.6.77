package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.5Jp  reason: invalid class name and case insensitive filesystem */
public class C106415Jp extends C132056Ry {
    public final long A00;
    public final AnonymousClass141 A01;
    public final Set A02;

    public C106415Jp(AnonymousClass141 r3, Set set, long j) {
        super(r3.A0H, 25);
        HashSet A16 = C36441kJ.A16();
        this.A02 = A16;
        this.A01 = r3;
        this.A00 = j;
        if (set != null) {
            A16.addAll(set);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C106415Jp r7 = (C106415Jp) obj;
            if (this.A00 == r7.A00 && this.A01.equals(r7.A01)) {
                return this.A02.equals(r7.A02);
            }
        }
        return false;
    }

    public int hashCode() {
        return C36321k7.A00(this.A00, C36391kE.A0A(this.A01)) + this.A02.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SearchResult{group=");
        A0u.append(this.A01);
        A0u.append(", lastMessageTimestamp=");
        A0u.append(this.A00);
        A0u.append(", matchingContact=");
        return C90464aC.A0X(this.A02, A0u);
    }
}
