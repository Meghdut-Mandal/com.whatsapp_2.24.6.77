package X;

/* renamed from: X.72S  reason: invalid class name */
public final class AnonymousClass72S implements Comparable {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AnonymousClass72S r3 = (AnonymousClass72S) obj;
        AnonymousClass00C.A0D(r3, 0);
        int i = this.A00 - r3.A00;
        if (i == 0) {
            return this.A01 - r3.A01;
        }
        return i;
    }

    public AnonymousClass72S(int i, int i2, String str, String str2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
        this.A03 = str2;
    }
}
