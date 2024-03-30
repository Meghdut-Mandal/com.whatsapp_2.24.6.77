package X;

/* renamed from: X.7Ux  reason: invalid class name and case insensitive filesystem */
public final class C155137Ux extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C10780fD $lastValue;
    public final /* synthetic */ C157507de $this_performFling;
    public final /* synthetic */ C10780fD $velocityLeft;
    public final /* synthetic */ C136566ec this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155137Ux(C136566ec r2, C157507de r3, C10780fD r4, C10780fD r5) {
        super(1);
        this.$lastValue = r4;
        this.$this_performFling = r3;
        this.$velocityLeft = r5;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C124485yG r6 = (C124485yG) obj;
        C161547n5 r2 = r6.A06;
        float A02 = C90484aE.A02(r2) - this.$lastValue.element;
        float BpR = this.$this_performFling.BpR(A02);
        this.$lastValue.element = C90484aE.A02(r2);
        this.$velocityLeft.element = C36441kJ.A03(((C136386eJ) r6.A04).A00.invoke(r6.A02));
        if (C90494aF.A01(A02, BpR) > 0.5f) {
            C90474aD.A11(r6.A05, false);
            r6.A07.invoke();
        }
        this.this$0.A00++;
        return AnonymousClass0AJ.A00;
    }
}
