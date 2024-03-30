package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.json.JSONObject;

/* renamed from: X.5CZ  reason: invalid class name */
public final class AnonymousClass5CZ extends C104945Cb implements C88204Ru {
    public Drawable A00;
    public int A01;
    public String A02;
    public String A03;
    public boolean A04;
    public final String A05;
    public final int A06;
    public final Context A07;
    public final AnonymousClass1HA A08;

    public void A0L(JSONObject jSONObject) {
        String str;
        AnonymousClass00C.A0D(jSONObject, 0);
        super.A0L(jSONObject);
        String str2 = this.A02;
        if (!(str2 == null || (str = this.A03) == null)) {
            jSONObject.put("file_path", str2);
            jSONObject.put("plain_file_hash", str);
            jSONObject.put("file_storage_location", this.A01);
        }
        jSONObject.put("sticker_size", this.A06);
        jSONObject.put("content_description", this.A05);
        jSONObject.put("sticker_is_lottie", this.A04);
    }

    public void Bhd(Drawable drawable) {
        this.A00 = drawable;
        RectF rectF = this.A02;
        A0J(rectF, rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    private final void A00() {
        String str = this.A02;
        C18740tg.A06(str);
        String str2 = this.A03;
        C18740tg.A06(str2);
        int i = this.A06;
        C18740tg.A0C(AnonymousClass000.A1R(i));
        C135066c4 r5 = new C135066c4((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String[]) null, 0, 0, 0, false, false, false, false, false, false);
        r5.A02(str, r5.A01);
        r5.A0E = str2;
        r5.A0N = this.A04;
        this.A08.A07(this.A07, r5, this, i, i);
    }

    public static final void A01(Canvas canvas, AnonymousClass5CZ r6, int i, int i2) {
        RectF rectF = r6.A02;
        float width = rectF.width() / ((float) i);
        float height = rectF.height() / ((float) i2);
        canvas.translate(rectF.centerX(), rectF.centerY());
        canvas.scale(width, height);
        canvas.rotate(r6.A00);
        float f = ((float) (-i)) / 2.0f;
        canvas.translate(f, f);
    }

    public AnonymousClass5CZ(Context context, AnonymousClass1HA r6, JSONObject jSONObject) {
        this.A07 = context;
        this.A06 = jSONObject.getInt("sticker_size");
        this.A08 = r6;
        if (jSONObject.has("file_path") && jSONObject.has("plain_file_hash") && jSONObject.has("file_storage_location")) {
            this.A02 = jSONObject.getString("file_path");
            this.A03 = jSONObject.getString("plain_file_hash");
            this.A01 = jSONObject.getInt("file_storage_location");
            this.A04 = jSONObject.getBoolean("sticker_is_lottie");
            A00();
        }
        this.A05 = C90474aD.A0e("content_description", jSONObject);
        A0M(jSONObject);
        if (this.A00 == null) {
            throw AnonymousClass001.A08("loadedDrawable was not loaded correctly");
        }
    }

    public AnonymousClass5CZ(Context context, C135066c4 r3, AnonymousClass1HA r4, int i) {
        C36331k8.A1G(r3, 2, r4);
        this.A07 = context;
        this.A02 = r3.A0A;
        this.A06 = i;
        this.A01 = r3.A01;
        this.A03 = r3.A0E;
        this.A04 = r3.A0N;
        String A002 = AnonymousClass3RT.A00(context, r3);
        AnonymousClass00C.A08(A002);
        this.A05 = A002;
        this.A08 = r4;
        A00();
    }
}
