package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.1mR  reason: invalid class name and case insensitive filesystem */
public class C37481mR extends View {
    public final Rect A00 = AnonymousClass001.A06();
    public final /* synthetic */ C64753Ph A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37481mR(Context context, C64753Ph r3) {
        super(context);
        this.A01 = r3;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C64753Ph r1 = this.A01;
        AnonymousClass2IM r2 = r1.A0D;
        C89004Uw r0 = r2.A0c;
        if ((r0 == null || r0.BPt()) && isSelected()) {
            StickerView stickerView = r1.A0A;
            Rect rect = this.A00;
            stickerView.getDrawingRect(rect);
            canvas.drawRect(rect, r2.A0d.BBz());
        }
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        StickerView stickerView = this.A01.A0A;
        int measuredHeight = stickerView.getMeasuredHeight();
        int measuredWidth = stickerView.getMeasuredWidth();
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(measuredWidth, size);
            } else {
                size = measuredWidth;
            }
        }
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(size2, measuredHeight);
            } else {
                size2 = measuredHeight;
            }
        }
        setMeasuredDimension(size, size2);
    }
}
