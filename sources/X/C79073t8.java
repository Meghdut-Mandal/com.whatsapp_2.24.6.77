package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: X.3t8  reason: invalid class name and case insensitive filesystem */
public class C79073t8 implements C88604Ti {
    public void BsF(TextView textView) {
    }

    public StaticLayout B4e(TextView textView, CharSequence charSequence, int i) {
        Layout layout = textView.getLayout();
        return new StaticLayout(charSequence, textView.getPaint(), i, layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), true);
    }
}
