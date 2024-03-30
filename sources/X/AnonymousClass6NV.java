package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.6NV  reason: invalid class name */
public final class AnonymousClass6NV {
    public int A00;
    public int A01;
    public int A02;
    public long A03 = C90484aE.A0J(0, 0);
    public long A04 = Constraints.A01.A01(0, 0, 0, 0);
    public C1264764e A05;
    public C160567lD A06;
    public C159897k6 A07;
    public AnonymousClass6V8 A08;
    public C157027bi A09;
    public C161937ni A0A;
    public AnonymousClass5RW A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public long A0F = C129476Hd.A00;

    public static final void A00(AnonymousClass6NV r3) {
        r3.A06 = null;
        r3.A07 = null;
        r3.A0B = null;
        r3.A04 = Constraints.A01.A01(0, 0, 0, 0);
        r3.A03 = C90484aE.A0J(0, 0);
        r3.A0D = false;
    }

    public final void A01(C161937ni r6) {
        long j;
        C161937ni r2 = this.A0A;
        if (r6 != null) {
            long j2 = C129476Hd.A00;
            j = C90464aC.A0B(r6.BAy(), r6.BC0());
        } else {
            j = C129476Hd.A00;
        }
        if (r2 == null) {
            this.A0A = r6;
            this.A0F = j;
        } else if (r6 == null || this.A0F != j) {
            this.A0A = r6;
            this.A0F = j;
            A00(this);
        }
    }

    public AnonymousClass6NV(AnonymousClass6V8 r4, C157027bi r5, String str, int i, int i2, int i3, boolean z) {
        this.A0C = str;
        this.A08 = r4;
        this.A09 = r5;
        this.A02 = i;
        this.A0E = z;
        this.A00 = i2;
        this.A01 = i3;
    }
}
