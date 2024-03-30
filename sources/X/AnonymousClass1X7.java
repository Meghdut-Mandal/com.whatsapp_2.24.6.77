package X;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.whatsapp.R;

/* renamed from: X.1X7  reason: invalid class name */
public final class AnonymousClass1X7 {
    public final AnonymousClass17Y A00;
    public final C20830yE A01;
    public final C18820ts A02;
    public final C20060wx A03;

    public AnonymousClass1X7(AnonymousClass17Y r2, C20830yE r3, C18820ts r4, C20060wx r5) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r3, 4);
        this.A00 = r2;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
    }

    public final void A02(Context context, int i) {
        this.A00.A0E(context.getResources().getQuantityString(R.plurals.f10nameremoved, i, new Object[]{Integer.valueOf(i)}), 1);
    }

    public final void A03(C225314u r3) {
        AnonymousClass00C.A0D(r3, 0);
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
            boolean A002 = C20060wx.A00();
            int i = R.string.f12nameremoved;
            if (A002) {
                i = R.string.f12nameremoved;
            }
            r3.BO5(i);
        }
        if (!A00(r3, this)) {
            boolean A003 = C20060wx.A00();
            int i2 = R.string.f12nameremoved;
            if (A003) {
                i2 = R.string.f12nameremoved;
            }
            r3.BO5(i2);
        }
    }

    public static final boolean A00(C225314u r5, AnonymousClass1X7 r6) {
        int i;
        if (Build.VERSION.SDK_INT < 23 || r6.A01.A03(AnonymousClass3TA.A04()) != -1) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            i = R.string.f12nameremoved;
        } else {
            i = R.string.f12nameremoved;
            if (i2 < 33) {
                i = R.string.f12nameremoved;
            }
        }
        if (r5.isFinishing()) {
            return true;
        }
        r5.startActivityForResult(AnonymousClass3US.A03(r5, R.string.f12nameremoved, i, false), 151);
        return true;
    }

    public final void A01(int i) {
        this.A00.A0E(this.A02.A0L(new Object[]{Integer.valueOf(i)}, R.plurals.f10nameremoved, (long) i), 1);
    }
}
