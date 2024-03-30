package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

/* renamed from: X.17Y  reason: invalid class name */
public class AnonymousClass17Y implements C19640wH {
    public C225014r A00;
    public C192979Jj A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final C19630wG A03;
    public final Executor A04 = new C36131jo(this, 0);
    public final C19700wN A05;
    public final C19600wD A06;
    public final AnonymousClass17Z A07;
    public final C230617a A08;

    @Deprecated
    public Toast A01(CharSequence charSequence) {
        Context context = this.A03.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, (ViewGroup) null);
        ((TextView) C012005e.A02(inflate, 16908299)).setText(charSequence);
        Toast toast = new Toast(context);
        toast.setView(inflate);
        toast.setDuration(0);
        return toast;
    }

    public final void A03(int i) {
        A0H(new C35201iJ(this, i, 0));
    }

    public void A0B(C225014r r4) {
        if (r4 == null && (r4 = this.A00) == null) {
            C18740tg.A0D(false, "dialogToast == null");
            A06(R.string.f12nameremoved, 0);
            return;
        }
        r4.Bu2(0, R.string.f12nameremoved);
    }

    public void A02() {
        StringBuilder sb = new StringBuilder();
        sb.append("app/progress-spinner/remove dt=");
        sb.append(this.A00);
        Log.i(sb.toString());
        A00("removeProgressSpinner");
        this.A01 = null;
        C225014r r0 = this.A00;
        if (r0 != null) {
            r0.Bnv();
        } else {
            AnonymousClass15V.A02 = false;
        }
        Log.i("app/progress-spinner/remove done");
    }

    public void A04(int i, int i2) {
        C225014r r0 = this.A00;
        if (r0 != null) {
            r0.BO5(i);
        } else {
            A06(i, i2);
        }
    }

    public void A05(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("app/progress-spinner/show dt=");
        sb.append(this.A00);
        Log.i(sb.toString());
        A00("showProgressSpinner");
        this.A01 = new C192979Jj(i, i2);
        C225014r r0 = this.A00;
        if (r0 != null) {
            r0.Bu2(i, i2);
        }
        Log.i("app/progress-spinner/show done");
    }

    public void A06(int i, int i2) {
        A0E(this.A03.A00.getString(i), i2);
    }

    public void A07(int i, int i2) {
        A0F(this.A03.A00.getString(i), i2);
    }

    public void A08(C225014r r3) {
        StringBuilder sb = new StringBuilder();
        sb.append("app/dt/clear dt=");
        sb.append(r3);
        sb.append(" dialog_toast=");
        sb.append(this.A00);
        Log.i(sb.toString());
        A00("clearDialogToast");
        C225014r r1 = this.A00;
        if (r1 == r3) {
            if (this.A01 != null) {
                r1.Bnv();
            }
            this.A00 = null;
        }
        Log.i("app/dt/clear done");
    }

    public void A09(C225014r r3) {
        if (r3 == null && (r3 = this.A00) == null) {
            C18740tg.A0D(false, "dialogToast == null");
            Log.w("app/removeProgressSpinner/ignore dialogToast == null");
            return;
        }
        r3.Bnv();
    }

    public void A0A(C225014r r4) {
        StringBuilder sb = new StringBuilder();
        sb.append("app/dt/set ");
        sb.append(r4);
        Log.i(sb.toString());
        A00("setDialogToast");
        this.A00 = r4;
        C192979Jj r2 = this.A01;
        if (r2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("app/dt/set show_progress_data=");
            sb2.append(r2);
            sb2.append(" dialog_toast=");
            sb2.append(this.A00);
            Log.i(sb2.toString());
            C225014r r22 = this.A00;
            C192979Jj r0 = this.A01;
            r22.Bu2(r0.A02, r0.A01);
            if (this.A01.A00 != null) {
                Log.i("app/dt/set/update");
                this.A00.Bwu(this.A01.A00);
            }
        }
        Log.i("app/dt/set done");
    }

    public void A0C(C225014r r2, int i) {
        if (r2 != null) {
            r2.BO5(i);
        } else {
            A04(i, 0);
        }
    }

    public void A0D(C225014r r2, String str) {
        if (r2 != null) {
            r2.BO6(str);
        } else {
            A0K(str, 0);
        }
    }

    public void A0E(CharSequence charSequence, int i) {
        View view;
        int i2;
        Context context = this.A03.A00;
        if (context != null) {
            Toast makeText = Toast.makeText(context, charSequence, i);
            String str = Build.MANUFACTURER;
            if (("Oculus".equalsIgnoreCase(str) || ((i2 = Build.VERSION.SDK_INT) >= 26 && i2 <= 28 && ("google".equalsIgnoreCase(str) || "oneplus".equalsIgnoreCase(str)))) && (view = makeText.getView()) != null) {
                Drawable background = view.getBackground();
                TextView textView = (TextView) view.findViewById(16908299);
                if (!(background == null || textView == null)) {
                    background.setColorFilter(AnonymousClass00F.A00(context, R.color.f6nameremoved), PorterDuff.Mode.SRC_IN);
                    textView.setTextColor(AnonymousClass00F.A00(context, R.color.f6nameremoved));
                }
            }
            makeText.show();
        }
    }

    public void A0G(Runnable runnable) {
        this.A02.removeCallbacks(runnable);
    }

    public void A0H(Runnable runnable) {
        this.A02.post(runnable);
    }

    public void A0I(Runnable runnable, long j) {
        this.A02.postDelayed(runnable, j);
    }

    public void A0J(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("app/progress-spinner/update-message dt=");
        sb.append(this.A00);
        Log.i(sb.toString());
        C192979Jj r0 = this.A01;
        if (r0 != null) {
            r0.A00 = str;
        } else {
            Log.w("app/progress-spinner/update-message no progress data");
        }
        C225014r r02 = this.A00;
        if (r02 != null) {
            r02.Bwu(str);
        }
        Log.i("app/progress-spinner/update-message done");
    }

    public void A0K(String str, int i) {
        C225014r r0 = this.A00;
        if (r0 != null) {
            r0.BO6(str);
        } else {
            A0E(str, i);
        }
    }

    public void A0L(String str, String str2, int i) {
        C225014r r0 = this.A00;
        if (r0 != null) {
            r0.BO7(str, str2);
        } else {
            A0E(str2, i);
        }
    }

    public boolean A0M() {
        if (this.A06.A09()) {
            return true;
        }
        boolean A022 = C19600wD.A02(this.A03.A00);
        int i = R.string.f12nameremoved;
        if (A022) {
            i = R.string.f12nameremoved;
        }
        A06(i, 0);
        return false;
    }

    public AnonymousClass17Y(C19700wN r3, C19600wD r4, C19630wG r5, AnonymousClass17Z r6, C230617a r7) {
        this.A05 = r3;
        this.A03 = r5;
        this.A06 = r4;
        this.A07 = r6;
        this.A08 = r7;
    }

    private void A00(String str) {
        if (!C224714l.A02()) {
            this.A05.A0E("GlobalUI/not-called-on-main-thread", str, true);
        }
    }

    public void A0F(CharSequence charSequence, int i) {
        if (C224714l.A02()) {
            A0E(charSequence, i);
        } else {
            A0H(new C35261iP((Object) this, i, 0, (Object) charSequence));
        }
    }

    public void Bp3(Runnable runnable) {
        if (C224714l.A02()) {
            runnable.run();
        } else {
            A0H(runnable);
        }
    }
}
