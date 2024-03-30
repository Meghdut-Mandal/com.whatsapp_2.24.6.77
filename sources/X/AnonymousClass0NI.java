package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.0NI  reason: invalid class name */
public final class AnonymousClass0NI extends AnonymousClass081 {
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)));
        }
    }

    public AnonymousClass0NI(Context context) {
        super(context);
    }

    public int getItemDefaultMarginResId() {
        return R.dimen.f7nameremoved;
    }

    public int getItemLayoutResId() {
        return R.layout.f9nameremoved;
    }
}
