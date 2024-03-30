package X;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.5HO  reason: invalid class name */
public class AnonymousClass5HO extends AnonymousClass647 {
    public final C131506Pi A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass5HO r5 = (AnonymousClass5HO) obj;
            if (!this.A06.equals(r5.A06) || !this.A05.equals(r5.A05) || !this.A07.equals(r5.A07) || !this.A08.equals(r5.A08) || !this.A01.equals(r5.A01) || !this.A00.equals(r5.A00) || !C1901797e.A00(this.A02, r5.A02) || !C1901797e.A00(this.A04, r5.A04) || !C1901797e.A00(this.A03, r5.A03) || !C1901797e.A00(this.A02, r5.A02) || !C1901797e.A00(this.A03, r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public static AnonymousClass5HO A00(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        String string = jSONObject.getString("title");
        String string2 = jSONObject.getString("icon_description");
        String string3 = jSONObject.getString("agree_button_text");
        String string4 = jSONObject.getString("icon_light_url");
        String string5 = jSONObject.getString("icon_dark_url");
        if (jSONObject.has("icon_role")) {
            str = jSONObject.getString("icon_role");
        } else {
            str = null;
        }
        if (jSONObject.has("icon_style")) {
            str2 = jSONObject.getString("icon_style");
        } else {
            str2 = null;
        }
        AnonymousClass65B r8 = new AnonymousClass65B(C131506Pi.A00(jSONObject.getJSONObject("timing")), string4, string5, string2, string, string3);
        r8.A00 = C111305c4.A00(str);
        r8.A01 = C111315c5.A00(str2);
        JSONArray jSONArray = jSONObject.getJSONArray("bullets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string6 = jSONObject2.getString("bullet_text_");
            if (jSONObject2.has("bullet_icon_light_url_")) {
                str3 = jSONObject2.optString("bullet_icon_light_url_");
            } else {
                str3 = null;
            }
            if (jSONObject2.has("bullet_icon_dark_url_")) {
                str4 = jSONObject2.optString("bullet_icon_dark_url_");
            } else {
                str4 = null;
            }
            r8.A05.add(new C128156Bc(string6, str3, str4));
        }
        if (jSONObject.has("body")) {
            r8.A02 = jSONObject.getString("body");
        }
        if (jSONObject.has("footer")) {
            r8.A04 = jSONObject.getString("footer");
        }
        if (jSONObject.has("dismiss_button_text")) {
            r8.A03 = jSONObject.getString("dismiss_button_text");
        }
        return r8.A00();
    }

    public int hashCode() {
        String str;
        Object[] objArr = new Object[11];
        objArr[0] = this.A06;
        objArr[1] = this.A05;
        objArr[2] = this.A07;
        objArr[3] = this.A08;
        objArr[4] = this.A01;
        objArr[5] = this.A00;
        objArr[6] = this.A02;
        objArr[7] = this.A04;
        objArr[8] = this.A03;
        AnonymousClass5TI r0 = this.A02;
        String str2 = "";
        if (r0 == null) {
            str = str2;
        } else {
            str = r0.id;
        }
        objArr[9] = str;
        AnonymousClass5TJ r02 = this.A03;
        if (r02 != null) {
            str2 = r02.id;
        }
        return AnonymousClass000.A0M(str2, objArr, 10);
    }

    public AnonymousClass5HO(C131506Pi r1, AnonymousClass5TI r2, AnonymousClass5TJ r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list) {
        super(r2, r3, str3);
        this.A06 = str;
        this.A05 = str2;
        this.A08 = list;
        this.A07 = str4;
        this.A01 = str5;
        this.A00 = r1;
        this.A02 = str6;
        this.A04 = str7;
        this.A03 = str8;
    }

    public JSONObject A02() {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("title", this.A07);
        A1B.put("icon_description", this.A04);
        A1B.put("agree_button_text", this.A01);
        A1B.put("icon_light_url", this.A06);
        A1B.put("icon_dark_url", this.A05);
        AnonymousClass5TI r0 = this.A02;
        if (r0 != null) {
            A1B.put("icon_role", r0.id);
        }
        AnonymousClass5TJ r02 = this.A03;
        if (r02 != null) {
            A1B.put("icon_style", r02.id);
        }
        A1B.put("timing", this.A00.A01());
        JSONArray A0u = C90524aI.A0u();
        for (C128156Bc r4 : this.A08) {
            JSONObject A1B2 = C36441kJ.A1B();
            A1B2.put("bullet_text_", r4.A02);
            String str = r4.A01;
            if (str != null) {
                A1B2.put("bullet_icon_light_url_", str);
            }
            String str2 = r4.A00;
            if (str2 != null) {
                A1B2.put("bullet_icon_dark_url_", str2);
            }
            A0u.put(A1B2);
        }
        A1B.put("bullets", A0u);
        String str3 = this.A02;
        if (str3 != null) {
            A1B.put("body", str3);
        }
        String str4 = this.A04;
        if (str4 != null) {
            A1B.put("footer", str4);
        }
        String str5 = this.A03;
        if (str5 != null) {
            A1B.put("dismiss_button_text", str5);
        }
        return A1B;
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UserNoticeModal{iconLightUrl='");
        char A002 = C90484aE.A00(this.A06, A0u);
        A0u.append(", iconDarkUrl='");
        A0u.append(this.A05);
        A0u.append(A002);
        A0u.append("iconRole='");
        AnonymousClass5TI r0 = this.A02;
        String str2 = "null";
        if (r0 != null) {
            str = r0.name();
        } else {
            str = str2;
        }
        A0u.append(str);
        A0u.append(A002);
        A0u.append(", iconStyle='");
        AnonymousClass5TJ r02 = this.A03;
        if (r02 != null) {
            str2 = r02.name();
        }
        A0u.append(str2);
        A0u.append(A002);
        A0u.append(", iconDescription='");
        A0u.append(this.A04);
        A0u.append(A002);
        A0u.append(", title='");
        A0u.append(this.A07);
        A0u.append(A002);
        A0u.append(", bulletPoints=");
        A0u.append(this.A08);
        A0u.append(", agreeButtonText='");
        A0u.append(this.A01);
        A0u.append(A002);
        A0u.append(", timing=");
        A0u.append(this.A00);
        A0u.append(", body='");
        A0u.append(this.A02);
        A0u.append(A002);
        A0u.append(", footer='");
        A0u.append(this.A04);
        A0u.append(A002);
        A0u.append(", dismissButtonText='");
        A0u.append(this.A03);
        A0u.append(A002);
        return AnonymousClass000.A0s(A0u);
    }
}
