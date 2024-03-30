package X;

import android.graphics.RectF;
import org.json.JSONObject;

/* renamed from: X.5Cm  reason: invalid class name and case insensitive filesystem */
public final class C104955Cm extends C129196Ft implements C158467gy {
    public final int A00;
    public final C52332pG A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public void A0L(JSONObject jSONObject) {
        AnonymousClass00C.A0D(jSONObject, 0);
        super.A0L(jSONObject);
        jSONObject.put("skipConfirmation", this.A05);
        jSONObject.put("newsletterJid", this.A03);
        jSONObject.put("serverMessageId", this.A00);
        jSONObject.put("newsletterName", this.A04);
        C52332pG r0 = this.A01;
        if (r0 != null) {
            jSONObject.put("contentType", r0.value);
        }
        String str = this.A02;
        if (str != null) {
            jSONObject.put("accessibilityText", str);
        }
    }

    public void A0J(RectF rectF, float f, float f2, float f3, float f4) {
        RectF rectF2 = this.A02;
        rectF2.set(f, f2, f3, f4);
        rectF2.sort();
    }

    public C104955Cm(JSONObject jSONObject) {
        A0M(jSONObject);
        this.A05 = jSONObject.getBoolean("skipConfirmation");
        this.A03 = C90474aD.A0e("newsletterJid", jSONObject);
        this.A00 = jSONObject.getInt("serverMessageId");
        this.A04 = C90474aD.A0e("newsletterName", jSONObject);
        this.A01 = C55152uA.A00(Integer.valueOf(jSONObject.optInt("contentType")));
        this.A02 = jSONObject.optString("accessibilityText");
    }

    public boolean BuC() {
        return this.A05;
    }

    public C104955Cm(C52332pG r2, String str, String str2, String str3, int i, boolean z) {
        AnonymousClass00C.A0D(str, 2);
        this.A05 = z;
        this.A03 = str;
        this.A00 = i;
        this.A04 = str2;
        this.A01 = r2;
        this.A02 = str3;
    }
}
