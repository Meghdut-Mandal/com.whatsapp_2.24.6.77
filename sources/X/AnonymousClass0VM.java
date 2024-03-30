package X;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.MenuItem;

/* renamed from: X.0VM  reason: invalid class name */
public abstract class AnonymousClass0VM {
    public static ColorStateList A00(MenuItem menuItem) {
        if (menuItem instanceof AnonymousClass07L) {
            return ((AnonymousClass07L) menuItem).getIconTintList();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return C07670Yu.A00(menuItem);
        }
        return null;
    }

    public static void A01(ColorStateList colorStateList, MenuItem menuItem) {
        if (menuItem instanceof AnonymousClass07L) {
            ((AnonymousClass07L) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C07670Yu.A01(colorStateList, menuItem);
        }
    }
}
