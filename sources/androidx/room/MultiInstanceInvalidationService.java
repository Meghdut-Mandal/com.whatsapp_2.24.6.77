package androidx.room;

import X.C165967uo;
import X.C166137v5;
import X.C36431kI;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import java.util.Map;

public final class MultiInstanceInvalidationService extends Service {
    public int A00;
    public final RemoteCallbackList A01 = new C166137v5(this);
    public final Map A02 = C36431kI.A1G();
    public final C165967uo A03 = new C165967uo(this);

    public IBinder onBind(Intent intent) {
        return this.A03;
    }
}
