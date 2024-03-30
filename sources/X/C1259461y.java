package X;

import com.whatsapp.util.Log;
import org.json.JSONException;

/* renamed from: X.61y  reason: invalid class name and case insensitive filesystem */
public class C1259461y {
    public final /* synthetic */ AnonymousClass6VU A00;
    public final /* synthetic */ C122545v1 A01;

    public void A00(AnonymousClass6KG r8) {
        AnonymousClass6VU r5;
        C122545v1 r3;
        C1261662u r1;
        Integer num = null;
        try {
            num = Integer.valueOf(r8.A01);
            r5 = this.A00;
            r3 = this.A01;
            r5.A0D(r3, r8);
        } catch (JSONException e) {
            r5 = this.A00;
            String A0k = C90484aE.A0k(e);
            r5.A0E(A0k);
            r5.A02.A0E("GraphApiACSNetworkRequest/createResponseCallback/onResponseReceived: Error while parsing the JSON: ", e.getMessage(), true);
            r3 = this.A01;
            r3.A00 = 2;
            r1 = new C1261662u(num, A0k, 7);
        } catch (Exception e2) {
            r5 = this.A00;
            String A0k2 = C90484aE.A0k(e2);
            r5.A0E(A0k2);
            Log.e("GraphApiACSNetworkRequest/createResponseCallback/onResponseReceived: generic error - ", e2);
            r3 = this.A01;
            r3.A00 = 3;
            r1 = new C1261662u(num, A0k2, 6);
        }
        C36341k9.A0H().post(new C81193wc(r5, r3, 46));
        r3.A01 = r1;
        C36341k9.A0H().post(new C81193wc(r5, r3, 46));
    }

    public C1259461y(AnonymousClass6VU r1, C122545v1 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
