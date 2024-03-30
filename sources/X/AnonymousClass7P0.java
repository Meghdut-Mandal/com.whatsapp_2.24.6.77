package X;

/* renamed from: X.7P0  reason: invalid class name */
public final class AnonymousClass7P0 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ float $distanceFromEdge;
    public final /* synthetic */ AnonymousClass76X $hitTestResult;
    public final /* synthetic */ C160297km $hitTestSource;
    public final /* synthetic */ boolean $isInLayer;
    public final /* synthetic */ boolean $isTouchEvent;
    public final /* synthetic */ long $pointerPosition;
    public final /* synthetic */ C137856gq $this_hitNear;
    public final /* synthetic */ C94894iy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7P0(C137856gq r2, AnonymousClass76X r3, C160297km r4, C94894iy r5, float f, long j, boolean z, boolean z2) {
        super(0);
        this.this$0 = r5;
        this.$this_hitNear = r2;
        this.$hitTestSource = r4;
        this.$pointerPosition = j;
        this.$hitTestResult = r3;
        this.$isTouchEvent = z;
        this.$isInLayer = z2;
        this.$distanceFromEdge = f;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C94894iy r6 = this.this$0;
        C137856gq r1 = this.$this_hitNear;
        C160297km r5 = this.$hitTestSource;
        C137856gq A00 = C109275Wy.A00(r1, r5.B6i());
        long j = this.$pointerPosition;
        AnonymousClass76X r4 = this.$hitTestResult;
        boolean z = this.$isTouchEvent;
        boolean z2 = this.$isInLayer;
        float f = this.$distanceFromEdge;
        float[] fArr = C94894iy.A0P;
        if (A00 == null) {
            r6.A0Y(r4, r5, j, z, z2);
        } else {
            r4.A02(A00, new AnonymousClass7P0(A00, r4, r5, r6, f, j, z, z2), f, z2);
        }
        return AnonymousClass0AJ.A00;
    }
}
