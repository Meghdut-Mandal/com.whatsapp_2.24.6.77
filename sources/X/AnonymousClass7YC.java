package X;

/* renamed from: X.7YC  reason: invalid class name */
public final class AnonymousClass7YC extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $index;
    public final /* synthetic */ C136776ey this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7YC(C136776ey r2, int i) {
        super(2);
        this.this$0 = r2;
        this.$index = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma r6 = (C161337ma) obj;
        if ((AnonymousClass000.A0I(obj2) & 11) != 2 || !r6.BHg()) {
            C136776ey r2 = this.this$0;
            C136786ez r0 = r2.A01;
            int i = this.$index;
            C120625ro A01 = r0.A00.A01(i);
            ((C136806f1) A01.A02).A01.BKu(r2.A00, Integer.valueOf(i - A01.A01), r6, C36381kD.A0m());
        } else {
            r6.BuE();
        }
        return AnonymousClass0AJ.A00;
    }
}
