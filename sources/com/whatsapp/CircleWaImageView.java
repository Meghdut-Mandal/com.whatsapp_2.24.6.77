package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass286;
import X.C36331k8;
import X.C36441kJ;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CircleWaImageView extends AnonymousClass286 {
    public static final Bitmap.Config A0A = Bitmap.Config.ARGB_8888;
    public static final ImageView.ScaleType A0B = ImageView.ScaleType.CENTER_CROP;
    public int A00;
    public int A01;
    public BitmapShader A02;
    public Matrix A03;
    public boolean A04;
    public boolean A05;
    public float A06;
    public Bitmap A07;
    public Paint A08;
    public final RectF A09;

    public CircleWaImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A01() {
        float width;
        float height;
        if (!this.A04) {
            this.A05 = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            Bitmap bitmap = this.A07;
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.A02 = new BitmapShader(bitmap, tileMode, tileMode);
                Paint paint = this.A08;
                paint.setAntiAlias(true);
                paint.setShader(this.A02);
                this.A00 = this.A07.getHeight();
                this.A01 = this.A07.getWidth();
                RectF rectF = this.A09;
                int A002 = C36331k8.A00(this, getWidth());
                int A0D = AnonymousClass000.A0D(this, getHeight());
                int min = Math.min(A002, A0D);
                float paddingLeft = ((float) getPaddingLeft()) + (((float) (A002 - min)) / 2.0f);
                float paddingTop = ((float) getPaddingTop()) + (((float) (A0D - min)) / 2.0f);
                float f = (float) min;
                rectF.set(new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop));
                this.A06 = Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f);
                Matrix matrix = this.A03;
                matrix.set((Matrix) null);
                float f2 = 0.0f;
                if (((float) this.A01) * rectF.height() > rectF.width() * ((float) this.A00)) {
                    width = rectF.height() / ((float) this.A00);
                    f2 = (rectF.width() - (((float) this.A01) * width)) * 0.5f;
                    height = 0.0f;
                } else {
                    width = rectF.width() / ((float) this.A01);
                    height = (rectF.height() - (((float) this.A00) * width)) * 0.5f;
                }
                matrix.setScale(width, width);
                matrix.postTranslate(((float) ((int) (f2 + 0.5f))) + rectF.left, ((float) ((int) (height + 0.5f))) + rectF.top);
                this.A02.setLocalMatrix(matrix);
            }
            invalidate();
        }
    }

    public void onDraw(Canvas canvas) {
        if (this.A07 != null) {
            RectF rectF = this.A09;
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.A06, this.A08);
        }
    }

    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw AnonymousClass001.A08("adjustViewBounds not supported.");
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != A0B) {
            throw AnonymousClass001.A08(String.format("ScaleType %s not supported.", AnonymousClass000.A1b(scaleType)));
        }
    }

    private void A00() {
        Drawable drawable = getDrawable();
        Bitmap bitmap = null;
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), A0A);
                    Canvas canvas = new Canvas(createBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    bitmap = createBitmap;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        this.A07 = bitmap;
        A01();
    }

    public ImageView.ScaleType getScaleType() {
        return A0B;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A01();
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        A00();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        A00();
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        A00();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        A00();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        A01();
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        A01();
    }

    public CircleWaImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A09 = C36441kJ.A0N();
        this.A08 = C36441kJ.A0K();
        this.A03 = new Matrix();
        super.setScaleType(A0B);
        this.A04 = true;
        if (this.A05) {
            A01();
            this.A05 = false;
        }
    }

    public CircleWaImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
