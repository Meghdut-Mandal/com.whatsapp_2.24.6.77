package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* renamed from: X.0Yu  reason: invalid class name and case insensitive filesystem */
public abstract class C07670Yu {
    public static ColorStateList A00(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    public static void A01(ColorStateList colorStateList, MenuItem menuItem) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void A02(PorterDuff.Mode mode, MenuItem menuItem) {
        menuItem.setIconTintMode(mode);
    }

    public static void A05(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void A06(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void A03(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static void A04(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }
}
