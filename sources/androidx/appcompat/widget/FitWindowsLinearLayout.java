package androidx.appcompat.widget;

import X.C15600ng;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout {
    public C15600ng A00;

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C15600ng r1) {
        this.A00 = r1;
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }
}