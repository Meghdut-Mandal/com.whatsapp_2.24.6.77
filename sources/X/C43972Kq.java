package X;

import java.util.List;

/* renamed from: X.2Kq  reason: invalid class name and case insensitive filesystem */
public class C43972Kq extends AnonymousClass3BY {
    public long A00;
    public Long A01;
    public String A02;
    public String A03;
    public List A04;

    public void A04(C44022Kv r5) {
        if (this.A04.size() < 500) {
            this.A04.add(r5);
        } else {
            this.A01 = Long.valueOf(this.A01.longValue() + 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005b, code lost:
        r1 = new X.C43982Kr();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0064, code lost:
        if (r1.A04(r4) == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        if (r1.equals("template_hsm_reply") != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0078, code lost:
        r1 = new X.C44002Kt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0081, code lost:
        if (r1.A04(r4) == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a9, code lost:
        if (r1.A04(r4) != false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r8.A04.add(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r7 = "undefined"
            r6 = 0
            org.json.JSONObject r5 = X.C36441kJ.A1C(r9)     // Catch:{ JSONException -> 0x00c6 }
            java.lang.String r0 = "start_ts"
            r1 = -1
            long r3 = r5.optLong(r0, r1)     // Catch:{ JSONException -> 0x00c6 }
            r8.A00 = r3     // Catch:{ JSONException -> 0x00c6 }
            java.lang.String r0 = "conversation_id"
            java.lang.String r0 = r5.optString(r0, r7)     // Catch:{ JSONException -> 0x00c6 }
            r8.A02 = r0     // Catch:{ JSONException -> 0x00c6 }
            java.lang.String r0 = "business_jid"
            java.lang.String r0 = r5.optString(r0, r7)     // Catch:{ JSONException -> 0x00c6 }
            r8.A03 = r0     // Catch:{ JSONException -> 0x00c6 }
            java.lang.String r0 = "msgs_skipped_count"
            long r0 = r5.optLong(r0, r1)     // Catch:{ JSONException -> 0x00c6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ JSONException -> 0x00c6 }
            r8.A01 = r0     // Catch:{ JSONException -> 0x00c6 }
            java.lang.String r0 = "msg_events"
            org.json.JSONArray r3 = r5.optJSONArray(r0)     // Catch:{ JSONException -> 0x00c6 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ JSONException -> 0x00c6 }
            r8.A04 = r0     // Catch:{ JSONException -> 0x00c6 }
            r2 = 0
            if (r3 == 0) goto L_0x00c4
        L_0x003c:
            int r0 = r3.length()     // Catch:{ JSONException -> 0x00c6 }
            if (r2 >= r0) goto L_0x00c4
            java.lang.Object r4 = r3.get(r2)     // Catch:{ JSONException -> 0x00c6 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x00c6 }
            org.json.JSONObject r5 = X.C36441kJ.A1C(r4)     // Catch:{ JSONException -> 0x00b1 }
            java.lang.String r1 = "message_type"
            java.lang.String r0 = "unknown"
            java.lang.String r1 = r5.optString(r1, r0)     // Catch:{ JSONException -> 0x00b1 }
            int r0 = r1.hashCode()     // Catch:{ JSONException -> 0x00b1 }
            switch(r0) {
                case -975649923: goto L_0x0067;
                case -537401432: goto L_0x0070;
                case 3556653: goto L_0x0084;
                case 1844104930: goto L_0x0098;
                default: goto L_0x005b;
            }     // Catch:{ JSONException -> 0x00b1 }
        L_0x005b:
            X.2Kr r1 = new X.2Kr     // Catch:{ JSONException -> 0x00b1 }
            r1.<init>()     // Catch:{ JSONException -> 0x00b1 }
            boolean r0 = r1.A04(r4)     // Catch:{ JSONException -> 0x00b1 }
            if (r0 == 0) goto L_0x00b7
            goto L_0x00ab
        L_0x0067:
            java.lang.String r0 = "template_hsm"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x00b1 }
            if (r0 == 0) goto L_0x005b
            goto L_0x0078
        L_0x0070:
            java.lang.String r0 = "template_hsm_reply"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x00b1 }
            if (r0 == 0) goto L_0x005b
        L_0x0078:
            X.2Kt r1 = new X.2Kt     // Catch:{ JSONException -> 0x00b1 }
            r1.<init>()     // Catch:{ JSONException -> 0x00b1 }
            boolean r0 = r1.A04(r4)     // Catch:{ JSONException -> 0x00b1 }
            if (r0 == 0) goto L_0x00b7
            goto L_0x00ab
        L_0x0084:
            java.lang.String r0 = "text"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x00b1 }
            if (r0 == 0) goto L_0x005b
            X.2Ks r1 = new X.2Ks     // Catch:{ JSONException -> 0x00b1 }
            r1.<init>()     // Catch:{ JSONException -> 0x00b1 }
            boolean r0 = r1.A04(r4)     // Catch:{ JSONException -> 0x00b1 }
            if (r0 == 0) goto L_0x00b7
            goto L_0x00ab
        L_0x0098:
            java.lang.String r0 = "interactive"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x00b1 }
            if (r0 == 0) goto L_0x005b
            X.2Ku r1 = new X.2Ku     // Catch:{ JSONException -> 0x00b1 }
            r1.<init>()     // Catch:{ JSONException -> 0x00b1 }
            boolean r0 = r1.A04(r4)     // Catch:{ JSONException -> 0x00b1 }
            if (r0 == 0) goto L_0x00b7
        L_0x00ab:
            java.util.List r0 = r8.A04     // Catch:{ JSONException -> 0x00c6 }
            r0.add(r1)     // Catch:{ JSONException -> 0x00c6 }
            goto L_0x00c0
        L_0x00b1:
            r1 = move-exception
            java.lang.String r0 = "ConversationSketchEvent: getEventFromJsonString threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ JSONException -> 0x00c6 }
        L_0x00b7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ JSONException -> 0x00c6 }
            java.lang.String r0 = "ConversationSketchConversation: unable to read conversation: "
            X.C36321k7.A1P(r0, r4, r1)     // Catch:{ JSONException -> 0x00c6 }
        L_0x00c0:
            int r2 = r2 + 1
            goto L_0x003c
        L_0x00c4:
            r0 = 1
            return r0
        L_0x00c6:
            r1 = move-exception
            java.lang.String r0 = "ConversationSketchConversation: fromJsonString threw: "
            com.whatsapp.util.Log.w(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43972Kq.A05(java.lang.String):boolean");
    }

    public C43972Kq(long j, String str, String str2) {
        this.A00 = j;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = C36411kG.A0t();
        this.A04 = AnonymousClass001.A0I();
    }

    public C43972Kq() {
        this.A00 = 0;
        this.A03 = "undefined";
        this.A02 = "undefined";
        this.A01 = -1L;
        this.A04 = AnonymousClass001.A0I();
    }
}
