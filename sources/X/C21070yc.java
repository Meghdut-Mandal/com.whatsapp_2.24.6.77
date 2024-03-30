package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Handler;

/* renamed from: X.0yc  reason: invalid class name and case insensitive filesystem */
public class C21070yc extends AlarmManager {
    public AlarmManager A00;

    public void set(int i, long j, PendingIntent pendingIntent) {
        int i2 = 0;
        do {
            try {
                this.A00.set(i, ((long) (i2 * 10)) + j, pendingIntent);
                return;
            } catch (NullPointerException | SecurityException e) {
                if (A00(e)) {
                    i2++;
                    if (i2 >= 3) {
                    }
                } else {
                    throw e;
                }
            }
        } while (i2 >= 3);
    }

    public void setExactAndAllowWhileIdle(int i, long j, PendingIntent pendingIntent) {
        int i2 = 0;
        do {
            try {
                this.A00.setExactAndAllowWhileIdle(i, ((long) (i2 * 10)) + j, pendingIntent);
                return;
            } catch (NullPointerException | SecurityException e) {
                if (A00(e)) {
                    i2++;
                    if (i2 >= 3) {
                    }
                } else {
                    throw e;
                }
            }
        } while (i2 >= 3);
    }

    public void setInexactRepeating(int i, long j, long j2, PendingIntent pendingIntent) {
        int i2 = 0;
        do {
            try {
                this.A00.setInexactRepeating(i, j, j2, pendingIntent);
                return;
            } catch (NullPointerException | SecurityException e) {
                if (A00(e)) {
                    i2++;
                    if (i2 >= 3) {
                    }
                } else {
                    throw e;
                }
            }
        } while (i2 >= 3);
    }

    public static boolean A00(Throwable th) {
        String message;
        if ((th instanceof NullPointerException) || ((th instanceof SecurityException) && (message = th.getMessage()) != null && message.contains("android.permission.GET_INTENT_SENDER_INTENT"))) {
            return true;
        }
        return false;
    }

    public void cancel(AlarmManager.OnAlarmListener onAlarmListener) {
        this.A00.cancel(onAlarmListener);
    }

    public AlarmManager.AlarmClockInfo getNextAlarmClock() {
        return this.A00.getNextAlarmClock();
    }

    public void setAlarmClock(AlarmManager.AlarmClockInfo alarmClockInfo, PendingIntent pendingIntent) {
        this.A00.setAlarmClock(alarmClockInfo, pendingIntent);
    }

    public void setAndAllowWhileIdle(int i, long j, PendingIntent pendingIntent) {
        this.A00.setAndAllowWhileIdle(i, j, pendingIntent);
    }

    public void setExact(int i, long j, PendingIntent pendingIntent) {
        this.A00.setExact(i, j, pendingIntent);
    }

    public void setRepeating(int i, long j, long j2, PendingIntent pendingIntent) {
        this.A00.setRepeating(i, j, j2, pendingIntent);
    }

    public void setTime(long j) {
        this.A00.setTime(j);
    }

    public void setTimeZone(String str) {
        this.A00.setTimeZone(str);
    }

    public void setWindow(int i, long j, long j2, PendingIntent pendingIntent) {
        this.A00.setWindow(i, j, j2, pendingIntent);
    }

    public C21070yc(AlarmManager alarmManager) {
        this.A00 = alarmManager;
    }

    public void cancel(PendingIntent pendingIntent) {
        this.A00.cancel(pendingIntent);
    }

    public void set(int i, long j, String str, AlarmManager.OnAlarmListener onAlarmListener, Handler handler) {
        int i2 = 0;
        do {
            try {
                this.A00.set(i, j, str, onAlarmListener, handler);
                return;
            } catch (NullPointerException | SecurityException e) {
                if (A00(e)) {
                    i2++;
                    if (i2 >= 3) {
                    }
                } else {
                    throw e;
                }
            }
        } while (i2 >= 3);
    }

    public void setExact(int i, long j, String str, AlarmManager.OnAlarmListener onAlarmListener, Handler handler) {
        this.A00.setExact(i, j, str, onAlarmListener, handler);
    }

    public void setWindow(int i, long j, long j2, String str, AlarmManager.OnAlarmListener onAlarmListener, Handler handler) {
        this.A00.setWindow(i, j, j2, str, onAlarmListener, handler);
    }
}
