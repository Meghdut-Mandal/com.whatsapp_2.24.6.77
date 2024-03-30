package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: X.1qx  reason: invalid class name and case insensitive filesystem */
public class C39041qx extends AppCompatImageView implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public C39041qx(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, (int) (((double) ((float) defaultSize)) * 1.5d));
    }
}
