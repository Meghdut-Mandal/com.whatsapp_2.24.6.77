package X;

import com.whatsapp.search.SearchViewModel;

/* renamed from: X.1jA  reason: invalid class name and case insensitive filesystem */
public class C35731jA implements Runnable {
    public Object A00;
    public final int A01;

    public C35731jA(SearchViewModel searchViewModel, int i) {
        this.A01 = i;
        switch (i) {
            case 34:
            case 35:
                this.A00 = searchViewModel;
                return;
            default:
                this.A00 = searchViewModel;
                return;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.1Km} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.11f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: X.1Km} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: X.1Km} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: X.1Km} */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.A01
            switch(r0) {
                case 0: goto L_0x0022;
                case 1: goto L_0x0475;
                case 2: goto L_0x003e;
                case 3: goto L_0x0485;
                case 4: goto L_0x04db;
                case 5: goto L_0x0616;
                case 6: goto L_0x0616;
                case 7: goto L_0x061e;
                case 8: goto L_0x072c;
                case 9: goto L_0x0734;
                case 10: goto L_0x0778;
                case 11: goto L_0x004c;
                case 12: goto L_0x0793;
                case 13: goto L_0x0053;
                case 14: goto L_0x007a;
                case 15: goto L_0x081d;
                case 16: goto L_0x0853;
                case 17: goto L_0x009d;
                case 18: goto L_0x0860;
                case 19: goto L_0x00bf;
                case 20: goto L_0x0870;
                case 21: goto L_0x0159;
                case 22: goto L_0x025e;
                case 23: goto L_0x087b;
                case 24: goto L_0x088b;
                case 25: goto L_0x08a0;
                case 26: goto L_0x0277;
                case 27: goto L_0x027f;
                case 28: goto L_0x0308;
                case 29: goto L_0x032d;
                case 30: goto L_0x09fa;
                case 31: goto L_0x08a8;
                case 32: goto L_0x08e5;
                case 33: goto L_0x08ed;
                case 34: goto L_0x0345;
                case 35: goto L_0x08f5;
                case 36: goto L_0x03b0;
                case 37: goto L_0x0908;
                case 38: goto L_0x040f;
                case 39: goto L_0x093b;
                case 40: goto L_0x0945;
                case 41: goto L_0x0430;
                case 42: goto L_0x094d;
                case 43: goto L_0x0959;
                case 44: goto L_0x0961;
                case 45: goto L_0x0969;
                case 46: goto L_0x0005;
                case 47: goto L_0x0005;
                case 48: goto L_0x0971;
                case 49: goto L_0x044c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r13.A00
            X.1N6 r3 = (X.AnonymousClass1N6) r3
            r2 = 8
            X.00T r0 = X.AnonymousClass1N6.A0A
            r1 = 1
            int r1 = r1 << r2
            X.00T r0 = r3.A04
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0470
            r3.A01()
        L_0x0021:
            return
        L_0x0022:
            java.lang.Object r0 = r13.A00
            X.0wB r0 = (X.C19580wB) r0
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x002e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r1.next()
            X.Az3 r0 = (X.C22951Az3) r0
            r0.BQd()
            goto L_0x002e
        L_0x003e:
            java.lang.Object r1 = r13.A00
            X.11e r1 = (X.AnonymousClass11e) r1
            boolean r0 = r1.A09
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "contents_are_drained"
            r1.A07(r0)
            return
        L_0x004c:
            java.lang.Object r4 = r13.A00
            X.1Z8 r4 = (X.AnonymousClass1Z8) r4
            r3 = 120(0x78, float:1.68E-43)
            goto L_0x0059
        L_0x0053:
            java.lang.Object r4 = r13.A00
            X.1Z8 r4 = (X.AnonymousClass1Z8) r4
            r3 = 110(0x6e, float:1.54E-43)
        L_0x0059:
            X.1Z9 r0 = r4.A05
            java.util.List r0 = r0.A00()
            java.util.Iterator r2 = r0.iterator()
        L_0x0063:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r1 = r2.next()
            X.3Pa r1 = (X.C64683Pa) r1
            r0 = 1
            boolean r0 = r4.A03(r1, r0)
            if (r0 == 0) goto L_0x0063
            r4.A01(r1, r3)
            goto L_0x0063
        L_0x007a:
            java.lang.Object r5 = r13.A00
            X.1bD r5 = (X.C31061bD) r5
            X.0v0 r4 = r5.A04
            X.005 r0 = r4.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r3 = "pref_wam_advertisement_id_reporting_done"
            r0 = 0
            boolean r0 = r1.getBoolean(r3, r0)
            if (r0 != 0) goto L_0x0021
            X.0yf r1 = r5.A00
            X.0yi r0 = X.C21100yf.A0s
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x0021
            goto L_0x097b
        L_0x009d:
            java.lang.Object r1 = r13.A00
            X.19J r1 = (X.AnonymousClass19J) r1
            r0 = 0
            r1.A01 = r0
            X.C18740tg.A01()
            java.lang.Iterable r0 = r1.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x00af:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r1.next()
            X.0xX r0 = (X.C20420xX) r0
            r0.BYo()
            goto L_0x00af
        L_0x00bf:
            java.lang.Object r5 = r13.A00
            X.1aL r5 = (X.C30521aL) r5
            X.1HO r0 = r5.A0C
            java.util.ArrayList r6 = r0.A05()
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x00da
            java.lang.Boolean r0 = X.C18750th.A03
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r0 == 0) goto L_0x00da
            r6.remove(r0)
        L_0x00da:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0021
            X.0yC r10 = r5.A0H
            r9 = 522(0x20a, float:7.31E-43)
            X.0yV r2 = X.C21000yV.A02
            int r0 = X.C20800yB.A00(r2, r10, r9)
            if (r0 == 0) goto L_0x0021
            long r3 = java.lang.System.currentTimeMillis()
            X.1Pa r8 = r5.A03
            android.content.SharedPreferences r11 = X.C27631Pa.A00(r8)
            java.lang.String r7 = "zombie_cleanup"
            r0 = 0
            long r0 = r11.getLong(r7, r0)
            long r3 = r3 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            r0 = 60
            long r3 = r3 / r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "OfflineResumeHandler/shouldCleanupZombieCalls Interval = "
            r1.append(r0)
            int r0 = X.C20800yB.A00(r2, r10, r9)
            r1.append(r0)
            java.lang.String r0 = " diff = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = X.C20800yB.A00(r2, r10, r9)
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0021
            java.lang.String r0 = "OfflineResumeHandler/onOfflineComplete Cleaning up zombie calls"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r0 = X.C27631Pa.A00(r8)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r7, r1)
            r0.apply()
            r1 = 0
            r0 = 0
            android.os.Message r3 = android.os.Message.obtain(r1, r0, r6)
            X.1PW r2 = r5.A04
            java.lang.String r1 = "check_ongoing_calls"
            X.6Up r0 = new X.6Up
            r0.<init>((android.os.Message) r3, (java.lang.String) r1)
            r2.A00(r0)
            return
        L_0x0159:
            java.lang.Object r3 = r13.A00
            X.1aL r3 = (X.C30521aL) r3
            X.1aP r2 = r3.A0G
            X.005 r0 = r2.A00
            java.lang.Object r0 = r0.get()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x016b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x017f
            java.lang.Object r0 = r1.next()
            X.6Ew r0 = (X.C129086Ew) r0
            java.util.Set r0 = r0.A03()
            r2.A00(r0)
            goto L_0x016b
        L_0x017f:
            X.1Jr r4 = r3.A0F
            X.0x8 r3 = r4.A03
            X.1Ju r0 = r4.A05
            int r2 = r0.A00()
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]
            X.0wo r0 = r3.A00
            long r0 = X.C19970wo.A00(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            r8[r0] = r1
            X.12P r0 = r3.A03
            X.1M0 r5 = r0.get()
            X.14e r7 = r5.A02     // Catch:{ all -> 0x09e7 }
            java.lang.String r0 = X.AnonymousClass3TN.A01     // Catch:{ all -> 0x09e7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x09e7 }
            r1.<init>()     // Catch:{ all -> 0x09e7 }
            java.lang.String r0 = "SELECT "
            r1.append(r0)     // Catch:{ all -> 0x09e7 }
            java.lang.String r9 = "message_add_on"
            java.lang.String r6 = "chat_row_id"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x09e7 }
            r0 = 0
            r3[r0] = r6     // Catch:{ all -> 0x09e7 }
            java.lang.String r0 = X.AnonymousClass1M2.A01(r9, r3)     // Catch:{ all -> 0x09e7 }
            r1.append(r0)     // Catch:{ all -> 0x09e7 }
            java.lang.String r0 = " FROM "
            r1.append(r0)     // Catch:{ all -> 0x09e7 }
            r1.append(r9)     // Catch:{ all -> 0x09e7 }
            java.lang.String r0 = " JOIN "
            r1.append(r0)     // Catch:{ all -> 0x09e7 }
            java.lang.String r0 = "message_add_on_pin_in_chat"
            r1.append(r0)     // Catch:{ all -> 0x09e7 }
            java.lang.String r0 = " ON "
            r1.append(r0)     // Catch:{ all -> 0x09e7 }
            java.lang.String r0 = "message_add_on._id = message_add_on_pin_in_chat.message_add_on_row_id"
            r1.append(r0)     // Catch:{ all -> 0x09e7 }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ all -> 0x09e7 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x09e7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x09e7 }
            r1.<init>()     // Catch:{ all -> 0x09e7 }
            java.lang.String r0 = " HAVING COUNT(*) > "
            r1.append(r0)     // Catch:{ all -> 0x09e7 }
            r1.append(r2)     // Catch:{ all -> 0x09e7 }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x09e7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x09e7 }
            r1.<init>()     // Catch:{ all -> 0x09e7 }
            r1.append(r3)     // Catch:{ all -> 0x09e7 }
            java.lang.String r0 = " WHERE message_add_on.message_add_on_type = 79 AND (message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0) AND message_add_on_pin_in_chat.pin_in_chat_state = 1"
            r1.append(r0)     // Catch:{ all -> 0x09e7 }
            java.lang.String r0 = " GROUP BY chat_row_id"
            r1.append(r0)     // Catch:{ all -> 0x09e7 }
            r1.append(r2)     // Catch:{ all -> 0x09e7 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x09e7 }
            java.lang.String r0 = "MessageAddOnStore/getChatRowIdsWithOverLimitPins"
            android.database.Cursor r3 = r7.A09(r1, r0, r8)     // Catch:{ all -> 0x09e7 }
            int r0 = r3.getCount()     // Catch:{ all -> 0x09db }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x09db }
            r2.<init>(r0)     // Catch:{ all -> 0x09db }
        L_0x021c:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x09db }
            if (r0 == 0) goto L_0x0232
            int r0 = r3.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x09db }
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x09db }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x09db }
            r2.add(r0)     // Catch:{ all -> 0x09db }
            goto L_0x021c
        L_0x0232:
            r3.close()     // Catch:{ all -> 0x09e7 }
            r5.close()
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x0021
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageAddOnPinInChatManager/enforceLimitForEligibleChats/chatRowIds size:"
            r1.append(r0)
            int r0 = r2.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.12P r0 = r4.A02
            X.1M0 r5 = r0.A05()
            goto L_0x09b0
        L_0x025e:
            java.lang.Object r4 = r13.A00
            X.1aL r4 = (X.C30521aL) r4
            X.19B r0 = r4.A0N
            X.9WB r3 = r0.A04()
            if (r3 == 0) goto L_0x0021
            X.1MN r2 = r4.A0L
            r1 = 29
            X.1jD r0 = new X.1jD
            r0.<init>(r4, r3, r1)
            r2.A0B(r0)
            return
        L_0x0277:
            java.lang.Object r0 = r13.A00
            X.0zF r0 = (X.C21440zF) r0
            X.0zR r6 = r0.A06
            r5 = 1
            goto L_0x0284
        L_0x027f:
            java.lang.Object r6 = r13.A00
            X.0zR r6 = (X.C21560zR) r6
            r5 = 0
        L_0x0284:
            X.0zT r4 = r6.A01     // Catch:{ all -> 0x09f1 }
            java.util.concurrent.Semaphore r3 = r4.A04     // Catch:{ all -> 0x09f1 }
            boolean r0 = r3.tryAcquire()     // Catch:{ all -> 0x09f1 }
            if (r0 == 0) goto L_0x02a0
            java.lang.String r0 = ".gz"
            java.io.File[] r2 = X.C21580zT.A00(r4, r0)     // Catch:{ all -> 0x09f1 }
            r1 = 0
        L_0x0295:
            int r0 = r2.length     // Catch:{ all -> 0x09f1 }
            if (r1 >= r0) goto L_0x02a0
            r0 = r2[r1]     // Catch:{ all -> 0x09f1 }
            r4.A01(r0)     // Catch:{ all -> 0x09f1 }
            int r1 = r1 + 1
            goto L_0x0295
        L_0x02a0:
            r3.release()
            X.0zP r1 = r6.A00
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x0021
            X.0yC r3 = r1.A00
            r0 = 215(0xd7, float:3.01E-43)
            X.0yV r2 = X.C21000yV.A02
            int r0 = X.C20800yB.A00(r2, r3, r0)
            boolean r0 = X.C21560zR.A00(r6, r0)
            if (r0 != 0) goto L_0x02cf
            if (r5 == 0) goto L_0x0021
            r1 = 3950(0xf6e, float:5.535E-42)
            int r0 = X.C20800yB.A00(r2, r3, r1)
            if (r0 < 0) goto L_0x0021
            int r0 = X.C20800yB.A00(r2, r3, r1)
            boolean r0 = X.C21560zR.A00(r6, r0)
            if (r0 == 0) goto L_0x0021
        L_0x02cf:
            java.lang.Class<com.whatsapp.quicklog.QplUploadScheduler$QPLUploadWorker> r0 = com.whatsapp.quicklog.QplUploadScheduler$QPLUploadWorker.class
            X.4pE r5 = new X.4pE
            r5.<init>(r0)
            X.67f r0 = new X.67f
            r0.<init>()
            java.lang.Integer r4 = X.C023109s.A01
            r0.A00 = r4
            X.6Tb r0 = r0.A00()
            r5.A03(r0)
            r0 = 5
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MINUTES
            r5.A02(r0, r3)
            java.lang.Integer r2 = X.C023109s.A00
            r0 = 15
            r5.A05(r2, r3, r0)
            X.5s0 r2 = r5.A00()
            X.4pG r2 = (X.C97404pG) r2
            X.0zS r0 = r6.A02
            java.lang.Object r1 = r0.get()
            X.6VR r1 = (X.AnonymousClass6VR) r1
            java.lang.String r0 = "name.whatsapp.qpl.upload"
            r1.A07(r2, r4, r0)
            return
        L_0x0308:
            java.lang.Object r4 = r13.A00
            X.1Ww r4 = (X.C29501Ww) r4
            X.19g r3 = r4.A0I
            X.19l r0 = r3.A0K
            X.0v0 r0 = r0.A01
            boolean r0 = r0.A2H()
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "companion-device-manager/removeAllDevicesFromDatabase"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wk r2 = r3.A0L
            r1 = 41
            X.1j6 r0 = new X.1j6
            r0.<init>(r3, r1)
            r2.execute(r0)
            X.196 r1 = r4.A0B
            goto L_0x0a00
        L_0x032d:
            java.lang.Object r3 = r13.A00
            X.1Ww r3 = (X.C29501Ww) r3
            X.17Y r0 = r3.A04
            X.14r r2 = r0.A00
            if (r2 == 0) goto L_0x0341
            X.0yC r1 = r3.A0J
            X.1RU r0 = r3.A08
            boolean r0 = X.AnonymousClass3SK.A01(r2, r0, r1)
            if (r0 != 0) goto L_0x0021
        L_0x0341:
            r3.A0A()
            return
        L_0x0345:
            java.lang.Object r0 = r13.A00
            com.whatsapp.search.SearchViewModel r0 = (com.whatsapp.search.SearchViewModel) r0
            X.1SB r5 = r0.A06
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0021
            r0 = 1
            r5.A00 = r0
            X.00s r1 = r5.A07
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0C(r0)
            X.1Rz r3 = r5.A0C
            X.08S r4 = r5.A06
            X.08S r2 = r5.A05
            r1 = 12
            X.4ZI r0 = new X.4ZI
            r0.<init>(r5, r1)
            r3.A00(r0, r4, r2)
            X.00r r3 = r5.A02
            X.Amn r2 = new X.Amn
            r2.<init>(r5)
            r1 = 41
            X.3Ue r0 = new X.3Ue
            r0.<init>(r2, r1)
            r4.A0F(r3, r0)
            X.00r r3 = r5.A03
            X.Amo r2 = new X.Amo
            r2.<init>(r5)
            r1 = 38
            X.3Ue r0 = new X.3Ue
            r0.<init>(r2, r1)
            r4.A0F(r3, r0)
            X.00r r3 = r5.A01
            X.Amp r2 = new X.Amp
            r2.<init>(r5)
            r1 = 40
            X.3Ue r0 = new X.3Ue
            r0.<init>(r2, r1)
            r4.A0F(r3, r0)
            X.00r r3 = r5.A04
            X.Amq r2 = new X.Amq
            r2.<init>(r5)
            r1 = 39
            X.3Ue r0 = new X.3Ue
            r0.<init>(r2, r1)
            r4.A0F(r3, r0)
            return
        L_0x03b0:
            java.lang.Object r4 = r13.A00
            com.whatsapp.search.SearchViewModel r4 = (com.whatsapp.search.SearchViewModel) r4
            X.78v r9 = com.whatsapp.search.SearchViewModel.A01(r4)
            java.lang.Runnable r0 = r4.A0F
            if (r13 != r0) goto L_0x0021
            long r7 = r4.A00
            r5 = 0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x03e5
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SearchViewModel/firstResult: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Rg r1 = r4.A11
            r0 = 5
            r1.A00(r0, r2)
            r4.A00 = r5
        L_0x03e5:
            X.08S r0 = r4.A02
            r0.A0C(r9)
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A1F
            r3 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r3, r2)
            if (r0 == 0) goto L_0x03fd
            X.1Rs r1 = r4.A16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A0C(r0)
        L_0x03fd:
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A1E
            boolean r0 = r0.compareAndSet(r3, r2)
            if (r0 == 0) goto L_0x0021
            X.1Rs r1 = r4.A19
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.A0C(r0)
            return
        L_0x040f:
            java.lang.Object r2 = r13.A00
            X.1Cp r2 = (X.C24481Cp) r2
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0021
            X.16I r1 = r2.A06
            X.15j r0 = r2.A05
            r1.registerObserver(r0)
            X.1Cf r1 = r2.A09
            X.1Ct r0 = r2.A08
            r1.registerObserver(r0)
            X.17z r1 = r2.A0B
            X.1Cs r0 = r2.A0A
            r1.registerObserver(r0)
            r0 = 1
            r2.A01 = r0
            return
        L_0x0430:
            java.lang.Object r0 = r13.A00
            X.0wB r0 = (X.C19580wB) r0
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x043c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r1.next()
            X.6Fn r0 = (X.C129156Fn) r0
            r0.A03()
            goto L_0x043c
        L_0x044c:
            java.lang.Object r0 = r13.A00
            X.0wB r0 = (X.C19580wB) r0
            java.lang.Iterable r0 = r0.getObservers()
            X.AnonymousClass00C.A08(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x045b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r2.next()
            X.3NC r0 = (X.AnonymousClass3NC) r0
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = r0.A00
            X.00s r1 = r0.A01
            r0 = 0
            r1.A0D(r0)
            goto L_0x045b
        L_0x0470:
            r0 = 0
            r3.A03(r0, r2)
            return
        L_0x0475:
            java.lang.Object r0 = r13.A00
            X.1er r0 = (X.C33181er) r0
            X.1Db r1 = r0.A01
            X.1Ed r0 = r0.A00
            boolean r0 = r0.A0Z()
            r1.A0O(r0)
            return
        L_0x0485:
            java.lang.Object r0 = r13.A00
            X.11e r0 = (X.AnonymousClass11e) r0
            X.11f r5 = r0.A0I
            int r3 = r0.A01
            monitor-enter(r5)
            android.content.SharedPreferences r0 = X.C219211f.A00(r5)     // Catch:{ all -> 0x0613 }
            android.content.SharedPreferences$Editor r6 = r0.edit()     // Catch:{ all -> 0x0613 }
            android.content.SharedPreferences r2 = X.C219211f.A00(r5)     // Catch:{ all -> 0x0613 }
            r0 = 1
            if (r3 == r0) goto L_0x04a4
            r0 = 2
            if (r3 == r0) goto L_0x04a1
            goto L_0x04a7
        L_0x04a1:
            java.lang.String r1 = "warm_start_count_pref"
            goto L_0x04a9
        L_0x04a4:
            java.lang.String r1 = "fg_cold_start_count_pref"
            goto L_0x04a9
        L_0x04a7:
            java.lang.String r1 = "lukewarm_start_count_pref"
        L_0x04a9:
            r0 = 0
            int r0 = r2.getInt(r1, r0)     // Catch:{ all -> 0x0613 }
            int r0 = r0 + 1
            r6.putInt(r1, r0)     // Catch:{ all -> 0x0613 }
            r0 = 1
            if (r3 == r0) goto L_0x04bd
            r0 = 2
            if (r3 == r0) goto L_0x04ba
            goto L_0x04c0
        L_0x04ba:
            java.lang.String r4 = "last_warm_start_time_min"
            goto L_0x04c2
        L_0x04bd:
            java.lang.String r4 = "last_cold_start_time_min"
            goto L_0x04c2
        L_0x04c0:
            java.lang.String r4 = "last_lukewarm_start_time_min"
        L_0x04c2:
            X.0wo r0 = r5.A01     // Catch:{ all -> 0x0613 }
            long r2 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0613 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            r0 = 60
            long r2 = r2 / r0
            r0 = 10
            long r2 = r2 / r0
            long r2 = r2 * r0
            int r0 = (int) r2     // Catch:{ all -> 0x0613 }
            r6.putInt(r4, r0)     // Catch:{ all -> 0x0613 }
            r6.apply()     // Catch:{ all -> 0x0613 }
            goto L_0x0611
        L_0x04db:
            java.lang.Object r0 = r13.A00
            X.1Kl r0 = (X.C26511Kl) r0
            X.1Km r5 = r0.A01
            X.7TI r6 = new X.7TI
            r6.<init>(r0)
            monitor-enter(r5)
            X.0wG r0 = r5.A01     // Catch:{ all -> 0x0613 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0613 }
            java.io.File r1 = r0.getCacheDir()     // Catch:{ all -> 0x0613 }
            java.lang.String r0 = "fcs_config_cache_dir"
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0613 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x0613 }
            r1 = 10485760(0xa00000, double:5.180654E-317)
            r12 = 0
            X.5mi r0 = new X.5mi     // Catch:{ IOException -> 0x05fc }
            r0.<init>(r5)     // Catch:{ IOException -> 0x05fc }
            X.71z r0 = X.C1496071z.A01(r0, r3, r1)     // Catch:{ IOException -> 0x05fc }
            r5.A00 = r0     // Catch:{ all -> 0x0613 }
            java.util.Set r4 = r5.A03     // Catch:{ all -> 0x0613 }
            monitor-enter(r4)     // Catch:{ all -> 0x0613 }
            X.0wg r1 = r5.A02     // Catch:{ JSONException -> 0x0532 }
            java.lang.String r0 = "phoenix"
            android.content.SharedPreferences r2 = r1.A00(r0)     // Catch:{ JSONException -> 0x0532 }
            java.lang.String r1 = "fcs_config_cache_key_set"
            java.lang.String r0 = "[]"
            java.lang.String r0 = r2.getString(r1, r0)     // Catch:{ JSONException -> 0x0532 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0532 }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x0532 }
            r2 = 0
            int r1 = r3.length()     // Catch:{ JSONException -> 0x0532 }
        L_0x0522:
            if (r2 >= r1) goto L_0x0547
            java.lang.Object r0 = r3.get(r2)     // Catch:{ JSONException -> 0x0532 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0532 }
            r4.add(r0)     // Catch:{ JSONException -> 0x0532 }
            int r2 = r2 + 1
            goto L_0x0522
        L_0x0532:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05f9 }
            r1.<init>()     // Catch:{ all -> 0x05f9 }
            java.lang.String r0 = "FcsConfigDiskCache/buildConfigKeySet: "
            r1.append(r0)     // Catch:{ all -> 0x05f9 }
            r1.append(r2)     // Catch:{ all -> 0x05f9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05f9 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05f9 }
        L_0x0547:
            monitor-exit(r4)     // Catch:{ all -> 0x0613 }
            r0 = 10
            int r0 = X.AnonymousClass03U.A06(r4, r0)     // Catch:{ all -> 0x0613 }
            int r1 = X.C000300d.A02(r0)     // Catch:{ all -> 0x0613 }
            r0 = 16
            if (r1 >= r0) goto L_0x0558
            r1 = 16
        L_0x0558:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0613 }
            r3.<init>(r1)     // Catch:{ all -> 0x0613 }
            java.util.Iterator r11 = r4.iterator()     // Catch:{ all -> 0x0613 }
        L_0x0561:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0613 }
            if (r0 == 0) goto L_0x05ca
            java.lang.Object r4 = r11.next()     // Catch:{ all -> 0x0613 }
            r1 = r4
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0613 }
            X.71z r0 = r5.A00     // Catch:{ IOException -> 0x05b0 }
            if (r0 == 0) goto L_0x05c5
            X.71l r0 = r0.A0B(r1)     // Catch:{ IOException -> 0x05b0 }
            if (r0 == 0) goto L_0x05c5
            r1 = 0
            java.io.InputStream[] r0 = r0.A00     // Catch:{ IOException -> 0x05b0 }
            r10 = r0[r1]     // Catch:{ IOException -> 0x05b0 }
            if (r10 == 0) goto L_0x05c5
            r9 = 16384(0x4000, float:2.2959E-41)
            r8 = 0
            byte[] r7 = new byte[r9]     // Catch:{ IOException -> 0x05b0 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x05b0 }
            r2.<init>()     // Catch:{ IOException -> 0x05b0 }
        L_0x0589:
            int r1 = r10.read(r7, r8, r9)     // Catch:{ all -> 0x05a2 }
            r0 = -1
            if (r1 == r0) goto L_0x0594
            r2.write(r7, r8, r1)     // Catch:{ all -> 0x05a2 }
            goto L_0x0589
        L_0x0594:
            r10.close()     // Catch:{ all -> 0x05a9 }
            byte[] r0 = r2.toByteArray()     // Catch:{ all -> 0x05a9 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x05a9 }
            r2.close()     // Catch:{ IOException -> 0x05b0 }
            goto L_0x05c6
        L_0x05a2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x05a4 }
        L_0x05a4:
            r0 = move-exception
            X.C05600Qi.A00(r10, r1)     // Catch:{ all -> 0x05a9 }
            throw r0     // Catch:{ all -> 0x05a9 }
        L_0x05a9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x05ab }
        L_0x05ab:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ IOException -> 0x05b0 }
            throw r0     // Catch:{ IOException -> 0x05b0 }
        L_0x05b0:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0613 }
            r1.<init>()     // Catch:{ all -> 0x0613 }
            java.lang.String r0 = "FcsConfigDiskCache/populateInMemoryCache: "
            r1.append(r0)     // Catch:{ all -> 0x0613 }
            r1.append(r2)     // Catch:{ all -> 0x0613 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0613 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0613 }
        L_0x05c5:
            r0 = r12
        L_0x05c6:
            r3.put(r4, r0)     // Catch:{ all -> 0x0613 }
            goto L_0x0561
        L_0x05ca:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0613 }
            r4.<init>()     // Catch:{ all -> 0x0613 }
            java.util.Set r0 = r3.entrySet()     // Catch:{ all -> 0x0613 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0613 }
        L_0x05d7:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0613 }
            if (r0 == 0) goto L_0x05f5
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0613 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0613 }
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x0613 }
            if (r0 == 0) goto L_0x05d7
            java.lang.Object r1 = r2.getKey()     // Catch:{ all -> 0x0613 }
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x0613 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0613 }
            goto L_0x05d7
        L_0x05f5:
            r6.invoke(r4)     // Catch:{ all -> 0x0613 }
            goto L_0x0611
        L_0x05f9:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0613 }
            throw r0     // Catch:{ all -> 0x0613 }
        L_0x05fc:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0613 }
            r1.<init>()     // Catch:{ all -> 0x0613 }
            java.lang.String r0 = "FcsConfigDiskCache/init: "
            r1.append(r0)     // Catch:{ all -> 0x0613 }
            r1.append(r2)     // Catch:{ all -> 0x0613 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0613 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0613 }
        L_0x0611:
            monitor-exit(r5)
            return
        L_0x0613:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0616:
            java.lang.Object r0 = r13.A00
            X.00S r0 = (X.AnonymousClass00S) r0
            r0.invoke()
            return
        L_0x061e:
            java.lang.Object r4 = r13.A00
            X.0wj r4 = (X.C19920wj) r4
            java.lang.Object r3 = r4.A09
            monitor-enter(r3)
            boolean r0 = r4.A05     // Catch:{ all -> 0x0729 }
            if (r0 != 0) goto L_0x0727
            X.0wi r2 = r4.A07     // Catch:{ Exception -> 0x0707, all -> 0x0705 }
            java.util.Map r9 = r4.A04     // Catch:{ Exception -> 0x0707, all -> 0x0705 }
            java.lang.Object r5 = r2.A02     // Catch:{ Exception -> 0x0707, all -> 0x0705 }
            monitor-enter(r5)     // Catch:{ Exception -> 0x0707, all -> 0x0705 }
            java.io.File r1 = r2.A00     // Catch:{ all -> 0x0702 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0702 }
            if (r0 == 0) goto L_0x0640
            java.io.File r0 = r2.A01     // Catch:{ all -> 0x0702 }
            r0.delete()     // Catch:{ all -> 0x0702 }
            r1.renameTo(r0)     // Catch:{ all -> 0x0702 }
        L_0x0640:
            java.io.File r6 = r2.A01     // Catch:{ all -> 0x0702 }
            boolean r0 = r6.canRead()     // Catch:{ all -> 0x0702 }
            if (r0 == 0) goto L_0x0700
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ XmlPullParserException -> 0x06e6, IOException -> 0x06cc }
            r1.<init>(r6)     // Catch:{ XmlPullParserException -> 0x06e6, IOException -> 0x06cc }
            r0 = 16384(0x4000, float:2.2959E-41)
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ XmlPullParserException -> 0x06e6, IOException -> 0x06cc }
            r2.<init>(r1, r0)     // Catch:{ XmlPullParserException -> 0x06e6, IOException -> 0x06cc }
            org.xmlpull.v1.XmlPullParser r7 = android.util.Xml.newPullParser()     // Catch:{ all -> 0x06c2 }
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ all -> 0x06c2 }
            r7.setInput(r2, r0)     // Catch:{ all -> 0x06c2 }
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x06c2 }
            int r1 = r7.getEventType()     // Catch:{ all -> 0x06c2 }
        L_0x0664:
            r0 = 2
            if (r1 != r0) goto L_0x0668
            goto L_0x067d
        L_0x0668:
            r0 = 3
            if (r1 == r0) goto L_0x068c
            r0 = 4
            if (r1 == r0) goto L_0x06a7
            int r1 = r7.next()     // Catch:{ all -> 0x06c2 }
            r0 = 1
            if (r1 != r0) goto L_0x0664
            java.lang.String r0 = "Unexpected end of document"
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x06c2 }
            r1.<init>(r0)     // Catch:{ all -> 0x06c2 }
            goto L_0x06c1
        L_0x067d:
            java.lang.Object r0 = X.AnonymousClass6R6.A00(r7, r8)     // Catch:{ all -> 0x06c2 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x06c2 }
            if (r0 == 0) goto L_0x0688
            r9.putAll(r0)     // Catch:{ all -> 0x06c2 }
        L_0x0688:
            r2.close()     // Catch:{ XmlPullParserException -> 0x06e6, IOException -> 0x06cc }
            goto L_0x0700
        L_0x068c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06c2 }
            r1.<init>()     // Catch:{ all -> 0x06c2 }
            java.lang.String r0 = "Unexpected end tag at: "
            r1.append(r0)     // Catch:{ all -> 0x06c2 }
            java.lang.String r0 = r7.getName()     // Catch:{ all -> 0x06c2 }
            r1.append(r0)     // Catch:{ all -> 0x06c2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x06c2 }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x06c2 }
            r1.<init>(r0)     // Catch:{ all -> 0x06c2 }
            goto L_0x06c1
        L_0x06a7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06c2 }
            r1.<init>()     // Catch:{ all -> 0x06c2 }
            java.lang.String r0 = "Unexpected text: "
            r1.append(r0)     // Catch:{ all -> 0x06c2 }
            java.lang.String r0 = r7.getText()     // Catch:{ all -> 0x06c2 }
            r1.append(r0)     // Catch:{ all -> 0x06c2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x06c2 }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x06c2 }
            r1.<init>(r0)     // Catch:{ all -> 0x06c2 }
        L_0x06c1:
            throw r1     // Catch:{ all -> 0x06c2 }
        L_0x06c2:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x06c7 }
            goto L_0x06cb
        L_0x06c7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ XmlPullParserException -> 0x06e6, IOException -> 0x06cc }
        L_0x06cb:
            throw r1     // Catch:{ XmlPullParserException -> 0x06e6, IOException -> 0x06cc }
        L_0x06cc:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0702 }
            r1.<init>()     // Catch:{ all -> 0x0702 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Cannot read "
            r1.append(r0)     // Catch:{ all -> 0x0702 }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ all -> 0x0702 }
            r1.append(r0)     // Catch:{ all -> 0x0702 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0702 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0702 }
            goto L_0x06ff
        L_0x06e6:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0702 }
            r1.<init>()     // Catch:{ all -> 0x0702 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Parsing error while reading "
            r1.append(r0)     // Catch:{ all -> 0x0702 }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ all -> 0x0702 }
            r1.append(r0)     // Catch:{ all -> 0x0702 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0702 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0702 }
        L_0x06ff:
            throw r2     // Catch:{ all -> 0x0702 }
        L_0x0700:
            monitor-exit(r5)     // Catch:{ all -> 0x0702 }
            goto L_0x0721
        L_0x0702:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0702 }
            throw r0     // Catch:{ Exception -> 0x0707, all -> 0x0705 }
        L_0x0705:
            r0 = move-exception
            goto L_0x071f
        L_0x0707:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0729 }
            r1.<init>()     // Catch:{ all -> 0x0729 }
            java.lang.String r0 = "LightSharedPreferencesImpl/Cannot read preferences from "
            r1.append(r0)     // Catch:{ all -> 0x0729 }
            X.0wi r0 = r4.A07     // Catch:{ all -> 0x0729 }
            r1.append(r0)     // Catch:{ all -> 0x0729 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0729 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0729 }
            goto L_0x0721
        L_0x071f:
            r4.A03 = r0     // Catch:{ all -> 0x0729 }
        L_0x0721:
            r0 = 1
            r4.A05 = r0     // Catch:{ all -> 0x0729 }
            r3.notifyAll()     // Catch:{ all -> 0x0729 }
        L_0x0727:
            monitor-exit(r3)     // Catch:{ all -> 0x0729 }
            return
        L_0x0729:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0729 }
            throw r0
        L_0x072c:
            java.lang.Object r0 = r13.A00
            X.1Nx r0 = (X.C27361Nx) r0
            r0.A05()
            return
        L_0x0734:
            java.lang.Object r1 = r13.A00
            X.1Dj r1 = (X.C24681Dj) r1
            X.1Dn r5 = r1.A08
            r0 = 0
            r5.A01(r0, r0)
            X.1Dl r0 = r1.A06
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = r0.A04
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x074f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0770
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            X.1gr r0 = (X.C34331gr) r0
            if (r0 == 0) goto L_0x074f
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x074f
            r4.add(r2)
            goto L_0x074f
        L_0x0770:
            int[] r0 = X.C34881hn.A00(r4)
            r5.A02(r0)
            return
        L_0x0778:
            java.lang.Object r0 = r13.A00
            java.io.File r0 = (java.io.File) r0
            boolean r2 = X.AnonymousClass6YY.A0Q(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "UserNoticeContentManager/deleteContentFromDir/deleted result "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            goto L_0x086c
        L_0x0793:
            java.lang.Object r9 = r13.A00
            X.1Z8 r9 = (X.AnonymousClass1Z8) r9
            java.lang.Object r8 = r9.A07
            monitor-enter(r8)
            X.1Wl r2 = r9.A06     // Catch:{ all -> 0x081a }
            X.C29391Wl.A01(r2)     // Catch:{ all -> 0x081a }
            X.1Z9 r1 = r9.A05     // Catch:{ all -> 0x081a }
            X.00T r0 = r1.A09     // Catch:{ all -> 0x081a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x081a }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x081a }
            X.C000400e.A0B(r0)     // Catch:{ all -> 0x081a }
            X.00T r0 = r1.A07     // Catch:{ all -> 0x081a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x081a }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x081a }
            X.C000400e.A0B(r0)     // Catch:{ all -> 0x081a }
            X.00T r0 = r1.A06     // Catch:{ all -> 0x081a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x081a }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x081a }
            X.C000400e.A0B(r0)     // Catch:{ all -> 0x081a }
            X.00T r0 = r1.A08     // Catch:{ all -> 0x081a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x081a }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x081a }
            X.C000400e.A0B(r0)     // Catch:{ all -> 0x081a }
            java.util.ArrayList r0 = r2.A02()     // Catch:{ all -> 0x081a }
            r0.size()     // Catch:{ all -> 0x081a }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x081a }
        L_0x07d8:
            boolean r1 = r12.hasNext()     // Catch:{ all -> 0x081a }
            r0 = 1
            if (r1 == 0) goto L_0x0813
            java.lang.Object r7 = r12.next()     // Catch:{ all -> 0x081a }
            X.3Pa r7 = (X.C64683Pa) r7     // Catch:{ all -> 0x081a }
            X.0wo r0 = r9.A02     // Catch:{ all -> 0x081a }
            long r3 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x081a }
            long r5 = r7.A02     // Catch:{ all -> 0x081a }
            X.38g r0 = r7.A05     // Catch:{ all -> 0x081a }
            X.6Pi r0 = r0.A01     // Catch:{ all -> 0x081a }
            X.68z r11 = r0.A02     // Catch:{ all -> 0x081a }
            X.6AX r10 = r0.A00     // Catch:{ all -> 0x081a }
            X.68z r0 = r0.A01     // Catch:{ all -> 0x081a }
            if (r0 == 0) goto L_0x07d8
            long r1 = r0.A00     // Catch:{ all -> 0x081a }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0805
            r0 = 999(0x3e7, float:1.4E-42)
            r9.A01(r7, r0)     // Catch:{ all -> 0x081a }
            goto L_0x07d8
        L_0x0805:
            if (r10 != 0) goto L_0x07d8
            if (r11 != 0) goto L_0x07d8
            r1 = -1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x07d8
            r9.A02(r7, r3)     // Catch:{ all -> 0x081a }
            goto L_0x07d8
        L_0x0813:
            r9.A09 = r0     // Catch:{ all -> 0x081a }
            r8.notify()     // Catch:{ all -> 0x081a }
            monitor-exit(r8)     // Catch:{ all -> 0x081a }
            return
        L_0x081a:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x081a }
            throw r0
        L_0x081d:
            java.lang.Object r2 = r13.A00
            X.1bV r2 = (X.C31241bV) r2
            X.1Ja r0 = r2.A02
            java.util.List r0 = r0.A05()
            java.util.Iterator r1 = r0.iterator()
        L_0x082b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x084c
            java.lang.Object r4 = r1.next()
            X.1Uw r4 = (X.C28981Uw) r4
            X.1Zi r0 = r2.A05
            r5 = 0
            r8 = 0
            X.AnonymousClass00C.A0D(r4, r8)
            X.164 r0 = r0.A0B
            r6 = 1
            X.8fK r3 = new X.8fK
            r7 = 1
            r9 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.A01(r3)
            goto L_0x082b
        L_0x084c:
            X.1Zi r1 = r2.A05
            r0 = 1
            r1.A0D(r0)
            return
        L_0x0853:
            java.lang.Object r1 = r13.A00
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 9
            android.os.Process.setThreadPriority(r0)
            r1.run()
            return
        L_0x0860:
            java.lang.Object r0 = r13.A00
            X.19O r0 = (X.AnonymousClass19O) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A0E
            r0 = 0
            r1.set(r0)
            java.lang.String r0 = "XmppConnectionMetrics/onOfflineResumeComplete"
        L_0x086c:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0870:
            java.lang.Object r0 = r13.A00
            X.1aL r0 = (X.C30521aL) r0
            X.1SL r1 = r0.A0Q
            r0 = 0
            r1.A03(r0)
            return
        L_0x087b:
            java.lang.Object r0 = r13.A00
            X.1aL r0 = (X.C30521aL) r0
            X.1MM r2 = r0.A0T
            X.0wG r0 = r0.A08
            android.content.Context r1 = r0.A00
            java.lang.Class<com.whatsapp.service.GcmFGService> r0 = com.whatsapp.service.GcmFGService.class
            r2.A01(r1, r0)
            return
        L_0x088b:
            java.lang.Object r0 = r13.A00
            X.1Ug r0 = (X.C28841Ug) r0
            X.0zE r2 = r0.A00
            r1 = 630(0x276, float:8.83E-43)
            r0 = 1
            r2.endAllMarkers(r1, r0)
            r1 = 113(0x71, float:1.58E-43)
            r0 = 300000(0x493e0, float:4.2039E-40)
            r2.B6V(r0, r1)
            return
        L_0x08a0:
            java.lang.Object r0 = r13.A00
            X.0zE r0 = (X.C21430zE) r0
            r0.Bxa()
            return
        L_0x08a8:
            java.lang.Object r7 = r13.A00
            X.1QG r7 = (X.AnonymousClass1QG) r7
            java.lang.Iterable r0 = r7.getObservers()
            java.util.Iterator r6 = r0.iterator()
        L_0x08b4:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x08db
            java.lang.Object r0 = r6.next()
            X.32m r0 = (X.C590632m) r0
            int r5 = r7.A00
            int r4 = r7.A01
            X.1ud r3 = r0.A00
            X.00s r2 = r3.A01
            r0 = 2
            int[] r1 = new int[r0]
            r0 = 0
            r1[r0] = r5
            r0 = 1
            r1[r0] = r4
            r2.A0C(r1)
            X.C40031ud.A02(r3)
            X.C40031ud.A03(r3)
            goto L_0x08b4
        L_0x08db:
            X.17Y r3 = r7.A03
            java.lang.Runnable r2 = r7.A02
            r0 = 500(0x1f4, double:2.47E-321)
            r3.A0I(r2, r0)
            return
        L_0x08e5:
            java.lang.Object r0 = r13.A00
            X.1BS r0 = (X.AnonymousClass1BS) r0
            X.AnonymousClass1BS.A09(r0)
            return
        L_0x08ed:
            java.lang.Object r0 = r13.A00
            X.1BS r0 = (X.AnonymousClass1BS) r0
            r0.A0D()
            return
        L_0x08f5:
            java.lang.Object r0 = r13.A00
            com.whatsapp.search.SearchViewModel r0 = (com.whatsapp.search.SearchViewModel) r0
            X.1S6 r2 = r0.A0z
            X.0xu r1 = r2.A0C
            X.1S3 r0 = r2.A0G
            r1.A0L(r0)
            X.1S3 r0 = r2.A0H
            r1.A0L(r0)
            return
        L_0x0908:
            java.lang.Object r4 = r13.A00
            X.1MM r4 = (X.AnonymousClass1MM) r4
            monitor-enter(r4)
            java.util.Set r0 = r4.A01     // Catch:{ all -> 0x0938 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0938 }
        L_0x0913:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0938 }
            if (r0 == 0) goto L_0x0936
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0938 }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x0938 }
            java.util.Map r1 = r4.A00     // Catch:{ all -> 0x0938 }
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x0938 }
            X.5K8 r0 = (X.AnonymousClass5K8) r0     // Catch:{ all -> 0x0938 }
            if (r0 == 0) goto L_0x0913
            boolean r0 = r0.A03()     // Catch:{ all -> 0x0938 }
            if (r0 == 0) goto L_0x0932
            r1.remove(r2)     // Catch:{ all -> 0x0938 }
        L_0x0932:
            r3.remove()     // Catch:{ all -> 0x0938 }
            goto L_0x0913
        L_0x0936:
            monitor-exit(r4)     // Catch:{ all -> 0x0938 }
            return
        L_0x0938:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0938 }
            throw r0
        L_0x093b:
            java.lang.Object r0 = r13.A00
            X.1dR r0 = (X.C32371dR) r0
            java.util.LinkedHashMap r0 = r0.A03
            r0.clear()
            return
        L_0x0945:
            java.lang.Object r0 = r13.A00
            X.7jl r0 = (X.C159687jl) r0
            r0.Bhi()
            return
        L_0x094d:
            java.lang.Object r1 = r13.A00
            X.1Bk r1 = (X.C24181Bk) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.A00()
            return
        L_0x0959:
            java.lang.Object r0 = r13.A00
            X.1J5 r0 = (X.AnonymousClass1J5) r0
            X.AnonymousClass1J5.A04(r0)
            return
        L_0x0961:
            java.lang.Object r0 = r13.A00
            X.1J5 r0 = (X.AnonymousClass1J5) r0
            X.AnonymousClass1J5.A03(r0)
            return
        L_0x0969:
            java.lang.Object r0 = r13.A00
            X.1J5 r0 = (X.AnonymousClass1J5) r0
            r0.A07()
            return
        L_0x0971:
            java.lang.Object r2 = r13.A00
            X.18b r2 = (X.C233318b) r2
            r0 = 64
            r2.A02(r0)
            return
        L_0x097b:
            X.0wG r0 = r5.A03     // Catch:{ Exception -> 0x0995, all -> 0x09a2 }
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x0995, all -> 0x09a2 }
            X.61c r2 = X.AnonymousClass6OC.A00(r0)     // Catch:{ Exception -> 0x0995, all -> 0x09a2 }
            boolean r0 = r2.A01     // Catch:{ Exception -> 0x0995, all -> 0x09a2 }
            if (r0 != 0) goto L_0x0995
            X.2NB r1 = new X.2NB     // Catch:{ Exception -> 0x0995, all -> 0x09a2 }
            r1.<init>()     // Catch:{ Exception -> 0x0995, all -> 0x09a2 }
            java.lang.String r0 = r2.A00     // Catch:{ Exception -> 0x0995, all -> 0x09a2 }
            r1.A00 = r0     // Catch:{ Exception -> 0x0995, all -> 0x09a2 }
            X.0yW r0 = r5.A05     // Catch:{ Exception -> 0x0995, all -> 0x09a2 }
            r0.Blv(r1)     // Catch:{ Exception -> 0x0995, all -> 0x09a2 }
        L_0x0995:
            r1 = 1
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r4)
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r3, r1)
            r0.apply()
            return
        L_0x09a2:
            r2 = move-exception
            r1 = 1
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r4)
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r3, r1)
            r0.apply()
            throw r2
        L_0x09b0:
            X.71s r3 = r5.B1k()     // Catch:{ all -> 0x09e7 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x09d6 }
        L_0x09b8:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x09d6 }
            if (r0 == 0) goto L_0x09cc
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x09d6 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x09d6 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x09d6 }
            r4.A01(r3, r5, r0)     // Catch:{ all -> 0x09d6 }
            goto L_0x09b8
        L_0x09cc:
            r3.A00()     // Catch:{ all -> 0x09d6 }
            r3.close()     // Catch:{ all -> 0x09e7 }
            r5.close()
            return
        L_0x09d6:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x09e2 }
            goto L_0x09e6
        L_0x09db:
            r1 = move-exception
            if (r3 == 0) goto L_0x09e6
            r3.close()     // Catch:{ all -> 0x09e2 }
            goto L_0x09e6
        L_0x09e2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x09e7 }
        L_0x09e6:
            throw r1     // Catch:{ all -> 0x09e7 }
        L_0x09e7:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x09ec }
            throw r1
        L_0x09ec:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x09f1:
            r1 = move-exception
            X.0zT r0 = r6.A01
            java.util.concurrent.Semaphore r0 = r0.A04
            r0.release()
            throw r1
        L_0x09fa:
            java.lang.Object r0 = r13.A00
            X.1Ww r0 = (X.C29501Ww) r0
            X.196 r1 = r0.A0B
        L_0x0a00:
            r0 = 6
            r1.A0I(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35731jA.run():void");
    }

    public C35731jA(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
