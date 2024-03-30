package X;

import android.app.Activity;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.3hK  reason: invalid class name and case insensitive filesystem */
public class C71783hK implements C160417ky {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C225014r A01;
    public final /* synthetic */ C24331Ca A02;
    public final /* synthetic */ C20830yE A03;
    public final /* synthetic */ C18820ts A04;
    public final /* synthetic */ C20060wx A05;
    public final /* synthetic */ C144596sV A06;
    public final /* synthetic */ C88104Rk A07;

    public void BUy() {
    }

    public C71783hK(Activity activity, C225014r r2, C24331Ca r3, C20830yE r4, C18820ts r5, C20060wx r6, C144596sV r7, C88104Rk r8) {
        this.A00 = activity;
        this.A04 = r5;
        this.A06 = r7;
        this.A07 = r8;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r6;
        this.A03 = r4;
    }

    public void BQw(int i) {
        int i2;
        this.A06.A0C.unregisterObserver(this);
        Activity activity = this.A00;
        AnonymousClass3SJ.A00(activity, 600);
        AnonymousClass3RQ.A00 = null;
        this.A07.BaB(i);
        if (i == 3) {
            AnonymousClass6YO.A09(activity.getApplicationContext());
            byte[] A0H = C18750th.A0H(16);
            byte[] A0G = AnonymousClass6YO.A0G(A0H);
            if (A0G != null) {
                this.A02.A01((Runnable) null, A0G, A0H, 1);
                this.A01.BO5(R.string.f12nameremoved);
                Log.w("settings/backup/failed/missing-or-mismatch");
                return;
            }
        } else if (i == 2) {
            C225014r r3 = this.A01;
            boolean A002 = C20060wx.A00();
            StringBuilder A0u = AnonymousClass000.A0u();
            if (A002) {
                C36351kA.A14(activity, A0u, R.string.f12nameremoved);
                A0u.append(" ");
                i2 = R.string.f12nameremoved;
            } else {
                C36351kA.A14(activity, A0u, R.string.f12nameremoved);
                A0u.append(" ");
                i2 = R.string.f12nameremoved;
            }
            C36351kA.A14(activity, A0u, i2);
            r3.BO6(A0u.toString());
            return;
        } else if (i != 1) {
            if (!this.A03.A0D()) {
                Log.i("settings/backup/failed/missing-permissions");
                this.A01.BO5(R.string.f12nameremoved);
                return;
            }
            return;
        }
        this.A01.BO5(R.string.f12nameremoved);
        Log.w("settings/backup/failed/null");
    }

    public void BS6() {
        AnonymousClass3SJ.A01(this.A00, 600);
    }

    public void Bdj(int i) {
        C36571kW r6 = AnonymousClass3RQ.A00;
        if (r6 != null) {
            Activity activity = this.A00;
            Object[] objArr = new Object[1];
            C36371kC.A1M(this.A04, objArr, i, 0);
            r6.setMessage(activity.getString(R.string.f12nameremoved, objArr));
        }
        int i2 = i % 10;
        Locale locale = Locale.ENGLISH;
        Object[] objArr2 = new Object[1];
        AnonymousClass000.A1L(objArr2, i, 0);
        if (i2 == 0) {
            Log.i(String.format(locale, "settings/backup/msgstore/progress/%d%%", objArr2));
        } else {
            String.format(locale, "settings/backup/msgstore/progress/%d%%", objArr2);
        }
    }
}
