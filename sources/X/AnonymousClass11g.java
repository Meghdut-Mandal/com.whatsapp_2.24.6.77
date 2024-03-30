package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.11g  reason: invalid class name */
public class AnonymousClass11g {
    public static final AnonymousClass11h A06 = new AnonymousClass11h("", C000400e.A0D(), C000400e.A0D(), C000400e.A0D(), C000400e.A0D(), false);
    public final AnonymousClass00T A00 = new AnonymousClass00U(AnonymousClass11i.A00);
    public final HashMap A01 = new HashMap();
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();
    public final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final AtomicInteger A05 = new AtomicInteger(0);

    public static final synchronized void A00(AnonymousClass11g r11, String str, boolean z) {
        synchronized (r11) {
            HashMap hashMap = r11.A01;
            String str2 = str;
            if (!hashMap.containsKey(str)) {
                ConcurrentHashMap concurrentHashMap = r11.A03;
                LinkedHashMap linkedHashMap = new LinkedHashMap(C000300d.A02(concurrentHashMap.size()));
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    linkedHashMap.put(entry.getKey(), Long.valueOf(((AtomicLong) entry.getValue()).get()));
                }
                ConcurrentHashMap concurrentHashMap2 = r11.A04;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C000300d.A02(concurrentHashMap2.size()));
                for (Map.Entry entry2 : concurrentHashMap2.entrySet()) {
                    linkedHashMap2.put(entry2.getKey(), Long.valueOf(((AtomicLong) entry2.getValue()).get()));
                }
                ConcurrentHashMap concurrentHashMap3 = r11.A02;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(C000300d.A02(concurrentHashMap3.size()));
                for (Map.Entry entry3 : concurrentHashMap3.entrySet()) {
                    linkedHashMap3.put(entry3.getKey(), Long.valueOf(((AtomicLong) entry3.getValue()).get()));
                }
                ConcurrentHashMap concurrentHashMap4 = (ConcurrentHashMap) r11.A00.getValue();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(C000300d.A02(concurrentHashMap4.size()));
                for (Map.Entry entry4 : concurrentHashMap4.entrySet()) {
                    linkedHashMap4.put(entry4.getKey(), Long.valueOf(((AtomicLong) entry4.getValue()).get()));
                }
                hashMap.put(str, new AnonymousClass11h(str2, linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, z));
                if (z) {
                    r11.A05.incrementAndGet();
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Already tracking \"");
                sb.append(str);
                sb.append('\"');
                C18740tg.A0D(false, sb.toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r3 = new java.util.concurrent.atomic.AtomicLong(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        r3 = new java.util.concurrent.atomic.AtomicLong(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        r3 = new java.util.concurrent.atomic.AtomicLong(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        r2 = new java.util.concurrent.atomic.AtomicLong(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bb, code lost:
        r3 = new java.util.concurrent.atomic.AtomicLong(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ed, code lost:
        r3 = new java.util.concurrent.atomic.AtomicLong(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0117, code lost:
        r3 = new java.util.concurrent.atomic.AtomicLong(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0136, code lost:
        r2 = new java.util.concurrent.atomic.AtomicLong(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.String r7, int r8, java.lang.String r9) {
        /*
            r6 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            r0 = 2
            X.AnonymousClass00C.A0D(r9, r0)
            monitor-enter(r6)
            java.util.HashMap r0 = r6.A01     // Catch:{ all -> 0x014b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x014b }
            monitor-exit(r6)
            if (r0 != 0) goto L_0x00af
            boolean r5 = X.C224714l.A02()
            r0 = 0
            switch(r8) {
                case 0: goto L_0x00b3;
                case 1: goto L_0x00b3;
                case 2: goto L_0x001b;
                case 3: goto L_0x001b;
                case 4: goto L_0x001b;
                case 5: goto L_0x001b;
                case 6: goto L_0x00b3;
                default: goto L_0x001b;
            }
        L_0x001b:
            java.util.concurrent.ConcurrentHashMap r2 = r6.A04
            java.lang.Object r3 = r2.get(r7)
            if (r3 != 0) goto L_0x002f
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r3.<init>(r0)
            java.lang.Object r2 = r2.putIfAbsent(r7, r3)
            if (r2 == 0) goto L_0x002f
            r3 = r2
        L_0x002f:
            java.util.concurrent.atomic.AtomicLong r3 = (java.util.concurrent.atomic.AtomicLong) r3
            r3.incrementAndGet()
            java.util.concurrent.atomic.AtomicInteger r2 = r6.A05
            int r2 = r2.get()
            if (r2 <= 0) goto L_0x00b0
            java.util.concurrent.ConcurrentHashMap r4 = r6.A02
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "w-"
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = r3.toString()
            java.lang.Object r3 = r4.get(r2)
            if (r3 != 0) goto L_0x0061
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r3.<init>(r0)
            java.lang.Object r2 = r4.putIfAbsent(r2, r3)
            if (r2 == 0) goto L_0x0061
            r3 = r2
        L_0x0061:
            java.util.concurrent.atomic.AtomicLong r3 = (java.util.concurrent.atomic.AtomicLong) r3
            r3.incrementAndGet()
            if (r5 == 0) goto L_0x00af
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "m-"
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = r3.toString()
            java.lang.Object r3 = r4.get(r2)
            if (r3 != 0) goto L_0x008b
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r3.<init>(r0)
            java.lang.Object r2 = r4.putIfAbsent(r2, r3)
            if (r2 == 0) goto L_0x008b
            r3 = r2
        L_0x008b:
            java.util.concurrent.atomic.AtomicLong r3 = (java.util.concurrent.atomic.AtomicLong) r3
            r3.incrementAndGet()
        L_0x0090:
            X.00T r2 = r6.A00
            java.lang.Object r3 = r2.getValue()
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            java.lang.Object r2 = r3.get(r7)
            if (r2 != 0) goto L_0x00aa
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r2.<init>(r0)
            java.lang.Object r0 = r3.putIfAbsent(r7, r2)
            if (r0 == 0) goto L_0x00aa
            r2 = r0
        L_0x00aa:
            java.util.concurrent.atomic.AtomicLong r2 = (java.util.concurrent.atomic.AtomicLong) r2
            r2.incrementAndGet()
        L_0x00af:
            return
        L_0x00b0:
            if (r5 == 0) goto L_0x00af
            goto L_0x0090
        L_0x00b3:
            java.util.concurrent.ConcurrentHashMap r2 = r6.A03
            java.lang.Object r3 = r2.get(r7)
            if (r3 != 0) goto L_0x00c7
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r3.<init>(r0)
            java.lang.Object r2 = r2.putIfAbsent(r7, r3)
            if (r2 == 0) goto L_0x00c7
            r3 = r2
        L_0x00c7:
            java.util.concurrent.atomic.AtomicLong r3 = (java.util.concurrent.atomic.AtomicLong) r3
            r3.incrementAndGet()
            java.util.concurrent.atomic.AtomicInteger r2 = r6.A05
            int r2 = r2.get()
            if (r2 <= 0) goto L_0x0148
            java.util.concurrent.ConcurrentHashMap r4 = r6.A02
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "r-"
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = r3.toString()
            java.lang.Object r3 = r4.get(r2)
            if (r3 != 0) goto L_0x00f9
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r3.<init>(r0)
            java.lang.Object r2 = r4.putIfAbsent(r2, r3)
            if (r2 == 0) goto L_0x00f9
            r3 = r2
        L_0x00f9:
            java.util.concurrent.atomic.AtomicLong r3 = (java.util.concurrent.atomic.AtomicLong) r3
            r3.incrementAndGet()
            if (r5 == 0) goto L_0x00af
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "m-"
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = r3.toString()
            java.lang.Object r3 = r4.get(r2)
            if (r3 != 0) goto L_0x0123
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r3.<init>(r0)
            java.lang.Object r2 = r4.putIfAbsent(r2, r3)
            if (r2 == 0) goto L_0x0123
            r3 = r2
        L_0x0123:
            java.util.concurrent.atomic.AtomicLong r3 = (java.util.concurrent.atomic.AtomicLong) r3
            r3.incrementAndGet()
        L_0x0128:
            X.00T r2 = r6.A00
            java.lang.Object r3 = r2.getValue()
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            java.lang.Object r2 = r3.get(r7)
            if (r2 != 0) goto L_0x0142
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r2.<init>(r0)
            java.lang.Object r0 = r3.putIfAbsent(r7, r2)
            if (r0 == 0) goto L_0x0142
            r2 = r0
        L_0x0142:
            java.util.concurrent.atomic.AtomicLong r2 = (java.util.concurrent.atomic.AtomicLong) r2
            r2.incrementAndGet()
            return
        L_0x0148:
            if (r5 == 0) goto L_0x00af
            goto L_0x0128
        L_0x014b:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11g.A02(java.lang.String, int, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01a4, code lost:
        return r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized X.AnonymousClass11h A01(java.lang.String r22) {
        /*
            r21 = this;
            r9 = r21
            monitor-enter(r9)
            r2 = 0
            r13 = r22
            X.AnonymousClass00C.A0D(r13, r2)     // Catch:{ all -> 0x01a5 }
            java.util.HashMap r12 = r9.A01     // Catch:{ all -> 0x01a5 }
            java.lang.Object r14 = r12.remove(r13)     // Catch:{ all -> 0x01a5 }
            X.11h r14 = (X.AnonymousClass11h) r14     // Catch:{ all -> 0x01a5 }
            if (r14 != 0) goto L_0x0030
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a5 }
            r1.<init>()     // Catch:{ all -> 0x01a5 }
            java.lang.String r0 = "Unexpected code path name \""
            r1.append(r0)     // Catch:{ all -> 0x01a5 }
            r1.append(r13)     // Catch:{ all -> 0x01a5 }
            r0 = 34
            r1.append(r0)     // Catch:{ all -> 0x01a5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01a5 }
            X.C18740tg.A0D(r2, r0)     // Catch:{ all -> 0x01a5 }
            X.11h r0 = A06     // Catch:{ all -> 0x01a5 }
            monitor-exit(r9)
            return r0
        L_0x0030:
            boolean r11 = r14.A04     // Catch:{ all -> 0x01a5 }
            java.util.concurrent.ConcurrentHashMap r10 = r9.A03     // Catch:{ all -> 0x01a5 }
            int r0 = r10.size()     // Catch:{ all -> 0x01a5 }
            int r0 = X.C000300d.A02(r0)     // Catch:{ all -> 0x01a5 }
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap     // Catch:{ all -> 0x01a5 }
            r8.<init>(r0)     // Catch:{ all -> 0x01a5 }
            java.util.Set r0 = r10.entrySet()     // Catch:{ all -> 0x01a5 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x01a5 }
        L_0x0049:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x01a5 }
            r18 = 0
            if (r0 == 0) goto L_0x0084
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x01a5 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x01a5 }
            java.lang.Object r4 = r5.getKey()     // Catch:{ all -> 0x01a5 }
            java.lang.Object r0 = r5.getValue()     // Catch:{ all -> 0x01a5 }
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0     // Catch:{ all -> 0x01a5 }
            long r2 = r0.get()     // Catch:{ all -> 0x01a5 }
            java.util.Map r1 = r14.A02     // Catch:{ all -> 0x01a5 }
            java.lang.Object r0 = r5.getKey()     // Catch:{ all -> 0x01a5 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x01a5 }
            if (r0 != 0) goto L_0x0075
            java.lang.Long r0 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x01a5 }
        L_0x0075:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01a5 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x01a5 }
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x01a5 }
            r8.put(r4, r0)     // Catch:{ all -> 0x01a5 }
            goto L_0x0049
        L_0x0084:
            java.util.concurrent.ConcurrentHashMap r7 = r9.A04     // Catch:{ all -> 0x01a5 }
            int r0 = r7.size()     // Catch:{ all -> 0x01a5 }
            int r0 = X.C000300d.A02(r0)     // Catch:{ all -> 0x01a5 }
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch:{ all -> 0x01a5 }
            r6.<init>(r0)     // Catch:{ all -> 0x01a5 }
            java.util.Set r0 = r7.entrySet()     // Catch:{ all -> 0x01a5 }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x01a5 }
        L_0x009b:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x01a5 }
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r5 = r15.next()     // Catch:{ all -> 0x01a5 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x01a5 }
            java.lang.Object r2 = r5.getKey()     // Catch:{ all -> 0x01a5 }
            java.lang.Object r0 = r5.getValue()     // Catch:{ all -> 0x01a5 }
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0     // Catch:{ all -> 0x01a5 }
            long r3 = r0.get()     // Catch:{ all -> 0x01a5 }
            java.util.Map r1 = r14.A03     // Catch:{ all -> 0x01a5 }
            java.lang.Object r0 = r5.getKey()     // Catch:{ all -> 0x01a5 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x01a5 }
            if (r0 != 0) goto L_0x00c5
            java.lang.Long r0 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x01a5 }
        L_0x00c5:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01a5 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x01a5 }
            long r3 = r3 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x01a5 }
            r6.put(r2, r0)     // Catch:{ all -> 0x01a5 }
            goto L_0x009b
        L_0x00d4:
            java.util.concurrent.ConcurrentHashMap r5 = r9.A02     // Catch:{ all -> 0x01a5 }
            int r0 = r5.size()     // Catch:{ all -> 0x01a5 }
            int r0 = X.C000300d.A02(r0)     // Catch:{ all -> 0x01a5 }
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch:{ all -> 0x01a5 }
            r4.<init>(r0)     // Catch:{ all -> 0x01a5 }
            java.util.Set r0 = r5.entrySet()     // Catch:{ all -> 0x01a5 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x01a5 }
        L_0x00eb:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x01a5 }
            if (r0 == 0) goto L_0x0124
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x01a5 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x01a5 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ all -> 0x01a5 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x01a5 }
            java.util.concurrent.atomic.AtomicLong r1 = (java.util.concurrent.atomic.AtomicLong) r1     // Catch:{ all -> 0x01a5 }
            long r15 = r1.get()     // Catch:{ all -> 0x01a5 }
            java.util.Map r1 = r14.A01     // Catch:{ all -> 0x01a5 }
            java.lang.Object r0 = r0.getKey()     // Catch:{ all -> 0x01a5 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x01a5 }
            if (r0 != 0) goto L_0x0115
            java.lang.Long r0 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x01a5 }
        L_0x0115:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01a5 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x01a5 }
            long r15 = r15 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x01a5 }
            r4.put(r2, r0)     // Catch:{ all -> 0x01a5 }
            goto L_0x00eb
        L_0x0124:
            X.00T r0 = r9.A00     // Catch:{ all -> 0x01a5 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x01a5 }
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch:{ all -> 0x01a5 }
            int r0 = r1.size()     // Catch:{ all -> 0x01a5 }
            int r0 = X.C000300d.A02(r0)     // Catch:{ all -> 0x01a5 }
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch:{ all -> 0x01a5 }
            r3.<init>(r0)     // Catch:{ all -> 0x01a5 }
            java.util.Set r0 = r1.entrySet()     // Catch:{ all -> 0x01a5 }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ all -> 0x01a5 }
        L_0x0141:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x01a5 }
            if (r0 == 0) goto L_0x017a
            java.lang.Object r0 = r17.next()     // Catch:{ all -> 0x01a5 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x01a5 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ all -> 0x01a5 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x01a5 }
            java.util.concurrent.atomic.AtomicLong r1 = (java.util.concurrent.atomic.AtomicLong) r1     // Catch:{ all -> 0x01a5 }
            long r15 = r1.get()     // Catch:{ all -> 0x01a5 }
            java.util.Map r1 = r14.A00     // Catch:{ all -> 0x01a5 }
            java.lang.Object r0 = r0.getKey()     // Catch:{ all -> 0x01a5 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x01a5 }
            if (r0 != 0) goto L_0x016b
            java.lang.Long r0 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x01a5 }
        L_0x016b:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01a5 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x01a5 }
            long r15 = r15 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x01a5 }
            r3.put(r2, r0)     // Catch:{ all -> 0x01a5 }
            goto L_0x0141
        L_0x017a:
            X.11h r14 = new X.11h     // Catch:{ all -> 0x01a5 }
            r17 = r6
            r18 = r4
            r19 = r3
            r20 = r11
            r15 = r13
            r16 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x01a5 }
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x01a5 }
            if (r0 == 0) goto L_0x0196
            r10.clear()     // Catch:{ all -> 0x01a5 }
            r7.clear()     // Catch:{ all -> 0x01a5 }
        L_0x0196:
            if (r11 == 0) goto L_0x01a3
            java.util.concurrent.atomic.AtomicInteger r0 = r9.A05     // Catch:{ all -> 0x01a5 }
            int r0 = r0.decrementAndGet()     // Catch:{ all -> 0x01a5 }
            if (r0 > 0) goto L_0x01a3
            r5.clear()     // Catch:{ all -> 0x01a5 }
        L_0x01a3:
            monitor-exit(r9)
            return r14
        L_0x01a5:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11g.A01(java.lang.String):X.11h");
    }
}
