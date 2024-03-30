package X;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import java.lang.ref.Reference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.3U9  reason: invalid class name */
public abstract class AnonymousClass3U9 {
    public static final boolean A00 = C36371kC.A1T(Build.VERSION.SDK_INT, 22);

    public void A0B() {
        MediaViewBaseFragment mediaViewBaseFragment = ((AnonymousClass2XU) this).A06;
        if (mediaViewBaseFragment.A1c() != null) {
            mediaViewBaseFragment.A0i().overridePendingTransition(0, 0);
        }
    }

    public void A0C(Bundle bundle) {
        AnonymousClass2XU r5 = (AnonymousClass2XU) this;
        MediaViewBaseFragment mediaViewBaseFragment = r5.A06;
        if (mediaViewBaseFragment.A1c() == null) {
            mediaViewBaseFragment.A1g();
            return;
        }
        AnonymousClass2UK r3 = mediaViewBaseFragment.A08;
        Object A1e = mediaViewBaseFragment.A1e(r3.getCurrentItem());
        if (C36341k9.A04(mediaViewBaseFragment.A0a()) != r5.A03 || A1e == null || !A1e.equals(mediaViewBaseFragment.A1d())) {
            r3.setPivotX(C36441kJ.A01(r3) / 2.0f);
            r3.setPivotY(C36441kJ.A02(r3) / 2.0f);
            r5.A02 = 0;
            r5.A04 = 0;
        }
        r3.animate().setDuration(240).scaleX(r5.A01).scaleY(r5.A00).translationX((float) r5.A02).translationY((float) r5.A04).alpha(0.0f).setListener(new AnonymousClass4VL(r5, 15));
        Drawable drawable = r5.A05;
        int[] A1O = C36441kJ.A1O();
        // fill-array-data instruction
        A1O[0] = 255;
        A1O[1] = 0;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(drawable, "alpha", A1O);
        ofInt.setDuration(240);
        C36391kE.A13(ofInt);
        ofInt.start();
    }

    public void A0D(Bundle bundle, AnonymousClass4R6 r12) {
        AnonymousClass2XU r5 = (AnonymousClass2XU) this;
        MediaViewBaseFragment mediaViewBaseFragment = r5.A06;
        AnonymousClass2UK r3 = mediaViewBaseFragment.A08;
        int i = bundle.getInt("x", 0);
        int i2 = bundle.getInt("y", 0);
        int i3 = bundle.getInt("width", 0);
        int i4 = bundle.getInt("height", 0);
        mediaViewBaseFragment.A03.setVisibility(8);
        mediaViewBaseFragment.A0G = false;
        View findViewById = mediaViewBaseFragment.A0d().findViewById(R.id.background);
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        r5.A05 = colorDrawable;
        findViewById.setBackground(colorDrawable);
        r3.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass3ZX(r3, r12, r5, i, i2, i3, i4));
    }

    public static Bundle A04(Activity activity, View view) {
        if (view == null) {
            return null;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        A0A(C36361kB.A0C(activity), A0I);
        int[] A1O = C36441kJ.A1O();
        view.getLocationOnScreen(A1O);
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("x", A1O[0]);
        A07.putInt("y", A1O[1]);
        A07.putInt("width", view.getWidth());
        A07.putInt("height", view.getHeight());
        A07.putStringArrayList("visible_shared_elements", A0I);
        return A07;
    }

    public static Bundle A05(Activity activity, View view, String str) {
        if (!A00 || view == null) {
            return null;
        }
        return new C03540Gb(AnonymousClass0PK.A00(activity, view, str)).A00.toBundle();
    }

    public static void A07(Activity activity) {
        StringBuilder sb;
        String str;
        if (A00) {
            Class<C018607y> cls = C018607y.class;
            try {
                Field declaredField = cls.getDeclaredField("sRunningTransitions");
                declaredField.setAccessible(true);
                ThreadLocal threadLocal = (ThreadLocal) declaredField.get(cls);
                if (threadLocal.get() != null && ((Reference) threadLocal.get()).get() != null) {
                    AnonymousClass007 r2 = (AnonymousClass007) ((Reference) threadLocal.get()).get();
                    View A0C = C36361kB.A0C(activity);
                    if (r2.containsKey(A0C)) {
                        r2.remove(A0C);
                    }
                }
            } catch (NoSuchFieldException e) {
                e = e;
                sb = AnonymousClass000.A0u();
                str = "MediaViewTransitionHelper/removeActivityFromTransitionManager/NoSuchFieldException ";
                C36321k7.A1W(str, sb, e);
            } catch (IllegalAccessException e2) {
                e = e2;
                sb = AnonymousClass000.A0u();
                str = "MediaViewTransitionHelper/removeActivityFromTransitionManager/IllegalAccessException ";
                C36321k7.A1W(str, sb, e);
            } catch (NullPointerException e3) {
                e = e3;
                sb = AnonymousClass000.A0u();
                str = "MediaViewTransitionHelper/removeActivityFromTransitionManager/NullPointerException ";
                C36321k7.A1W(str, sb, e);
            }
        }
    }

    public static void A08(Context context, Intent intent, View view) {
        Activity A01 = C18860tw.A01(context, AnonymousClass01L.class);
        if (A01 != null) {
            intent.putExtra("animation_bundle", A04(A01, view));
        }
    }

    public static void A09(Context context, Intent intent, View view, AnonymousClass3CG r5, String str) {
        AnonymousClass01L r1 = (AnonymousClass01L) C18860tw.A01(context, AnonymousClass01L.class);
        if (!A00 || r1 == null) {
            context.startActivity(intent);
            if (r1 != null) {
                r1.overridePendingTransition(0, 0);
                return;
            }
            return;
        }
        AnonymousClass2XV.A02(intent, view, r1, r5, str);
    }

    public static View A06(View view, String str) {
        if (str.equals(C011004s.A03(view))) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View A06 = A06(viewGroup.getChildAt(i), str);
                if (A06 != null) {
                    return A06;
                }
            }
        }
        return null;
    }

    public static void A0A(View view, Collection collection) {
        if (!TextUtils.isEmpty(C011004s.A03(view))) {
            collection.add(C011004s.A03(view));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                A0A(viewGroup.getChildAt(i), collection);
            }
        }
    }
}
