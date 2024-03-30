package X;

/* renamed from: X.0G7  reason: invalid class name */
public final class AnonymousClass0G7 extends AnonymousClass0Ui {
    public AnonymousClass0G7(int i) {
        int i2;
        AnonymousClass0GA r0 = C05860Ri.A01;
        int i3 = i + ((i - 1) / 7);
        if (i3 > 0) {
            i2 = Math.max(7, -1 >>> Integer.numberOfLeadingZeros(i3));
        } else {
            i2 = 0;
        }
        this.A00 = i2;
        long[] A1a = AnonymousClass000.A1a(i2);
        this.A02 = A1a;
        AnonymousClass000.A1H(A1a, i2);
        this.A01 = new int[i2];
    }

    public AnonymousClass0G7() {
        this(6);
    }
}
