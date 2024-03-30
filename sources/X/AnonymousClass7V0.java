package X;

/* renamed from: X.7V0  reason: invalid class name */
public final class AnonymousClass7V0 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ int $first;
    public final /* synthetic */ int $last;
    public final /* synthetic */ AnonymousClass0G9 $map;
    public final /* synthetic */ C136816f2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7V0(AnonymousClass0G9 r2, C136816f2 r3, int i, int i2) {
        super(1);
        this.$first = i;
        this.$last = i2;
        this.$map = r2;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C120625ro r7 = (C120625ro) obj;
        int i = this.$first;
        int i2 = r7.A01;
        int max = Math.max(i, i2);
        int min = Math.min(this.$last, (i2 + r7.A00) - 1);
        if (max <= min) {
            while (true) {
                C134536bC r3 = new C134536bC(max);
                AnonymousClass0G9 r2 = this.$map;
                int A01 = AnonymousClass0G9.A01(r2, r3);
                if (A01 < 0) {
                    A01 = ~A01;
                }
                r2.A04[A01] = r3;
                r2.A02[A01] = max;
                C136816f2 r0 = this.this$0;
                r0.A01[max - r0.A00] = r3;
                if (max == min) {
                    break;
                }
                max++;
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
