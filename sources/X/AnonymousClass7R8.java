package X;

import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;

/* renamed from: X.7R8  reason: invalid class name */
public final class AnonymousClass7R8 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7R8(Recomposer recomposer) {
        super(1);
        this.this$0 = recomposer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
        cancellationException.initCause(th);
        Recomposer recomposer = this.this$0;
        AnonymousClass05L r0 = Recomposer.A0M;
        synchronized (recomposer.A0C) {
            C007403e r3 = recomposer.A06;
            if (r3 != null) {
                recomposer.A0K.setValue(C108185Sm.ShuttingDown);
                r3.B2S(cancellationException);
                recomposer.A05 = null;
                r3.BL4(new C154757Tk(recomposer, th));
            } else {
                recomposer.A02 = cancellationException;
                recomposer.A0K.setValue(C108185Sm.ShutDown);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
