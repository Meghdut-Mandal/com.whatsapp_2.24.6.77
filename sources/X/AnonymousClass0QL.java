package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.0QL  reason: invalid class name */
public abstract class AnonymousClass0QL {
    public static ApiException A00(Status status) {
        if (status.A02 != null) {
            return new AnonymousClass0JE(status);
        }
        return new ApiException(status);
    }
}
