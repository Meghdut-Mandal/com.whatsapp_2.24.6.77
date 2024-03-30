package X;

import java.util.List;

/* renamed from: X.65H  reason: invalid class name */
public final class AnonymousClass65H {
    public int A00;
    public int A01;
    public int A02;
    public C1264764e A03;
    public AnonymousClass72L A04;
    public C138026h9 A05;
    public AnonymousClass6FW A06;
    public AnonymousClass6V8 A07;
    public C157027bi A08;
    public C161937ni A09;
    public AnonymousClass5RW A0A;
    public List A0B;
    public boolean A0C;
    public long A0D = C129476Hd.A00;

    public final void A00(C161937ni r6) {
        long j;
        C161937ni r2 = this.A09;
        if (r6 != null) {
            long j2 = C129476Hd.A00;
            j = C90464aC.A0B(r6.BAy(), r6.BC0());
        } else {
            j = C129476Hd.A00;
        }
        if (r2 == null) {
            this.A09 = r6;
            this.A0D = j;
        } else if (r6 == null || this.A0D != j) {
            this.A09 = r6;
            this.A0D = j;
            this.A05 = null;
            this.A06 = null;
        }
    }

    public AnonymousClass65H(AnonymousClass72L r3, AnonymousClass6V8 r4, C157027bi r5, List list, int i, int i2, int i3, boolean z) {
        this.A04 = r3;
        this.A07 = r4;
        this.A08 = r5;
        this.A02 = i;
        this.A0C = z;
        this.A00 = i2;
        this.A01 = i3;
        this.A0B = list;
    }
}
