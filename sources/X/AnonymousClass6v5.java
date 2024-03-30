package X;

import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6v5  reason: invalid class name */
public class AnonymousClass6v5 implements C160437l0 {
    public AnonymousClass6DJ A00;
    public final AnonymousClass1GE A01;
    public final AnonymousClass1BU A02;
    public final C123345wL A03;
    public final String A04;
    public final String A05;
    public final AnonymousClass1BW A06;

    public /* synthetic */ void BUJ(String str) {
    }

    public /* synthetic */ void BVA(long j) {
    }

    public void Bez(String str, Map map) {
        try {
            JSONObject A1C = C36441kJ.A1C(str);
            if (!A1C.has("resume")) {
                return;
            }
            if ("complete".equals(A1C.optString("resume"))) {
                this.A00.A05 = A1C.optString("url");
                this.A00.A03 = A1C.optString("direct_path");
                this.A00.A02 = AnonymousClass5SJ.COMPLETE;
                return;
            }
            this.A00.A01 = A1C.optInt("resume");
            this.A00.A02 = AnonymousClass5SJ.RESUME;
        } catch (JSONException e) {
            Log.w("mediaupload/MMS upload resume form post failed to parse JSON response; ", e);
            this.A00.A02 = AnonymousClass5SJ.FAILURE;
        }
    }

    public AnonymousClass6v5(AnonymousClass1BW r1, AnonymousClass1GE r2, AnonymousClass1BU r3, C123345wL r4, String str, String str2) {
        this.A06 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = str;
        this.A03 = r4;
        this.A05 = str2;
    }

    public void BWo(String str) {
        C36321k7.A1P("httpresumecheck/error = ", str, AnonymousClass000.A0u());
    }
}
