package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Ws  reason: invalid class name and case insensitive filesystem */
public class C46392Ws extends C54642tH {
    public final C19730wQ A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass171 A02;
    public final AnonymousClass32G A03;
    public final AnonymousClass3G0 A04;
    public final C132696Uw A05;
    public final C21430zE A06;

    public C596234q A00(C128946Ef r18, CallInfo callInfo) {
        C21430zE r13 = this.A06;
        r13.markerStart(494341755, "trigger_type", "event");
        CallInfo callInfo2 = callInfo;
        if (callInfo != null) {
            short s = 3;
            try {
                CallState callState = callInfo2.callState;
                JSONObject A012 = AnonymousClass5B3.A01(this.A00, this.A01, this.A02, this.A03, this.A04, this.A05, r13, r18, callInfo2, callState);
                r13.markerPoint(494341755, "create_stella_event_start");
                s = 2;
                return new C596234q("call_state_changed", A012);
            } catch (JSONException e) {
                Log.e("CallStateChangedEventFactory/createEvent", e);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("JSONException:");
                String message = e.getMessage();
                String str = "";
                if (message != null) {
                    str = message.toString();
                }
                r13.markerAnnotate(494341755, "fail_reason", AnonymousClass000.A0q(str, A0u));
                return null;
            } finally {
                r13.markerEnd(494341755, s);
            }
        } else {
            r13.markerAnnotate(494341755, "fail_reason", "null_input");
            return null;
        }
    }

    public C46392Ws(C19730wQ r1, AnonymousClass16D r2, AnonymousClass171 r3, AnonymousClass32G r4, AnonymousClass3G0 r5, C132696Uw r6, C21430zE r7) {
        this.A06 = r7;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
    }
}
