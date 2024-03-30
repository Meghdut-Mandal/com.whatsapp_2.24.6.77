package X;

import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: X.6nN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C141516nN implements Continuation {
    public final Pair A00;
    public final C19370up A01;

    public C141516nN(Pair pair, C19370up r2) {
        this.A01 = r2;
        this.A00 = pair;
    }

    public final Object then(Task task) {
        C19370up r2 = this.A01;
        Pair pair = this.A00;
        synchronized (r2) {
            r2.A00.remove(pair);
        }
        return task;
    }
}
