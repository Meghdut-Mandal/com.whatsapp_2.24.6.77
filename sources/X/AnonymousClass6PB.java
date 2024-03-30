package X;

import java.util.List;

/* renamed from: X.6PB  reason: invalid class name */
public final class AnonymousClass6PB {
    public final List A00;
    public final List A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6PB) {
                AnonymousClass6PB r5 = (AnonymousClass6PB) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, C36351kA.A05(this.A01, C36391kE.A0A(this.A00)));
    }

    public AnonymousClass6PB(List list, List list2, List list3) {
        this.A00 = list;
        this.A01 = list2;
        this.A02 = list3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NativeContactsData(nativeContactsAdded=");
        A0u.append(this.A00);
        A0u.append(", nativeContactsRemoved=");
        A0u.append(this.A01);
        A0u.append(", unChangedContacts=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }

    public AnonymousClass6PB() {
        this(AnonymousClass001.A0I(), AnonymousClass001.A0I(), AnonymousClass001.A0I());
    }
}
