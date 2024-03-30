package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import android.os.IBinder;

/* renamed from: X.3WG  reason: invalid class name */
public class AnonymousClass3WG implements ServiceConnection {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C20220xD A01;

    public AnonymousClass3WG(ConditionVariable conditionVariable, C20220xD r2) {
        this.A01 = r2;
        this.A00 = conditionVariable;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.A00.open();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.A00.close();
    }
}
