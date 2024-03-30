package X;

import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.8Cs  reason: invalid class name and case insensitive filesystem */
public final class C170258Cs extends C165937uP implements IInterface {
    public final /* synthetic */ TaskCompletionSource A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C170258Cs(TaskCompletionSource taskCompletionSource) {
        this();
        this.A00 = taskCompletionSource;
    }

    public C170258Cs() {
        super("com.google.android.gms.auth.blockstore.internal.IRetrieveBytesCallback");
    }
}
