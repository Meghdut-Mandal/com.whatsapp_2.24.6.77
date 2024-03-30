package X;

/* renamed from: X.0A3  reason: invalid class name */
public abstract class AnonymousClass0A3 {
    public static final C005102h A00(C005102h r4, C005102h r5, boolean z) {
        AnonymousClass0A4 r1 = AnonymousClass0A4.A00;
        boolean booleanValue = ((Boolean) r4.fold(false, r1)).booleanValue();
        boolean booleanValue2 = ((Boolean) r5.fold(false, r1)).booleanValue();
        if (booleanValue || booleanValue2) {
            C10810fG r3 = new C10810fG();
            r3.element = r5;
            C008903u r2 = C008903u.A00;
            r4 = (C005102h) r4.fold(r2, new C14820mF(r3, z));
            if (booleanValue2) {
                r3.element = ((C005102h) r3.element).fold(r2, C14840mH.A00);
            }
            r5 = (C005102h) r3.element;
        }
        return r4.plus(r5);
    }

    public static final C15510nS A02(Object obj, C023509x r3, C005102h r4) {
        C15510nS r1 = null;
        if ((r3 instanceof C023609y) && r4.get(C12610iN.A00) != null) {
            C023609y r32 = (C023609y) r3;
            while (true) {
                if ((r32 instanceof C15520nT) || (r32 = r32.getCallerFrame()) == null) {
                    break;
                } else if (r32 instanceof C15510nS) {
                    C15510nS r33 = (C15510nS) r32;
                    r1 = r33;
                    if (r33 != null) {
                        r33.A11(obj, r4);
                    }
                }
            }
        }
        return r1;
    }

    public static final C005102h A01(C005102h r2, AnonymousClass040 r3) {
        C005102h A00 = A00(r3.BAE(), r2, true);
        C005502l r1 = C006702x.A00;
        if (A00 == r1 || A00.get(C005402k.A00) != null) {
            return A00;
        }
        return A00.plus(r1);
    }
}
