package X;

import com.whatsapp.R;
import java.util.Set;

/* renamed from: X.3la  reason: invalid class name and case insensitive filesystem */
public final class C74423la implements AnonymousClass4U1 {
    public final AnonymousClass30Y A00;

    public C74423la(AnonymousClass30Y r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean BJq(C63503Kh r3) {
        return r3.A03.A1R(512);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BOL(X.C63503Kh r12) {
        /*
            r11 = this;
            X.3T1 r1 = r12.A03
            r0 = 512(0x200, float:7.175E-43)
            boolean r0 = r1.A1R(r0)
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "FMessageBotSuggestedPromptMetadataLazyLoader/loadData called for message which doesn't have look table flag 512 set"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x000f:
            return
        L_0x0010:
            X.3Kh r4 = r1.A1K
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = "FMessageBotSuggestedPromptMetadataLazyLoader/loadData already loaded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x001c:
            X.30Y r2 = r11.A00
            long r0 = r1.A1N
            X.12P r2 = r2.A00
            X.1M0 r2 = r2.get()
            X.14e r3 = r2.A02
            r5 = 1
            java.lang.String[] r2 = new java.lang.String[r5]
            X.C36341k9.A1W(r2, r0)
            java.lang.String r1 = "\n        SELECT prompts, impression_logged\n        FROM bot_message_prompts\n        WHERE message_row_id = ?\n        LIMIT 1\n      "
            java.lang.String r0 = "BotMessagePromptsStore/getPrompts"
            android.database.Cursor r2 = r3.A09(r1, r0, r2)
            boolean r1 = r2.moveToFirst()     // Catch:{ all -> 0x00cd }
            r0 = 0
            if (r1 == 0) goto L_0x00b2
            java.lang.String r0 = "prompts"
            java.lang.String r0 = X.C36341k9.A0f(r2, r0)     // Catch:{ all -> 0x00cd }
            if (r0 != 0) goto L_0x0050
            X.09w r3 = X.C023409w.A00     // Catch:{ all -> 0x00cd }
        L_0x0047:
            java.lang.String r0 = "impression_logged"
            int r0 = X.C36351kA.A03(r2, r0)     // Catch:{ all -> 0x00cd }
            if (r0 == r5) goto L_0x00aa
            goto L_0x00a9
        L_0x0050:
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ all -> 0x00cd }
            r9.<init>(r0)     // Catch:{ all -> 0x00cd }
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x00cd }
            int r7 = r9.length()     // Catch:{ all -> 0x00cd }
            r6 = 0
        L_0x005e:
            if (r6 >= r7) goto L_0x008b
            org.json.JSONObject r10 = r9.getJSONObject(r6)     // Catch:{ all -> 0x00cd }
            r1 = -1
            java.lang.String r0 = "index"
            int r3 = r10.optInt(r0, r1)     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = "prompt"
            java.lang.String r0 = ""
            java.lang.String r1 = r10.optString(r1, r0)     // Catch:{ all -> 0x00cd }
            if (r3 < 0) goto L_0x0088
            if (r1 == 0) goto L_0x0088
            int r0 = r1.length()     // Catch:{ all -> 0x00cd }
            if (r0 == 0) goto L_0x0088
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00cd }
            X.011 r0 = X.C36441kJ.A19(r0, r1)     // Catch:{ all -> 0x00cd }
            r8.add(r0)     // Catch:{ all -> 0x00cd }
        L_0x0088:
            int r6 = r6 + 1
            goto L_0x005e
        L_0x008b:
            java.util.List r0 = X.C89834Yb.A00(r8, r5)     // Catch:{ all -> 0x00cd }
            java.util.ArrayList r3 = X.C36321k7.A0J(r0)     // Catch:{ all -> 0x00cd }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00cd }
        L_0x0097:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00cd }
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00cd }
            X.011 r0 = (X.AnonymousClass011) r0     // Catch:{ all -> 0x00cd }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x00cd }
            r3.add(r0)     // Catch:{ all -> 0x00cd }
            goto L_0x0097
        L_0x00a9:
            r5 = 0
        L_0x00aa:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x00cd }
            X.011 r0 = X.C36441kJ.A19(r3, r0)     // Catch:{ all -> 0x00cd }
        L_0x00b2:
            r2.close()
            if (r0 == 0) goto L_0x000f
            java.lang.Object r3 = r0.first
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x000f
            r2 = 0
            java.lang.Object r0 = r0.second
            boolean r1 = X.AnonymousClass000.A1X(r0)
            X.3JL r0 = new X.3JL
            r0.<init>(r2, r3, r1)
            r4.A01(r0)
            return
        L_0x00cd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74423la.BOL(X.3Kh):void");
    }

    public Set BI3() {
        return C36411kG.A15(Integer.valueOf(R.id.lazy_field_bot_suggested_prompt_metadata));
    }
}
