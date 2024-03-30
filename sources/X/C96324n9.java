package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4n9  reason: invalid class name and case insensitive filesystem */
public class C96324n9 extends C02910Cj {
    public boolean A00 = false;
    public float A01;
    public C96454nM A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Rect A07;
    public final C123665ws A08;
    public final boolean A09;
    public final boolean A0A;
    public final int A0B;
    public final int A0C;
    public final Paint A0D = C36441kJ.A0K();
    public final RectF A0E = C36441kJ.A0N();
    public final RectF A0F = C36441kJ.A0N();

    public void A04(Canvas canvas, AnonymousClass0C4 r13, RecyclerView recyclerView) {
        RectF rectF;
        RectF rectF2;
        float f;
        int i;
        Rect rect;
        float width;
        C96454nM r1 = this.A02;
        if (r1 != null && !this.A00 && !r1.A04 && r1.A02) {
            AnonymousClass75C r2 = new AnonymousClass75C((Object) r1, (Object) recyclerView, 24);
            r1.A01 = r2;
            recyclerView.postDelayed(r2, 1500);
        }
        boolean z = true;
        this.A00 = true;
        if (this.A01 != 0.0f) {
            AnonymousClass0CP layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                boolean A1S = AnonymousClass000.A1S(AnonymousClass04F.A01(linearLayoutManager.A07), 1);
                if (linearLayoutManager.A00 == 1) {
                    int A0w = linearLayoutManager.A0w(r13);
                    int A0y = linearLayoutManager.A0y(r13);
                    int height = recyclerView.getHeight();
                    boolean z2 = this.A0A;
                    if (z2) {
                        Rect rect2 = this.A07;
                        height = (height - rect2.top) - rect2.bottom;
                    }
                    int A0x = linearLayoutManager.A0x(r13);
                    if (A0y != A0w) {
                        int round = Math.round((((float) height) * ((float) A0w)) / ((float) A0y));
                        int i2 = height / 2;
                        if (round > i2) {
                            round = i2;
                        }
                        int round2 = Math.round((((float) (height - round)) * ((float) A0x)) / ((float) (A0y - A0w)));
                        rectF = this.A0F;
                        if (A1S) {
                            rect = this.A07;
                            int i3 = rect.right;
                            rectF.left = (float) i3;
                            width = (float) (this.A06 + i3);
                        } else {
                            rect = this.A07;
                            rectF.left = (float) ((recyclerView.getWidth() - this.A06) - rect.right);
                            width = (float) (recyclerView.getWidth() - rect.right);
                        }
                        rectF.right = width;
                        rectF.top = (float) round2;
                        rectF.bottom = (float) (round2 + round);
                        rectF2 = this.A0E;
                        rectF2.left = rectF.left;
                        rectF2.right = width;
                        rectF2.top = 0.0f;
                        rectF2.bottom = C36441kJ.A02(recyclerView);
                        if (z2) {
                            float f2 = rectF.top;
                            float f3 = (float) rect.top;
                            rectF.top = f2 + f3;
                            rectF.bottom += f3;
                            rectF2.top += f3;
                            rectF2.bottom -= (float) rect.bottom;
                        }
                    } else {
                        return;
                    }
                } else {
                    int A0t = linearLayoutManager.A0t(r13);
                    int A0v = linearLayoutManager.A0v(r13);
                    int width2 = recyclerView.getWidth();
                    boolean z3 = this.A0A;
                    if (z3) {
                        Rect rect3 = this.A07;
                        width2 = (width2 - rect3.left) - rect3.right;
                    }
                    int A0u = linearLayoutManager.A0u(r13);
                    if (A0v != A0t) {
                        int round3 = Math.round((((float) width2) * ((float) A0t)) / ((float) A0v));
                        int i4 = width2 / 2;
                        if (round3 > i4) {
                            round3 = i4;
                        }
                        int round4 = Math.round((((float) (width2 - round3)) * ((float) A0u)) / ((float) (A0v - A0t)));
                        rectF = this.A0F;
                        rectF.left = (float) round4;
                        rectF.right = (float) (round4 + round3);
                        Rect rect4 = this.A07;
                        rectF.top = (float) ((recyclerView.getHeight() - this.A06) - rect4.bottom);
                        rectF.bottom = (float) (recyclerView.getHeight() - rect4.bottom);
                        rectF2 = this.A0E;
                        rectF2.left = 0.0f;
                        rectF2.top = rectF.top;
                        rectF2.right = C36441kJ.A01(recyclerView);
                        rectF2.bottom = rectF.bottom;
                        if (z3) {
                            float f4 = rectF.left;
                            if (A1S) {
                                float f5 = (float) rect4.right;
                                rectF.left = f4 + f5;
                                rectF.right += f5;
                                rectF2.left += f5;
                                f = rectF2.right;
                                i = rect4.left;
                            } else {
                                float f6 = (float) rect4.left;
                                rectF.left = f4 + f6;
                                rectF.right += f6;
                                rectF2.left += f6;
                                f = rectF2.right;
                                i = rect4.right;
                            }
                            rectF2.right = f - ((float) i);
                        }
                    } else {
                        return;
                    }
                }
                int i5 = this.A03;
                if (i5 != 0) {
                    C123665ws r8 = this.A08;
                    float f7 = r8.A03;
                    if (f7 == 0.0f || !canvas.isHardwareAccelerated()) {
                        z = false;
                    } else {
                        this.A0D.setShadowLayer(f7, r8.A01, r8.A00, r8.A05);
                    }
                    Paint paint = this.A0D;
                    paint.setColor(i5);
                    paint.setAlpha((int) (this.A01 * ((float) this.A0B)));
                    float f8 = (float) this.A05;
                    canvas.drawRoundRect(rectF2, f8, f8, paint);
                    if (z) {
                        paint.clearShadowLayer();
                    }
                }
                Paint paint2 = this.A0D;
                paint2.setColor(this.A04);
                paint2.setAlpha((int) (this.A01 * ((float) this.A0C)));
                float f9 = (float) this.A05;
                canvas.drawRoundRect(rectF, f9, f9, paint2);
            }
        }
    }

    public C96324n9(Rect rect, C123665ws r3, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A03 = i2;
        this.A04 = i;
        this.A0C = Color.alpha(i);
        this.A0B = Color.alpha(i2);
        this.A06 = i3;
        this.A05 = i4;
        this.A09 = z;
        if (z) {
            this.A01 = 1.0f;
        }
        this.A07 = rect;
        this.A0A = z2;
        this.A08 = r3;
    }
}
