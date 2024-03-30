package X;

import java.util.HashSet;

/* renamed from: X.1QW  reason: invalid class name */
public class AnonymousClass1QW {
    public C20500xf A00;
    public AnonymousClass005 A01;
    public Boolean A02;
    public final C20810yC A03;

    public HashSet A00() {
        String A09 = this.A03.A09(2246);
        if (A09 == null || A09.isEmpty()) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (String add : A09.split(":")) {
            hashSet.add(add);
        }
        return hashSet;
    }

    public boolean A01() {
        C20810yC r2 = this.A03;
        C21000yV r1 = C21000yV.A02;
        if (!C20800yB.A01(r1, r2, 1890) || !C20800yB.A01(r1, r2, 450)) {
            return false;
        }
        return true;
    }

    public boolean A02() {
        AnonymousClass005 r0;
        if (!C20800yB.A01(C21000yV.A02, this.A03, 450)) {
            return false;
        }
        if (!(this.A02 != null || (r0 = this.A01) == null || r0.get() == null)) {
            AnonymousClass1P6 r1 = (AnonymousClass1P6) this.A01.get();
            this.A02 = Boolean.valueOf(r1.A05(r1.A05.A00));
        }
        Boolean bool = this.A02;
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean A04() {
        C20810yC r2 = this.A03;
        C21000yV r1 = C21000yV.A02;
        if (!C20800yB.A01(r1, r2, 450) || !C20800yB.A01(r1, r2, 4690)) {
            return false;
        }
        return true;
    }

    public boolean A05() {
        C20810yC r2 = this.A03;
        C21000yV r1 = C21000yV.A02;
        if (!C20800yB.A01(r1, r2, 450) || !C20800yB.A01(r1, r2, 3587)) {
            return false;
        }
        return true;
    }

    public boolean A06() {
        C20810yC r2 = this.A03;
        C21000yV r1 = C21000yV.A02;
        if (!C20800yB.A01(r1, r2, 450) || !C20800yB.A01(r1, r2, 4492)) {
            return false;
        }
        return true;
    }

    public boolean A07() {
        C20810yC r2 = this.A03;
        C21000yV r1 = C21000yV.A02;
        if (!C20800yB.A01(r1, r2, 450) || !C20800yB.A01(r1, r2, 3984)) {
            return false;
        }
        return true;
    }

    public AnonymousClass1QW(C20810yC r1, C20500xf r2) {
        this.A03 = r1;
        this.A00 = r2;
    }

    public boolean A03() {
        if (A02()) {
            if (!C20800yB.A01(C21000yV.A02, this.A03, 4486)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
