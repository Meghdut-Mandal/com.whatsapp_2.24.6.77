package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1QZ;
import X.AnonymousClass2xF;
import X.AnonymousClass3DX;
import X.AnonymousClass7cW;
import X.AnonymousClass92E;
import X.AnonymousClass9IM;
import X.AnonymousClass9S4;
import X.C011304x;
import X.C023109s;
import X.C135966dY;
import X.C142416oq;
import X.C18700tb;
import X.C200649ht;
import X.C36341k9;
import X.C36441kJ;
import X.C90484aE;
import X.C90514aH;
import X.C92504e5;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class QrImageView extends View implements C18700tb {
    public static final Random A09 = new Random();
    public Paint A00;
    public RectF A01;
    public AnonymousClass9S4 A02;
    public AnonymousClass1QZ A03;
    public ArrayList A04;
    public boolean A05;
    public int A06;
    public Drawable A07;
    public boolean A08;

    public void setQrCode(AnonymousClass9S4 r2) {
        setQrCode(r2, (AnonymousClass7cW) null);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2xF.A0F);
            this.A08 = obtainStyledAttributes.getBoolean(1, true);
            this.A06 = obtainStyledAttributes.getInt(0, -16777216);
            this.A07 = obtainStyledAttributes.getDrawable(2);
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            try {
                this.A02 = C200649ht.A00(C023109s.A01, "This is a sample QR Code", (Map) null);
            } catch (AnonymousClass92E e) {
                throw AnonymousClass001.A0B(e);
            }
        }
    }

    private void A01(AnonymousClass7cW r4) {
        ArrayList arrayList = this.A04;
        if (arrayList == null || arrayList.isEmpty()) {
            AnonymousClass3DX r0 = this.A02.A03;
            int i = r0.A01 * r0.A00;
            ArrayList A14 = C36441kJ.A14(i);
            this.A04 = A14;
            for (int i2 = 0; i2 < i; i2++) {
                AnonymousClass000.A1F(A14, i2);
            }
        }
        C92504e5 r2 = new C92504e5(this);
        r2.setDuration(1200);
        C90514aH.A1K(r2);
        if (r4 != null) {
            r2.setAnimationListener(new C135966dY(r4, this));
        }
        startAnimation(r2);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A03;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        AnonymousClass9S4 r0 = this.A02;
        if (r0 != null) {
            AnonymousClass3DX r15 = r0.A03;
            int i = r15.A01;
            int i2 = r15.A00;
            RectF rectF = this.A01;
            float width = rectF.width() / ((float) i);
            float height = rectF.height() / ((float) i2);
            Paint paint = this.A00;
            paint.setColor(-1);
            float paddingLeft = (float) getPaddingLeft();
            float paddingTop = (float) getPaddingTop();
            Canvas canvas2 = canvas;
            Paint paint2 = paint;
            Canvas canvas3 = canvas2;
            float f = paddingLeft;
            canvas3.drawRect(f, paddingTop, (float) AnonymousClass000.A0B(this), (float) AnonymousClass000.A0A(this), paint2);
            paint.setColor(this.A06);
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    if (r15.A02[i4][i3] == 1) {
                        float f2 = rectF.left;
                        float f3 = (float) ((int) ((((float) i3) * width) + f2));
                        float f4 = rectF.top;
                        float f5 = f3;
                        canvas3.drawRect(f5, (float) ((int) ((((float) i4) * height) + f4)), f2 + (((float) (i3 + 1)) * width), f4 + (((float) (i4 + 1)) * height), paint2);
                    }
                }
            }
            paint.setColor(-1);
            if (this.A04 != null && !isInEditMode()) {
                Iterator it = this.A04.iterator();
                while (it.hasNext()) {
                    int A0A = C36341k9.A0A(it);
                    int i5 = A0A % i;
                    int i6 = A0A / i;
                    float f6 = rectF.left;
                    float f7 = (float) ((int) ((((float) i5) * width) + f6));
                    float f8 = rectF.top;
                    float f9 = f7;
                    canvas3.drawRect(f9, (float) ((int) ((((float) i6) * height) + f8)), f6 + (((float) (i5 + 1)) * width), f8 + (((float) (i6 + 1)) * height), paint2);
                }
            }
            if (this.A07 != null) {
                ArrayList arrayList = this.A04;
                if (arrayList == null || arrayList.isEmpty() || isInEditMode()) {
                    this.A07.draw(canvas2);
                }
            }
        }
    }

    public QrImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C90484aE.A1F(this);
        A00(context, attributeSet);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A08 && this.A02 != null) {
            A01((AnonymousClass7cW) null);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A04 = null;
        clearAnimation();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            super.onMeasure(r10, r11)
            int r0 = r9.getMeasuredWidth()
            int r6 = X.C36331k8.A00(r9, r0)
            int r0 = r9.getMeasuredHeight()
            int r5 = X.AnonymousClass000.A0D(r9, r0)
            r8 = 1073741824(0x40000000, float:2.0)
            r7 = 0
            if (r6 <= r5) goto L_0x005d
            int r0 = r6 - r5
            float r4 = (float) r0
            float r4 = r4 / r8
            r1 = r5
        L_0x001d:
            r0 = 0
        L_0x001e:
            android.graphics.RectF r3 = r9.A01
            float r2 = (float) r1
            r3.set(r7, r7, r2, r2)
            r3.offset(r4, r0)
            int r0 = r9.getPaddingLeft()
            float r1 = (float) r0
            int r0 = r9.getPaddingTop()
            float r0 = (float) r0
            r3.offset(r1, r0)
            android.graphics.drawable.Drawable r0 = r9.A07
            if (r0 == 0) goto L_0x005c
            r0 = 1049414861(0x3e8ccccd, float:0.275)
            float r2 = r2 * r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r1
            int r4 = (int) r2
            int r6 = r6 - r4
            float r0 = (float) r6
            float r0 = r0 / r8
            float r0 = r0 + r1
            int r3 = (int) r0
            int r0 = r9.getPaddingLeft()
            int r3 = r3 + r0
            int r5 = r5 - r4
            float r0 = (float) r5
            float r0 = r0 / r8
            float r0 = r0 + r1
            int r2 = (int) r0
            int r0 = r9.getPaddingTop()
            int r2 = r2 + r0
            int r1 = r3 + r4
            int r4 = r4 + r2
            android.graphics.drawable.Drawable r0 = r9.A07
            r0.setBounds(r3, r2, r1, r4)
        L_0x005c:
            return
        L_0x005d:
            if (r5 <= r6) goto L_0x0066
            int r0 = r5 - r6
            float r0 = (float) r0
            float r0 = r0 / r8
            r1 = r6
            r4 = 0
            goto L_0x001e
        L_0x0066:
            r1 = r6
            r4 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.QrImageView.onMeasure(int, int):void");
    }

    public QrImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C90484aE.A1F(this);
        A00(context, attributeSet);
    }

    public void setQrCode(AnonymousClass9S4 r5, AnonymousClass7cW r6) {
        this.A02 = r5;
        if (this.A08 && C011304x.A02(this) && r5 != null) {
            A01(r6);
        } else if (r6 != null) {
            C142416oq r62 = (C142416oq) r6;
            IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = r62.A01;
            int i = r62.A00;
            IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel = indiaUpiDisplaySecureQrCodeView.A0G;
            indiaUpiSecureQrCodeViewModel.A01.A0D(new AnonymousClass9IM(3, i));
        }
    }

    public QrImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C90484aE.A1F(this);
        A00(context, attributeSet);
    }

    public QrImageView(Context context) {
        super(context);
        C90484aE.A1F(this);
        A00(context, (AttributeSet) null);
    }

    public QrImageView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
    }
}
