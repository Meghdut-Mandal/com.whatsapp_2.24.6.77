package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3S7  reason: invalid class name */
public final class AnonymousClass3S7 {
    public boolean A00;
    public boolean A01;
    public final C48002gX A02;
    public final C48012gY A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3S7) {
                AnonymousClass3S7 r5 = (AnonymousClass3S7) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A06, r5.A06) || this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A07 != r5.A07 || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A052 = C36351kA.A05(this.A05, C36391kE.A0A(this.A03));
        return ((((C36351kA.A05(this.A04, (C36351kA.A05(this.A06, A052) + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + C36341k9.A01(this.A07 ? 1 : 0)) * 31) + C36341k9.A01(this.A00 ? 1 : 0);
    }

    public AnonymousClass3S7(C48002gX r2, C48012gY r3, List list, List list2, List list3, boolean z, boolean z2, boolean z3) {
        C36321k7.A0z(list, list2);
        AnonymousClass00C.A0D(list3, 5);
        this.A03 = r3;
        this.A05 = list;
        this.A06 = list2;
        this.A01 = z;
        this.A04 = list3;
        this.A02 = r2;
        this.A07 = z2;
        this.A00 = z3;
    }

    public static final List A00(List list) {
        ArrayList A0J = C36321k7.A0J(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C48022gZ r1 = (C48022gZ) it.next();
            AnonymousClass141 A042 = r1.A00.A04();
            if (A042 == null) {
                A042 = r1.A00;
            }
            AnonymousClass00C.A0B(A042);
            A0J.add(new C48022gZ(r1.A01, A042, r1.A02, r1.A03, r1.A04, r1.A05));
        }
        return A0J;
    }

    public static final void A01(AnonymousClass141 r3, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C36411kG.A1V(r3, ((C48022gZ) obj).A00.A0H)) {
                break;
            }
        }
        C48022gZ r1 = (C48022gZ) obj;
        if (r1 != null) {
            r1.A00 = r3;
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StatusListUpdates(myStatus=");
        A0u.append(this.A03);
        A0u.append(", newUpdates=");
        A0u.append(this.A05);
        A0u.append(", viewedUpdates=");
        A0u.append(this.A06);
        A0u.append(", viewedStatusesExpanded=");
        A0u.append(this.A01);
        A0u.append(", mutedStatuses=");
        A0u.append(this.A04);
        A0u.append(", mutedStatusesEntrypoint=");
        A0u.append(this.A02);
        A0u.append(", inSearchMode=");
        A0u.append(this.A07);
        A0u.append(", mutedStatusesExpanded=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
