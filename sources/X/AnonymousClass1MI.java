package X;

/* renamed from: X.1MI  reason: invalid class name */
public abstract class AnonymousClass1MI {
    public static final boolean A02(C20810yC r2, C21000yV r3, int i) {
        boolean A01;
        boolean z = false;
        if (r2 != null) {
            z = C20800yB.A01(C21000yV.A02, r2, 3908);
        }
        if (!z) {
            return false;
        }
        if (r3 == null) {
            if (r2 == null) {
                return false;
            }
            A01 = C20800yB.A01(C21000yV.A02, r2, i);
        } else if (r2 == null) {
            return false;
        } else {
            A01 = C20800yB.A01(r3, r2, i);
        }
        Boolean valueOf = Boolean.valueOf(A01);
        if (valueOf == null || !valueOf.booleanValue()) {
            return false;
        }
        return true;
    }

    public static final boolean A00(C20810yC r2) {
        return A02(r2, C21000yV.A01, 5332);
    }

    public static final boolean A01(C20810yC r2) {
        if (!C19550w8.A00() || !A02(r2, (C21000yV) null, 4630)) {
            return false;
        }
        return true;
    }
}
