package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import com.whatsapp.R;
import com.whatsapp.voipcalling.CallInfo;

/* renamed from: X.3UE  reason: invalid class name */
public abstract class AnonymousClass3UE {
    public static int A01(Resources resources, int i) {
        if (i == -1) {
            return resources.getColor(R.color.f6nameremoved);
        }
        int[] intArray = resources.getIntArray(R.array.f3nameremoved);
        return intArray[i % intArray.length];
    }

    public static void A06(View view, String str, String str2) {
        A07(view, str, str2, false);
    }

    public static int A00(Activity activity) {
        Point point = new Point();
        Rect A06 = AnonymousClass001.A06();
        C36321k7.A0K(activity, point);
        C36361kB.A0C(activity).getWindowVisibleDisplayFrame(A06);
        return point.y - A06.top;
    }

    public static int A02(C107265Nh r4) {
        int i = r4.A07;
        if ((r4.A0C != null || !r4.A04.A03) && i == 5) {
            return R.color.f6nameremoved;
        }
        return R.color.f6nameremoved;
    }

    public static AnonymousClass3XL A04(Context context, String str, boolean z) {
        if (str == null) {
            return null;
        }
        int i = R.string.f12nameremoved;
        if (z) {
            i = R.string.f12nameremoved;
        }
        return new AnonymousClass3XL(C36391kE.A0v(context, AnonymousClass3UD.A05(str, z), AnonymousClass001.A0L(), 0, i), context.getString(R.string.f12nameremoved), z);
    }

    public static void A07(View view, String str, String str2, boolean z) {
        C012005e.A0V(view, new C39271rc(view, str, str2, z));
    }

    public static AnimationSet A03(View view) {
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.f1nameremoved);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(view.getContext(), R.anim.f1nameremoved);
        Animation loadAnimation3 = AnimationUtils.loadAnimation(view.getContext(), R.anim.f1nameremoved);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(loadAnimation);
        animationSet.addAnimation(loadAnimation3);
        animationSet.addAnimation(loadAnimation2);
        animationSet.setRepeatMode(1);
        animationSet.setRepeatCount(-1);
        animationSet.setStartOffset(750);
        animationSet.setAnimationListener(new C89214Vr(animationSet, view, 0));
        return animationSet;
    }

    public static void A05(Context context, View view) {
        ShapeDrawable A0F = C36411kG.A0F();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.f4nameremoved, typedValue, true);
        A0F.getPaint().setColor(typedValue.data);
        C011504z.A04(A0F, view);
    }

    public static void A08(View view, boolean z) {
        view.setEnabled(z);
        float f = 0.4f;
        if (z) {
            f = 1.0f;
        }
        view.setAlpha(f);
    }

    public static boolean A09(C20810yC r3, AnonymousClass13J r4, CallInfo callInfo) {
        int connectedParticipantsCount = callInfo.getConnectedParticipantsCount();
        if (!callInfo.videoEnabled || !r4.BMU() || connectedParticipantsCount > r3.A07(3694)) {
            return false;
        }
        if (((AnonymousClass13K) r4).A02.A07(3171) >= 2 || connectedParticipantsCount <= 2) {
            return true;
        }
        return false;
    }
}
