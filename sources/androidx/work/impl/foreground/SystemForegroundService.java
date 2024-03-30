package androidx.work.impl.foreground;

import X.AnonymousClass6VD;
import X.C138826il;
import X.C158947iV;
import X.C36341k9;
import X.C81303wn;
import X.C90744ah;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.util.Log;

public class SystemForegroundService extends C90744ah implements C158947iV {
    public static SystemForegroundService A04;
    public static final String A05 = AnonymousClass6VD.A01("SystemFgService");
    public C138826il A00;
    public NotificationManager A01;
    public Handler A02;
    public boolean A03;

    public void BuV(int i, Notification notification, int i2) {
        this.A02.post(new C81303wn((Object) this, i, (Object) notification, i2, 0));
    }

    public void stop() {
        this.A03 = true;
        AnonymousClass6VD.A00().A04(A05, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        A04 = null;
        stopSelf();
    }

    private void A00() {
        this.A02 = C36341k9.A0H();
        this.A01 = (NotificationManager) getApplicationContext().getSystemService("notification");
        C138826il r1 = new C138826il(getApplicationContext());
        this.A00 = r1;
        if (r1.A01 != null) {
            AnonymousClass6VD.A00();
            Log.e(C138826il.A0A, "A callback already exists.");
            return;
        }
        r1.A01 = this;
    }

    public void onCreate() {
        super.onCreate();
        A04 = this;
        A00();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A00.A00();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.A03) {
            AnonymousClass6VD.A00();
            Log.i(A05, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.A00.A00();
            A00();
            this.A03 = false;
        }
        if (intent == null) {
            return 3;
        }
        this.A00.A01(intent);
        return 3;
    }
}
