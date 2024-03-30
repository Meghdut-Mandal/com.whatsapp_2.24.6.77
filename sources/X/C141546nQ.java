package X;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: X.6nQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C141546nQ implements OnCompleteListener {
    public final Intent A00;
    public final C90734ag A01;

    public C141546nQ(Intent intent, C90734ag r2) {
        this.A01 = r2;
        this.A00 = intent;
    }

    public final void onComplete(Task task) {
        C90734ag.A00(this.A00, this.A01);
    }
}
