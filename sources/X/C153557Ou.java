package X;

/* renamed from: X.7Ou  reason: invalid class name and case insensitive filesystem */
public final class C153557Ou extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass76X $hitTestResult;
    public final /* synthetic */ C160297km $hitTestSource;
    public final /* synthetic */ boolean $isInLayer;
    public final /* synthetic */ boolean $isTouchEvent;
    public final /* synthetic */ long $pointerPosition;
    public final /* synthetic */ C137856gq $this_hit;
    public final /* synthetic */ C94894iy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153557Ou(C137856gq r2, AnonymousClass76X r3, C160297km r4, C94894iy r5, long j, boolean z, boolean z2) {
        super(0);
        this.this$0 = r5;
        this.$this_hit = r2;
        this.$hitTestSource = r4;
        this.$pointerPosition = j;
        this.$hitTestResult = r3;
        this.$isTouchEvent = z;
        this.$isInLayer = z2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C94894iy r6 = this.this$0;
        C137856gq r1 = this.$this_hit;
        C160297km r5 = this.$hitTestSource;
        C137856gq A00 = C109275Wy.A00(r1, r5.B6i());
        long j = this.$pointerPosition;
        AnonymousClass76X r4 = this.$hitTestResult;
        boolean z = this.$isTouchEvent;
        boolean z2 = this.$isInLayer;
        float[] fArr = C94894iy.A0P;
        if (A00 == null) {
            r6.A0Y(r4, r5, j, z, z2);
        } else {
            r4.A02(A00, new C153557Ou(A00, r4, r5, r6, j, z, z2), -1.0f, z2);
        }
        return AnonymousClass0AJ.A00;
    }
}
