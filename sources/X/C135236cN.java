package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* renamed from: X.6cN  reason: invalid class name and case insensitive filesystem */
public final class C135236cN implements LeadingMarginSpan {
    public int getLeadingMargin(boolean z) {
        return 0;
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        Layout layout2 = layout;
        if (layout != null && paint != null && (lineForOffset = layout2.getLineForOffset(i6)) == layout2.getLineCount() - 1) {
            C91054bO r0 = C129786Il.A01;
            if (layout2.getEllipsisCount(lineForOffset) > 0) {
                float A00 = AnonymousClass6GE.A00(paint, layout2, lineForOffset) + AnonymousClass6GE.A01(paint, layout2, lineForOffset);
                if (A00 != 0.0f) {
                    AnonymousClass00C.A0B(canvas);
                    canvas.translate(A00, 0.0f);
                }
            }
        }
    }
}
