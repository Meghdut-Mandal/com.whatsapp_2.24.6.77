package X;

/* renamed from: X.4Vf  reason: invalid class name and case insensitive filesystem */
public class C89094Vf extends C02830Cb {
    public final int A00;

    public C89094Vf(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        if (this.A00 != 0) {
            return ((C601136n) obj).A02.A00.equals(((C601136n) obj2).A02.A00);
        }
        AnonymousClass36Z r4 = (AnonymousClass36Z) obj;
        AnonymousClass36Z r5 = (AnonymousClass36Z) obj2;
        if (!r4.A01.equals(r5.A01) || !r4.A02.equals(r5.A02) || r4.A00 != r5.A00) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        if (this.A00 != 0) {
            return ((C601136n) obj).A02.equals(((C601136n) obj2).A02);
        }
        return C1901797e.A00(obj, obj2);
    }
}
