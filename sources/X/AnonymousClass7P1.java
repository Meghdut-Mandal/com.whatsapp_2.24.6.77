package X;

/* renamed from: X.7P1  reason: invalid class name */
public final class AnonymousClass7P1 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ float $distanceFromEdge;
    public final /* synthetic */ AnonymousClass76X $hitTestResult;
    public final /* synthetic */ C160297km $hitTestSource;
    public final /* synthetic */ boolean $isInLayer;
    public final /* synthetic */ boolean $isTouchEvent;
    public final /* synthetic */ long $pointerPosition;
    public final /* synthetic */ C137856gq $this_speculativeHit;
    public final /* synthetic */ C94894iy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7P1(C137856gq r2, AnonymousClass76X r3, C160297km r4, C94894iy r5, float f, long j, boolean z, boolean z2) {
        super(0);
        this.this$0 = r5;
        this.$this_speculativeHit = r2;
        this.$hitTestSource = r4;
        this.$pointerPosition = j;
        this.$hitTestResult = r3;
        this.$isTouchEvent = z;
        this.$isInLayer = z2;
        this.$distanceFromEdge = f;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C94894iy r3 = this.this$0;
        C137856gq r1 = this.$this_speculativeHit;
        C160297km r2 = this.$hitTestSource;
        C137856gq A00 = C109275Wy.A00(r1, r2.B6i());
        long j = this.$pointerPosition;
        C94894iy.A04(A00, this.$hitTestResult, r2, r3, this.$distanceFromEdge, j, this.$isTouchEvent, this.$isInLayer);
        return AnonymousClass0AJ.A00;
    }
}
