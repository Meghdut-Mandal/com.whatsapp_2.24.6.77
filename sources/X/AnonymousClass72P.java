package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.72P  reason: invalid class name */
public class AnonymousClass72P implements Cloneable {
    public final AnonymousClass16D A00;
    public final AnonymousClass171 A01;
    public final C20810yC A02;
    public final ArrayList A03 = AnonymousClass001.A0I();
    public final C19970wo A04;

    public int A00() {
        ArrayList arrayList = this.A03;
        if (arrayList.isEmpty()) {
            return 3;
        }
        C107265Nh r2 = (C107265Nh) arrayList.get(0);
        if (r2.A0C != null) {
            if (r2.A07 == 5) {
                return 4;
            }
            return 5;
        } else if (r2.A04.A03) {
            return 0;
        } else {
            if (r2.A07 == 5 || r2.A07 == 6) {
                return 1;
            }
            return 2;
        }
    }

    public long A01() {
        ArrayList arrayList = this.A03;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return this.A04.A08(((C107265Nh) C36441kJ.A12(arrayList)).A01);
    }

    public AnonymousClass141 A02() {
        ArrayList arrayList = this.A03;
        if (!arrayList.isEmpty()) {
            return this.A00.A0D(((C107265Nh) C36441kJ.A12(arrayList)).A04.A01);
        }
        return null;
    }

    public String A03() {
        ArrayList arrayList = this.A03;
        if (arrayList.isEmpty()) {
            return null;
        }
        C107265Nh r1 = (C107265Nh) C36441kJ.A12(arrayList);
        boolean A0M = r1.A0M();
        StringBuilder A0u = AnonymousClass000.A0u();
        if (A0M) {
            A0u.append("G:");
            C135006by r12 = r1.A04;
            A0u.append(AnonymousClass143.A03(r12.A01));
            A0u.append(r12.A03);
            A0u.append(r12.A02);
            A0u.append(r12.A00);
        } else {
            A0u.append("O:");
            A0u.append(AnonymousClass143.A03(r1.A04.A01));
            A0u.append(r1.A01);
        }
        return A0u.toString();
    }

    public boolean A04() {
        ArrayList arrayList = this.A03;
        if (arrayList.isEmpty() || !((C107265Nh) arrayList.get(0)).A0M()) {
            return false;
        }
        return true;
    }

    public boolean A05() {
        ArrayList arrayList = this.A03;
        if (arrayList.isEmpty() || !((C107265Nh) arrayList.get(0)).A0O()) {
            return false;
        }
        return true;
    }

    public boolean A06() {
        ArrayList arrayList = this.A03;
        if (arrayList.isEmpty() || !((C107265Nh) arrayList.get(0)).A0P()) {
            return false;
        }
        return true;
    }

    public boolean A07() {
        ArrayList arrayList = this.A03;
        if (arrayList.isEmpty() || !((C107265Nh) arrayList.get(0)).A0Q()) {
            return false;
        }
        return true;
    }

    public boolean A08() {
        ArrayList arrayList = this.A03;
        if (arrayList.isEmpty() || !((C107265Nh) arrayList.get(0)).A0K) {
            return false;
        }
        return true;
    }

    public boolean A09(C107265Nh r7, boolean z) {
        Object obj;
        Object obj2;
        ArrayList arrayList = this.A03;
        if (arrayList.isEmpty()) {
            return true;
        }
        C107265Nh r4 = (C107265Nh) arrayList.get(arrayList.size() - 1);
        if ((z || (!r7.A0M() && !r4.A0M())) && AnonymousClass6XI.A04(r7.A01, r4.A01)) {
            if (z) {
                obj = r7.A0D;
                obj2 = r4.A0D;
            } else {
                obj = r7.A04.A01;
                obj2 = r4.A04.A01;
            }
            if (C1901797e.A00(obj, obj2) && C1901797e.A00(r7.A0F, r4.A0F) && r7.A0R() == r4.A0R() && r7.A0K == r4.A0K && r7.A0P() == r4.A0P() && r7.A0O() == r4.A0O() && ((r7.A0Q() == r4.A0Q() || !this.A02.A0E(6307)) && C1901797e.A00(r7.A0G, r4.A0G))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public Object clone() {
        AnonymousClass72P r3 = new AnonymousClass72P(this.A00, this.A01, this.A04, this.A02);
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            r3.A03.add(((C107265Nh) it.next()).clone());
        }
        return r3;
    }

    public String toString() {
        AnonymousClass141 A022;
        if (this.A03.isEmpty() || (A022 = A02()) == null) {
            return null;
        }
        return this.A01.A0H(A022);
    }

    public AnonymousClass72P(AnonymousClass16D r2, AnonymousClass171 r3, C19970wo r4, C20810yC r5) {
        this.A04 = r4;
        this.A02 = r5;
        this.A00 = r2;
        this.A01 = r3;
    }
}
