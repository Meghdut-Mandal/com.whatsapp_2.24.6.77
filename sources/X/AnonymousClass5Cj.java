package X;

import android.graphics.Paint;
import org.json.JSONObject;

/* renamed from: X.5Cj  reason: invalid class name */
public final class AnonymousClass5Cj extends C129196Ft {
    public final Paint A00;
    public final String A01;

    public AnonymousClass5Cj(JSONObject jSONObject) {
        Paint A0K = C36441kJ.A0K();
        A0K.setAntiAlias(true);
        A0K.setFilterBitmap(true);
        A0K.setDither(true);
        this.A00 = A0K;
        A0M(jSONObject);
        this.A01 = C90474aD.A0e("file", jSONObject);
    }

    public void A0L(JSONObject jSONObject) {
        AnonymousClass00C.A0D(jSONObject, 0);
        super.A0L(jSONObject);
        jSONObject.put("file", this.A01);
    }

    public AnonymousClass5Cj(String str) {
        Paint A0K = C36441kJ.A0K();
        A0K.setAntiAlias(true);
        A0K.setFilterBitmap(true);
        A0K.setDither(true);
        this.A00 = A0K;
        this.A01 = str;
    }
}
