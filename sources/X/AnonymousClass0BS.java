package X;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* renamed from: X.0BS  reason: invalid class name */
public class AnonymousClass0BS extends Drawable.ConstantState {
    public AnimatorSet A00;
    public AnonymousClass008 A01;
    public C010804n A02;
    public ArrayList A03;

    public Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    public int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
