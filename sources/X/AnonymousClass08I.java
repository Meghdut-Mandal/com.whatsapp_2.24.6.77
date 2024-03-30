package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.08I  reason: invalid class name */
public abstract class AnonymousClass08I {
    public static Method A00;
    public static Method A01;
    public static boolean A02;
    public static boolean A03;

    public static int A00(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass0VJ.A00(drawable);
        }
        if (!A02) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                A00 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            A02 = true;
        }
        Method method = A00;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                A00 = null;
            }
        }
        return 0;
    }

    public static Drawable A01(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 || (drawable instanceof C010604l)) {
            return drawable;
        }
        return new C03240Dt(drawable);
    }

    public static void A04(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable drawable2;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            drawable2 = A03((InsetDrawable) drawable);
        } else if (drawable instanceof AnonymousClass077) {
            drawable2 = ((C03240Dt) ((AnonymousClass077) drawable)).A00;
        } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Drawable A022 = A02(drawableContainerState, i);
                if (A022 != null) {
                    A04(A022);
                }
            }
            return;
        } else {
            return;
        }
        A04(drawable2);
    }

    public static boolean A05(int i, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass0VJ.A01(i, drawable);
        }
        if (!A03) {
            Class<Drawable> cls = Drawable.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                A01 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            A03 = true;
        }
        Method method = A01;
        if (method != null) {
            try {
                method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                return true;
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                A01 = null;
            }
        }
        return false;
    }

    public static Drawable A02(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
        return drawableContainerState.getChild(i);
    }

    public static Drawable A03(InsetDrawable insetDrawable) {
        return insetDrawable.getDrawable();
    }
}
