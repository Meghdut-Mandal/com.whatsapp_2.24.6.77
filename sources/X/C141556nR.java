package X;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.whatsapp.util.Log;

/* renamed from: X.6nR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C141556nR implements OnCompleteListener {
    public final /* synthetic */ AnonymousClass1BY A00;
    public final /* synthetic */ C1266664y A01;

    public /* synthetic */ C141556nR(AnonymousClass1BY r1, C1266664y r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onComplete(Task task) {
        AnonymousClass1BY r2 = this.A00;
        C1266664y r1 = this.A01;
        if (task.isSuccessful()) {
            r2.A00();
        }
        if (task.getException() != null) {
            Log.e("AbstractCronetEngineProvider/installAndCreateCronetEngine/Async cronet engine install failed");
        }
        r1.A00();
    }
}
