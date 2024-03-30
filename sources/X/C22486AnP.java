package X;

/* renamed from: X.AnP  reason: case insensitive filesystem */
public final class C22486AnP extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C10770fC $isFetchedAtLeastOnce;
    public final /* synthetic */ AnonymousClass08S $this_apply;
    public final /* synthetic */ C167627yS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22486AnP(AnonymousClass08S r2, C167627yS r3, C10770fC r4) {
        super(1);
        this.$isFetchedAtLeastOnce = r4;
        this.$this_apply = r2;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (!this.$isFetchedAtLeastOnce.element && C36371kC.A1X(obj, false)) {
            this.$isFetchedAtLeastOnce.element = true;
            C199779fx r0 = (C199779fx) this.$this_apply.A04();
            if (r0 != null) {
                this.$this_apply.A0D(new C199779fx(r0.A00, r0.A01, true));
            }
            C167627yS r2 = this.this$0;
            String str = r2.A00;
            r2.A00 = null;
            if (str != null) {
                r2.A0T(str);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
