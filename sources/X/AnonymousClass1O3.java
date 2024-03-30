package X;

/* renamed from: X.1O3  reason: invalid class name */
public class AnonymousClass1O3 {
    public static final String[] A0B = {"com.google", "com.microsoft.office.outlook.USER_ACCOUNT"};
    public static final String[] A0C = {"com.google.android.apps.tachyon"};
    public final AnonymousClass005 A00;
    public final AnonymousClass1O6 A01;
    public final AnonymousClass1O2 A02;
    public final AnonymousClass1O0 A03;
    public final AnonymousClass1O5 A04;
    public final AnonymousClass1O4 A05;
    public final C21060yb A06;
    public final C19630wG A07;
    public final C20830yE A08;
    public final C19420v0 A09;
    public final C20810yC A0A;

    private boolean A00() {
        if (!C20800yB.A01(C21000yV.A02, this.A0A, 5868) || this.A08.A02("android.permission.READ_CONTACTS") == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e7, code lost:
        if (android.text.TextUtils.equals(r6.A0V, r5.A04) == false) goto L_0x00e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(X.AnonymousClass9MT r4, X.C65583Sq r5, X.AnonymousClass141 r6, boolean r7) {
        /*
            long r0 = r5.A01
            java.lang.String r3 = r5.A05
            X.3IL r2 = new X.3IL
            r2.<init>(r0, r3)
            X.3IL r0 = r6.A0F
            r3 = 1
            if (r0 == 0) goto L_0x00ec
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00ec
            r2 = 0
        L_0x0015:
            java.lang.String r1 = r5.A03
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = r6.A0J()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x002a
            r6.A0P = r1
            r2 = 1
        L_0x002a:
            java.lang.String r1 = r5.A06
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = r6.A0W
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x003d
            r6.A0W = r1
            r2 = 1
        L_0x003d:
            if (r4 == 0) goto L_0x006d
            java.lang.String r0 = r4.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0056
            java.lang.String r1 = r6.A0R
            java.lang.String r0 = r4.A02
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0056
            java.lang.String r0 = r4.A02
            r6.A0R = r0
            r2 = 1
        L_0x0056:
            java.lang.String r0 = r4.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x006d
            java.lang.String r1 = r6.A0Q
            java.lang.String r0 = r4.A01
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = r4.A01
            r6.A0Q = r0
            r2 = 1
        L_0x006d:
            java.lang.Integer r0 = r6.A0L
            int r0 = r0.intValue()
            int r1 = r5.A00
            if (r0 == r1) goto L_0x00dd
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6.A0L = r0
            if (r1 == 0) goto L_0x00e9
            r0 = 0
        L_0x0080:
            r6.A0V = r0
            r2 = 1
        L_0x0083:
            if (r4 == 0) goto L_0x00ca
            java.lang.String r0 = r4.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x009c
            java.lang.String r1 = r6.A0U
            java.lang.String r0 = r4.A03
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = r4.A03
            r6.A0U = r0
            r2 = 1
        L_0x009c:
            java.lang.String r0 = r4.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00b3
            java.lang.String r1 = r6.A0O
            java.lang.String r0 = r4.A00
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = r4.A00
            r6.A0O = r0
            r2 = 1
        L_0x00b3:
            java.lang.String r0 = r4.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ca
            java.lang.String r1 = r6.A0Z
            java.lang.String r0 = r4.A04
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = r4.A04
            r6.A0Z = r0
            r2 = 1
        L_0x00ca:
            boolean r1 = r6.A0q
            boolean r0 = r5.A07
            if (r1 == r0) goto L_0x00d3
            r6.A0q = r0
            r2 = 1
        L_0x00d3:
            if (r7 == 0) goto L_0x00f1
            int r0 = r6.A07
            if (r0 == 0) goto L_0x00f1
            r0 = 0
            r6.A07 = r0
            return r3
        L_0x00dd:
            if (r0 != 0) goto L_0x0083
            java.lang.String r1 = r6.A0V
            java.lang.String r0 = r5.A04
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0083
        L_0x00e9:
            java.lang.String r0 = r5.A04
            goto L_0x0080
        L_0x00ec:
            r6.A0F = r2
            r2 = 1
            goto L_0x0015
        L_0x00f1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1O3.A01(X.9MT, X.3Sq, X.141, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03f0, code lost:
        if (r3 != null) goto L_0x04a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0435  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass9NY A02(java.lang.String r35, java.util.List r36, java.util.List r37) {
        /*
            r34 = this;
            r0 = r34
            X.0wG r8 = r0.A07
            X.0yb r11 = r0.A06
            X.0yE r2 = r0.A08
            X.0v0 r1 = r0.A09
            X.1O6 r3 = r0.A01
            android.content.SharedPreferences r6 = X.AnonymousClass1O6.A00(r3)
            java.lang.String r5 = "last_contact_full_sync"
            r3 = -1
            long r3 = r6.getLong(r5, r3)
            java.util.HashSet r3 = X.C63723Ld.A01(r11, r2, r1, r3)
            if (r3 != 0) goto L_0x0024
            r6 = 0
        L_0x001f:
            r23 = 0
            if (r6 != 0) goto L_0x00eb
            return r23
        L_0x0024:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.lang.String r6 = android.os.Build.MANUFACTURER
            java.lang.String r5 = "lge"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0043
            java.lang.String r5 = "phonebook/get_sim_card_phones/lge"
            com.whatsapp.util.Log.i((java.lang.String) r5)
            X.0ya r12 = r11.A0O()
            if (r12 != 0) goto L_0x007c
            java.lang.String r5 = "phonebook/get-sim-card-phones cr=null"
            com.whatsapp.util.Log.e((java.lang.String) r5)
        L_0x0043:
            r3.addAll(r4)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Iterator r8 = r3.iterator()
        L_0x004f:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x001f
            java.lang.Object r7 = r8.next()
            X.3Sq r7 = (X.C65583Sq) r7
            java.lang.String r5 = r7.A05
            java.lang.String r3 = r7.A03
            X.00I r4 = new X.00I
            r4.<init>(r5, r3)
            boolean r3 = r6.containsKey(r4)
            if (r3 != 0) goto L_0x0072
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6.put(r4, r3)
        L_0x0072:
            java.lang.Object r3 = r6.get(r4)
            java.util.List r3 = (java.util.List) r3
            r3.add(r7)
            goto L_0x004f
        L_0x007c:
            java.lang.String r5 = "content://icc/adn"
            android.net.Uri r13 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x00e3 }
            r14 = 0
            r15 = r14
            r16 = r14
            r17 = r14
            android.database.Cursor r7 = r12.A03(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00e3 }
            if (r7 != 0) goto L_0x0094
            java.lang.String r5 = "phonebook/get-sim-card-phones null cursor returned from sim card phones query"
            com.whatsapp.util.Log.e((java.lang.String) r5)     // Catch:{ all -> 0x00d7 }
            goto L_0x0043
        L_0x0094:
            java.lang.String r5 = "name"
            int r6 = r7.getColumnIndex(r5)     // Catch:{ all -> 0x00d7 }
            java.lang.String r5 = "number"
            int r5 = r7.getColumnIndex(r5)     // Catch:{ all -> 0x00d7 }
        L_0x00a0:
            boolean r9 = r7.moveToNext()     // Catch:{ all -> 0x00d7 }
            if (r9 == 0) goto L_0x00d2
            java.lang.String r13 = r7.getString(r6)     // Catch:{ all -> 0x00d7 }
            java.lang.String r9 = r7.getString(r5)     // Catch:{ all -> 0x00d7 }
            if (r9 == 0) goto L_0x00a0
            java.lang.String r14 = android.telephony.PhoneNumberUtils.stripSeparators(r9)     // Catch:{ all -> 0x00d7 }
            boolean r9 = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r14)     // Catch:{ all -> 0x00d7 }
            if (r9 == 0) goto L_0x00a0
            r19 = -2
            r18 = 0
            android.content.Context r10 = r8.A00     // Catch:{ all -> 0x00d7 }
            r9 = 2131888340(0x7f1208d4, float:1.9411313E38)
            java.lang.String r15 = r10.getString(r9)     // Catch:{ all -> 0x00d7 }
            X.3Sq r12 = new X.3Sq     // Catch:{ all -> 0x00d7 }
            r21 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r21)     // Catch:{ all -> 0x00d7 }
            r4.add(r12)     // Catch:{ all -> 0x00d7 }
            goto L_0x00a0
        L_0x00d2:
            r7.close()     // Catch:{ Exception -> 0x00e3 }
            goto L_0x0043
        L_0x00d7:
            r6 = move-exception
            if (r7 == 0) goto L_0x00e2
            r7.close()     // Catch:{ all -> 0x00de }
            goto L_0x00e2
        L_0x00de:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch:{ Exception -> 0x00e3 }
        L_0x00e2:
            throw r6     // Catch:{ Exception -> 0x00e3 }
        L_0x00e3:
            r6 = move-exception
            java.lang.String r5 = "exception while retrieving sim card contacts, will continue without them "
            com.whatsapp.util.Log.w(r5, r6)
            goto L_0x0043
        L_0x00eb:
            X.0yC r5 = r0.A0A
            r4 = 5868(0x16ec, float:8.223E-42)
            X.0yV r3 = X.C21000yV.A02
            boolean r5 = X.C20800yB.A01(r3, r5, r4)
            if (r5 == 0) goto L_0x014b
            java.lang.String r3 = "android.permission.READ_CONTACTS"
            int r4 = r2.A02(r3)
            r3 = -1
            if (r4 != r3) goto L_0x014b
            X.005 r3 = r1.A00
            java.lang.Object r1 = r3.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r2 = "contact_sync_policy_reset"
            r0 = 1
            boolean r0 = r1.getBoolean(r2, r0)
            if (r0 == 0) goto L_0x0145
            r1 = 0
            java.lang.Object r0 = r3.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r1)
            r0.apply()
            X.9NY r3 = new X.9NY
            r3.<init>()
            java.util.Iterator r2 = r36.iterator()
        L_0x012c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x014a
            java.lang.Object r1 = r2.next()
            X.141 r1 = (X.AnonymousClass141) r1
            int r0 = r1.A07
            if (r0 != 0) goto L_0x012c
            r0 = 1
            r1.A07 = r0
            java.util.List r0 = r3.A06
            r0.add(r1)
            goto L_0x012c
        L_0x0145:
            X.9NY r3 = new X.9NY
            r3.<init>()
        L_0x014a:
            return r3
        L_0x014b:
            r4 = 1
            X.005 r1 = r1.A00
            java.lang.Object r1 = r1.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            android.content.SharedPreferences$Editor r3 = r1.edit()
            java.lang.String r1 = "contact_sync_policy_reset"
            android.content.SharedPreferences$Editor r1 = r3.putBoolean(r1, r4)
            r1.apply()
            java.util.HashMap r22 = new java.util.HashMap
            r22.<init>()
            java.util.HashMap r21 = new java.util.HashMap
            r21.<init>()
            java.util.Iterator r8 = r36.iterator()
        L_0x016f:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x019e
            java.lang.Object r7 = r8.next()
            X.141 r7 = (X.AnonymousClass141) r7
            X.11F r1 = r7.A0H
            boolean r1 = X.AnonymousClass143.A0I(r1)
            if (r1 != 0) goto L_0x016f
            X.3IL r1 = r7.A0F
            X.C18740tg.A06(r1)
            java.lang.String r4 = r1.A01
            java.lang.String r1 = r7.A0J()
            X.00I r3 = new X.00I
            r3.<init>(r4, r1)
            r1 = r22
            r1.put(r3, r7)
            r1 = r21
            r1.put(r4, r7)
            goto L_0x016f
        L_0x019e:
            java.lang.String r7 = "data1"
            java.util.HashMap r20 = new java.util.HashMap
            r20.<init>()
            java.lang.String r1 = "android.permission.READ_CONTACTS"
            int r1 = r2.A02(r1)
            if (r1 == 0) goto L_0x01c7
            java.lang.String r1 = "returning empty name map because contact permissions are denied"
            com.whatsapp.util.Log.w((java.lang.String) r1)
        L_0x01b2:
            X.9NY r10 = new X.9NY
            r10.<init>()
            X.1O2 r1 = r0.A02
            java.util.HashSet r9 = r1.A00()
            r33 = r37
            boolean r1 = r33.isEmpty()
            if (r1 != 0) goto L_0x0315
            goto L_0x0307
        L_0x01c7:
            java.lang.String r9 = "raw_contact_id"
            java.lang.String r8 = "mimetype"
            java.lang.String r3 = "data2"
            java.lang.String r2 = "data3"
            java.lang.String r1 = "data4"
            r12 = r9
            r13 = r8
            r14 = r7
            r15 = r3
            r16 = r2
            r17 = r1
            java.lang.String[] r26 = new java.lang.String[]{r12, r13, r14, r15, r16, r17}
            java.lang.String r17 = "vnd.android.cursor.item/name"
            java.lang.String r16 = "vnd.android.cursor.item/nickname"
            java.lang.String r4 = "vnd.android.cursor.item/organization"
            r12 = r17
            r10 = r16
            java.lang.String[] r28 = new java.lang.String[]{r12, r10, r4}
            X.0ya r24 = r11.A0O()
            android.net.Uri r25 = android.provider.ContactsContract.Data.CONTENT_URI
            java.lang.String r27 = "mimetype IN (?,?,?)"
            r29 = r23
            android.database.Cursor r10 = r24.A03(r25, r26, r27, r28, r29)
            if (r10 != 0) goto L_0x0201
            java.lang.String r1 = "null cursor returned from structured name query"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x06f7 }
            goto L_0x01b2
        L_0x0201:
            int r9 = r10.getColumnIndex(r9)     // Catch:{ all -> 0x06f7 }
            r12 = -1
            if (r9 != r12) goto L_0x020f
            java.lang.String r1 = "invalid column index for the raw contact id"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x06f7 }
            goto L_0x0302
        L_0x020f:
            int r8 = r10.getColumnIndex(r8)     // Catch:{ all -> 0x06f7 }
            if (r8 != r12) goto L_0x021c
            java.lang.String r1 = "invalid column index for the mimetype"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x06f7 }
            goto L_0x0302
        L_0x021c:
            int r11 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x06f7 }
            if (r11 != r12) goto L_0x0229
            java.lang.String r1 = "invalid column index for the given name"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x06f7 }
            goto L_0x0302
        L_0x0229:
            int r3 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x06f7 }
            if (r3 != r12) goto L_0x0236
            java.lang.String r1 = "invalid column index for the family name"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x06f7 }
            goto L_0x0302
        L_0x0236:
            int r2 = r10.getColumnIndex(r7)     // Catch:{ all -> 0x06f7 }
            if (r2 != r12) goto L_0x0243
            java.lang.String r1 = "invalid column index for the nickname"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x06f7 }
            goto L_0x0302
        L_0x0243:
            int r7 = r10.getColumnIndex(r7)     // Catch:{ all -> 0x06f7 }
            if (r7 != r12) goto L_0x0250
            java.lang.String r1 = "invalid column index for the company"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x06f7 }
            goto L_0x0302
        L_0x0250:
            int r13 = r10.getColumnIndex(r1)     // Catch:{ all -> 0x06f7 }
            if (r13 != r12) goto L_0x025d
            java.lang.String r1 = "invalid column index for the title"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x06f7 }
            goto L_0x0302
        L_0x025d:
            boolean r1 = r10.moveToNext()     // Catch:{ all -> 0x06f7 }
            if (r1 == 0) goto L_0x0302
            boolean r1 = r10.isNull(r9)     // Catch:{ all -> 0x06f7 }
            if (r1 == 0) goto L_0x026f
            java.lang.String r1 = "null raw contact id for record; skipping"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x06f7 }
            goto L_0x025d
        L_0x026f:
            boolean r1 = r10.isNull(r8)     // Catch:{ all -> 0x06f7 }
            if (r1 == 0) goto L_0x027b
            java.lang.String r1 = "null mimetype for record; skipping"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x06f7 }
            goto L_0x025d
        L_0x027b:
            long r14 = r10.getLong(r9)     // Catch:{ all -> 0x06f7 }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x06f7 }
            r1 = r20
            java.lang.Object r12 = r1.get(r14)     // Catch:{ all -> 0x06f7 }
            X.9MT r12 = (X.AnonymousClass9MT) r12     // Catch:{ all -> 0x06f7 }
            if (r12 != 0) goto L_0x0295
            X.9MT r12 = new X.9MT     // Catch:{ all -> 0x06f7 }
            r12.<init>()     // Catch:{ all -> 0x06f7 }
            r1.put(r14, r12)     // Catch:{ all -> 0x06f7 }
        L_0x0295:
            java.lang.String r14 = r10.getString(r8)     // Catch:{ all -> 0x06f7 }
            if (r14 != 0) goto L_0x02a1
            java.lang.String r1 = "mimetype was returned as null even though cursor said it wasn't null; skipping"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x06f7 }
            goto L_0x025d
        L_0x02a1:
            int r15 = r14.hashCode()     // Catch:{ all -> 0x06f7 }
            r1 = -1079224304(0xffffffffbfac5810, float:-1.3464375)
            if (r15 == r1) goto L_0x02d6
            r1 = 689862072(0x291e75b8, float:3.5185152E-14)
            if (r15 == r1) goto L_0x02c3
            r1 = 2034973555(0x794b3b73, float:6.5952627E34)
            if (r15 != r1) goto L_0x02ec
            r1 = r16
            boolean r1 = r14.equals(r1)     // Catch:{ all -> 0x06f7 }
            if (r1 == 0) goto L_0x02ec
            java.lang.String r1 = r10.getString(r2)     // Catch:{ all -> 0x06f7 }
            r12.A03 = r1     // Catch:{ all -> 0x06f7 }
            goto L_0x025d
        L_0x02c3:
            boolean r1 = r14.equals(r4)     // Catch:{ all -> 0x06f7 }
            if (r1 == 0) goto L_0x02ec
            java.lang.String r1 = r10.getString(r7)     // Catch:{ all -> 0x06f7 }
            r12.A00 = r1     // Catch:{ all -> 0x06f7 }
            java.lang.String r1 = r10.getString(r13)     // Catch:{ all -> 0x06f7 }
            r12.A04 = r1     // Catch:{ all -> 0x06f7 }
            goto L_0x025d
        L_0x02d6:
            r1 = r17
            boolean r1 = r14.equals(r1)     // Catch:{ all -> 0x06f7 }
            if (r1 == 0) goto L_0x02ec
            java.lang.String r1 = r10.getString(r11)     // Catch:{ all -> 0x06f7 }
            r12.A02 = r1     // Catch:{ all -> 0x06f7 }
            java.lang.String r1 = r10.getString(r3)     // Catch:{ all -> 0x06f7 }
            r12.A01 = r1     // Catch:{ all -> 0x06f7 }
            goto L_0x025d
        L_0x02ec:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x06f7 }
            r12.<init>()     // Catch:{ all -> 0x06f7 }
            java.lang.String r1 = "unrecognized mimetype; skipping; mimetype="
            r12.append(r1)     // Catch:{ all -> 0x06f7 }
            r12.append(r14)     // Catch:{ all -> 0x06f7 }
            java.lang.String r1 = r12.toString()     // Catch:{ all -> 0x06f7 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x06f7 }
            goto L_0x025d
        L_0x0302:
            r10.close()
            goto L_0x01b2
        L_0x0307:
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r23 = java.security.MessageDigest.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x030e }
            goto L_0x0315
        L_0x030e:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x0315:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.Set r1 = r6.entrySet()
            java.util.Iterator r19 = r1.iterator()
        L_0x0327:
            boolean r1 = r19.hasNext()
            if (r1 == 0) goto L_0x04e7
            java.lang.Object r11 = r19.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r14 = r11.getValue()
            java.util.List r14 = (java.util.List) r14
            r13 = 0
            java.lang.Object r4 = r14.get(r13)
            X.3Sq r4 = (X.C65583Sq) r4
            java.lang.String[] r18 = A0B
            r12 = 2
            java.util.Iterator r17 = r14.iterator()
            r16 = 0
        L_0x0349:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x036a
            java.lang.Object r3 = r17.next()
            X.3Sq r3 = (X.C65583Sq) r3
            r2 = 0
        L_0x0356:
            if (r2 >= r12) goto L_0x0349
            r15 = r18[r2]
            java.lang.String r1 = r3.A02
            boolean r1 = r15.equals(r1)
            if (r1 == 0) goto L_0x0367
            r4 = r3
            r12 = r2
            r16 = 1
            goto L_0x0349
        L_0x0367:
            int r2 = r2 + 1
            goto L_0x0356
        L_0x036a:
            if (r16 != 0) goto L_0x0395
            java.lang.Object r4 = r14.get(r13)
            X.3Sq r4 = (X.C65583Sq) r4
            java.util.Iterator r13 = r14.iterator()
        L_0x0376:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0395
            java.lang.Object r12 = r13.next()
            X.3Sq r12 = (X.C65583Sq) r12
            r3 = 0
        L_0x0383:
            java.lang.String[] r2 = A0C
            r1 = 1
            if (r3 >= r1) goto L_0x0394
            r2 = r2[r3]
            java.lang.String r1 = r12.A02
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0376
            r3 = 1
            goto L_0x0383
        L_0x0394:
            r4 = r12
        L_0x0395:
            java.lang.Object r2 = r11.getKey()
            r1 = r22
            java.lang.Object r3 = r1.get(r2)
            X.141 r3 = (X.AnonymousClass141) r3
            if (r5 == 0) goto L_0x03f0
            if (r3 != 0) goto L_0x04a0
            java.lang.String r12 = r4.A05
            java.lang.String r2 = r4.A03
            java.util.Iterator r15 = r36.iterator()
        L_0x03ad:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x03f4
            java.lang.Object r3 = r15.next()
            X.141 r3 = (X.AnonymousClass141) r3
            int r13 = r3.A07
            if (r13 == 0) goto L_0x03ad
            r1 = 2
            if (r13 == r1) goto L_0x03ad
            X.11F r1 = r3.A0H
            java.lang.String r13 = X.AnonymousClass3U8.A05(r1)
            X.005 r1 = r0.A00     // Catch:{ 172 -> 0x03d8 }
            java.lang.Object r14 = r1.get()     // Catch:{ 172 -> 0x03d8 }
            X.9oI r14 = (X.C203559oI) r14     // Catch:{ 172 -> 0x03d8 }
            java.lang.String r1 = ""
            X.AUN r1 = r14.A0F(r13, r1)     // Catch:{ 172 -> 0x03d8 }
            if (r2 == 0) goto L_0x03ad
            goto L_0x048a
        L_0x03d8:
            r13 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "Couldn't parse the contact number: "
            r3.append(r1)
            java.lang.String r1 = r13.message
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x03ad
        L_0x03f0:
            if (r3 == 0) goto L_0x03f4
            goto L_0x04a0
        L_0x03f4:
            java.lang.Object r1 = r11.getKey()
            X.00I r1 = (X.AnonymousClass00I) r1
            java.lang.Object r2 = r1.A00
            r1 = r21
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x0465
            java.lang.Object r1 = r11.getKey()
            X.00I r1 = (X.AnonymousClass00I) r1
            java.lang.Object r2 = r1.A00
            r1 = r21
            java.lang.Object r1 = r1.get(r2)
            X.141 r1 = (X.AnonymousClass141) r1
            if (r1 == 0) goto L_0x0465
            X.141 r16 = r1.A04()
            if (r16 == 0) goto L_0x0467
            r3 = r16
        L_0x041e:
            r1 = -1
            r3.A0L(r1)
            java.lang.String r1 = r4.A06
            r3.A0W = r1
            java.lang.Object r1 = r11.getKey()
            X.00I r1 = (X.AnonymousClass00I) r1
            java.lang.Object r1 = r1.A00
            boolean r1 = r9.contains(r1)
            if (r1 != 0) goto L_0x0487
            boolean r1 = r0.A00()
            if (r1 == 0) goto L_0x0327
            long r1 = r4.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            r1 = r20
            java.lang.Object r1 = r1.get(r2)
            X.9MT r1 = (X.AnonymousClass9MT) r1
            A01(r1, r4, r3, r5)
            java.util.List r1 = r10.A00
            r1.add(r3)
            if (r16 != 0) goto L_0x04da
            java.util.List r1 = r10.A01
            r1.add(r3)
            java.lang.Object r1 = r11.getKey()
            X.00I r1 = (X.AnonymousClass00I) r1
            java.lang.Object r1 = r1.A00
            r7.add(r1)
            goto L_0x0327
        L_0x0465:
            r16 = 0
        L_0x0467:
            r25 = 0
            java.lang.String r15 = r4.A05
            long r1 = r4.A01
            java.lang.String r14 = r4.A03
            int r13 = r4.A00
            java.lang.String r12 = r4.A04
            X.141 r3 = new X.141
            r32 = 0
            r24 = r3
            r26 = r15
            r27 = r14
            r28 = r12
            r29 = r13
            r30 = r1
            r24.<init>(r25, r26, r27, r28, r29, r30, r32)
            goto L_0x041e
        L_0x0487:
            java.util.List r1 = r10.A05
            goto L_0x04b8
        L_0x048a:
            int r1 = r1.countryCode_
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r1 = X.AnonymousClass3U2.A04(r12, r13, r1)
            if (r1 == 0) goto L_0x03ad
            java.lang.String r1 = r3.A0J()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x03ad
        L_0x04a0:
            boolean r1 = r33.isEmpty()
            if (r1 != 0) goto L_0x04bd
            boolean r1 = r3.A0z
            if (r1 != 0) goto L_0x04bd
            X.1O5 r11 = r0.A04
            r2 = r23
            r1 = r33
            boolean r1 = X.C202329lb.A02(r11, r3, r2, r1)
            if (r1 == 0) goto L_0x04bd
            java.util.List r1 = r10.A02
        L_0x04b8:
            r1.add(r3)
            goto L_0x0327
        L_0x04bd:
            boolean r1 = r0.A00()
            if (r1 == 0) goto L_0x0487
            long r1 = r4.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            r1 = r20
            java.lang.Object r1 = r1.get(r2)
            X.9MT r1 = (X.AnonymousClass9MT) r1
            boolean r1 = A01(r1, r4, r3, r5)
            if (r1 == 0) goto L_0x0487
            java.util.List r1 = r10.A06
            goto L_0x04b8
        L_0x04da:
            java.lang.Object r1 = r11.getKey()
            X.00I r1 = (X.AnonymousClass00I) r1
            java.lang.Object r1 = r1.A00
            r8.add(r1)
            goto L_0x0327
        L_0x04e7:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.Set r1 = r22.entrySet()
            java.util.Iterator r4 = r1.iterator()
        L_0x04f4:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0541
            java.lang.Object r3 = r4.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r5 == 0) goto L_0x050d
            java.lang.Object r1 = r3.getValue()
            X.141 r1 = (X.AnonymousClass141) r1
            int r1 = r1.A07
            if (r1 == 0) goto L_0x050d
            goto L_0x04f4
        L_0x050d:
            boolean r1 = r0.A00()
            if (r1 == 0) goto L_0x04f4
            java.lang.Object r1 = r3.getKey()
            boolean r1 = r6.containsKey(r1)
            if (r1 != 0) goto L_0x04f4
            java.lang.Object r2 = r3.getValue()
            java.util.List r1 = r10.A03
            r1.add(r2)
            java.lang.Object r2 = r3.getValue()
            java.util.List r1 = r10.A04
            r1.add(r2)
            java.lang.Object r2 = r3.getValue()
            X.141 r2 = (X.AnonymousClass141) r2
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r2.A06(r1)
            if (r1 == 0) goto L_0x04f4
            r9.add(r1)
            goto L_0x04f4
        L_0x0541:
            java.util.Set r1 = r22.entrySet()
            java.util.Iterator r5 = r1.iterator()
        L_0x0549:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x05c6
            java.lang.Object r4 = r5.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r1 = r4.getKey()
            X.00I r1 = (X.AnonymousClass00I) r1
            java.lang.Object r1 = r1.A00
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L_0x05a5
            java.util.List r2 = r10.A03
            java.lang.Object r1 = r4.getValue()
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x05a5
            java.lang.Object r2 = r4.getValue()
            java.util.List r1 = r10.A00
            r1.add(r2)
            java.lang.Object r2 = r4.getValue()
            java.util.List r1 = r10.A01
        L_0x057e:
            r1.add(r2)
        L_0x0581:
            java.lang.Object r2 = r4.getValue()
            X.141 r2 = (X.AnonymousClass141) r2
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r3 = r2.A06(r1)
            if (r3 == 0) goto L_0x0549
            boolean r1 = r9.contains(r3)
            if (r1 == 0) goto L_0x0549
            java.util.List r2 = r10.A04
            java.lang.Object r1 = r4.getValue()
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x0549
            r9.remove(r3)
            goto L_0x0549
        L_0x05a5:
            java.lang.Object r1 = r4.getKey()
            X.00I r1 = (X.AnonymousClass00I) r1
            java.lang.Object r1 = r1.A00
            boolean r1 = r8.contains(r1)
            if (r1 == 0) goto L_0x0581
            java.util.List r2 = r10.A03
            java.lang.Object r1 = r4.getValue()
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x0581
            java.lang.Object r2 = r4.getValue()
            java.util.List r1 = r10.A00
            goto L_0x057e
        L_0x05c6:
            java.util.List r4 = r10.A04
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x05fc
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.Iterator r5 = r4.iterator()
        L_0x05d7:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x05f9
            java.lang.Object r3 = r5.next()
            X.141 r3 = (X.AnonymousClass141) r3
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r3.A06(r2)
            if (r1 == 0) goto L_0x05d7
            com.whatsapp.jid.Jid r1 = r3.A06(r2)
            boolean r1 = r9.contains(r1)
            if (r1 != 0) goto L_0x05d7
            r6.add(r3)
            goto L_0x05d7
        L_0x05f9:
            r4.removeAll(r6)
        L_0x05fc:
            X.1O0 r1 = r0.A03
            X.6PA r5 = r1.A00()
            java.util.List r1 = r5.A00
            java.util.Iterator r3 = r1.iterator()
        L_0x0608:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x061d
            java.lang.Object r2 = r3.next()
            java.util.List r1 = r10.A00
            r1.add(r2)
            java.util.List r1 = r10.A01
            r1.add(r2)
            goto L_0x0608
        L_0x061d:
            java.util.List r1 = r5.A01
            java.util.Iterator r3 = r1.iterator()
        L_0x0623:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0636
            java.lang.Object r2 = r3.next()
            java.util.List r1 = r10.A03
            r1.add(r2)
            r4.add(r2)
            goto L_0x0623
        L_0x0636:
            X.1O4 r0 = r0.A05
            X.6PB r3 = r0.A00()
            java.util.List r0 = r3.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x0642:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0657
            java.lang.Object r1 = r2.next()
            java.util.List r0 = r10.A00
            r0.add(r1)
            java.util.List r0 = r10.A01
            r0.add(r1)
            goto L_0x0642
        L_0x0657:
            java.util.List r0 = r3.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x065d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0670
            java.lang.Object r1 = r2.next()
            java.util.List r0 = r10.A03
            r0.add(r1)
            r4.add(r1)
            goto L_0x065d
        L_0x0670:
            java.util.List r0 = r3.A02
            java.util.Iterator r2 = r0.iterator()
        L_0x0676:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0686
            java.lang.Object r1 = r2.next()
            java.util.List r0 = r10.A05
            r0.add(r1)
            goto L_0x0676
        L_0x0686:
            java.util.List r2 = r10.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3 = r35
            r1.append(r3)
            java.lang.String r0 = "add"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass16D.A02(r0, r2)
            java.util.List r2 = r10.A06
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r0 = "update"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass16D.A02(r0, r2)
            java.util.List r2 = r10.A03
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r0 = "remove"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass16D.A02(r0, r2)
            java.util.List r2 = r10.A05
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r0 = "unchanged"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass16D.A02(r0, r2)
            java.util.List r2 = r10.A02
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r0 = "updateContactsMatchingJidHash"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass16D.A02(r0, r2)
            return r10
        L_0x06f7:
            r1 = move-exception
            if (r10 == 0) goto L_0x0702
            r10.close()     // Catch:{ all -> 0x06fe }
            throw r1
        L_0x06fe:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0702:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1O3.A02(java.lang.String, java.util.List, java.util.List):X.9NY");
    }

    public AnonymousClass1O3(AnonymousClass1O6 r1, AnonymousClass1O2 r2, AnonymousClass1O0 r3, AnonymousClass1O5 r4, AnonymousClass1O4 r5, C21060yb r6, C19630wG r7, C20830yE r8, C19420v0 r9, C20810yC r10, AnonymousClass005 r11) {
        this.A0A = r10;
        this.A03 = r3;
        this.A07 = r7;
        this.A02 = r2;
        this.A06 = r6;
        this.A05 = r5;
        this.A08 = r8;
        this.A09 = r9;
        this.A04 = r4;
        this.A01 = r1;
        this.A00 = r11;
    }
}
