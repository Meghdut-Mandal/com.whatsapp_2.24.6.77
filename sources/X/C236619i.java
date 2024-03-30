package X;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* renamed from: X.19i  reason: invalid class name and case insensitive filesystem */
public class C236619i {
    public final C21060yb A00;

    public boolean A00() {
        return true;
    }

    public boolean A01(PendingIntent pendingIntent, int i, long j) {
        AlarmManager A05;
        if (pendingIntent == null || (A05 = this.A00.A05()) == null) {
            return false;
        }
        A05.setExact(i, j, pendingIntent);
        return true;
    }

    public boolean A02(PendingIntent pendingIntent, int i, long j, boolean z) {
        AlarmManager A05;
        if (pendingIntent == null || (A05 = this.A00.A05()) == null) {
            return false;
        }
        A05.setExact(i, j, pendingIntent);
        return true;
    }

    public C236619i(C21060yb r1) {
        this.A00 = r1;
    }
}
