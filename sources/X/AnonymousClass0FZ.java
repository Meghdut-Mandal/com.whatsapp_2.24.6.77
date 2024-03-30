package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: X.0FZ  reason: invalid class name */
public class AnonymousClass0FZ extends C016307a implements SubMenu {
    public C016307a A00;
    public C018707z A01;

    public SubMenu setHeaderIcon(int i) {
        if (i > 0) {
            this.A01 = AnonymousClass00E.A00(this.A0N, i);
        }
        this.A02 = null;
        A0E(false);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        Resources resources = this.A0O;
        if (i > 0) {
            this.A05 = resources.getText(i);
        }
        this.A02 = null;
        A0E(false);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        if (view != null) {
            this.A02 = view;
            this.A05 = null;
            this.A01 = null;
        } else {
            this.A02 = null;
        }
        A0E(false);
        return this;
    }

    public C016307a A01() {
        return this.A00.A01();
    }

    public String A03() {
        int itemId;
        C018707z r0 = this.A01;
        if (r0 == null || (itemId = r0.getItemId()) == 0) {
            return null;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("android:menu:actionviewstates");
        return AnonymousClass000.A0r(":", A0u, itemId);
    }

    public void A0C(AnonymousClass02T r2) {
        this.A00.A0C(r2);
    }

    public boolean A0G() {
        return this.A00.A0G();
    }

    public boolean A0H() {
        return this.A00.A0H();
    }

    public boolean A0I() {
        return this.A00.A0I();
    }

    public boolean A0L(C018707z r2) {
        return this.A00.A0L(r2);
    }

    public boolean A0M(C018707z r2) {
        return this.A00.A0M(r2);
    }

    public void setGroupDividerEnabled(boolean z) {
        this.A00.setGroupDividerEnabled(z);
    }

    public SubMenu setIcon(int i) {
        this.A01.setIcon(i);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.A00.setQwertyMode(z);
    }

    public AnonymousClass0FZ(Context context, C016307a r2, C018707z r3) {
        super(context);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean A0J(MenuItem menuItem, C016307a r4) {
        if (super.A0J(menuItem, r4) || this.A00.A0J(menuItem, r4)) {
            return true;
        }
        return false;
    }

    public MenuItem getItem() {
        return this.A01;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        if (drawable != null) {
            this.A01 = drawable;
        }
        this.A02 = null;
        A0E(false);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.A05 = charSequence;
        }
        this.A02 = null;
        A0E(false);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.A01.setIcon(drawable);
        return this;
    }
}
