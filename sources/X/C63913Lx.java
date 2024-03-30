package X;

/* renamed from: X.3Lx  reason: invalid class name and case insensitive filesystem */
public class C63913Lx implements AnonymousClass4QU {
    public Object A00;
    public Object A01;
    public final int A02;

    public C63913Lx(C37501mW r1, C65923Tz r2, int i) {
        this.A02 = i;
        this.A00 = r2;
        this.A01 = r1;
    }

    public final void Bgo(int[] iArr) {
        int i = this.A02;
        C65923Tz r0 = (C65923Tz) this.A00;
        C37501mW r1 = (C37501mW) this.A01;
        C65923Tz.A04(r0, iArr);
        r1.setEmoji(iArr);
        C19890wg r02 = r0.A0N;
        if (i != 0) {
            AnonymousClass3TY.A03(r02, iArr);
        } else {
            AnonymousClass3TY.A02(r02, iArr);
        }
        r1.invalidate();
    }
}
