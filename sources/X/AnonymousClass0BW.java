package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.0BW  reason: invalid class name */
public class AnonymousClass0BW extends Drawable.ConstantState {
    public final Drawable.ConstantState A00;

    public boolean canApplyTheme() {
        return this.A00.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        AnonymousClass0BQ r2 = new AnonymousClass0BQ();
        Drawable newDrawable = this.A00.newDrawable(resources, theme);
        r2.A00 = newDrawable;
        newDrawable.setCallback(r2.A05);
        return r2;
    }

    public AnonymousClass0BW(Drawable.ConstantState constantState) {
        this.A00 = constantState;
    }

    public Drawable newDrawable(Resources resources) {
        AnonymousClass0BQ r2 = new AnonymousClass0BQ();
        Drawable newDrawable = this.A00.newDrawable(resources);
        r2.A00 = newDrawable;
        newDrawable.setCallback(r2.A05);
        return r2;
    }

    public Drawable newDrawable() {
        AnonymousClass0BQ r2 = new AnonymousClass0BQ();
        Drawable newDrawable = this.A00.newDrawable();
        r2.A00 = newDrawable;
        newDrawable.setCallback(r2.A05);
        return r2;
    }
}
