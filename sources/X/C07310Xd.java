package X;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* renamed from: X.0Xd  reason: invalid class name and case insensitive filesystem */
public abstract class C07310Xd {
    public static PrecomputedText.Params A00(TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static String[] A02(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static void A01(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }
}
