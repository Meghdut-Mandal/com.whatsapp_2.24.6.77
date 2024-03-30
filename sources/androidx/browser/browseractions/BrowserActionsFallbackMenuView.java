package androidx.browser.browseractions;

import X.C36361kB;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {
    public final int A00 = getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
    public final int A01 = getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(C36361kB.A0B(this).widthPixels - (this.A01 * 2), this.A00), 1073741824), i2);
    }
}
