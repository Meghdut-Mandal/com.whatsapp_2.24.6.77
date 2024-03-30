package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.18k  reason: invalid class name and case insensitive filesystem */
public final class C234218k {
    public final C232417s A00;
    public final C19970wo A01;
    public final C233918h A02;
    public final AnonymousClass18I A03;
    public final AnonymousClass18M A04;
    public final C20810yC A05;
    public final AnonymousClass187 A06;

    public C234218k(C232417s r2, C19970wo r3, C233918h r4, AnonymousClass187 r5, AnonymousClass18I r6, AnonymousClass18M r7, C20810yC r8) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r8, 2);
        AnonymousClass00C.A0D(r6, 3);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r7, 5);
        AnonymousClass00C.A0D(r2, 6);
        AnonymousClass00C.A0D(r4, 7);
        this.A01 = r3;
        this.A05 = r8;
        this.A03 = r6;
        this.A06 = r5;
        this.A04 = r7;
        this.A00 = r2;
        this.A02 = r4;
    }

    public static final String[] A02(AnonymousClass6EU r4, Long l) {
        if (l == null) {
            return r4.A00();
        }
        String str = r4.A01;
        AnonymousClass00C.A08(str);
        AnonymousClass6EZ r2 = r4.A00;
        return new String[]{str, l.toString(), String.valueOf(r2.A01), String.valueOf(r2.A00)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b1, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A07(X.AnonymousClass6EU r11, boolean r12) {
        /*
            r10 = this;
            r5 = 0
            if (r12 != 0) goto L_0x000b
            X.6EZ r0 = r11.A00
            int r1 = r0.A01
            r0 = 1
            if (r1 != r0) goto L_0x000b
            return r5
        L_0x000b:
            X.18I r0 = r10.A03
            X.79X r3 = X.AnonymousClass18I.A01(r0, r11)
            r3.lock()
            java.lang.String r4 = r11.A01     // Catch:{ all -> 0x00ae }
            X.AnonymousClass00C.A08(r4)     // Catch:{ all -> 0x00ae }
            X.13q r0 = X.AnonymousClass11F.A00     // Catch:{ 0wR -> 0x0095 }
            com.whatsapp.jid.Jid r7 = X.C222513o.A00(r4)     // Catch:{ 0wR -> 0x0095 }
            boolean r0 = r7 instanceof X.AnonymousClass144     // Catch:{ 0wR -> 0x0095 }
            if (r0 == 0) goto L_0x008f
            X.144 r7 = (X.AnonymousClass144) r7     // Catch:{ 0wR -> 0x0095 }
            if (r7 == 0) goto L_0x008f
            java.lang.Long r9 = r10.A00(r11)     // Catch:{ all -> 0x00ae }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ae }
            r1.<init>()     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "SignalSenderKeyStore/removeSenderKey/"
            r1.append(r0)     // Catch:{ all -> 0x00ae }
            r1.append(r11)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ae }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ae }
            X.18M r0 = r10.A04     // Catch:{ all -> 0x00ae }
            X.1M0 r6 = r0.A04()     // Catch:{ all -> 0x00ae }
            X.14e r8 = r6.A02     // Catch:{ all -> 0x0088 }
            java.lang.String r5 = "sender_keys"
            if (r9 == 0) goto L_0x005c
            java.lang.String r4 = "group_id = ? AND sender_lid_identifier = ? AND sender_type = ? AND device_id = ?"
        L_0x004d:
            java.lang.String[] r2 = A02(r11, r9)     // Catch:{ all -> 0x0088 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0088 }
            r1.<init>()     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "SignalSenderKeyStore/removeSenderKey"
            r1.append(r0)     // Catch:{ all -> 0x0088 }
            goto L_0x005f
        L_0x005c:
            java.lang.String r4 = "group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?"
            goto L_0x004d
        L_0x005f:
            if (r9 == 0) goto L_0x0064
            java.lang.String r0 = "_lid_identifier"
            goto L_0x0066
        L_0x0064:
            java.lang.String r0 = ""
        L_0x0066:
            r1.append(r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0088 }
            int r0 = r8.A03(r5, r4, r0, r2)     // Catch:{ all -> 0x0088 }
            r2 = 0
            if (r0 <= 0) goto L_0x0075
            r2 = 1
        L_0x0075:
            r6.close()     // Catch:{ all -> 0x00ae }
            X.17s r0 = r10.A00     // Catch:{ all -> 0x00ae }
            X.3CH r1 = new X.3CH     // Catch:{ all -> 0x00ae }
            r1.<init>(r7)     // Catch:{ all -> 0x00ae }
            X.17t r0 = r0.A01     // Catch:{ all -> 0x00ae }
            r0.A01(r1)     // Catch:{ all -> 0x00ae }
            r3.close()
            return r2
        L_0x0088:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x00ae }
            throw r0     // Catch:{ all -> 0x00ae }
        L_0x008f:
            X.0wR r0 = new X.0wR     // Catch:{ 0wR -> 0x0095 }
            r0.<init>((java.lang.String) r4)     // Catch:{ 0wR -> 0x0095 }
            throw r0     // Catch:{ 0wR -> 0x0095 }
        L_0x0095:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ae }
            r1.<init>()     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "SignalSenderKeyStore/removesenderkey/invalidgroupid "
            r1.append(r0)     // Catch:{ all -> 0x00ae }
            r1.append(r4)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ae }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x00ae }
            r3.close()
            return r5
        L_0x00ae:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234218k.A07(X.6EU, boolean):boolean");
    }

    private final Long A00(AnonymousClass6EU r6) {
        C233918h r4 = this.A02;
        String str = r6.A01;
        C234018i r2 = r4.A01;
        if (r2.A00.A0O(GroupJid.Companion.A02(str))) {
            return null;
        }
        AnonymousClass6EZ r3 = r6.A00;
        AnonymousClass00C.A08(r3);
        if (C20800yB.A01(C21000yV.A02, this.A05, 6486)) {
            return r4.A00(r3, 4);
        }
        return null;
    }

    public static final String A01(Long l, String str, boolean z) {
        String str2;
        String str3;
        if (l != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("sender_lid_identifier = ? AND sender_type = ? AND device_id = ? AND group_id");
            if (z) {
                str3 = " = '";
            } else {
                str3 = " != '";
            }
            sb.append(str3);
            sb.append(str);
            sb.append("' AND timestamp < ?");
            String obj = sb.toString();
            if (obj != null) {
                return obj;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sender_id = ? AND sender_type = ? AND device_id = ? AND group_id");
        if (z) {
            str2 = " = '";
        } else {
            str2 = " != '";
        }
        sb2.append(str2);
        sb2.append(str);
        sb2.append("' AND timestamp < ?");
        return sb2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass9HA A03(X.AnonymousClass6EU r16) {
        /*
            r15 = this;
            java.lang.String r1 = "timestamp"
            java.lang.String r5 = "record"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "SignalSenderKeyStore/getSenderKey/"
            r2.append(r0)
            r3 = r16
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Long r4 = r15.A00(r3)
            X.18M r0 = r15.A04
            X.1M0 r2 = r0.get()
            X.14e r6 = r2.A02     // Catch:{ all -> 0x0086 }
            java.lang.String r7 = "sender_keys"
            java.lang.String[] r8 = new java.lang.String[]{r5, r1}     // Catch:{ all -> 0x0086 }
            if (r4 == 0) goto L_0x0040
            java.lang.String r9 = "group_id = ? AND sender_lid_identifier = ? AND sender_type = ? AND device_id = ?"
        L_0x0030:
            java.lang.String[] r10 = A02(r3, r4)     // Catch:{ all -> 0x0086 }
            r11 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            r3.<init>()     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = "SignalSenderKeyStore/getSenderKey"
            r3.append(r0)     // Catch:{ all -> 0x0086 }
            goto L_0x0043
        L_0x0040:
            java.lang.String r9 = "group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?"
            goto L_0x0030
        L_0x0043:
            if (r4 == 0) goto L_0x0048
            java.lang.String r0 = "_lid_identifier"
            goto L_0x004a
        L_0x0048:
            java.lang.String r0 = ""
        L_0x004a:
            r3.append(r0)     // Catch:{ all -> 0x0086 }
            java.lang.String r14 = r3.toString()     // Catch:{ all -> 0x0086 }
            r13 = r11
            r12 = r11
            android.database.Cursor r4 = r6.A0A(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0086 }
            if (r4 == 0) goto L_0x0082
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0077
            int r0 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x007b }
            byte[] r3 = r4.getBlob(r0)     // Catch:{ all -> 0x007b }
            X.AnonymousClass00C.A08(r3)     // Catch:{ all -> 0x007b }
            int r0 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x007b }
            long r0 = r4.getLong(r0)     // Catch:{ all -> 0x007b }
            X.9HA r11 = new X.9HA     // Catch:{ all -> 0x007b }
            r11.<init>(r3, r0)     // Catch:{ all -> 0x007b }
        L_0x0077:
            r4.close()     // Catch:{ all -> 0x0086 }
            goto L_0x0082
        L_0x007b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007d }
        L_0x007d:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x0086 }
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x0082:
            r2.close()
            return r11
        L_0x0086:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234218k.A03(X.6EU):X.9HA");
    }

    public C197269bP A04(C1268866a r4) {
        this.A06.A00();
        C18740tg.A06(r4);
        AnonymousClass9HA A032 = A03(new AnonymousClass6EU(AnonymousClass6R2.A00(r4.A01), r4.A00));
        if (A032 != null) {
            return new C197269bP(A032.A01);
        }
        try {
            return new C197269bP();
        } catch (IOException e) {
            Log.w("axolotl ioexception while reading sender key record", e);
            return new C197269bP();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00de, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e6, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e9, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.AnonymousClass6EU r20, byte[] r21) {
        /*
            r19 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SignalSenderKeyStore/saveSenderKey/"
            r1.append(r0)
            r7 = r20
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = r19
            X.18M r0 = r1.A04
            X.1M0 r4 = r0.A04()
            X.71s r5 = r4.B1k()     // Catch:{ all -> 0x00e3 }
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ all -> 0x00dc }
            r14.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.Long r6 = r1.A00(r7)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "record"
            r2 = r21
            r14.put(r0, r2)     // Catch:{ all -> 0x00dc }
            X.0wo r0 = r1.A01     // Catch:{ all -> 0x00dc }
            long r11 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x00dc }
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0     // Catch:{ all -> 0x00dc }
            long r11 = r11 / r0
            X.14e r13 = r4.A02     // Catch:{ all -> 0x00dc }
            java.lang.String r15 = "sender_keys"
            if (r6 == 0) goto L_0x0053
            java.lang.String r16 = "group_id = ? AND sender_lid_identifier = ? AND sender_type = ? AND device_id = ?"
        L_0x0044:
            java.lang.String[] r18 = A02(r7, r6)     // Catch:{ all -> 0x00dc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r1.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "SignalSenderKeyStore/saveSenderKeyUpdate"
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            goto L_0x0056
        L_0x0053:
            java.lang.String r16 = "group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?"
            goto L_0x0044
        L_0x0056:
            java.lang.String r3 = "_lid_identifier"
            java.lang.String r10 = ""
            r0 = r10
            if (r6 == 0) goto L_0x005e
            r0 = r3
        L_0x005e:
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r17 = r1.toString()     // Catch:{ all -> 0x00dc }
            int r0 = r13.A01(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00dc }
            long r1 = (long) r0     // Catch:{ all -> 0x00dc }
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00be
            java.lang.String r1 = "group_id"
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x00dc }
            r14.put(r1, r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r1 = "sender_id"
            X.6EZ r2 = r7.A00     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = r2.A02     // Catch:{ all -> 0x00dc }
            r14.put(r1, r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r1 = "sender_type"
            int r0 = r2.A01     // Catch:{ all -> 0x00dc }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00dc }
            r14.put(r1, r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r1 = "device_id"
            int r0 = r2.A00     // Catch:{ all -> 0x00dc }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00dc }
            r14.put(r1, r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r1 = "timestamp"
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x00dc }
            r14.put(r1, r0)     // Catch:{ all -> 0x00dc }
            if (r6 == 0) goto L_0x00a6
            java.lang.String r0 = "sender_lid_identifier"
            r14.put(r0, r6)     // Catch:{ all -> 0x00dc }
        L_0x00a6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r1.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "SignalSenderKeyStore/saveSenderKey"
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            if (r6 != 0) goto L_0x00b3
            r3 = r10
        L_0x00b3:
            r1.append(r3)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00dc }
            long r1 = r13.A05(r15, r0, r14)     // Catch:{ all -> 0x00dc }
        L_0x00be:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r3.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "SignalSenderKeyStore/saveSenderKey/result/"
            r3.append(r0)     // Catch:{ all -> 0x00dc }
            r3.append(r1)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00dc }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00dc }
            r5.A00()     // Catch:{ all -> 0x00dc }
            r5.close()     // Catch:{ all -> 0x00e3 }
            r4.close()
            return
        L_0x00dc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00de }
        L_0x00de:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x00e3 }
            throw r0     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e5 }
        L_0x00e5:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234218k.A05(X.6EU, byte[]):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("signalsenderkeystore/storesenderkey/invalidgroupid ");
        r1.append(r3);
        com.whatsapp.util.Log.w(r1.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x007e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C1268866a r8, X.C197269bP r9) {
        /*
            r7 = this;
            X.6Aq r0 = r8.A01
            X.6EZ r1 = X.AnonymousClass6R2.A00(r0)
            java.lang.String r0 = r8.A00
            X.6EU r5 = new X.6EU
            r5.<init>(r1, r0)
            X.8Nd r0 = X.C172258Nd.DEFAULT_INSTANCE
            X.8NN r6 = r0.A0p()
            java.util.LinkedList r0 = r9.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x0019:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r4.next()
            X.9f6 r0 = (X.C199309f6) r0
            X.8Qu r3 = r0.A00
            r6.A0S()
            X.8Hz r2 = r6.A00
            X.8Nd r2 = (X.C172258Nd) r2
            r3.getClass()
            X.B6c r1 = r2.senderKeyStates_
            r0 = r1
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0040
            X.B6c r1 = X.C170918Hz.A0A(r1)
            r2.senderKeyStates_ = r1
        L_0x0040:
            r1.add(r3)
            goto L_0x0019
        L_0x0044:
            X.8Hz r0 = r6.A0R()
            byte[] r1 = r0.A0o()
            X.18I r0 = r7.A03
            X.79X r4 = X.AnonymousClass18I.A01(r0, r5)
            r4.lock()
            java.lang.String r3 = r5.A01     // Catch:{ all -> 0x0096 }
            X.AnonymousClass00C.A08(r3)     // Catch:{ all -> 0x0096 }
            X.13q r0 = X.AnonymousClass11F.A00     // Catch:{ 0wR -> 0x007e }
            com.whatsapp.jid.Jid r2 = X.C222513o.A00(r3)     // Catch:{ 0wR -> 0x007e }
            boolean r0 = r2 instanceof X.AnonymousClass144     // Catch:{ 0wR -> 0x007e }
            if (r0 == 0) goto L_0x0078
            X.144 r2 = (X.AnonymousClass144) r2     // Catch:{ 0wR -> 0x007e }
            if (r2 == 0) goto L_0x0078
            r7.A05(r5, r1)     // Catch:{ all -> 0x0096 }
            X.17s r0 = r7.A00     // Catch:{ all -> 0x0096 }
            X.3CH r1 = new X.3CH     // Catch:{ all -> 0x0096 }
            r1.<init>(r2)     // Catch:{ all -> 0x0096 }
            X.17t r0 = r0.A01     // Catch:{ all -> 0x0096 }
            r0.A01(r1)     // Catch:{ all -> 0x0096 }
            goto L_0x0092
        L_0x0078:
            X.0wR r0 = new X.0wR     // Catch:{ 0wR -> 0x007e }
            r0.<init>((java.lang.String) r3)     // Catch:{ 0wR -> 0x007e }
            throw r0     // Catch:{ 0wR -> 0x007e }
        L_0x007e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r1.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "signalsenderkeystore/storesenderkey/invalidgroupid "
            r1.append(r0)     // Catch:{ all -> 0x0096 }
            r1.append(r3)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0096 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0096 }
        L_0x0092:
            r4.close()
            return
        L_0x0096:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234218k.A06(X.66a, X.9bP):void");
    }
}
