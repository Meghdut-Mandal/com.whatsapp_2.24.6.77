package X;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: X.1gQ  reason: invalid class name and case insensitive filesystem */
public abstract class C34081gQ {
    public static int A00(View view, C18820ts r5) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        if (!C18820ts.A00(r5).A06) {
            return i;
        }
        AnonymousClass1R3 r1 = AnonymousClass1R3.A00;
        AnonymousClass00C.A0D(r1, 0);
        return (r1.B3H(C24801Dv.A00(view.getContext())).A00().width() - view.getWidth()) + i;
    }

    public static void A03(View view) {
        view.setBackgroundResource(0);
        view.postDelayed(new C35751jC(view, 12), 1);
    }

    public static void A06(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = i2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        int i7 = i5 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        int mode = View.MeasureSpec.getMode(i);
        int max = Math.max(0, View.MeasureSpec.getSize(i) - i6);
        if (i3 > 0) {
            max = Math.min(max, i3);
        }
        view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(max, mode), 0, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i4) - i7), View.MeasureSpec.getMode(i4)), 0, marginLayoutParams.height));
    }

    public static void A01(View view) {
        view.setOutlineProvider(new C37571mr());
        view.setClipToOutline(true);
    }

    public static void A02(View view) {
        TypedValue typedValue = new TypedValue();
        view.getContext().getTheme().resolveAttribute(16843534, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
    }

    public static void A07(LottieAnimationView lottieAnimationView, int i) {
        lottieAnimationView.A09.A0G(new C201629k0("**"), new AnonymousClass81K(lottieAnimationView, new C208699yh(i)), B4R.A01);
    }

    public static void A04(View view, float f) {
        if (!view.getClipToOutline()) {
            view.setClipToOutline(true);
        }
        view.setOutlineProvider(new C37591mt(f));
    }

    public static void A05(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
        }
    }
}
