package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.jid.Jid;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.54G  reason: invalid class name */
public abstract class AnonymousClass54G extends AnonymousClass54I {
    public final C25791Hr A00;
    public final AnonymousClass185 A01;
    public final C21060yb A02;
    public final AnonymousClass1KW A03;
    public final C25851Hx A04;
    public final C28941Us A05;
    public final C122525uz A06;
    public final AnonymousClass1A1 A07;
    public final C19420v0 A08;
    public final C18820ts A09;
    public final C20810yC A0A;

    public String A05() {
        return "galaxy_message";
    }

    public void A0G(Activity activity, Jid jid, C206969uL r6, String str, String str2, long j) {
        super.A0G(activity, (Jid) null, r6, str, str2, j);
        if (Build.VERSION.SDK_INT == 26) {
            new C1259261w().A00(activity);
        }
        InputMethodManager A0N = this.A02.A0N();
        if (A0N != null && activity.getCurrentFocus() != null) {
            A0N.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    public String A06(Context context, C206969uL r5) {
        HashMap A012 = C131866Qy.A01(r5.A01);
        if (A012.containsKey("flow_cta")) {
            return C90514aH.A0o("flow_cta", A012).toString();
        }
        return "";
    }

    public void A0A(AnonymousClass3T1 r5, C206969uL r6, String str, JSONObject jSONObject) {
        jSONObject.put("flow_id", C131866Qy.A01(r6.A01).get("flow_id"));
        jSONObject.put("extensions_message_id", C132586Uj.A00.A02(this.A03, r5.A1J.A01, false));
        String A0b = C90464aC.A0b(str);
        AnonymousClass00C.A08(A0b);
        jSONObject.put("session_id", A0b);
    }

    public boolean A0B(C20810yC r5, AnonymousClass8SX r6) {
        String A002;
        if (!r5.A0E(1694) && (A002 = AnonymousClass6H1.A00(C131866Qy.A01(((AnonymousClass8P5) C203099nI.A00(r6).A0u().buttons_.get(0)).buttonParamsJson_))) != null) {
            Objects.requireNonNull("2.24.6.77");
            AnonymousClass6OD A003 = AnonymousClass6OD.A00("2.24.6.77");
            String A092 = r5.A09(2306);
            AnonymousClass6OD r2 = null;
            if (A092 != null) {
                try {
                    JSONObject optJSONObject = C36441kJ.A1C(A092).optJSONObject(A002);
                    if (optJSONObject != null) {
                        r2 = AnonymousClass6OD.A00(optJSONObject.optString("min_android_app_supported_version"));
                    }
                } catch (JSONException unused) {
                }
            }
            if (A003 == null || r2 == null || A003.A01(r2) < 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean A0C(C20810yC r2, AnonymousClass8SX r3) {
        return r2.A0E(2885);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00db, code lost:
        if (r11.A04(r1, r2).A00 != X.C108115Sf.SUCCESS) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01aa, code lost:
        if (r2.mediaCase_ != 8) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01bc, code lost:
        if (r11.A0A(r13, X.C36441kJ.A0B(r7, 4849) * 60000) != false) goto L_0x00dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x024a A[Catch:{ JSONException -> 0x0257 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0254 A[Catch:{ JSONException -> 0x0257 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0E(X.AnonymousClass8SX r23, X.C21337AHp r24) {
        /*
            r22 = this;
            r6 = r24
            X.11F r0 = r6.BGb()
            boolean r0 = X.AnonymousClass143.A0G(r0)
            if (r0 != 0) goto L_0x01fe
            X.11F r0 = r6.BGb()
            boolean r0 = r0 instanceof X.C177618e5
            if (r0 != 0) goto L_0x01fe
            X.11F r0 = r6.BGb()
        L_0x0018:
            com.whatsapp.jid.UserJid r13 = X.C36401kF.A0b(r0)
            r2 = 1
            if (r13 == 0) goto L_0x028b
            X.8SV r0 = X.C203099nI.A00(r23)
            X.8Q1 r0 = r0.A0u()
            r4 = 0
            X.B6c r0 = r0.buttons_
            java.lang.Object r0 = r0.get(r4)
            X.8P5 r0 = (X.AnonymousClass8P5) r0
            java.lang.String r0 = r0.buttonParamsJson_
            java.util.HashMap r1 = X.C131866Qy.A01(r0)
            java.lang.String r0 = "flow_message_version"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x028b
            r0 = r22
            X.54F r0 = (X.AnonymousClass54F) r0
            X.0yC r7 = r0.A06
            r1 = 3080(0xc08, float:4.316E-42)
            boolean r1 = r7.A0E(r1)
            r5 = 0
            if (r1 == 0) goto L_0x010c
            X.8SV r1 = X.C203099nI.A00(r23)
            X.8Q1 r1 = r1.A0u()
            X.B6c r1 = r1.buttons_
            java.lang.Object r1 = r1.get(r4)
            X.8P5 r1 = (X.AnonymousClass8P5) r1
            java.lang.String r1 = r1.buttonParamsJson_
            java.util.HashMap r8 = X.C131866Qy.A01(r1)
            java.lang.String r1 = "flow_id"
            java.lang.Object r1 = r8.get(r1)
            X.C90494aF.A10(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = X.AnonymousClass6H1.A00(r8)
            java.lang.String r2 = "mode"
            java.lang.Object r9 = r8.get(r2)
            java.lang.String r2 = "draft"
            boolean r12 = X.AnonymousClass00C.A0J(r9, r2)
            java.lang.String r2 = r6.A1C
            X.AnonymousClass00C.A08(r2)
            X.691 r9 = X.C110485ak.A00(r2, r1)
            if (r12 != 0) goto L_0x00a7
            r10 = 5764(0x1684, float:8.077E-42)
            boolean r10 = r7.A0E(r10)
            if (r10 == 0) goto L_0x01c3
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r15 = r0.A01
            X.040 r10 = r15.A0Q
            r20 = 0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines$fetchEntrypointScreen$1 r14 = new com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines$fetchEntrypointScreen$1
            r16 = r13
            r17 = r9
            r18 = r1
            r19 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20)
            X.C36331k8.A1T(r14, r10)
        L_0x00a7:
            if (r3 == 0) goto L_0x010c
            java.lang.String r2 = "flow_action"
            java.lang.Object r5 = r8.get(r2)
            boolean r2 = r5 instanceof java.lang.String
            if (r2 == 0) goto L_0x01c0
            java.lang.String r5 = (java.lang.String) r5
        L_0x00b5:
            boolean r5 = X.C133316Xv.A07(r3, r5)
            r2 = 7352(0x1cb8, float:1.0302E-41)
            boolean r3 = r7.A0E(r2)
            r2 = 4849(0x12f1, float:6.795E-42)
            r8 = 60000(0xea60, double:2.9644E-319)
            if (r3 == 0) goto L_0x01af
            if (r5 != 0) goto L_0x00ca
            r2 = 2891(0xb4b, float:4.051E-42)
        L_0x00ca:
            long r2 = X.C36441kJ.A0B(r7, r2)
            long r2 = r2 * r8
            if (r12 != 0) goto L_0x010c
            X.1Kg r11 = r0.A03
            X.6AE r2 = r11.A04(r1, r2)
            X.5Sf r3 = r2.A00
            X.5Sf r2 = X.C108115Sf.SUCCESS
            if (r3 == r2) goto L_0x010c
        L_0x00dd:
            X.3Qa r2 = r6.A0Q
            java.lang.String r7 = r2.A01
            X.AnonymousClass00C.A07(r7)
            X.1Kf r12 = r0.A05
            r15 = 0
            java.lang.String r2 = "message_receive_integrity_check"
            int r3 = r12.A0B(r13, r2)
            r14 = r7
            r16 = r1
            r17 = r3
            r12.A06(r13, r14, r15, r16, r17)
            java.lang.String r2 = "fetch_cache_hit"
            r12.A04(r3, r2, r4)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            X.6tn r12 = new X.6tn
            r12.<init>(r0, r3)
            r18 = 0
            r16 = r15
            r17 = r1
            r11.A07(r12, r13, r14, r15, r16, r17, r18)
        L_0x010c:
            X.185 r1 = r0.A01
            X.3L0 r1 = r1.A02(r13)
            int r11 = X.C110465ai.A00(r1)
            java.lang.String r8 = "galaxy_message"
            X.8SV r3 = X.C203099nI.A00(r23)
            X.AnonymousClass00C.A0D(r3, r4)
            int r1 = r3.bitField0_
            r7 = r1 & 1
            if (r7 == 0) goto L_0x015f
            X.8SN r1 = r3.header_
            r2 = r1
            if (r1 != 0) goto L_0x012c
            X.8SN r1 = X.AnonymousClass8SN.DEFAULT_INSTANCE
        L_0x012c:
            boolean r1 = r1.A0u()
            if (r1 == 0) goto L_0x015f
            if (r2 != 0) goto L_0x0136
            X.8SN r2 = X.AnonymousClass8SN.DEFAULT_INSTANCE
        L_0x0136:
            int r2 = r2.mediaCase_
            r1 = 3
            if (r2 != r1) goto L_0x015f
            r19 = 8
        L_0x013d:
            X.8SV r1 = X.C203099nI.A00(r23)
            X.8Q1 r1 = r1.A0u()
            X.B6c r1 = r1.buttons_
            java.lang.Object r1 = r1.get(r4)
            X.8P5 r1 = (X.AnonymousClass8P5) r1
            java.lang.String r10 = r1.buttonParamsJson_
            java.lang.String r2 = "flow_id"
            X.3Qa r1 = r6.A0Q
            java.lang.String r9 = r1.A01
            org.json.JSONObject r3 = X.C36441kJ.A1B()
            java.util.HashMap r7 = X.AnonymousClass001.A0J()
            goto L_0x0204
        L_0x015f:
            if (r7 == 0) goto L_0x01ac
            X.8SN r1 = r3.header_
            r2 = r1
            if (r1 != 0) goto L_0x0168
            X.8SN r1 = X.AnonymousClass8SN.DEFAULT_INSTANCE
        L_0x0168:
            boolean r1 = r1.A0u()
            if (r1 == 0) goto L_0x017a
            if (r2 != 0) goto L_0x0172
            X.8SN r2 = X.AnonymousClass8SN.DEFAULT_INSTANCE
        L_0x0172:
            int r2 = r2.mediaCase_
            r1 = 4
            if (r2 != r1) goto L_0x017a
            r19 = 2
            goto L_0x013d
        L_0x017a:
            X.8SN r1 = r3.header_
            r2 = r1
            if (r1 != 0) goto L_0x0181
            X.8SN r1 = X.AnonymousClass8SN.DEFAULT_INSTANCE
        L_0x0181:
            boolean r1 = r1.A0u()
            if (r1 == 0) goto L_0x0193
            if (r2 != 0) goto L_0x018b
            X.8SN r2 = X.AnonymousClass8SN.DEFAULT_INSTANCE
        L_0x018b:
            int r2 = r2.mediaCase_
            r1 = 7
            if (r2 != r1) goto L_0x0193
            r19 = 3
            goto L_0x013d
        L_0x0193:
            X.8SN r1 = r3.header_
            r2 = r1
            if (r1 != 0) goto L_0x019a
            X.8SN r1 = X.AnonymousClass8SN.DEFAULT_INSTANCE
        L_0x019a:
            boolean r1 = r1.A0u()
            if (r1 == 0) goto L_0x01ac
            if (r2 != 0) goto L_0x01a4
            X.8SN r2 = X.AnonymousClass8SN.DEFAULT_INSTANCE
        L_0x01a4:
            int r2 = r2.mediaCase_
            r1 = 8
            r19 = 6
            if (r2 == r1) goto L_0x013d
        L_0x01ac:
            r19 = 1
            goto L_0x013d
        L_0x01af:
            if (r5 == 0) goto L_0x010c
            X.1Kg r11 = r0.A03
            long r2 = X.C36441kJ.A0B(r7, r2)
            long r2 = r2 * r8
            boolean r2 = r11.A0A(r13, r2)
            if (r2 == 0) goto L_0x010c
            goto L_0x00dd
        L_0x01c0:
            r5 = 0
            goto L_0x00b5
        L_0x01c3:
            X.6Xv r10 = r0.A00
            X.1K9 r11 = r10.A02
            X.9oR r11 = r11.A00(r9)
            r10.A01 = r11
            if (r1 == 0) goto L_0x00a7
            X.1Kp r14 = r10.A0K
            int r11 = r1.hashCode()
            X.5TS r15 = X.AnonymousClass5TS.PREFETCH_MESSAGE
            java.lang.String r9 = r9.A00
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r4)
            r16 = r13
            r18 = r1
            r19 = r2
            r20 = r9
            r21 = r11
            r14.A0C(r15, r16, r17, r18, r19, r20, r21)
            X.1Kk r2 = r10.A0G
            X.3ty r11 = r2.A00(r1, r11)
            X.70G r9 = new X.70G
            r9.<init>(r10, r1)
            X.17Y r2 = r10.A03
            java.util.concurrent.Executor r2 = r2.A04
            r11.A0B(r9, r2)
            goto L_0x00a7
        L_0x01fe:
            X.11F r0 = r6.BFC()
            goto L_0x0018
        L_0x0204:
            java.lang.String r1 = "cta"
            r3.put(r1, r8)     // Catch:{ JSONException -> 0x0227 }
            java.util.HashMap r7 = X.C131866Qy.A01(r10)     // Catch:{ JSONException -> 0x0227 }
            java.lang.Object r1 = r7.get(r2)     // Catch:{ JSONException -> 0x0227 }
            r3.put(r2, r1)     // Catch:{ JSONException -> 0x0227 }
            java.lang.String r8 = "extensions_message_id"
            X.6Uj r2 = X.C132586Uj.A00     // Catch:{ JSONException -> 0x0227 }
            X.1KW r1 = r0.A03     // Catch:{ JSONException -> 0x0227 }
            java.lang.String r1 = r2.A02(r1, r9, r4)     // Catch:{ JSONException -> 0x0227 }
            r3.put(r8, r1)     // Catch:{ JSONException -> 0x0227 }
            java.lang.String r1 = "is_flow_message_with_payload"
            r3.put(r1, r5)     // Catch:{ JSONException -> 0x0227 }
            goto L_0x022d
        L_0x0227:
            r2 = move-exception
            java.lang.String r1 = "ExtensionsLogger/ExtensionsAction/sendMessageReceiveWamEvent()  exception in parsing json"
            com.whatsapp.util.Log.w(r1, r2)
        L_0x022d:
            boolean r5 = r23.A10()
            java.lang.String r2 = r6.A0q
            java.lang.String r1 = "is_template"
            r3.put(r1, r5)     // Catch:{ JSONException -> 0x023e }
            java.lang.String r1 = "hsm_tag"
            r3.put(r1, r2)     // Catch:{ JSONException -> 0x023e }
            goto L_0x0242
        L_0x023e:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
        L_0x0242:
            java.lang.String r1 = "mode"
            java.lang.String r1 = X.C90504aG.A0l(r1, r7)     // Catch:{ JSONException -> 0x0257 }
            if (r1 == 0) goto L_0x0254
            java.lang.String r2 = r1.toUpperCase()     // Catch:{ JSONException -> 0x0257 }
        L_0x024e:
            java.lang.String r1 = "extension_status"
            r3.put(r1, r2)     // Catch:{ JSONException -> 0x0257 }
            goto L_0x025b
        L_0x0254:
            java.lang.String r2 = "PUBLISHED"
            goto L_0x024e
        L_0x0257:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
        L_0x025b:
            X.1Hx r1 = r0.A04
            X.1IO r1 = r1.A01
            X.9Xu r1 = r1.A01(r13)
            r2 = 0
            if (r1 == 0) goto L_0x0289
            java.lang.String r2 = r1.A06
            java.lang.String r1 = r1.A05
        L_0x026a:
            X.5uz r12 = r0.A06
            java.lang.String r16 = r3.toString()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            X.1Us r0 = r0.A05
            java.lang.Integer r15 = r0.A00(r13)
            X.0wU r0 = r12.A03
            X.74s r11 = new X.74s
            r17 = r2
            r18 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r0.Boy(r11)
            return r4
        L_0x0289:
            r1 = r2
            goto L_0x026a
        L_0x028b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54G.A0E(X.8SX, X.AHp):boolean");
    }

    public void A0H(Activity activity, Intent intent, Jid jid, String str, Map map, long j) {
        String rawString;
        if (activity instanceof AnonymousClass4V7) {
            rawString = C90494aF.A0a((C88834Uf) activity);
        } else if (jid != null) {
            rawString = jid.getRawString();
            C18740tg.A06(C36401kF.A0b(jid));
        } else {
            return;
        }
        intent.putExtra("chat_id", rawString);
        intent.putExtra("message_id", str);
        intent.putExtra("action_name", "galaxy_message");
        intent.putExtra("message_row_id", j);
        intent.putExtra("user_locale", this.A09.A07());
        intent.putExtra("flow_id", (String) C90514aH.A0p("flow_id", map));
        intent.putExtra("flow_token", C36431kI.A1A("flow_token", map));
        intent.putExtra("flow_message_version", C36431kI.A1A("flow_message_version", map));
    }

    public AnonymousClass54G(C25791Hr r1, C1255460h r2, AnonymousClass185 r3, C21060yb r4, AnonymousClass1KW r5, C19420v0 r6, C18820ts r7, C25851Hx r8, C28941Us r9, C20810yC r10, C122525uz r11, AnonymousClass1A1 r12) {
        super(r2);
        this.A09 = r7;
        this.A0A = r10;
        this.A08 = r6;
        this.A02 = r4;
        this.A01 = r3;
        this.A06 = r11;
        this.A04 = r8;
        this.A05 = r9;
        this.A00 = r1;
        this.A07 = r12;
        this.A03 = r5;
    }
}
