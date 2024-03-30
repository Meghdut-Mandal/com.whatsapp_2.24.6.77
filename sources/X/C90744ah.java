package X;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: X.4ah  reason: invalid class name and case insensitive filesystem */
public abstract class C90744ah extends Service implements AnonymousClass012 {
    public final AnonymousClass6K8 A00 = new AnonymousClass6K8(this);

    public AnonymousClass01M getLifecycle() {
        return this.A00.A01;
    }

    public IBinder onBind(Intent intent) {
        AnonymousClass6K8.A00(AnonymousClass05R.ON_START, this.A00);
        return null;
    }

    public void onCreate() {
        AnonymousClass6K8.A00(AnonymousClass05R.ON_CREATE, this.A00);
        super.onCreate();
    }

    public void onDestroy() {
        AnonymousClass6K8 r1 = this.A00;
        AnonymousClass6K8.A00(AnonymousClass05R.ON_STOP, r1);
        AnonymousClass6K8.A00(AnonymousClass05R.ON_DESTROY, r1);
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        AnonymousClass6K8.A00(AnonymousClass05R.ON_START, this.A00);
        super.onStart(intent, i);
    }
}
