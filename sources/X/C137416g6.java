package X;

import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: X.6g6  reason: invalid class name and case insensitive filesystem */
public final class C137416g6 implements C158827iI {
    public int A00;
    public Paint A01;
    public Shader A02;
    public C114365h6 A03;

    public void Bq5(float f) {
        this.A01.setAlpha((int) ((float) Math.rint((double) (f * 255.0f))));
    }

    public void BqV(long j) {
        this.A01.setColor(C90514aH.A0D(C133336Xx.A06(C114185go.A0G, j)));
    }

    public C137416g6(Paint paint) {
        this.A01 = paint;
        this.A00 = 3;
    }

    public C137416g6() {
        this(C36441kJ.A0L(7));
    }
}
