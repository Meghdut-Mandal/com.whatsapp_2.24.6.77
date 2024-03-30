package X;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* renamed from: X.19j  reason: invalid class name and case insensitive filesystem */
public class C236719j extends C236619i {
    public final C21060yb A00;

    public boolean A02(PendingIntent pendingIntent, int i, long j, boolean z) {
        AlarmManager A05;
        if (pendingIntent == null || (A05 = this.A00.A05()) == null) {
            return false;
        }
        A05.setExactAndAllowWhileIdle(i, j, pendingIntent);
        return true;
    }

    public C236719j(C21060yb r1) {
        super(r1);
        this.A00 = r1;
    }
}
