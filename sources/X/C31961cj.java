package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1cj  reason: invalid class name and case insensitive filesystem */
public class C31961cj {
    public final Set A00 = new HashSet();
    public final Set A01 = new HashSet();
    public final Set A02 = new HashSet();

    public void A01(Activity activity, Menu menu, C20810yC r12) {
        int A002;
        boolean z;
        boolean z2;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < menu.size(); i4++) {
            MenuItem item = menu.getItem(i4);
            if (item.isVisible()) {
                if (this.A02.contains(Integer.valueOf(item.getItemId()))) {
                    i2++;
                    item.setShowAsAction(0);
                } else {
                    i3++;
                    item.setShowAsAction(2);
                }
            }
        }
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int min = (Math.min(activity.getWindow().getDecorView().getWidth(), activity.getWindow().getDecorView().getHeight()) - (dimensionPixelSize * 2)) - (activity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved) * 2);
        if (i2 > 0) {
            i = activity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        }
        int i5 = min - i;
        if (i5 < i3 * dimensionPixelSize) {
            if (i2 == 0) {
                i5 -= activity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            }
            int i6 = i3 - (i5 / dimensionPixelSize);
            if (i6 > 1 || i2 > 0) {
                for (int size = menu.size() - 1; size >= 0 && i6 > 0; size--) {
                    MenuItem item2 = menu.getItem(size);
                    if (item2.isVisible() && !this.A02.contains(Integer.valueOf(item2.getItemId())) && !this.A01.contains(Integer.valueOf(item2.getItemId()))) {
                        item2.setShowAsAction(1);
                        i6--;
                    }
                }
            }
        }
        if (menu instanceof C016307a) {
            C016307a r2 = (C016307a) menu;
            r2.A05();
            if (AnonymousClass1MI.A02(r12, (C21000yV) null, 4497)) {
                boolean A012 = AnonymousClass1MI.A01(r12);
                HashSet hashSet = new HashSet();
                r2.A05();
                Iterator it = r2.A06.iterator();
                while (it.hasNext()) {
                    hashSet.add(Integer.valueOf(((C018707z) it.next()).getItemId()));
                }
                for (int i7 = 0; i7 < menu.size(); i7++) {
                    MenuItem item3 = menu.getItem(i7);
                    Drawable icon = item3.getIcon();
                    if (icon != null) {
                        if (hashSet.contains(Integer.valueOf(item3.getItemId()))) {
                            A002 = AnonymousClass00F.A00(activity, R.color.f6nameremoved);
                            z = false;
                        } else {
                            A002 = AnonymousClass00F.A00(activity, R.color.f6nameremoved);
                            z = true;
                        }
                        Drawable mutate = AnonymousClass08I.A01(icon).mutate();
                        AnonymousClass076.A06(mutate, A002);
                        if (A012) {
                            Set set = this.A00;
                            boolean contains = set.contains(Integer.valueOf(item3.getItemId()));
                            if (z) {
                                if (!contains) {
                                    set.add(Integer.valueOf(item3.getItemId()));
                                    z2 = false;
                                }
                                icon = mutate;
                            } else {
                                if (contains) {
                                    set.remove(Integer.valueOf(item3.getItemId()));
                                    z2 = true;
                                }
                                icon = mutate;
                            }
                            icon = AnonymousClass3UF.A05(activity, mutate, z2);
                        }
                        item3.setIcon(icon);
                    }
                }
            }
        }
    }

    public void A00(int i) {
        this.A02.add(Integer.valueOf(i));
    }
}
