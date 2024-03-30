package X;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: X.070  reason: invalid class name */
public class AnonymousClass070 extends C016206z {
    public void A00(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    public boolean A01(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
