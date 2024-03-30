package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Environment;
import com.whatsapp.R;

/* renamed from: X.3RQ  reason: invalid class name */
public abstract class AnonymousClass3RQ {
    public static C36571kW A00;

    public static C36571kW A01(Context context) {
        C36571kW r1 = new C36571kW(context);
        A00 = r1;
        r1.setTitle(R.string.f12nameremoved);
        C36391kE.A17(A00, context, R.string.f12nameremoved);
        A00.setIndeterminate(true);
        A00.setCancelable(false);
        return A00;
    }

    public static String A02(Activity activity, C18820ts r5, long j) {
        int i;
        int i2 = (j > -1 ? 1 : (j == -1 ? 0 : -1));
        if (j == 0) {
            i = R.string.f12nameremoved;
        } else if (i2 == 0) {
            i = R.string.f12nameremoved;
        } else if (AnonymousClass6XI.A00(System.currentTimeMillis(), j) == 0) {
            return AnonymousClass3UM.A00(r5, j);
        } else {
            return AnonymousClass3UY.A0B(r5, j);
        }
        return activity.getString(i);
    }

    public static AnonymousClass0FM A00(Context context) {
        int i;
        int i2;
        AnonymousClass4XL r2;
        if (C20060wx.A00()) {
            boolean equals = "unmounted".equals(Environment.getExternalStorageState());
            i = R.string.f12nameremoved;
            i2 = R.string.f12nameremoved;
            if (equals) {
                i = R.string.f12nameremoved;
                i2 = R.string.f12nameremoved;
                r2 = AnonymousClass4XL.A00(context, 18);
            }
            r2 = null;
        } else {
            i = R.string.f12nameremoved;
            i2 = R.string.f12nameremoved;
            r2 = null;
        }
        C39001qm A002 = AnonymousClass3LW.A00(context);
        A002.A0d(i);
        A002.A0c(i2);
        A002.A0h((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
        if (r2 != null) {
            A002.setPositiveButton(R.string.f12nameremoved, r2);
        }
        return A002.create();
    }
}
