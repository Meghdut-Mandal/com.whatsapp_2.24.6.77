package X;

import android.app.Notification;

/* renamed from: X.6At  reason: invalid class name and case insensitive filesystem */
public final class C128076At {
    public final int A00;
    public final int A01;
    public final Notification A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C128076At r4 = (C128076At) obj;
            if (this.A01 == r4.A01 && this.A00 == r4.A00) {
                return this.A02.equals(r4.A02);
            }
        }
        return false;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, ((this.A01 * 31) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0i = C90524aI.A0i("ForegroundInfo{");
        A0i.append("mNotificationId=");
        A0i.append(this.A01);
        A0i.append(", mForegroundServiceType=");
        A0i.append(this.A00);
        A0i.append(", mNotification=");
        return C90464aC.A0X(this.A02, A0i);
    }

    public C128076At(int i, Notification notification, int i2) {
        this.A01 = i;
        this.A02 = notification;
        this.A00 = i2;
    }
}
