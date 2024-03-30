package com.whatsapp.inappsupport.ui;

import X.C224514j;
import X.C36321k7;
import X.C36351kA;
import X.C36381kD;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public class AddScreenshotImageView extends WaImageView {
    public int A00;
    public int A01;
    public Bitmap A02;
    public BitmapShader A03;
    public Matrix A04;
    public RectF A05;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public Paint A0B;
    public Paint A0C;
    public Paint A0D;
    public Paint A0E;
    public RectF A0F;
    public boolean A0G;
    public final ImageView.ScaleType A0H;

    private void A00() {
        this.A0B.setColor(C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        C36381kD.A16(getContext(), this.A0C, R.color.f6nameremoved);
        C36381kD.A16(getContext(), this.A0D, R.color.f6nameremoved);
        this.A0A = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A08 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A07 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A09 = dimensionPixelSize;
        float f = (float) this.A08;
        float f2 = (float) this.A0A;
        this.A06 = f * ((f2 - (((float) dimensionPixelSize) * 2.0f)) / f2);
    }

    public static void A02(AddScreenshotImageView addScreenshotImageView) {
        super.setScaleType(addScreenshotImageView.A0H);
        Resources resources = addScreenshotImageView.getResources();
        Drawable drawable = resources.getDrawable(R.drawable.ic_action_add);
        drawable.setColorFilter(resources.getColor(C224514j.A00(addScreenshotImageView.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved)), PorterDuff.Mode.SRC_IN);
        super.setImageDrawable(drawable);
        super.setContentDescription(addScreenshotImageView.getContext().getString(R.string.f12nameremoved));
    }

    public void A03() {
        if (!this.A0G) {
            this.A0G = true;
            C36321k7.A0n(this);
        }
    }

    public void onDraw(Canvas canvas) {
        Bitmap bitmap = this.A02;
        RectF rectF = this.A0F;
        float f = (float) this.A08;
        if (bitmap == null) {
            canvas.drawRoundRect(rectF, f, f, this.A0B);
            canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) (this.A07 / 2), this.A0D);
            super.onDraw(canvas);
            return;
        }
        canvas.drawRoundRect(rectF, f, f, this.A0C);
        RectF rectF2 = this.A05;
        float f2 = this.A06;
        canvas.drawRoundRect(rectF2, f2, f2, this.A0E);
    }

    public AddScreenshotImageView(Context context) {
        super(context);
        A03();
        this.A0H = ImageView.ScaleType.CENTER;
        this.A0F = new RectF();
        this.A05 = new RectF();
        this.A0B = new Paint(1);
        this.A0C = new Paint(1);
        this.A0D = new Paint(1);
        this.A0E = new Paint(1);
        this.A04 = new Matrix();
        A00();
        A02(this);
    }

    private void A01() {
        float width;
        float height;
        if (getWidth() != 0 || getHeight() != 0) {
            Bitmap bitmap = this.A02;
            if (bitmap == null) {
                A02(this);
            } else {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.A03 = new BitmapShader(bitmap, tileMode, tileMode);
                Paint paint = this.A0E;
                paint.setAntiAlias(true);
                paint.setShader(this.A03);
                this.A00 = this.A02.getHeight();
                this.A01 = this.A02.getWidth();
                Matrix matrix = this.A04;
                matrix.set((Matrix) null);
                RectF rectF = this.A05;
                float f = 0.0f;
                if (((float) this.A01) * rectF.height() > rectF.width() * ((float) this.A00)) {
                    width = rectF.height() / ((float) this.A00);
                    f = (rectF.width() - (((float) this.A01) * width)) * 0.5f;
                    height = 0.0f;
                } else {
                    width = rectF.width() / ((float) this.A01);
                    height = (rectF.height() - (((float) this.A00) * width)) * 0.5f;
                }
                matrix.setScale(width, width);
                matrix.postTranslate(((float) ((int) (f + 0.5f))) + rectF.left, ((float) ((int) (height + 0.5f))) + rectF.top);
                this.A03.setLocalMatrix(matrix);
            }
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        RectF rectF = this.A0F;
        float f = (float) this.A0A;
        rectF.set(0.0f, 0.0f, f, f);
        RectF rectF2 = this.A05;
        int i3 = this.A09;
        float f2 = (float) i3;
        float f3 = (float) (this.A0A - i3);
        rectF2.set(f2, f2, f3, f3);
        int i4 = this.A0A;
        setMeasuredDimension(i4, i4);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A01();
    }

    public void setScreenshot(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.A02 = bitmap;
        A01();
    }

    public AddScreenshotImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
        this.A0H = ImageView.ScaleType.CENTER;
        this.A0F = new RectF();
        this.A05 = new RectF();
        this.A0B = new Paint(1);
        this.A0C = new Paint(1);
        this.A0D = new Paint(1);
        this.A0E = new Paint(1);
        this.A04 = new Matrix();
        A00();
        A02(this);
    }

    public AddScreenshotImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A03();
    }

    public AddScreenshotImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
        this.A0H = ImageView.ScaleType.CENTER;
        this.A0F = new RectF();
        this.A05 = new RectF();
        this.A0B = new Paint(1);
        this.A0C = new Paint(1);
        this.A0D = new Paint(1);
        this.A0E = new Paint(1);
        this.A04 = new Matrix();
        A00();
        A02(this);
    }
}
