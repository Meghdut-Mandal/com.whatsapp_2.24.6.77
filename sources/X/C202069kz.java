package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;

/* renamed from: X.9kz  reason: invalid class name and case insensitive filesystem */
public class C202069kz {
    public Bitmap A00;
    public final int A01;
    public final Paint A02;
    public final Rect A03 = new Rect();
    public final Rect A04 = new Rect();
    public final Rect A05;
    public final B3Z A06;
    public final AnonymousClass9CG A07;
    public final AnonymousClass94G A08;
    public final boolean A09;
    public final int[] A0A;
    public final AnonymousClass9N2[] A0B;

    public static synchronized Bitmap A00(C202069kz r2, int i, int i2) {
        Bitmap bitmap;
        synchronized (r2) {
            Bitmap bitmap2 = r2.A00;
            if (bitmap2 != null && (bitmap2.getWidth() < i || r2.A00.getHeight() < i2)) {
                Bitmap bitmap3 = r2.A00;
                if (bitmap3 != null) {
                    bitmap3.recycle();
                    r2.A00 = null;
                }
            }
            Bitmap bitmap4 = r2.A00;
            if (bitmap4 == null) {
                bitmap4 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                r2.A00 = bitmap4;
            }
            bitmap4.eraseColor(0);
            bitmap = r2.A00;
        }
        return bitmap;
    }

    public static Rect A01(Rect rect, B3Z b3z) {
        int min;
        int min2;
        if (rect == null) {
            min = b3z.getWidth();
            min2 = b3z.getHeight();
        } else {
            min = Math.min(rect.width(), b3z.getWidth());
            min2 = Math.min(rect.height(), b3z.getHeight());
        }
        return new Rect(0, 0, min, min2);
    }

    public void A03(Canvas canvas, int i) {
        int width;
        int height;
        int xOffset;
        int yOffset;
        B3Z b3z = this.A06;
        B3A frame = b3z.getFrame(i);
        try {
            if (frame.getWidth() > 0 && frame.getHeight() > 0) {
                if (b3z.doesRenderSupportScaling()) {
                    Rect rect = this.A05;
                    double width2 = ((double) rect.width()) / ((double) b3z.getWidth());
                    double height2 = ((double) rect.height()) / ((double) b3z.getHeight());
                    int round = (int) Math.round(((double) frame.getWidth()) * width2);
                    int round2 = (int) Math.round(((double) frame.getHeight()) * height2);
                    int xOffset2 = (int) (((double) frame.getXOffset()) * width2);
                    int yOffset2 = (int) (((double) frame.getYOffset()) * height2);
                    synchronized (this) {
                        try {
                            int width3 = rect.width();
                            int height3 = rect.height();
                            A00(this, width3, height3);
                            Bitmap bitmap = this.A00;
                            if (bitmap != null) {
                                frame.renderFrame(round, round2, bitmap);
                            }
                            Rect rect2 = this.A04;
                            rect2.set(0, 0, width3, height3);
                            Rect rect3 = this.A03;
                            rect3.set(xOffset2, yOffset2, width3 + xOffset2, height3 + yOffset2);
                            Bitmap bitmap2 = this.A00;
                            if (bitmap2 != null) {
                                canvas.drawBitmap(bitmap2, rect2, rect3, (Paint) null);
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } else {
                    if (this.A09) {
                        float max = Math.max(((float) frame.getWidth()) / ((float) Math.min(frame.getWidth(), canvas.getWidth())), ((float) frame.getHeight()) / ((float) Math.min(frame.getHeight(), canvas.getHeight())));
                        width = (int) (((float) frame.getWidth()) / max);
                        height = (int) (((float) frame.getHeight()) / max);
                        xOffset = (int) (((float) frame.getXOffset()) / max);
                        yOffset = (int) (((float) frame.getYOffset()) / max);
                    } else {
                        width = frame.getWidth();
                        height = frame.getHeight();
                        xOffset = frame.getXOffset();
                        yOffset = frame.getYOffset();
                    }
                    synchronized (this) {
                        try {
                            Bitmap A002 = A00(this, width, height);
                            this.A00 = A002;
                            frame.renderFrame(width, height, A002);
                            canvas.save();
                            canvas.translate((float) xOffset, (float) yOffset);
                            canvas.drawBitmap(this.A00, 0.0f, 0.0f, (Paint) null);
                            canvas.restore();
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
            }
        } finally {
            frame.dispose();
        }
    }

    public static void A02(Canvas canvas, AnonymousClass9N2 r6, C202069kz r7, float f, float f2) {
        if (r6.A04 == C187788yX.DISPOSE_TO_BACKGROUND) {
            int A032 = C165597tg.A03(r6.A01, f);
            int A033 = C165597tg.A03(r6.A00, f2);
            int A034 = C165597tg.A03(r6.A02, f);
            int A035 = C165597tg.A03(r6.A03, f2);
            canvas.drawRect(new Rect(A034, A035, A032 + A034, A033 + A035), r7.A02);
        }
    }

    public C202069kz(Rect rect, AnonymousClass9CG r8, AnonymousClass94G r9, boolean z) {
        int length;
        this.A08 = r9;
        this.A07 = r8;
        B3Z b3z = r8.A00;
        this.A06 = b3z;
        int[] frameDurations = b3z.getFrameDurations();
        this.A0A = frameDurations;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (frameDurations[i] < 11) {
                frameDurations[i] = 100;
            }
            i++;
        }
        int i2 = 0;
        for (int i3 : frameDurations) {
            i2 += i3;
        }
        this.A01 = i2;
        for (int i4 = 0; i4 < length; i4++) {
        }
        this.A05 = A01(rect, b3z);
        this.A09 = z;
        this.A0B = new AnonymousClass9N2[b3z.getFrameCount()];
        for (int i5 = 0; i5 < this.A06.getFrameCount(); i5++) {
            this.A0B[i5] = this.A06.getFrameInfo(i5);
        }
        Paint paint = new Paint();
        this.A02 = paint;
        C165587tf.A0v(paint, PorterDuff.Mode.CLEAR);
    }
}
