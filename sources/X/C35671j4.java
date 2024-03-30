package X;

/* renamed from: X.1j4  reason: invalid class name and case insensitive filesystem */
public class C35671j4 implements Runnable {
    public Object A00;
    public final int A01;

    public C35671j4(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:182:0x046b, code lost:
        r1.A0G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x046e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x05ef, code lost:
        r0.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x05f2, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:309:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r1 = r23
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x063d;
                case 1: goto L_0x0635;
                case 2: goto L_0x062d;
                case 3: goto L_0x0607;
                case 4: goto L_0x05fb;
                case 5: goto L_0x05f3;
                case 6: goto L_0x05eb;
                case 7: goto L_0x02d5;
                case 8: goto L_0x05e3;
                case 9: goto L_0x05db;
                case 10: goto L_0x0291;
                case 11: goto L_0x05d1;
                case 12: goto L_0x05c7;
                case 13: goto L_0x05b7;
                case 14: goto L_0x05ab;
                case 15: goto L_0x059d;
                case 16: goto L_0x058c;
                case 17: goto L_0x0582;
                case 18: goto L_0x0576;
                case 19: goto L_0x0537;
                case 20: goto L_0x0527;
                case 21: goto L_0x051f;
                case 22: goto L_0x0512;
                case 23: goto L_0x04a9;
                case 24: goto L_0x04a0;
                case 25: goto L_0x0275;
                case 26: goto L_0x0263;
                case 27: goto L_0x0107;
                case 28: goto L_0x046f;
                case 29: goto L_0x045f;
                case 30: goto L_0x0455;
                case 31: goto L_0x00e1;
                case 32: goto L_0x00c1;
                case 33: goto L_0x044b;
                case 34: goto L_0x0427;
                case 35: goto L_0x0007;
                case 36: goto L_0x041a;
                case 37: goto L_0x0007;
                case 38: goto L_0x03c1;
                case 39: goto L_0x0090;
                case 40: goto L_0x03b1;
                case 41: goto L_0x03a9;
                case 42: goto L_0x039d;
                case 43: goto L_0x0392;
                case 44: goto L_0x0348;
                case 45: goto L_0x0332;
                case 46: goto L_0x0318;
                case 47: goto L_0x002b;
                case 48: goto L_0x0307;
                case 49: goto L_0x000f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            X.0xH r0 = (X.C20260xH) r0
            r0.A05()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r0 = r1.A00
            X.0wB r0 = (X.C19580wB) r0
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x001b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r1.next()
            X.16B r0 = (X.AnonymousClass16B) r0
            r0.BUY()
            goto L_0x001b
        L_0x002b:
            java.lang.Object r7 = r1.A00
            X.0xY r7 = (X.C20430xY) r7
            X.0wQ r0 = r7.A02
            boolean r0 = r0.A0L()
            r9 = 0
            X.1O6 r8 = r7.A06
            if (r0 == 0) goto L_0x006c
            android.content.SharedPreferences r4 = X.AnonymousClass1O6.A00(r8)
            android.content.SharedPreferences r3 = X.AnonymousClass1O6.A00(r8)
            java.lang.String r2 = "contact_full_sync_wait"
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r1 = r3.getLong(r2, r0)
            java.lang.String r0 = "status_full_sync_wait"
            long r1 = r4.getLong(r0, r1)
        L_0x0052:
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x000e
        L_0x0056:
            X.0yC r2 = r7.A08
            r1 = 4097(0x1001, float:5.741E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = "contactsyncmethods/onHandlerOfflineProcessComplete full sync after offline complete"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r7.A0A(r0)
            return
        L_0x006c:
            android.content.SharedPreferences r0 = X.AnonymousClass1O6.A00(r8)
            java.lang.String r6 = "contact_full_sync_wait"
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            long r1 = r0.getLong(r6, r4)
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0056
            android.content.SharedPreferences r3 = X.AnonymousClass1O6.A00(r8)
            android.content.SharedPreferences r0 = X.AnonymousClass1O6.A00(r8)
            long r1 = r0.getLong(r6, r4)
            java.lang.String r0 = "sidelist_full_sync_wait"
            long r1 = r3.getLong(r0, r1)
            goto L_0x0052
        L_0x0090:
            java.lang.Object r3 = r1.A00
            X.0xH r3 = (X.C20260xH) r3
            monitor-enter(r3)
            r2 = 0
            X.13g r0 = r3.A0P     // Catch:{ all -> 0x0645 }
            r0.A01(r2)     // Catch:{ all -> 0x0645 }
            X.005 r0 = r3.A0n     // Catch:{ all -> 0x0645 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0645 }
            X.0y3 r1 = (X.C20720y3) r1     // Catch:{ all -> 0x0645 }
            r0 = 16
            r1.A0G(r2, r0)     // Catch:{ all -> 0x0645 }
            monitor-exit(r3)     // Catch:{ all -> 0x0645 }
            java.lang.Iterable r0 = r3.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x00b1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r1.next()
            X.3LD r0 = (X.AnonymousClass3LD) r0
            r0.A01()
            goto L_0x00b1
        L_0x00c1:
            java.lang.Object r2 = r1.A00
            X.196 r2 = (X.AnonymousClass196) r2
            X.0wQ r0 = r2.A06
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x000e
            X.1AE r1 = r2.A0T
            java.lang.String r0 = "primary_feature"
            X.1LZ r0 = r1.A00(r0)
            X.8YB r0 = (X.AnonymousClass8YB) r0
            if (r0 == 0) goto L_0x000e
            java.util.List r0 = r0.A0J()
            r2.A0M(r0)
            return
        L_0x00e1:
            java.lang.Object r2 = r1.A00
            X.196 r2 = (X.AnonymousClass196) r2
            X.1Ie r0 = r2.A09
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x00fd
            X.0wQ r0 = r2.A06
            boolean r0 = r0.A0L()
            r1 = 1
            r0 = r0 ^ 1
            X.C18740tg.A0B(r0)
            r2.A0I(r1)
            return
        L_0x00fd:
            boolean r0 = r2.A0S()
            if (r0 == 0) goto L_0x000e
            r2.A0G()
            return
        L_0x0107:
            java.lang.Object r4 = r1.A00
            X.1aX r4 = (X.C30641aX) r4
            java.lang.String r10 = "NonMessageDataRequestManager/dailyCheck invalid deviceId"
            X.1AI r1 = r4.A0B
            r0 = 70
            java.util.ArrayList r0 = r1.A04(r0)
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x011e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0134
            java.lang.Object r1 = r2.next()
            X.5J8 r1 = (X.AnonymousClass5J8) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x011e
            java.util.Set r0 = r1.A01
            r9.addAll(r0)
            goto L_0x011e
        L_0x0134:
            X.1ai r8 = r4.A0C
            X.C18740tg.A00()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            X.18P r0 = r8.A00
            X.1M0 r6 = r0.get()
            X.14e r5 = r6.A02     // Catch:{ all -> 0x0654 }
            java.lang.String r3 = "SELECT file_key, rmr_source, failure_count, response_device_id, last_fetch_timestamp FROM rmr_response_error"
            r2 = 0
            java.lang.String r0 = "RequestMediaReUploadResponseErrorStore.GET_ALL_RESPONSE"
            android.database.Cursor r2 = r5.A09(r3, r0, r2)     // Catch:{ all -> 0x0654 }
        L_0x014f:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0648 }
            if (r0 == 0) goto L_0x015d
            X.3Rf r0 = X.C65223Rf.A00(r2)     // Catch:{ all -> 0x0648 }
            r1.add(r0)     // Catch:{ all -> 0x0648 }
            goto L_0x014f
        L_0x015d:
            r2.close()     // Catch:{ all -> 0x0654 }
            r6.close()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            X.17i r0 = r4.A0A
            X.0y7 r6 = r0.A02()
            X.0wQ r0 = r4.A00
            r0.A0G()
            com.whatsapp.jid.PhoneUserJid r5 = r0.A03
            int r3 = r0.A04()
            X.0wo r0 = r4.A07
            long r21 = X.C19970wo.A00(r0)
            java.util.Iterator r20 = r1.iterator()
        L_0x0183:
            boolean r0 = r20.hasNext()
            r19 = 0
            if (r0 == 0) goto L_0x023d
            java.lang.Object r14 = r20.next()
            X.3Rf r14 = (X.C65223Rf) r14
            java.lang.String r2 = r14.A04
            boolean r0 = r9.contains(r2)
            if (r0 == 0) goto L_0x01ae
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "NonMessageDataRequestManager/dailyCheck request inFlight="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0183
        L_0x01ae:
            int r13 = r14.A03
            if (r13 == 0) goto L_0x01c8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "NonMessageDataRequestManager/dailyCheck invalid rmr source="
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r19 = 1
        L_0x01c8:
            r11 = 0
            int r12 = r14.A02     // Catch:{ 0wR -> 0x01d2 }
            X.13u r0 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ 0wR -> 0x01d2 }
            com.whatsapp.jid.DeviceJid r11 = r0.A01(r5, r12)     // Catch:{ 0wR -> 0x01d2 }
            goto L_0x01e9
        L_0x01d2:
            r1 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            int r12 = r14.A02
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r1)
            r19 = 1
        L_0x01e9:
            if (r12 == r3) goto L_0x01f1
            boolean r0 = r6.contains(r11)
            if (r0 != 0) goto L_0x0205
        L_0x01f1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r19 = 1
        L_0x0205:
            long r0 = r14.A01
            long r17 = r21 - r0
            r15 = 172800000(0xa4cb800, double:8.53745436E-316)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x0238
            int r1 = r14.A00
            r0 = 3
            if (r1 > r0) goto L_0x0238
            if (r19 != 0) goto L_0x0238
            if (r11 == 0) goto L_0x0238
            r9.add(r2)
            boolean r0 = r7.containsKey(r11)
            if (r0 != 0) goto L_0x022a
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r7.put(r11, r0)
        L_0x022a:
            java.lang.Object r0 = r7.get(r11)
            X.C18740tg.A06(r0)
            java.util.Set r0 = (java.util.Set) r0
            r0.add(r2)
            goto L_0x0183
        L_0x0238:
            r8.A01(r2, r13, r12)
            goto L_0x0183
        L_0x023d:
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x0245:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            X.1ah r2 = r4.A04
            java.lang.Object r1 = r0.getKey()
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            r2.A00(r1, r0)
            goto L_0x0245
        L_0x0263:
            java.lang.Object r1 = r1.A00
            X.1C3 r1 = (X.AnonymousClass1C3) r1
            X.1Hi r0 = r1.A0C
            X.6E9 r0 = r0.A02()
            if (r0 == 0) goto L_0x000e
            X.1Hp r0 = r1.A02
            r0.A00()
            return
        L_0x0275:
            java.lang.Object r0 = r1.A00
            X.0wB r0 = (X.C19580wB) r0
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x0281:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r1.next()
            X.193 r0 = (X.AnonymousClass193) r0
            r0.Bir()
            goto L_0x0281
        L_0x0291:
            java.lang.Object r6 = r1.A00
            X.1ep r6 = (X.C33161ep) r6
            java.util.concurrent.atomic.AtomicReference r8 = r6.A0J
            java.lang.Object r0 = r8.get()
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            X.0wD r1 = r6.A0E
            r0 = 1
            int r5 = r1.A03(r0)
            r2 = 100
            r0 = 10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r1 = 2
            r0 = 28
            if (r7 != r0) goto L_0x02c3
            if (r5 == r1) goto L_0x02b9
            if (r5 != 0) goto L_0x000e
        L_0x02b9:
            r8.set(r4)
            int r0 = r6.A00
            long r0 = (long) r0
            r6.Bah(r0, r2)
            return
        L_0x02c3:
            r0 = 16
            if (r7 != r0) goto L_0x000e
            if (r5 == r1) goto L_0x02cb
            if (r5 != 0) goto L_0x000e
        L_0x02cb:
            r8.set(r4)
            int r0 = r6.A00
            long r0 = (long) r0
            r6.BRw(r0, r2)
            return
        L_0x02d5:
            java.lang.Object r1 = r1.A00
            X.1ei r1 = (X.C33101ei) r1
            X.0wG r0 = r1.A0K
            android.content.Context r0 = r0.A00
            boolean r0 = X.C34191gb.A08(r0)
            if (r0 == 0) goto L_0x000e
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0Q
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x065e
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0T
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x065e
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0S
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x065e
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0R
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x065e
            r1.A04()
            return
        L_0x0307:
            java.lang.Object r0 = r1.A00
            X.16K r0 = (X.AnonymousClass16K) r0
            X.16L r0 = r0.A02
            X.1SZ r0 = r0.A01()
            r1 = 0
            X.1PN r0 = r0.A02
            r0.A07(r1)
            return
        L_0x0318:
            java.lang.Object r1 = r1.A00
            X.0xY r1 = (X.C20430xY) r1
            r1.A07()     // Catch:{ RuntimeException -> 0x0320 }
            goto L_0x0331
        L_0x0320:
            r0 = move-exception
            java.lang.String r3 = "contactsyncmethods/forceSyncIfNeeded"
            com.whatsapp.util.Log.e(r3, r0)
            X.0wN r2 = r1.A01
            java.lang.String r1 = r0.getMessage()
            r0 = 1
            r2.A0E(r3, r1, r0)
            return
        L_0x0331:
            return
        L_0x0332:
            java.lang.Object r3 = r1.A00
            X.1a7 r3 = (X.C30381a7) r3
            X.1O6 r0 = r3.A0C
            r0.A01()
            X.0wU r2 = r3.A0T
            r1 = 44
            X.1j4 r0 = new X.1j4
            r0.<init>(r3, r1)
            r2.Boy(r0)
            return
        L_0x0348:
            java.lang.Object r0 = r1.A00
            X.1a7 r0 = (X.C30381a7) r0
            X.0xY r5 = r0.A0B
            r4 = 0
            X.0wQ r0 = r5.A02
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x0386
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.16D r0 = r5.A04
            java.util.ArrayList r0 = r0.A0H()
            java.util.Iterator r2 = r0.iterator()
        L_0x0366:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x037e
            java.lang.Object r1 = r2.next()
            X.141 r1 = (X.AnonymousClass141) r1
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x0366
            r3.add(r0)
            goto L_0x0366
        L_0x037e:
            X.5Tu r1 = X.C108515Tu.A04
            X.6NS r0 = X.AnonymousClass6NS.A0D
            X.C20430xY.A01(r5, r0, r1, r3, r4)
            return
        L_0x0386:
            X.6NS r2 = X.AnonymousClass6NS.A0C
            X.5Tu r1 = X.C108515Tu.A03
            java.util.Set r0 = java.util.Collections.emptySet()
            X.C20430xY.A01(r5, r2, r1, r0, r4)
            return
        L_0x0392:
            java.lang.Object r0 = r1.A00
            X.16D r0 = (X.AnonymousClass16D) r0
            X.16I r1 = r0.A06
            r0 = 0
            r1.A04(r0)
            return
        L_0x039d:
            java.lang.Object r0 = r1.A00
            X.16D r0 = (X.AnonymousClass16D) r0
            X.16J r1 = r0.A0D
            X.8dw r0 = X.C177528dw.A00
            r1.A00(r0)
            return
        L_0x03a9:
            java.lang.Object r0 = r1.A00
            X.1M7 r0 = (X.AnonymousClass1M7) r0
            X.AnonymousClass1M7.A01(r0)
            return
        L_0x03b1:
            java.lang.Object r4 = r1.A00
            X.0xH r4 = (X.C20260xH) r4
            X.1VR r3 = r4.A0O
            r2 = 2
            r0 = 401(0x191, double:1.98E-321)
            r3.A00(r2, r0)
            r4.A05()
            return
        L_0x03c1:
            java.lang.Object r5 = r1.A00
            X.0xH r5 = (X.C20260xH) r5
            monitor-enter(r5)
            r1 = 0
            r5.A04 = r1     // Catch:{ all -> 0x0417 }
            r5.A0E = r1     // Catch:{ all -> 0x0417 }
            java.util.concurrent.atomic.AtomicReference r0 = r5.A0p     // Catch:{ all -> 0x0417 }
            r0.set(r1)     // Catch:{ all -> 0x0417 }
            r5.A0G = r1     // Catch:{ all -> 0x0417 }
            X.005 r0 = r5.A0n     // Catch:{ all -> 0x0417 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0417 }
            X.0y3 r1 = (X.C20720y3) r1     // Catch:{ all -> 0x0417 }
            r0 = 16
            r6 = 0
            r1.A0G(r6, r0)     // Catch:{ all -> 0x0417 }
            monitor-exit(r5)     // Catch:{ all -> 0x0417 }
            int r0 = r5.A01
            long r3 = (long) r0
            r1 = 4
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x03fc
            java.lang.String r0 = "companion/registration/auto refreshing link code"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r5.A01
            r1 = 1
            int r0 = r0 + 1
            r5.A01 = r0
            com.whatsapp.jid.UserJid r0 = r5.A07
            r5.A08(r0, r1)
            return
        L_0x03fc:
            java.lang.Iterable r0 = r5.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x0404:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0414
            java.lang.Object r0 = r1.next()
            X.3LD r0 = (X.AnonymousClass3LD) r0
            r0.A00()
            goto L_0x0404
        L_0x0414:
            r5.A01 = r6
            return
        L_0x0417:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0417 }
            throw r0
        L_0x041a:
            java.lang.Object r1 = r1.A00
            X.3ty r1 = (X.C79593ty) r1
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0C(r0)
            return
        L_0x0427:
            java.lang.Object r2 = r1.A00
            X.1IS r2 = (X.AnonymousClass1IS) r2
            r1 = 15
            r0 = 0
            X.AnonymousClass1IS.A00(r2, r0, r1)
            X.19n r1 = r2.A03
            X.0wo r0 = r2.A06
            long r2 = X.C19970wo.A00(r0)
            android.content.SharedPreferences r0 = X.C237119n.A00(r1)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "syncd_last_lthash_consistency_check_time"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)
            r0.apply()
            return
        L_0x044b:
            java.lang.Object r1 = r1.A00
            X.1AK r1 = (X.AnonymousClass1AK) r1
            java.lang.String r0 = "archive"
            X.AnonymousClass1AK.A00(r1, r0)
            return
        L_0x0455:
            java.lang.Object r1 = r1.A00
            X.196 r1 = (X.AnonymousClass196) r1
            X.1IZ r0 = r1.A0F
            r0.A00()
            goto L_0x046b
        L_0x045f:
            java.lang.Object r1 = r1.A00
            X.196 r1 = (X.AnonymousClass196) r1
            X.1IZ r0 = r1.A0F
            r0.A00()
            r1.A0E()
        L_0x046b:
            r1.A0G()
            return
        L_0x046f:
            java.lang.Object r0 = r1.A00
            X.196 r0 = (X.AnonymousClass196) r0
            X.1AK r5 = r0.A0J
            monitor-enter(r5)
            X.1AC r4 = r5.A00     // Catch:{ all -> 0x049d }
            X.6tN r3 = X.C145116tN.A00     // Catch:{ all -> 0x049d }
            java.lang.String r2 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE are_dependencies_missing = 1 ORDER BY _id ASC"
            r1 = 0
            java.lang.String r0 = "SyncdMutationsTable.SELECT_ALL_MUTATIONS_WITH_SUPPORTED_VERSIONS_AND_MISSING_DEPENDENCIES"
            java.util.ArrayList r0 = X.AnonymousClass1AC.A03(r3, r4, r2, r0, r1)     // Catch:{ all -> 0x049d }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x049d }
        L_0x0487:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x049d }
            if (r0 == 0) goto L_0x049b
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x049d }
            X.9k5 r1 = (X.C201669k5) r1     // Catch:{ all -> 0x049d }
            boolean r0 = r1 instanceof X.C22936Aym     // Catch:{ all -> 0x049d }
            if (r0 == 0) goto L_0x0487
            r5.A03(r1)     // Catch:{ all -> 0x049d }
            goto L_0x0487
        L_0x049b:
            monitor-exit(r5)     // Catch:{ all -> 0x049d }
            return
        L_0x049d:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x049d }
            throw r0
        L_0x04a0:
            java.lang.Object r1 = r1.A00
            X.1Ie r1 = (X.C25921Ie) r1
            r0 = 0
            r1.A03(r0)
            return
        L_0x04a9:
            java.lang.Object r7 = r1.A00
            X.1Ie r7 = (X.C25921Ie) r7
            X.1AB r8 = r7.A03
            X.19n r4 = r7.A04
            android.content.SharedPreferences r1 = X.C237119n.A00(r4)
            java.lang.String r5 = "syncd_dirty_reason"
            r0 = 0
            int r0 = r1.getInt(r5, r0)
            if (r0 == 0) goto L_0x04fc
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L_0x04c2:
            android.content.SharedPreferences r2 = X.C237119n.A00(r4)
            java.lang.String r1 = "syncd_dirty"
            r0 = -1
            int r0 = r2.getInt(r1, r0)
            int r0 = r0 + -1
            long r2 = (long) r0
            X.2OY r1 = new X.2OY
            r1.<init>()
            r1.A00 = r6
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A01 = r0
            X.0yW r0 = r8.A06
            r0.Bly(r1)
            X.1If r0 = r7.A02
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x04ec:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04fe
            java.lang.Object r0 = r1.next()
            X.193 r0 = (X.AnonymousClass193) r0
            r0.Biq()
            goto L_0x04ec
        L_0x04fc:
            r6 = 0
            goto L_0x04c2
        L_0x04fe:
            android.content.SharedPreferences r0 = X.C237119n.A00(r4)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r5)
            r0.apply()
            r0 = -1
            r4.A05(r0)
            return
        L_0x0512:
            java.lang.Object r0 = r1.A00
            X.1OH r0 = (X.AnonymousClass1OH) r0
            X.19g r2 = r0.A02
            java.lang.String r1 = "invalid_adv_status"
            r0 = 1
            r2.A0D(r1, r0)
            return
        L_0x051f:
            java.lang.Object r0 = r1.A00
            X.0CZ r0 = (X.AnonymousClass0CZ) r0
            r0.A06()
            return
        L_0x0527:
            java.lang.Object r0 = r1.A00
            X.18z r0 = (X.C235718z) r0
            X.005 r0 = r0.A0H
            java.lang.Object r0 = r0.get()
            X.6sT r0 = (X.C144576sT) r0
            r0.A00()
            return
        L_0x0537:
            java.lang.Object r3 = r1.A00
            X.18z r3 = (X.C235718z) r3
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            X.12q r0 = r3.A06
            java.util.ArrayList r0 = r0.A0E()
            java.util.Iterator r1 = r0.iterator()
        L_0x054a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0565
            java.lang.Object r0 = r1.next()
            X.3Qp r0 = (X.C65073Qp) r0
            X.11F r0 = r0.A06()
            X.AnonymousClass00C.A08(r0)
            java.util.Set r0 = X.C235718z.A00(r3, r0)
            r2.addAll(r0)
            goto L_0x054a
        L_0x0565:
            X.196 r0 = r3.A05
            r0.A0Q(r2)
            X.005 r0 = r3.A0D
            java.lang.Object r0 = r0.get()
            X.1Cf r0 = (X.C24381Cf) r0
            r0.A00()
            return
        L_0x0576:
            java.lang.Object r1 = r1.A00
            X.00S r1 = (X.AnonymousClass00S) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.invoke()
            return
        L_0x0582:
            java.lang.Object r1 = r1.A00
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r1 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2) r1
            X.1e0 r0 = r1.A0O
            r0.A02(r1)
            return
        L_0x058c:
            java.lang.Object r1 = r1.A00
            X.1SZ r1 = (X.AnonymousClass1SZ) r1
            r0 = 0
            r1.A02 = r0
            r0 = 59000(0xe678, float:8.2677E-41)
            r1.A0A(r0)
            X.AnonymousClass1SZ.A00(r1)
            return
        L_0x059d:
            java.lang.Object r0 = r1.A00
            X.1NG r0 = (X.AnonymousClass1NG) r0
            X.1NI r1 = r0.A05
            java.util.Set r0 = r0.A09()
            r1.A01(r0)
            return
        L_0x05ab:
            java.lang.Object r0 = r1.A00
            X.1NG r0 = (X.AnonymousClass1NG) r0
            X.16I r1 = r0.A07
            X.09w r0 = X.C023409w.A00
            r1.A03(r0)
            return
        L_0x05b7:
            java.lang.Object r0 = r1.A00
            X.1VA r0 = (X.AnonymousClass1VA) r0
            X.005 r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.8fo r0 = (X.C178358fo) r0
            r0.A00()
            return
        L_0x05c7:
            java.lang.Object r1 = r1.A00
            X.1ep r1 = (X.C33161ep) r1
            X.0wD r0 = r1.A0E
            r0.unregisterObserver(r1)
            return
        L_0x05d1:
            java.lang.Object r1 = r1.A00
            X.1ep r1 = (X.C33161ep) r1
            X.0wD r0 = r1.A0E
            r0.registerObserver(r1)
            return
        L_0x05db:
            java.lang.Object r0 = r1.A00
            X.1ei r0 = (X.C33101ei) r0
            r0.A08()
            return
        L_0x05e3:
            java.lang.Object r0 = r1.A00
            X.1ei r0 = (X.C33101ei) r0
            r0.A08()
            goto L_0x05ef
        L_0x05eb:
            java.lang.Object r0 = r1.A00
            X.1ei r0 = (X.C33101ei) r0
        L_0x05ef:
            r0.A04()
            return
        L_0x05f3:
            java.lang.Object r0 = r1.A00
            X.1Ck r0 = (X.C24431Ck) r0
            r0.A02()
            return
        L_0x05fb:
            java.lang.Object r0 = r1.A00
            X.1WQ r0 = (X.AnonymousClass1WQ) r0
            X.1Bs r1 = r0.A0R
            java.lang.String r0 = "event"
            r1.A01(r0)
            return
        L_0x0607:
            java.lang.Object r1 = r1.A00
            X.1Wn r1 = (X.C29411Wn) r1
            X.0wG r0 = r1.A09
            android.content.Context r2 = r0.A00
            X.0wN r4 = r1.A01
            X.12q r12 = r1.A0C
            X.1Pp r6 = r1.A04
            X.16D r7 = r1.A05
            X.171 r8 = r1.A06
            X.0yb r10 = r1.A08
            X.1NG r5 = r1.A03
            X.0v5 r3 = r1.A00
            X.0yE r11 = r1.A0A
            X.1FI r14 = r1.A0E
            X.17X r15 = r1.A0F
            X.1Ps r9 = r1.A07
            X.1A5 r13 = r1.A0D
            X.C65953Uc.A0E(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x062d:
            java.lang.Object r0 = r1.A00
            X.14p r0 = (X.C224914p) r0
            r0.A2X()
            return
        L_0x0635:
            java.lang.Object r0 = r1.A00
            X.14p r0 = (X.C224914p) r0
            r0.A2W()
            return
        L_0x063d:
            java.lang.Object r0 = r1.A00
            X.14p r0 = (X.C224914p) r0
            r0.A2a()
            return
        L_0x0645:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0645 }
            throw r0
        L_0x0648:
            r1 = move-exception
            if (r2 == 0) goto L_0x0653
            r2.close()     // Catch:{ all -> 0x064f }
            goto L_0x0653
        L_0x064f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0654 }
        L_0x0653:
            throw r1     // Catch:{ all -> 0x0654 }
        L_0x0654:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0659 }
            throw r1
        L_0x0659:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x065e:
            r1.A08()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35671j4.run():void");
    }
}
