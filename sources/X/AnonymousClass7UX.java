package X;

/* renamed from: X.7UX  reason: invalid class name */
public final class AnonymousClass7UX extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass6Q4 $placeable;
    public final /* synthetic */ C161717nM $this_measure;
    public final /* synthetic */ C94274hw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UX(C94274hw r2, C161717nM r3, AnonymousClass6Q4 r4) {
        super(1);
        this.$placeable = r4;
        this.$this_measure = r3;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        AnonymousClass6Q4 r4 = this.$placeable;
        C161717nM r3 = this.$this_measure;
        C136756ew r2 = (C136756ew) this.this$0.A00;
        if (r3.getLayoutDirection() == AnonymousClass5RW.Ltr) {
            f = r2.A02;
        } else {
            f = r2.A01;
        }
        AnonymousClass6WO.A01(r4, r3.Bor(f), r3.Bor(r2.A03));
        return AnonymousClass0AJ.A00;
    }
}
