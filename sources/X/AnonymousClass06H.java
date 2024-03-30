package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.06H  reason: invalid class name */
public class AnonymousClass06H {
    public final AnonymousClass007 A00 = new AnonymousClass007(0);
    public final AnonymousClass007 A01 = new AnonymousClass007(0);

    public static AnonymousClass06H A00(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return A02(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return A02(arrayList);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            Log.w("MotionSpec", sb.toString(), e);
            return null;
        }
    }

    public static AnonymousClass06H A02(List list) {
        AnonymousClass06H r5 = new AnonymousClass06H();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                r5.A00.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = AnonymousClass064.A02;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = AnonymousClass064.A01;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = AnonymousClass064.A04;
                }
                AnonymousClass06I r6 = new AnonymousClass06I(interpolator, startDelay, duration);
                r6.A00 = objectAnimator.getRepeatCount();
                r6.A01 = objectAnimator.getRepeatMode();
                r5.A01.put(propertyName, r6);
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator must be an ObjectAnimator: ");
                sb.append(animator);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return r5;
    }

    public AnonymousClass06I A03(String str) {
        AnonymousClass007 r1 = this.A01;
        if (r1.get(str) != null) {
            return (AnonymousClass06I) r1.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass06H)) {
            return false;
        }
        return this.A01.equals(((AnonymousClass06H) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.A01);
        sb.append("}\n");
        return sb.toString();
    }

    public static AnonymousClass06H A01(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return A00(context, resourceId);
    }
}
