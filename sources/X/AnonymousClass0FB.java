package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.whatsapp.R;

/* renamed from: X.0FB  reason: invalid class name */
public class AnonymousClass0FB extends RatingBar {
    public final AnonymousClass0Y5 A00;

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.A00.A00;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AnonymousClass0FB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f4nameremoved);
        C015606t.A04(this);
        AnonymousClass0Y5 r0 = new AnonymousClass0Y5(this);
        this.A00 = r0;
        r0.A02(attributeSet, R.attr.f4nameremoved);
    }
}
