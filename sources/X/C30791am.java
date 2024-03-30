package X;

import android.os.ConditionVariable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1am  reason: invalid class name and case insensitive filesystem */
public final class C30791am {
    public Map A00;
    public final C30811ao A01;
    public final C20310xM A02;
    public final AnonymousClass1KV A03;
    public final C21010yW A04;
    public final AnonymousClass1EU A05;
    public final AnonymousClass1A1 A06;
    public final C19770wU A07;
    public final Map A08;
    public final AnonymousClass185 A09;
    public final C30801an A0A;
    public final Set A0B;
    public final Set A0C;

    public C30791am(AnonymousClass185 r2, C30811ao r3, C20310xM r4, AnonymousClass1KV r5, C21010yW r6, C30801an r7, AnonymousClass1EU r8, AnonymousClass1A1 r9, C19770wU r10, Map map, Map map2, Set set, Set set2) {
        AnonymousClass00C.A0D(r10, 1);
        AnonymousClass00C.A0D(r6, 2);
        AnonymousClass00C.A0D(r8, 3);
        AnonymousClass00C.A0D(r4, 4);
        AnonymousClass00C.A0D(r9, 5);
        AnonymousClass00C.A0D(set, 6);
        AnonymousClass00C.A0D(set2, 7);
        AnonymousClass00C.A0D(map, 8);
        AnonymousClass00C.A0D(r2, 9);
        AnonymousClass00C.A0D(map2, 10);
        AnonymousClass00C.A0D(r7, 11);
        AnonymousClass00C.A0D(r3, 12);
        AnonymousClass00C.A0D(r5, 13);
        this.A07 = r10;
        this.A04 = r6;
        this.A05 = r8;
        this.A02 = r4;
        this.A06 = r9;
        this.A0B = set;
        this.A0C = set2;
        this.A08 = map;
        this.A09 = r2;
        this.A00 = map2;
        this.A0A = r7;
        this.A01 = r3;
        this.A03 = r5;
        ConditionVariable conditionVariable = C18740tg.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x016e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0172, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0175, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0176, code lost:
        X.C05600Qi.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0179, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.app.Activity r23, X.AnonymousClass3T1 r24, X.C206969uL r25, int r26) {
        /*
            r22 = this;
            r0 = 0
            r2 = r23
            X.AnonymousClass00C.A0D(r2, r0)
            r0 = 2
            r6 = r24
            X.AnonymousClass00C.A0D(r6, r0)
            r1 = r25
            X.C18740tg.A06(r1)
            java.lang.String r5 = r1.A00
            X.AnonymousClass00C.A07(r5)
            r13 = r22
            X.1ao r0 = r13.A01
            java.lang.String r3 = r1.A01
            X.9Yd r14 = r0.A00(r5, r3)
            if (r14 != 0) goto L_0x0037
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "NativeFlowActionUtils/handleRequest -- can not recognize NFM action: "
        L_0x0029:
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
        L_0x0033:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0036:
            return
        L_0x0037:
            java.util.Set r0 = r13.A0B
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0068
            X.3Qa r0 = r6.A1J
            X.11F r10 = r0.A00
            java.lang.String r9 = r0.A01
            X.AnonymousClass00C.A07(r9)
            long r3 = r6.A1N
            r7 = 0
            r8 = 0
            X.6BP r0 = new X.6BP
            r0.<init>(r7, r7, r8)
            X.6Cu r8 = new X.6Cu
            r16 = r0
            r17 = r10
            r18 = r6
            r19 = r9
            r20 = r3
            r15 = r8
            r15.<init>(r16, r17, r18, r19, r20)
            boolean r0 = r14 instanceof X.AnonymousClass54I
            if (r0 != 0) goto L_0x00cb
            java.lang.String r0 = "NativeFlowActionUtils/processCommerceNativeFlow. Base class for commerce action should be CommerceNativeFlowAction."
            goto L_0x0033
        L_0x0068:
            java.util.Set r0 = r13.A0C
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x00ac
            if (r3 == 0) goto L_0x0036
            java.util.Map r3 = r13.A08
            boolean r0 = r3.containsKey(r5)
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r5 = r3.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x00a6
            int r4 = r6.A1I
            int r3 = r6.A09
            boolean r0 = X.C66013Ui.A0q(r6)
            int r20 = X.AnonymousClass6UH.A01(r4, r3, r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r18 = r0.toString()
            X.AnonymousClass00C.A08(r18)
            X.3Qa r0 = r6.A1J
            X.11F r15 = r0.A00
            r19 = r5
            r17 = r1
            r16 = r6
            r13.A00(r14, r15, r16, r17, r18, r19, r20)
        L_0x00a6:
            r0 = r26
            r14.A08(r2, r6, r1, r0)
            return
        L_0x00ac:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r0 = "nfm_action"
            r3.putString(r0, r5)
            X.1EU r0 = r13.A05
            X.B66 r0 = r0.A05()
            java.lang.Class r7 = r0.BET(r3)
            if (r7 != 0) goto L_0x017a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "NativeFlowActionUtils/handleRequest/processPaymentNativeFlow -- NFM action support class not found: "
            goto L_0x0029
        L_0x00cb:
            X.6BP r12 = r8.A01
            X.1KV r10 = r13.A03
            java.lang.String r6 = r8.A04
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream
            r9.<init>()
            java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0173 }
            r4.<init>(r9)     // Catch:{ all -> 0x0173 }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ all -> 0x016c }
            r11.<init>()     // Catch:{ all -> 0x016c }
            int r0 = r12.A00     // Catch:{ all -> 0x016c }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x016c }
            java.lang.String r0 = "FLOW_ENTRY_POINT"
            r11.put(r0, r3)     // Catch:{ all -> 0x016c }
            java.lang.Integer r0 = r12.A01     // Catch:{ all -> 0x016c }
            if (r0 == 0) goto L_0x00fc
            int r0 = r0.intValue()     // Catch:{ all -> 0x016c }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x016c }
            java.lang.String r0 = "CLICK_SEQUENCE_NUMBER"
            r11.put(r0, r3)     // Catch:{ all -> 0x016c }
        L_0x00fc:
            r4.writeObject(r11)     // Catch:{ all -> 0x016c }
            r4.close()     // Catch:{ all -> 0x0173 }
            byte[] r4 = r9.toByteArray()     // Catch:{ all -> 0x0173 }
            r9.close()
            X.AnonymousClass00C.A08(r4)
            X.71z r0 = X.AnonymousClass1KV.A00(r10)
            if (r0 == 0) goto L_0x0138
            X.66k r3 = X.C1496071z.A00(r0, r6)
            if (r3 == 0) goto L_0x0138
            X.5Qz r0 = r3.A00()     // Catch:{ IOException -> 0x0123 }
            r0.write(r4)     // Catch:{ IOException -> 0x0123 }
            r3.A01()     // Catch:{ IOException -> 0x0123 }
            goto L_0x0138
        L_0x0123:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "FlowsLogger/FlowsEntrypointMetadataCache/writeToDisk: "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0138:
            X.3T1 r9 = r8.A03
            int r4 = r9.A1I
            int r3 = r9.A09
            boolean r0 = X.C66013Ui.A0q(r9)
            int r20 = X.AnonymousClass6UH.A01(r4, r3, r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r18 = r0.toString()
            X.AnonymousClass00C.A08(r18)
            X.11F r15 = r8.A02
            r19 = r5
            r17 = r1
            r16 = r9
            r13.A00(r14, r15, r16, r17, r18, r19, r20)
            X.54I r14 = (X.AnonymousClass54I) r14
            long r3 = r8.A00
            r8 = r14
            r9 = r2
            r10 = r7
            r11 = r1
            r12 = r6
            r13 = r18
            r14 = r3
            r8.A0G(r9, r10, r11, r12, r13, r14)
            return
        L_0x016c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x016e }
        L_0x016e:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x0173 }
            throw r0     // Catch:{ all -> 0x0173 }
        L_0x0173:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0175 }
        L_0x0175:
            r0 = move-exception
            X.C05600Qi.A00(r9, r1)
            throw r0
        L_0x017a:
            int r4 = r6.A1I
            int r3 = r6.A09
            boolean r0 = X.C66013Ui.A0q(r6)
            int r20 = X.AnonymousClass6UH.A01(r4, r3, r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r18 = r0.toString()
            X.AnonymousClass00C.A08(r18)
            X.3Qa r0 = r6.A1J
            X.11F r15 = r0.A00
            r19 = r5
            r17 = r1
            r16 = r6
            r13.A00(r14, r15, r16, r17, r18, r19, r20)
            r14.A09(r2, r6, r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30791am.A02(android.app.Activity, X.3T1, X.9uL, int):void");
    }

    public boolean A03(AnonymousClass2bZ r6, String str) {
        C207089uX r1;
        AnonymousClass00C.A0D(r6, 0);
        C207219uk r0 = r6.A00;
        if (r0 == null || (r1 = r0.A04) == null || r1.A03.size() != 1 || !str.equals(((C206569tc) r1.A03.get(0)).A01.A00)) {
            return false;
        }
        return true;
    }

    private final void A00(C196209Yd r12, AnonymousClass11F r13, AnonymousClass3T1 r14, C206969uL r15, String str, String str2, int i) {
        Integer num;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cta", str2);
            r12.A0A(r14, r15, str, jSONObject);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("NativeFlowActionUtils/sendWamEvent/");
            sb.append(e.getMessage());
            Log.w(sb.toString());
        }
        if (!(r12 instanceof AnonymousClass54F)) {
            C30801an r2 = this.A0A;
            String obj = jSONObject.toString();
            AnonymousClass11F r3 = r13;
            if (r13 instanceof UserJid) {
                num = Integer.valueOf(C110465ai.A00(this.A09.A02((UserJid) r3)));
            } else {
                num = null;
            }
            r2.A00(r3, num, obj, (String) null, 0, 4, i, true);
        }
    }

    public C196209Yd A01(AnonymousClass8SX r6) {
        String str;
        if ((r6.bitField1_ & 1) != 0) {
            C173308Re r0 = r6.buttonsMessage_;
            C173308Re r1 = r0;
            if (r0 == null) {
                r0 = C173308Re.DEFAULT_INSTANCE;
            }
            if (r0.buttons_ != null) {
                if (r1 == null) {
                    r1 = C173308Re.DEFAULT_INSTANCE;
                }
                for (C173078Qh r12 : r1.buttons_) {
                    if ((r12.bitField0_ & 8) != 0) {
                        C172718Ox r02 = r12.nativeFlowInfo_;
                        if (r02 == null) {
                            r02 = C172718Ox.DEFAULT_INSTANCE;
                        }
                        String str2 = r02.name_;
                        AnonymousClass00C.A08(str2);
                        C172718Ox r03 = r12.nativeFlowInfo_;
                        if (r03 == null) {
                            r03 = C172718Ox.DEFAULT_INSTANCE;
                        }
                        C196209Yd A002 = this.A01.A00(str2, r03.paramsJson_);
                        if (A002 != null) {
                            return A002;
                        }
                    }
                }
                return null;
            }
        }
        if (!C203099nI.A05(r6) || C203099nI.A00(r6).interactiveMessageCase_ != 6) {
            return null;
        }
        AnonymousClass8Q1 A0u = C203099nI.A00(r6).A0u();
        for (AnonymousClass8P5 r13 : A0u.buttons_) {
            if ((r13.bitField0_ & 1) != 0) {
                String str3 = r13.name_;
                AnonymousClass00C.A08(str3);
                C196209Yd A003 = this.A01.A00(str3, r13.buttonParamsJson_);
                if (A003 != null) {
                    return A003;
                }
            }
        }
        if ((A0u.bitField0_ & 1) == 0 || (str = A0u.messageParamsJson_) == null || str.length() == 0) {
            return null;
        }
        try {
            String optString = new JSONObject(str).optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            AnonymousClass00C.A0B(optString);
            AnonymousClass00C.A0D(optString, 0);
            C196209Yd A004 = this.A01.A00(optString, str);
            if (A004 != null) {
                return A004;
            }
            return null;
        } catch (JSONException unused) {
            Log.e("NativeFlowActionUtils/getNativeFlowAction. NFM message has invalid params json");
            return null;
        }
    }
}
