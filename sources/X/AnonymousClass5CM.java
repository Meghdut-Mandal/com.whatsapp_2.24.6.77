package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.R;
import java.util.HashSet;

/* renamed from: X.5CM  reason: invalid class name */
public final class AnonymousClass5CM extends AnonymousClass5CN {
    public ImageView.ScaleType getDefaultScaleType() {
        return ImageView.ScaleType.FIT_CENTER;
    }

    public void setImageDrawable(Drawable drawable) {
        if (!isSelected() && !isPressed()) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            if (drawable != null) {
                drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
        }
        super.setImageDrawable(drawable);
    }

    public void setSelected(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float f;
        super.setSelected(z);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof LinearLayout.LayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            marginLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        }
        Resources A0F = C36341k9.A0F(this);
        if (!z) {
            int dimensionPixelSize = A0F.getDimensionPixelSize(R.dimen.f7nameremoved);
            int dimensionPixelSize2 = C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
            setMaxWidth(C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved));
            marginLayoutParams.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, 0);
            f = 0.6f;
        } else {
            setMaxWidth(A0F.getDimensionPixelSize(R.dimen.f7nameremoved));
            marginLayoutParams.setMargins(0, 0, 0, 0);
            f = 1.0f;
        }
        setAlpha(f);
        this.A01 = getMaxWidth();
        setLayoutParams(marginLayoutParams);
    }

    public AnonymousClass5CM(Context context, C124985z8 r2, HashSet hashSet, int i) {
        super(context, r2, hashSet, i);
    }
}
