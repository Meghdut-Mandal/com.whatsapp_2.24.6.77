package X;

import java.nio.charset.Charset;
import org.json.JSONObject;

/* renamed from: X.5KV  reason: invalid class name */
public class AnonymousClass5KV extends C1024450a {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5KV(X.C20050ww r21, X.C19420v0 r22, X.C18820ts r23, X.C20810yC r24, X.AnonymousClass1WF r25, X.C20020wt r26, X.AnonymousClass005 r27, java.lang.String r28, java.lang.String r29, X.AnonymousClass004 r30, X.AnonymousClass004 r31, long r32) {
        /*
            r20 = this;
            r7 = r22
            java.lang.String r0 = r7.A0f()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.intValue()
            java.nio.charset.Charset r0 = X.AnonymousClass1M4.A06
            android.util.SparseArray r0 = X.AnonymousClass1M5.A02
            java.lang.Object r6 = r0.get(r1)
            if (r6 == 0) goto L_0x005c
            org.json.JSONObject r5 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x0056 }
            java.lang.String r4 = "params"
            org.json.JSONObject r3 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x0056 }
            java.lang.String r2 = "server_params"
            org.json.JSONObject r1 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x0056 }
            java.lang.String r0 = "country_iso_graphql"
            org.json.JSONObject r0 = r1.put(r0, r6)     // Catch:{ JSONException -> 0x0056 }
            org.json.JSONObject r0 = r3.put(r2, r0)     // Catch:{ JSONException -> 0x0056 }
            org.json.JSONObject r0 = r5.put(r4, r0)     // Catch:{ JSONException -> 0x0056 }
            java.lang.String r15 = r0.toString()     // Catch:{ JSONException -> 0x0056 }
            r5 = r20
            r6 = r21
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r14 = r29
            r16 = r30
            r17 = r31
            r18 = r32
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0056:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)
            throw r0
        L_0x005c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5KV.<init>(X.0ww, X.0v0, X.0ts, X.0yC, X.1WF, X.0wt, X.005, java.lang.String, java.lang.String, X.004, X.004, long):void");
    }

    public void A09(JSONObject jSONObject) {
        super.A09(jSONObject);
        int intValue = Integer.valueOf(this.A02.A0f()).intValue();
        Charset charset = AnonymousClass1M4.A06;
        jSONObject.put("country_iso_graphql", AnonymousClass1M5.A02.get(intValue));
    }
}
