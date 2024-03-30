package X;

/* renamed from: X.1c2  reason: invalid class name and case insensitive filesystem */
public final class C31571c2 extends C29421Wo {
    public final C19460v5 A00;
    public final AnonymousClass1WR A01;
    public final AnonymousClass17Y A02;
    public final C19730wQ A03;
    public final C27341Nv A04;
    public final AnonymousClass19J A05;
    public final AnonymousClass1NG A06;
    public final C237119n A07;
    public final AnonymousClass1O7 A08;
    public final C19970wo A09;
    public final C19420v0 A0A;
    public final C236419g A0B;
    public final C235518x A0C;
    public final AnonymousClass1YZ A0D;
    public final C20810yC A0E;
    public final AnonymousClass1Z7 A0F;
    public final C20100x1 A0G;
    public final AnonymousClass1E9 A0H;
    public final C31581c3 A0I;
    public final C24971Em A0J;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0337, code lost:
        r2.A01(r0.A00(), false, r5, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x033f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x043e, code lost:
        r3.A01(r0.A00(), false, r2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0446, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0533, code lost:
        r5.A0H(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0536, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02aa, code lost:
        r0 = (X.C63473Ke) r0.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r3.A0E, 4097) != false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C203399nx r23, int r24) {
        /*
            r22 = this;
            r0 = 1
            r5 = r23
            X.AnonymousClass00C.A0D(r5, r0)
            X.9nx r4 = r5.A0a()
            X.AnonymousClass00C.A08(r4)
            java.lang.String r2 = r4.A00
            int r0 = r2.hashCode()
            r3 = r22
            switch(r0) {
                case -1039690024: goto L_0x0447;
                case -892481550: goto L_0x041d;
                case -688600252: goto L_0x03b4;
                case -577741570: goto L_0x037a;
                case -314498168: goto L_0x0316;
                case -265713450: goto L_0x02ff;
                case 115032: goto L_0x0231;
                case 3599307: goto L_0x0206;
                case 282449027: goto L_0x01d1;
                case 873162411: goto L_0x00d1;
                case 1559801053: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            return
        L_0x0019:
            java.lang.String r0 = "devices"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = "offline"
            r0 = 0
            java.lang.String r0 = r5.A0i(r1, r0)
            if (r0 != 0) goto L_0x003e
            X.19J r0 = r3.A05
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00c3
            X.0yC r2 = r3.A0E
            r1 = 4097(0x1001, float:5.741E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x00c3
        L_0x003e:
            r7 = 1
        L_0x003f:
            java.lang.String r1 = "action"
            r0 = 0
            java.lang.String r1 = r4.A0i(r1, r0)
            java.lang.String r0 = "modify"
            boolean r2 = r0.equals(r1)
            java.lang.String r1 = "reason"
            r0 = 0
            java.lang.String r1 = r4.A0i(r1, r0)
            java.lang.String r0 = "critical_sync_timeout"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0074
            X.19n r1 = r3.A07
            X.0wo r0 = r3.A09
            long r5 = X.C19970wo.A00(r0)
            android.content.SharedPreferences r0 = X.C237119n.A00(r1)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "syncd_bootstrap_fail_time"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r5)
            r0.apply()
        L_0x0074:
            r5 = 1
            if (r2 != 0) goto L_0x00c6
            if (r7 != 0) goto L_0x00c6
            java.lang.String r0 = "device"
            java.util.List r0 = r4.A0j(r0)
            X.AnonymousClass00C.A08(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "key-index-list"
            X.9nx r1 = r4.A0c(r0)
            if (r1 == 0) goto L_0x00c0
            java.lang.String r0 = "ts"
            long r6 = r1.A0U(r0)
        L_0x0098:
            X.0v0 r0 = r3.A0A
            X.005 r0 = r0.A00
            java.lang.Object r5 = r0.get()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.String r2 = "adv_timestamp_sec"
            r0 = -1
            long r1 = r5.getLong(r2, r0)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0018
            X.0wy r1 = X.AnonymousClass9Ze.A01(r4)
            X.AnonymousClass00C.A08(r1)
            X.17Y r5 = r3.A02
            r0 = 36
            X.1iz r4 = new X.1iz
            r4.<init>(r3, r1, r0)
            goto L_0x0533
        L_0x00c0:
            r6 = 0
            goto L_0x0098
        L_0x00c3:
            r7 = 0
            goto L_0x003f
        L_0x00c6:
            X.0x1 r2 = r3.A0G
            X.9SZ r0 = new X.9SZ
            r0.<init>()
            r0.A02 = r5
            goto L_0x0337
        L_0x00d1:
            java.lang.String r0 = "blocklist"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            X.0v0 r0 = r3.A0A
            java.lang.String r5 = r0.A0a()
            java.lang.String r1 = "prev_dhash"
            r0 = 0
            java.lang.String r2 = r4.A0i(r1, r0)
            java.lang.String r8 = "action"
            java.lang.String r1 = r4.A0i(r8, r0)
            java.lang.String r0 = "modify"
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 != 0) goto L_0x04fd
            boolean r0 = X.AnonymousClass00C.A0J(r5, r2)
            if (r0 == 0) goto L_0x04fd
            java.lang.String r2 = "item"
            java.util.List r0 = r4.A0j(r2)
            X.AnonymousClass00C.A08(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0018
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.List r0 = r4.A0j(r2)
            java.util.Iterator r10 = r0.iterator()
        L_0x011e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0158
            java.lang.Object r9 = r10.next()
            X.9nx r9 = (X.C203399nx) r9
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r6 = r9.A0Y(r2, r0)
            java.lang.String r2 = r9.A0h(r8)
            java.lang.String r0 = "block"
            boolean r0 = r0.equals(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.put(r6, r0)
            java.lang.String r2 = "display_name"
            r0 = 0
            java.lang.String r2 = r9.A0i(r2, r0)
            boolean r0 = X.AnonymousClass14B.A0F(r2)
            if (r0 != 0) goto L_0x011e
            boolean r0 = r6 instanceof X.C223313w
            if (r0 == 0) goto L_0x011e
            r7.put(r6, r2)
            goto L_0x011e
        L_0x0158:
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r8 = r0.iterator()
        L_0x016a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x018e
            java.lang.Object r0 = r8.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r5 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r1) goto L_0x018a
            r6.add(r5)
            goto L_0x016a
        L_0x018a:
            r2.add(r5)
            goto L_0x016a
        L_0x018e:
            X.1NG r5 = r3.A06
            java.lang.String r3 = "dhash"
            r0 = 0
            java.lang.String r3 = r4.A0i(r3, r0)
            java.util.HashSet r0 = X.AnonymousClass1NG.A02(r5, r6)
            r6.addAll(r0)
            java.util.HashSet r0 = X.AnonymousClass1NG.A02(r5, r2)
            r2.addAll(r0)
            java.util.Set r8 = r5.A0K
            r6.removeAll(r8)
            r2.retainAll(r8)
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x01bd
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0018
        L_0x01bd:
            java.util.Iterator r4 = r6.iterator()
        L_0x01c1:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0462
            java.lang.Object r0 = r4.next()
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r5.A0J(r0, r1)
            goto L_0x01c1
        L_0x01d1:
            java.lang.String r0 = "disappearing_mode"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = "duration"
            r0 = 0
            int r7 = r4.A0S(r1, r0)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r2 = "t"
            r0 = 0
            long r0 = r4.A0V(r2, r0)
            long r4 = r5.toMillis(r0)
            X.18x r6 = r3.A0C
            X.19y r0 = r6.A03
            android.content.SharedPreferences r3 = X.C238119y.A00(r0)
            java.lang.String r2 = "disappearing_mode_timestamp"
            r0 = 0
            long r1 = r3.getLong(r2, r0)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0018
            r6.A05(r7, r4)
            return
        L_0x0206:
            java.lang.String r0 = "user"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = "state"
            r0 = 0
            java.lang.String r1 = r4.A0i(r1, r0)
            java.lang.String r0 = "AI available"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0018
            X.0v5 r1 = r3.A00
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r1 = r1.A02()
            X.1HX r1 = (X.AnonymousClass1HX) r1
            X.2p6 r0 = X.C52232p6.AI_AVAILABLE
            r1.A04(r0)
            return
        L_0x0231:
            java.lang.String r0 = "tos"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            X.0yC r2 = r3.A0E
            r1 = 877(0x36d, float:1.229E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0018
            X.3Pv r4 = X.C55622uv.A00(r5)
            X.1E9 r0 = r3.A0H
            r0.A02(r4)
            X.0v5 r1 = r3.A00
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x02b1
            java.lang.Object r0 = r1.A02()
            X.1HX r0 = (X.AnonymousClass1HX) r0
            X.1Ha r5 = r0.A02
            java.util.List r0 = r4.A01
            java.util.Iterator r7 = r0.iterator()
        L_0x0264:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x02b1
            java.lang.Object r6 = r7.next()
            X.3Ij r6 = (X.C63003Ij) r6
            java.lang.String r2 = r6.A01
            int r1 = r2.hashCode()
            r0 = 0
            switch(r1) {
                case -1923249335: goto L_0x028a;
                case -1923249334: goto L_0x0295;
                case -1922332505: goto L_0x02a0;
                default: goto L_0x027a;
            }
        L_0x027a:
            int r1 = r6.A00
            r2 = 1
            if (r1 == r2) goto L_0x0287
            X.8zP r1 = X.C188328zP.UNACCEPTED
        L_0x0281:
            if (r0 == 0) goto L_0x0264
            r0.A03(r1, r2)
            goto L_0x0264
        L_0x0287:
            X.8zP r1 = X.C188328zP.ACCEPTED
            goto L_0x0281
        L_0x028a:
            java.lang.String r1 = "20230901"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x027a
            X.00T r0 = r5.A02
            goto L_0x02aa
        L_0x0295:
            java.lang.String r1 = "20230902"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x027a
            X.00T r0 = r5.A03
            goto L_0x02aa
        L_0x02a0:
            java.lang.String r1 = "20240216"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x027a
            X.00T r0 = r5.A04
        L_0x02aa:
            java.lang.Object r0 = r0.getValue()
            X.3Ke r0 = (X.C63473Ke) r0
            goto L_0x027a
        L_0x02b1:
            X.1Em r3 = r3.A0J
            java.util.List r0 = r4.A01
            java.util.Iterator r4 = r0.iterator()
        L_0x02b9:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r2 = r4.next()
            X.3Ij r2 = (X.C63003Ij) r2
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "20231027"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x02b9
            int r1 = r2.A00
            r2 = 1
            X.00T r0 = r3.A04
            if (r1 != r2) goto L_0x02e2
            java.lang.Object r1 = r0.getValue()
            X.3Ke r1 = (X.C63473Ke) r1
            java.lang.String r0 = "yes"
            r1.A03(r0, r2)
            goto L_0x02b9
        L_0x02e2:
            java.lang.Object r2 = r0.getValue()
            X.3Ke r2 = (X.C63473Ke) r2
            monitor-enter(r2)
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x050f }
            monitor-exit(r2)
            X.1Eq r0 = r3.A03
            android.content.SharedPreferences r0 = X.C25011Eq.A00(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.clear()
            r0.apply()
            goto L_0x02b9
        L_0x02ff:
            java.lang.String r1 = "username"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x0018
            r0 = 0
            java.lang.String r1 = r4.A0i(r1, r0)
            X.0wQ r0 = r3.A03
            if (r1 != 0) goto L_0x0312
            java.lang.String r1 = ""
        L_0x0312:
            r0.A0I(r1)
            return
        L_0x0316:
            java.lang.String r0 = "privacy"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = "action"
            r0 = 0
            java.lang.String r1 = r4.A0i(r1, r0)
            java.lang.String r0 = "modify"
            boolean r0 = r0.equals(r1)
            r5 = 1
            if (r0 == 0) goto L_0x0340
            X.0x1 r2 = r3.A0G
            X.9SZ r0 = new X.9SZ
            r0.<init>()
            r0.A05 = r5
        L_0x0337:
            X.9Nx r1 = r0.A00()
            r0 = 0
            r2.A01(r1, r0, r5, r0)
            return
        L_0x0340:
            java.lang.String r1 = "category"
            java.util.List r0 = r4.A0j(r1)
            X.AnonymousClass00C.A08(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0018
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.List r0 = r4.A0j(r1)
            java.util.Iterator r4 = r0.iterator()
        L_0x035e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0512
            java.lang.Object r2 = r4.next()
            X.9nx r2 = (X.C203399nx) r2
            java.lang.String r0 = "name"
            java.lang.String r1 = r2.A0h(r0)
            java.lang.String r0 = "value"
            java.lang.String r0 = r2.A0h(r0)
            r5.put(r1, r0)
            goto L_0x035e
        L_0x037a:
            java.lang.String r0 = "picture"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = "action"
            r0 = 0
            java.lang.String r1 = r4.A0i(r1, r0)
            java.lang.String r0 = "modify"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x039d
            X.0x1 r3 = r3.A0G
            X.9SZ r0 = new X.9SZ
            r0.<init>()
            r2 = 1
            r0.A04 = r2
            goto L_0x043e
        L_0x039d:
            java.lang.String r0 = "delete"
            X.9nx r0 = r4.A0c(r0)
            if (r0 == 0) goto L_0x0018
            X.1O7 r1 = r3.A08
            X.0wQ r0 = r3.A03
            r0.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r0.A03
            if (r0 == 0) goto L_0x0518
            r1.A02(r0)
            return
        L_0x03b4:
            java.lang.String r0 = "text_status"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            X.0yC r2 = r3.A0E
            r1 = 4921(0x1339, float:6.896E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = "action"
            r0 = 0
            java.lang.String r1 = r4.A0i(r1, r0)
            java.lang.String r0 = "modify"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03e2
            X.0x1 r3 = r3.A0G
            X.9SZ r0 = new X.9SZ
            r0.<init>()
            r2 = 1
            r0.A07 = r2
            goto L_0x043e
        L_0x03e2:
            java.lang.String r0 = "text"
            r6 = 0
            java.lang.String r9 = r4.A0i(r0, r6)
            java.lang.String r0 = "ephemeral_duration_sec"
            java.lang.String r2 = r4.A0i(r0, r6)
            if (r2 == 0) goto L_0x0018
            java.lang.String r0 = "last_update_time"
            java.lang.String r5 = r4.A0i(r0, r6)
            if (r5 == 0) goto L_0x0018
            java.lang.String r0 = "emoji"
            X.9nx r1 = r4.A0c(r0)
            if (r1 == 0) goto L_0x041b
            java.lang.String r0 = "content"
            java.lang.String r12 = r1.A0i(r0, r6)
        L_0x0407:
            X.1YZ r6 = r3.A0D
            long r7 = java.lang.Long.parseLong(r2)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = java.lang.Long.parseLong(r5)
            long r10 = r2.toMillis(r0)
            r6.A01(r7, r9, r10, r12)
            return
        L_0x041b:
            r12 = 0
            goto L_0x0407
        L_0x041d:
            java.lang.String r0 = "status"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = "action"
            r0 = 0
            java.lang.String r1 = r4.A0i(r1, r0)
            java.lang.String r0 = "modify"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0520
            X.0x1 r3 = r3.A0G
            X.9SZ r0 = new X.9SZ
            r0.<init>()
            r2 = 1
            r0.A06 = r2
        L_0x043e:
            X.9Nx r1 = r0.A00()
            r0 = 0
            r3.A01(r1, r0, r2, r0)
            return
        L_0x0447:
            java.lang.String r0 = "notice"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            X.0yC r2 = r3.A0E
            r1 = 4779(0x12ab, float:6.697E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0018
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            goto L_0x0537
        L_0x0462:
            X.0yC r9 = r5.A0G
            r4 = 4408(0x1138, float:6.177E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r9, r4)
            if (r0 == 0) goto L_0x04ac
            java.util.Iterator r10 = r6.iterator()
        L_0x0472:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x04ac
            java.lang.Object r14 = r10.next()
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14
            X.16D r0 = r5.A06
            X.141 r13 = r0.A08(r14)
            boolean r0 = r5.A0N(r13, r1)
            if (r0 == 0) goto L_0x0472
            r12 = 0
            java.util.ArrayList r20 = r5.A07(r14)
            X.3B0 r11 = new X.3B0
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r21 = 1
            r15 = r12
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.0wU r9 = r5.A0J
            r4 = 47
            X.1iz r0 = new X.1iz
            r0.<init>(r11, r5, r4)
            r9.Boy(r0)
            goto L_0x0472
        L_0x04ac:
            java.util.Iterator r4 = r2.iterator()
        L_0x04b0:
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x04c1
            java.lang.Object r0 = r4.next()
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r5.A0J(r0, r1)
            goto L_0x04b0
        L_0x04c1:
            monitor-enter(r5)
            r8.addAll(r6)     // Catch:{ all -> 0x04fa }
            r8.removeAll(r2)     // Catch:{ all -> 0x04fa }
            X.1NI r1 = r5.A05     // Catch:{ all -> 0x04fa }
            java.util.Set r0 = r5.A09()     // Catch:{ all -> 0x04fa }
            r1.A01(r0)     // Catch:{ all -> 0x04fa }
            X.0v0 r0 = r5.A0A     // Catch:{ all -> 0x04fa }
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)     // Catch:{ all -> 0x04fa }
            java.lang.String r0 = "block_list_v2_dhash"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r3)     // Catch:{ all -> 0x04fa }
            r0.apply()     // Catch:{ all -> 0x04fa }
            X.16y r0 = r5.A0F     // Catch:{ all -> 0x04fa }
            r0.A02(r7)     // Catch:{ all -> 0x04fa }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x04fa }
            r3.<init>(r6)     // Catch:{ all -> 0x04fa }
            r3.addAll(r2)     // Catch:{ all -> 0x04fa }
            X.17Y r2 = r5.A02     // Catch:{ all -> 0x04fa }
            r1 = 2
            X.1j2 r0 = new X.1j2     // Catch:{ all -> 0x04fa }
            r0.<init>(r5, r3, r1)     // Catch:{ all -> 0x04fa }
            r2.A0H(r0)     // Catch:{ all -> 0x04fa }
            monitor-exit(r5)
            return
        L_0x04fa:
            r1 = move-exception
            monitor-exit(r5)
            throw r1
        L_0x04fd:
            X.0x1 r3 = r3.A0G
            X.9SZ r0 = new X.9SZ
            r0.<init>()
            r0.A01 = r1
            X.9Nx r2 = r0.A00()
            r0 = 0
            r3.A01(r2, r0, r1, r0)
            return
        L_0x050f:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x0512:
            X.1Nv r0 = r3.A04
            r0.A03(r5)
            return
        L_0x0518:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0520:
            java.lang.String r1 = "dhash"
            r0 = 0
            java.lang.String r2 = r4.A0i(r1, r0)
            java.lang.String r1 = r4.A0e()
            X.17Y r5 = r3.A02
            r0 = 0
            X.1ix r4 = new X.1ix
            r4.<init>(r3, r1, r2, r0)
        L_0x0533:
            r5.A0H(r4)
            return
        L_0x0537:
            java.lang.String r0 = "id"
            int r5 = r4.A0R(r0)     // Catch:{ 19b -> 0x0567 }
            java.lang.String r0 = "stage"
            int r6 = r4.A0R(r0)     // Catch:{ 19b -> 0x0567 }
            java.lang.String r0 = "t"
            long r0 = r4.A0U(r0)     // Catch:{ 19b -> 0x0567 }
            r8 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r0
            java.lang.String r0 = "version"
            int r7 = r4.A0R(r0)     // Catch:{ 19b -> 0x0567 }
            java.lang.String r0 = "type"
            int r10 = r4.A0R(r0)     // Catch:{ 19b -> 0x0567 }
            X.3Su r4 = new X.3Su     // Catch:{ 19b -> 0x0567 }
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ 19b -> 0x0567 }
            r2.add(r4)     // Catch:{ 19b -> 0x0567 }
            X.1Z7 r1 = r3.A0F     // Catch:{ 19b -> 0x0567 }
            r0 = 1
            r1.BJZ(r2, r0, r0)     // Catch:{ 19b -> 0x0567 }
            return
        L_0x0567:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AccountSyncNotificationHandler/handlePrivacyDisclosureNotification bad notice metadata "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31571c2.A07(X.9nx, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C31571c2(X.C19460v5 r29, X.AnonymousClass1WR r30, X.C19700wN r31, X.AnonymousClass17Y r32, X.C19730wQ r33, X.C27341Nv r34, X.AnonymousClass19J r35, X.AnonymousClass1NG r36, X.C237119n r37, X.AnonymousClass1O7 r38, X.C19970wo r39, X.C19420v0 r40, X.C236419g r41, X.C235518x r42, X.AnonymousClass1YZ r43, X.C20810yC r44, X.AnonymousClass19A r45, X.AnonymousClass19L r46, X.AnonymousClass1Z7 r47, X.C20100x1 r48, X.AnonymousClass1E9 r49, X.C31581c3 r50, X.C19770wU r51, X.C24971Em r52) {
        /*
            r28 = this;
            r1 = 1
            r16 = r31
            r0 = r16
            X.AnonymousClass00C.A0D(r0, r1)
            r2 = 2
            r18 = r46
            r0 = r18
            X.AnonymousClass00C.A0D(r0, r2)
            r2 = 3
            r17 = r45
            r0 = r17
            X.AnonymousClass00C.A0D(r0, r2)
            r2 = 4
            r19 = r51
            r0 = r19
            X.AnonymousClass00C.A0D(r0, r2)
            r0 = 5
            r7 = r44
            X.AnonymousClass00C.A0D(r7, r0)
            r0 = 6
            r5 = r48
            X.AnonymousClass00C.A0D(r5, r0)
            r2 = 7
            r22 = r36
            r0 = r22
            X.AnonymousClass00C.A0D(r0, r2)
            r0 = 9
            r13 = r41
            X.AnonymousClass00C.A0D(r13, r0)
            r0 = 10
            r14 = r38
            X.AnonymousClass00C.A0D(r14, r0)
            r0 = 11
            r3 = r50
            X.AnonymousClass00C.A0D(r3, r0)
            r0 = 12
            r12 = r42
            X.AnonymousClass00C.A0D(r12, r0)
            r2 = 13
            r26 = r32
            r0 = r26
            X.AnonymousClass00C.A0D(r0, r2)
            r2 = 14
            r25 = r33
            r0 = r25
            X.AnonymousClass00C.A0D(r0, r2)
            r0 = 15
            r11 = r43
            X.AnonymousClass00C.A0D(r11, r0)
            r2 = 16
            r27 = r30
            r0 = r27
            X.AnonymousClass00C.A0D(r0, r2)
            r0 = 17
            r6 = r47
            X.AnonymousClass00C.A0D(r6, r0)
            r2 = 18
            r24 = r34
            r0 = r24
            X.AnonymousClass00C.A0D(r0, r2)
            r0 = 19
            r10 = r37
            X.AnonymousClass00C.A0D(r10, r0)
            r0 = 20
            r9 = r39
            X.AnonymousClass00C.A0D(r9, r0)
            r0 = 21
            r4 = r49
            X.AnonymousClass00C.A0D(r4, r0)
            r0 = 22
            r8 = r40
            X.AnonymousClass00C.A0D(r8, r0)
            r0 = 23
            r2 = r52
            X.AnonymousClass00C.A0D(r2, r0)
            r15 = 24
            r23 = r35
            r0 = r23
            X.AnonymousClass00C.A0D(r0, r15)
            int[] r0 = new int[r1]
            r21 = 0
            r1 = 203(0xcb, float:2.84E-43)
            r0[r21] = r1
            r1 = r28
            r15 = r1
            r20 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r1.A0E = r7
            r1.A0G = r5
            r0 = r22
            r1.A06 = r0
            r0 = r29
            r1.A00 = r0
            r1.A0B = r13
            r1.A08 = r14
            r1.A0I = r3
            r1.A0C = r12
            r0 = r26
            r1.A02 = r0
            r0 = r25
            r1.A03 = r0
            r1.A0D = r11
            r0 = r27
            r1.A01 = r0
            r1.A0F = r6
            r0 = r24
            r1.A04 = r0
            r1.A07 = r10
            r1.A09 = r9
            r1.A0H = r4
            r1.A0A = r8
            r1.A0J = r2
            r0 = r23
            r1.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31571c2.<init>(X.0v5, X.1WR, X.0wN, X.17Y, X.0wQ, X.1Nv, X.19J, X.1NG, X.19n, X.1O7, X.0wo, X.0v0, X.19g, X.18x, X.1YZ, X.0yC, X.19A, X.19L, X.1Z7, X.0x1, X.1E9, X.1c3, X.0wU, X.1Em):void");
    }
}
