package X;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6lT  reason: invalid class name and case insensitive filesystem */
public class C140366lT implements C157817ej {
    public final C121935tx A00;
    public final Boolean A01;

    public void BoE(AnonymousClass5S6 r2, String str, String str2, Throwable th, Map map, int i) {
        A00((C1271967i) null, this, str2, th);
    }

    public static void A00(C1271967i r6, C140366lT r7, String str, Throwable th) {
        String A002;
        C121935tx r5 = r7.A00;
        if (r5 != null) {
            if (r6 == null) {
                A002 = null;
            } else {
                A002 = C1271967i.A00(r6);
            }
            if (th != null) {
                th.toString();
            }
            if (A002 == null) {
                A002 = null;
            }
            AnonymousClass58D r4 = new AnonymousClass58D();
            r4.A03 = "";
            r4.A00 = C36441kJ.A0y(0);
            r4.A04 = str;
            r4.A01 = r5.A01.A00;
            if (A002 != null) {
                try {
                    JSONObject A0y = C90484aE.A0y("callsite", C36441kJ.A1C(A002));
                    r4.A02 = A0y.optString("feature", "unknown");
                    r4.A05 = A0y.optString("oncall", "unknown");
                    r4.A06 = A0y.optString("product", "unknown");
                } catch (JSONException unused) {
                    r5.A00.A0E("wa_bloks_mins_crash_logs", "Failed to parse loggingID", true);
                }
            }
            r5.A02.Blv(r4);
        }
    }

    public C140366lT(C121935tx r1, Boolean bool) {
        this.A00 = r1;
        this.A01 = bool;
    }
}
