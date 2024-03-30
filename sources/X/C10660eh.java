package X;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.0eh  reason: invalid class name and case insensitive filesystem */
public final class C10660eh implements OnCompleteListener {
    public final /* synthetic */ AnonymousClass0WT A00;
    public final /* synthetic */ TaskCompletionSource A01;

    public C10660eh(AnonymousClass0WT r1, TaskCompletionSource taskCompletionSource) {
        this.A00 = r1;
        this.A01 = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        this.A00.A01.remove(this.A01);
    }
}
