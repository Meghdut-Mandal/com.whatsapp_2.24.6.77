package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import android.os.IBinder;

/* renamed from: X.6ZG  reason: invalid class name */
public class AnonymousClass6ZG implements ServiceConnection {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C20220xD A01;
    public final /* synthetic */ C33151eo A02;

    public AnonymousClass6ZG(ConditionVariable conditionVariable, C20220xD r2, C33151eo r3) {
        this.A01 = r2;
        this.A00 = conditionVariable;
        this.A02 = r3;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.A00.open();
        C20220xD r2 = this.A01;
        r2.A03.A01(this.A02);
        r2.A02.A04();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.A00.close();
    }
}
