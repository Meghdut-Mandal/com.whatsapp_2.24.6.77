package X;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: X.9L6  reason: invalid class name */
public final class AnonymousClass9L6 {
    public PowerManager.WakeLock A00;
    public boolean A01;
    public boolean A02;
    public final PowerManager A03;

    public AnonymousClass9L6(Context context) {
        this.A03 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
