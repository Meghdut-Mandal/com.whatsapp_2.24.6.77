package X;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* renamed from: X.0DY  reason: invalid class name */
public abstract class AnonymousClass0DY extends Service {
    public static final Object A05 = new Object();
    public static final HashMap A06 = AnonymousClass001.A0J();
    public C17040qc A00;
    public C06750Ux A01;
    public boolean A02 = false;
    public C03260Dv A03;
    public final ArrayList A04;

    public boolean A09() {
        return true;
    }

    public abstract void A0A(Intent intent);

    public static void A00(Context context, Intent intent, Class cls, int i) {
        ComponentName componentName = new ComponentName(context, cls);
        if (intent != null) {
            synchronized (A05) {
                HashMap hashMap = A06;
                C06750Ux r0 = (C06750Ux) hashMap.get(componentName);
                if (r0 == null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        r0 = new C03550Gc(componentName, context, i);
                    } else {
                        r0 = new C03560Gd(componentName, context);
                    }
                    hashMap.put(componentName, r0);
                }
                r0.A03(i);
                r0.A04(intent);
            }
            return;
        }
        throw AnonymousClass001.A08("work must not be null");
    }

    public C17050qd A06() {
        C17050qd r0;
        C17040qc r02 = this.A00;
        if (r02 != null) {
            return r02.B5K();
        }
        ArrayList arrayList = this.A04;
        synchronized (arrayList) {
            if (arrayList.size() > 0) {
                r0 = (C17050qd) arrayList.remove(0);
            } else {
                r0 = null;
            }
        }
        return r0;
    }

    public void A07() {
        ArrayList arrayList = this.A04;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.A03 = null;
                if (arrayList.size() > 0) {
                    A08(false);
                } else if (!this.A02) {
                    this.A01.A00();
                }
            }
        }
    }

    public void A08(boolean z) {
        if (this.A03 == null) {
            this.A03 = new C03260Dv(this);
            C06750Ux r0 = this.A01;
            if (r0 != null && z) {
                r0.A01();
            }
            this.A03.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public IBinder onBind(Intent intent) {
        C17040qc r0 = this.A00;
        if (r0 != null) {
            return r0.B3C();
        }
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ArrayList arrayList = this.A04;
        if (arrayList == null) {
            return 2;
        }
        this.A01.A02();
        synchronized (arrayList) {
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C09570ca(intent, this, i2));
            A08(true);
        }
        return 3;
    }

    public AnonymousClass0DY() {
        ArrayList A0I;
        if (Build.VERSION.SDK_INT >= 26) {
            A0I = null;
        } else {
            A0I = AnonymousClass001.A0I();
        }
        this.A04 = A0I;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.A00 = new C03060Da(this);
            this.A01 = null;
            return;
        }
        this.A00 = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap hashMap = A06;
        C06750Ux r0 = (C06750Ux) hashMap.get(componentName);
        if (r0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                throw AnonymousClass001.A08("Can't be here without a job id");
            }
            r0 = new C03560Gd(componentName, this);
            hashMap.put(componentName, r0);
        }
        this.A01 = r0;
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.A04;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.A02 = true;
                this.A01.A00();
            }
        }
    }
}
