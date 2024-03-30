package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.0QK  reason: invalid class name */
public abstract class AnonymousClass0QK {
    public static void A00(Status status, TaskCompletionSource taskCompletionSource, Object obj) {
        if (status.A01 <= 0) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(AnonymousClass0QL.A00(status));
        }
    }
}
