package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0dn  reason: invalid class name and case insensitive filesystem */
public final class C10160dn implements C16770q4 {
    public final /* synthetic */ C06290Ta A00;
    public final /* synthetic */ C16850qC A01;
    public final /* synthetic */ C15930oH A02;
    public final /* synthetic */ TaskCompletionSource A03;

    public C10160dn(C06290Ta r1, C16850qC r2, C15930oH r3, TaskCompletionSource taskCompletionSource) {
        this.A00 = r1;
        this.A03 = taskCompletionSource;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void BU0(Status status) {
        if (status.A01 <= 0) {
            C06290Ta r5 = this.A00;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) r5;
            AnonymousClass006.A08(!basePendingResult.A0B, "Result has already been consumed.");
            try {
                if (!basePendingResult.A07.await(0, timeUnit)) {
                    basePendingResult.A07(Status.A0B);
                }
            } catch (InterruptedException unused) {
                basePendingResult.A07(Status.A08);
            }
            AnonymousClass006.A08(basePendingResult.A08(), "Result is not ready.");
            this.A03.setResult(this.A01.B3c(BasePendingResult.A00(basePendingResult)));
            return;
        }
        this.A03.setException(AnonymousClass0QL.A00(status));
    }
}
