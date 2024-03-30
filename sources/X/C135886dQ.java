package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;

/* renamed from: X.6dQ  reason: invalid class name and case insensitive filesystem */
public class C135886dQ implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ AnonymousClass6QH A02;

    public C135886dQ(View view, TextView textView, AnonymousClass6QH r3) {
        this.A02 = r3;
        this.A00 = view;
        this.A01 = textView;
    }

    public boolean onPreDraw() {
        View view = this.A00;
        int width = view.getWidth();
        if (width <= 0) {
            return true;
        }
        C36351kA.A1D(view, this);
        TextView textView = this.A01;
        int compoundPaddingLeft = width - (textView.getCompoundPaddingLeft() + textView.getCompoundPaddingRight());
        String A0u = C36371kC.A0u(textView);
        float textSize = textView.getTextSize();
        while (textSize > 1.0f && textView.getPaint().measureText(A0u) >= ((float) compoundPaddingLeft)) {
            textSize -= 1.0f;
            textView.setTextSize(textSize);
        }
        return true;
    }
}
