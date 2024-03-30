package X;

/* renamed from: X.6Ub  reason: invalid class name and case insensitive filesystem */
public class C132516Ub {
    public int A00;
    public final int A01;
    public final AnonymousClass6YX A02;

    public static Object A00(C132516Ub r4, int i) {
        int i2 = r4.A00;
        boolean z = true;
        if (C36381kD.A1U(i2, -1)) {
            if (i >= i2) {
                z = false;
            }
            AnonymousClass5ZO.A00(z, "invalid instr stack argument");
            return r4.A02.A05[r4.A01 + i];
        }
        throw AnonymousClass001.A09("InstrStackArgs is not initialized");
    }

    public static void A01(C132516Ub r4, Object obj) {
        int i = r4.A00;
        if (C36381kD.A1U(i, -1)) {
            AnonymousClass6YX r0 = r4.A02;
            r0.A0Z(i);
            AnonymousClass6YX.A0M(r0, obj);
            r4.A00 = -1;
            return;
        }
        throw AnonymousClass001.A09("InstrStackArgs is not initialized");
    }

    public static boolean A02(double d) {
        double floor;
        if (d < 0.0d) {
            floor = Math.ceil(d);
        } else {
            floor = Math.floor(d);
        }
        return AnonymousClass000.A1Q((floor > d ? 1 : (floor == d ? 0 : -1)));
    }

    public C132516Ub(AnonymousClass6YX r3, int i) {
        int i2;
        this.A02 = r3;
        this.A00 = i;
        if (i > 0) {
            i2 = (r3.A01 - 1) - (i - 1);
        } else {
            i2 = -1;
        }
        this.A01 = i2;
    }
}
