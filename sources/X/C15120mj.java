package X;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* renamed from: X.0mj  reason: invalid class name and case insensitive filesystem */
public class C15120mj implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C15120mj(AppBarLayout appBarLayout, C012505l r2, int i) {
        this.A02 = i;
        this.A00 = appBarLayout;
        this.A01 = r2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.A02 != 0) {
            AppBarLayout appBarLayout = (AppBarLayout) this.A00;
            float A002 = AnonymousClass000.A00(valueAnimator);
            ((C012505l) this.A01).A09(A002);
            Drawable drawable = appBarLayout.A04;
            if (drawable instanceof C012505l) {
                ((C012505l) drawable).A09(A002);
            }
            Iterator it = appBarLayout.A0N.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0A("onUpdate");
            }
            return;
        }
        C012505l r3 = (C012505l) this.A01;
        int A003 = (int) AnonymousClass000.A00(valueAnimator);
        r3.setAlpha(A003);
        Iterator it2 = ((AppBarLayout) this.A00).A0N.iterator();
        while (it2.hasNext()) {
            it2.next();
            ColorStateList colorStateList = r3.A01.A0B;
            if (colorStateList != null) {
                colorStateList.withAlpha(A003).getDefaultColor();
                throw AnonymousClass001.A0A("onUpdate");
            }
        }
    }
}
