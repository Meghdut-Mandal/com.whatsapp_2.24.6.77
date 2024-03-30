package X;

import android.graphics.Paint;
import android.text.Layout;

/* renamed from: X.6GE  reason: invalid class name */
public abstract class AnonymousClass6GE {
    public static final float A01(Paint paint, Layout layout, int i) {
        float width;
        float width2;
        C91054bO r0 = C129786Il.A01;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != -1 || ((float) layout.getWidth()) >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i))) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null || C90524aI.A03(paragraphAlignment, C112505e0.A00) != 1) {
            width = ((float) layout.getWidth()) - layout.getLineRight(i);
            width2 = ((float) layout.getWidth()) - lineRight;
        } else {
            width = ((float) layout.getWidth()) - layout.getLineRight(i);
            width2 = (((float) layout.getWidth()) - lineRight) / 2.0f;
        }
        return width - width2;
    }

    public static final float A00(Paint paint, Layout layout, int i) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        C91054bO r0 = C129786Il.A01;
        if (!AnonymousClass000.A1R(layout.getEllipsisCount(i)) || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i)) - lineLeft) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null || C90524aI.A03(paragraphAlignment, C112505e0.A00) != 1) {
            abs = Math.abs(lineLeft);
            width = ((float) layout.getWidth()) - primaryHorizontal;
        } else {
            abs = Math.abs(lineLeft);
            width = (((float) layout.getWidth()) - primaryHorizontal) / 2.0f;
        }
        return abs + width;
    }
}
