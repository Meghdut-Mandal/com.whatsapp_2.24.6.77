package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.4fG  reason: invalid class name and case insensitive filesystem */
public final class C92974fG extends ImageView {
    public boolean A00;
    public final ObjectAnimator A01;

    public C92974fG(Context context) {
        super(context);
        float[] A0v = C90524aI.A0v();
        // fill-array-data instruction
        A0v[0] = 0;
        A0v[1] = 1135869952;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "rotation", A0v).setDuration(850);
        AnonymousClass00C.A08(duration);
        this.A01 = duration;
        duration.setRepeatMode(1);
        duration.setRepeatCount(-1);
        duration.setInterpolator(new LinearInterpolator());
        C36391kE.A18(context, this, R.drawable.spinner_large);
    }

    public void onDetachedFromWindow() {
        this.A00 = false;
        this.A01.cancel();
        super.onDetachedFromWindow();
    }

    public void onVisibilityChanged(View view, int i) {
        AnonymousClass00C.A0D(view, 0);
        super.onVisibilityChanged(view, i);
        if (getWindowToken() == null) {
            return;
        }
        if (i != 0 || getVisibility() != 0) {
            this.A01.cancel();
            this.A00 = false;
        } else if (getAnimation() != null) {
        } else {
            if (getMeasuredWidth() != 0) {
                this.A01.start();
            } else {
                this.A00 = true;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            this.A01.start();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A00) {
            this.A01.start();
            this.A00 = false;
        }
    }
}
