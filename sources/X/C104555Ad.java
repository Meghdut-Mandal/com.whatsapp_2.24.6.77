package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5Ad  reason: invalid class name and case insensitive filesystem */
public abstract class C104555Ad extends C146036uv {
    public final C20020wt A00;
    public final String A01;
    public final String A02;
    public final C18820ts A03;

    public C104555Ad(C20050ww r14, C19420v0 r15, C18820ts r16, C20810yC r17, AnonymousClass1WF r18, C20020wt r19, AnonymousClass005 r20, String str, String str2, String str3, AnonymousClass004 r24, AnonymousClass004 r25, long j) {
        super(r14, r15, r17, r18, r20, str, (Map) null, r24, r25, j);
        this.A00 = r19;
        this.A03 = r16;
        this.A02 = str2;
        this.A01 = str3;
    }

    public String A04() {
        return this.A03.A0J(A06());
    }

    public void A09(JSONObject jSONObject) {
        String str;
        JSONObject A1C;
        jSONObject.put("app_id", this.A02);
        if (this instanceof C1024950f) {
            str = "bloks_version";
        } else if ((this instanceof C1024550b) || (this instanceof C1024450a) || (this instanceof C1024750d) || (this instanceof AnonymousClass50Z) || (this instanceof C1024850e) || (this instanceof AnonymousClass50Y) || (this instanceof AnonymousClass50X)) {
            str = "version";
        } else {
            str = "versioning_id";
        }
        jSONObject.put(str, "b3ee4083bc5153a49b8915306fcb062aac140bd37f9c3c5b42e55d85397fdf0c");
        String str2 = this.A01;
        if (TextUtils.isEmpty(str2)) {
            str2 = "{}";
        }
        AnonymousClass00C.A0D(str2, 0);
        if (C222013h.A02) {
            try {
                if (str2.length() == 0) {
                    A1C = C36441kJ.A1B();
                } else {
                    A1C = C36441kJ.A1C(str2);
                }
                JSONObject A0t = C90474aD.A0t("params", A1C);
                if (A0t.length() == 0) {
                    JSONObject A0t2 = C90474aD.A0t("server_params", A1C);
                    if (A0t2.length() != 0) {
                        A0t2.accumulate("use_new_colors", Boolean.valueOf(C222013h.A05));
                        A1C.put("server_params", A0t2);
                        str2 = C36381kD.A0y(A1C);
                    }
                }
                JSONObject A0t3 = C90474aD.A0t("server_params", A0t);
                if (A0t3.length() == 0 && A0t.length() != 0 && !A0t.has("server_params")) {
                    Iterator<String> keys = A0t.keys();
                    AnonymousClass00C.A08(keys);
                    while (keys.hasNext()) {
                        String A0C = AnonymousClass001.A0C(keys);
                        A0t3.accumulate(A0C, A0t.get(A0C));
                    }
                }
                A0t3.accumulate("use_new_colors", Boolean.valueOf(C222013h.A05));
                A0t.put("server_params", A0t3);
                String A0l = C90484aE.A0l(A0t, "params", A1C);
                AnonymousClass00C.A0B(A0l);
                str2 = A0l;
            } catch (JSONException unused) {
            }
        }
        jSONObject.put("params", str2);
    }
}
