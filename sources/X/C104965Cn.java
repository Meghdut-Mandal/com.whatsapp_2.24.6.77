package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RectF;
import java.util.Calendar;
import org.json.JSONObject;

/* renamed from: X.5Cn  reason: invalid class name and case insensitive filesystem */
public final class C104965Cn extends AnonymousClass5CW {
    public int A00;
    public int A01;
    public Picture A02;
    public Picture A03;
    public C122665vE A04;
    public C122665vE A05;
    public C122665vE A06;
    public C122665vE A07;
    public boolean A08;
    public final Paint A09 = C36441kJ.A0L(1);
    public final Paint A0A = C36441kJ.A0L(1);
    public final RectF A0B = C36441kJ.A0N();
    public final C18820ts A0C;
    public final AnonymousClass66R A0D = new C162867pH(this, 0);
    public final AnonymousClass67Q A0E;
    public final String A0F;
    public final boolean A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104965Cn(Context context, C18820ts r10, boolean z) {
        super(context);
        C36321k7.A0v(context, 1, r10);
        this.A0C = r10;
        this.A0G = z;
        Calendar instance = Calendar.getInstance(C36401kF.A0x(this.A0C));
        this.A00 = instance.get(10);
        this.A01 = instance.get(12);
        this.A02 = A0P("clockDarkTheme.svg");
        Paint paint = this.A09;
        paint.setColor(Color.parseColor("#ECB439"));
        this.A04 = new C122665vE(190.0f, 249.0f, 398.0f, 263.0f, 7.0f, 7.0f, paint);
        this.A05 = new C122665vE(185.0f, 251.0f, 479.0f, 261.0f, 5.0f, 5.0f, paint);
        this.A03 = A0P("clockLightTheme.svg");
        Paint paint2 = this.A0A;
        paint2.setColor(Color.parseColor("#DC5842"));
        this.A06 = new C122665vE(201.0f, 248.0f, 370.0f, 264.0f, 8.0f, 8.0f, paint2);
        this.A07 = new C122665vE(185.0f, 251.0f, 479.0f, 262.0f, 5.5f, 5.5f, paint2);
        this.A0E = new AnonymousClass67Q(context, r10);
        this.A0F = "analog-clock";
    }

    public void A0J(RectF rectF, float f, float f2, float f3, float f4) {
        AnonymousClass00C.A0D(rectF, 0);
        super.A0J(rectF, f, f2, f3, f4);
        this.A0E.A00(rectF.width() / 1020.0f);
    }

    public void A0L(JSONObject jSONObject) {
        AnonymousClass00C.A0D(jSONObject, 0);
        super.A0L(jSONObject);
        jSONObject.put("hour", this.A00);
        jSONObject.put("minute", this.A01);
        jSONObject.put("theme", this.A08);
    }
}
