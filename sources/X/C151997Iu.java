package X;

import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;

/* renamed from: X.7Iu  reason: invalid class name and case insensitive filesystem */
public final class C151997Iu extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151997Iu(Recomposer recomposer) {
        super(0);
        this.this$0 = recomposer;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass0AP A01;
        Recomposer recomposer = this.this$0;
        synchronized (recomposer.A0C) {
            A01 = Recomposer.A01(recomposer);
            if (C108185Sm.A00(recomposer) <= 0) {
                Throwable th = recomposer.A02;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (A01 != null) {
            A01.resumeWith(AnonymousClass0AJ.A00);
        }
        return AnonymousClass0AJ.A00;
    }
}
