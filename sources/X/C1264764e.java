package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.64e  reason: invalid class name and case insensitive filesystem */
public final class C1264764e {
    public static C1264764e A07;
    public float A00 = Float.NaN;
    public float A01 = Float.NaN;
    public final AnonymousClass6V8 A02;
    public final C157027bi A03;
    public final C161937ni A04;
    public final AnonymousClass5RW A05;
    public final AnonymousClass6V8 A06;

    public final long A00(long j, int i) {
        int A022;
        int i2 = i;
        float f = this.A01;
        float f2 = this.A00;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = C113485fc.A00;
            AnonymousClass6V8 r7 = this.A06;
            C130656Lx r1 = Constraints.A01;
            long A012 = r1.A01(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
            C161937ni r9 = this.A04;
            C157027bi r8 = this.A03;
            C023409w r11 = C023409w.A00;
            f = new C138016h8(new C138036hA(r7, r8, r9, str, r11, r11), 1, A012, false).BCO();
            String str2 = C113485fc.A01;
            f2 = new C138016h8(new C138036hA(r7, r8, r9, str2, r11, r11), 2, r1.A01(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE), false).BCO() - f;
            this.A01 = f;
            this.A00 = f2;
        }
        if (i2 != 1) {
            A022 = C14960mT.A01(f + (f2 * ((float) (i - 1))));
            if (A022 < 0) {
                A022 = 0;
            }
            int A002 = Constraints.A00(j);
            if (A022 > A002) {
                A022 = A002;
            }
        } else {
            A022 = Constraints.A02(j);
        }
        return C132746Vb.A00(Constraints.A03(j), Constraints.A01(j), A022, Constraints.A00(j));
    }

    public C1264764e(AnonymousClass6V8 r2, C157027bi r3, C161937ni r4, AnonymousClass5RW r5) {
        this.A05 = r5;
        this.A02 = r2;
        this.A04 = r4;
        this.A03 = r3;
        this.A06 = AnonymousClass5XR.A00(r2, r5);
    }
}
