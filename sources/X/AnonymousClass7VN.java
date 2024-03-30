package X;

/* renamed from: X.7VN  reason: invalid class name */
public final class AnonymousClass7VN extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass6Q4 $placeable;
    public final /* synthetic */ C161717nM $this_measure;
    public final /* synthetic */ int $wrapperHeight;
    public final /* synthetic */ int $wrapperWidth;
    public final /* synthetic */ C94304hz this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VN(C94304hz r2, C161717nM r3, AnonymousClass6Q4 r4, int i, int i2) {
        super(1);
        this.this$0 = r2;
        this.$wrapperWidth = i;
        this.$placeable = r4;
        this.$wrapperHeight = i2;
        this.$this_measure = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C009003v r4 = this.this$0.A01;
        int i = this.$wrapperWidth;
        AnonymousClass6Q4 r2 = this.$placeable;
        AnonymousClass6WO.A00(this.$placeable, 0.0f, ((AnonymousClass6TU) r4.invoke(new C131286Ol(C90484aE.A0J(i - r2.A01, this.$wrapperHeight - r2.A00)), this.$this_measure.getLayoutDirection())).A00);
        return AnonymousClass0AJ.A00;
    }
}
