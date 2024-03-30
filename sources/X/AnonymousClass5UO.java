package X;

import java.util.concurrent.Executor;

/* renamed from: X.5UO  reason: invalid class name */
public enum AnonymousClass5UO implements Executor {
    ;

    public String toString() {
        return "DirectExecutor";
    }

    /* access modifiers changed from: public */
    AnonymousClass5UO() {
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
