package X;

import android.app.Notification;
import android.content.res.Resources;
import android.os.Build;

/* renamed from: X.5K8  reason: invalid class name */
public abstract class AnonymousClass5K8 extends AnonymousClass5KB {
    public AnonymousClass1MM A00;
    public int A01 = -1;
    public boolean A02;
    public final String A03;
    public final boolean A04;

    public void onCreate() {
        this.A02 = false;
        super.onCreate();
    }

    public boolean A03() {
        int i;
        if (this.A04) {
            i = -1;
        } else {
            i = this.A01;
        }
        boolean stopSelfResult = stopSelfResult(i);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A03);
        C36321k7.A1X("/Stop service success:", A0u, stopSelfResult);
        return stopSelfResult;
    }

    public boolean A04(Notification notification, Integer num, int i, int i2) {
        this.A01 = i;
        try {
            if (!C19550w8.A0A() || num == null) {
                startForeground(i2, notification);
            } else {
                startForeground(i2, notification, num.intValue());
            }
            if (!this.A02) {
                this.A02 = true;
                if (Build.VERSION.SDK_INT >= 26) {
                    this.A00.A02(this);
                }
            }
            return true;
        } catch (IllegalStateException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Failed to start foreground service ");
            C36351kA.A1P(this.A03, A0u, e);
            A03();
            return false;
        }
    }

    public AnonymousClass5K8(String str, boolean z) {
        this.A03 = str;
        this.A04 = z;
    }

    public static void A00(Resources resources, C07700Yy r2, AnonymousClass5K8 r3, int i, int i2) {
        r2.A0F(resources.getString(i));
        r3.A04(r2.A05(), (Integer) null, i2, 31);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A02 = false;
        this.A01 = -1;
    }
}
