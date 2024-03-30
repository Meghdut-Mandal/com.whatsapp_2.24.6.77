package X;

import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.3PE  reason: invalid class name */
public class AnonymousClass3PE {
    public static final AnonymousClass3PE A0L = new AnonymousClass3PD().A01();
    public final AnonymousClass11F A00;
    public final UserJid A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final JSONObject A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public AnonymousClass3PE(AnonymousClass11F r2, UserJid userJid, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, JSONObject jSONObject, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A05 = str;
        this.A0A = str2;
        this.A06 = str3;
        this.A0H = z;
        this.A0I = z2;
        this.A0E = z3;
        this.A0J = z4;
        this.A0K = z5;
        this.A0B = str4;
        this.A07 = str6;
        this.A03 = str5;
        this.A00 = r2;
        this.A01 = userJid;
        this.A09 = str7;
        this.A08 = str8;
        this.A02 = str9;
        this.A0D = jSONObject;
        this.A0G = z6;
        this.A0C = list;
        this.A04 = str10;
        this.A0F = z7;
    }

    public Bundle A00() {
        String str;
        String str2;
        Bundle A072 = AnonymousClass001.A07();
        A072.putString("data", this.A05);
        A072.putString("source", this.A0A);
        A072.putString("entry_point", this.A06);
        A072.putBoolean("has_ib", this.A0H);
        A072.putBoolean("has_wm", this.A0I);
        A072.putBoolean("ads_logging_requires_tos", this.A0E);
        A072.putBoolean("show_ad_attribution", this.A0J);
        A072.putBoolean("show_keyboard", this.A0K);
        A072.putString("icebreaker", this.A07);
        A072.putString("ctwa_context", this.A03);
        A072.putString("source_url", this.A0B);
        UserJid userJid = this.A01;
        String str3 = null;
        if (userJid != null) {
            str = userJid.getRawString();
        } else {
            str = null;
        }
        A072.putString("jid", str);
        AnonymousClass11F r0 = this.A00;
        if (r0 != null) {
            str2 = r0.getRawString();
        } else {
            str2 = null;
        }
        A072.putString("lid", str2);
        A072.putString("productId", this.A09);
        A072.putString("land_on_whatsapp_catalog", this.A08);
        A072.putString("categoryId", this.A02);
        JSONObject jSONObject = this.A0D;
        if (jSONObject != null) {
            str3 = jSONObject.toString();
        }
        A072.putString("banner", str3);
        A072.putBoolean("consumer_disclosure", this.A0G);
        List<C52142ox> list = this.A0C;
        if (list != null) {
            ArrayList A0I2 = AnonymousClass001.A0I();
            for (C52142ox r02 : list) {
                A0I2.add(r02.label);
            }
            A072.putStringArrayList("client_filters", A0I2);
        }
        A072.putString("ctwa_context_override_phone_number", this.A04);
        A072.putBoolean("always_show_ad_attribution", this.A0F);
        return A072;
    }
}
