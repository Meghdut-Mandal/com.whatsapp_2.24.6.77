package X;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

public interface B24 {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, C192779In r2, CancellationSignal cancellationSignal, Executor executor, B0O b0o);

    void onGetCredential(Context context, AnonymousClass9BX r2, CancellationSignal cancellationSignal, Executor executor, B0O b0o);
}
