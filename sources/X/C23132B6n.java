package X;

import android.graphics.Paint;

/* renamed from: X.B6n  reason: case insensitive filesystem */
public class C23132B6n extends Paint {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23132B6n(AnonymousClass81H r2, int i) {
        super(1);
        Paint.Style style;
        this.A01 = i;
        this.A00 = r2;
        if (i != 0) {
            style = Paint.Style.STROKE;
        } else {
            super(1);
            style = Paint.Style.FILL;
        }
        setStyle(style);
    }
}
