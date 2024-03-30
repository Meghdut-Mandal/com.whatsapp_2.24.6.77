package X;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;

/* renamed from: X.4ai  reason: invalid class name and case insensitive filesystem */
public abstract class C90754ai extends Service implements C160357ks {
    public ComponentName A00;
    public Intent A01;
    public Looper A02;
    public C141626nY A03 = new C141626nY(new AnonymousClass6JH(this));
    public C91714cU A04;
    public boolean A05;
    public IBinder A06;
    public final Object A07 = C36441kJ.A11();

    public void BTJ(C161397mq r1, int i, int i2) {
    }

    public void BTK(C161397mq r1) {
    }

    public void BZD(C161397mq r1, int i, int i2) {
    }

    public void Bc4(C161397mq r1, int i, int i2) {
    }

    public void onDestroy() {
        if (C90494aF.A1a("WearableLS")) {
            String valueOf = String.valueOf(this.A00);
            C90464aC.A1G("onDestroy: ", valueOf, "WearableLS", C90524aI.A0h(C90474aD.A05(valueOf) + 11));
        }
        synchronized (this.A07) {
            this.A05 = true;
            C91714cU r1 = this.A04;
            if (r1 != null) {
                r1.getLooper().quit();
                C91714cU.A00(r1, "quit");
            } else {
                String valueOf2 = String.valueOf(this.A00);
                StringBuilder A0h = C90524aI.A0h(C90474aD.A05(valueOf2) + 111);
                A0h.append("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=");
                throw AnonymousClass000.A0g(valueOf2, A0h);
            }
        }
        super.onDestroy();
    }

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction())) {
            return this.A06;
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.A00 = new ComponentName(this, AnonymousClass000.A0k(this));
        if (C90494aF.A1a("WearableLS")) {
            String valueOf = String.valueOf(this.A00);
            C90464aC.A1G("onCreate: ", valueOf, "WearableLS", C90524aI.A0h(C90474aD.A05(valueOf) + 10));
        }
        Looper looper = this.A02;
        if (looper == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            looper = handlerThread.getLooper();
            this.A02 = looper;
        }
        this.A04 = new C91714cU(looper, this);
        Intent A0I = C36441kJ.A0I("com.google.android.gms.wearable.BIND_LISTENER");
        this.A01 = A0I;
        A0I.setComponent(this.A00);
        this.A06 = new C99174sk(this);
    }
}
