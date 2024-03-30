package X;

/* renamed from: X.7Uj  reason: invalid class name and case insensitive filesystem */
public final class C154997Uj extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass543 $category;
    public final /* synthetic */ int $index;
    public final /* synthetic */ C124145xf this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154997Uj(AnonymousClass543 r2, C124145xf r3, int i) {
        super(1);
        this.this$0 = r3;
        this.$category = r2;
        this.$index = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.this$0.A01.A0C(this.$category);
        C124145xf r0 = this.this$0;
        if (r0.A02.A00(r0.A06)) {
            AnonymousClass6OF r6 = this.this$0.A05;
            long j = ((long) this.$index) + 1;
            String str = this.$category.A01;
            C1040758e r4 = new C1040758e();
            r4.A01 = C36381kD.A0n();
            r4.A03 = C36381kD.A0m();
            if (r6.A03.A0E(2828)) {
                r4.A0B = str;
                r4.A05 = Long.valueOf(j);
            }
            AnonymousClass6OF.A00(r4, r6);
        }
        return AnonymousClass0AJ.A00;
    }
}
