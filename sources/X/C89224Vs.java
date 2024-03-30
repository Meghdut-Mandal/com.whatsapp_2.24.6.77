package X;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;

/* renamed from: X.4Vs  reason: invalid class name and case insensitive filesystem */
public class C89224Vs extends C67243Zb {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C89224Vs(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = str;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.A03 != 0) {
            TextView textView = (TextView) this.A01;
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = -2;
            textView.setLayoutParams(layoutParams);
            textView.setText(this.A02);
            textView.clearAnimation();
            ((AnonymousClass28d) ((AnonymousClass75A) this.A00).A02).A0M = true;
            return;
        }
        TextView textView2 = (TextView) this.A00;
        ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
        layoutParams2.width = -2;
        textView2.setLayoutParams(layoutParams2);
        textView2.clearAnimation();
        Object text = textView2.getText();
        if (text == null) {
            text = "";
        }
        if (AnonymousClass00C.A0J(text.toString(), this.A01.toString())) {
            textView2.setText(C36371kC.A0y(this.A02));
        }
    }
}
