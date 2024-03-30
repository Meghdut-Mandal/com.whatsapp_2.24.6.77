package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt$descendants$1;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Iterator;

/* renamed from: X.2vb  reason: invalid class name and case insensitive filesystem */
public abstract class C56022vb {
    public static final void A00(ColorStateList colorStateList, Menu menu, C27981Qp r9, int i) {
        C018707z r0;
        View actionView;
        C16970qV r2;
        ColorStateList A00;
        C36321k7.A0v(menu, 0, colorStateList);
        int size = menu.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = menu.getItem(i2);
            Drawable icon = item.getIcon();
            if (icon != null && (!(icon instanceof InsetDrawable) || ((InsetDrawable) icon).getDrawable() != null)) {
                AnonymousClass08I.A04(icon);
            }
            if ((item instanceof C018707z) && (r0 = (C018707z) item) != null && (r0.A02 & 32) == 32) {
                if (item.isEnabled() && ((A00 = AnonymousClass0VM.A00(item)) == null || A00.getDefaultColor() != colorStateList.getDefaultColor())) {
                    AnonymousClass0VM.A01(colorStateList, item);
                }
                View actionView2 = item.getActionView();
                if (actionView2 != null && ((actionView = item.getActionView()) == null || !C36341k9.A1Z(actionView.getTag(R.id.skipMenuItemTint)))) {
                    View actionView3 = item.getActionView();
                    if (actionView3 != null) {
                        actionView3.setTag(R.id.skipMenuItemTint, true);
                    }
                    if (actionView2 instanceof ViewGroup) {
                        r2 = new C18650tV(new ViewGroupKt$descendants$1((ViewGroup) actionView2, (C023509x) null), 1);
                    } else {
                        r2 = C12850il.A00;
                    }
                    Iterator it = C15060md.A00(C15060md.A04(new C18660tW(new View[]{actionView2}, 1), r2)).iterator();
                    while (it.hasNext()) {
                        View A0K = C36431kI.A0K(it);
                        if (A0K instanceof WDSButton) {
                            if (r9 != null) {
                                ((WDSButton) A0K).setVariant(r9);
                            }
                        } else if (A0K instanceof ImageView) {
                            ((ImageView) A0K).setImageTintList(colorStateList);
                        } else if (A0K instanceof TextView) {
                            ((TextView) A0K).setTextColor(i);
                        }
                    }
                }
            }
        }
    }
}
