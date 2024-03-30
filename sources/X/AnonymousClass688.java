package X;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.text.FinalBackspaceAwareEntry;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: X.688  reason: invalid class name */
public final class AnonymousClass688 {
    public int A00;
    public ObjectAnimator A01;
    public ObjectAnimator A02;
    public ObjectAnimator A03;
    public ObjectAnimator A04;
    public TextView A05;
    public TextView A06;
    public FinalBackspaceAwareEntry A07;
    public String A08;
    public String A09;
    public TimerTask A0A;
    public final View A0B;
    public final AccelerateInterpolator A0C;
    public final DecelerateInterpolator A0D;
    public final AnonymousClass17Y A0E;
    public final AnonymousClass00S A0F;
    public final int[] A0G;
    public final int[] A0H;
    public final String A0I;
    public final Timer A0J = new Timer();

    public AnonymousClass688(View view, AnonymousClass17Y r10, AnonymousClass00S r11) {
        AnonymousClass00C.A0D(r10, 1);
        this.A0E = r10;
        this.A0B = view;
        this.A0F = r11;
        int[] iArr = new int[2];
        this.A0H = iArr;
        this.A0C = new AccelerateInterpolator();
        this.A0D = new DecelerateInterpolator();
        int[] iArr2 = new int[2];
        this.A0G = iArr2;
        this.A08 = "";
        iArr[0] = -1;
        iArr2[0] = -1;
        String A0m = C36361kB.A0m(view.getContext(), R.string.f12nameremoved);
        this.A0I = A0m;
        this.A09 = A0m;
        this.A05 = C36341k9.A0M(view, R.id.search_hint_fade_in);
        this.A06 = C36341k9.A0M(view, R.id.search_hint_fade_out);
        this.A07 = (FinalBackspaceAwareEntry) C36361kB.A0G(view, R.id.search_input);
        C36331k8.A0r(view.getContext(), this.A05, R.color.f6nameremoved);
        C36331k8.A0r(view.getContext(), this.A06, R.color.f6nameremoved);
        this.A05.setHint("");
        this.A06.setHint("");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A06, "translationY", new float[]{0.0f, 50.0f});
        ofFloat.setDuration(300);
        ofFloat.setStartDelay(700);
        C162337oQ.A00(ofFloat, this, 29);
        this.A04 = ofFloat;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A05, "translationY", new float[]{-50.0f, 0.0f});
        ofFloat2.setDuration(300);
        ofFloat2.setStartDelay(700);
        C162337oQ.A00(ofFloat2, this, 30);
        this.A02 = ofFloat2;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.A05, "alpha", new float[]{0.0f, 1.0f});
        ofFloat3.setInterpolator(this.A0C);
        ofFloat3.setDuration(300);
        ofFloat3.setStartDelay(700);
        this.A01 = ofFloat3;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.A06, "alpha", new float[]{1.0f, 0.0f});
        ofFloat4.setInterpolator(this.A0D);
        ofFloat4.setDuration(300);
        ofFloat4.setStartDelay(700);
        this.A03 = ofFloat4;
        this.A07.getViewTreeObserver().addOnPreDrawListener(new C163987r5(this, 5));
    }

    public final void A00() {
        TimerTask timerTask = this.A0A;
        if (timerTask != null) {
            timerTask.cancel();
        }
        ObjectAnimator objectAnimator = this.A03;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.A04;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        ObjectAnimator objectAnimator3 = this.A02;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        ObjectAnimator objectAnimator4 = this.A01;
        if (objectAnimator4 != null) {
            objectAnimator4.cancel();
        }
        this.A05.clearAnimation();
        this.A06.clearAnimation();
        this.A07.setHint(this.A0I);
    }

    public final void A01(String str) {
        if (str == null || str.length() == 0) {
            TimerTask timerTask = this.A0A;
            if (timerTask != null) {
                timerTask.cancel();
            }
            AnonymousClass79C r1 = new AnonymousClass79C(this);
            this.A0A = r1;
            this.A0J.schedule(r1, 0, 7000);
        }
    }
}
