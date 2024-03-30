package X;

import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: X.79S  reason: invalid class name */
public class AnonymousClass79S extends LinkedBlockingDeque<Runnable> {
    public /* bridge */ /* synthetic */ boolean offer(Object obj) {
        if (!isEmpty() || !super.offer(obj)) {
            return false;
        }
        return true;
    }
}
