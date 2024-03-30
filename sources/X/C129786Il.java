package X;

import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.6Il  reason: invalid class name and case insensitive filesystem */
public abstract class C129786Il {
    public static final long A00;
    public static final C91054bO A01 = new C91054bO();

    static {
        long j = (long) 0;
        A00 = C90474aD.A0C(j, j);
    }

    public static final Paint.FontMetricsInt A00(TextDirectionHeuristic textDirectionHeuristic, TextPaint textPaint, AnonymousClass6WP r21, C135256cP[] r22) {
        boolean z;
        AnonymousClass6WP r3 = r21;
        int i = r3.A04 - 1;
        Layout layout = r3.A08;
        if (layout.getLineStart(i) != layout.getLineEnd(i) || r22.length == 0) {
            return null;
        }
        SpannableString A0O = C36441kJ.A0O("​");
        C135256cP r2 = r22[0];
        int length = A0O.length();
        if (i == 0 || !r2.A09) {
            z = r2.A09;
        } else {
            z = false;
        }
        A0O.setSpan(new C135256cP(r2.A06, r2.A07, length, z, r2.A09), 0, A0O.length(), 33);
        int length2 = A0O.length();
        boolean z2 = r3.A0B;
        StaticLayout B3n = C112495dz.A00.B3n(new C124955z4(C113585fm.A00, textDirectionHeuristic, textPaint, (TextUtils.TruncateAt) null, A0O, length2, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0, 0, 0, 0, z2));
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = B3n.getLineAscent(0);
        fontMetricsInt.descent = B3n.getLineDescent(0);
        fontMetricsInt.top = B3n.getLineTop(0);
        fontMetricsInt.bottom = B3n.getLineBottom(0);
        return fontMetricsInt;
    }
}
