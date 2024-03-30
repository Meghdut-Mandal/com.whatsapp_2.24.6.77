package X;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

/* renamed from: X.9d2  reason: invalid class name and case insensitive filesystem */
public class C198179d2 {
    public Paint A00;
    public Paint A01;
    public C198839eH A02;
    public C198839eH A03;
    public AUW A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final /* synthetic */ AnonymousClass9p5 A08;

    public C198179d2(C198179d2 r4, AnonymousClass9p5 r5) {
        this.A08 = r5;
        this.A05 = r4.A05;
        this.A06 = r4.A06;
        this.A00 = new Paint(r4.A00);
        this.A01 = new Paint(r4.A01);
        C198839eH r1 = r4.A03;
        if (r1 != null) {
            this.A03 = new C198839eH(r1);
        }
        C198839eH r12 = r4.A02;
        if (r12 != null) {
            this.A02 = new C198839eH(r12);
        }
        this.A07 = r4.A07;
        try {
            this.A04 = (AUW) r4.A04.clone();
        } catch (CloneNotSupportedException e) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
            this.A04 = AUW.A00();
        }
    }

    public C198179d2(AnonymousClass9p5 r5) {
        this.A08 = r5;
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setFlags(385);
        this.A00.setStyle(Paint.Style.FILL);
        Paint paint2 = this.A00;
        Typeface typeface = Typeface.DEFAULT;
        paint2.setTypeface(typeface);
        Paint paint3 = new Paint();
        this.A01 = paint3;
        paint3.setFlags(385);
        this.A01.setStyle(Paint.Style.STROKE);
        this.A01.setTypeface(typeface);
        this.A04 = AUW.A00();
    }
}
