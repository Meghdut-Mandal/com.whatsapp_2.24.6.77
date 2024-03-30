package X;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* renamed from: X.0ZC  reason: invalid class name */
public class AnonymousClass0ZC implements TimeInterpolator {
    public int A00;
    public int A01;
    public int[] A02;

    public float getInterpolation(float f) {
        float f2 = (float) this.A01;
        int i = (int) ((f * f2) + 0.5f);
        int i2 = this.A00;
        int[] iArr = this.A02;
        int i3 = 0;
        while (i3 < i2 && i >= iArr[i3]) {
            i -= iArr[i3];
            i3++;
        }
        float f3 = 0.0f;
        if (i3 < i2) {
            f3 = ((float) i) / f2;
        }
        return (((float) i3) / ((float) i2)) + f3;
    }

    public AnonymousClass0ZC(AnimationDrawable animationDrawable, boolean z) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.A00 = numberOfFrames;
        int[] iArr = this.A02;
        if (iArr == null || iArr.length < numberOfFrames) {
            iArr = new int[numberOfFrames];
            this.A02 = iArr;
        }
        int i = 0;
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            int i3 = i2;
            if (z) {
                i3 = (numberOfFrames - i2) - 1;
            }
            int duration = animationDrawable.getDuration(i3);
            iArr[i2] = duration;
            i += duration;
        }
        this.A01 = i;
    }
}
