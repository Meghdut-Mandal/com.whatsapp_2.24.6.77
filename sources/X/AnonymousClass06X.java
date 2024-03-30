package X;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.06X  reason: invalid class name */
public final class AnonymousClass06X extends Drawable.ConstantState {
    public float A00 = 0.0f;
    public float A01 = 1.0f;
    public float A02 = 0.0f;
    public float A03 = 1.0f;
    public float A04;
    public float A05 = 0.0f;
    public int A06 = 255;
    public int A07 = 0;
    public int A08 = 0;
    public int A09 = 0;
    public int A0A = 0;
    public ColorStateList A0B = null;
    public ColorStateList A0C = null;
    public ColorStateList A0D = null;
    public ColorStateList A0E = null;
    public ColorFilter A0F;
    public Paint.Style A0G = Paint.Style.FILL_AND_STROKE;
    public PorterDuff.Mode A0H = PorterDuff.Mode.SRC_IN;
    public Rect A0I = null;
    public C014406g A0J;
    public AnonymousClass06J A0K;
    public boolean A0L = false;

    public int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        C012505l r1 = new C012505l(this);
        r1.A03 = true;
        return r1;
    }

    public AnonymousClass06X(AnonymousClass06X r3) {
        this.A0K = r3.A0K;
        this.A0J = r3.A0J;
        this.A04 = r3.A04;
        this.A0F = r3.A0F;
        this.A0B = r3.A0B;
        this.A0C = r3.A0C;
        this.A0H = r3.A0H;
        this.A0E = r3.A0E;
        this.A06 = r3.A06;
        this.A03 = r3.A03;
        this.A08 = r3.A08;
        this.A07 = r3.A07;
        this.A0L = r3.A0L;
        this.A01 = r3.A01;
        this.A02 = r3.A02;
        this.A00 = r3.A00;
        this.A05 = r3.A05;
        this.A09 = r3.A09;
        this.A0A = r3.A0A;
        this.A0D = r3.A0D;
        this.A0G = r3.A0G;
        Rect rect = r3.A0I;
        if (rect != null) {
            this.A0I = new Rect(rect);
        }
    }

    public AnonymousClass06X(AnonymousClass06J r3) {
        this.A0K = r3;
        this.A0J = null;
    }
}
