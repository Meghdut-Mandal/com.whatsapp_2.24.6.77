package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1iX  reason: invalid class name and case insensitive filesystem */
public class C35341iX implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C35341iX(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.A04 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A00 = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: X.2T7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: X.2Qq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v90, resolved type: X.2T7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v91, resolved type: X.2T7} */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03dc, code lost:
        if (r8.A1N != r9) goto L_0x03df;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0423  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.A04
            switch(r0) {
                case 0: goto L_0x0394;
                case 1: goto L_0x0308;
                case 2: goto L_0x02d2;
                case 3: goto L_0x0230;
                case 4: goto L_0x020a;
                case 5: goto L_0x01f3;
                case 6: goto L_0x01e1;
                case 7: goto L_0x01cd;
                case 8: goto L_0x0198;
                case 9: goto L_0x0186;
                case 10: goto L_0x014d;
                case 11: goto L_0x013b;
                case 12: goto L_0x00a3;
                case 13: goto L_0x0072;
                case 14: goto L_0x0371;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r14.A01
            X.1Q0 r6 = (X.AnonymousClass1Q0) r6
            java.lang.Object r7 = r14.A02
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r4 = r14.A03
            android.net.Uri r4 = (android.net.Uri) r4
            int r3 = r14.A00
            r5 = 0
            java.lang.Boolean r0 = r6.A03     // Catch:{ Exception -> 0x0054 }
            if (r0 != 0) goto L_0x0028
            X.0yC r2 = r6.A05     // Catch:{ Exception -> 0x0054 }
            r1 = 6832(0x1ab0, float:9.574E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ Exception -> 0x0054 }
            boolean r0 = X.C20800yB.A01(r0, r2, r1)     // Catch:{ Exception -> 0x0054 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0054 }
            r6.A03 = r0     // Catch:{ Exception -> 0x0054 }
        L_0x0028:
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0054 }
            if (r0 == 0) goto L_0x003a
            X.005 r0 = r6.A02     // Catch:{ Exception -> 0x0054 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0054 }
            X.19W r0 = (X.AnonymousClass19W) r0     // Catch:{ Exception -> 0x0054 }
            android.os.Looper r5 = r0.A00()     // Catch:{ Exception -> 0x0054 }
        L_0x003a:
            X.5LV r1 = new X.5LV     // Catch:{ Exception -> 0x0054 }
            r1.<init>(r5, r3)     // Catch:{ Exception -> 0x0054 }
            android.media.MediaPlayer r0 = r1.A01     // Catch:{ Exception -> 0x0054 }
            r0.setDataSource(r7, r4)     // Catch:{ Exception -> 0x0054 }
            r1.A05()     // Catch:{ Exception -> 0x0054 }
            r1.A08()     // Catch:{ Exception -> 0x0054 }
            X.6Tw r0 = r6.A01     // Catch:{ Exception -> 0x0054 }
            if (r0 == 0) goto L_0x0051
            r0.A06()     // Catch:{ Exception -> 0x0054 }
        L_0x0051:
            r6.A01 = r1     // Catch:{ Exception -> 0x0054 }
            return
        L_0x0054:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "asyncaudioplayer/play/e Error playing URI: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " with stream: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w(r0, r2)
            return
        L_0x0072:
            java.lang.Object r4 = r14.A01
            X.1JR r4 = (X.AnonymousClass1JR) r4
            java.lang.Object r0 = r14.A02
            int r1 = r14.A00
            java.lang.Object r3 = r14.A03
            X.0u5 r3 = (X.C18950u5) r3
            X.2P3 r2 = new X.2P3
            r2.<init>()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r2.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A00 = r0
            X.18T r0 = r4.A01
            java.lang.Long r0 = r0.A00()
            r2.A01 = r0
            X.0yW r1 = r4.A00
            int r0 = r3.A00
            r1.Blz(r2, r0)
            return
        L_0x00a3:
            java.lang.Object r5 = r14.A01
            X.1a4 r5 = (X.C30351a4) r5
            java.lang.Object r4 = r14.A02
            X.11F r4 = (X.AnonymousClass11F) r4
            java.lang.Object r7 = r14.A03
            com.whatsapp.jid.Jid r7 = (com.whatsapp.jid.Jid) r7
            int r8 = r14.A00
            X.1Nx r6 = r5.A0C
            java.util.HashMap r0 = r6.A04
            java.lang.Object r3 = r0.get(r4)
            X.3A3 r3 = (X.AnonymousClass3A3) r3
            if (r3 != 0) goto L_0x00c5
            X.3A3 r3 = new X.3A3
            r3.<init>()
            r0.put(r4, r3)
        L_0x00c5:
            if (r7 == 0) goto L_0x00f2
            boolean r0 = X.AnonymousClass143.A0G(r4)
            if (r0 == 0) goto L_0x00f2
            java.util.HashMap r0 = r3.A05
            if (r0 != 0) goto L_0x00d8
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.A05 = r0
        L_0x00d8:
            java.lang.Object r2 = r0.get(r7)
            X.35E r2 = (X.AnonymousClass35E) r2
            if (r2 != 0) goto L_0x00ea
            X.35E r2 = new X.35E
            r2.<init>()
            java.util.HashMap r0 = r3.A05
            r0.put(r7, r2)
        L_0x00ea:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A01 = r0
            r2.A00 = r8
        L_0x00f2:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.A03 = r0
            r3.A00 = r8
            if (r7 != 0) goto L_0x0123
            java.lang.String r2 = r4.getRawString()
        L_0x0100:
            java.util.HashMap r1 = r6.A03
            java.lang.Object r3 = r1.get(r2)
            X.1j3 r3 = (X.C35661j3) r3
            if (r3 != 0) goto L_0x0113
            r0 = 0
            X.1j3 r3 = new X.1j3
            r3.<init>(r6, r4, r7, r0)
            r1.put(r2, r3)
        L_0x0113:
            android.os.Handler r2 = r6.A00
            r2.removeCallbacks(r3)
            r0 = 25000(0x61a8, double:1.23516E-319)
            r2.postDelayed(r3, r0)
            X.1Cd r0 = r5.A04
            r0.A00(r4)
            return
        L_0x0123:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r4.getRawString()
            r1.append(r0)
            java.lang.String r0 = r7.getRawString()
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            goto L_0x0100
        L_0x013b:
            java.lang.Object r3 = r14.A01
            X.1Wo r3 = (X.C29421Wo) r3
            int r2 = r14.A00
            java.lang.Object r1 = r14.A02
            X.9nx r1 = (X.C203399nx) r1
            java.lang.Object r0 = r14.A03
            X.9uj r0 = (X.C207209uj) r0
            X.C29421Wo.A00(r3, r1, r0, r2)
            return
        L_0x014d:
            java.lang.Object r0 = r14.A01
            X.1ST r0 = (X.AnonymousClass1ST) r0
            java.lang.Object r3 = r14.A02
            X.2bU r3 = (X.AnonymousClass2bU) r3
            java.lang.Object r2 = r14.A03
            X.3Qj r2 = (X.C65013Qj) r2
            int r1 = r14.A00
            X.1BS r4 = r0.A0L
            X.1Gl r0 = X.AnonymousClass6Y1.A02(r3)
            java.lang.String r5 = r0.A02
            java.lang.String r6 = r3.A03
            java.lang.String r7 = r2.A0J
            r8 = 1
            if (r1 != 0) goto L_0x016b
            r8 = 2
        L_0x016b:
            r0 = 1
            X.C18740tg.A0C(r0)
            X.0yC r2 = r4.A08
            r1 = 15
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 != 0) goto L_0x0393
            X.0wU r0 = r4.A0G
            X.73X r3 = new X.73X
            r3.<init>(r4, r5, r6, r7, r8)
            r0.Boy(r3)
            return
        L_0x0186:
            java.lang.Object r3 = r14.A01
            X.1ST r3 = (X.AnonymousClass1ST) r3
            java.lang.Object r2 = r14.A02
            X.2bU r2 = (X.AnonymousClass2bU) r2
            int r1 = r14.A00
            java.lang.Object r0 = r14.A03
            X.7kT r0 = (X.C160107kT) r0
            X.AnonymousClass1ST.A00(r0, r3, r2, r1)
            return
        L_0x0198:
            java.lang.Object r7 = r14.A01
            X.1D0 r7 = (X.AnonymousClass1D0) r7
            java.lang.Object r6 = r14.A02
            X.6vi r6 = (X.C146506vi) r6
            int r5 = r14.A00
            java.lang.Object r4 = r14.A03
            X.6Pj r4 = (X.C131516Pj) r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaJobManager/enqueueUploading/responseCallback Streaming upload failed, enqueue a new upload for media job "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0yW r3 = r7.A04
            X.6Wa r2 = r6.A0N
            int r1 = r6.A01
            X.0yC r0 = r7.A03
            X.590 r0 = r2.A04(r0, r5, r1)
            r3.Bly(r0)
            r7.A0D(r6, r4)
            return
        L_0x01cd:
            java.lang.Object r3 = r14.A01
            X.1CH r3 = (X.AnonymousClass1CH) r3
            java.lang.Object r2 = r14.A02
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            int r0 = r14.A00
            java.lang.Object r1 = r14.A03
            X.34i r1 = (X.C595434i) r1
            int r0 = r0 + 1
            r3.A02(r1, r2, r0)
            return
        L_0x01e1:
            java.lang.Object r3 = r14.A01
            X.1Sb r3 = (X.C28291Sb) r3
            java.lang.Object r2 = r14.A02
            X.3Qa r2 = (X.C64933Qa) r2
            int r1 = r14.A00
            java.lang.Object r0 = r14.A03
            X.0Sj r0 = (X.C06120Sj) r0
            r3.A03(r0, r2, r1)
            return
        L_0x01f3:
            java.lang.Object r0 = r14.A01
            X.0xM r0 = (X.C20310xM) r0
            java.lang.Object r3 = r14.A02
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            int r2 = r14.A00
            java.lang.Object r1 = r14.A03
            java.util.concurrent.CountDownLatch r1 = (java.util.concurrent.CountDownLatch) r1
            X.16J r0 = r0.A0Z
            r0.A03(r3, r2)
            r1.countDown()
            return
        L_0x020a:
            java.lang.Object r0 = r14.A01
            X.0wB r0 = (X.C19580wB) r0
            java.lang.Object r4 = r14.A02
            X.11F r4 = (X.AnonymousClass11F) r4
            java.lang.Object r3 = r14.A03
            java.util.Collection r3 = (java.util.Collection) r3
            int r2 = r14.A00
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x0220:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0393
            java.lang.Object r0 = r1.next()
            X.1JB r0 = (X.AnonymousClass1JB) r0
            r0.BQK(r4, r3, r2)
            goto L_0x0220
        L_0x0230:
            java.lang.Object r6 = r14.A01
            X.1YG r6 = (X.AnonymousClass1YG) r6
            java.lang.Object r2 = r14.A02
            X.11F r2 = (X.AnonymousClass11F) r2
            java.lang.Object r4 = r14.A03
            X.3QA r4 = (X.AnonymousClass3QA) r4
            int r1 = r14.A00
            X.16D r0 = r6.A00
            X.141 r3 = r0.A0D(r2)
            X.2Qq r0 = new X.2Qq
            r0.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.A01 = r1
            java.lang.String r1 = r4.A00
            r0.A03 = r1
            X.1KU r2 = r6.A05
            X.11F r1 = r3.A0H
            java.lang.String r1 = r2.A00(r1)
            r0.A04 = r1
            boolean r1 = r4.A02
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.A00 = r1
            X.1YF r1 = r6.A02
            X.0v0 r5 = r1.A01
            java.lang.String r7 = "pref_ctwa_customer_logging_counter_timestamp"
            long r3 = r5.A0V(r7)
            X.0wo r8 = r1.A00
            long r1 = X.C19970wo.A00(r8)
            long r1 = r1 - r3
            float r3 = (float) r1
            r1 = 1285868416(0x4ca4cb80, float:8.64E7)
            float r3 = r3 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0297
            long r1 = X.C19970wo.A00(r8)
            r5.A1h(r7, r1)
            r1 = 0
            android.content.SharedPreferences$Editor r4 = X.C19420v0.A00(r5)
            java.lang.String r3 = "pref_ctwa_customer_logging_counter"
            android.content.SharedPreferences$Editor r1 = r4.putLong(r3, r1)
            r1.apply()
        L_0x0297:
            X.005 r4 = r5.A00
            java.lang.Object r3 = r4.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r9 = "pref_ctwa_customer_logging_counter"
            r1 = 0
            long r1 = r3.getLong(r9, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.A02 = r1
            java.lang.Object r3 = r4.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            r1 = 0
            long r3 = r3.getLong(r9, r1)
            long r1 = X.C19970wo.A00(r8)
            r5.A1h(r7, r1)
            r1 = 1
            long r3 = r3 + r1
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r5)
            android.content.SharedPreferences$Editor r1 = r1.putLong(r9, r3)
            r1.apply()
            X.0yW r1 = r6.A04
            goto L_0x0499
        L_0x02d2:
            java.lang.Object r8 = r14.A01
            X.1ci r8 = (X.C31951ci) r8
            int r9 = r14.A00
            java.lang.Object r7 = r14.A02
            java.lang.Object r6 = r14.A03
            com.whatsapp.conversationslist.ConversationsFragment r5 = r8.A0N
            android.content.Context r0 = r5.A0a()
            android.content.res.Resources r4 = r0.getResources()
            r3 = 2131755024(0x7f100010, float:1.9140916E38)
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0 = 0
            r2[r0] = r1
            java.lang.String r3 = r4.getQuantityString(r3, r9, r2)
            r0 = 2131895190(0x7f122396, float:1.9425206E38)
            java.lang.String r2 = r5.A0n(r0)
            r1 = 2
            X.1iD r0 = new X.1iD
            r0.<init>(r8, r7, r6, r1)
            r5.A1q(r3, r2, r0)
            return
        L_0x0308:
            java.lang.Object r4 = r14.A01
            X.1JC r4 = (X.AnonymousClass1JC) r4
            java.lang.Object r3 = r14.A02
            X.11F r3 = (X.AnonymousClass11F) r3
            int r2 = r14.A00
            java.lang.Object r1 = r14.A03
            java.util.Collection r1 = (java.util.Collection) r1
            X.1Hr r0 = r4.A03
            r0.A03(r3, r1, r2)
            X.1JN r0 = r4.A00
            r0.A03(r1)
            X.005 r0 = r4.A08
            java.lang.Object r3 = r0.get()
            X.1az r3 = (X.C30921az) r3
            if (r1 == 0) goto L_0x0393
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r1.iterator()
        L_0x0333:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x034f
            java.lang.Object r2 = r4.next()
            r0 = r2
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.3Hb r0 = r0.A0Q()
            r1 = 1
            if (r0 == 0) goto L_0x0333
            boolean r0 = r0.A00
            if (r0 != r1) goto L_0x0333
            r5.add(r2)
            goto L_0x0333
        L_0x034f:
            java.util.Iterator r1 = r5.iterator()
        L_0x0353:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0393
            java.lang.Object r0 = r1.next()
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.1b3 r5 = r3.A06
            X.3Qa r0 = r0.A1J
            X.11F r4 = r0.A00
            if (r4 == 0) goto L_0x0353
            r6 = 0
            r11 = 6
            r8 = r6
            r9 = r6
            r10 = r6
            r7 = r6
            X.C30961b3.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0353
        L_0x0371:
            java.lang.Object r4 = r14.A01
            X.1dz r4 = (X.C32661dz) r4
            java.lang.Object r3 = r14.A02
            X.2Qb r3 = (X.C45102Qb) r3
            int r2 = r14.A00
            java.lang.Object r1 = r14.A03
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)
            X.C32661dz.A00(r3, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.A01 = r0
            r3.A00 = r1
            X.0yW r0 = r4.A00
            r0.Bly(r3)
        L_0x0393:
            return
        L_0x0394:
            java.lang.Object r6 = r14.A01
            X.1DT r6 = (X.AnonymousClass1DT) r6
            java.lang.Object r0 = r14.A02
            X.2T7 r0 = (X.AnonymousClass2T7) r0
            java.lang.Object r8 = r14.A03
            X.3T1 r8 = (X.AnonymousClass3T1) r8
            int r7 = r14.A00
            int r1 = X.C131896Re.A00()
            long r1 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.A0S = r1
            java.lang.Boolean r1 = r0.A0A
            boolean r1 = r1.booleanValue()
            r13 = 0
            if (r1 != 0) goto L_0x03df
            X.3Qa r1 = r8.A1J
            X.11F r5 = r1.A00
            boolean r1 = X.AnonymousClass143.A0G(r5)
            if (r1 == 0) goto L_0x03e5
            android.util.LruCache r4 = r6.A00
            java.lang.Object r1 = r4.get(r5)
            r11 = -1
            if (r1 == 0) goto L_0x044e
            java.lang.Object r1 = r4.get(r5)
            java.lang.Number r1 = (java.lang.Number) r1
            long r9 = r1.longValue()
        L_0x03d4:
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 == 0) goto L_0x03de
            long r2 = r8.A1N
            int r1 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x03df
        L_0x03de:
            r13 = 1
        L_0x03df:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            r0.A09 = r1
        L_0x03e5:
            java.lang.Boolean r1 = r0.A0A
            if (r1 == 0) goto L_0x03ef
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0411
        L_0x03ef:
            java.lang.Boolean r1 = r0.A09
            if (r1 == 0) goto L_0x03f9
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0411
        L_0x03f9:
            java.lang.Boolean r1 = r0.A01
            if (r1 == 0) goto L_0x0417
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0417
            java.lang.Long r1 = r0.A0P
            if (r1 == 0) goto L_0x0417
            long r4 = r1.longValue()
            r2 = 50
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0417
        L_0x0411:
            X.0yW r1 = r6.A0E
            r1.Blw(r0)
            return
        L_0x0417:
            X.0yC r3 = r6.A0D
            r2 = 1861(0x745, float:2.608E-42)
            X.0yV r1 = X.C21000yV.A02
            int r1 = X.C20800yB.A00(r1, r3, r2)
            if (r7 >= r1) goto L_0x0411
            java.lang.Long r1 = r0.A0X
            if (r1 == 0) goto L_0x0439
            long r4 = r1.longValue()
            r2 = 50
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0439
            X.0yW r2 = r6.A0E
            X.0u5 r1 = X.C20890yK.DEFAULT_SAMPLING_RATE
        L_0x0435:
            r2.Blx(r0, r1)
            return
        L_0x0439:
            java.lang.Integer r1 = r0.A0E
            if (r1 == 0) goto L_0x0497
            int r2 = r1.intValue()
            r1 = 14
            if (r2 == r1) goto L_0x0449
            r1 = 15
            if (r2 != r1) goto L_0x0497
        L_0x0449:
            X.0yW r2 = r6.A0E
            X.0u5 r1 = X.AnonymousClass1DT.A0g
            goto L_0x0435
        L_0x044e:
            if (r5 == 0) goto L_0x03de
            X.17T r3 = r6.A09
            r1 = 1
            java.lang.String[] r10 = new java.lang.String[r1]
            X.163 r1 = r3.A00
            long r1 = r1.A08(r5)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r10[r13] = r1
            X.12P r1 = r3.A01
            X.1M0 r3 = r1.get()
            X.14e r9 = r3.A02     // Catch:{ all -> 0x04a9 }
            java.lang.String r2 = "SELECT _id FROM available_message_view WHERE chat_row_id = ? AND message_type NOT IN ('7') AND from_me = 1  ORDER BY sort_id ASC LIMIT 1"
            java.lang.String r1 = "FIRST_OUTGOING_MESSAGE_RAW_SQL"
            android.database.Cursor r2 = r9.A09(r2, r1, r10)     // Catch:{ all -> 0x04a9 }
            boolean r1 = r2.moveToNext()     // Catch:{ all -> 0x049d }
            if (r1 == 0) goto L_0x0482
            java.lang.String r1 = "_id"
            int r1 = r2.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x049d }
            long r9 = r2.getLong(r1)     // Catch:{ all -> 0x049d }
            goto L_0x0484
        L_0x0482:
            r9 = -1
        L_0x0484:
            r2.close()     // Catch:{ all -> 0x04a9 }
            r3.close()
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 == 0) goto L_0x03d4
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r4.put(r5, r1)
            goto L_0x03d4
        L_0x0497:
            X.0yW r1 = r6.A0E
        L_0x0499:
            r1.Bly(r0)
            return
        L_0x049d:
            r1 = move-exception
            if (r2 == 0) goto L_0x04a8
            r2.close()     // Catch:{ all -> 0x04a4 }
            goto L_0x04a8
        L_0x04a4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x04a9 }
        L_0x04a8:
            throw r1     // Catch:{ all -> 0x04a9 }
        L_0x04a9:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x04ae }
            throw r1
        L_0x04ae:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35341iX.run():void");
    }

    public C35341iX(AnonymousClass1YG r2, AnonymousClass3QA r3, UserJid userJid, int i) {
        this.A04 = 3;
        this.A01 = r2;
        this.A02 = userJid;
        this.A03 = r3;
        this.A00 = i;
    }
}
