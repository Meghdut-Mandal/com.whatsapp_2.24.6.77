package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.0u8  reason: invalid class name and case insensitive filesystem */
public class C18970u8 implements Executor {
    public static final Handler A00 = new Handler(Looper.getMainLooper());

    public void execute(Runnable runnable) {
        A00.post(runnable);
    }
}
