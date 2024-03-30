package X;

/* renamed from: X.3FS  reason: invalid class name */
public abstract class AnonymousClass3FS {
    public AnonymousClass21A A00(boolean z) {
        AnonymousClass217 r1;
        if (this instanceof AnonymousClass21A) {
            r1 = ((AnonymousClass21A) this).A00;
        } else {
            r1 = new AnonymousClass217(new C169748An(100), false, false, false);
        }
        return new AnonymousClass21A(r1, z);
    }

    public AnonymousClass3FS A01(AnonymousClass9QU r6, Boolean bool, Boolean bool2) {
        boolean z;
        boolean z2;
        if (!(this instanceof AnonymousClass21A)) {
            return null;
        }
        AnonymousClass21A r4 = (AnonymousClass21A) this;
        AnonymousClass217 r2 = r4.A00;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = r2.A03;
        }
        boolean z3 = r2.A02;
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = r2.A01;
        }
        if (r6 == null) {
            r6 = r2.A00;
        }
        return new AnonymousClass21A(new AnonymousClass217(r6, z, z3, z2), r4.A01);
    }
}
