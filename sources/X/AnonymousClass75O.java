package X;

import java.lang.Thread;

/* renamed from: X.75O  reason: invalid class name */
public class AnonymousClass75O implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ AnonymousClass6XM A00;

    public AnonymousClass75O(AnonymousClass6XM r1) {
        this.A00 = r1;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        AnonymousClass6XM r1 = this.A00;
        AnonymousClass6MV r0 = new AnonymousClass6MV();
        AnonymousClass6MV.A00(r0, th);
        try {
            AnonymousClass6XM.A01(r1);
        } catch (Throwable unused) {
            AnonymousClass6MV.A00(r0, th);
        }
    }
}
