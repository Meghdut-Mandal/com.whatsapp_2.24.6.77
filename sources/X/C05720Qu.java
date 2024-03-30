package X;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.0Qu  reason: invalid class name and case insensitive filesystem */
public abstract class C05720Qu {
    public static final void A00(C005102h r4, Throwable th) {
        Throwable runtimeException;
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) r4.get(CoroutineExceptionHandler.A00);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(r4, th);
                return;
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException2 = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AnonymousClass0VY.A01(runtimeException2, th);
                th = runtimeException2;
            }
        }
        for (CoroutineExceptionHandler handleException : C05800Rc.A00) {
            try {
                handleException.handleException(r4, th);
            } catch (AnonymousClass0OC unused) {
                return;
            } catch (Throwable th3) {
                if (th == th3) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    AnonymousClass0VY.A01(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            AnonymousClass0VY.A01(th, new C13200jU(r4));
        } catch (Throwable unused2) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
