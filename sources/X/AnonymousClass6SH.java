package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6SH  reason: invalid class name */
public class AnonymousClass6SH {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public static AnonymousClass6SH A00(String str) {
        try {
            JSONObject A1C = C36441kJ.A1C(str);
            return new AnonymousClass6SH(A1C.optString("media_codec_encoder", (String) null), A1C.optString("media_codec_decoder", (String) null), A1C.optInt("color_format_encoder", -1), A1C.optInt("color_format_decoder", -1), A1C.optInt("forced_frame_conv_id_encoder", -1), A1C.optInt("forced_frame_conv_id_decoder", -1));
        } catch (JSONException unused) {
            return null;
        }
    }

    public AnonymousClass6SH(String str, String str2, int i, int i2, int i3, int i4) {
        this.A05 = str;
        this.A01 = i;
        this.A03 = i3;
        this.A04 = str2;
        this.A00 = i2;
        this.A02 = i4;
    }

    public AnonymousClass6SH() {
        this((String) null, (String) null, -1, -1, -1, -1);
    }
}
