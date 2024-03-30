package X;

import java.util.concurrent.Executor;

/* renamed from: X.5UP  reason: invalid class name */
public enum AnonymousClass5UP implements Executor {
    ;

    public String toString() {
        return "MoreExecutors.directExecutor()";
    }

    /* access modifiers changed from: public */
    AnonymousClass5UP() {
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
