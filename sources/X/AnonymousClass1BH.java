package X;

/* renamed from: X.1BH  reason: invalid class name */
public final class AnonymousClass1BH {
    public final AnonymousClass005 A00;

    public AnonymousClass1BH(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass68B r7) {
        /*
            r6 = this;
            r1 = 0
            X.005 r0 = r6.A00
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r5 = r0.A04()
            java.lang.String r4 = "pack_id = ?"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r7.A0F     // Catch:{ all -> 0x0023 }
            r3[r1] = r0     // Catch:{ all -> 0x0023 }
            X.14e r2 = r5.A02     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = "unseen_sticker_packs"
            java.lang.String r0 = "markPackAsSeen/DELETE_UNSEEN_STICKER_PACK"
            r2.A03(r1, r4, r0, r3)     // Catch:{ all -> 0x0023 }
            r5.close()
            return
        L_0x0023:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1BH.A01(X.68B):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            X.005 r0 = r6.A00
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r5 = r0.A04()
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0028 }
            r4.<init>()     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = "pack_id"
            r4.put(r0, r7)     // Catch:{ all -> 0x0028 }
            X.14e r3 = r5.A02     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "unseen_sticker_packs"
            r1 = 5
            java.lang.String r0 = "markPackAsUnseen/INSERT_UNSEEN_STICKER_PACK"
            r3.A08(r2, r0, r4, r1)     // Catch:{ all -> 0x0028 }
            r5.close()
            return
        L_0x0028:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1BH.A02(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedHashSet A00() {
        /*
            r6 = this;
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            X.005 r0 = r6.A00
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r4 = r0.get()
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "SELECT pack_id FROM unseen_sticker_packs"
            java.lang.String r1 = "getUnseenStickerPackIds/QUERY_UNSEEN_STICKER_PACK"
            r0 = 0
            android.database.Cursor r2 = r3.A09(r2, r1, r0)     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = "pack_id"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003a }
        L_0x0022:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = r2.getString(r1)     // Catch:{ all -> 0x003a }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ all -> 0x003a }
            r5.add(r0)     // Catch:{ all -> 0x003a }
            goto L_0x0022
        L_0x0033:
            r2.close()     // Catch:{ all -> 0x0041 }
            r4.close()
            return r5
        L_0x003a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0041 }
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1BH.A00():java.util.LinkedHashSet");
    }
}
