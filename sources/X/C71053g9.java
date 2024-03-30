package X;

import android.app.Activity;
import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;

/* renamed from: X.3g9  reason: invalid class name and case insensitive filesystem */
public class C71053g9 implements C226515g {
    public final Activity A00;
    public final C20060wx A01;

    public void Be9(String str) {
        Activity activity = this.A00;
        if (!activity.isFinishing()) {
            C18740tg.A06(activity);
            C225014r r3 = (C225014r) activity;
            boolean A002 = C20060wx.A00();
            int i = R.string.f12nameremoved;
            if (A002) {
                i = R.string.f12nameremoved;
            }
            r3.BO9(new Object[0], R.string.f12nameremoved, i);
        }
    }

    public void BeA() {
        Activity activity = this.A00;
        C18740tg.A06(activity);
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.f12nameremoved;
        if (i >= 30) {
            i2 = R.string.f12nameremoved;
            if (i < 33) {
                i2 = R.string.f12nameremoved;
            }
        }
        RequestPermissionActivity.A07(activity, R.string.f12nameremoved, i2);
    }

    public void Bjm(String str) {
        Activity activity = this.A00;
        if (!activity.isFinishing()) {
            C18740tg.A06(activity);
            C225014r r3 = (C225014r) activity;
            boolean A002 = C20060wx.A00();
            int i = R.string.f12nameremoved;
            if (A002) {
                i = R.string.f12nameremoved;
            }
            r3.BO9(new Object[0], R.string.f12nameremoved, i);
        }
    }

    public void Bjn() {
        Activity activity = this.A00;
        C18740tg.A06(activity);
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.f12nameremoved;
        if (i >= 30) {
            i2 = R.string.f12nameremoved;
            if (i < 33) {
                i2 = R.string.f12nameremoved;
            }
        }
        RequestPermissionActivity.A07(activity, R.string.f12nameremoved, i2);
    }

    public C71053g9(Activity activity, C20060wx r2) {
        this.A00 = activity;
        this.A01 = r2;
    }
}
