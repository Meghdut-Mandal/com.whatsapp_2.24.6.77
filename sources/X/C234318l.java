package X;

import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.18l  reason: invalid class name and case insensitive filesystem */
public final class C234318l {
    public int A00;
    public C593533p A01;
    public final C19970wo A02;
    public final C233918h A03;
    public final AnonymousClass18M A04;
    public final C20810yC A05;

    public C234318l(C19970wo r2, C233918h r3, AnonymousClass18M r4, C20810yC r5) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r3, 4);
        this.A02 = r2;
        this.A05 = r5;
        this.A04 = r4;
        this.A03 = r3;
    }

    private final Cursor A00(C26901Ly r5, String str, String str2, String str3) {
        Cursor A09;
        String[] strArr = {String.valueOf(-1), "0", "0"};
        AnonymousClass1M0 r52 = (AnonymousClass1M0) r5;
        if (C20800yB.A01(C21000yV.A02, this.A05, 6484)) {
            C224114e r2 = r52.A02;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_lid_identifier");
            A09 = r2.A09(str3, sb.toString(), strArr);
        } else {
            A09 = r52.A02.A09(str2, str, strArr);
        }
        AnonymousClass00C.A0B(A09);
        return A09;
    }

    public static final void A01(AnonymousClass6EZ r2, byte[] bArr) {
        AnonymousClass00C.A0D(bArr, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("axolotl trusting ");
        sb.append(r2);
        sb.append(" key pair with ");
        sb.append(bArr);
        sb.append(" as identity key");
        Log.i(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0085, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0086, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0089, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap A05(java.util.List r14) {
        /*
            r13 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r14, r0)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            X.18M r9 = r13.A04
            X.1M0 r6 = r9.A04()
            X.71s r7 = r6.B1k()     // Catch:{ all -> 0x0083 }
            java.util.Iterator r12 = r14.iterator()     // Catch:{ all -> 0x007c }
        L_0x0017:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0072
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x007c }
            X.6EZ r11 = (X.AnonymousClass6EZ) r11     // Catch:{ all -> 0x007c }
            r0 = 0
            X.AnonymousClass00C.A0D(r11, r0)     // Catch:{ all -> 0x007c }
            X.1M0 r8 = r9.A04()     // Catch:{ all -> 0x007c }
            X.14e r4 = r8.A02     // Catch:{ all -> 0x006b }
            java.lang.String r3 = "identities"
            java.lang.String r2 = "recipient_id =? AND recipient_type = ? AND device_id =?"
            java.lang.String[] r1 = r11.A00()     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "SignalIdentityKeyStore/removeIdentity"
            int r0 = r4.A03(r3, r2, r0, r1)     // Catch:{ all -> 0x006b }
            long r4 = (long) r0     // Catch:{ all -> 0x006b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
            r1.<init>()     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "axolotl deleted "
            r1.append(r0)     // Catch:{ all -> 0x006b }
            r1.append(r4)     // Catch:{ all -> 0x006b }
            java.lang.String r0 = " identities for "
            r1.append(r0)     // Catch:{ all -> 0x006b }
            r1.append(r11)     // Catch:{ all -> 0x006b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x006b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x006b }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x0060
            r0 = 1
        L_0x0060:
            r8.close()     // Catch:{ all -> 0x007c }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x007c }
            r10.put(r11, r0)     // Catch:{ all -> 0x007c }
            goto L_0x0017
        L_0x006b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x0072:
            r7.A00()     // Catch:{ all -> 0x007c }
            r7.close()     // Catch:{ all -> 0x0083 }
            r6.close()
            return r10
        L_0x007c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007e }
        L_0x007e:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x0083 }
            throw r0     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234318l.A05(java.util.List):java.util.HashMap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0258, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        X.C05600Qi.A00(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x025f, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        X.C05600Qi.A00(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0263, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0288, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0289, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x028c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap A06(java.util.Set r15) {
        /*
            r14 = this;
            r1 = 0
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x028d
            X.6EZ[] r0 = new X.AnonymousClass6EZ[r1]
            java.lang.Object[] r2 = r15.toArray(r0)
            r0 = 100
            X.72Z r1 = new X.72Z
            r1.<init>(r2, r0)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            X.18M r0 = r14.A04
            X.1M0 r4 = r0.get()
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x0286 }
        L_0x0028:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0286 }
            if (r0 == 0) goto L_0x0264
            java.lang.Object r3 = r13.next()     // Catch:{ all -> 0x0286 }
            X.6EZ[] r3 = (X.AnonymousClass6EZ[]) r3     // Catch:{ all -> 0x0286 }
            X.0yC r1 = r14.A05     // Catch:{ all -> 0x0286 }
            r0 = 6484(0x1954, float:9.086E-42)
            X.0yV r2 = X.C21000yV.A02     // Catch:{ all -> 0x0286 }
            boolean r0 = X.C20800yB.A01(r2, r1, r0)     // Catch:{ all -> 0x0286 }
            if (r0 == 0) goto L_0x01da
            X.AnonymousClass00C.A0B(r4)     // Catch:{ all -> 0x0286 }
            X.AnonymousClass00C.A0B(r3)     // Catch:{ all -> 0x0286 }
            X.18h r9 = r14.A03     // Catch:{ all -> 0x0286 }
            java.util.List r12 = X.AnonymousClass02R.A0D(r3)     // Catch:{ all -> 0x0286 }
            r8 = 2
            X.0yC r1 = r9.A03     // Catch:{ all -> 0x0286 }
            r0 = 6542(0x198e, float:9.167E-42)
            boolean r0 = X.C20800yB.A01(r2, r1, r0)     // Catch:{ all -> 0x0286 }
            if (r0 != 0) goto L_0x0059
            goto L_0x0119
        L_0x0059:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0286 }
            r10.<init>()     // Catch:{ all -> 0x0286 }
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0286 }
            r5.<init>()     // Catch:{ all -> 0x0286 }
            java.util.Iterator r2 = r12.iterator()     // Catch:{ all -> 0x0286 }
        L_0x0067:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0286 }
            r7 = 1
            if (r0 == 0) goto L_0x0095
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0286 }
            X.6EZ r1 = (X.AnonymousClass6EZ) r1     // Catch:{ all -> 0x0286 }
            int r0 = r1.A01     // Catch:{ all -> 0x0286 }
            if (r0 == 0) goto L_0x0086
            if (r0 != r7) goto L_0x0067
            java.lang.String r0 = r1.A02     // Catch:{ all -> 0x0286 }
            java.lang.Long r0 = X.C54072sM.A00(r0)     // Catch:{ all -> 0x0286 }
            if (r0 == 0) goto L_0x0067
            r5.put(r1, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x0067
        L_0x0086:
            android.os.Parcelable$Creator r0 = com.whatsapp.jid.PhoneUserJid.CREATOR     // Catch:{ all -> 0x0286 }
            java.lang.String r0 = r1.A02     // Catch:{ all -> 0x0286 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0286 }
            com.whatsapp.jid.PhoneUserJid r0 = X.C222913s.A00(r0)     // Catch:{ all -> 0x0286 }
            r10.put(r0, r1)     // Catch:{ all -> 0x0286 }
            goto L_0x0067
        L_0x0095:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x0286 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e5
            X.18j r2 = r9.A02     // Catch:{ all -> 0x0286 }
            java.util.Set r1 = r10.keySet()     // Catch:{ all -> 0x0286 }
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)     // Catch:{ all -> 0x0286 }
            X.12O r0 = r2.A00     // Catch:{ all -> 0x0286 }
            java.util.LinkedHashMap r0 = r0.A0E(r1)     // Catch:{ all -> 0x0286 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0286 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x0286 }
        L_0x00b5:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0286 }
            if (r0 == 0) goto L_0x00e5
            java.lang.Object r1 = r11.next()     // Catch:{ all -> 0x0286 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0286 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x0286 }
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0     // Catch:{ all -> 0x0286 }
            java.lang.String r0 = r0.user     // Catch:{ all -> 0x0286 }
            java.lang.Long r0 = X.C54072sM.A00(r0)     // Catch:{ all -> 0x0286 }
            if (r0 == 0) goto L_0x00b5
            long r2 = r0.longValue()     // Catch:{ all -> 0x0286 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ all -> 0x0286 }
            java.lang.Object r1 = r10.get(r0)     // Catch:{ all -> 0x0286 }
            if (r1 == 0) goto L_0x00b5
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0286 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x00b5
        L_0x00e5:
            int r1 = r12.size()     // Catch:{ all -> 0x0286 }
            int r0 = r5.size()     // Catch:{ all -> 0x0286 }
            if (r1 == r0) goto L_0x011a
            X.0wN r3 = r9.A00     // Catch:{ all -> 0x0286 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0286 }
            r2.<init>()     // Catch:{ all -> 0x0286 }
            java.lang.String r0 = "missing "
            r2.append(r0)     // Catch:{ all -> 0x0286 }
            int r1 = r12.size()     // Catch:{ all -> 0x0286 }
            int r0 = r5.size()     // Catch:{ all -> 0x0286 }
            int r1 = r1 - r0
            r2.append(r1)     // Catch:{ all -> 0x0286 }
            java.lang.String r0 = " pn-lid mappings: "
            r2.append(r0)     // Catch:{ all -> 0x0286 }
            r2.append(r8)     // Catch:{ all -> 0x0286 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0286 }
            java.lang.String r0 = "AxolotlLidJidMigrationUtils/getLidFromSignalAddresses"
            r3.A0E(r0, r1, r7)     // Catch:{ all -> 0x0286 }
            goto L_0x011a
        L_0x0119:
            r5 = 0
        L_0x011a:
            if (r5 != 0) goto L_0x0121
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0286 }
            r5.<init>()     // Catch:{ all -> 0x0286 }
        L_0x0121:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0286 }
            r1.<init>()     // Catch:{ all -> 0x0286 }
            java.util.Set r0 = r5.entrySet()     // Catch:{ all -> 0x0286 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0286 }
        L_0x012e:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0286 }
            if (r0 == 0) goto L_0x0164
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0286 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0286 }
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x0286 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0286 }
            r1.add(r0)     // Catch:{ all -> 0x0286 }
            java.lang.Object r0 = r2.getKey()     // Catch:{ all -> 0x0286 }
            X.6EZ r0 = (X.AnonymousClass6EZ) r0     // Catch:{ all -> 0x0286 }
            int r0 = r0.A01     // Catch:{ all -> 0x0286 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0286 }
            r1.add(r0)     // Catch:{ all -> 0x0286 }
            java.lang.Object r0 = r2.getKey()     // Catch:{ all -> 0x0286 }
            X.6EZ r0 = (X.AnonymousClass6EZ) r0     // Catch:{ all -> 0x0286 }
            int r0 = r0.A00     // Catch:{ all -> 0x0286 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0286 }
            r1.add(r0)     // Catch:{ all -> 0x0286 }
            goto L_0x012e
        L_0x0164:
            int r0 = r1.size()     // Catch:{ all -> 0x0286 }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0286 }
            java.lang.Object[] r8 = r1.toArray(r0)     // Catch:{ all -> 0x0286 }
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ all -> 0x0286 }
            X.AnonymousClass00C.A08(r8)     // Catch:{ all -> 0x0286 }
            X.14e r7 = r4.A02     // Catch:{ all -> 0x0286 }
            int r0 = r8.length     // Catch:{ all -> 0x0286 }
            int r1 = r0 / 3
            java.lang.String r0 = "SELECT public_key, timestamp, recipient_lid_identifier, recipient_type, device_id FROM identities INNER JOIN (SELECT ? AS r, ? AS t, ? AS d"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0286 }
            r3.<init>(r0)     // Catch:{ all -> 0x0286 }
            int r2 = r1 + -1
            r1 = 0
        L_0x0182:
            if (r1 >= r2) goto L_0x018c
            java.lang.String r0 = " UNION ALL SELECT ? AS r, ? AS t, ? AS d"
            r3.append(r0)     // Catch:{ all -> 0x0286 }
            int r1 = r1 + 1
            goto L_0x0182
        L_0x018c:
            java.lang.String r0 = ") AS joined ON joined.r = identities.recipient_lid_identifier AND joined.t = identities.recipient_type AND joined.d = identities.device_id"
            r3.append(r0)     // Catch:{ all -> 0x0286 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0286 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x0286 }
            java.lang.String r0 = "SignalIdentityKeyStore/getIdentityPublicKeys_lid_identifier"
            android.database.Cursor r9 = r7.A09(r1, r0, r8)     // Catch:{ all -> 0x0286 }
            java.lang.String r0 = "public_key"
            int r11 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x0256 }
            java.lang.String r0 = "timestamp"
            int r10 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x0256 }
            java.lang.String r0 = "recipient_lid_identifier"
            int r8 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x0256 }
            java.lang.String r0 = "device_id"
            int r7 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x0256 }
        L_0x01b6:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0256 }
            if (r0 == 0) goto L_0x01d5
            java.lang.String r3 = r9.getString(r8)     // Catch:{ all -> 0x0256 }
            r2 = 1
            int r0 = r9.getInt(r7)     // Catch:{ all -> 0x0256 }
            X.6EZ r1 = new X.6EZ     // Catch:{ all -> 0x0256 }
            r1.<init>(r3, r2, r0)     // Catch:{ all -> 0x0256 }
            byte[] r0 = r9.getBlob(r11)     // Catch:{ all -> 0x0256 }
            r9.getLong(r10)     // Catch:{ all -> 0x0256 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0256 }
            goto L_0x01b6
        L_0x01d5:
            r9.close()     // Catch:{ all -> 0x0286 }
            goto L_0x0028
        L_0x01da:
            X.AnonymousClass00C.A0B(r4)     // Catch:{ all -> 0x0286 }
            X.AnonymousClass00C.A0B(r3)     // Catch:{ all -> 0x0286 }
            java.util.List r0 = X.AnonymousClass02R.A0D(r3)     // Catch:{ all -> 0x0286 }
            java.lang.String[] r8 = X.C110585au.A00(r0)     // Catch:{ all -> 0x0286 }
            X.14e r7 = r4.A02     // Catch:{ all -> 0x0286 }
            int r1 = r3.length     // Catch:{ all -> 0x0286 }
            java.lang.String r0 = "SELECT public_key, timestamp, recipient_id, recipient_type, device_id FROM identities INNER JOIN (SELECT ? AS r, ? AS t, ? AS d"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0286 }
            r3.<init>(r0)     // Catch:{ all -> 0x0286 }
            int r2 = r1 + -1
            r1 = 0
        L_0x01f5:
            if (r1 >= r2) goto L_0x01ff
            java.lang.String r0 = " UNION ALL SELECT ? AS r, ? AS t, ? AS d"
            r3.append(r0)     // Catch:{ all -> 0x0286 }
            int r1 = r1 + 1
            goto L_0x01f5
        L_0x01ff:
            java.lang.String r0 = ") AS joined ON joined.r = identities.recipient_id AND joined.t = identities.recipient_type AND joined.d = identities.device_id"
            r3.append(r0)     // Catch:{ all -> 0x0286 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0286 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x0286 }
            java.lang.String r0 = "SignalIdentityKeyStore/getIdentityPublicKeys"
            android.database.Cursor r10 = r7.A09(r1, r0, r8)     // Catch:{ all -> 0x0286 }
            java.lang.String r0 = "public_key"
            int r12 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x025d }
            java.lang.String r0 = "timestamp"
            int r11 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x025d }
            java.lang.String r0 = "recipient_id"
            int r9 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x025d }
            java.lang.String r0 = "recipient_type"
            int r8 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x025d }
            java.lang.String r0 = "device_id"
            int r7 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x025d }
        L_0x022f:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x025d }
            if (r0 == 0) goto L_0x0251
            java.lang.String r3 = r10.getString(r9)     // Catch:{ all -> 0x025d }
            int r2 = r10.getInt(r8)     // Catch:{ all -> 0x025d }
            int r0 = r10.getInt(r7)     // Catch:{ all -> 0x025d }
            X.6EZ r1 = new X.6EZ     // Catch:{ all -> 0x025d }
            r1.<init>(r3, r2, r0)     // Catch:{ all -> 0x025d }
            byte[] r0 = r10.getBlob(r12)     // Catch:{ all -> 0x025d }
            r10.getLong(r11)     // Catch:{ all -> 0x025d }
            r6.put(r1, r0)     // Catch:{ all -> 0x025d }
            goto L_0x022f
        L_0x0251:
            r10.close()     // Catch:{ all -> 0x0286 }
            goto L_0x0028
        L_0x0256:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0258 }
        L_0x0258:
            r1 = move-exception
            X.C05600Qi.A00(r9, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x0263
        L_0x025d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x025f }
        L_0x025f:
            r1 = move-exception
            X.C05600Qi.A00(r10, r0)     // Catch:{ all -> 0x0286 }
        L_0x0263:
            throw r1     // Catch:{ all -> 0x0286 }
        L_0x0264:
            r3 = 0
            r4.close()
            java.util.Iterator r2 = r15.iterator()
        L_0x026c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x028d
            java.lang.Object r1 = r2.next()
            boolean r0 = r6.containsKey(r1)
            if (r0 != 0) goto L_0x026c
            boolean r0 = r5.containsKey(r1)
            if (r0 != 0) goto L_0x026c
            r6.put(r1, r3)
            goto L_0x026c
        L_0x0286:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0288 }
        L_0x0288:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        L_0x028d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234318l.A06(java.util.Set):java.util.HashMap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003c, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02() {
        /*
            r4 = this;
            X.18M r0 = r4.A04
            X.1M0 r3 = r0.get()
            java.lang.String r2 = "SignalIdentityKeyStore/getNextPreKeyId"
            java.lang.String r1 = "SELECT next_prekey_id FROM identities WHERE recipient_id =? AND recipient_type = ? AND device_id =?"
            java.lang.String r0 = "SELECT next_prekey_id FROM identities WHERE recipient_lid_identifier =? AND recipient_type = ? AND device_id =?"
            X.AnonymousClass00C.A0B(r3)     // Catch:{ all -> 0x0039 }
            android.database.Cursor r2 = r4.A00(r3, r2, r1, r0)     // Catch:{ all -> 0x0039 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "next_prekey_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0032 }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0032 }
            r2.close()     // Catch:{ all -> 0x0039 }
            r3.close()
            return r0
        L_0x002a:
            java.lang.String r1 = "Missing entry for self in identities table"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x0032 }
            r0.<init>(r1)     // Catch:{ all -> 0x0032 }
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0039 }
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234318l.A02():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A03() {
        /*
            r4 = this;
            int r0 = r4.A00
            if (r0 != 0) goto L_0x0046
            X.18M r0 = r4.A04
            X.1M0 r3 = r0.get()
            java.lang.String r2 = "SignalIdentityKeyStore/getRegistrationId"
            java.lang.String r1 = "SELECT registration_id FROM identities WHERE recipient_id =? AND recipient_type = ? AND device_id =?"
            java.lang.String r0 = "SELECT registration_id FROM identities WHERE recipient_lid_identifier =? AND recipient_type = ? AND device_id =?"
            X.AnonymousClass00C.A0B(r3)     // Catch:{ all -> 0x003c }
            android.database.Cursor r2 = r4.A00(r3, r2, r1, r0)     // Catch:{ all -> 0x003c }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "registration_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0035 }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0035 }
            r4.A00 = r0     // Catch:{ all -> 0x0035 }
            r2.close()     // Catch:{ all -> 0x003c }
            goto L_0x0043
        L_0x002d:
            java.lang.String r1 = "Missing entry for self in identities table"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x0035 }
            r0.<init>(r1)     // Catch:{ all -> 0x0035 }
            throw r0     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        L_0x0043:
            r3.close()
        L_0x0046:
            int r0 = r4.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234318l.A03():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C593533p A04() {
        /*
            r5 = this;
            X.33p r0 = r5.A01
            if (r0 != 0) goto L_0x005b
            X.18M r0 = r5.A04
            X.1M0 r3 = r0.get()
            java.lang.String r2 = "SignalIdentityKeyStore/getIdentityKeyPair"
            java.lang.String r1 = "SELECT public_key, private_key FROM identities WHERE recipient_id =? AND recipient_type = ? AND device_id =?"
            java.lang.String r0 = "SELECT public_key, private_key FROM identities WHERE recipient_lid_identifier =? AND recipient_type = ? AND device_id =?"
            X.AnonymousClass00C.A0B(r3)     // Catch:{ all -> 0x0051 }
            android.database.Cursor r4 = r5.A00(r3, r2, r1, r0)     // Catch:{ all -> 0x0051 }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "public_key"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004a }
            byte[] r2 = r4.getBlob(r0)     // Catch:{ all -> 0x004a }
            X.AnonymousClass00C.A08(r2)     // Catch:{ all -> 0x004a }
            java.lang.String r0 = "private_key"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004a }
            byte[] r1 = r4.getBlob(r0)     // Catch:{ all -> 0x004a }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x004a }
            X.33p r0 = new X.33p     // Catch:{ all -> 0x004a }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x004a }
            r5.A01 = r0     // Catch:{ all -> 0x004a }
            r4.close()     // Catch:{ all -> 0x0051 }
            goto L_0x0058
        L_0x0042:
            java.lang.String r1 = "Missing entry for self in identities table"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x004a }
            r0.<init>(r1)     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x0051 }
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        L_0x0058:
            r3.close()
        L_0x005b:
            X.33p r0 = r5.A01
            if (r0 == 0) goto L_0x0060
            return r0
        L_0x0060:
            java.lang.String r1 = "self identity cannot be null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234318l.A04():X.33p");
    }
}
