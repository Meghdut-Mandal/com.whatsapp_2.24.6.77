package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: X.3t7  reason: invalid class name and case insensitive filesystem */
public class C79063t7 implements C88604Ti {
    public void BsF(TextView textView) {
        textView.setBreakStrategy(0);
    }

    public StaticLayout B4e(TextView textView, CharSequence charSequence, int i) {
        Layout layout = textView.getLayout();
        return StaticLayout.Builder.obtain(AnonymousClass14B.A02(charSequence), 0, charSequence.length(), textView.getPaint(), i).setAlignment(layout.getAlignment()).setLineSpacing(layout.getSpacingAdd(), layout.getSpacingMultiplier()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).build();
    }
}
