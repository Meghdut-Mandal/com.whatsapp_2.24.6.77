package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.0iD  reason: invalid class name and case insensitive filesystem */
public class C12520iD implements Executor {
    public final Handler A00;

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }

    public C12520iD(Looper looper) {
        this.A00 = new AnonymousClass0E8(looper);
    }
}
