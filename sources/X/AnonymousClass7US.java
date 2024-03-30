package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.7US  reason: invalid class name */
public final class AnonymousClass7US extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C157507de $$this$scroll;
    public final /* synthetic */ C007403e $animationJob;
    public final /* synthetic */ C94264hv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7US(C94264hv r2, C157507de r3, C007403e r4) {
        super(1);
        this.this$0 = r2;
        this.$$this$scroll = r3;
        this.$animationJob = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float A03 = C36441kJ.A03(obj);
        float f = -1.0f;
        if (this.this$0.A06) {
            f = 1.0f;
        }
        float BpR = f * this.$$this$scroll.BpR(f * A03);
        if (Math.abs(BpR) < Math.abs(A03)) {
            C007403e r3 = this.$animationJob;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Scroll animation cancelled because scroll was not consumed (");
            A0u.append(BpR);
            A0u.append(" < ");
            CancellationException cancellationException = new CancellationException(C90464aC.A0g(A0u, A03));
            cancellationException.initCause((Throwable) null);
            r3.B2S(cancellationException);
        }
        return AnonymousClass0AJ.A00;
    }
}
