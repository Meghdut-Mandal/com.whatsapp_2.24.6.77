package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0x1  reason: invalid class name and case insensitive filesystem */
public final class C20100x1 implements AnonymousClass00M {
    public final AnonymousClass1WR A00;
    public final AnonymousClass17Y A01;
    public final C19730wQ A02;
    public final C27341Nv A03;
    public final AnonymousClass1NG A04;
    public final C27301Nr A05;
    public final C19970wo A06;
    public final C19420v0 A07;
    public final AnonymousClass1YZ A08;
    public final AnonymousClass1C4 A09;
    public final C24681Dj A0A;
    public final AnonymousClass1O8 A0B;
    public final Map A0C = new HashMap();

    public C20100x1(AnonymousClass1WR r2, AnonymousClass17Y r3, C19730wQ r4, C27341Nv r5, AnonymousClass1NG r6, C27301Nr r7, C19970wo r8, C19420v0 r9, AnonymousClass1YZ r10, AnonymousClass1C4 r11, C24681Dj r12, AnonymousClass1O8 r13) {
        AnonymousClass00C.A0D(r8, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r4, 4);
        AnonymousClass00C.A0D(r11, 5);
        AnonymousClass00C.A0D(r10, 6);
        AnonymousClass00C.A0D(r6, 7);
        AnonymousClass00C.A0D(r7, 8);
        AnonymousClass00C.A0D(r13, 9);
        AnonymousClass00C.A0D(r9, 10);
        AnonymousClass00C.A0D(r5, 11);
        AnonymousClass00C.A0D(r12, 12);
        this.A06 = r8;
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A09 = r11;
        this.A08 = r10;
        this.A04 = r6;
        this.A05 = r7;
        this.A0B = r13;
        this.A07 = r9;
        this.A03 = r5;
        this.A0A = r12;
    }

    private final boolean A00(int i, long j, boolean z) {
        long j2;
        if (z) {
            Map map = this.A0C;
            Integer valueOf = Integer.valueOf(i);
            if (map.containsKey(valueOf)) {
                Number number = (Number) map.get(valueOf);
                if (number != null) {
                    j2 = number.longValue();
                } else {
                    j2 = 0;
                }
                if (j - j2 > 60000) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        if (A00(1, r1, r6) == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (A00(2, r1, r6) == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a1, code lost:
        if (A00(3, r1, r6) == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ae, code lost:
        if (A00(4, r1, r6) == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bb, code lost:
        if (A00(5, r1, r6) == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c8, code lost:
        if (A00(7, r1, r6) == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f1, code lost:
        if ((r1 - r14) <= 14400000) goto L_0x00f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A01(X.C194049Nx r25, boolean r26, boolean r27, boolean r28) {
        /*
            r24 = this;
            r5 = r24
            monitor-enter(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02dc }
            r2.<init>()     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "AccountSyncManager/fetchAllAccountInfo/fetch account info: "
            r2.append(r0)     // Catch:{ all -> 0x02dc }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x02dc }
            r6.<init>()     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "AccountSyncRequest:"
            r6.append(r0)     // Catch:{ all -> 0x02dc }
            r4 = r25
            boolean r9 = r4.A06     // Catch:{ all -> 0x02dc }
            java.lang.String r1 = ""
            if (r9 == 0) goto L_0x0073
            java.lang.String r0 = "S"
        L_0x0021:
            r6.append(r0)     // Catch:{ all -> 0x02dc }
            boolean r12 = r4.A04     // Catch:{ all -> 0x02dc }
            if (r12 == 0) goto L_0x0071
            java.lang.String r0 = "Pi"
        L_0x002a:
            r6.append(r0)     // Catch:{ all -> 0x02dc }
            boolean r11 = r4.A05     // Catch:{ all -> 0x02dc }
            if (r11 == 0) goto L_0x006f
            java.lang.String r0 = "Pr"
        L_0x0033:
            r6.append(r0)     // Catch:{ all -> 0x02dc }
            boolean r13 = r4.A02     // Catch:{ all -> 0x02dc }
            if (r13 == 0) goto L_0x006d
            java.lang.String r0 = "D"
        L_0x003c:
            r6.append(r0)     // Catch:{ all -> 0x02dc }
            boolean r8 = r4.A01     // Catch:{ all -> 0x02dc }
            if (r8 == 0) goto L_0x006b
            java.lang.String r0 = "B"
        L_0x0045:
            r6.append(r0)     // Catch:{ all -> 0x02dc }
            boolean r3 = r4.A03     // Catch:{ all -> 0x02dc }
            if (r3 == 0) goto L_0x0069
            java.lang.String r0 = "N"
        L_0x004e:
            r6.append(r0)     // Catch:{ all -> 0x02dc }
            boolean r0 = r4.A07     // Catch:{ all -> 0x02dc }
            if (r0 == 0) goto L_0x0057
            java.lang.String r1 = "T"
        L_0x0057:
            r6.append(r1)     // Catch:{ all -> 0x02dc }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x02dc }
            r2.append(r1)     // Catch:{ all -> 0x02dc }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x02dc }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x02dc }
            goto L_0x0075
        L_0x0069:
            r0 = r1
            goto L_0x004e
        L_0x006b:
            r0 = r1
            goto L_0x0045
        L_0x006d:
            r0 = r1
            goto L_0x003c
        L_0x006f:
            r0 = r1
            goto L_0x0033
        L_0x0071:
            r0 = r1
            goto L_0x002a
        L_0x0073:
            r0 = r1
            goto L_0x0021
        L_0x0075:
            X.0wo r1 = r5.A06     // Catch:{ all -> 0x02da }
            long r1 = X.C19970wo.A00(r1)     // Catch:{ all -> 0x02da }
            r7 = 0
            r10 = 1
            r6 = r28
            if (r9 == 0) goto L_0x0089
            boolean r9 = r5.A00(r10, r1, r6)     // Catch:{ all -> 0x02da }
            r23 = 1
            if (r9 != 0) goto L_0x008b
        L_0x0089:
            r23 = 0
        L_0x008b:
            r9 = 2
            if (r12 == 0) goto L_0x0096
            boolean r12 = r5.A00(r9, r1, r6)     // Catch:{ all -> 0x02da }
            r22 = 1
            if (r12 != 0) goto L_0x0098
        L_0x0096:
            r22 = 0
        L_0x0098:
            r12 = 3
            if (r11 == 0) goto L_0x00a3
            boolean r11 = r5.A00(r12, r1, r6)     // Catch:{ all -> 0x02da }
            r21 = 1
            if (r11 != 0) goto L_0x00a5
        L_0x00a3:
            r21 = 0
        L_0x00a5:
            r11 = 4
            if (r8 == 0) goto L_0x00b0
            boolean r8 = r5.A00(r11, r1, r6)     // Catch:{ all -> 0x02da }
            r20 = 1
            if (r8 != 0) goto L_0x00b2
        L_0x00b0:
            r20 = 0
        L_0x00b2:
            r8 = 5
            if (r13 == 0) goto L_0x00bd
            boolean r13 = r5.A00(r8, r1, r6)     // Catch:{ all -> 0x02da }
            r19 = 1
            if (r13 != 0) goto L_0x00bf
        L_0x00bd:
            r19 = 0
        L_0x00bf:
            r13 = 7
            if (r0 == 0) goto L_0x00ca
            boolean r0 = r5.A00(r13, r1, r6)     // Catch:{ all -> 0x02da }
            r18 = 1
            if (r0 != 0) goto L_0x00cc
        L_0x00ca:
            r18 = 0
        L_0x00cc:
            if (r3 == 0) goto L_0x00f3
            java.util.Map r6 = r5.A0C     // Catch:{ all -> 0x02da }
            r0 = 6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02da }
            boolean r0 = r6.containsKey(r3)     // Catch:{ all -> 0x02da }
            if (r0 == 0) goto L_0x0108
            java.lang.Object r0 = r6.get(r3)     // Catch:{ all -> 0x02da }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x02da }
            if (r0 == 0) goto L_0x00e8
            long r14 = r0.longValue()     // Catch:{ all -> 0x02da }
            goto L_0x00ea
        L_0x00e8:
            r14 = 0
        L_0x00ea:
            long r16 = r1 - r14
            r14 = 14400000(0xdbba00, double:7.1145453E-317)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0108
        L_0x00f3:
            r16 = 0
        L_0x00f5:
            int r0 = r23 + r22
            int r0 = r0 + r21
            int r0 = r0 + r20
            int r0 = r0 + r19
            int r0 = r0 + r16
            int r0 = r0 + r18
            r3 = r26
            if (r0 != 0) goto L_0x0115
            if (r26 == 0) goto L_0x02d8
            goto L_0x010b
        L_0x0108:
            r16 = 1
            goto L_0x00f5
        L_0x010b:
            X.1C4 r2 = r5.A09     // Catch:{ all -> 0x02da }
            java.lang.String r1 = "account_sync"
            r0 = 0
            r2.A03(r1, r0)     // Catch:{ all -> 0x02da }
            goto L_0x02d8
        L_0x0115:
            X.0v0 r14 = r5.A07     // Catch:{ all -> 0x02da }
            X.3EB r6 = new X.3EB     // Catch:{ all -> 0x02da }
            r6.<init>(r14, r5, r0, r3)     // Catch:{ all -> 0x02da }
            if (r27 == 0) goto L_0x020b
            boolean r3 = r4.A00     // Catch:{ all -> 0x02da }
            if (r23 == 0) goto L_0x014f
            X.005 r0 = r14.A00     // Catch:{ all -> 0x02da }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x02da }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x02da }
            java.lang.String r4 = "account_sync_status_num_retries"
            int r0 = r0.getInt(r4, r7)     // Catch:{ all -> 0x02da }
            if (r3 != r10) goto L_0x0145
            int r0 = r0 - r10
            int r15 = java.lang.Math.max(r0, r7)     // Catch:{ all -> 0x02da }
            if (r15 != 0) goto L_0x0146
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r14)     // Catch:{ all -> 0x02da }
            android.content.SharedPreferences$Editor r0 = r0.remove(r4)     // Catch:{ all -> 0x02da }
        L_0x0141:
            r0.apply()     // Catch:{ all -> 0x02da }
            goto L_0x014f
        L_0x0145:
            r15 = 3
        L_0x0146:
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r14)     // Catch:{ all -> 0x02da }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r4, r15)     // Catch:{ all -> 0x02da }
            goto L_0x0141
        L_0x014f:
            if (r22 == 0) goto L_0x017e
            X.005 r0 = r14.A00     // Catch:{ all -> 0x02da }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x02da }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x02da }
            java.lang.String r4 = "account_sync_picture_num_retries"
            int r0 = r0.getInt(r4, r7)     // Catch:{ all -> 0x02da }
            if (r3 != r10) goto L_0x0174
            int r0 = r0 - r10
            int r15 = java.lang.Math.max(r0, r7)     // Catch:{ all -> 0x02da }
            if (r15 != 0) goto L_0x0175
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r14)     // Catch:{ all -> 0x02da }
            android.content.SharedPreferences$Editor r0 = r0.remove(r4)     // Catch:{ all -> 0x02da }
        L_0x0170:
            r0.apply()     // Catch:{ all -> 0x02da }
            goto L_0x017e
        L_0x0174:
            r15 = 3
        L_0x0175:
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r14)     // Catch:{ all -> 0x02da }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r4, r15)     // Catch:{ all -> 0x02da }
            goto L_0x0170
        L_0x017e:
            if (r21 == 0) goto L_0x01ad
            X.005 r0 = r14.A00     // Catch:{ all -> 0x02da }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x02da }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x02da }
            java.lang.String r4 = "account_sync_privacy_num_retries"
            int r0 = r0.getInt(r4, r7)     // Catch:{ all -> 0x02da }
            if (r3 != r10) goto L_0x01a3
            int r0 = r0 - r10
            int r15 = java.lang.Math.max(r0, r7)     // Catch:{ all -> 0x02da }
            if (r15 != 0) goto L_0x01a4
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r14)     // Catch:{ all -> 0x02da }
            android.content.SharedPreferences$Editor r0 = r0.remove(r4)     // Catch:{ all -> 0x02da }
        L_0x019f:
            r0.apply()     // Catch:{ all -> 0x02da }
            goto L_0x01ad
        L_0x01a3:
            r15 = 3
        L_0x01a4:
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r14)     // Catch:{ all -> 0x02da }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r4, r15)     // Catch:{ all -> 0x02da }
            goto L_0x019f
        L_0x01ad:
            if (r20 == 0) goto L_0x01dc
            X.005 r0 = r14.A00     // Catch:{ all -> 0x02da }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x02da }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x02da }
            java.lang.String r4 = "account_sync_blocklist_num_retries"
            int r0 = r0.getInt(r4, r7)     // Catch:{ all -> 0x02da }
            if (r3 != r10) goto L_0x01d2
            int r0 = r0 - r10
            int r15 = java.lang.Math.max(r0, r7)     // Catch:{ all -> 0x02da }
            if (r15 != 0) goto L_0x01d3
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r14)     // Catch:{ all -> 0x02da }
            android.content.SharedPreferences$Editor r0 = r0.remove(r4)     // Catch:{ all -> 0x02da }
        L_0x01ce:
            r0.apply()     // Catch:{ all -> 0x02da }
            goto L_0x01dc
        L_0x01d2:
            r15 = 3
        L_0x01d3:
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r14)     // Catch:{ all -> 0x02da }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r4, r15)     // Catch:{ all -> 0x02da }
            goto L_0x01ce
        L_0x01dc:
            if (r18 == 0) goto L_0x020b
            X.005 r0 = r14.A00     // Catch:{ all -> 0x02da }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x02da }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x02da }
            java.lang.String r4 = "account_sync_text_status_num_retries"
            int r0 = r0.getInt(r4, r7)     // Catch:{ all -> 0x02da }
            if (r3 != r10) goto L_0x0201
            int r0 = r0 - r10
            int r3 = java.lang.Math.max(r0, r7)     // Catch:{ all -> 0x02da }
            if (r3 != 0) goto L_0x0202
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r14)     // Catch:{ all -> 0x02da }
            android.content.SharedPreferences$Editor r0 = r0.remove(r4)     // Catch:{ all -> 0x02da }
        L_0x01fd:
            r0.apply()     // Catch:{ all -> 0x02da }
            goto L_0x020b
        L_0x0201:
            r3 = 3
        L_0x0202:
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r14)     // Catch:{ all -> 0x02da }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r4, r3)     // Catch:{ all -> 0x02da }
            goto L_0x01fd
        L_0x020b:
            if (r23 == 0) goto L_0x0224
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x02da }
            java.util.Map r3 = r5.A0C     // Catch:{ all -> 0x02da }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x02da }
            r3.put(r0, r4)     // Catch:{ all -> 0x02da }
            X.1WR r3 = r5.A00     // Catch:{ all -> 0x02da }
            X.3pw r0 = new X.3pw     // Catch:{ all -> 0x02da }
            r0.<init>(r6, r5)     // Catch:{ all -> 0x02da }
            r3.A01(r0)     // Catch:{ all -> 0x02da }
        L_0x0224:
            if (r18 == 0) goto L_0x0238
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x02da }
            java.util.Map r3 = r5.A0C     // Catch:{ all -> 0x02da }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x02da }
            r3.put(r0, r4)     // Catch:{ all -> 0x02da }
            X.1YZ r0 = r5.A08     // Catch:{ all -> 0x02da }
            r0.A03(r6)     // Catch:{ all -> 0x02da }
        L_0x0238:
            if (r22 == 0) goto L_0x0253
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x02da }
            java.util.Map r3 = r5.A0C     // Catch:{ all -> 0x02da }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x02da }
            r3.put(r0, r4)     // Catch:{ all -> 0x02da }
            X.1O8 r3 = r5.A0B     // Catch:{ all -> 0x02da }
            X.0wQ r0 = r5.A02     // Catch:{ all -> 0x02da }
            r0.A0G()     // Catch:{ all -> 0x02da }
            com.whatsapp.jid.PhoneUserJid r0 = r0.A03     // Catch:{ all -> 0x02da }
            r3.A03(r0, r6, r7, r10)     // Catch:{ all -> 0x02da }
        L_0x0253:
            if (r21 == 0) goto L_0x0267
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x02da }
            java.util.Map r3 = r5.A0C     // Catch:{ all -> 0x02da }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x02da }
            r3.put(r0, r4)     // Catch:{ all -> 0x02da }
            X.1Nv r0 = r5.A03     // Catch:{ all -> 0x02da }
            r0.A01(r6)     // Catch:{ all -> 0x02da }
        L_0x0267:
            if (r20 == 0) goto L_0x027b
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x02da }
            java.util.Map r3 = r5.A0C     // Catch:{ all -> 0x02da }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x02da }
            r3.put(r0, r4)     // Catch:{ all -> 0x02da }
            X.1NG r0 = r5.A04     // Catch:{ all -> 0x02da }
            r0.A0K(r6)     // Catch:{ all -> 0x02da }
        L_0x027b:
            if (r19 == 0) goto L_0x02a8
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x02da }
            java.util.Map r3 = r5.A0C     // Catch:{ all -> 0x02da }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x02da }
            r3.put(r0, r4)     // Catch:{ all -> 0x02da }
            X.1Nr r4 = r5.A05     // Catch:{ all -> 0x02da }
            com.whatsapp.jid.UserJid[] r3 = new com.whatsapp.jid.UserJid[r10]     // Catch:{ all -> 0x02da }
            X.0wQ r0 = r5.A02     // Catch:{ all -> 0x02da }
            r0.A0G()     // Catch:{ all -> 0x02da }
            com.whatsapp.jid.PhoneUserJid r0 = r0.A03     // Catch:{ all -> 0x02da }
            if (r0 == 0) goto L_0x02a0
            r3[r7] = r0     // Catch:{ all -> 0x02da }
            r4.A01(r3, r9)     // Catch:{ all -> 0x02da }
            r6.A00(r8)     // Catch:{ all -> 0x02da }
            goto L_0x02a8
        L_0x02a0:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02da }
            r0.<init>(r1)     // Catch:{ all -> 0x02da }
            throw r0     // Catch:{ all -> 0x02da }
        L_0x02a8:
            if (r16 == 0) goto L_0x02d8
            java.lang.Long r2 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x02da }
            java.util.Map r1 = r5.A0C     // Catch:{ all -> 0x02da }
            r4 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x02da }
            r1.put(r0, r2)     // Catch:{ all -> 0x02da }
            X.1Dj r3 = r5.A0A     // Catch:{ all -> 0x02da }
            X.0yC r2 = r3.A03     // Catch:{ all -> 0x02da }
            X.AnonymousClass00C.A0D(r2, r7)     // Catch:{ all -> 0x02da }
            r1 = 4779(0x12ab, float:6.697E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x02da }
            boolean r0 = X.C20800yB.A01(r0, r2, r1)     // Catch:{ all -> 0x02da }
            if (r0 == 0) goto L_0x02d5
            X.0wU r2 = r3.A09     // Catch:{ all -> 0x02da }
            r1 = 9
            X.1jA r0 = new X.1jA     // Catch:{ all -> 0x02da }
            r0.<init>((java.lang.Object) r3, (int) r1)     // Catch:{ all -> 0x02da }
            r2.Boy(r0)     // Catch:{ all -> 0x02da }
        L_0x02d5:
            r6.A00(r4)     // Catch:{ all -> 0x02da }
        L_0x02d8:
            monitor-exit(r5)
            return
        L_0x02da:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x02dc }
        L_0x02dc:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20100x1.A01(X.9Nx, boolean, boolean, boolean):void");
    }
}
