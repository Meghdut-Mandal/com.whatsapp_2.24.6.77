package X;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.67k  reason: invalid class name and case insensitive filesystem */
public class C1272167k {
    public final C19700wN A00;
    public final AnonymousClass6S4 A01;
    public final AnonymousClass3DH A02;
    public final C19770wU A03;
    public final ReadWriteLock A04 = new ReentrantReadWriteLock();
    public final C19970wo A05;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0213, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0028 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0230 A[Catch:{ all -> 0x0243, all -> 0x0248, all -> 0x024d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A00() {
        /*
            r18 = this;
            r4 = r18
            X.3DH r0 = r4.A02
            java.io.File r1 = r0.A00()
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0268
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()     // Catch:{ Exception -> 0x0256 }
            java.util.concurrent.locks.ReadWriteLock r6 = r4.A04     // Catch:{ Exception -> 0x0256 }
            java.util.concurrent.locks.Lock r0 = r6.readLock()     // Catch:{ Exception -> 0x0256 }
            r0.lock()     // Catch:{ Exception -> 0x0256 }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x024d }
            r0.<init>(r1)     // Catch:{ all -> 0x024d }
            android.util.JsonReader r5 = new android.util.JsonReader     // Catch:{ all -> 0x024d }
            r5.<init>(r0)     // Catch:{ all -> 0x024d }
            r5.beginArray()     // Catch:{ all -> 0x0243 }
        L_0x0028:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0243 }
            if (r0 == 0) goto L_0x0235
            java.util.HashMap r10 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x0243 }
            r5.beginObject()     // Catch:{ all -> 0x0243 }
        L_0x0035:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0243 }
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = r5.nextName()     // Catch:{ all -> 0x0243 }
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0243 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0243 }
            goto L_0x0035
        L_0x0047:
            r5.endObject()     // Catch:{ all -> 0x0243 }
            X.6S4 r9 = r4.A01     // Catch:{ all -> 0x0243 }
            java.lang.String r2 = "type"
            java.lang.String r7 = X.C90504aG.A0l(r2, r10)     // Catch:{ all -> 0x0243 }
            boolean r0 = X.AnonymousClass14B.A0F(r7)     // Catch:{ all -> 0x0243 }
            if (r0 != 0) goto L_0x01b1
            X.133 r1 = r9.A01     // Catch:{ all -> 0x0243 }
            X.0wN r0 = r9.A00     // Catch:{ all -> 0x0243 }
            java.lang.String r8 = X.AnonymousClass6RZ.A00(r0, r1, r7)     // Catch:{ all -> 0x0243 }
            java.lang.String r7 = "TEXT_QUERY"
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0243 }
            if (r7 != 0) goto L_0x01b1
            java.lang.String r7 = "BUSINESS_PROFILE"
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0243 }
            if (r7 == 0) goto L_0x010b
            java.util.Iterator r11 = X.C36371kC.A10(r10)     // Catch:{ all -> 0x0243 }
            java.lang.String r15 = ""
            r16 = r15
            r17 = r15
            r13 = 1
            r8 = 0
        L_0x007d:
            boolean r9 = r11.hasNext()     // Catch:{ all -> 0x0243 }
            r7 = 3
            if (r9 == 0) goto L_0x00fe
            java.util.Map$Entry r10 = X.AnonymousClass000.A11(r11)     // Catch:{ all -> 0x0243 }
            java.lang.Object r7 = r10.getValue()     // Catch:{ all -> 0x0243 }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ all -> 0x0243 }
            boolean r7 = X.AnonymousClass14B.A0F(r7)     // Catch:{ all -> 0x0243 }
            if (r7 != 0) goto L_0x007d
            java.lang.String r9 = X.C90494aF.A0f(r10)     // Catch:{ all -> 0x0243 }
            int r7 = r9.hashCode()     // Catch:{ all -> 0x0243 }
            switch(r7) {
                case 105221: goto L_0x00eb;
                case 3575610: goto L_0x00e4;
                case 55126294: goto L_0x00c9;
                case 629885866: goto L_0x00b6;
                case 1296516636: goto L_0x00a5;
                default: goto L_0x009f;
            }     // Catch:{ all -> 0x0243 }
        L_0x009f:
            java.lang.String r7 = "DirectoryRecentSearchJsonIOManager/mapBusinessItemSelection Illegal field type for item. This field won't be mapped to the item."
            com.whatsapp.util.Log.i((java.lang.String) r7)     // Catch:{ all -> 0x0243 }
            goto L_0x007d
        L_0x00a5:
            java.lang.String r7 = "categories"
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x0243 }
            if (r7 == 0) goto L_0x009f
            java.lang.String r7 = X.C90514aH.A10(r10)     // Catch:{ all -> 0x0243 }
            java.lang.String r16 = X.AnonymousClass6RZ.A00(r0, r1, r7)     // Catch:{ all -> 0x0243 }
            goto L_0x007d
        L_0x00b6:
            java.lang.String r7 = "business_name"
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x0243 }
            if (r7 == 0) goto L_0x009f
            int r8 = r8 + 1
            java.lang.String r7 = X.C90514aH.A10(r10)     // Catch:{ all -> 0x0243 }
            java.lang.String r15 = X.AnonymousClass6RZ.A00(r0, r1, r7)     // Catch:{ all -> 0x0243 }
            goto L_0x007d
        L_0x00c9:
            java.lang.String r7 = "timestamp"
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x0243 }
            if (r7 == 0) goto L_0x009f
            int r8 = r8 + 1
            java.lang.Object r7 = r10.getValue()     // Catch:{ all -> 0x0243 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0243 }
            java.lang.String r7 = X.AnonymousClass6RZ.A00(r0, r1, r7)     // Catch:{ all -> 0x0243 }
            long r13 = java.lang.Long.parseLong(r7)     // Catch:{ all -> 0x0243 }
            goto L_0x007d
        L_0x00e4:
            boolean r7 = r9.equals(r2)     // Catch:{ all -> 0x0243 }
            if (r7 != 0) goto L_0x007d
            goto L_0x009f
        L_0x00eb:
            java.lang.String r7 = "jid"
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x0243 }
            if (r7 == 0) goto L_0x009f
            int r8 = r8 + 1
            java.lang.String r7 = X.C90514aH.A10(r10)     // Catch:{ all -> 0x0243 }
            java.lang.String r17 = X.AnonymousClass6RZ.A00(r0, r1, r7)     // Catch:{ all -> 0x0243 }
            goto L_0x007d
        L_0x00fe:
            if (r8 != r7) goto L_0x0107
            X.6cB r12 = new X.6cB     // Catch:{ all -> 0x0243 }
            r12.<init>(r13, r15, r16, r17)     // Catch:{ all -> 0x0243 }
            goto L_0x022e
        L_0x0107:
            java.lang.String r0 = "DirectoryRecentSearchJsonIOManager/mapBusinessItemSelection Could not map all the necessary fields. Item won't be shown to the user"
            goto L_0x022a
        L_0x010b:
            java.lang.String r7 = "CATEGORY_SEARCH"
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0243 }
            if (r7 == 0) goto L_0x0228
            java.util.Iterator r11 = X.C36371kC.A10(r10)     // Catch:{ all -> 0x0243 }
            r12 = 0
            java.lang.String r15 = ""
            r17 = r12
            r16 = r15
            r13 = 1
            r8 = 0
        L_0x0121:
            boolean r9 = r11.hasNext()     // Catch:{ all -> 0x0243 }
            r7 = 3
            if (r9 == 0) goto L_0x01a2
            java.util.Map$Entry r10 = X.AnonymousClass000.A11(r11)     // Catch:{ all -> 0x0243 }
            java.lang.Object r7 = r10.getValue()     // Catch:{ all -> 0x0243 }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ all -> 0x0243 }
            boolean r7 = X.AnonymousClass14B.A0F(r7)     // Catch:{ all -> 0x0243 }
            if (r7 != 0) goto L_0x0121
            java.lang.String r9 = X.C90494aF.A0f(r10)     // Catch:{ all -> 0x0243 }
            int r7 = r9.hashCode()     // Catch:{ all -> 0x0243 }
            switch(r7) {
                case -664075021: goto L_0x0191;
                case 3575610: goto L_0x018a;
                case 55126294: goto L_0x016f;
                case 338683180: goto L_0x015c;
                case 1537780732: goto L_0x0149;
                default: goto L_0x0143;
            }     // Catch:{ all -> 0x0243 }
        L_0x0143:
            java.lang.String r7 = "DirectoryRecentSearchJsonIOManager/mapCategoryItemSelection Illegal field type for item. This field won't be mapped to the item."
            com.whatsapp.util.Log.i((java.lang.String) r7)     // Catch:{ all -> 0x0243 }
            goto L_0x0121
        L_0x0149:
            java.lang.String r7 = "category_id"
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x0243 }
            if (r7 == 0) goto L_0x0143
            java.lang.String r7 = X.C90514aH.A10(r10)     // Catch:{ all -> 0x0243 }
            java.lang.String r16 = X.AnonymousClass6RZ.A00(r0, r1, r7)     // Catch:{ all -> 0x0243 }
            int r8 = r8 + 1
            goto L_0x0121
        L_0x015c:
            java.lang.String r7 = "category_name"
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x0243 }
            if (r7 == 0) goto L_0x0143
            java.lang.String r7 = X.C90514aH.A10(r10)     // Catch:{ all -> 0x0243 }
            java.lang.String r15 = X.AnonymousClass6RZ.A00(r0, r1, r7)     // Catch:{ all -> 0x0243 }
            int r8 = r8 + 1
            goto L_0x0121
        L_0x016f:
            java.lang.String r7 = "timestamp"
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x0243 }
            if (r7 == 0) goto L_0x0143
            java.lang.Object r7 = r10.getValue()     // Catch:{ all -> 0x0243 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0243 }
            java.lang.String r7 = X.AnonymousClass6RZ.A00(r0, r1, r7)     // Catch:{ all -> 0x0243 }
            long r13 = java.lang.Long.parseLong(r7)     // Catch:{ all -> 0x0243 }
            int r8 = r8 + 1
            goto L_0x0121
        L_0x018a:
            boolean r7 = r9.equals(r2)     // Catch:{ all -> 0x0243 }
            if (r7 != 0) goto L_0x0121
            goto L_0x0143
        L_0x0191:
            java.lang.String r7 = "parent_category"
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x0243 }
            if (r7 == 0) goto L_0x0143
            java.lang.String r7 = X.C90514aH.A10(r10)     // Catch:{ all -> 0x0243 }
            java.lang.String r17 = X.AnonymousClass6RZ.A00(r0, r1, r7)     // Catch:{ all -> 0x0243 }
            goto L_0x0121
        L_0x01a2:
            if (r8 != r7) goto L_0x01ab
            X.6cC r12 = new X.6cC     // Catch:{ all -> 0x0243 }
            r12.<init>(r13, r15, r16, r17)     // Catch:{ all -> 0x0243 }
            goto L_0x022e
        L_0x01ab:
            java.lang.String r0 = "DirectoryRecentSearchJsonIOManager/mapSearchQuery Could not map all the necessary fields. Item won't be shown to the user"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0243 }
            goto L_0x022e
        L_0x01b1:
            java.util.Iterator r13 = X.C36371kC.A10(r10)     // Catch:{ all -> 0x0243 }
            java.lang.String r8 = ""
            r0 = 1
            r10 = 0
        L_0x01ba:
            boolean r11 = r13.hasNext()     // Catch:{ all -> 0x0243 }
            r7 = 2
            if (r11 == 0) goto L_0x021d
            java.util.Map$Entry r12 = X.AnonymousClass000.A11(r13)     // Catch:{ all -> 0x0243 }
            java.lang.Object r7 = r12.getValue()     // Catch:{ all -> 0x0243 }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ all -> 0x0243 }
            boolean r7 = X.AnonymousClass14B.A0F(r7)     // Catch:{ all -> 0x0243 }
            if (r7 != 0) goto L_0x01ba
            java.lang.String r11 = X.C90494aF.A0f(r12)     // Catch:{ all -> 0x0243 }
            int r7 = r11.hashCode()     // Catch:{ all -> 0x0243 }
            switch(r7) {
                case 3575610: goto L_0x0216;
                case 55126294: goto L_0x01f7;
                case 107944136: goto L_0x01e2;
                default: goto L_0x01dc;
            }     // Catch:{ all -> 0x0243 }
        L_0x01dc:
            java.lang.String r7 = "DirectoryRecentSearchJsonIOManager/mapSearchQuery Illegal field type for item. This field won't be mapped to the item."
            com.whatsapp.util.Log.i((java.lang.String) r7)     // Catch:{ all -> 0x0243 }
            goto L_0x01ba
        L_0x01e2:
            java.lang.String r7 = "query"
            boolean r7 = r11.equals(r7)     // Catch:{ all -> 0x0243 }
            if (r7 == 0) goto L_0x01dc
            java.lang.String r11 = X.C90514aH.A10(r12)     // Catch:{ all -> 0x0243 }
            X.133 r8 = r9.A01     // Catch:{ all -> 0x0243 }
            X.0wN r7 = r9.A00     // Catch:{ all -> 0x0243 }
            java.lang.String r8 = X.AnonymousClass6RZ.A00(r7, r8, r11)     // Catch:{ all -> 0x0243 }
            goto L_0x0213
        L_0x01f7:
            java.lang.String r7 = "timestamp"
            boolean r7 = r11.equals(r7)     // Catch:{ all -> 0x0243 }
            if (r7 == 0) goto L_0x01dc
            java.lang.Object r0 = r12.getValue()     // Catch:{ all -> 0x0243 }
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0243 }
            X.133 r1 = r9.A01     // Catch:{ all -> 0x0243 }
            X.0wN r0 = r9.A00     // Catch:{ all -> 0x0243 }
            java.lang.String r0 = X.AnonymousClass6RZ.A00(r0, r1, r7)     // Catch:{ all -> 0x0243 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x0243 }
        L_0x0213:
            int r10 = r10 + 1
            goto L_0x01ba
        L_0x0216:
            boolean r7 = r11.equals(r2)     // Catch:{ all -> 0x0243 }
            if (r7 != 0) goto L_0x01ba
            goto L_0x01dc
        L_0x021d:
            if (r10 != r7) goto L_0x0225
            X.6cA r12 = new X.6cA     // Catch:{ all -> 0x0243 }
            r12.<init>(r8, r0)     // Catch:{ all -> 0x0243 }
            goto L_0x022e
        L_0x0225:
            java.lang.String r0 = "DirectoryRecentSearchJsonIOManager/mapSearchQuery Could not map all the necessary fields. Item won't be shown to the user"
            goto L_0x022a
        L_0x0228:
            java.lang.String r0 = "DirectoryRecentSearchJsonIOManager/map Could not map one of the items to DirectoryRecentSearch. Unknwon type"
        L_0x022a:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0243 }
            r12 = 0
        L_0x022e:
            if (r12 == 0) goto L_0x0028
            r3.add(r12)     // Catch:{ all -> 0x0243 }
            goto L_0x0028
        L_0x0235:
            r5.endArray()     // Catch:{ all -> 0x0243 }
            r5.close()     // Catch:{ all -> 0x024d }
            java.util.concurrent.locks.Lock r0 = r6.readLock()     // Catch:{ Exception -> 0x0256 }
            r0.unlock()     // Catch:{ Exception -> 0x0256 }
            goto L_0x0269
        L_0x0243:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0248 }
            goto L_0x024c
        L_0x0248:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x024d }
        L_0x024c:
            throw r1     // Catch:{ all -> 0x024d }
        L_0x024d:
            r1 = move-exception
            java.util.concurrent.locks.Lock r0 = r6.readLock()     // Catch:{ Exception -> 0x0256 }
            r0.unlock()     // Catch:{ Exception -> 0x0256 }
            throw r1     // Catch:{ Exception -> 0x0256 }
        L_0x0256:
            r1 = move-exception
            java.lang.String r0 = "DirectoryRecentSearchManagerImpl/getRecentSearchList: Failed to load recent search history"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0wN r3 = r4.A00
            java.lang.String r2 = r1.toString()
            r1 = 0
            java.lang.String r0 = "getRecentSearchList/getRecentSearchList: Failed to load recent search history"
            r3.A0E(r0, r2, r1)
        L_0x0268:
            r3 = 0
        L_0x0269:
            if (r3 != 0) goto L_0x026f
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
        L_0x026f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1272167k.A00():java.util.ArrayList");
    }

    public C1272167k(C19700wN r2, AnonymousClass6S4 r3, C19970wo r4, AnonymousClass3DH r5, C19770wU r6) {
        this.A05 = r4;
        this.A03 = r6;
        this.A00 = r2;
        this.A02 = r5;
        this.A01 = r3;
    }
}
