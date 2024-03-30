package X;

/* renamed from: X.1QM  reason: invalid class name */
public class AnonymousClass1QM implements Runnable {
    public long A00 = 0;
    public final C19970wo A01;
    public final C20310xM A02;
    public final AnonymousClass17S A03;
    public final AnonymousClass1A4 A04;
    public final AnonymousClass1DQ A05;
    public final AnonymousClass1QJ A06;
    public final AnonymousClass1FN A07;
    public final AnonymousClass1QI A08;
    public final C26171Jd A09;
    public final C20170x8 A0A;
    public final int A0B;
    public final C19700wN A0C;
    public final AnonymousClass163 A0D;
    public final AnonymousClass1QL A0E;
    public final C20810yC A0F;
    public final AnonymousClass1A1 A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03e2, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0163, code lost:
        if (r0 != null) goto L_0x0165;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:122:0x034f, B:135:0x0391] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(long r23, int r25) {
        /*
            r22 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "EphemeralUpdateRunnable/processMessages type: "
            r2.append(r0)
            r8 = r25
            r2.append(r8)
            java.lang.String r0 = " time: "
            r2.append(r0)
            r19 = r23
            r0 = r19
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6 = r22
            int r7 = r6.A0B
            if (r25 == 0) goto L_0x00c4
            r0 = 2
            if (r8 == r0) goto L_0x008a
            r0 = 3
            if (r8 == r0) goto L_0x005e
            r0 = 4
            if (r8 != r0) goto L_0x0056
            X.0x8 r0 = r6.A0A
            X.12P r0 = r0.A03
            X.1M0 r4 = r0.get()
            X.14e r5 = r4.A02     // Catch:{ all -> 0x050b }
            java.lang.String r3 = X.AnonymousClass3TN.A06     // Catch:{ all -> 0x050b }
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x050b }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r19)     // Catch:{ all -> 0x050b }
            r2[r1] = r0     // Catch:{ all -> 0x050b }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x050b }
            r2[r1] = r0     // Catch:{ all -> 0x050b }
            java.lang.String r0 = "GET_EXPIRED_MESSAGE_ADDON_PARENT_KEY_SQL"
            android.database.Cursor r5 = r5.A09(r3, r0, r2)     // Catch:{ all -> 0x050b }
            goto L_0x00f7
        L_0x0056:
            java.lang.String r1 = "Invalid job type"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x005e:
            X.1QI r1 = r6.A08
            X.12P r0 = r1.A00
            X.1M0 r4 = r0.get()
            X.14e r5 = r4.A02     // Catch:{ all -> 0x050b }
            X.0yC r2 = r1.A01     // Catch:{ all -> 0x050b }
            r1 = 6261(0x1875, float:8.774E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x050b }
            boolean r0 = X.C20800yB.A01(r0, r2, r1)     // Catch:{ all -> 0x050b }
            if (r0 == 0) goto L_0x0087
            java.lang.String r3 = X.AnonymousClass2x3.A05     // Catch:{ all -> 0x050b }
        L_0x0076:
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x050b }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x050b }
            r2[r1] = r0     // Catch:{ all -> 0x050b }
            java.lang.String r0 = "GET_EXPIRED_VIEW_ONCE_MESSAGES_SQL"
            android.database.Cursor r5 = r5.A09(r3, r0, r2)     // Catch:{ all -> 0x050b }
            goto L_0x00f7
        L_0x0087:
            java.lang.String r3 = X.AnonymousClass2x3.A04     // Catch:{ all -> 0x050b }
            goto L_0x0076
        L_0x008a:
            X.1QI r2 = r6.A08
            X.17Z r0 = X.AnonymousClass17Z.$redex_init_class
            r0 = 1209600000(0x48190800, double:5.97621805E-315)
            long r9 = r23 - r0
            X.12P r0 = r2.A00
            X.1M0 r4 = r0.get()
            X.14e r5 = r4.A02     // Catch:{ all -> 0x050b }
            X.0yC r2 = r2.A01     // Catch:{ all -> 0x050b }
            r1 = 6261(0x1875, float:8.774E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x050b }
            boolean r0 = X.C20800yB.A01(r0, r2, r1)     // Catch:{ all -> 0x050b }
            if (r0 == 0) goto L_0x00c1
            java.lang.String r3 = X.AnonymousClass2x3.A01     // Catch:{ all -> 0x050b }
        L_0x00a9:
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x050b }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x050b }
            r2[r1] = r0     // Catch:{ all -> 0x050b }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x050b }
            r2[r1] = r0     // Catch:{ all -> 0x050b }
            java.lang.String r0 = "GET_EXPIRED_VIEW_ONCE_MESSAGES_SQL"
            android.database.Cursor r5 = r5.A09(r3, r0, r2)     // Catch:{ all -> 0x050b }
            goto L_0x00f7
        L_0x00c1:
            java.lang.String r3 = X.AnonymousClass2x3.A00     // Catch:{ all -> 0x050b }
            goto L_0x00a9
        L_0x00c4:
            X.17S r1 = r6.A03
            X.12P r0 = r1.A04
            X.1M0 r4 = r0.get()
            X.14e r5 = r4.A02     // Catch:{ all -> 0x050b }
            X.0yC r2 = r1.A0A     // Catch:{ all -> 0x050b }
            r1 = 6261(0x1875, float:8.774E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x050b }
            boolean r0 = X.C20800yB.A01(r0, r2, r1)     // Catch:{ all -> 0x050b }
            if (r0 == 0) goto L_0x00f4
            java.lang.String r3 = X.C56622wc.A01     // Catch:{ all -> 0x050b }
        L_0x00dc:
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x050b }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r19)     // Catch:{ all -> 0x050b }
            r2[r1] = r0     // Catch:{ all -> 0x050b }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x050b }
            r2[r1] = r0     // Catch:{ all -> 0x050b }
            java.lang.String r0 = "GET_EXPIRED_EPHEMERAL_MESSAGES_SQL"
            android.database.Cursor r5 = r5.A09(r3, r0, r2)     // Catch:{ all -> 0x050b }
            goto L_0x00f7
        L_0x00f4:
            java.lang.String r3 = X.C56622wc.A00     // Catch:{ all -> 0x050b }
            goto L_0x00dc
        L_0x00f7:
            r4.close()
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0504 }
            r4.<init>()     // Catch:{ all -> 0x0504 }
            r3 = 0
            r10 = 0
            r9 = 0
            r21 = 0
            r2 = 0
        L_0x0105:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0504 }
            if (r0 == 0) goto L_0x0174
            X.163 r11 = r6.A0D     // Catch:{ all -> 0x0504 }
            java.lang.String r0 = "chat_row_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0504 }
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x0504 }
            X.11F r1 = r11.A0A(r0)     // Catch:{ all -> 0x0504 }
            if (r1 != 0) goto L_0x014c
            int r10 = r10 + 1
            X.0yC r11 = r6.A0F     // Catch:{ all -> 0x0504 }
            r1 = 7629(0x1dcd, float:1.069E-41)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x0504 }
            boolean r0 = X.C20800yB.A01(r0, r11, r1)     // Catch:{ all -> 0x0504 }
            if (r0 == 0) goto L_0x0105
            X.1A4 r0 = r6.A04     // Catch:{ all -> 0x0504 }
            java.util.Map r0 = r0.A02     // Catch:{ all -> 0x0504 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0504 }
            if (r0 == 0) goto L_0x0105
            X.1A1 r11 = r6.A0G     // Catch:{ all -> 0x0504 }
            java.lang.String r0 = "_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0504 }
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x0504 }
            X.175 r11 = r11.A01     // Catch:{ all -> 0x0504 }
            X.3T1 r0 = r11.A01(r0)     // Catch:{ all -> 0x0504 }
            if (r0 == 0) goto L_0x016b
            int r9 = r9 + 1
            goto L_0x0165
        L_0x014c:
            X.1A4 r0 = r6.A04     // Catch:{ all -> 0x0504 }
            java.util.Map r11 = r0.A02     // Catch:{ all -> 0x0504 }
            java.lang.Object r0 = r11.get(r1)     // Catch:{ all -> 0x0504 }
            if (r0 != 0) goto L_0x0171
            r0 = 0
            java.lang.Object r0 = r11.get(r0)     // Catch:{ all -> 0x0504 }
            if (r0 != 0) goto L_0x0171
            X.1A1 r0 = r6.A0G     // Catch:{ all -> 0x0504 }
            X.3T1 r0 = r0.A01(r5, r1)     // Catch:{ all -> 0x0504 }
            if (r0 == 0) goto L_0x016b
        L_0x0165:
            int r2 = r2 + 1
            r4.add(r0)     // Catch:{ all -> 0x0504 }
            goto L_0x0105
        L_0x016b:
            java.lang.String r0 = "EphemeralUpdateRunnable/failed to get message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0504 }
            goto L_0x0105
        L_0x0171:
            r21 = 2
            goto L_0x0105
        L_0x0174:
            if (r10 <= 0) goto L_0x019e
            X.0wN r11 = r6.A0C     // Catch:{ all -> 0x0504 }
            java.lang.String r1 = "EphemeralUpdateRunnable/processMessages/null_jid"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0504 }
            r12.<init>()     // Catch:{ all -> 0x0504 }
            java.lang.String r0 = "count: "
            r12.append(r0)     // Catch:{ all -> 0x0504 }
            r12.append(r10)     // Catch:{ all -> 0x0504 }
            java.lang.String r0 = "; type: "
            r12.append(r0)     // Catch:{ all -> 0x0504 }
            r12.append(r8)     // Catch:{ all -> 0x0504 }
            java.lang.String r0 = "; foundMsg: "
            r12.append(r0)     // Catch:{ all -> 0x0504 }
            r12.append(r9)     // Catch:{ all -> 0x0504 }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x0504 }
            r11.A0E(r1, r0, r3)     // Catch:{ all -> 0x0504 }
        L_0x019e:
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0504 }
            if (r0 != 0) goto L_0x04fc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0504 }
            r1.<init>()     // Catch:{ all -> 0x0504 }
            java.lang.String r0 = "EphemeralUpdateRunnable/performJobAction: jobType:"
            r1.append(r0)     // Catch:{ all -> 0x0504 }
            r1.append(r8)     // Catch:{ all -> 0x0504 }
            java.lang.String r0 = " num:"
            r1.append(r0)     // Catch:{ all -> 0x0504 }
            int r0 = r4.size()     // Catch:{ all -> 0x0504 }
            r1.append(r0)     // Catch:{ all -> 0x0504 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0504 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0504 }
            if (r25 == 0) goto L_0x04f5
            r0 = 1
            if (r8 == r0) goto L_0x04fc
            r0 = 2
            if (r8 == r0) goto L_0x0423
            r0 = 3
            if (r8 == r0) goto L_0x041c
            X.1Jd r8 = r6.A09     // Catch:{ all -> 0x0504 }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0504 }
            if (r0 != 0) goto L_0x0354
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0504 }
            r10.<init>()     // Catch:{ all -> 0x0504 }
            r9 = 0
        L_0x01dd:
            int r0 = r4.size()     // Catch:{ all -> 0x0504 }
            if (r9 >= r0) goto L_0x01f6
            int r1 = r9 + 100
            int r0 = r4.size()     // Catch:{ all -> 0x0504 }
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x0504 }
            java.util.List r0 = r4.subList(r9, r0)     // Catch:{ all -> 0x0504 }
            r10.add(r0)     // Catch:{ all -> 0x0504 }
            r9 = r1
            goto L_0x01dd
        L_0x01f6:
            java.util.Iterator r18 = r10.iterator()     // Catch:{ all -> 0x0504 }
        L_0x01fa:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x0504 }
            if (r0 == 0) goto L_0x0354
            java.lang.Object r0 = r18.next()     // Catch:{ all -> 0x0504 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0504 }
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ all -> 0x0504 }
            r12.<init>()     // Catch:{ all -> 0x0504 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x0504 }
        L_0x020f:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0504 }
            if (r0 == 0) goto L_0x0225
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x0504 }
            X.3T1 r9 = (X.AnonymousClass3T1) r9     // Catch:{ all -> 0x0504 }
            long r0 = r9.A1N     // Catch:{ all -> 0x0504 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0504 }
            r12.put(r0, r9)     // Catch:{ all -> 0x0504 }
            goto L_0x020f
        L_0x0225:
            X.0x8 r9 = r8.A0I     // Catch:{ all -> 0x0504 }
            java.util.Set r17 = r12.keySet()     // Catch:{ all -> 0x0504 }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ all -> 0x0504 }
            r10.<init>()     // Catch:{ all -> 0x0504 }
            int r0 = r17.size()     // Catch:{ all -> 0x0504 }
            int r0 = r0 + 1
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ all -> 0x0504 }
            java.util.Iterator r16 = r17.iterator()     // Catch:{ all -> 0x0504 }
            r11 = 0
        L_0x023d:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0504 }
            if (r0 == 0) goto L_0x0257
            java.lang.Object r0 = r16.next()     // Catch:{ all -> 0x0504 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0504 }
            long r14 = r0.longValue()     // Catch:{ all -> 0x0504 }
            int r1 = r11 + 1
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0504 }
            r13[r11] = r0     // Catch:{ all -> 0x0504 }
            r11 = r1
            goto L_0x023d
        L_0x0257:
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch:{ all -> 0x0504 }
            r13[r11] = r0     // Catch:{ all -> 0x0504 }
            X.12P r0 = r9.A03     // Catch:{ all -> 0x0504 }
            X.1M0 r11 = r0.get()     // Catch:{ all -> 0x0504 }
            X.14e r9 = r11.A02     // Catch:{ all -> 0x034e }
            int r14 = r17.size()     // Catch:{ all -> 0x034e }
            java.lang.String r0 = X.AnonymousClass3TN.A01     // Catch:{ all -> 0x034e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x034e }
            r1.<init>()     // Catch:{ all -> 0x034e }
            java.lang.String r0 = " WHERE parent_message_row_id IN "
            r1.append(r0)     // Catch:{ all -> 0x034e }
            java.lang.String r0 = X.AnonymousClass1M2.A00(r14)     // Catch:{ all -> 0x034e }
            r1.append(r0)     // Catch:{ all -> 0x034e }
            java.lang.String r0 = " AND "
            r1.append(r0)     // Catch:{ all -> 0x034e }
            java.lang.String r0 = "(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)"
            r1.append(r0)     // Catch:{ all -> 0x034e }
            java.lang.String r14 = r1.toString()     // Catch:{ all -> 0x034e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x034e }
            r1.<init>()     // Catch:{ all -> 0x034e }
            java.lang.String r0 = "SELECT parent_message_row_id, message_add_on_type,  COUNT(1) as 'count' FROM message_add_on"
            r1.append(r0)     // Catch:{ all -> 0x034e }
            r1.append(r14)     // Catch:{ all -> 0x034e }
            java.lang.String r0 = " GROUP BY parent_message_row_id, message_add_on_type HAVING count>0"
            r1.append(r0)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x034e }
            java.lang.String r0 = "GET_MESSAGE_ADDON_TYPES_PER_PARENT_MESSAGE"
            android.database.Cursor r13 = r9.A09(r1, r0, r13)     // Catch:{ all -> 0x034e }
            java.lang.String r0 = "parent_message_row_id"
            int r14 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0342 }
            java.lang.String r0 = "message_add_on_type"
            int r9 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0342 }
        L_0x02b2:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x0342 }
            if (r0 == 0) goto L_0x02fb
            long r0 = r13.getLong(r14)     // Catch:{ all -> 0x0342 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0342 }
            int r15 = r13.getInt(r9)     // Catch:{ all -> 0x0342 }
            X.3yT r0 = new X.3yT     // Catch:{ all -> 0x0342 }
            r0.<init>()     // Catch:{ all -> 0x0342 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0342 }
            boolean r0 = r0.containsKey(r15)     // Catch:{ all -> 0x0342 }
            if (r0 == 0) goto L_0x02b2
            X.3yT r0 = new X.3yT     // Catch:{ all -> 0x0342 }
            r0.<init>()     // Catch:{ all -> 0x0342 }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ all -> 0x0342 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0342 }
            int r15 = r0.intValue()     // Catch:{ all -> 0x0342 }
            boolean r0 = r10.containsKey(r1)     // Catch:{ all -> 0x0342 }
            if (r0 == 0) goto L_0x02f3
            java.lang.Object r0 = r10.get(r1)     // Catch:{ all -> 0x0342 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0342 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0342 }
            r15 = r15 | r0
        L_0x02f3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0342 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0342 }
            goto L_0x02b2
        L_0x02fb:
            r13.close()     // Catch:{ all -> 0x034e }
            r11.close()     // Catch:{ all -> 0x0504 }
            java.util.Set r0 = r12.entrySet()     // Catch:{ all -> 0x0504 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x0504 }
        L_0x0309:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0504 }
            if (r0 == 0) goto L_0x01fa
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x0504 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0504 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0504 }
            java.lang.Object r9 = r0.getValue()     // Catch:{ all -> 0x0504 }
            X.3T1 r9 = (X.AnonymousClass3T1) r9     // Catch:{ all -> 0x0504 }
            int r11 = r9.A08     // Catch:{ all -> 0x0504 }
            boolean r0 = r10.containsKey(r1)     // Catch:{ all -> 0x0504 }
            if (r0 == 0) goto L_0x0340
            java.lang.Object r0 = r10.get(r1)     // Catch:{ all -> 0x0504 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0504 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0504 }
        L_0x0331:
            int r0 = ~r0     // Catch:{ all -> 0x0504 }
            int r1 = r9.A08     // Catch:{ all -> 0x0504 }
            int r0 = ~r0     // Catch:{ all -> 0x0504 }
            r0 = r0 & r1
            r9.A08 = r0     // Catch:{ all -> 0x0504 }
            if (r11 == r0) goto L_0x0309
            X.0xM r0 = r8.A07     // Catch:{ all -> 0x0504 }
            r0.A0j(r9)     // Catch:{ all -> 0x0504 }
            goto L_0x0309
        L_0x0340:
            r0 = 0
            goto L_0x0331
        L_0x0342:
            r1 = move-exception
            if (r13 == 0) goto L_0x034d
            r13.close()     // Catch:{ all -> 0x0349 }
            goto L_0x034d
        L_0x0349:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x034e }
        L_0x034d:
            throw r1     // Catch:{ all -> 0x034e }
        L_0x034e:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x04f0 }
            goto L_0x04f4
        L_0x0354:
            X.0x8 r11 = r6.A0A     // Catch:{ all -> 0x0504 }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0504 }
            if (r0 != 0) goto L_0x03e8
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0504 }
            r9.<init>()     // Catch:{ all -> 0x0504 }
            r8 = 0
        L_0x0362:
            int r0 = r4.size()     // Catch:{ all -> 0x0504 }
            if (r8 >= r0) goto L_0x037b
            int r1 = r8 + 100
            int r0 = r4.size()     // Catch:{ all -> 0x0504 }
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x0504 }
            java.util.List r0 = r4.subList(r8, r0)     // Catch:{ all -> 0x0504 }
            r9.add(r0)     // Catch:{ all -> 0x0504 }
            r8 = r1
            goto L_0x0362
        L_0x037b:
            java.util.Iterator r15 = r9.iterator()     // Catch:{ all -> 0x0504 }
        L_0x037f:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0504 }
            if (r0 == 0) goto L_0x03e8
            java.lang.Object r8 = r15.next()     // Catch:{ all -> 0x0504 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x0504 }
            X.12P r0 = r11.A03     // Catch:{ all -> 0x0504 }
            X.1M0 r10 = r0.A05()     // Catch:{ all -> 0x0504 }
            int r0 = r8.size()     // Catch:{ all -> 0x03e2 }
            r14 = 1
            int r0 = r0 + 1
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x03e2 }
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch:{ all -> 0x03e2 }
            r9[r3] = r0     // Catch:{ all -> 0x03e2 }
            java.util.Iterator r13 = r8.iterator()     // Catch:{ all -> 0x03e2 }
        L_0x03a4:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x03e2 }
            if (r0 == 0) goto L_0x03bc
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x03e2 }
            X.3T1 r0 = (X.AnonymousClass3T1) r0     // Catch:{ all -> 0x03e2 }
            int r12 = r14 + 1
            long r0 = r0.A1N     // Catch:{ all -> 0x03e2 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x03e2 }
            r9[r14] = r0     // Catch:{ all -> 0x03e2 }
            r14 = r12
            goto L_0x03a4
        L_0x03bc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03e2 }
            r1.<init>()     // Catch:{ all -> 0x03e2 }
            java.lang.String r0 = "message_add_on.expiry_timestamp <= ? AND message_add_on.expiry_timestamp != 0 AND message_add_on.expiry_timestamp is not null AND parent_message_row_id IN "
            r1.append(r0)     // Catch:{ all -> 0x03e2 }
            int r0 = r8.size()     // Catch:{ all -> 0x03e2 }
            java.lang.String r0 = X.AnonymousClass1M2.A00(r0)     // Catch:{ all -> 0x03e2 }
            r1.append(r0)     // Catch:{ all -> 0x03e2 }
            java.lang.String r12 = r1.toString()     // Catch:{ all -> 0x03e2 }
            X.14e r8 = r10.A02     // Catch:{ all -> 0x03e2 }
            java.lang.String r1 = "message_add_on"
            java.lang.String r0 = "MessageAddOnStore/deleteExpiredMessageAddOn"
            r8.A03(r1, r12, r0, r9)     // Catch:{ all -> 0x03e2 }
            r10.close()     // Catch:{ all -> 0x0504 }
            goto L_0x037f
        L_0x03e2:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x04f0 }
            goto L_0x04f4
        L_0x03e8:
            X.0xM r8 = r6.A02     // Catch:{ all -> 0x0504 }
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x0504 }
            r6.<init>()     // Catch:{ all -> 0x0504 }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x0504 }
        L_0x03f3:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0504 }
            if (r0 == 0) goto L_0x040c
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0504 }
            X.3T1 r0 = (X.AnonymousClass3T1) r0     // Catch:{ all -> 0x0504 }
            X.3Qa r1 = r0.A1J     // Catch:{ all -> 0x0504 }
            X.11F r0 = r1.A00     // Catch:{ all -> 0x0504 }
            r6.add(r0)     // Catch:{ all -> 0x0504 }
            X.176 r0 = r8.A0W     // Catch:{ all -> 0x0504 }
            r0.A0C(r1)     // Catch:{ all -> 0x0504 }
            goto L_0x03f3
        L_0x040c:
            X.1DQ r0 = r8.A0T     // Catch:{ all -> 0x0504 }
            android.os.Handler r3 = r0.A01     // Catch:{ all -> 0x0504 }
            r1 = 46
            X.1j5 r0 = new X.1j5     // Catch:{ all -> 0x0504 }
            r0.<init>(r8, r6, r1)     // Catch:{ all -> 0x0504 }
            r3.post(r0)     // Catch:{ all -> 0x0504 }
            goto L_0x04fc
        L_0x041c:
            X.0xM r0 = r6.A02     // Catch:{ all -> 0x0504 }
            r0.A0w(r4)     // Catch:{ all -> 0x0504 }
            goto L_0x04fc
        L_0x0423:
            X.1QI r10 = r6.A08     // Catch:{ all -> 0x0504 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0504 }
            r1.<init>()     // Catch:{ all -> 0x0504 }
            java.lang.String r0 = "ViewOnceMessageStore/expireMessages/"
            r1.append(r0)     // Catch:{ all -> 0x0504 }
            int r0 = r4.size()     // Catch:{ all -> 0x0504 }
            r1.append(r0)     // Catch:{ all -> 0x0504 }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x0504 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0504 }
            X.14g r9 = new X.14g     // Catch:{ all -> 0x0504 }
            r9.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0504 }
            X.12P r0 = r10.A00     // Catch:{ all -> 0x0504 }
            X.1M0 r14 = r0.A05()     // Catch:{ all -> 0x0504 }
            X.71s r13 = r14.B1k()     // Catch:{ all -> 0x04eb }
            java.util.Iterator r12 = r4.iterator()     // Catch:{ all -> 0x04e1 }
        L_0x0452:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x04e1 }
            if (r0 == 0) goto L_0x0494
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x04e1 }
            X.3T1 r11 = (X.AnonymousClass3T1) r11     // Catch:{ all -> 0x04e1 }
            int r3 = r3 + 1
            boolean r0 = r11 instanceof X.AnonymousClass4TX     // Catch:{ all -> 0x04e1 }
            if (r0 == 0) goto L_0x0479
            X.4TX r11 = (X.AnonymousClass4TX) r11     // Catch:{ all -> 0x04e1 }
            X.3T1 r11 = (X.AnonymousClass3T1) r11     // Catch:{ all -> 0x04e1 }
            r0 = 2
            r8 = r11
            X.4TX r8 = (X.AnonymousClass4TX) r8     // Catch:{ all -> 0x04e1 }
            r8.Bsk(r0)     // Catch:{ all -> 0x04e1 }
            long r0 = r11.A1N     // Catch:{ all -> 0x04e1 }
            int r8 = r8.BJ8()     // Catch:{ all -> 0x04e1 }
            X.AnonymousClass1QI.A00(r10, r8, r0)     // Catch:{ all -> 0x04e1 }
            goto L_0x0452
        L_0x0479:
            r8 = 2
            long r0 = r11.A1N     // Catch:{ all -> 0x04e1 }
            X.AnonymousClass1QI.A00(r10, r8, r0)     // Catch:{ all -> 0x04e1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04e1 }
            r1.<init>()     // Catch:{ all -> 0x04e1 }
            java.lang.String r0 = "ViewOnceMessageStore/expireMessages/updating state of non view-once message: "
            r1.append(r0)     // Catch:{ all -> 0x04e1 }
            r1.append(r11)     // Catch:{ all -> 0x04e1 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04e1 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04e1 }
            goto L_0x0452
        L_0x0494:
            r13.A00()     // Catch:{ all -> 0x04e1 }
            java.lang.String r0 = "success"
            r9.A02(r0)     // Catch:{ all -> 0x04e1 }
            r13.close()     // Catch:{ all -> 0x04eb }
            r14.close()     // Catch:{ all -> 0x0504 }
            r9.A01()     // Catch:{ all -> 0x0504 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0504 }
            r1.<init>()     // Catch:{ all -> 0x0504 }
            java.lang.String r0 = "ViewOnceMessageStore/expireMessages numExpired:"
            r1.append(r0)     // Catch:{ all -> 0x0504 }
            r1.append(r3)     // Catch:{ all -> 0x0504 }
            java.lang.String r0 = " numTotal:"
            r1.append(r0)     // Catch:{ all -> 0x0504 }
            int r0 = r4.size()     // Catch:{ all -> 0x0504 }
            r1.append(r0)     // Catch:{ all -> 0x0504 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0504 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0504 }
            X.0xM r0 = r6.A02     // Catch:{ all -> 0x0504 }
            r0.A0w(r4)     // Catch:{ all -> 0x0504 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0504 }
        L_0x04ce:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0504 }
            if (r0 == 0) goto L_0x04fc
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x0504 }
            X.3T1 r3 = (X.AnonymousClass3T1) r3     // Catch:{ all -> 0x0504 }
            X.1DQ r1 = r6.A05     // Catch:{ all -> 0x0504 }
            r0 = -1
            r1.A01(r3, r0)     // Catch:{ all -> 0x0504 }
            goto L_0x04ce
        L_0x04e1:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x04e6 }
            goto L_0x04ea
        L_0x04e6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x04eb }
        L_0x04ea:
            throw r1     // Catch:{ all -> 0x04eb }
        L_0x04eb:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x04f0 }
            goto L_0x04f4
        L_0x04f0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0504 }
        L_0x04f4:
            throw r1     // Catch:{ all -> 0x0504 }
        L_0x04f5:
            X.0xM r1 = r6.A02     // Catch:{ all -> 0x0504 }
            r0 = 29
            r1.A0v(r4, r0)     // Catch:{ all -> 0x0504 }
        L_0x04fc:
            if (r2 != r7) goto L_0x0500
            r21 = 1
        L_0x0500:
            r5.close()
            return r21
        L_0x0504:
            r1 = move-exception
            if (r5 == 0) goto L_0x0514
            r5.close()     // Catch:{ all -> 0x0510 }
            throw r1
        L_0x050b:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0510 }
            throw r1
        L_0x0510:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0514:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QM.A00(long, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:0x028d, code lost:
        if (r11 == null) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02cf, code lost:
        if (r7 != null) goto L_0x02d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0294  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r19 = this;
            java.lang.String r0 = "EphemeralUpdateRunnable/run"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.14g r5 = new X.14g
            r5.<init>((java.lang.String) r0)
            r4 = r19
            X.0wo r6 = r4.A01
            long r0 = X.C19970wo.A00(r6)
            r2 = 0
            int r9 = r4.A00(r0, r2)
            r2 = 2
            int r8 = r4.A00(r0, r2)
            r2 = 3
            int r7 = r4.A00(r0, r2)
            r2 = 4
            int r3 = r4.A00(r0, r2)
            r15 = 0
            r2 = 1
            if (r9 == r2) goto L_0x027d
            if (r7 == r2) goto L_0x027d
            if (r8 == r2) goto L_0x027d
            if (r3 == r2) goto L_0x027d
            if (r9 != 0) goto L_0x028f
            if (r7 != 0) goto L_0x028f
            if (r8 != 0) goto L_0x028f
            if (r3 != 0) goto L_0x028f
            long r7 = r4.A00
            int r2 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r2 == 0) goto L_0x004e
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r7
            long r7 = r9.toDays(r2)
            int r2 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x0181
        L_0x004e:
            r12 = 100
            java.lang.String r2 = "EphemeralUpdateRunnable/deleteSharedSecrets"
            X.14g r10 = new X.14g
            r10.<init>((java.lang.String) r2)
        L_0x0057:
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            X.1QJ r9 = r4.A06
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            r2 = 1
            X.12P r3 = r9.A00     // Catch:{ Exception -> 0x00b3 }
            X.1M0 r13 = r3.get()     // Catch:{ Exception -> 0x00b3 }
            X.14e r8 = r13.A02     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = "SELECT message_row_id FROM message_broadcast_ephemeral ORDER BY message_row_id LIMIT ?"
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x00a9 }
            r17 = 0
            java.lang.String r2 = java.lang.Integer.toString(r12)     // Catch:{ all -> 0x00a9 }
            r3[r17] = r2     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = "GET_ALL_MESSAGE_ROW_ID"
            android.database.Cursor r7 = r8.A09(r7, r2, r3)     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = "message_row_id"
            int r3 = r7.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x009d }
        L_0x0084:
            boolean r2 = r7.moveToNext()     // Catch:{ all -> 0x009d }
            if (r2 == 0) goto L_0x0096
            long r17 = r7.getLong(r3)     // Catch:{ all -> 0x009d }
            java.lang.Long r2 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x009d }
            r14.add(r2)     // Catch:{ all -> 0x009d }
            goto L_0x0084
        L_0x0096:
            r7.close()     // Catch:{ all -> 0x00a9 }
            r13.close()     // Catch:{ Exception -> 0x00b3 }
            goto L_0x00c8
        L_0x009d:
            r3 = move-exception
            if (r7 == 0) goto L_0x00a8
            r7.close()     // Catch:{ all -> 0x00a4 }
            goto L_0x00a8
        L_0x00a4:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ all -> 0x00a9 }
        L_0x00a8:
            throw r3     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r3 = move-exception
            r13.close()     // Catch:{ all -> 0x00ae }
            goto L_0x00b2
        L_0x00ae:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ Exception -> 0x00b3 }
        L_0x00b2:
            throw r3     // Catch:{ Exception -> 0x00b3 }
        L_0x00b3:
            r7 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "Unable to get message_row_id from message_broadcast_ephemeral batchSize="
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.e(r2, r7)
        L_0x00c8:
            java.util.Iterator r18 = r14.iterator()
        L_0x00cc:
            boolean r2 = r18.hasNext()
            if (r2 == 0) goto L_0x0129
            java.lang.Object r8 = r18.next()
            java.lang.Number r8 = (java.lang.Number) r8
            X.1FN r7 = r4.A07
            long r2 = r8.longValue()
            X.1FK r7 = r7.A01
            r13 = 0
            X.31b r2 = X.AnonymousClass1FK.A00(r7, r13, r2)
            java.util.concurrent.ConcurrentHashMap r2 = r2.A00
            java.util.Set r2 = r2.entrySet()
            X.AnonymousClass00C.A08(r2)
            java.util.Iterator r17 = r2.iterator()
        L_0x00f2:
            boolean r2 = r17.hasNext()
            if (r2 == 0) goto L_0x0121
            java.lang.Object r2 = r17.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r14 = r2.getKey()
            com.whatsapp.jid.DeviceJid r14 = (com.whatsapp.jid.DeviceJid) r14
            java.lang.Object r13 = r2.getValue()
            X.3CX r13 = (X.AnonymousClass3CX) r13
            X.0wQ r3 = r7.A00
            com.whatsapp.jid.UserJid r2 = r14.userJid
            boolean r2 = r3.A0M(r2)
            if (r2 == 0) goto L_0x00f2
            int r2 = r14.getDevice()
            if (r2 == 0) goto L_0x00f2
            long r2 = r13.A00
            int r13 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r13 <= 0) goto L_0x00cc
            goto L_0x00f2
        L_0x0121:
            java.lang.String r2 = java.lang.String.valueOf(r8)
            r11.add(r2)
            goto L_0x00cc
        L_0x0129:
            boolean r2 = r11.isEmpty()
            if (r2 != 0) goto L_0x0178
            X.12P r2 = r9.A00     // Catch:{ Exception -> 0x016f }
            X.1M0 r8 = r2.A05()     // Catch:{ Exception -> 0x016f }
            X.14e r13 = r8.A02     // Catch:{ all -> 0x0165 }
            java.lang.String r9 = "message_broadcast_ephemeral"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0165 }
            r3.<init>()     // Catch:{ all -> 0x0165 }
            java.lang.String r2 = "message_row_id IN "
            r3.append(r2)     // Catch:{ all -> 0x0165 }
            int r2 = r11.size()     // Catch:{ all -> 0x0165 }
            java.lang.String r2 = X.AnonymousClass1M2.A00(r2)     // Catch:{ all -> 0x0165 }
            r3.append(r2)     // Catch:{ all -> 0x0165 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0165 }
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x0165 }
            java.lang.Object[] r3 = r11.toArray(r2)     // Catch:{ all -> 0x0165 }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ all -> 0x0165 }
            java.lang.String r2 = "deleteSharedSecretByMessageRowIds"
            int r2 = r13.A03(r9, r7, r2, r3)     // Catch:{ all -> 0x0165 }
            r8.close()     // Catch:{ Exception -> 0x016f }
            goto L_0x0176
        L_0x0165:
            r3 = move-exception
            r8.close()     // Catch:{ all -> 0x016a }
            goto L_0x016e
        L_0x016a:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ Exception -> 0x016f }
        L_0x016e:
            throw r3     // Catch:{ Exception -> 0x016f }
        L_0x016f:
            r3 = move-exception
            java.lang.String r2 = "Unable to delete shared secrets"
            com.whatsapp.util.Log.e(r2, r3)
            goto L_0x0178
        L_0x0176:
            if (r2 == r12) goto L_0x0057
        L_0x0178:
            r10.A01()
            long r2 = java.lang.System.nanoTime()
            r4.A00 = r2
        L_0x0181:
            X.17S r2 = r4.A03
            X.12P r2 = r2.A04
            X.1M0 r3 = r2.get()
            X.14e r10 = r3.A02     // Catch:{ all -> 0x0273 }
            java.lang.String r8 = "SELECT expire_timestamp FROM message_ephemeral WHERE expire_timestamp >= ? AND keep_in_chat != 1 ORDER BY expire_timestamp LIMIT 1"
            r2 = 1
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch:{ all -> 0x0273 }
            r2 = 0
            java.lang.String r12 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0273 }
            r7[r2] = r12     // Catch:{ all -> 0x0273 }
            java.lang.String r9 = "GET_EPHEMERAL_NEXT_EXPIRE_TIMESTAMP_SQL"
            android.database.Cursor r10 = r10.A09(r8, r9, r7)     // Catch:{ all -> 0x0273 }
            boolean r2 = r10.moveToNext()     // Catch:{ all -> 0x0267 }
            if (r2 == 0) goto L_0x01b5
            java.lang.String r2 = "expire_timestamp"
            int r2 = r10.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0267 }
            long r7 = r10.getLong(r2)     // Catch:{ all -> 0x0267 }
            java.lang.Long r11 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0267 }
            r10.close()     // Catch:{ all -> 0x0273 }
            goto L_0x01bd
        L_0x01b5:
            r10.close()     // Catch:{ all -> 0x0273 }
            r3.close()
            r11 = 0
            goto L_0x01c0
        L_0x01bd:
            r3.close()
        L_0x01c0:
            X.1QI r8 = r4.A08
            X.17Z r2 = X.AnonymousClass17Z.$redex_init_class
            r2 = 1209600000(0x48190800, double:5.97621805E-315)
            long r0 = r0 - r2
            X.12P r2 = r8.A00
            X.1M0 r7 = r2.get()
            X.14e r10 = r7.A02     // Catch:{ all -> 0x0262 }
            X.0yC r8 = r8.A01     // Catch:{ all -> 0x0262 }
            r3 = 6261(0x1875, float:8.774E-42)
            X.0yV r2 = X.C21000yV.A02     // Catch:{ all -> 0x0262 }
            boolean r2 = X.C20800yB.A01(r2, r8, r3)     // Catch:{ all -> 0x0262 }
            if (r2 == 0) goto L_0x01ed
            java.lang.String r8 = "SELECT message_view.timestamp AS timestamp FROM message_view_once_media view_once  JOIN available_message_view message_view  WHERE view_once.message_row_id=message_view._id AND message_view.timestamp > ?  AND view_once.state = 0 ORDER BY message_view.timestamp ASC  LIMIT 1"
        L_0x01de:
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x0262 }
            r2 = 0
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0262 }
            r3[r2] = r0     // Catch:{ all -> 0x0262 }
            android.database.Cursor r9 = r10.A09(r8, r9, r3)     // Catch:{ all -> 0x0262 }
            goto L_0x01f0
        L_0x01ed:
            java.lang.String r8 = "SELECT message_view.timestamp AS timestamp FROM message_view_once_media view_once  JOIN available_message_view message_view  ON view_once.message_row_id=message_view._id WHERE message_view.timestamp > ?  AND view_once.state = 0 ORDER BY message_view.timestamp ASC  LIMIT 1"
            goto L_0x01de
        L_0x01f0:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0256 }
            if (r0 == 0) goto L_0x020c
            java.lang.String r0 = "timestamp"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0256 }
            long r2 = r9.getLong(r0)     // Catch:{ all -> 0x0256 }
            r0 = 1209600000(0x48190800, double:5.97621805E-315)
            long r2 = r2 + r0
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0256 }
            r9.close()     // Catch:{ all -> 0x0262 }
            goto L_0x0214
        L_0x020c:
            r9.close()     // Catch:{ all -> 0x0262 }
            r7.close()
            r8 = 0
            goto L_0x0217
        L_0x0214:
            r7.close()
        L_0x0217:
            X.0x8 r0 = r4.A0A
            X.12P r0 = r0.A03
            X.1M0 r3 = r0.get()
            X.14e r7 = r3.A02     // Catch:{ all -> 0x0273 }
            java.lang.String r2 = "SELECT expiry_timestamp FROM message_add_on WHERE expiry_timestamp > ? ORDER BY expiry_timestamp LIMIT 1"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0273 }
            r0 = 0
            r1[r0] = r12     // Catch:{ all -> 0x0273 }
            java.lang.String r0 = "GET_MESSAGE_ADD_ON_NEXT_EXPIRE_TIMESTAMP_SQL"
            android.database.Cursor r2 = r7.A09(r2, r0, r1)     // Catch:{ all -> 0x0273 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x024f }
            if (r0 == 0) goto L_0x0247
            java.lang.String r0 = "expiry_timestamp"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x024f }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x024f }
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x024f }
            r2.close()     // Catch:{ all -> 0x0273 }
            goto L_0x0282
        L_0x0247:
            r2.close()     // Catch:{ all -> 0x0273 }
            r3.close()
            r7 = 0
            goto L_0x0285
        L_0x024f:
            r1 = move-exception
            if (r2 == 0) goto L_0x0272
            r2.close()     // Catch:{ all -> 0x026e }
            goto L_0x0272
        L_0x0256:
            r1 = move-exception
            if (r9 == 0) goto L_0x0261
            r9.close()     // Catch:{ all -> 0x025d }
            goto L_0x0261
        L_0x025d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0262 }
        L_0x0261:
            throw r1     // Catch:{ all -> 0x0262 }
        L_0x0262:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0278 }
            throw r1
        L_0x0267:
            r1 = move-exception
            if (r10 == 0) goto L_0x0272
            r10.close()     // Catch:{ all -> 0x026e }
            goto L_0x0272
        L_0x026e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0273 }
        L_0x0272:
            throw r1     // Catch:{ all -> 0x0273 }
        L_0x0273:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0278 }
            throw r1
        L_0x0278:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x027d:
            java.lang.Long r6 = java.lang.Long.valueOf(r15)
            goto L_0x0290
        L_0x0282:
            r3.close()
        L_0x0285:
            if (r11 != 0) goto L_0x02e3
            r11 = r8
            if (r8 != 0) goto L_0x028b
            r11 = 0
        L_0x028b:
            if (r7 != 0) goto L_0x02bc
            if (r11 != 0) goto L_0x02d1
        L_0x028f:
            r6 = 0
        L_0x0290:
            X.1QL r2 = r4.A0E
            if (r2 == 0) goto L_0x02b8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "EphemeralUpdateRunnable/timeToNextRun: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1QH r3 = r2.A00
            if (r6 == 0) goto L_0x02b8
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r3.A0A
            r1 = 10
            X.1j7 r0 = new X.1j7
            r0.<init>(r3, r6, r1)
            r2.execute(r0)
        L_0x02b8:
            r5.A01()
            return
        L_0x02bc:
            if (r11 == 0) goto L_0x02ce
            long r2 = r7.longValue()
            long r0 = r11.longValue()
            long r0 = java.lang.Math.min(r2, r0)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L_0x02ce:
            r11 = r7
            if (r7 == 0) goto L_0x028f
        L_0x02d1:
            long r2 = r11.longValue()
            long r0 = X.C19970wo.A00(r6)
            long r2 = r2 - r0
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x027d
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            goto L_0x0290
        L_0x02e3:
            if (r8 == 0) goto L_0x028b
            long r2 = r11.longValue()
            long r0 = r8.longValue()
            long r0 = java.lang.Math.min(r2, r0)
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            goto L_0x028b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QM.run():void");
    }

    public AnonymousClass1QM(C19700wN r3, C19970wo r4, AnonymousClass163 r5, C20310xM r6, AnonymousClass17S r7, AnonymousClass1A4 r8, AnonymousClass1QL r9, AnonymousClass1DQ r10, AnonymousClass1QJ r11, AnonymousClass1FN r12, AnonymousClass1QI r13, C26171Jd r14, C20170x8 r15, C20810yC r16, AnonymousClass1A1 r17, int i) {
        this.A01 = r4;
        this.A0F = r16;
        this.A0D = r5;
        this.A0C = r3;
        this.A05 = r10;
        this.A02 = r6;
        this.A0G = r17;
        this.A0A = r15;
        this.A09 = r14;
        this.A07 = r12;
        this.A08 = r13;
        this.A03 = r7;
        this.A04 = r8;
        this.A06 = r11;
        this.A0E = r9;
        this.A0B = i;
    }
}
