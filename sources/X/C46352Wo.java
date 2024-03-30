package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Wo  reason: invalid class name and case insensitive filesystem */
public class C46352Wo extends AnonymousClass6FT {
    public final C21390zA A00;
    public final AnonymousClass32G A01;
    public final C64423Nx A02;
    public final C46362Wp A03;
    public final C46372Wq A04;
    public final C46392Ws A05;
    public final C46402Wt A06;
    public final C46382Wr A07;
    public final AnonymousClass1VH A08;
    public final String A09 = "com.facebook.stella";

    public void A04() {
        C596234q r1 = new C596234q("authorization_revoked", (JSONObject) null);
        try {
            C64423Nx r3 = this.A02;
            JSONObject A1B = C36441kJ.A1B();
            A1B.put("action", "authorization_revoked");
            A1B.putOpt("payload", r1.A01);
            C64423Nx.A00(r3, A1B.toString(), false);
        } catch (JSONException unused) {
            Log.e("StellaEventDispatcher/failed to create event");
        }
    }

    public C46352Wo(C21390zA r2, AnonymousClass32G r3, C64423Nx r4, C46362Wp r5, C46372Wq r6, C46392Ws r7, C46402Wt r8, C46382Wr r9, AnonymousClass1VH r10) {
        this.A02 = r4;
        this.A04 = r6;
        this.A01 = r3;
        this.A08 = r10;
        this.A00 = r2;
        this.A07 = r9;
        this.A06 = r8;
        this.A05 = r7;
        this.A03 = r5;
    }

    private void A00() {
        try {
            if (this.A01.A00.A0E(6408)) {
                A01(this.A05.A00(this.A08.A02("com.facebook.stella"), Voip.getCallInfo()));
            }
        } catch (SecurityException e) {
            Log.e("StellaEventDispatcher/cannot create event for untrusted package", e);
        }
    }

    private void A01(C596234q r5) {
        if (r5 != null) {
            try {
                C64423Nx r3 = this.A02;
                JSONObject A1B = C36441kJ.A1B();
                A1B.put("action", r5.A00);
                A1B.putOpt("payload", r5.A01);
                C64423Nx.A00(r3, A1B.toString(), true);
            } catch (JSONException unused) {
                Log.e("StellaEventDispatcher/failed to create event");
            }
        }
    }

    public void A06(int i) {
        String str;
        String str2;
        C596234q r0;
        try {
            C128946Ef A022 = this.A08.A02("com.facebook.stella");
            C46372Wq r1 = this.A04;
            CallInfo callInfo = Voip.getCallInfo();
            switch (i) {
                case 1:
                case 2:
                case 14:
                case 18:
                    str = "user_ended_call";
                    break;
                case 3:
                case 5:
                case 6:
                case 11:
                case 13:
                case 15:
                case 16:
                case 17:
                case 20:
                case 21:
                case 22:
                case 23:
                    str = "call_failed";
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 25:
                case 27:
                    str = "not_accepted";
                    break;
                case 12:
                    str = "rejected";
                    break;
                case 24:
                    str = "missing_voip_permissions";
                    break;
                default:
                    str = "other";
                    break;
            }
            if (callInfo == null) {
                str2 = null;
            } else {
                str2 = r1.A00.A04(A022, callInfo.callId);
            }
            try {
                JSONObject A1B = C36441kJ.A1B();
                A1B.put("call_ended_reason", str);
                A1B.put("call_id", str2);
                r0 = new C596234q("call_ended", A1B);
            } catch (JSONException unused) {
                r0 = null;
            }
            A01(r0);
        } catch (SecurityException e) {
            Log.e("StellaEventDispatcher/cannot create event for untrusted package", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r8 = r10.A1J;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AnonymousClass3T1 r10) {
        /*
            r9 = this;
            X.0zA r0 = r9.A00
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0052
            X.3Qa r8 = r10.A1J
            boolean r7 = r8.A02
            if (r7 != 0) goto L_0x0052
            X.1VH r1 = r9.A08     // Catch:{ SecurityException -> 0x004d }
            java.lang.String r0 = "com.facebook.stella"
            X.6Ef r6 = r1.A02(r0)     // Catch:{ SecurityException -> 0x004d }
            X.2Wr r5 = r9.A07     // Catch:{ SecurityException -> 0x004d }
            boolean r0 = r10 instanceof X.AnonymousClass2bO     // Catch:{ SecurityException -> 0x004d }
            r4 = 0
            if (r0 == 0) goto L_0x0040
            org.json.JSONObject r3 = X.C36441kJ.A1B()     // Catch:{ SecurityException -> 0x004d }
            r0 = r10
            X.2bO r0 = (X.AnonymousClass2bO) r0     // Catch:{ SecurityException -> 0x004d }
            java.lang.String r2 = r0.A01     // Catch:{ SecurityException -> 0x004d }
            X.C18740tg.A06(r2)     // Catch:{ SecurityException -> 0x004d }
            X.11F r0 = r8.A00     // Catch:{ SecurityException -> 0x004d }
            X.3Qa r1 = new X.3Qa     // Catch:{ SecurityException -> 0x004d }
            r1.<init>(r0, r2, r7)     // Catch:{ SecurityException -> 0x004d }
            X.3G1 r0 = r5.A00     // Catch:{ SecurityException -> 0x004d }
            java.lang.String r1 = r0.A01(r1, r6)     // Catch:{ SecurityException -> 0x004d }
            java.lang.String r0 = "message_id"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x0040 }
            java.lang.String r0 = "message_revoked"
            X.34q r4 = new X.34q     // Catch:{ SecurityException -> 0x004d }
            r4.<init>(r0, r3)     // Catch:{ SecurityException -> 0x004d }
        L_0x0040:
            r9.A01(r4)     // Catch:{ SecurityException -> 0x004d }
            X.2Wt r0 = r9.A06     // Catch:{ SecurityException -> 0x004d }
            X.34q r0 = r0.A03(r10, r6)     // Catch:{ SecurityException -> 0x004d }
            r9.A01(r0)     // Catch:{ SecurityException -> 0x004d }
            return
        L_0x004d:
            java.lang.String r0 = "StellaEventDispatcher/cannot create event for untrusted package"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46352Wo.A07(X.3T1):void");
    }

    public void A03() {
        A00();
    }

    public void A05() {
        A00();
    }

    public void A08(CallState callState, CallInfo callInfo) {
        if (!AnonymousClass5B3.A00(callState).equals(AnonymousClass5B3.A00(callInfo.callState))) {
            try {
                A01(this.A05.A00(this.A08.A02("com.facebook.stella"), callInfo));
            } catch (SecurityException e) {
                Log.e("StellaEventDispatcher/cannot create event for untrusted package", e);
            }
        }
    }
}
