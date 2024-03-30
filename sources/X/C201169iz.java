package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9iz  reason: invalid class name and case insensitive filesystem */
public final class C201169iz {
    public long A00;
    public long A01;
    public String A02;
    public String A03;

    public C201169iz(C203399nx r9) {
        this.A02 = r9.A0i("action", (String) null);
        this.A03 = r9.A0i("status", (String) null);
        String A0i = r9.A0i("pause-start-ts", (String) null);
        if (A0i != null) {
            this.A01 = AnonymousClass6R8.A01(A0i, 0) * 1000;
        }
        String A0i2 = r9.A0i("pause-end-ts", (String) null);
        if (A0i2 != null) {
            this.A00 = AnonymousClass6R8.A01(A0i2, 0) * 1000;
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ action: ");
        C200449hQ.A03(A0u, this.A02);
        A0u.append(" status: ");
        C200449hQ.A03(A0u, this.A03);
        StringBuilder A0q = C90484aE.A0q(" pauseStartDate: ", A0u);
        A0q.append(this.A01);
        C200449hQ.A04(A0q, A0u);
        StringBuilder A0q2 = C90484aE.A0q(" pauseEndDate: ", A0u);
        A0q2.append(this.A00);
        C200449hQ.A04(A0q2, A0u);
        return C90474aD.A0g(A0u);
    }

    public C201169iz(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject A1C = C36441kJ.A1C(str);
                this.A02 = A1C.optString("action");
                this.A03 = A1C.optString("status");
                this.A01 = A1C.optLong("pauseStartTs", -1);
                this.A00 = A1C.optLong("pauseEndTs", -1);
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiMandateMetadata:PauseResumeStatusDetails threw: ", e);
            }
        }
    }

    public C201169iz() {
    }
}
