package X;

/* renamed from: X.2tl  reason: invalid class name and case insensitive filesystem */
public abstract class C54912tl {
    public static final boolean A00(C20810yC r4, AnonymousClass3T1 r5, C46812bi r6, boolean z) {
        boolean A1O;
        boolean A1O2;
        C46812bi r1;
        C65013Qj r0;
        AnonymousClass00C.A0D(r4, 0);
        if (!(r5 instanceof C46812bi) || (r5 instanceof C46802bh)) {
            return false;
        }
        if (r4.A0E(1040)) {
            A1O = r6.A1l();
            C46812bi r12 = (C46812bi) r5;
            A1O2 = r12.A1l();
            r1 = r12;
        } else {
            A1O = AnonymousClass000.A1O(r6.A09);
            AnonymousClass2bU r13 = (AnonymousClass2bU) r5;
            A1O2 = AnonymousClass000.A1O(r13.A09);
            r1 = r13;
        }
        if (!A1O || !A1O2) {
            return false;
        }
        if ((z || !r5.A1J.A02 || r6.A1J.A02) && (r0 = r1.A01) != null && r0.A0I != null && C66013Ui.A10((AnonymousClass2bU) r5)) {
            return true;
        }
        return false;
    }
}
