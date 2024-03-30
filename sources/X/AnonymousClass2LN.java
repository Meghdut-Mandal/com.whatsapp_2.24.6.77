package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2LN  reason: invalid class name */
public final class AnonymousClass2LN extends C236719j {
    public final C21060yb A00;

    public boolean A01(PendingIntent pendingIntent, int i, long j) {
        AlarmManager A05;
        if (pendingIntent == null || (A05 = this.A00.A05()) == null) {
            return false;
        }
        if (A00()) {
            A05.setExact(i, j, pendingIntent);
            return true;
        }
        A05.set(i, j, pendingIntent);
        return true;
    }

    public boolean A02(PendingIntent pendingIntent, int i, long j, boolean z) {
        AlarmManager A05;
        PendingIntent pendingIntent2 = pendingIntent;
        if (pendingIntent == null || (A05 = this.A00.A05()) == null) {
            return false;
        }
        int i2 = i;
        long j2 = j;
        if (A00()) {
            A05.setExactAndAllowWhileIdle(i, j, pendingIntent);
            return true;
        } else if (z) {
            A05.setWindow(i2, j2, TimeUnit.MINUTES.toMillis(10), pendingIntent2);
            return true;
        } else {
            A05.setAndAllowWhileIdle(i, j, pendingIntent);
            return true;
        }
    }

    public boolean A00() {
        AlarmManager A05 = this.A00.A05();
        if (A05 != null) {
            return A05.canScheduleExactAlarms();
        }
        return false;
    }

    public AnonymousClass2LN(C21060yb r1) {
        super(r1);
        this.A00 = r1;
    }
}
