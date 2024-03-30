package X;

/* renamed from: X.AnX  reason: case insensitive filesystem */
public final class C22494AnX extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C10770fC $appliedPromotionTriggered;
    public final /* synthetic */ C10770fC $isFetchedAtLeastOnce;
    public final /* synthetic */ AnonymousClass08S $this_apply;
    public final /* synthetic */ C167627yS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22494AnX(AnonymousClass08S r2, C167627yS r3, C10770fC r4, C10770fC r5) {
        super(1);
        this.$this_apply = r2;
        this.$appliedPromotionTriggered = r4;
        this.this$0 = r3;
        this.$isFetchedAtLeastOnce = r5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C128826Dt r6 = (C128826Dt) obj;
        C199779fx r0 = (C199779fx) this.$this_apply.A04();
        if (r0 != null) {
            this.$this_apply.A0D(new C199779fx(r6, r0.A01, r0.A02));
        }
        C10770fC r1 = this.$appliedPromotionTriggered;
        if (!r1.element) {
            r1.element = true;
            AnonymousClass08S r4 = this.$this_apply;
            C167627yS r12 = this.this$0;
            r4.A0F(r12.A02.A02, new BA6(new C22485AnO(r4, r12, this.$isFetchedAtLeastOnce), 29));
        }
        return AnonymousClass0AJ.A00;
    }
}
