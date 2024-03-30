package X;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.ActionMode;
import android.widget.TextView;
import java.util.Objects;

/* renamed from: X.088  reason: invalid class name */
public abstract class AnonymousClass088 {
    public static ActionMode.Callback A00(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 27 || (callback instanceof C08950ba) || callback == null) {
            return callback;
        }
        return new C08950ba(callback, textView);
    }

    public static void A03(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 27) {
            AnonymousClass0VU.A00(textView, i);
        } else if (textView instanceof C015306p) {
            ((C015306p) textView).setAutoSizeTextTypeWithDefaults(i);
        }
    }

    public static void A06(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static void A07(TextView textView, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 27) {
            AnonymousClass0VU.A01(textView, i, i2, i3, i4);
        } else if (textView instanceof C015306p) {
            ((C015306p) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }

    public static void A01(ColorStateList colorStateList, TextView textView) {
        Objects.requireNonNull(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C07640Yr.A02(colorStateList, textView);
        } else if (textView instanceof C015406q) {
            ((C015406q) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void A02(PorterDuff.Mode mode, TextView textView) {
        Objects.requireNonNull(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C07640Yr.A03(mode, textView);
        } else if (textView instanceof C015406q) {
            ((C015406q) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void A04(TextView textView, int i) {
        int i2;
        AnonymousClass0YM.A00(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C07310Xd.A01(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (AnonymousClass0Q9.A00(textView)) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void A05(TextView textView, int i) {
        int i2;
        AnonymousClass0YM.A00(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (AnonymousClass0Q9.A00(textView)) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }
}
