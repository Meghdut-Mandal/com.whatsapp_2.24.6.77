package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: X.06T  reason: invalid class name */
public abstract class AnonymousClass06T {
    public static void A00(ColorStateList colorStateList, ImageView imageView) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        AnonymousClass06U.A01(colorStateList, imageView);
        if (i == 21 && (drawable = imageView.getDrawable()) != null && AnonymousClass06U.A00(imageView) != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public static void A01(PorterDuff.Mode mode, ImageView imageView) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        AnonymousClass06U.A02(mode, imageView);
        if (i == 21 && (drawable = imageView.getDrawable()) != null && AnonymousClass06U.A00(imageView) != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }
}
