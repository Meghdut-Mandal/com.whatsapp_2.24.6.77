package X;

/* renamed from: X.6XW  reason: invalid class name */
public class AnonymousClass6XW implements C157657dt {
    public final int A00;

    public AnonymousClass6XW(int i) {
        this.A00 = i;
    }

    public C109065Wd B4p(C161937ni r6, AnonymousClass5RW r7, long j) {
        AnonymousClass6QC r4;
        switch (this.A00) {
            case 0:
                float Bor = (float) r6.Bor(C113785g7.A00);
                r4 = new AnonymousClass6QC(0.0f, -Bor, AnonymousClass6X0.A01(j), AnonymousClass6X0.A00(j) + Bor);
                break;
            case 1:
                float Bor2 = (float) r6.Bor(C113785g7.A00);
                r4 = new AnonymousClass6QC(-Bor2, 0.0f, AnonymousClass6X0.A01(j) + Bor2, AnonymousClass6X0.A00(j));
                break;
            default:
                r4 = AnonymousClass5WT.A00(C133206Xf.A03, j);
                break;
        }
        return new C94504iK(r4);
    }

    public String toString() {
        if (2 - this.A00 != 0) {
            return super.toString();
        }
        return "RectangleShape";
    }
}
