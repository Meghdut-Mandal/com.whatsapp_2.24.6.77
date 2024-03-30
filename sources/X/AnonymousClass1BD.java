package X;

/* renamed from: X.1BD  reason: invalid class name */
public final class AnonymousClass1BD {
    public final AnonymousClass005 A00;

    public AnonymousClass1BD(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
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
            java.lang.String r2 = "SELECT pack_id FROM new_sticker_packs"
            java.lang.String r1 = "getNewStickerPackIds/QUERY_NEW_STICKER_PACK"
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
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1BD.A00():java.util.LinkedHashSet");
    }
}
