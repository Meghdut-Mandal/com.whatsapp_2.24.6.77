package X;

/* renamed from: X.7J7  reason: invalid class name */
public final class AnonymousClass7J7 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C94734ih this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7J7(C94734ih r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C129056Et r0 = this.this$0.A0O;
        r0.A02 = 0;
        C1506776e A09 = r0.A0F.A09();
        int i = A09.A00;
        if (i > 0) {
            Object[] objArr = A09.A01;
            int i2 = 0;
            do {
                C94734ih r2 = ((C137846gp) objArr[i2]).A0P.A0G;
                r2.A04 = r2.A03;
                r2.A03 = Integer.MAX_VALUE;
                r2.A0D = false;
                if (r2.A07 == C023109s.A01) {
                    r2.A07 = C023109s.A0C;
                }
                i2++;
            } while (i2 < i);
        }
        this.this$0.B7X(AnonymousClass7WZ.A00);
        this.this$0.BCj().A0H().Bld();
        C137846gp r6 = this.this$0.A0O.A0F;
        C1506776e A092 = r6.A09();
        int i3 = A092.A00;
        if (i3 > 0) {
            int i4 = 0;
            Object[] objArr2 = A092.A01;
            do {
                C137846gp r22 = (C137846gp) objArr2[i4];
                C94734ih r02 = r22.A0P.A0G;
                if (r02.A04 != r02.A03) {
                    r6.A0L();
                    r6.A0G();
                    C94734ih r23 = r22.A0P.A0G;
                    if (r23.A03 == Integer.MAX_VALUE) {
                        C94734ih.A01(r23);
                    }
                }
                i4++;
            } while (i4 < i3);
        }
        this.this$0.B7X(C155427Wa.A00);
        return AnonymousClass0AJ.A00;
    }
}
