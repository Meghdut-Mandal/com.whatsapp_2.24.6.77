package X;

/* renamed from: X.7UW  reason: invalid class name */
public final class AnonymousClass7UW extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass6Q4 $placeable;
    public final /* synthetic */ C161717nM $this_measure;
    public final /* synthetic */ C94314i0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UW(C94314i0 r2, C161717nM r3, AnonymousClass6Q4 r4) {
        super(1);
        this.this$0 = r2;
        this.$placeable = r4;
        this.$this_measure = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6WO r7 = (AnonymousClass6WO) obj;
        C94314i0 r5 = this.this$0;
        boolean z = r5.A04;
        AnonymousClass6Q4 r3 = this.$placeable;
        C161717nM r2 = this.$this_measure;
        int Bor = r2.Bor(r5.A02);
        int Bor2 = r2.Bor(r5.A03);
        if (z) {
            r7.A04(r3, Bor, Bor2);
        } else {
            AnonymousClass6WO.A01(r3, Bor, Bor2);
        }
        return AnonymousClass0AJ.A00;
    }
}
