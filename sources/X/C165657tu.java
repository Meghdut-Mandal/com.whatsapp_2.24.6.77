package X;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.ResultReceiver;

/* renamed from: X.7tu  reason: invalid class name and case insensitive filesystem */
public class C165657tu extends Service {
    public IBinder A00 = new C166017ut(this);
    public ResultReceiver A01;

    public C165657tu(ResultReceiver resultReceiver) {
        this.A01 = resultReceiver;
    }

    public IBinder onBind(Intent intent) {
        return this.A00;
    }
}
