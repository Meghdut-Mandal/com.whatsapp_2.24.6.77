package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3PX  reason: invalid class name */
public class AnonymousClass3PX {
    public final C21010yW A00;
    public final AnonymousClass629 A01;
    public final C20810yC A02;
    public final C30801an A03;
    public final C19770wU A04;

    public void A02(AnonymousClass3T1 r8, String str, int i) {
        String str2 = str;
        if (!A00(str)) {
            this.A04.Boy(new C80523vX(this, r8, str2, i, 9));
        }
    }

    private boolean A00(String str) {
        C20810yC r1;
        int i;
        if (str.equals("link_to_webview")) {
            r1 = this.A02;
            i = 3577;
        } else if (str.equals("marketing_msg_webview")) {
            r1 = this.A02;
            i = 3904;
        } else if (!str.equals("checkout_lite")) {
            return false;
        } else {
            r1 = this.A02;
            i = 4295;
        }
        return !r1.A0E(i);
    }

    public AnonymousClass3PX(C20810yC r1, C21010yW r2, C30801an r3, AnonymousClass629 r4, C19770wU r5) {
        this.A02 = r1;
        this.A04 = r5;
        this.A00 = r2;
        this.A01 = r4;
        this.A03 = r3;
    }

    public void A01(AnonymousClass11F r10, String str, String str2, int i, int i2) {
        if (!A00(str)) {
            JSONObject A1B = C36441kJ.A1B();
            try {
                A1B.put("cta", str);
            } catch (JSONException e) {
                Log.w(C36331k8.A0i("MessageWithLinkLogging/logInteraction/", AnonymousClass000.A0u(), e));
            }
            AnonymousClass11F r1 = r10;
            this.A03.A00(r1, C36371kC.A0n(), A1B.toString(), str2, i, i2, 1, true);
        }
    }
}
