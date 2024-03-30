package X;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.9uw  reason: invalid class name and case insensitive filesystem */
public final class C207339uw implements View.OnAttachStateChangeListener {
    public final C208139xi A00;
    public final WeakReference A01;

    public void onViewAttachedToWindow(View view) {
        AnonymousClass00C.A0D(view, 0);
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.A01.get();
        IBinder A002 = AnonymousClass93T.A00(activity);
        if (activity != null && A002 != null) {
            this.A00.A02(activity, A002);
        }
    }

    public void onViewDetachedFromWindow(View view) {
    }

    public C207339uw(Activity activity, C208139xi r3) {
        this.A00 = r3;
        this.A01 = AnonymousClass001.A0F(activity);
    }
}
