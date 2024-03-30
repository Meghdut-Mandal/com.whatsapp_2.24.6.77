package X;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: X.07b  reason: invalid class name and case insensitive filesystem */
public final class C016407b extends C016307a {
    public final int A00;
    public final Class A01;

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01.getSimpleName());
        sb.append(" does not support submenus");
        throw new UnsupportedOperationException(sb.toString());
    }

    public C016407b(Context context, Class cls, int i) {
        super(context);
        this.A01 = cls;
        this.A00 = i;
    }

    public MenuItem A00(int i, int i2, int i3, CharSequence charSequence) {
        int size = size() + 1;
        int i4 = this.A00;
        if (size <= i4) {
            A07();
            MenuItem A002 = super.A00(i, i2, i3, charSequence);
            C018707z r2 = (C018707z) A002;
            r2.A02 = 4 | (r2.A02 & -5);
            A06();
            return A002;
        }
        String simpleName = this.A01.getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i4);
        sb.append(". Limit can be checked with ");
        sb.append(simpleName);
        sb.append("#getMaxItemCount()");
        throw new IllegalArgumentException(sb.toString());
    }
}
