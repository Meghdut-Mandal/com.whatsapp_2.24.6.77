package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.7Ri  reason: invalid class name and case insensitive filesystem */
public final class C154217Ri extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C141786np this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154217Ri(C141786np r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th != null) {
            boolean z = th instanceof CancellationException;
            C97484pl r1 = this.this$0.A00;
            if (z) {
                r1.cancel(true);
            } else {
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                r1.A07(th);
            }
        } else if (!this.this$0.A00.isDone()) {
            throw AnonymousClass001.A08("Failed requirement.");
        }
        return AnonymousClass0AJ.A00;
    }
}
