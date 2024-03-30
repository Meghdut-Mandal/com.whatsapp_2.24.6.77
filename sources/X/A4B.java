package X;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class A4B implements OnCompleteListener {
    public final /* synthetic */ TaskCompletionSource A00;
    public final /* synthetic */ C201499ji A01;

    public /* synthetic */ A4B(TaskCompletionSource taskCompletionSource, C201499ji r2) {
        this.A01 = r2;
        this.A00 = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        C201499ji r0 = this.A01;
        TaskCompletionSource taskCompletionSource = this.A00;
        synchronized (r0.A08) {
            r0.A0C.remove(taskCompletionSource);
        }
    }
}
