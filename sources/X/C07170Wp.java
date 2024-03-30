package X;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0Wp  reason: invalid class name and case insensitive filesystem */
public final class C07170Wp {
    public static C07170Wp A03;
    public GoogleSignInAccount A00;
    public GoogleSignInOptions A01;
    public final C07550Yf A02;

    /* JADX INFO: finally extract failed */
    public final synchronized void A01() {
        C07550Yf r0 = this.A02;
        Lock lock = r0.A01;
        lock.lock();
        try {
            r0.A00.edit().clear().apply();
            lock.unlock();
            this.A00 = null;
            this.A01 = null;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public static synchronized C07170Wp A00(Context context) {
        C07170Wp r0;
        synchronized (C07170Wp.class) {
            Context applicationContext = context.getApplicationContext();
            r0 = A03;
            if (r0 == null) {
                r0 = new C07170Wp(applicationContext);
                A03 = r0;
            }
        }
        return r0;
    }

    public C07170Wp(Context context) {
        C07550Yf A002 = C07550Yf.A00(context);
        this.A02 = A002;
        this.A00 = A002.A01();
        this.A01 = A002.A02();
    }
}
