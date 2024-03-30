package X;

/* renamed from: X.1j6  reason: invalid class name and case insensitive filesystem */
public class C35691j6 implements Runnable {
    public Object A00;
    public final int A01;

    public C35691j6(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0306, code lost:
        if (r4 != null) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0679, code lost:
        r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3;
        r2 = r3.A1m;
        r1 = r2.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x067f, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:?, code lost:
        r2.A00 = null;
        r2.A01 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0685, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0686, code lost:
        r1 = r3.A1v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0688, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:?, code lost:
        r1.A00 = null;
        r1.A01 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x068d, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x068e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x079e, code lost:
        r0.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x07a1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0805, code lost:
        r1.remove(r0).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x080c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r1 = r22
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x04f2;
                case 1: goto L_0x053f;
                case 2: goto L_0x059d;
                case 3: goto L_0x05d0;
                case 4: goto L_0x05d8;
                case 5: goto L_0x0052;
                case 6: goto L_0x05e4;
                case 7: goto L_0x00ab;
                case 8: goto L_0x05e8;
                case 9: goto L_0x05f5;
                case 10: goto L_0x061b;
                case 11: goto L_0x0645;
                case 12: goto L_0x0125;
                case 13: goto L_0x0148;
                case 14: goto L_0x064d;
                case 15: goto L_0x0655;
                case 16: goto L_0x065d;
                case 17: goto L_0x0665;
                case 18: goto L_0x0673;
                case 19: goto L_0x0695;
                case 20: goto L_0x06b0;
                case 21: goto L_0x0185;
                case 22: goto L_0x01af;
                case 23: goto L_0x06b8;
                case 24: goto L_0x01bd;
                case 25: goto L_0x01d3;
                case 26: goto L_0x01e4;
                case 27: goto L_0x0329;
                case 28: goto L_0x06c6;
                case 29: goto L_0x06ce;
                case 30: goto L_0x06db;
                case 31: goto L_0x0346;
                case 32: goto L_0x06ec;
                case 33: goto L_0x03d7;
                case 34: goto L_0x06f4;
                case 35: goto L_0x03f3;
                case 36: goto L_0x0701;
                case 37: goto L_0x0750;
                case 38: goto L_0x0759;
                case 39: goto L_0x0767;
                case 40: goto L_0x0773;
                case 41: goto L_0x0778;
                case 42: goto L_0x048c;
                case 43: goto L_0x0798;
                case 44: goto L_0x0030;
                case 45: goto L_0x07a2;
                case 46: goto L_0x04b4;
                case 47: goto L_0x07c3;
                case 48: goto L_0x04db;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r1.A00
            X.0yX r3 = (X.C21020yX) r3
            X.0v0 r0 = r3.A0H
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "wam_is_current_buffer_real_time"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.apply()
            boolean r0 = X.C21020yX.A0B(r3)
            if (r0 == 0) goto L_0x002f
            X.005 r0 = r3.A0A
            java.lang.Object r2 = r0.get()
            X.7jN r2 = (X.C159447jN) r2
            X.1C9 r1 = r3.A01
            r0 = 0
            r2.Bpg(r1, r0)
        L_0x002f:
            return
        L_0x0030:
            java.lang.Object r0 = r1.A00
            X.17p r0 = (X.C232117p) r0
            X.0y9 r1 = r0.A01
            java.lang.Class<X.0xV> r0 = X.C20400xV.class
            X.00M r0 = r1.A01(r0)
            X.0xV r0 = (X.C20400xV) r0
            X.C20400xV.A00(r0)
            java.util.Set r0 = r0.A00
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "hostedUserJids"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0052:
            java.lang.Object r0 = r1.A00
            X.0wB r0 = (X.C19580wB) r0
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r4 = r0.iterator()
        L_0x005e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r3 = r4.next()
            X.196 r3 = (X.AnonymousClass196) r3
            X.0wQ r2 = r3.A06
            boolean r0 = r2.A0L()
            r1 = r0 ^ 1
            java.lang.String r0 = "sync-manager/onUnarchiveChatsSettingChanged/only primary can create this mutation"
            X.C18740tg.A0F(r1, r0)
            java.lang.String r0 = "sync-manager/onUnarchiveChatsSettingChanged"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1AE r1 = r3.A0T
            java.lang.String r0 = "setting_unarchiveChats"
            X.1LZ r1 = r1.A00(r0)
            X.8YI r1 = (X.AnonymousClass8YI) r1
            if (r1 == 0) goto L_0x00a1
            r2.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r2.A03
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r3.A0S()
            if (r0 == 0) goto L_0x00a1
            java.util.List r0 = r1.A0I()
            java.util.Set r0 = r3.A0C(r0)
        L_0x009d:
            r3.A0Q(r0)
            goto L_0x005e
        L_0x00a1:
            java.lang.String r0 = "sync-manager/onUnarchiveChatsSettingChanged/emptySet"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Set r0 = java.util.Collections.emptySet()
            goto L_0x009d
        L_0x00ab:
            java.lang.Object r1 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r1 = (com.whatsapp.conversationslist.ConversationsFragment) r1
            X.1f3 r4 = r1.A1a
            android.widget.ListView r0 = r1.A0A
            int r5 = r0.getFirstVisiblePosition()
            android.widget.ListView r6 = r1.A0A
            X.1gf r1 = r1.A1Q
            if (r6 == 0) goto L_0x0123
            if (r1 == 0) goto L_0x0123
            int r0 = r6.getHeaderViewsCount()
            int r3 = r1.getCount()
            int r1 = r6.getLastVisiblePosition()
            r2 = -1
            if (r3 != 0) goto L_0x010d
            r7 = -1
        L_0x00cf:
            int r6 = r5 + -1
            r3 = 1
            r2 = 0
            if (r7 < r6) goto L_0x00d6
            r2 = 1
        L_0x00d6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Last visible row ["
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "] should be >= First visible row ["
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C18740tg.A0D(r2, r0)
            r4.A00 = r5
            r4.A01 = r7
            r4.A03 = r3
            java.lang.Runnable r0 = r4.A02
            if (r0 == 0) goto L_0x002f
            boolean r0 = r4.isValid()
            if (r0 == 0) goto L_0x002f
            java.lang.Runnable r0 = r4.A02
            r0.run()
            return
        L_0x010d:
            int r0 = r0 + r3
            int r0 = r0 + -1
            if (r1 <= r0) goto L_0x0115
            int r7 = r3 + -1
            goto L_0x00cf
        L_0x0115:
            int r1 = r6.getLastVisiblePosition()
            int r0 = r6.getHeaderViewsCount()
            int r1 = r1 - r0
            int r7 = java.lang.Math.max(r2, r1)
            goto L_0x00cf
        L_0x0123:
            r7 = 0
            goto L_0x00cf
        L_0x0125:
            java.lang.Object r3 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            X.0wG r0 = r3.A1g
            android.content.Context r0 = r0.A00
            boolean r0 = X.C34191gb.A08(r0)
            if (r0 == 0) goto L_0x002f
            X.1ei r0 = r3.A0m
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x002f
            X.17Y r2 = r3.A0d
            r1 = 9
            X.1j6 r0 = new X.1j6
            r0.<init>(r3, r1)
            r2.A0H(r0)
            return
        L_0x0148:
            java.lang.Object r4 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r4 = (com.whatsapp.conversationslist.ConversationsFragment) r4
            boolean r0 = r4.A12()
            if (r0 == 0) goto L_0x002f
            X.1dE r2 = r4.A2h
            r1 = 1
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            X.3bI r0 = new X.3bI
            r0.<init>(r2, r1)
            X.04H r1 = new X.04H
            r1.<init>(r0, r4)
            java.lang.Class<com.whatsapp.status.viewmodels.StatusesViewModel> r0 = com.whatsapp.status.viewmodels.StatusesViewModel.class
            X.04R r0 = r1.A00(r0)
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = (com.whatsapp.status.viewmodels.StatusesViewModel) r0
            r4.A2i = r0
            X.00s r3 = r0.A04
            X.0Ab r2 = r4.A0m()
            r1 = 28
            X.3Uk r0 = new X.3Uk
            r0.<init>(r4, r1)
            r3.A08(r2, r0)
            X.01N r1 = r4.A0P
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = r4.A2i
            r1.A04(r0)
            return
        L_0x0185:
            java.lang.Object r0 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            X.4fA r0 = r0.A1X
            if (r0 == 0) goto L_0x002f
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r5 = r0.A04
            if (r5 == 0) goto L_0x002f
            X.5Se r1 = r5.A00
            X.5Se r0 = X.C108105Se.LOADED
            if (r1 != r0) goto L_0x002f
            java.util.Set r4 = r5.A0S()
            int r3 = r4.size()
            X.0yC r2 = r5.A07
            r1 = 7580(0x1d9c, float:1.0622E-41)
            X.0yV r0 = X.C21000yV.A02
            int r0 = X.C20800yB.A00(r0, r2, r1)
            if (r3 > r0) goto L_0x07b8
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel.A01(r5, r4)
            return
        L_0x01af:
            java.lang.Object r0 = r1.A00
            X.1ci r0 = (X.C31951ci) r0
            com.whatsapp.conversationslist.ConversationsFragment r0 = r0.A0N
            X.1gf r0 = r0.A1Q
            if (r0 == 0) goto L_0x002f
            r0.notifyDataSetChanged()
            return
        L_0x01bd:
            java.lang.Object r2 = r1.A00
            X.0wP r2 = (X.C19720wP) r2
            X.0wL r0 = r2.A00
            if (r0 != 0) goto L_0x002f
            r0 = 2
            X.4YH r1 = new X.4YH
            r1.<init>(r2, r0)
            r2.A00 = r1
            X.0wD r0 = r2.A05
            r0.registerObserver(r1)
            return
        L_0x01d3:
            java.lang.Object r2 = r1.A00
            X.0wP r2 = (X.C19720wP) r2
            X.0wL r1 = r2.A00
            if (r1 == 0) goto L_0x002f
            X.0wD r0 = r2.A05
            r0.unregisterObserver(r1)
            r0 = 0
            r2.A00 = r0
            return
        L_0x01e4:
            java.lang.Object r7 = r1.A00
            X.0wP r7 = (X.C19720wP) r7
            java.io.File r0 = X.C19720wP.A00(r7)
            java.io.File[] r6 = r0.listFiles()
            java.lang.String r8 = ".crash"
            r5 = 0
            if (r6 == 0) goto L_0x02ed
            int r9 = r6.length
            r4 = 0
        L_0x01f7:
            if (r4 >= r9) goto L_0x02ed
            r12 = r6[r4]
            r12.getAbsolutePath()
            java.lang.String r0 = r12.getName()
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x02ad
            byte[] r1 = X.AnonymousClass14R.A00(r12)     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x02e3 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x02e3 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x02e3 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r0 = "attachments"
            org.json.JSONObject r11 = r2.optJSONObject(r0)     // Catch:{ Exception -> 0x02e3 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Exception -> 0x02e3 }
            r1.<init>()     // Catch:{ Exception -> 0x02e3 }
            if (r11 != 0) goto L_0x0224
            goto L_0x023c
        L_0x0224:
            java.util.Iterator r10 = r11.keys()     // Catch:{ Exception -> 0x02e3 }
        L_0x0228:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x02e3 }
            if (r0 == 0) goto L_0x0251
            java.lang.Object r3 = r10.next()     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r0 = r11.getString(r3)     // Catch:{ Exception -> 0x02e3 }
            r1.put(r3, r0)     // Catch:{ Exception -> 0x02e3 }
            goto L_0x0228
        L_0x023c:
            java.lang.String r0 = "attachmentParam"
            java.lang.String r3 = r2.optString(r0)     // Catch:{ Exception -> 0x02e3 }
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x02e3 }
            if (r0 != 0) goto L_0x0251
            java.lang.String r0 = "attachmentPath"
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x02e3 }
            r1.put(r3, r0)     // Catch:{ Exception -> 0x02e3 }
        L_0x0251:
            java.lang.String r0 = "logFilePath"
            java.lang.String r14 = r2.getString(r0)     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r0 = "fromParam"
            java.lang.String r15 = r2.getString(r0)     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r0 = "forcedUpload"
            boolean r20 = r2.getBoolean(r0)     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r0 = "detailedException"
            boolean r21 = r2.getBoolean(r0)     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r0 = "tagsString"
            java.lang.String r16 = r2.getString(r0)     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r0 = "timeMillis"
            long r18 = r2.getLong(r0)     // Catch:{ Exception -> 0x02e3 }
            X.3AG r13 = new X.3AG     // Catch:{ Exception -> 0x02e3 }
            r17 = r1
            r13.<init>(r14, r15, r16, r17, r18, r20, r21)     // Catch:{ Exception -> 0x02e3 }
            long r2 = r13.A00
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.HOURS
            r0 = 2
            long r0 = r10.toMillis(r0)
            long r2 = r2 + r0
            long r10 = java.lang.System.currentTimeMillis()
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b1
            java.lang.String r11 = r13.A02
            boolean r10 = r13.A06
            java.lang.String r3 = r13.A01
            boolean r2 = r13.A05
            java.lang.String r1 = r13.A03
            java.util.Map r0 = r13.A04
            r14 = r7
            r15 = r11
            r16 = r3
            r17 = r1
            r18 = r0
            r19 = r10
            r20 = r2
            boolean r0 = X.C19720wP.A09(r14, r15, r16, r17, r18, r19, r20)
            if (r0 != 0) goto L_0x02b1
        L_0x02ad:
            int r4 = r4 + 1
            goto L_0x01f7
        L_0x02b1:
            java.lang.String r1 = r13.A02
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            r0.delete()
            java.util.Map r0 = r13.A04
            java.util.Collection r0 = r0.values()
            java.util.Iterator r2 = r0.iterator()
        L_0x02c5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02e9
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            java.io.File r0 = r1.getParentFile()
            r1.delete()
            if (r0 == 0) goto L_0x02c5
            r0.delete()
            goto L_0x02c5
        L_0x02e3:
            r1 = move-exception
            java.lang.String r0 = "app/CrashLogs/deserializeCrashData: could not deserialize stored crash data"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x02e9:
            r12.delete()
            goto L_0x02ad
        L_0x02ed:
            java.io.File r0 = X.C19720wP.A00(r7)
            java.io.File[] r4 = r0.listFiles()
            if (r4 == 0) goto L_0x02fa
            int r0 = r4.length
            if (r0 != 0) goto L_0x0308
        L_0x02fa:
            android.os.Handler r2 = r7.A01
            r1 = 25
            X.1j6 r0 = new X.1j6
            r0.<init>(r7, r1)
            r2.post(r0)
            if (r4 == 0) goto L_0x0321
        L_0x0308:
            int r3 = r4.length
            r2 = 0
        L_0x030a:
            if (r5 >= r3) goto L_0x031f
            r1 = r4[r5]
            java.lang.String r0 = r1.getName()
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x031c
            r1.getAbsolutePath()
            r2 = 1
        L_0x031c:
            int r5 = r5 + 1
            goto L_0x030a
        L_0x031f:
            if (r2 != 0) goto L_0x002f
        L_0x0321:
            java.io.File r0 = X.C19720wP.A00(r7)
            r0.delete()
            return
        L_0x0329:
            java.lang.Object r0 = r1.A00
            X.0z4 r0 = (X.C21350z4) r0
            X.0wG r0 = r0.A03
            android.content.Context r0 = r0.A00
            java.io.File r2 = r0.getFilesDir()
            java.lang.String r0 = "crash_counter"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x002f
            r1.delete()
            return
        L_0x0346:
            java.lang.Object r3 = r1.A00
            X.1I4 r3 = (X.AnonymousClass1I4) r3
            X.0v0 r2 = r3.A03
            X.005 r0 = r2.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "tos_2016_opt_out_state"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0360
            r2.A2M()
            return
        L_0x0360:
            r8 = 1
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x002f
            X.0yC r2 = r3.A05
            r1 = 1624(0x658, float:2.276E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x002f
            r3.A00 = r8
            X.1I3 r5 = r3.A04
            X.00s r2 = new X.00s
            r2.<init>()
            X.19A r9 = r5.A00
            java.lang.String r12 = r9.A09()
            java.lang.String r1 = "accept"
            r0 = 0
            X.9nx r7 = new X.9nx
            r7.<init>(r1, r0)
            r0 = 4
            X.1AL[] r6 = new X.AnonymousClass1AL[r0]
            X.8e2 r4 = X.C177588e2.A00
            java.lang.String r0 = "to"
            X.1AL r1 = new X.1AL
            r1.<init>((com.whatsapp.jid.Jid) r4, (java.lang.String) r0)
            r0 = 0
            r6[r0] = r1
            java.lang.String r1 = "id"
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r1, (java.lang.String) r12)
            r6[r8] = r0
            java.lang.String r4 = "xmlns"
            java.lang.String r0 = "urn:xmpp:whatsapp:account"
            X.1AL r1 = new X.1AL
            r1.<init>((java.lang.String) r4, (java.lang.String) r0)
            r0 = 2
            r6[r0] = r1
            java.lang.String r4 = "type"
            java.lang.String r0 = "get"
            X.1AL r1 = new X.1AL
            r1.<init>((java.lang.String) r4, (java.lang.String) r0)
            r0 = 3
            r6[r0] = r1
            java.lang.String r0 = "iq"
            X.9nx r11 = new X.9nx
            r11.<init>((X.C203399nx) r7, (java.lang.String) r0, (X.AnonymousClass1AL[]) r6)
            r0 = 0
            X.3Se r10 = new X.3Se
            r10.<init>(r2, r5, r0)
            r13 = 322(0x142, float:4.51E-43)
            r14 = 0
            r9.A0F(r10, r11, r12, r13, r14)
            r1 = 29
            X.3Uk r0 = new X.3Uk
            r0.<init>(r3, r1)
            r2.A0A(r0)
            return
        L_0x03d7:
            java.lang.Object r0 = r1.A00
            X.0wB r0 = (X.C19580wB) r0
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x03e3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r1.next()
            X.1JB r0 = (X.AnonymousClass1JB) r0
            r0.BQI()
            goto L_0x03e3
        L_0x03f3:
            java.lang.Object r7 = r1.A00
            X.1Q9 r7 = (X.AnonymousClass1Q9) r7
            X.13R r0 = r7.A0O
            java.lang.String r1 = "message_fts"
            X.0wy r0 = r0.A00()
            java.lang.Object r6 = r0.get(r1)
            X.15p r6 = (X.C227415p) r6
            if (r6 == 0) goto L_0x002f
            boolean r0 = r6.A0A()
            if (r0 != 0) goto L_0x0472
            X.2OT r8 = new X.2OT
            r8.<init>()
            java.lang.String r0 = "MessageStoreBackup/ftsMigration"
            X.14g r11 = new X.14g
            r11.<init>((java.lang.String) r0)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r5.add(r1)
            r0 = 1
            X.1f2[] r4 = new X.C33281f2[r0]
            X.15t r2 = r7.A08
            X.0wo r1 = r7.A0B
            X.6s1 r0 = new X.6s1
            r0.<init>(r2, r1)
            r3 = 0
            r4[r3] = r0
            X.60r r2 = new X.60r
            r2.<init>(r4)
            X.13S r1 = r7.A0N
            r0 = 7
            boolean r0 = r1.A03(r2, r5, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A00 = r0
            X.199 r5 = r7.A0a
            java.lang.String r4 = "fts_migration_elapsed_time_in_ms"
            r0 = 0
            java.lang.String r2 = r5.A07(r4)
            long r9 = X.AnonymousClass6R8.A01(r2, r0)
            boolean r0 = r6.A0A()
            if (r0 == 0) goto L_0x0482
            X.0v0 r0 = r7.A0E
            r0.A14(r3)
            long r2 = r11.A01()
            long r2 = r2 + r9
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r8.A01 = r0
            X.0yW r0 = r7.A0T
            r0.Bly(r8)
            r0 = 0
        L_0x046f:
            X.AnonymousClass199.A04(r5, r4, r0)
        L_0x0472:
            boolean r0 = r6.A0A()
            if (r0 == 0) goto L_0x002f
            X.0v0 r0 = r7.A0E
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "backup_restore_state"
            goto L_0x0805
        L_0x0482:
            long r0 = r11.A01()
            long r9 = r9 + r0
            java.lang.String r0 = java.lang.String.valueOf(r9)
            goto L_0x046f
        L_0x048c:
            java.lang.Object r2 = r1.A00
            X.19o r2 = (X.C237219o) r2
            java.lang.String r0 = "CriticalDataUploadManager/startCriticalDataBootstrap timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.19r r1 = r2.A00
            boolean r0 = X.C237419r.A01(r1)
            if (r0 != 0) goto L_0x002f
            boolean r0 = X.C237419r.A03(r1)
            if (r0 != 0) goto L_0x002f
            r0 = 1
            r1.A02 = r0
            X.0wr r0 = r1.A01
            r0.A02()
            X.0wr r0 = r1.A00
            r0.A02()
            X.C237219o.A00(r2)
            return
        L_0x04b4:
            java.lang.Object r1 = r1.A00
            X.1YZ r1 = (X.AnonymousClass1YZ) r1
            X.0wQ r0 = r1.A00
            r0.A0G()
            com.whatsapp.jid.PhoneUserJid r2 = r0.A03
            if (r2 == 0) goto L_0x002f
            X.16I r0 = r1.A05
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x04cb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r1.next()
            X.15j r0 = (X.C226815j) r0
            r0.A08(r2)
            goto L_0x04cb
        L_0x04db:
            java.lang.Object r2 = r1.A00
            X.0yB r2 = (X.C20800yB) r2
            X.0yW r1 = r2.A02
            if (r1 == 0) goto L_0x002f
            X.2Mr r0 = new X.2Mr
            r0.<init>()
            r1.Bly(r0)
            X.0yW r1 = r2.A02
            r0 = 1
            r1.Bph(r0)
            return
        L_0x04f2:
            java.lang.Object r7 = r1.A00
            X.1Nz r7 = (X.C27381Nz) r7
            java.util.concurrent.atomic.AtomicBoolean r6 = r7.A0V
            monitor-enter(r6)
            X.1Om r5 = r7.A0H     // Catch:{ all -> 0x053c }
            monitor-enter(r5)     // Catch:{ all -> 0x053c }
            java.util.Set r4 = r5.A02     // Catch:{ all -> 0x0536 }
            monitor-exit(r5)     // Catch:{ all -> 0x053c }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x053c }
        L_0x0503:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x053c }
            if (r0 == 0) goto L_0x0523
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x053c }
            X.6Pq r2 = (X.C131586Pq) r2     // Catch:{ all -> 0x053c }
            android.os.Handler r1 = X.C27381Nz.A00(r7)     // Catch:{ all -> 0x053c }
            monitor-enter(r5)     // Catch:{ all -> 0x053c }
            java.util.Map r0 = r5.A01     // Catch:{ all -> 0x0536 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0536 }
            X.34F r0 = (X.AnonymousClass34F) r0     // Catch:{ all -> 0x0536 }
            java.lang.Runnable r0 = r0.A01     // Catch:{ all -> 0x0536 }
            monitor-exit(r5)     // Catch:{ all -> 0x053c }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x053c }
            goto L_0x0503
        L_0x0523:
            r5.A01()     // Catch:{ all -> 0x053c }
            X.1On r1 = r7.A0G     // Catch:{ all -> 0x053c }
            monitor-enter(r1)     // Catch:{ all -> 0x053c }
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x0539 }
            r0.<init>()     // Catch:{ all -> 0x0539 }
            r1.A00 = r0     // Catch:{ all -> 0x0539 }
            monitor-exit(r1)     // Catch:{ all -> 0x053c }
            X.C27381Nz.A03(r7, r4)     // Catch:{ all -> 0x053c }
            monitor-exit(r6)     // Catch:{ all -> 0x053c }
            return
        L_0x0536:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x053c }
            goto L_0x053b
        L_0x0539:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x053c }
        L_0x053b:
            throw r0     // Catch:{ all -> 0x053c }
        L_0x053c:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x053c }
            throw r1
        L_0x053f:
            java.lang.Object r4 = r1.A00
            X.1Nz r4 = (X.C27381Nz) r4
            X.1Om r2 = r4.A0H
            monitor-enter(r2)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x05cd }
            r3.<init>()     // Catch:{ all -> 0x05cd }
            X.1O6 r6 = r2.A03     // Catch:{ all -> 0x05cd }
            android.content.SharedPreferences r1 = X.AnonymousClass1O6.A00(r6)     // Catch:{ all -> 0x05cd }
            java.lang.String r0 = "current_running_sync"
            r5 = 0
            java.lang.String r0 = r1.getString(r0, r5)     // Catch:{ all -> 0x05cd }
            if (r0 == 0) goto L_0x056a
            X.6Pq r0 = X.C131586Pq.A00(r0)     // Catch:{ ClassCastException | JSONException -> 0x0564 }
            if (r0 == 0) goto L_0x056a
            r3.add(r0)     // Catch:{ ClassCastException | JSONException -> 0x0564 }
            goto L_0x056a
        L_0x0564:
            r1 = move-exception
            java.lang.String r0 = "SyncRequestStorage/restore/current_failed"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x05cd }
        L_0x056a:
            android.content.SharedPreferences r1 = X.AnonymousClass1O6.A00(r6)     // Catch:{ ClassCastException | JSONException -> 0x0592 }
            java.lang.String r0 = "queued_running_sync_set"
            java.util.Set r0 = r1.getStringSet(r0, r5)     // Catch:{ ClassCastException | JSONException -> 0x0592 }
            if (r0 == 0) goto L_0x0598
            java.util.Iterator r1 = r0.iterator()     // Catch:{ ClassCastException | JSONException -> 0x0592 }
        L_0x057a:
            boolean r0 = r1.hasNext()     // Catch:{ ClassCastException | JSONException -> 0x0592 }
            if (r0 == 0) goto L_0x0598
            java.lang.Object r0 = r1.next()     // Catch:{ ClassCastException | JSONException -> 0x0592 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassCastException | JSONException -> 0x0592 }
            if (r0 == 0) goto L_0x057a
            X.6Pq r0 = X.C131586Pq.A00(r0)     // Catch:{ ClassCastException | JSONException -> 0x0592 }
            if (r0 == 0) goto L_0x057a
            r3.add(r0)     // Catch:{ ClassCastException | JSONException -> 0x0592 }
            goto L_0x057a
        L_0x0592:
            r1 = move-exception
            java.lang.String r0 = "SyncRequestStorage/restore/queue_failed"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x05cd }
        L_0x0598:
            monitor-exit(r2)
            X.C27381Nz.A03(r4, r3)
            return
        L_0x059d:
            java.lang.Object r2 = r1.A00
            X.1Nr r2 = (X.C27301Nr) r2
            monitor-enter(r2)
            java.util.HashSet r1 = X.C27301Nr.A00(r2)     // Catch:{ all -> 0x05cd }
            r1.size()     // Catch:{ all -> 0x05cd }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x05cd }
            if (r0 != 0) goto L_0x05cb
            r0 = 0
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]     // Catch:{ all -> 0x05cd }
            java.lang.Object[] r1 = r1.toArray(r0)     // Catch:{ all -> 0x05cd }
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1     // Catch:{ all -> 0x05cd }
            r0 = 3
            r2.A01(r1, r0)     // Catch:{ all -> 0x05cd }
            X.0v0 r0 = r2.A05     // Catch:{ all -> 0x05cd }
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)     // Catch:{ all -> 0x05cd }
            java.lang.String r0 = "pending_users_to_sync_device"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch:{ all -> 0x05cd }
            r0.apply()     // Catch:{ all -> 0x05cd }
        L_0x05cb:
            monitor-exit(r2)
            return
        L_0x05cd:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x05d0:
            java.lang.Object r0 = r1.A00
            X.1Cf r0 = (X.C24381Cf) r0
            r0.A00()
            return
        L_0x05d8:
            java.lang.Object r0 = r1.A00
            X.1fB r0 = (X.C33351fB) r0
            android.widget.HorizontalScrollView r1 = r0.A01
            r0 = 66
            r1.fullScroll(r0)
            return
        L_0x05e4:
            java.lang.Object r3 = r1.A00
            goto L_0x0679
        L_0x05e8:
            java.lang.Object r1 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r1 = (com.whatsapp.conversationslist.ConversationsFragment) r1
            r0 = 1
            r1.A3C = r0
            X.15i r0 = r1.A2a
            com.whatsapp.conversationslist.ConversationsFragment.A0O(r1, r0)
            return
        L_0x05f5:
            java.lang.Object r3 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            int r1 = r3.A08
            r0 = 7
            if (r1 < r0) goto L_0x0617
            r0 = 0
            r3.A3F = r0
            X.01I r0 = r3.A0h()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity"
            r2.setClassName(r1, r0)
            r3.A1C(r2)
            return
        L_0x0617:
            r0 = 1
            r3.A3F = r0
            return
        L_0x061b:
            java.lang.Object r3 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            X.1A5 r2 = r3.A1m
            java.lang.Object r1 = r2.A06
            monitor-enter(r1)
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x0642 }
            r2.A01 = r0     // Catch:{ all -> 0x0642 }
            monitor-exit(r1)     // Catch:{ all -> 0x0642 }
            X.1SA r1 = r3.A1v
            monitor-enter(r1)
            r2 = 0
            r1.A00 = r0     // Catch:{ all -> 0x068f }
            r1.A01 = r0     // Catch:{ all -> 0x068f }
            monitor-exit(r1)
            java.lang.String r0 = "prewarming search contacts"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1S3 r1 = r3.A3e
            r1.A0B = r2
            X.0xu r0 = r3.A1p
            r0.A0L(r1)
            return
        L_0x0642:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0642 }
            throw r0
        L_0x0645:
            java.lang.Object r1 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r1 = (com.whatsapp.conversationslist.ConversationsFragment) r1
            r0 = 0
            r1.A2g = r0
            return
        L_0x064d:
            java.lang.Object r0 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            com.whatsapp.conversationslist.ConversationsFragment.A0G(r0)
            return
        L_0x0655:
            java.lang.Object r0 = r1.A00
            X.1MP r0 = (X.AnonymousClass1MP) r0
            r0.A02()
            return
        L_0x065d:
            java.lang.Object r0 = r1.A00
            X.1FQ r0 = (X.AnonymousClass1FQ) r0
            r0.A00()
            return
        L_0x0665:
            java.lang.Object r0 = r1.A00
            X.1ck r0 = (X.C31971ck) r0
            com.whatsapp.conversationslist.ConversationsFragment r0 = r0.A00
            X.1eq r1 = r0.A0n
            X.29Q r0 = r0.A1R
            r1.A01(r0)
            return
        L_0x0673:
            java.lang.Object r0 = r1.A00
            X.1jb r0 = (X.C36001jb) r0
            java.lang.Object r3 = r0.A00
        L_0x0679:
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            X.1A5 r2 = r3.A1m
            java.lang.Object r1 = r2.A06
            monitor-enter(r1)
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x0692 }
            r2.A01 = r0     // Catch:{ all -> 0x0692 }
            monitor-exit(r1)     // Catch:{ all -> 0x0692 }
            X.1SA r1 = r3.A1v
            monitor-enter(r1)
            r1.A00 = r0     // Catch:{ all -> 0x068f }
            r1.A01 = r0     // Catch:{ all -> 0x068f }
            monitor-exit(r1)
            return
        L_0x068f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0692:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0692 }
            throw r0
        L_0x0695:
            java.lang.Object r0 = r1.A00
            X.1ji r0 = (X.C36071ji) r0
            java.lang.Object r3 = r0.A00
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            X.17Y r2 = r3.A0d
            r1 = 20
            X.1j6 r0 = new X.1j6
            r0.<init>(r3, r1)
            r2.A0H(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.A3j
            r0 = 0
            r1.set(r0)
            return
        L_0x06b0:
            java.lang.Object r0 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            r0.A1e()
            return
        L_0x06b8:
            java.lang.Object r0 = r1.A00
            X.1fJ r0 = (X.C33431fJ) r0
            X.1dx r2 = r0.A02
            X.11F r1 = r0.A00
            X.2oi r0 = X.C51992oi.CHAT_LIST_SCREEN
            r2.A01(r1, r0)
            return
        L_0x06c6:
            java.lang.Object r0 = r1.A00
            X.189 r0 = (X.AnonymousClass189) r0
            r0.A0N()
            return
        L_0x06ce:
            java.lang.Object r1 = r1.A00
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 9
            android.os.Process.setThreadPriority(r0)
            r1.run()
            return
        L_0x06db:
            java.lang.Object r3 = r1.A00
            X.1I4 r3 = (X.AnonymousClass1I4) r3
            X.17Y r2 = r3.A02
            r1 = 31
            X.1j6 r0 = new X.1j6
            r0.<init>(r3, r1)
            r2.Bp3(r0)
            return
        L_0x06ec:
            java.lang.Object r0 = r1.A00
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            return
        L_0x06f4:
            java.lang.Object r4 = r1.A00
            X.1QH r4 = (X.AnonymousClass1QH) r4
            X.1QM r3 = r4.A07
            r1 = 0
            r0 = 0
            X.AnonymousClass1QH.A00(r4, r3, r1, r0)
            return
        L_0x0701:
            java.lang.Object r0 = r1.A00
            X.1Jh r0 = (X.C26211Jh) r0
            X.12P r0 = r0.A04
            X.1M0 r7 = r0.A05()
            java.lang.String r9 = "scheduled_timestamp < ? AND call_log_row_id IS NULL"
            X.14e r8 = r7.A02     // Catch:{ all -> 0x0746 }
            java.lang.String r6 = "scheduled_calls"
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x0746 }
            r4 = 0
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0746 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 - r0
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x0746 }
            r5[r4] = r0     // Catch:{ all -> 0x0746 }
            java.lang.String r0 = "ScheduledCallsStore/DELETE_EXPIRED_SCHEDULED_CALLS"
            int r2 = r8.A03(r6, r9, r0, r5)     // Catch:{ all -> 0x0746 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0746 }
            r1.<init>()     // Catch:{ all -> 0x0746 }
            java.lang.String r0 = "ScheduledCallsStore/deleteExpiredScheduledCalls "
            r1.append(r0)     // Catch:{ all -> 0x0746 }
            r1.append(r2)     // Catch:{ all -> 0x0746 }
            java.lang.String r0 = " deleted"
            r1.append(r0)     // Catch:{ all -> 0x0746 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0746 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0746 }
            r7.close()
            return
        L_0x0746:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x074b }
            throw r1
        L_0x074b:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0750:
            java.lang.Object r1 = r1.A00
            X.1HT r1 = (X.AnonymousClass1HT) r1
            r0 = 1
            r1.A05(r0)
            return
        L_0x0759:
            java.lang.Object r0 = r1.A00
            X.1HT r0 = (X.AnonymousClass1HT) r0
            r1 = 0
            r0.A05(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0I
            r0.set(r1)
            return
        L_0x0767:
            java.lang.Object r0 = r1.A00
            X.1HT r0 = (X.AnonymousClass1HT) r0
            X.16J r1 = r0.A0B
            X.8dw r0 = X.C177528dw.A00
            r1.A00(r0)
            return
        L_0x0773:
            java.lang.Object r0 = r1.A00
            java.util.Map r0 = (java.util.Map) r0
            goto L_0x079e
        L_0x0778:
            java.lang.Object r4 = r1.A00
            X.19g r4 = (X.C236419g) r4
            X.17j r3 = r4.A0I
            X.17n r1 = r3.A04
            X.0wy r0 = r1.A00()
            X.0y7 r2 = r0.keySet()
            X.0wy r0 = r1.A00()
            X.0y7 r1 = r0.keySet()
            r0 = 0
            r3.A0A(r1, r0)
            X.C236419g.A03(r2, r4)
            return
        L_0x0798:
            java.lang.Object r0 = r1.A00
            X.17l r0 = (X.C231717l) r0
            java.util.Map r0 = r0.A00
        L_0x079e:
            r0.clear()
            return
        L_0x07a2:
            java.lang.Object r2 = r1.A00
            X.1Rf r2 = (X.C28071Rf) r2
            r0 = 4
            X.2Sm r1 = new X.2Sm
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04 = r0
            X.0yW r0 = r2.A05
            r0.Bly(r1)
            return
        L_0x07b8:
            X.1Rs r1 = r5.A0C
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0D(r0)
            return
        L_0x07c3:
            java.lang.Object r4 = r1.A00
            X.1bQ r4 = (X.C31191bQ) r4
            X.005 r0 = r4.A03
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.util.Map r2 = r0.getAll()
            java.util.Set r1 = r2.keySet()
            X.3aH r0 = X.C67663aH.A00
            X.AnonymousClass6XG.A01(r0, r1)
            java.lang.String r1 = X.C21190yo.A00(r2)
            X.005 r0 = r4.A04
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r3 = r0.edit()
            X.133 r2 = r4.A01
            java.nio.charset.Charset r0 = X.C31191bQ.A08
            byte[] r1 = r1.getBytes(r0)
            java.lang.String r0 = X.AnonymousClass6JD.A00
            X.63z r0 = r2.A01(r0, r1)
            if (r0 != 0) goto L_0x080d
            r1 = 0
        L_0x07fd:
            java.lang.String r0 = "ab_props:hash_v2"
            android.content.SharedPreferences$Editor r1 = r3.putString(r0, r1)
            java.lang.String r0 = "ab_props:hash"
        L_0x0805:
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            r0.apply()
            return
        L_0x080d:
            java.lang.String r1 = r0.A00()
            goto L_0x07fd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35691j6.run():void");
    }
}
