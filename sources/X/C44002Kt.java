package X;

import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Kt  reason: invalid class name and case insensitive filesystem */
public class C44002Kt extends C44022Kv {
    public String A00;
    public String A01;
    public String A02;
    public List A03;

    public boolean A04(String str) {
        try {
            super.A04(str);
            JSONObject A1C = C36441kJ.A1C(str);
            this.A01 = A1C.optString("header_type");
            this.A02 = A1C.optString("template_id_hash");
            JSONArray optJSONArray = A1C.optJSONArray("button_id_hashes");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.A03 = AnonymousClass001.A0I();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.A03.add(optJSONArray.get(i).toString());
                }
            }
            if (!A1C.has("template_button_reply_selected_id_hash")) {
                return true;
            }
            this.A00 = A1C.optString("template_button_reply_selected_id_hash");
            return true;
        } catch (JSONException e) {
            Log.w("ConversationSketchHSMEvent: fromJsonString threw: ", e);
            return false;
        }
    }

    public C44002Kt(AnonymousClass3T1 r4, String str, String str2, int i) {
        super(i, str, str2);
        String str3;
        int i2 = r4.A1I;
        if (i2 == 32) {
            this.A00 = C44022Kv.A01(((AnonymousClass2cV) r4).A02);
        } else {
            if (i2 == 27) {
                str3 = "text";
            } else if (i2 == 25) {
                str3 = "image";
            } else if (i2 == 30) {
                str3 = "location";
            } else if (i2 == 28) {
                str3 = "video";
            } else if (i2 == 26) {
                str3 = "document";
            } else if (i2 == 29) {
                str3 = "gif";
            } else {
                str3 = "unsupported";
            }
            this.A01 = str3;
        }
        if (r4 instanceof C88854Uh) {
            AnonymousClass3F4 BIE = ((C88854Uh) r4).BIE();
            this.A02 = C44022Kv.A01(BIE.A05);
            List<AnonymousClass3P8> list = BIE.A06;
            if (list != null) {
                this.A03 = AnonymousClass001.A0I();
                for (AnonymousClass3P8 r0 : list) {
                    this.A03.add(C44022Kv.A01(r0.A08));
                }
            }
        }
    }

    public C44002Kt() {
        super(-1, "unknown", "unknown");
    }
}
