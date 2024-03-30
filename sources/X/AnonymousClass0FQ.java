package X;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* renamed from: X.0FQ  reason: invalid class name */
public class AnonymousClass0FQ extends C06630Uk {
    public final ObjectAnimator A00;
    public final boolean A01;

    public void A00() {
        this.A00.reverse();
    }

    public void A01() {
        this.A00.start();
    }

    public void A02() {
        this.A00.cancel();
    }

    public AnonymousClass0FQ(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        AnonymousClass0ZC r3 = new AnonymousClass0ZC(animationDrawable, z);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
        ofInt.setAutoCancel(true);
        ofInt.setDuration((long) r3.A01);
        ofInt.setInterpolator(r3);
        this.A01 = z2;
        this.A00 = ofInt;
    }

    public boolean A03() {
        return this.A01;
    }
}
