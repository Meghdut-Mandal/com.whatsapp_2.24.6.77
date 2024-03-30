package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.json.JSONObject;

/* renamed from: X.5CX  reason: invalid class name */
public final class AnonymousClass5CX extends C104945Cb {
    public Drawable A00;
    public AnonymousClass1XQ A01;
    public final Context A02;
    public final AnonymousClass1H2 A03;
    public final boolean A04;

    public AnonymousClass5CX(Context context, AnonymousClass1H2 r5, JSONObject jSONObject) {
        this.A02 = context;
        this.A03 = r5;
        this.A04 = false;
        if (jSONObject.has("emoji")) {
            this.A01 = new AnonymousClass1XQ(C90474aD.A0e("emoji", jSONObject));
            A00(this, true);
            A0M(jSONObject);
        }
    }

    public void A0J(RectF rectF, float f, float f2, float f3, float f4) {
        AnonymousClass00C.A0D(rectF, 0);
        super.A0J(rectF, f, f2, f3, f4);
        if (!this.A04) {
            RectF rectF2 = this.A02;
            if (rectF2.width() > 128.0f || rectF2.height() > 128.0f) {
                A0E(C90524aI.A00(128.0f, rectF2.height(), 128.0f / rectF2.width()));
            }
        }
    }

    public void A0L(JSONObject jSONObject) {
        AnonymousClass00C.A0D(jSONObject, 0);
        super.A0L(jSONObject);
        AnonymousClass1XQ r0 = this.A01;
        if (r0 != null) {
            jSONObject.put("emoji", String.valueOf(r0));
        }
    }

    public static final void A00(AnonymousClass5CX r8, boolean z) {
        BitmapDrawable A05;
        AnonymousClass1XQ r0 = r8.A01;
        if (r0 != null) {
            AnonymousClass2M9 r5 = new AnonymousClass2M9(r0.A00);
            long A002 = C1898996a.A00(r5, false);
            if (r8.A04) {
                A05 = r8.A03.A05(r8.A02.getResources(), r5, A002);
            } else if (z) {
                AnonymousClass1H2 r4 = r8.A03;
                Resources resources = r8.A02.getResources();
                C1275268q A032 = AnonymousClass1H2.A03(r5, r4, A002);
                if (A032 == null) {
                    A05 = null;
                } else {
                    A05 = AnonymousClass1H2.A01(resources, A032, r4.A04, (AnonymousClass7gX) null, r4);
                    if (A05 == null) {
                        A05 = AnonymousClass1H2.A01(resources, A032, r4.A05, new C145276td(r4), r4);
                    }
                }
            } else {
                A05 = r8.A03.A04(r8.A02.getResources(), new C145176tT(r8), r5, A002);
            }
            r8.A00 = A05;
        }
    }

    public AnonymousClass5CX(Context context, AnonymousClass1XQ r3, AnonymousClass1H2 r4, boolean z) {
        C36321k7.A11(r3, context, r4);
        this.A01 = r3;
        this.A02 = context;
        this.A03 = r4;
        this.A04 = z;
        A00(this, false);
    }
}
