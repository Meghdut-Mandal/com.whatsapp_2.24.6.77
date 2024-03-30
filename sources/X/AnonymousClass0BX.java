package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: X.0BX  reason: invalid class name */
public class AnonymousClass0BX extends Drawable.ConstantState {
    public int A00;
    public int A01;
    public ColorStateList A02;
    public ColorStateList A03;
    public Bitmap A04;
    public Paint A05;
    public PorterDuff.Mode A06;
    public PorterDuff.Mode A07;
    public AnonymousClass0BY A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public void A00(int i, int i2) {
        this.A04.eraseColor(0);
        Canvas canvas = new Canvas(this.A04);
        AnonymousClass0BY r4 = this.A08;
        AnonymousClass0BY.A00(canvas, AnonymousClass0BY.A0G, r4.A0F, r4, i, i2);
    }

    public Drawable newDrawable(Resources resources) {
        return new C010804n(this);
    }

    public AnonymousClass0BX(AnonymousClass0BX r4) {
        this.A03 = null;
        this.A07 = C010804n.A09;
        if (r4 != null) {
            this.A01 = r4.A01;
            AnonymousClass0BY r2 = new AnonymousClass0BY(r4.A08);
            this.A08 = r2;
            Paint paint = r4.A08.A05;
            if (paint != null) {
                r2.A05 = new Paint(paint);
            }
            Paint paint2 = r4.A08.A06;
            if (paint2 != null) {
                this.A08.A06 = new Paint(paint2);
            }
            this.A03 = r4.A03;
            this.A07 = r4.A07;
            this.A09 = r4.A09;
        }
    }

    public int getChangingConfigurations() {
        return this.A01;
    }

    public AnonymousClass0BX() {
        this.A03 = null;
        this.A07 = C010804n.A09;
        this.A08 = new AnonymousClass0BY();
    }

    public Drawable newDrawable() {
        return new C010804n(this);
    }
}
