package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.Thread;

/* renamed from: X.4cL  reason: invalid class name and case insensitive filesystem */
public final class C91624cL extends Handler {
    public final Thread.UncaughtExceptionHandler A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91624cL(Handler.Callback callback, Looper looper, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        super(looper, callback);
        AnonymousClass00C.A0D(looper, 1);
        this.A00 = uncaughtExceptionHandler;
    }

    public void dispatchMessage(Message message) {
        AnonymousClass00C.A0D(message, 0);
        try {
            super.dispatchMessage(message);
        } catch (Exception e) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A00;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), e);
            }
        }
    }
}
