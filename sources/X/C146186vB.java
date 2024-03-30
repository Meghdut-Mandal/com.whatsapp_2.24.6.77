package X;

/* renamed from: X.6vB  reason: invalid class name and case insensitive filesystem */
public final class C146186vB implements AnonymousClass1XI {
    public final C120135r1 A00;
    public final AnonymousClass005 A01;

    public C146186vB(C120135r1 r2, AnonymousClass005 r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.util.Collection B7G(java.lang.String r8, int r9, boolean r10, boolean r11) {
        /*
            r7 = this;
            r2 = 0
            X.AnonymousClass00C.A0D(r8, r2)
            java.util.LinkedHashSet r6 = X.C36441kJ.A17()
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.lang.String[] r3 = X.C36441kJ.A1S()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r8)
            r0 = 37
            java.lang.String r0 = X.AnonymousClass000.A0t(r1, r0)
            r3[r2] = r0
            r0 = 1
            X.C36431kI.A1O(r3, r9, r0)
            java.lang.String r2 = "SELECT DISTINCT sticker_id FROM avatar_sticker_search_dictionary WHERE tag LIKE ? ORDER BY weight DESC LIMIT ?"
            X.005 r0 = r7.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f }
            X.1M0 r5 = X.C90484aE.A0W(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f }
            X.14e r1 = r5.A02     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = "DISTINCT_INSTRUCTION_FROM_AVATAR_SEARCH_TAG"
            android.database.Cursor r3 = r1.A09(r2, r0, r3)     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = "sticker_id"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0051 }
        L_0x0036:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x004a
            java.lang.String r1 = X.C90494aF.A0Z(r3, r2)     // Catch:{ all -> 0x0051 }
            boolean r0 = r6.add(r1)     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0036
            r4.add(r1)     // Catch:{ all -> 0x0051 }
            goto L_0x0036
        L_0x004a:
            r3.close()     // Catch:{ all -> 0x0058 }
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f }
            goto L_0x0063
        L_0x0051:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f }
        L_0x005f:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0063:
            java.util.ArrayList r3 = X.C36321k7.A0J(r4)
            java.util.Iterator r2 = r4.iterator()
        L_0x006b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)
            X.690 r0 = new X.690
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x006b
        L_0x007e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146186vB.B7G(java.lang.String, int, boolean, boolean):java.util.Collection");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B2o() {
        /*
            r5 = this;
            X.005 r0 = r5.A01
            X.1M0 r4 = X.C90494aF.A0K(r0)
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0017 }
            X.AnonymousClass00C.A08(r3)     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = "avatar_sticker_search_dictionary"
            r1 = 0
            java.lang.String r0 = "AvatarStickerSearchDictionaryTable/clearAll/CLEAR_ALL"
            r3.A03(r2, r1, r0, r1)     // Catch:{ all -> 0x0017 }
            r4.close()
            return
        L_0x0017:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146186vB.B2o():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0030, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0033, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCount() {
        /*
            r5 = this;
            X.005 r0 = r5.A01
            X.1M0 r4 = X.C90484aE.A0W(r0)
            X.14e r3 = r4.A02     // Catch:{ all -> 0x002d }
            java.lang.String r2 = "SELECT EXISTS(SELECT 1 FROM avatar_sticker_search_dictionary) AS has_records"
            java.lang.String r1 = "GET_COUNT_AVATAR_STICKER_SEARCH_TAGS"
            r0 = 0
            android.database.Cursor r2 = r3.A09(r2, r1, r0)     // Catch:{ all -> 0x002d }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "has_records"
            int r0 = X.C36351kA.A03(r2, r0)     // Catch:{ all -> 0x0026 }
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            r2.close()     // Catch:{ all -> 0x002d }
            r4.close()
            return r0
        L_0x0026:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x002d }
            throw r0     // Catch:{ all -> 0x002d }
        L_0x002d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146186vB.getCount():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0075, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.util.Collection B7H(java.lang.String[] r9, int r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            java.util.LinkedHashSet r6 = X.C36441kJ.A17()
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            r1 = 975(0x3cf, float:1.366E-42)
            X.72Z r0 = new X.72Z
            r0.<init>(r9, r1)
            java.util.Iterator r7 = r0.iterator()
        L_0x0013:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r3 = r7.next()
            java.lang.String[] r3 = (java.lang.String[]) r3
            int r0 = r3.length
            java.lang.String r2 = X.AnonymousClass1M2.A00(r0)
            X.AnonymousClass00C.A08(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SELECT DISTINCT sticker_id FROM avatar_sticker_search_dictionary WHERE tag IN "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " ORDER BY weight DESC"
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r1)
            X.005 r0 = r8.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x0076 }
            X.1M0 r5 = X.C90484aE.A0W(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0076 }
            X.14e r1 = r5.A02     // Catch:{ all -> 0x006f }
            java.lang.String r0 = "DISTINCT_INSTRUCTION_FROM_MULTIPLE_AVATAR_SEARCH_TAGS"
            android.database.Cursor r3 = r1.A09(r2, r0, r3)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = "sticker_id"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0068 }
        L_0x004d:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0061
            java.lang.String r1 = X.C90494aF.A0Z(r3, r2)     // Catch:{ all -> 0x0068 }
            boolean r0 = r6.add(r1)     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x004d
            r4.add(r1)     // Catch:{ all -> 0x0068 }
            goto L_0x004d
        L_0x0061:
            r3.close()     // Catch:{ all -> 0x006f }
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0076 }
            goto L_0x0013
        L_0x0068:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006a }
        L_0x006a:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x006f }
            throw r0     // Catch:{ all -> 0x006f }
        L_0x006f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0076 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x007a:
            java.util.ArrayList r3 = X.C36321k7.A0J(r4)
            java.util.Iterator r2 = r4.iterator()
        L_0x0082:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)
            X.690 r0 = new X.690
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0082
        L_0x0095:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146186vB.B7H(java.lang.String[], int, boolean, boolean):java.util.Collection");
    }

    public void Br6(boolean z) {
    }
}
