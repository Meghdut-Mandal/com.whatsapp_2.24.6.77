package X;

import android.app.Application;

/* renamed from: X.0gI  reason: invalid class name and case insensitive filesystem */
public class C11430gI implements Runnable {
    public final /* synthetic */ Application A00;
    public final /* synthetic */ AnonymousClass0ZO A01;

    public C11430gI(Application application, AnonymousClass0ZO r2) {
        this.A00 = application;
        this.A01 = r2;
    }

    public void run() {
        this.A00.unregisterActivityLifecycleCallbacks(this.A01);
    }
}
