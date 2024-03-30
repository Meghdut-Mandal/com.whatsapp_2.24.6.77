package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.8DZ  reason: invalid class name */
public final class AnonymousClass8DZ extends C170358Dc {
    public final /* synthetic */ TaskCompletionSource A00;

    public final void zzc() {
    }

    public AnonymousClass8DZ(TaskCompletionSource taskCompletionSource) {
        this.A00 = taskCompletionSource;
    }

    public final void ByV(C170208Cj r5) {
        Status status = r5.A00;
        if (status == null) {
            this.A00.trySetException(new ApiException(new Status(8, "Got null status from location service")));
            return;
        }
        int i = status.A01;
        TaskCompletionSource taskCompletionSource = this.A00;
        if (i == 0) {
            taskCompletionSource.setResult(C36371kC.A0m());
        } else {
            taskCompletionSource.trySetException(AnonymousClass0QL.A00(status));
        }
    }
}
