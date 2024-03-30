package com.whatsapp.bonsai.sync.discovery;

import X.C1277169j;
import X.C129396Gt;
import X.C143416qV;
import X.C159267j5;
import X.C36441kJ;
import X.C90464aC;
import org.json.JSONObject;

public final class DiscoveryBotsSerializer implements C159267j5 {
    public static final DiscoveryBotsSerializer A00 = new DiscoveryBotsSerializer();

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003a  */
    /* renamed from: A01 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.bonsai.sync.discovery.DiscoveryBots B7i(org.json.JSONObject r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0004
            r4 = 0
        L_0x0003:
            return r4
        L_0x0004:
            java.lang.String r0 = "default_bot"
            org.json.JSONObject r2 = r6.optJSONObject(r0)
            if (r2 == 0) goto L_0x0040
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = "jid"
            java.lang.String r0 = r2.optString(r0)
            com.whatsapp.jid.UserJid r1 = r1.A02(r0)
            java.lang.String r0 = "persona_id"
            java.lang.String r0 = r2.optString(r0)
            if (r1 == 0) goto L_0x0040
            X.69j r3 = new X.69j
            r3.<init>(r1, r0)
        L_0x0025:
            X.6qV r1 = X.C143416qV.A00
            java.lang.String r0 = "sections"
            org.json.JSONArray r0 = r6.optJSONArray(r0)
            java.util.List r2 = X.C129396Gt.A00(r1, r0)
            java.lang.String r0 = "timestamp_ms"
            long r0 = r6.optLong(r0)
            r4 = 0
            if (r3 == 0) goto L_0x0003
            com.whatsapp.bonsai.sync.discovery.DiscoveryBots r4 = new com.whatsapp.bonsai.sync.discovery.DiscoveryBots
            r4.<init>(r3, r2, r0)
            return r4
        L_0x0040:
            r3 = 0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bonsai.sync.discovery.DiscoveryBotsSerializer.B7i(org.json.JSONObject):com.whatsapp.bonsai.sync.discovery.DiscoveryBots");
    }

    public /* bridge */ /* synthetic */ JSONObject Bvo(Object obj) {
        return A00((DiscoveryBots) obj);
    }

    public static JSONObject A00(DiscoveryBots discoveryBots) {
        JSONObject A0q = C90464aC.A0q(discoveryBots);
        C1277169j r4 = discoveryBots.A01;
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("jid", r4.A00.getRawString());
        A1B.put("persona_id", r4.A01);
        A0q.put("default_bot", A1B);
        A0q.put("sections", C129396Gt.A01(C143416qV.A00, discoveryBots.A02));
        A0q.put("timestamp_ms", discoveryBots.A00);
        return A0q;
    }
}
