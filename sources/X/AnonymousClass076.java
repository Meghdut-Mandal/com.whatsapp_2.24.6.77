package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.076  reason: invalid class name */
public abstract class AnonymousClass076 {
    public static ColorFilter A00(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static boolean A08(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static void A01(ColorStateList colorStateList, Drawable drawable) {
        drawable.setTintList(colorStateList);
    }

    public static void A03(Resources.Theme theme, Drawable drawable) {
        drawable.applyTheme(theme);
    }

    public static void A04(PorterDuff.Mode mode, Drawable drawable) {
        drawable.setTintMode(mode);
    }

    public static void A06(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void A05(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void A02(Resources.Theme theme, Resources resources, Drawable drawable, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static void A07(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }
}
