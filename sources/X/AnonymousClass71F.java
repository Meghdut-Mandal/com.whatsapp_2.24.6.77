package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import java.util.Map;
import javax.crypto.SecretKey;
import org.json.JSONObject;

/* renamed from: X.71F  reason: invalid class name */
public final class AnonymousClass71F implements C158717hx {
    public final AnonymousClass6MG A00;
    public final AnonymousClass17Y A01;
    public final C1258061i A02;
    public final AnonymousClass6OE A03;
    public final C19970wo A04;
    public final C20310xM A05;
    public final AnonymousClass1KZ A06;
    public final AnonymousClass6TL A07;
    public final C20810yC A08;
    public final AnonymousClass1A1 A09;
    public final C19770wU A0A;
    public final AnonymousClass67S A0B;

    public void BlS(Activity activity, C594233w r48, Map map) {
        Intent intent;
        Bundle extras;
        byte[] bArr;
        boolean z;
        boolean z2;
        Activity activity2 = activity;
        if (activity != null && (intent = activity2.getIntent()) != null && (extras = intent.getExtras()) != null) {
            String string = extras.getString("chat_id");
            UserJid A0l = C36431kI.A0l(string);
            String string2 = extras.getString("flow_token");
            String string3 = extras.getString("flow_message_version");
            String string4 = extras.getString("flow_id");
            String string5 = extras.getString("flow_data_endpoint");
            SecretKey A0l2 = C90494aF.A0l();
            byte[] bArr2 = new byte[16];
            C90504aG.A1Q(bArr2);
            AnonymousClass00C.A0B(A0l2);
            AnonymousClass00C.A0D(A0l2, 1);
            String string6 = extras.getString("user_locale");
            if (string3 != null && string != null && A0l != null && string2 != null && string4 != null && string6 != null) {
                Map map2 = map;
                if (map != null && map2.containsKey("business_payload") && map2.containsKey("client_params")) {
                    Object obj = map2.get("business_payload");
                    AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Any, kotlin.Any>");
                    Map A022 = C07710Yz.A02(obj);
                    A022.put("flow_token", string2);
                    Map A023 = C07710Yz.A02(C90514aH.A0n("client_params", "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Any, kotlin.Any>", map2));
                    String A0c = C90474aD.A0c("version", A022);
                    C20810yC r6 = this.A08;
                    if (!r6.A0E(5374) || "100".equalsIgnoreCase(A0c)) {
                        A022.put("user_locale", string6);
                    }
                    if (A0c == null || "100".equalsIgnoreCase(A0c)) {
                        bArr = bArr2;
                    } else {
                        bArr = new byte[16];
                        int i = 0;
                        do {
                            bArr[i] = (byte) (~bArr2[i]);
                            i++;
                        } while (i < 16);
                    }
                    if (A023.containsKey("show_loading")) {
                        z = C90474aD.A1W(A023, "show_loading");
                    } else {
                        z = false;
                    }
                    if (A023.containsKey("show_full_screen_error")) {
                        z2 = C90474aD.A1W(A023, "show_full_screen_error");
                    } else {
                        z2 = false;
                    }
                    ((AnonymousClass7i0) activity2).BsW(z);
                    JSONObject jSONObject = new JSONObject(A022);
                    C1258061i r13 = this.A02;
                    String A0y = C36381kD.A0y(jSONObject);
                    AnonymousClass67S r14 = this.A0B;
                    AnonymousClass6MG r12 = this.A00;
                    AnonymousClass17Y r11 = this.A01;
                    C19770wU r10 = this.A0A;
                    C20310xM r9 = this.A05;
                    AnonymousClass6TL r8 = this.A07;
                    C19970wo r7 = this.A04;
                    C1258061i r19 = r13;
                    AnonymousClass17Y r18 = r11;
                    AnonymousClass6MG r17 = r12;
                    r14.A01(new C145366tm(activity2, r17, r18, r19, r48, this.A03, r7, r9, r8, r6, this.A09, r10, r14, string3, string5, string4, A0y, A0l2, bArr, true, z2), A0l, C36381kD.A0y(jSONObject), string3, "UNKNOWN", A0l2, bArr2, false, false, false);
                }
            }
        }
    }

    public AnonymousClass71F(AnonymousClass6MG r2, AnonymousClass17Y r3, C1258061i r4, AnonymousClass6OE r5, C19970wo r6, C20310xM r7, AnonymousClass1KZ r8, AnonymousClass6TL r9, C20810yC r10, AnonymousClass1A1 r11, C19770wU r12, AnonymousClass67S r13) {
        C36321k7.A1B(r4, r12, r7, r3, r2);
        C36361kB.A1J(r10, 7, r9);
        AnonymousClass00C.A0D(r6, 9);
        C36341k9.A1G(r8, r11);
        this.A02 = r4;
        this.A0A = r12;
        this.A05 = r7;
        this.A01 = r3;
        this.A00 = r2;
        this.A0B = r13;
        this.A08 = r10;
        this.A07 = r9;
        this.A04 = r6;
        this.A03 = r5;
        this.A06 = r8;
        this.A09 = r11;
    }
}
