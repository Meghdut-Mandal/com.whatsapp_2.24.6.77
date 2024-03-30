package X;

import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;

/* renamed from: X.7Tk  reason: invalid class name and case insensitive filesystem */
public final class C154757Tk extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Throwable $throwable;
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154757Tk(Recomposer recomposer, Throwable th) {
        super(1);
        this.this$0 = recomposer;
        this.$throwable = th;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        Recomposer recomposer = this.this$0;
        AnonymousClass05L r0 = Recomposer.A0M;
        Object obj2 = recomposer.A0C;
        Throwable th2 = this.$throwable;
        synchronized (obj2) {
            if (th2 == null) {
                th2 = null;
            } else if (th != null) {
                if (!(th instanceof CancellationException)) {
                    AnonymousClass0VY.A01(th2, th);
                }
            }
            recomposer.A02 = th2;
            recomposer.A0K.setValue(C108185Sm.ShutDown);
        }
        return AnonymousClass0AJ.A00;
    }
}
