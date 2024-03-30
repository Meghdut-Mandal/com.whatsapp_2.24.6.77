package X;

/* renamed from: X.6MD  reason: invalid class name */
public final class AnonymousClass6MD {
    public int A00;

    public AnonymousClass6MD(int i) {
        this.A00 = 0;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("IntRef(element = ");
        A0u.append(this.A00);
        A0u.append(")@");
        int hashCode = hashCode();
        C06780Vb.A00(16);
        String num = Integer.toString(hashCode, 16);
        AnonymousClass00C.A08(num);
        return AnonymousClass000.A0q(num, A0u);
    }

    public AnonymousClass6MD() {
        this(0);
    }
}
