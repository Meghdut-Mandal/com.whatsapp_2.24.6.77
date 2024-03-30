package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.R;

/* renamed from: X.056  reason: invalid class name */
public class AnonymousClass056 extends AnonymousClass055 {
    public static final TimeInterpolator A01 = new AccelerateInterpolator();
    public static final TimeInterpolator A02 = new DecelerateInterpolator();
    public static final AnonymousClass058 A03 = new C18200sm(1);
    public static final AnonymousClass058 A04 = new C18190sl(0);
    public static final AnonymousClass058 A05 = new C18190sl(1);
    public static final AnonymousClass058 A06 = new C18200sm(0);
    public AnonymousClass058 A00 = A03;

    public ObjectAnimator A0X(View view, ViewGroup viewGroup, AnonymousClass0X9 r14, AnonymousClass0X9 r15) {
        int[] iArr = (int[]) r15.A02.get("android:slide:screenPosition");
        View view2 = view;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float BCA = this.A00.BCA(view, viewGroup);
        float BCB = this.A00.BCB(view, viewGroup);
        int i = iArr[0];
        int i2 = iArr[1];
        return A01(A02, view2, this, r15, BCA, BCB, translationX, translationY, i, i2);
    }

    public ObjectAnimator A0Y(View view, ViewGroup viewGroup, AnonymousClass0X9 r14, AnonymousClass0X9 r15) {
        int[] iArr = (int[]) r14.A02.get("android:slide:screenPosition");
        View view2 = view;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float BCA = this.A00.BCA(view, viewGroup);
        float BCB = this.A00.BCB(view, viewGroup);
        int i = iArr[0];
        int i2 = iArr[1];
        return A01(A01, view2, this, r14, translationX, translationY, BCA, BCB, i, i2);
    }

    public void A0Z(int i) {
        AnonymousClass058 r0;
        if (i == 3) {
            r0 = A04;
        } else if (i == 5) {
            r0 = A05;
        } else if (i == 48) {
            r0 = A06;
        } else if (i != 80) {
            throw new IllegalArgumentException("Invalid slide direction");
        } else {
            r0 = A03;
        }
        this.A00 = r0;
        AnonymousClass05D r02 = new AnonymousClass05D();
        r02.A01 = i;
        A0Q(r02);
    }

    public AnonymousClass056(int i) {
        A0Z(i);
    }

    public void A0S(AnonymousClass0X9 r4) {
        AnonymousClass055.A02(r4);
        int[] iArr = new int[2];
        r4.A00.getLocationOnScreen(iArr);
        r4.A02.put("android:slide:screenPosition", iArr);
    }

    public void A0T(AnonymousClass0X9 r4) {
        AnonymousClass055.A02(r4);
        int[] iArr = new int[2];
        r4.A00.getLocationOnScreen(iArr);
        r4.A02.put("android:slide:screenPosition", iArr);
    }

    public static ObjectAnimator A01(TimeInterpolator timeInterpolator, View view, AnonymousClass054 r16, AnonymousClass0X9 r17, float f, float f2, float f3, float f4, int i, int i2) {
        View view2 = view;
        float f5 = f2;
        float f6 = f;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        View view3 = r17.A00;
        int[] iArr = (int[]) view3.getTag(R.id.transition_position);
        if (iArr != null) {
            f6 = ((float) (iArr[0] - i)) + translationX;
            f5 = ((float) (iArr[1] - i2)) + translationY;
        }
        int round = i + Math.round(f6 - translationX);
        int round2 = i2 + Math.round(f5 - translationY);
        view.setTranslationX(f6);
        view.setTranslationY(f5);
        if (f6 == f3 && f5 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f6, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f5, f4})});
        AnonymousClass0DQ r7 = new AnonymousClass0DQ(view2, view3, translationX, translationY, round, round2);
        r16.A0A(r7);
        ofPropertyValuesHolder.addListener(r7);
        ofPropertyValuesHolder.addPauseListener(r7);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    public AnonymousClass056() {
        A0Z(80);
    }
}
