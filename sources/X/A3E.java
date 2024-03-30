package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class A3E implements C16790q6 {
    public final TaskCompletionSource A00;

    public A3E(TaskCompletionSource taskCompletionSource) {
        this.A00 = taskCompletionSource;
    }

    public final /* bridge */ /* synthetic */ void Bs2(Object obj) {
        Exception apiException;
        C170218Ck r4 = (C170218Ck) obj;
        Status status = r4.A00;
        if (status.A01 <= 0) {
            this.A00.setResult(new AnonymousClass8BN(r4));
            return;
        }
        boolean A1V = AnonymousClass000.A1V(status.A02);
        TaskCompletionSource taskCompletionSource = this.A00;
        if (A1V) {
            apiException = new AnonymousClass0JE(status);
        } else {
            apiException = new ApiException(status);
        }
        taskCompletionSource.setException(apiException);
    }
}
