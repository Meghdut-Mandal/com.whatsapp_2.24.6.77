package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.22V  reason: invalid class name */
public abstract class AnonymousClass22V extends C38591pM {
    public TextEmojiLabel A00;
    public WaImageView A01;
    public C21060yb A02;
    public C18820ts A03;
    public C20810yC A04;
    public boolean A05;
    public WaTextView A06;

    public void A05(AttributeSet attributeSet) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        float f2;
        float f3;
        float f4;
        AttributeSet attributeSet2 = attributeSet;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = C36361kB.A09(this).obtainStyledAttributes(attributeSet2, AnonymousClass2xF.A0A, 0, 0);
            try {
                i = obtainStyledAttributes.getResourceId(7, 0);
                i2 = obtainStyledAttributes.getResourceId(0, 0);
                i3 = obtainStyledAttributes.getResourceId(4, 0);
                i4 = obtainStyledAttributes.getColor(5, 0);
                i5 = obtainStyledAttributes.getColor(8, 0);
                i6 = obtainStyledAttributes.getColor(1, 0);
                this.A05 = obtainStyledAttributes.getBoolean(6, true);
                f4 = obtainStyledAttributes.getDimension(9, 0.0f);
                f = obtainStyledAttributes.getDimension(10, 0.0f);
                f2 = obtainStyledAttributes.getDimension(2, 0.0f);
                f3 = obtainStyledAttributes.getDimension(3, 0.0f);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            f4 = 0.0f;
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        }
        View inflate = C36351kA.A0C(this).inflate(getRootLayoutID(), this, true);
        this.A06 = C36401kF.A0Q(inflate, R.id.list_item_title);
        this.A00 = C36401kF.A0O(inflate, R.id.list_item_description);
        this.A01 = C36431kI.A0X(inflate, R.id.list_item_icon);
        if (i != 0) {
            this.A06.setText(i);
        }
        if (i2 != 0) {
            setDescription(i2);
        }
        if (i5 != 0) {
            this.A06.setTextColor(i5);
        }
        if (i6 != 0) {
            this.A00.setTextColor(i6);
        }
        if (i4 != 0) {
            setIconColor(i4);
        }
        if (i3 != 0) {
            setIcon(i3);
        }
        if (f4 != 0.0f) {
            this.A06.setTextSize(0, f4);
        }
        if (f != 0.0f) {
            this.A06.setLineSpacing(f, 1.0f);
        }
        if (f2 != 0.0f) {
            this.A00.setTextSize(0, f2);
        }
        if (f3 != 0.0f) {
            this.A00.setLineSpacing(f3, 1.0f);
        }
        C33521fV.A07(this.A06, true);
    }

    public abstract int getRootLayoutID();

    public CharSequence getTitle() {
        return this.A06.getText();
    }

    public void setDescription(int i) {
        this.A00.setText(i);
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.A05;
        C100744vb r1 = new C100744vb(drawable, this.A03);
        r1.A00 = z;
        this.A01.setImageDrawable(r1);
        if (C222013h.A07) {
            this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    public void setIconColor(int i) {
        AnonymousClass06T.A00(ColorStateList.valueOf(i), this.A01);
    }

    public void setIconVisible(boolean z) {
        this.A01.setVisibility(C36351kA.A00(z ? 1 : 0));
    }

    public void setTitle(CharSequence charSequence) {
        this.A06.setText(charSequence);
    }

    public AnonymousClass22V(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = true;
        A05(attributeSet);
    }

    public static void A01(Context context, AnonymousClass22V r1, int i) {
        r1.setTitle(context.getString(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(int r4, boolean r5) {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.getResources()     // Catch:{ NotFoundException -> 0x0014 }
            android.content.res.XmlResourceParser r0 = r0.getXml(r4)     // Catch:{ NotFoundException -> 0x0014 }
            if (r0 == 0) goto L_0x0014
            android.content.res.Resources r1 = r3.getResources()
            r0 = 0
            X.04n r2 = X.C010804n.A00(r0, r1, r4)
            goto L_0x001c
        L_0x0014:
            android.content.Context r0 = r3.getContext()
            android.graphics.drawable.Drawable r2 = X.AnonymousClass00E.A00(r0, r4)
        L_0x001c:
            X.0ts r0 = r3.A03
            X.4vb r1 = new X.4vb
            r1.<init>(r2, r0)
            r1.A00 = r5
            com.whatsapp.WaImageView r0 = r3.A01
            r0.setImageDrawable(r1)
            boolean r0 = X.C222013h.A07
            if (r0 == 0) goto L_0x0035
            com.whatsapp.WaImageView r1 = r3.A01
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.setScaleType(r0)
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass22V.A04(int, boolean):void");
    }

    public AnonymousClass22V(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setDescription(CharSequence charSequence) {
        this.A00.setText(charSequence);
    }

    public void setIcon(int i) {
        A04(i, this.A05);
    }
}
