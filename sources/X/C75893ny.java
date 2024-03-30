package X;

/* renamed from: X.3ny  reason: invalid class name and case insensitive filesystem */
public final class C75893ny implements AnonymousClass4TN {
    public final AnonymousClass1ZO A00;
    public final AnonymousClass4TN A01;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bmz(java.lang.String r11, java.util.List r12) {
        /*
            r10 = this;
            r6 = 0
            X.1ZO r4 = r10.A00
            X.1ZS r0 = r4.A03
            java.lang.String r9 = r0.A00()
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ all -> 0x00d4 }
            r5.<init>()     // Catch:{ all -> 0x00d4 }
            java.util.Iterator r8 = r12.iterator()     // Catch:{ all -> 0x00d4 }
        L_0x0012:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x009c
            java.lang.Object r3 = r8.next()     // Catch:{ all -> 0x00d4 }
            X.2La r3 = (X.C44072La) r3     // Catch:{ all -> 0x00d4 }
            org.json.JSONObject r2 = X.C36441kJ.A1B()     // Catch:{ all -> 0x00d4 }
            long r0 = r3.A0Q     // Catch:{ all -> 0x00d4 }
            java.lang.String r7 = "creation"
            r2.put(r7, r0)     // Catch:{ all -> 0x00d4 }
            java.lang.String r1 = r3.A0H     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = "desc"
            r2.put(r0, r1)     // Catch:{ all -> 0x00d4 }
            long r0 = r3.A03     // Catch:{ all -> 0x00d4 }
            java.lang.String r7 = "desc_id"
            r2.put(r7, r0)     // Catch:{ all -> 0x00d4 }
            long r0 = r3.A07     // Catch:{ all -> 0x00d4 }
            java.lang.String r7 = "subscribers"
            r2.put(r7, r0)     // Catch:{ all -> 0x00d4 }
            java.lang.String r1 = r3.A0J     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = "invite_code"
            r2.put(r0, r1)     // Catch:{ all -> 0x00d4 }
            X.11F r0 = r3.A06()     // Catch:{ all -> 0x00d4 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = "jid"
            r2.put(r0, r1)     // Catch:{ all -> 0x00d4 }
            X.2pL r0 = r3.A09     // Catch:{ all -> 0x00d4 }
            int r1 = r0.value     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = "membership"
            r2.put(r0, r1)     // Catch:{ all -> 0x00d4 }
            java.lang.String r1 = r3.A0K     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = "name"
            r2.put(r0, r1)     // Catch:{ all -> 0x00d4 }
            long r0 = r3.A04     // Catch:{ all -> 0x00d4 }
            java.lang.String r7 = "name_id"
            r2.put(r7, r0)     // Catch:{ all -> 0x00d4 }
            long r0 = r3.A05     // Catch:{ all -> 0x00d4 }
            java.lang.String r7 = "pic_id"
            r2.put(r7, r0)     // Catch:{ all -> 0x00d4 }
            java.lang.String r1 = r3.A0L     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = "pic_preview"
            r2.put(r0, r1)     // Catch:{ all -> 0x00d4 }
            long r0 = r3.A06     // Catch:{ all -> 0x00d4 }
            java.lang.String r7 = "pic_preview_id"
            r2.put(r7, r0)     // Catch:{ all -> 0x00d4 }
            java.lang.String r1 = r3.A0M     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = "pic"
            r2.put(r0, r1)     // Catch:{ all -> 0x00d4 }
            X.2p1 r0 = r3.A0F     // Catch:{ all -> 0x00d4 }
            int r1 = r0.value     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = "verified"
            r2.put(r0, r1)     // Catch:{ all -> 0x00d4 }
            X.2pA r0 = r3.A0C     // Catch:{ all -> 0x00d4 }
            int r1 = r0.value     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = "verification_source"
            r2.put(r0, r1)     // Catch:{ all -> 0x00d4 }
            r5.put(r2)     // Catch:{ all -> 0x00d4 }
            goto L_0x0012
        L_0x009c:
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00d4 }
            if (r3 == 0) goto L_0x00d4
            X.1ZQ r1 = r4.A04     // Catch:{ all -> 0x00cd }
            X.0wo r0 = r1.A00     // Catch:{ all -> 0x00cd }
            long r7 = r0.A04()     // Catch:{ all -> 0x00cd }
            X.1ZP r2 = r1.A01     // Catch:{ all -> 0x00cd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r9)     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "_timestamp"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00cd }
            r2.A02(r1, r0)     // Catch:{ all -> 0x00cd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r9)     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "_data"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x00cd }
            r2.A02(r0, r3)     // Catch:{ all -> 0x00cd }
            X.0AJ r1 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x00cd }
            goto L_0x00d5
        L_0x00cd:
            r0 = move-exception
            X.03N r1 = new X.03N
            r1.<init>(r0)
            goto L_0x00d5
        L_0x00d4:
            r1 = 0
        L_0x00d5:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r1)
            if (r1 == 0) goto L_0x00e0
            java.lang.String r0 = "RecommendedCache Failed to serialize"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00e0:
            X.4TN r1 = r10.A01
            java.util.List r0 = r4.A00(r12)
            r1.Bmz(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75893ny.Bmz(java.lang.String, java.util.List):void");
    }

    public void BWe(C21854Abe abe) {
        this.A01.BWe(abe);
    }

    public C75893ny(AnonymousClass1ZO r1, AnonymousClass4TN r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
