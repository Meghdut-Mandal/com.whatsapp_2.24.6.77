package X;

import java.util.Set;

/* renamed from: X.1Fz  reason: invalid class name and case insensitive filesystem */
public final class C25361Fz {
    public final AnonymousClass005 A00;
    public final AnonymousClass00T A01;

    public C25361Fz(AnonymousClass17B r3, AnonymousClass005 r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        this.A00 = r4;
        this.A01 = new AnonymousClass00U(new AnonymousClass1G0(r3));
    }

    public final boolean A00(AnonymousClass3T1 r5) {
        if (!r5.A1G() || r5.A15) {
            return false;
        }
        for (C88864Ui BMD : (Set) this.A00.get()) {
            if (AnonymousClass00C.A0J(BMD.BMD(r5), false)) {
                return false;
            }
        }
        return ((AnonymousClass4VB) ((AnonymousClass9XG) this.A01.getValue()).A00(r5.A1I)).BME(r5);
    }

    public final boolean A01(AnonymousClass3T1 r5) {
        AnonymousClass00C.A0D(r5, 0);
        if (r5.A1J.A02 && AnonymousClass3TJ.A00(r5.A0D, 4) < 0) {
            return false;
        }
        for (C88864Ui BMs : (Set) this.A00.get()) {
            if (AnonymousClass00C.A0J(BMs.BMs(r5), false)) {
                return false;
            }
        }
        return ((AnonymousClass4VB) ((AnonymousClass9XG) this.A01.getValue()).A00(r5.A1I)).BMt(r5);
    }

    public final boolean A02(AnonymousClass3T1 r5) {
        if (!r5.A1J.A02) {
            for (C88864Ui BN2 : (Set) this.A00.get()) {
                if (AnonymousClass00C.A0J(BN2.BN2(r5), false)) {
                }
            }
            return ((AnonymousClass4VB) ((AnonymousClass9XG) this.A01.getValue()).A00(r5.A1I)).BN3(r5);
        }
        return false;
    }

    public final boolean A03(AnonymousClass3T1 r5) {
        AnonymousClass00C.A0D(r5, 0);
        for (C88864Ui BNF : (Set) this.A00.get()) {
            if (AnonymousClass00C.A0J(BNF.BNF(r5), false)) {
                return false;
            }
        }
        return ((AnonymousClass4VB) ((AnonymousClass9XG) this.A01.getValue()).A00(r5.A1I)).BNG(r5);
    }

    public final boolean A04(AnonymousClass3T1 r5) {
        AnonymousClass00C.A0D(r5, 0);
        for (C88864Ui BNI : (Set) this.A00.get()) {
            if (AnonymousClass00C.A0J(BNI.BNI(r5), false)) {
                return false;
            }
        }
        return ((AnonymousClass4VB) ((AnonymousClass9XG) this.A01.getValue()).A00(r5.A1I)).BNJ(r5);
    }
}
