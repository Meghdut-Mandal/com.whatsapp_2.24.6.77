package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3TQ  reason: invalid class name */
public class AnonymousClass3TQ {
    public SharedPreferences A00;
    public final AnonymousClass1NL A01 = new C90404a6(this, 1);
    public final AnonymousClass1WG A02;
    public final C19970wo A03;
    public final C20810yC A04;
    public final AnonymousClass17V A05;
    public final AnonymousClass1A1 A06;
    public final C19930wk A07;
    public final C21010yW A08;
    public final C19890wg A09;

    public static SharedPreferences A00(AnonymousClass3TQ r2) {
        SharedPreferences sharedPreferences = r2.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences A002 = r2.A09.A00("conversationSketch");
        r2.A00 = A002;
        return A002;
    }

    public static void A03(AnonymousClass3TQ r16, boolean z) {
        SharedPreferences.Editor remove;
        AnonymousClass3TQ r6 = r16;
        long A0B = C36341k9.A0B(A00(r6), "logs_last_sent");
        long currentTimeMillis = System.currentTimeMillis();
        if (z || currentTimeMillis > 259200000 + A0B) {
            C43952Ko A022 = A02(r6);
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it = A022.A00.iterator();
            while (it.hasNext()) {
                String A0C = AnonymousClass001.A0C(it);
                C43962Kp A012 = A01(r6, A0C);
                C43972Kq r3 = A012.A00;
                if (r3 != null && r3.A00 + 86400000 < currentTimeMillis) {
                    A012.A01.add(r3);
                    A012.A00 = null;
                }
                A012.A01.size();
                for (C43972Kq r9 : A012.A01) {
                    ArrayList A0I2 = AnonymousClass001.A0I();
                    JSONArray jSONArray = new JSONArray();
                    for (AnonymousClass3BY r14 : r9.A04) {
                        String obj = jSONArray.toString();
                        jSONArray.put(r14.A03());
                        if (jSONArray.toString().length() > 1000) {
                            A0I2.add(obj);
                            jSONArray = new JSONArray();
                            jSONArray.put(r14.A03());
                        }
                    }
                    if (jSONArray.toString().length() > 0) {
                        A0I2.add(jSONArray.toString());
                    }
                    Iterator it2 = A0I2.iterator();
                    while (it2.hasNext()) {
                        String A0C2 = AnonymousClass001.A0C(it2);
                        AnonymousClass2Q7 r32 = new AnonymousClass2Q7();
                        r32.A01 = r9.A03;
                        r32.A03 = r9.A02;
                        r32.A00 = r9.A01;
                        r32.A02 = A0C2;
                        r6.A08.Blw(r32);
                    }
                }
                A012.A01 = AnonymousClass001.A0I();
                C43972Kq r0 = A012.A00;
                if (r0 == null || r0.A04.isEmpty()) {
                    remove = A00(r6).edit().remove(A0C);
                } else {
                    A0I.add(A0C);
                    remove = A00(r6).edit().putString(A0C, C36331k8.A0h(A012.A03()));
                }
                remove.apply();
            }
            if (A0I.size() != A022.A00.size()) {
                A022.A00 = A0I;
                C36341k9.A0x(A00(r6).edit(), "merchant_jid_list", C36331k8.A0h(A022.A03()));
            }
            C36341k9.A0w(A00(r6).edit(), "logs_last_sent", currentTimeMillis);
        }
    }

    public AnonymousClass3TQ(AnonymousClass1WG r3, C19970wo r4, C20810yC r5, C21010yW r6, AnonymousClass17V r7, C19890wg r8, AnonymousClass1A1 r9, C19770wU r10) {
        this.A03 = r4;
        this.A04 = r5;
        this.A08 = r6;
        this.A06 = r9;
        this.A05 = r7;
        this.A02 = r3;
        this.A07 = C36411kG.A0r(r10);
        this.A09 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (r1.A05(r0) != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C43962Kp A01(X.AnonymousClass3TQ r6, java.lang.String r7) {
        /*
            android.content.SharedPreferences r1 = A00(r6)
            java.lang.String r0 = "{}"
            java.lang.String r0 = r1.getString(r7, r0)
            X.2Kp r5 = new X.2Kp
            r5.<init>()
            org.json.JSONObject r2 = X.C36441kJ.A1C(r0)     // Catch:{ JSONException -> 0x0066 }
            java.lang.String r0 = "current_conversation"
            org.json.JSONObject r0 = r2.optJSONObject(r0)     // Catch:{ JSONException -> 0x0066 }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0066 }
            X.2Kq r1 = new X.2Kq     // Catch:{ JSONException -> 0x0066 }
            r1.<init>()     // Catch:{ JSONException -> 0x0066 }
            boolean r0 = r1.A05(r0)     // Catch:{ JSONException -> 0x0066 }
            if (r0 == 0) goto L_0x0039
        L_0x002a:
            r5.A00 = r1     // Catch:{ JSONException -> 0x0066 }
            java.lang.String r0 = "completed_conversations"
            org.json.JSONArray r4 = r2.optJSONArray(r0)     // Catch:{ JSONException -> 0x0066 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ JSONException -> 0x0066 }
            r5.A01 = r0     // Catch:{ JSONException -> 0x0066 }
            goto L_0x003b
        L_0x0039:
            r1 = 0
            goto L_0x002a
        L_0x003b:
            r3 = 0
            if (r4 == 0) goto L_0x0081
        L_0x003e:
            int r0 = r4.length()     // Catch:{ JSONException -> 0x0066 }
            if (r3 >= r0) goto L_0x0081
            java.lang.Object r2 = r4.get(r3)     // Catch:{ JSONException -> 0x0066 }
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x0066 }
            X.2Kq r1 = new X.2Kq     // Catch:{ JSONException -> 0x0066 }
            r1.<init>()     // Catch:{ JSONException -> 0x0066 }
            boolean r0 = r1.A05(r0)     // Catch:{ JSONException -> 0x0066 }
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x0066 }
            r1.A05(r0)     // Catch:{ JSONException -> 0x0066 }
            java.util.List r0 = r5.A01     // Catch:{ JSONException -> 0x0066 }
            r0.add(r1)     // Catch:{ JSONException -> 0x0066 }
        L_0x0063:
            int r3 = r3 + 1
            goto L_0x003e
        L_0x0066:
            r1 = move-exception
            java.lang.String r0 = "ConversationSketchConversationMerchantList: fromJsonString threw: "
            com.whatsapp.util.Log.w(r0, r1)
            X.17V r0 = r6.A05
            java.lang.String r2 = r0.A03(r7)
            X.0wo r0 = r6.A03
            long r0 = X.C19970wo.A00(r0)
            if (r2 != 0) goto L_0x007c
            java.lang.String r2 = "defaultThreadID"
        L_0x007c:
            X.2Kp r5 = new X.2Kp
            r5.<init>(r0, r7, r2)
        L_0x0081:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TQ.A01(X.3TQ, java.lang.String):X.2Kp");
    }

    public static C43952Ko A02(AnonymousClass3TQ r4) {
        String string = A00(r4).getString("merchant_jid_list", "{}");
        C43952Ko r42 = new C43952Ko();
        try {
            r42.A00 = AnonymousClass001.A0I();
            JSONArray optJSONArray = C36441kJ.A1C(string).optJSONArray("merchant_list");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    r42.A00.add(optJSONArray.get(i));
                }
            }
        } catch (JSONException e) {
            Log.w("ConversationSketchMerchantJIDKeyList: fromJsonString threw: ", e);
        }
        JSONObject A032 = r42.A03();
        if (A032 != null) {
            A032.toString();
        }
        return r42;
    }
}
