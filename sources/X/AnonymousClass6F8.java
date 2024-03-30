package X;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.6F8  reason: invalid class name */
public abstract class AnonymousClass6F8 {
    public boolean A00 = false;
    public final Resources A01;
    public final Paint A02;
    public final RectF A03;
    public final Vibrator A04;
    public final View A05;
    public final ViewGroup A06;
    public final Handler A07;
    public final Runnable A08;
    public final Runnable A09;

    public void A01() {
        Handler handler = this.A07;
        handler.removeCallbacks(this.A09);
        handler.post(this.A08);
        this.A00 = false;
    }

    public void A02() {
        Vibrator vibrator;
        Handler handler = this.A07;
        handler.removeCallbacks(this.A08);
        handler.post(this.A09);
        if (!this.A00 && (vibrator = this.A04) != null) {
            try {
                vibrator.vibrate(3);
            } catch (NullPointerException e) {
                Log.e("Vibrator is broken on this device.", e);
            }
        }
        this.A00 = true;
    }

    public AnonymousClass6F8(RectF rectF, Handler handler, Vibrator vibrator, ViewGroup viewGroup) {
        int i;
        this.A07 = handler;
        this.A06 = viewGroup;
        this.A03 = rectF;
        this.A04 = vibrator;
        this.A01 = viewGroup.getResources();
        Paint A0K = C36441kJ.A0K();
        Resources resources = this.A01;
        if (this instanceof AnonymousClass5CU) {
            i = R.color.f6nameremoved;
        } else {
            i = R.color.f6nameremoved;
        }
        C90484aE.A14(resources, A0K, i);
        A0K.setStrokeWidth(C36441kJ.A00(resources, R.dimen.f7nameremoved));
        C36421kH.A0q(A0K);
        this.A02 = A0K;
        C162407oX r4 = new C162407oX(viewGroup.getContext(), this, 0);
        r4.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        r4.setVisibility(4);
        this.A05 = r4;
        viewGroup.addView(r4, 0);
        this.A09 = new AnonymousClass73E(r4, 0.0f, 1.0f, 0);
        this.A08 = new AnonymousClass73E(r4, 1.0f, 0.0f, 4);
    }
}
