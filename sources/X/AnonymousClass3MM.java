package X;

import android.app.Activity;
import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;

/* renamed from: X.3MM  reason: invalid class name */
public class AnonymousClass3MM implements C226515g {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass3MM(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void Be9(String str) {
        if (this.A02 != 0) {
            throw AnonymousClass001.A09("must not be called");
        }
        C53142qq.A00((AnonymousClass01I) this.A01);
    }

    public void BeA() {
        if (this.A02 != 0) {
            throw AnonymousClass001.A09("must not be called");
        }
        Activity activity = (Activity) this.A01;
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
        if (this.A02 != 0) {
            ((long[]) this.A01)[0] = -2;
        } else {
            C53142qq.A00((AnonymousClass01I) this.A01);
        }
    }

    public void Bjn() {
        if (this.A02 != 0) {
            ((long[]) this.A01)[0] = -2;
            return;
        }
        Activity activity = (Activity) this.A01;
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
}
