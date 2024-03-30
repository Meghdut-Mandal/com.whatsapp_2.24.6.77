package X;

/* renamed from: X.6EM  reason: invalid class name */
public abstract class AnonymousClass6EM {
    public final int A00;
    public final int A01;

    public AnonymousClass6EM(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public static int A00(AnonymousClass6EM r0, StringBuilder sb, int i, int i2) {
        sb.append(r0.A02(i));
        return i2 + 1;
    }

    public static int A01(AnonymousClass6EM r0, StringBuilder sb, int i, int i2) {
        sb.append(r0.A03(i));
        return i2 + 1;
    }

    public String A02(int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("IntParameter(");
        return C36321k7.A0G(A0u, i);
    }

    public String A03(int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ObjectParameter(");
        return C36321k7.A0G(A0u, i);
    }

    public String toString() {
        String BHa = C36441kJ.A1A(getClass()).BHa();
        if (BHa == null) {
            return "";
        }
        return BHa;
    }
}
