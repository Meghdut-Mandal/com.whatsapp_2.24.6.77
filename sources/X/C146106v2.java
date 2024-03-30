package X;

import java.util.Map;
import org.json.JSONException;

/* renamed from: X.6v2  reason: invalid class name and case insensitive filesystem */
public class C146106v2 implements C160437l0 {
    public final /* synthetic */ C115245iZ A00;
    public final /* synthetic */ C19720wP A01;

    public /* synthetic */ void BUJ(String str) {
    }

    public C146106v2(C115245iZ r1, C19720wP r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void Bez(String str, Map map) {
        try {
            if ("only_exception".equals(C36441kJ.A1C(str).optString("upload", ""))) {
                this.A00.A00 = "exception_only";
            } else {
                this.A00.A00 = "exception_and_logs";
            }
        } catch (JSONException unused) {
            this.A00.A00 = "exception_and_logs";
        }
    }

    public void BWo(String str) {
        C36321k7.A1P("app/CrashLogs/uploadServerOkay/error received: ", str, AnonymousClass000.A0u());
    }

    public void BVA(long j) {
    }
}
