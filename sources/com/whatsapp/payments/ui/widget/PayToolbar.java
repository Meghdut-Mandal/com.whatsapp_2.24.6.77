package com.whatsapp.payments.ui.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass088;
import X.C023109s;
import X.C100724vU;
import X.C114025gW;
import X.C18820ts;
import X.C20810yC;
import X.C222013h;
import X.C36331k8;
import X.C36351kA;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public class PayToolbar extends C100724vU {
    public View A00;
    public FrameLayout A01;
    public TextView A02;
    public WaImageView A03;
    public C18820ts A04;
    public C20810yC A05;
    public Integer A06;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0045, code lost:
        if (r4 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004a, code lost:
        if (r4 == false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setLockIconVisibility(boolean r6) {
        /*
            r5 = this;
            android.view.View r1 = r5.A00
            r3 = 0
            int r0 = X.C36351kA.A00(r6)
            r1.setVisibility(r0)
            X.0ts r0 = r5.A04
            boolean r4 = X.C36351kA.A1Y(r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = X.C36421kH.A01(r4)
            r0 = r0 | 16
            r2.gravity = r0
            android.content.res.Resources r1 = X.C36341k9.A0F(r5)
            r0 = 2131166580(0x7f070574, float:1.794741E38)
            int r1 = r1.getDimensionPixelOffset(r0)
            r0 = 0
            if (r4 != 0) goto L_0x002e
            r0 = r1
            r1 = 0
        L_0x002e:
            r2.setMargins(r0, r3, r1, r3)
            android.widget.FrameLayout r0 = r5.A01
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass000.A0a(r0)
            android.content.res.Resources r1 = X.C36341k9.A0F(r5)
            r0 = 2131166581(0x7f070575, float:1.7947411E38)
            int r1 = r1.getDimensionPixelOffset(r0)
            if (r6 == 0) goto L_0x0047
            r0 = r1
            if (r4 != 0) goto L_0x004c
        L_0x0047:
            r0 = 0
            if (r6 == 0) goto L_0x004c
            if (r4 == 0) goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            r2.setMargins(r1, r3, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.widget.PayToolbar.setLockIconVisibility(boolean):void");
    }

    public void setLogo(int i) {
        this.A02.setVisibility(8);
        if (i != R.id.fbpay_logo) {
            this.A03.setVisibility(0);
        }
        this.A03.setImageResource(i);
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i = 8;
        if (charSequence == null || !getContext().getString(R.string.f12nameremoved).equalsIgnoreCase(charSequence.toString())) {
            this.A03.setVisibility(8);
            textView = this.A02;
            textView.setText(charSequence);
            i = 0;
        } else {
            textView = this.A02;
        }
        textView.setVisibility(i);
    }

    public PayToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, true);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Integer num;
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        FrameLayout frameLayout = this.A01;
        if (frameLayout != null && frameLayout.getVisibility() != 8 && (num = this.A06) != null) {
            int width = getWidth();
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            int i7 = width - paddingRight;
            int i8 = height - paddingBottom;
            int measuredWidth = frameLayout.getMeasuredWidth();
            int i9 = 0;
            if (frameLayout.getLayoutParams() != null) {
                ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(frameLayout);
                i9 = A0a.leftMargin;
                i5 = A0a.rightMargin;
            } else {
                i5 = 0;
            }
            int i10 = measuredWidth + i9 + i5;
            int measuredHeight = frameLayout.getMeasuredHeight();
            int i11 = 0;
            if (frameLayout.getLayoutParams() != null) {
                ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(frameLayout);
                i11 = A0a2.topMargin;
                i6 = A0a2.bottomMargin;
            } else {
                i6 = 0;
            }
            int i12 = measuredHeight + i11 + i6;
            if (num.intValue() == 1) {
                int i13 = height / 2;
                int i14 = i12 / 2;
                int i15 = paddingLeft - currentContentInsetLeft;
                paddingLeft = AnonymousClass001.A02((width / 2) + i15, i10 / 2, i15);
                i7 = Math.min(i7 - currentContentInsetRight, i10 + paddingLeft);
                paddingTop = AnonymousClass001.A02(i13, i14, paddingTop);
                i8 = Math.min(i8, i13 + i14);
            }
            frameLayout.layout(paddingLeft, paddingTop, i7, i8);
        }
    }

    public void setOnLockClicked(View.OnClickListener onClickListener) {
    }

    public PayToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Integer num;
        C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, true);
        if (attributeSet != null && !isInEditMode()) {
            int i = 0;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C114025gW.A01, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId != 0) {
                C36331k8.A0q(context, this, resourceId);
            }
            findViewById(R.id.back).setVisibility(!obtainStyledAttributes.getBoolean(0, false) ? 8 : i);
            int i2 = obtainStyledAttributes.getInt(3, -1);
            if (i2 >= 0) {
                Integer[] A002 = C023109s.A00(3);
                int length = A002.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        num = null;
                        break;
                    }
                    num = A002[i3];
                    if (num.intValue() == i2) {
                        break;
                    }
                    i3++;
                }
                this.A06 = num;
            }
            this.A02 = C36351kA.A0E(this);
            this.A01 = (FrameLayout) findViewById(R.id.title_layout);
            this.A03 = (WaImageView) findViewById(R.id.fbpay_logo);
            this.A00 = findViewById(R.id.lock);
            setLockIconVisibility(obtainStyledAttributes.getBoolean(1, true));
            if (C222013h.A0C) {
                AnonymousClass088.A06(this.A02, R.style.f13nameremoved);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        this.A02.setVisibility(8);
        WaImageView waImageView = this.A03;
        waImageView.setVisibility(0);
        waImageView.setImageDrawable(drawable);
    }

    public PayToolbar(Context context) {
        super(context);
        C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, true);
    }
}
