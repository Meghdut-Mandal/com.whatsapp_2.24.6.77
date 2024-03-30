package X;

/* renamed from: X.0eV  reason: invalid class name and case insensitive filesystem */
public final class C10570eV implements C15980oM {
    public final int A00;
    public final C17630rj A01;
    public final Object[] A02;

    public C10570eV(C17630rj r7, Object[] objArr) {
        char charAt;
        this.A01 = r7;
        this.A02 = objArr;
        char charAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (charAt2 >= 55296) {
            char c = charAt2 & 8191;
            int i = 13;
            int i2 = 1;
            while (true) {
                int i3 = i2 + 1;
                charAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i2);
                if (charAt < 55296) {
                    break;
                }
                c |= (charAt & 8191) << i;
                i += 13;
                i2 = i3;
            }
            charAt2 = (charAt << i) | c;
        }
        this.A00 = charAt2;
    }
}
