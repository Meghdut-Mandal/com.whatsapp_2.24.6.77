package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import org.json.JSONObject;

/* renamed from: X.5Co  reason: invalid class name */
public final class AnonymousClass5Co extends AnonymousClass5CW implements C158467gy {
    public double A00;
    public double A01;
    public float A02;
    public Picture A03;
    public Picture A04;
    public String A05;
    public String A06;
    public boolean A07;
    public C122665vE[] A08;
    public C122665vE[] A09;
    public final Paint A0A = C36441kJ.A0L(1);
    public final TextPaint A0B;
    public final AnonymousClass66R A0C;
    public final AnonymousClass67Q A0D;
    public final String A0E;
    public final boolean A0F;
    public final Paint A0G = C36441kJ.A0L(1);
    public final Paint A0H = C36441kJ.A0L(1);

    public AnonymousClass5Co(Context context, C18820ts r6, String str, boolean z) {
        super(context);
        int i;
        this.A0F = z;
        TextPaint textPaint = new TextPaint(1);
        this.A0B = textPaint;
        this.A0C = new C162867pH(this, 2);
        Picture A0P = A0P("ic_content_sticker_location_emerald.svg");
        if (A0P != null) {
            Picture A0P2 = A0P("ic_content_sticker_location.svg");
            if (A0P2 != null) {
                this.A03 = A0P;
                this.A04 = A0P2;
                if (A0P.getWidth() == A0P2.getWidth()) {
                    TextPaint textPaint2 = this.A0B;
                    textPaint2.setTextSize(46.0f);
                    textPaint2.setTextAlign(Paint.Align.CENTER);
                    textPaint2.setTypeface(C33511fU.A02());
                    this.A06 = str;
                    Picture picture = this.A04;
                    if (picture != null) {
                        i = picture.getWidth();
                    } else {
                        i = 0;
                    }
                    this.A05 = TextUtils.ellipsize(str, textPaint, ((1000.0f - ((float) i)) - 75.0f) - 26.0f, TextUtils.TruncateAt.END).toString();
                    A00(this);
                    this.A0D = new AnonymousClass67Q(context, r6);
                    this.A0E = "location";
                    return;
                }
                throw AnonymousClass001.A09("Check failed.");
            }
            throw AnonymousClass001.A09("Required value was null.");
        }
        throw AnonymousClass001.A09("Required value was null.");
    }

    public void A0J(RectF rectF, float f, float f2, float f3, float f4) {
        float f5;
        AnonymousClass00C.A0D(rectF, 0);
        float f6 = f3 - f;
        float f7 = f4 - f2;
        boolean z = this.A0F;
        if (z) {
            f5 = f6;
        } else {
            f5 = this.A02;
        }
        float f8 = 105.0f;
        if (z) {
            f8 = C90524aI.A00(105.0f * f6, this.A02, f6 / ((float) 3));
        }
        float f9 = (float) 2;
        float f10 = (f6 / f9) + f;
        if (!z) {
            f = f10 - (f5 / f9);
        }
        float f11 = f2 + ((f7 / f9) - (f8 / f9));
        RectF rectF2 = this.A02;
        rectF2.set(f, f11, f + f5, f8 + f11);
        float f12 = f6 * f9;
        if (!z && f5 > f12) {
            A0E(f12 / (f5 + 75.0f));
        }
        rectF2.sort();
        this.A0D.A00(rectF.width() / 1020.0f);
    }

    public void A0L(JSONObject jSONObject) {
        AnonymousClass00C.A0D(jSONObject, 0);
        super.A0L(jSONObject);
        jSONObject.put("latitude", this.A00);
        jSONObject.put("longitude", this.A01);
        jSONObject.put("Location", this.A06);
        jSONObject.put("displayLocation", this.A05);
        jSONObject.put("theme", this.A07);
    }

    public boolean BuC() {
        return false;
    }

    public static final void A00(AnonymousClass5Co r12) {
        float f;
        Picture picture = r12.A04;
        float f2 = 0.0f;
        if (r12.A03 == null || picture == null) {
            Log.w("Location/initThemes/Error when loading pin");
            f = 0.0f;
        } else {
            f = ((float) picture.getWidth()) + 26.0f;
        }
        if (!r12.A0F) {
            f2 = r12.A0B.measureText(r12.A05);
        }
        r12.A02 = Math.max(300.0f, f + 75.0f + f2);
        float f3 = C90484aE.A0P().density * ((float) 8);
        Paint paint = r12.A0H;
        paint.setColor(-1);
        float f4 = f3;
        r12.A09 = new C122665vE[]{new C122665vE(0.0f, 0.0f, r12.A02, 105.0f, f3, f4, paint)};
        Paint paint2 = r12.A0G;
        C36381kD.A16(r12.A00, paint2, R.color.f6nameremoved);
        r12.A08 = new C122665vE[]{new C122665vE(0.0f, 0.0f, r12.A02, 105.0f, f3, f4, paint2)};
    }
}
