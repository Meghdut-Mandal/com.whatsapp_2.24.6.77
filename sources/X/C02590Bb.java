package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.0Bb  reason: invalid class name and case insensitive filesystem */
public class C02590Bb extends Drawable.ConstantState {
    public final Drawable.ConstantState A00;

    public boolean canApplyTheme() {
        return this.A00.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C010804n r1 = new C010804n();
        r1.A00 = this.A00.newDrawable(resources, theme);
        return r1;
    }

    public C02590Bb(Drawable.ConstantState constantState) {
        this.A00 = constantState;
    }

    public Drawable newDrawable(Resources resources) {
        C010804n r1 = new C010804n();
        r1.A00 = this.A00.newDrawable(resources);
        return r1;
    }

    public Drawable newDrawable() {
        C010804n r1 = new C010804n();
        r1.A00 = this.A00.newDrawable();
        return r1;
    }
}
