package X;

import java.util.List;

/* renamed from: X.7OR  reason: invalid class name */
public final class AnonymousClass7OR extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C94924j1 $lookaheadDelegate;
    public final /* synthetic */ C94724ig this$0;
    public final /* synthetic */ C129056Et this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7OR(C94724ig r2, C129056Et r3, C94924j1 r4) {
        super(0);
        this.this$0 = r2;
        this.$lookaheadDelegate = r4;
        this.this$1 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C129056Et r0 = this.this$0.A0H;
        int i = 0;
        r0.A01 = 0;
        C1506776e A09 = r0.A0F.A09();
        int i2 = A09.A00;
        if (i2 > 0) {
            Object[] objArr = A09.A01;
            do {
                C94724ig A00 = C129056Et.A00((C137846gp) objArr[i]);
                A00.A01 = A00.A00;
                A00.A00 = Integer.MAX_VALUE;
                if (A00.A04 == C023109s.A01) {
                    A00.A04 = C023109s.A0C;
                }
                i++;
            } while (i < i2);
        }
        this.this$0.B7X(AnonymousClass7WW.A00);
        C94924j1 r02 = this.this$0.BCj().A00;
        if (r02 != null) {
            boolean z = r02.A00;
            List A05 = this.this$1.A0F.A09().A05();
            int size = A05.size();
            for (int i3 = 0; i3 < size; i3++) {
                C94924j1 A0N = ((C137846gp) A05.get(i3)).A0R.A04.A0N();
                if (A0N != null) {
                    A0N.A00 = z;
                }
            }
        }
        this.$lookaheadDelegate.A0H().Bld();
        if (this.this$0.BCj().A00 != null) {
            List A052 = this.this$1.A0F.A09().A05();
            int size2 = A052.size();
            for (int i4 = 0; i4 < size2; i4++) {
                C94924j1 A0N2 = ((C137846gp) A052.get(i4)).A0R.A04.A0N();
                if (A0N2 != null) {
                    A0N2.A00 = false;
                }
            }
        }
        C1506776e A092 = this.this$0.A0H.A0F.A09();
        int i5 = A092.A00;
        if (i5 > 0) {
            int i6 = 0;
            Object[] objArr2 = A092.A01;
            do {
                C94724ig A002 = C129056Et.A00((C137846gp) objArr2[i6]);
                int i7 = A002.A01;
                int i8 = A002.A00;
                if (i7 != i8 && i8 == Integer.MAX_VALUE) {
                    C94724ig.A01(A002);
                }
                i6++;
            } while (i6 < i5);
        }
        this.this$0.B7X(AnonymousClass7WX.A00);
        return AnonymousClass0AJ.A00;
    }
}
