package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.biz.catalog.view.widgets.QuantitySelector;

/* renamed from: X.5cS  reason: invalid class name and case insensitive filesystem */
public class C111545cS implements ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;

    public C111545cS(Object obj, int i, int i2, int i3) {
        this.A03 = i3;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        QuantitySelector quantitySelector;
        int i2;
        switch (this.A03) {
            case 0:
                quantitySelector = (QuantitySelector) this.A02;
                int i3 = this.A00;
                i = this.A01;
                i2 = C36361kB.A01(valueAnimator);
                if (i2 == i3) {
                    quantitySelector.A0B = true;
                }
                ViewGroup.LayoutParams layoutParams = quantitySelector.getLayoutParams();
                layoutParams.width = i2;
                quantitySelector.setLayoutParams(layoutParams);
                TextView textView = quantitySelector.A0F;
                if (i2 < (textView.getMeasuredWidth() * 2) + i + (((i - textView.getMeasuredWidth()) / 2) / 2)) {
                    QuantitySelector.A01(quantitySelector);
                    break;
                }
                break;
            case 1:
                quantitySelector = (QuantitySelector) this.A02;
                int i4 = this.A00;
                i = this.A01;
                i2 = C36361kB.A01(valueAnimator);
                if (i2 == i4) {
                    quantitySelector.A0B = true;
                }
                ViewGroup.LayoutParams layoutParams2 = quantitySelector.getLayoutParams();
                layoutParams2.width = i2;
                quantitySelector.setLayoutParams(layoutParams2);
                int measuredWidth = quantitySelector.A0G.getMeasuredWidth();
                TextView textView2 = quantitySelector.A0F;
                if (i2 > i4 + (textView2.getMeasuredWidth() * 2) + (((measuredWidth - textView2.getMeasuredWidth()) / 2) / 2)) {
                    QuantitySelector.A02(quantitySelector);
                    break;
                }
                break;
            default:
                int i5 = this.A00;
                int i6 = this.A01;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                ((ViewGroup.MarginLayoutParams) this.A02).setMargins(0, (int) ((animatedFraction * ((float) i5)) + ((1.0f - animatedFraction) * ((float) i6))), 0, 0);
                return;
        }
        if (i2 == i) {
            quantitySelector.A0B = false;
            quantitySelector.A02.removeAllUpdateListeners();
        }
    }
}
