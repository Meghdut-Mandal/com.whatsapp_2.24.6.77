package X;

/* renamed from: X.60D  reason: invalid class name */
public final class AnonymousClass60D {
    public long[] A00 = new long[20];

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("<LongStack vector:[");
        long[] jArr = this.A00;
        int i = 0;
        while (true) {
            if (i == -1) {
                A0u.append(">>");
            }
            A0u.append(jArr[i]);
            if (i == -1) {
                A0u.append("<<");
            }
            i++;
            if (i >= 20) {
                String A0q = AnonymousClass000.A0q("]>", A0u);
                AnonymousClass00C.A08(A0q);
                return A0q;
            } else if (i != 0) {
                C36421kH.A1N(A0u);
            }
        }
    }
}
