package X;

/* renamed from: X.9SE  reason: invalid class name */
public class AnonymousClass9SE {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final boolean A05;

    public AnonymousClass9SE(int i, int i2, int i3, long j, long j2, boolean z) {
        this.A04 = j;
        this.A03 = j2;
        this.A02 = i;
        this.A00 = i2;
        this.A05 = z;
        this.A01 = i3;
    }

    public String toString() {
        Object[] A0M = AnonymousClass001.A0M();
        C90474aD.A1S(A0M, this.A04);
        C36421kH.A1P(A0M, this.A03);
        String format = String.format("<S t=\"%d\" d=\"%d\"/>", A0M);
        if (this.A05) {
            return AnonymousClass000.A0q(" (p) ", AnonymousClass000.A0v(format));
        }
        return format;
    }
}
