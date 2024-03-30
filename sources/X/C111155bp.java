package X;

import android.app.Activity;
import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;

/* renamed from: X.5bp  reason: invalid class name and case insensitive filesystem */
public class C111155bp implements C226515g {
    public Object A00;
    public final int A01;

    public C111155bp(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Be9(String str) {
        if (this.A01 != 0) {
            throw AnonymousClass001.A09("must not be called");
        }
        throw AnonymousClass001.A09("must not be called");
    }

    public void BeA() {
        if (this.A01 != 0) {
            throw AnonymousClass001.A09("must not be called");
        }
        throw AnonymousClass001.A09("must not be called");
    }

    public void Bjm(String str) {
        if (this.A01 != 0) {
            C225314u r3 = (C225314u) this.A00;
            AnonymousClass17Y r2 = r3.A05;
            boolean A002 = C20060wx.A00();
            int i = R.string.f12nameremoved;
            if (A002) {
                i = R.string.f12nameremoved;
            }
            r2.A06(i, 1);
            r3.finish();
            return;
        }
        AnonymousClass3SJ.A01(((AnonymousClass5JX) this.A00).A01, 107);
    }

    public void Bjn() {
        int i;
        if (this.A01 != 0) {
            Activity activity = (Activity) this.A00;
            int i2 = Build.VERSION.SDK_INT;
            int i3 = R.string.f12nameremoved;
            if (i2 >= 30) {
                i3 = R.string.f12nameremoved;
                if (i2 < 33) {
                    i3 = R.string.f12nameremoved;
                }
            }
            RequestPermissionActivity.A07(activity, R.string.f12nameremoved, i3);
            return;
        }
        Activity activity2 = ((AnonymousClass5JX) this.A00).A01;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            i = R.string.f12nameremoved;
        } else {
            i = R.string.f12nameremoved;
            if (i4 < 33) {
                i = R.string.f12nameremoved;
            }
        }
        RequestPermissionActivity.A0F(activity2, R.string.f12nameremoved, i, 200);
    }
}
