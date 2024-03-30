package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0zF  reason: invalid class name and case insensitive filesystem */
public class C21440zF implements C21430zE {
    public final C19970wo A00;
    public final C21540zP A01;
    public final C21470zI A02;
    public final C21600zV A03;
    public final C21450zG A04;
    public final C21590zU A05;
    public final C21560zR A06;
    public final C19770wU A07;
    public final ConcurrentHashMap A08 = new ConcurrentHashMap();
    public final ConcurrentLinkedQueue A09 = new ConcurrentLinkedQueue();
    public final ConcurrentNavigableMap A0A = new ConcurrentSkipListMap();
    public final CopyOnWriteArrayList A0B = new CopyOnWriteArrayList();
    public final AtomicInteger A0C = new AtomicInteger(0);
    public final C21460zH A0D;
    public final C21600zV A0E;
    public final C19930wk A0F;
    public final AnonymousClass005 A0G;

    public static long A00(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public boolean BMN(int i) {
        C21820zr A042 = A04((Integer) null, i);
        if (A042 == null) {
            return false;
        }
        if (A042.A0A.get() == -1 || A042.A0B.get() == -1) {
            return true;
        }
        return false;
    }

    public void BPD(AnonymousClass4TY r6, int i) {
        C21820zr A042 = A04((Integer) null, i);
        if (A042 != null) {
            C21600zV r3 = this.A0E;
            C21600zV.A00(r3, A042.A01);
            r3.A03.Boy(new C35661j3(A042, r6, r3, 13));
        }
    }

    public void BPO(int i, boolean z) {
        A06((Integer) null, i, SystemClock.elapsedRealtimeNanos(), z);
    }

    public void BsO(int i, String str) {
        C21820zr A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A07.put("subType", str);
        }
    }

    public void endAllMarkers(short s, boolean z) {
        if (this.A01.A03()) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            short s2 = s;
            boolean z2 = z;
            A02(this.A0A, elapsedRealtimeNanos, s2, z2);
            A02(this.A08, elapsedRealtimeNanos, s2, z2);
        }
    }

    public void markerDrop(int i) {
        A07(i, (Integer) null);
    }

    public void markerStart(int i, String str, String str2) {
        C21820zr A062 = A06((Integer) null, i, SystemClock.elapsedRealtimeNanos(), true);
        if (A062 != null) {
            A062.A00(str2.length(), str, str2);
        }
    }

    private void A01(ConcurrentMap concurrentMap, long j) {
        C21820zr r1;
        if (!concurrentMap.isEmpty()) {
            for (Map.Entry entry : concurrentMap.entrySet()) {
                C21820zr r6 = (C21820zr) entry.getValue();
                if (r6 != null) {
                    if (r6.A03 + TimeUnit.MILLISECONDS.toNanos((long) 300000) < j && (r1 = (C21820zr) concurrentMap.remove(entry.getKey())) != null) {
                        r1.A02(j, 113);
                        this.A09.add(r1);
                        this.A0C.decrementAndGet();
                    }
                }
            }
            Bxa();
        }
    }

    public C21820zr A04(Integer num, int i) {
        Object obj;
        if (num == null) {
            obj = this.A08.get(Integer.valueOf(i));
        } else {
            obj = this.A0A.get(Long.valueOf(A00(i, num.intValue())));
        }
        return (C21820zr) obj;
    }

    public C21820zr A05(Integer num, int i, long j, short s) {
        Object remove;
        if (num == null) {
            remove = this.A08.remove(Integer.valueOf(i));
        } else {
            remove = this.A0A.remove(Long.valueOf(A00(i, num.intValue())));
        }
        C21820zr r1 = (C21820zr) remove;
        if (r1 != null) {
            r1.A02(j, s);
            this.A0C.decrementAndGet();
        }
        return r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C21820zr A06(java.lang.Integer r25, int r26, long r27, boolean r29) {
        /*
            r24 = this;
            r3 = r24
            X.0zP r0 = r3.A01
            boolean r0 = r0.A03()
            r5 = 0
            if (r0 == 0) goto L_0x0026
            X.0zU r2 = r3.A05
            r4 = r26
            boolean r0 = r2.A01(r4)
            if (r0 == 0) goto L_0x0026
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A0C
            r23 = r0
            int r1 = r23.get()
            r0 = 50
            if (r1 < r0) goto L_0x0027
            X.0zI r0 = r3.A02
            r0.BPV(r4)
        L_0x0026:
            return r5
        L_0x0027:
            X.0zP r2 = r2.A01
            X.0zQ r0 = X.C21540zP.A00(r2, r4)
            boolean r0 = r0.A03
            r22 = r0
            X.0zQ r0 = X.C21540zP.A00(r2, r4)
            long r0 = r0.A01
            r20 = r0
            X.0zQ r0 = X.C21540zP.A00(r2, r4)
            boolean r6 = r0.A02
            X.0zV r5 = r3.A03
            X.0zP r1 = r5.A00
            X.C21540zP.A01(r1)
            java.lang.Boolean r0 = r1.A03
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0118
            r0 = 916783105(0x36a50001, float:4.9173836E-6)
            if (r4 == r0) goto L_0x0118
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            X.0zQ r0 = X.C21540zP.A00(r1, r4)
            long r1 = r0.A00
            r9 = 0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0118
            int[] r19 = X.C56432wH.A00
            r13 = 2
            r12 = 0
        L_0x0072:
            r11 = r19[r12]
            r0 = 1
            int r0 = r11 - r0
            r9 = 1
            long r9 = r9 << r0
            long r15 = r1 & r9
            r9 = 0
            int r0 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00e7
            X.0zU r9 = r5.A01
            X.0zP r0 = r9.A01
            X.C21540zP.A01(r0)
            java.lang.Long r0 = r0.A04
            long r17 = r0.longValue()
            r15 = 1
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            r15 = 0
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00e7
            java.util.Random r0 = r9.A02
            long r9 = r0.nextLong()
            long r9 = r9 % r17
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x00e7
        L_0x00a7:
            X.0zW r15 = r5.A02
            java.util.concurrent.ConcurrentHashMap r10 = r15.A04
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            java.lang.Object r0 = r10.get(r9)
            if (r0 != 0) goto L_0x00e4
            monitor-enter(r10)
            java.lang.Object r0 = r10.get(r9)     // Catch:{ all -> 0x0109 }
            X.0zi r0 = (X.C21730zi) r0     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x00c0
            monitor-exit(r10)     // Catch:{ all -> 0x0109 }
            goto L_0x00e4
        L_0x00c0:
            r0 = 5
            if (r11 == r0) goto L_0x00cd
            r0 = 9
            if (r11 == r0) goto L_0x00d7
            X.3qH r0 = new X.3qH     // Catch:{ all -> 0x0109 }
            r0.<init>()     // Catch:{ all -> 0x0109 }
            goto L_0x00e0
        L_0x00cd:
            X.0yb r11 = r15.A00     // Catch:{ all -> 0x0109 }
            X.0zX r15 = r15.A03     // Catch:{ all -> 0x0109 }
            X.0zj r0 = new X.0zj     // Catch:{ all -> 0x0109 }
            r0.<init>(r11, r15)     // Catch:{ all -> 0x0109 }
            goto L_0x00e0
        L_0x00d7:
            X.0wo r11 = r15.A01     // Catch:{ all -> 0x0109 }
            X.0zY r15 = r15.A02     // Catch:{ all -> 0x0109 }
            X.0zk r0 = new X.0zk     // Catch:{ all -> 0x0109 }
            r0.<init>(r11, r15)     // Catch:{ all -> 0x0109 }
        L_0x00e0:
            r10.put(r9, r0)     // Catch:{ all -> 0x0109 }
            monitor-exit(r10)     // Catch:{ all -> 0x0109 }
        L_0x00e4:
            r14.add(r0)
        L_0x00e7:
            int r12 = r12 + 1
            if (r12 < r13) goto L_0x0072
            java.util.Iterator r2 = r14.iterator()
        L_0x00ef:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x010c
            java.lang.Object r1 = r2.next()
            X.0zi r1 = (X.C21730zi) r1
            boolean r0 = r1.BN5()
            if (r0 == 0) goto L_0x0105
            r7.add(r1)
            goto L_0x00ef
        L_0x0105:
            r8.add(r1)
            goto L_0x00ef
        L_0x0109:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0109 }
            throw r0
        L_0x010c:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0178
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0178
        L_0x0118:
            X.0zq r2 = X.C21810zq.A02
        L_0x011a:
            X.0zI r0 = r3.A02
            X.0zr r7 = new X.0zr
            r11 = r25
            r15 = r27
            r18 = r29
            r8 = r0
            r9 = r2
            r10 = r5
            r12 = r4
            r13 = r20
            r17 = r22
            r7.<init>(r8, r9, r10, r11, r12, r13, r15, r17, r18)
            r23.incrementAndGet()
            r2 = 1
            X.C21600zV.A01(r5, r7, r2)
            if (r6 == 0) goto L_0x0141
            java.lang.String r1 = "is_overwritten_sampling_rate_by_experiment"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r7.A00(r2, r1, r0)
        L_0x0141:
            if (r25 != 0) goto L_0x0165
            java.util.concurrent.ConcurrentHashMap r1 = r3.A08
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r1.put(r0, r7)
        L_0x014d:
            X.0zr r4 = (X.C21820zr) r4
            if (r4 == 0) goto L_0x0164
            r2 = 4
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            r4.A02(r0, r2)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r3.A09
            r0.add(r4)
            r23.decrementAndGet()
            r3.Bxa()
        L_0x0164:
            return r7
        L_0x0165:
            java.util.concurrent.ConcurrentNavigableMap r2 = r3.A0A
            int r0 = r11.intValue()
            long r0 = A00(r4, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r4 = r2.put(r0, r7)
            goto L_0x014d
        L_0x0178:
            X.0zh[] r0 = X.C21810zq.A03
            java.lang.Object[] r1 = r8.toArray(r0)
            X.0zh[] r1 = (X.C21720zh[]) r1
            java.lang.Object[] r0 = r7.toArray(r0)
            X.0zh[] r0 = (X.C21720zh[]) r0
            X.0zq r2 = new X.0zq
            r2.<init>(r1, r0)
            goto L_0x011a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21440zF.A06(java.lang.Integer, int, long, boolean):X.0zr");
    }

    public void A07(int i, Integer num) {
        Object remove;
        if (num == null) {
            remove = this.A08.remove(Integer.valueOf(i));
        } else {
            remove = this.A0A.remove(Long.valueOf(A00(i, num.intValue())));
        }
        C21820zr r2 = (C21820zr) remove;
        this.A0C.decrementAndGet();
        if (r2 != null) {
            this.A03.A05.remove(Integer.valueOf(r2.A01));
        }
    }

    public void A08(C21820zr r2) {
        if (r2 != null) {
            this.A09.add(r2);
            Bxa();
        }
    }

    public void B6V(int i, short s) {
        if (this.A01.A03()) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            A01(this.A08, elapsedRealtimeNanos);
            A01(this.A0A, elapsedRealtimeNanos);
        }
    }

    public Collection B8X() {
        HashSet hashSet = new HashSet(this.A08.keySet());
        for (Number longValue : this.A0A.keySet()) {
            hashSet.add(Integer.valueOf((int) (longValue.longValue() >> 32)));
        }
        return hashSet;
    }

    public boolean BJs() {
        return !this.A09.isEmpty();
    }

    public boolean BPJ(int i) {
        C21590zU r3 = this.A05;
        C21540zP r1 = r3.A01;
        if (!r1.A03()) {
            return false;
        }
        if (C21540zP.A00(r1, 689639794).A03) {
            return C21590zU.A00(r3, 689639794);
        }
        return true;
    }

    public void BPN(int i, String str, String str2, long j, TimeUnit timeUnit) {
        C21820zr A062 = A06((Integer) null, i, timeUnit.toNanos(j), true);
        if (A062 != null) {
            A062.A00(str2.length(), "perf_origin", str2);
        }
    }

    public void BPP(String str, String str2, int i, int i2, boolean z) {
        C21820zr A062 = A06(Integer.valueOf(i2), i, SystemClock.elapsedRealtimeNanos(), z);
        if (A062 != null) {
            A062.A00(str2.length(), "perf_origin", str2);
        }
    }

    public Long BlL() {
        C21820zr r0 = (C21820zr) this.A09.peek();
        if (r0 == null) {
            return null;
        }
        long j = r0.A0B.get();
        if (j != -1) {
            return Long.valueOf(j);
        }
        return null;
    }

    public Integer BlM() {
        C21820zr r0 = (C21820zr) this.A09.peek();
        if (r0 != null) {
            return Integer.valueOf(r0.A01);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0324, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0325, code lost:
        r7.A01.BNs(r6.A00, r0.getMessage());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String Bli() {
        /*
            r19 = this;
            r0 = r19
            X.0zH r7 = r0.A0D
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.A09
            java.lang.Object r6 = r0.poll()
            X.0zr r6 = (X.C21820zr) r6
            r8 = 0
            if (r6 == 0) goto L_0x0330
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0324 }
            r5.<init>()     // Catch:{ JSONException -> 0x0324 }
            java.lang.String r0 = "marker_id"
            int r4 = r6.A00     // Catch:{ JSONException -> 0x0324 }
            r5.put(r0, r4)     // Catch:{ JSONException -> 0x0324 }
            java.util.concurrent.ConcurrentHashMap r3 = r6.A07     // Catch:{ JSONException -> 0x0324 }
            java.lang.String r2 = "subType"
            java.lang.Object r0 = r3.get(r2)     // Catch:{ JSONException -> 0x0324 }
            if (r0 == 0) goto L_0x002e
            java.lang.String r1 = "da_type"
            java.lang.Object r0 = r3.get(r2)     // Catch:{ JSONException -> 0x0324 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0324 }
        L_0x002e:
            java.lang.Integer r1 = r6.A05     // Catch:{ JSONException -> 0x0324 }
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = "instance_id"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x0324 }
        L_0x0037:
            java.lang.String r1 = "action_id"
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A0A     // Catch:{ JSONException -> 0x0324 }
            int r0 = r0.get()     // Catch:{ JSONException -> 0x0324 }
            short r0 = (short) r0     // Catch:{ JSONException -> 0x0324 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0324 }
            java.lang.String r1 = "method"
            boolean r0 = r6.A0D     // Catch:{ JSONException -> 0x0324 }
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = "per_user"
        L_0x004b:
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0324 }
            java.lang.String r2 = "sample_rate"
            long r0 = r6.A02     // Catch:{ JSONException -> 0x0324 }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0324 }
            java.lang.String r9 = "duration_ns"
            java.util.concurrent.atomic.AtomicLong r0 = r6.A0B     // Catch:{ JSONException -> 0x0324 }
            long r0 = r0.get()     // Catch:{ JSONException -> 0x0324 }
            long r2 = r6.A03     // Catch:{ JSONException -> 0x0324 }
            long r0 = r0 - r2
            r5.put(r9, r0)     // Catch:{ JSONException -> 0x0324 }
            java.lang.String r10 = "wa_ab_key2"
            X.0zL r0 = r7.A00     // Catch:{ JSONException -> 0x0324 }
            X.0zM r9 = r0.A02     // Catch:{ JSONException -> 0x0324 }
            monitor-enter(r9)     // Catch:{ JSONException -> 0x0324 }
            goto L_0x006e
        L_0x006b:
            java.lang.String r0 = "random_sampling"
            goto L_0x004b
        L_0x006e:
            android.content.SharedPreferences r1 = r9.A00     // Catch:{ all -> 0x0321 }
            java.lang.String r0 = "ab_props:sys:config_key"
            java.lang.String r0 = r1.getString(r0, r8)     // Catch:{ all -> 0x0321 }
            monitor-exit(r9)     // Catch:{ JSONException -> 0x0324 }
            r5.put(r10, r0)     // Catch:{ JSONException -> 0x0324 }
            java.lang.String r1 = "wa_ab_expo_key"
            java.lang.String r0 = r9.A01()     // Catch:{ JSONException -> 0x0324 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0324 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0324 }
            r9.<init>()     // Catch:{ JSONException -> 0x0324 }
            java.util.concurrent.ConcurrentHashMap r0 = r6.A09     // Catch:{ JSONException -> 0x0324 }
            java.util.Collection r0 = r0.values()     // Catch:{ JSONException -> 0x0324 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ JSONException -> 0x0324 }
        L_0x0092:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x0324 }
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r0 = r1.next()     // Catch:{ JSONException -> 0x0324 }
            if (r0 == 0) goto L_0x0092
            r9.add(r0)     // Catch:{ JSONException -> 0x0324 }
            goto L_0x0092
        L_0x00a2:
            java.util.Collections.sort(r9)     // Catch:{ JSONException -> 0x0324 }
            boolean r0 = r9.isEmpty()     // Catch:{ JSONException -> 0x0324 }
            if (r0 != 0) goto L_0x00e6
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0324 }
            r10.<init>()     // Catch:{ JSONException -> 0x0324 }
            java.util.Iterator r13 = r9.iterator()     // Catch:{ JSONException -> 0x0324 }
        L_0x00b4:
            boolean r0 = r13.hasNext()     // Catch:{ JSONException -> 0x0324 }
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r12 = r13.next()     // Catch:{ JSONException -> 0x0324 }
            X.0zu r12 = (X.C21850zu) r12     // Catch:{ JSONException -> 0x0324 }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0324 }
            r11.<init>()     // Catch:{ JSONException -> 0x0324 }
            java.lang.String r1 = r12.A02     // Catch:{ JSONException -> 0x0324 }
            java.lang.String r0 = "name"
            r11.put(r0, r1)     // Catch:{ JSONException -> 0x0324 }
            long r0 = r12.A00     // Catch:{ JSONException -> 0x0324 }
            long r0 = r0 - r2
            java.lang.String r9 = "time_since_start_ns"
            r11.put(r9, r0)     // Catch:{ JSONException -> 0x0324 }
            java.lang.String r1 = r12.A01     // Catch:{ JSONException -> 0x0324 }
            if (r1 == 0) goto L_0x00dd
            java.lang.String r0 = "data"
            r11.put(r0, r1)     // Catch:{ JSONException -> 0x0324 }
        L_0x00dd:
            r10.put(r11)     // Catch:{ JSONException -> 0x0324 }
            goto L_0x00b4
        L_0x00e1:
            java.lang.String r0 = "points"
            r5.put(r0, r10)     // Catch:{ JSONException -> 0x0324 }
        L_0x00e6:
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ JSONException -> 0x0324 }
            r10.<init>()     // Catch:{ JSONException -> 0x0324 }
            java.util.concurrent.ConcurrentHashMap r3 = r6.A06     // Catch:{ JSONException -> 0x0324 }
            java.util.Set r0 = r3.keySet()     // Catch:{ JSONException -> 0x0324 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ JSONException -> 0x0324 }
        L_0x00f5:
            boolean r0 = r2.hasNext()     // Catch:{ JSONException -> 0x0324 }
            if (r0 == 0) goto L_0x0109
            java.lang.Object r1 = r2.next()     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r0 = r3.get(r1)     // Catch:{ JSONException -> 0x0324 }
            if (r0 == 0) goto L_0x00f5
            r10.put(r1, r0)     // Catch:{ JSONException -> 0x0324 }
            goto L_0x00f5
        L_0x0109:
            boolean r0 = r10.isEmpty()     // Catch:{ JSONException -> 0x0324 }
            if (r0 != 0) goto L_0x0210
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ JSONException -> 0x0324 }
            r9.<init>()     // Catch:{ JSONException -> 0x0324 }
            java.util.Set r0 = r10.entrySet()     // Catch:{ JSONException -> 0x0324 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ JSONException -> 0x0324 }
        L_0x011c:
            boolean r0 = r3.hasNext()     // Catch:{ JSONException -> 0x0324 }
            if (r0 == 0) goto L_0x0144
            java.lang.Object r2 = r3.next()     // Catch:{ JSONException -> 0x0324 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r0 = r2.getValue()     // Catch:{ JSONException -> 0x0324 }
            java.lang.Class r1 = r0.getClass()     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r0 = r9.get(r1)     // Catch:{ JSONException -> 0x0324 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ JSONException -> 0x0324 }
            if (r0 != 0) goto L_0x0140
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0324 }
            r0.<init>()     // Catch:{ JSONException -> 0x0324 }
            r9.put(r1, r0)     // Catch:{ JSONException -> 0x0324 }
        L_0x0140:
            r0.add(r2)     // Catch:{ JSONException -> 0x0324 }
            goto L_0x011c
        L_0x0144:
            java.util.Set r0 = r9.entrySet()     // Catch:{ JSONException -> 0x0324 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ JSONException -> 0x0324 }
        L_0x014c:
            boolean r0 = r12.hasNext()     // Catch:{ JSONException -> 0x0324 }
            if (r0 == 0) goto L_0x0210
            java.lang.Object r3 = r12.next()     // Catch:{ JSONException -> 0x0324 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r2 = r3.getKey()     // Catch:{ JSONException -> 0x0324 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r2 != r0) goto L_0x01c5
            java.lang.String r10 = "annotations"
        L_0x0162:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0324 }
            r9.<init>()     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r0 = r3.getKey()     // Catch:{ JSONException -> 0x0324 }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ JSONException -> 0x0324 }
            boolean r1 = r0.isArray()     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r0 = r3.getValue()     // Catch:{ JSONException -> 0x0324 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ JSONException -> 0x0324 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ JSONException -> 0x0324 }
            if (r1 == 0) goto L_0x01a1
        L_0x017d:
            boolean r0 = r11.hasNext()     // Catch:{ JSONException -> 0x0324 }
            if (r0 == 0) goto L_0x01c1
            java.lang.Object r2 = r11.next()     // Catch:{ JSONException -> 0x0324 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r1 = r3.getKey()     // Catch:{ JSONException -> 0x0324 }
            java.lang.Class r1 = (java.lang.Class) r1     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r0 = r2.getValue()     // Catch:{ JSONException -> 0x0324 }
            org.json.JSONArray r1 = X.C21460zH.A00(r1, r0)     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r0 = r2.getKey()     // Catch:{ JSONException -> 0x0324 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0324 }
            r9.put(r0, r1)     // Catch:{ JSONException -> 0x0324 }
            goto L_0x017d
        L_0x01a1:
            boolean r0 = r11.hasNext()     // Catch:{ JSONException -> 0x0324 }
            if (r0 == 0) goto L_0x01c1
            java.lang.Object r0 = r11.next()     // Catch:{ JSONException -> 0x0324 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ JSONException -> 0x0324 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r0 = r3.getKey()     // Catch:{ JSONException -> 0x0324 }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ JSONException -> 0x0324 }
            X.C21460zH.A01(r0, r1, r2, r9)     // Catch:{ JSONException -> 0x0324 }
            goto L_0x01a1
        L_0x01c1:
            r5.put(r10, r9)     // Catch:{ JSONException -> 0x0324 }
            goto L_0x014c
        L_0x01c5:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r2 != r0) goto L_0x01cc
            java.lang.String r10 = "annotations_double"
            goto L_0x0162
        L_0x01cc:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r2 != r0) goto L_0x01d3
            java.lang.String r10 = "annotations_bool"
            goto L_0x0162
        L_0x01d3:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r2 != r0) goto L_0x01da
            java.lang.String r10 = "annotations_int"
            goto L_0x0162
        L_0x01da:
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            if (r2 != r0) goto L_0x01e1
            java.lang.String r10 = "annotations_string_array"
            goto L_0x0162
        L_0x01e1:
            java.lang.Class<double[]> r0 = double[].class
            if (r2 != r0) goto L_0x01e9
            java.lang.String r10 = "annotations_double_array"
            goto L_0x0162
        L_0x01e9:
            java.lang.Class<boolean[]> r0 = boolean[].class
            if (r2 != r0) goto L_0x01f1
            java.lang.String r10 = "annotations_bool_array"
            goto L_0x0162
        L_0x01f1:
            java.lang.Class<long[]> r0 = long[].class
            if (r2 != r0) goto L_0x01f9
            java.lang.String r10 = "annotations_int_array"
            goto L_0x0162
        L_0x01f9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0324 }
            r1.<init>()     // Catch:{ JSONException -> 0x0324 }
            java.lang.String r0 = "Unknown class: "
            r1.append(r0)     // Catch:{ JSONException -> 0x0324 }
            r1.append(r2)     // Catch:{ JSONException -> 0x0324 }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x0324 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0324 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0324 }
            throw r0     // Catch:{ JSONException -> 0x0324 }
        L_0x0210:
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ JSONException -> 0x0324 }
            r10.<init>()     // Catch:{ JSONException -> 0x0324 }
            java.util.concurrent.ConcurrentHashMap r11 = r6.A08     // Catch:{ JSONException -> 0x0324 }
            java.util.Set r0 = r11.keySet()     // Catch:{ JSONException -> 0x0324 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ JSONException -> 0x0324 }
        L_0x021f:
            boolean r0 = r9.hasNext()     // Catch:{ JSONException -> 0x0324 }
            if (r0 == 0) goto L_0x0249
            java.lang.Object r0 = r9.next()     // Catch:{ JSONException -> 0x0324 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r3 = r11.get(r0)     // Catch:{ JSONException -> 0x0324 }
            if (r3 == 0) goto L_0x021f
            java.lang.Object r2 = r0.first     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r1 = r0.second     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r0 = r10.get(r2)     // Catch:{ JSONException -> 0x0324 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ JSONException -> 0x0324 }
            if (r0 != 0) goto L_0x0245
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ JSONException -> 0x0324 }
            r0.<init>()     // Catch:{ JSONException -> 0x0324 }
            r10.put(r2, r0)     // Catch:{ JSONException -> 0x0324 }
        L_0x0245:
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0324 }
            goto L_0x021f
        L_0x0249:
            boolean r0 = r10.isEmpty()     // Catch:{ JSONException -> 0x0324 }
            if (r0 != 0) goto L_0x031c
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0324 }
            r11.<init>()     // Catch:{ JSONException -> 0x0324 }
            java.util.Set r0 = r10.entrySet()     // Catch:{ JSONException -> 0x0324 }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ JSONException -> 0x0324 }
        L_0x025c:
            boolean r0 = r17.hasNext()     // Catch:{ JSONException -> 0x0324 }
            if (r0 == 0) goto L_0x0317
            java.lang.Object r10 = r17.next()     // Catch:{ JSONException -> 0x0324 }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r0 = r10.getValue()     // Catch:{ JSONException -> 0x0324 }
            if (r0 == 0) goto L_0x025c
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0324 }
            r9.<init>()     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r0 = r10.getValue()     // Catch:{ JSONException -> 0x0324 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ JSONException -> 0x0324 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ JSONException -> 0x0324 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ JSONException -> 0x0324 }
        L_0x0281:
            boolean r0 = r16.hasNext()     // Catch:{ JSONException -> 0x0324 }
            if (r0 == 0) goto L_0x030c
            java.lang.Object r3 = r16.next()     // Catch:{ JSONException -> 0x0324 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r0 = r3.getValue()     // Catch:{ JSONException -> 0x0324 }
            if (r0 == 0) goto L_0x0281
            java.lang.Object r0 = r3.getValue()     // Catch:{ JSONException -> 0x0324 }
            java.lang.Class r2 = r0.getClass()     // Catch:{ JSONException -> 0x0324 }
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r2 != r0) goto L_0x02b8
            X.0zI r13 = r7.A01     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r12 = r3.getKey()     // Catch:{ JSONException -> 0x0324 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r0 = r3.getValue()     // Catch:{ JSONException -> 0x0324 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ JSONException -> 0x0324 }
            double r0 = r0.doubleValue()     // Catch:{ JSONException -> 0x0324 }
            boolean r0 = A03(r13, r12, r0, r4)     // Catch:{ JSONException -> 0x0324 }
            if (r0 != 0) goto L_0x02b8
            goto L_0x0281
        L_0x02b8:
            java.lang.Class<double[]> r0 = double[].class
            if (r2 != r0) goto L_0x02e5
            X.0zI r0 = r7.A01     // Catch:{ JSONException -> 0x0324 }
            r15 = r0
            java.lang.Object r13 = r3.getKey()     // Catch:{ JSONException -> 0x0324 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r12 = r3.getValue()     // Catch:{ JSONException -> 0x0324 }
            double[] r12 = (double[]) r12     // Catch:{ JSONException -> 0x0324 }
            int r0 = r12.length     // Catch:{ JSONException -> 0x0324 }
            r18 = r0
            r14 = 0
        L_0x02cf:
            r0 = r18
            if (r14 >= r0) goto L_0x02e1
            r0 = r12[r14]     // Catch:{ JSONException -> 0x0324 }
            boolean r0 = A03(r15, r13, r0, r4)     // Catch:{ JSONException -> 0x0324 }
            if (r0 != 0) goto L_0x02dc
            goto L_0x02df
        L_0x02dc:
            int r14 = r14 + 1
            goto L_0x02cf
        L_0x02df:
            r0 = 0
            goto L_0x02e2
        L_0x02e1:
            r0 = 1
        L_0x02e2:
            if (r0 != 0) goto L_0x02e5
            goto L_0x0281
        L_0x02e5:
            boolean r0 = r2.isArray()     // Catch:{ JSONException -> 0x0324 }
            if (r0 == 0) goto L_0x02fd
            java.lang.Object r0 = r3.getValue()     // Catch:{ JSONException -> 0x0324 }
            org.json.JSONArray r1 = X.C21460zH.A00(r2, r0)     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r0 = r3.getKey()     // Catch:{ JSONException -> 0x0324 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0324 }
            r9.put(r0, r1)     // Catch:{ JSONException -> 0x0324 }
            goto L_0x0281
        L_0x02fd:
            java.lang.Object r1 = r3.getKey()     // Catch:{ JSONException -> 0x0324 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x0324 }
            java.lang.Object r0 = r3.getValue()     // Catch:{ JSONException -> 0x0324 }
            X.C21460zH.A01(r2, r0, r1, r9)     // Catch:{ JSONException -> 0x0324 }
            goto L_0x0281
        L_0x030c:
            java.lang.Object r0 = r10.getKey()     // Catch:{ JSONException -> 0x0324 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0324 }
            r11.put(r0, r9)     // Catch:{ JSONException -> 0x0324 }
            goto L_0x025c
        L_0x0317:
            java.lang.String r0 = "metadata"
            r5.put(r0, r11)     // Catch:{ JSONException -> 0x0324 }
        L_0x031c:
            java.lang.String r8 = r5.toString()     // Catch:{ JSONException -> 0x0324 }
            return r8
        L_0x0321:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ JSONException -> 0x0324 }
            throw r0     // Catch:{ JSONException -> 0x0324 }
        L_0x0324:
            r0 = move-exception
            X.0zI r2 = r7.A01
            int r1 = r6.A00
            java.lang.String r0 = r0.getMessage()
            r2.BNs(r1, r0)
        L_0x0330:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21440zF.Bli():java.lang.String");
    }

    public void BpN() {
        this.A07.Boy(new C35731jA((Object) this, 26));
    }

    public void Bxa() {
        C19930wk r1 = this.A0F;
        r1.A02();
        r1.execute((Runnable) this.A0G.get());
    }

    public void endAllInstancesOfMarker(int i, short s) {
        C21820zr r3;
        if (this.A01.A03()) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            ConcurrentHashMap concurrentHashMap = this.A08;
            Integer valueOf = Integer.valueOf(i);
            if (!(concurrentHashMap.get(valueOf) == null || (r3 = (C21820zr) concurrentHashMap.remove(valueOf)) == null)) {
                r3.A02(elapsedRealtimeNanos, s);
                this.A09.add(r3);
                this.A0C.decrementAndGet();
            }
            ArrayList arrayList = new ArrayList();
            long A002 = A00(i, 0);
            long A003 = A002 + A00(1, 0);
            ConcurrentNavigableMap concurrentNavigableMap = this.A0A;
            for (Map.Entry entry : concurrentNavigableMap.subMap(Long.valueOf(A002), Long.valueOf(A003)).entrySet()) {
                if (entry.getValue() != null) {
                    arrayList.add(entry.getKey());
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C21820zr r32 = (C21820zr) concurrentNavigableMap.remove(arrayList.get(i2));
                if (r32 != null) {
                    r32.A02(elapsedRealtimeNanos, s);
                    this.A09.add(r32);
                    this.A0C.decrementAndGet();
                }
            }
            Bxa();
        }
    }

    public C21440zF(C19970wo r3, C21540zP r4, C21470zI r5, C21460zH r6, C21600zV r7, C21450zG r8, C21590zU r9, C21560zR r10, C19770wU r11, AnonymousClass005 r12) {
        this.A00 = r3;
        this.A07 = r11;
        this.A04 = r8;
        this.A02 = r5;
        this.A01 = r4;
        this.A06 = r10;
        this.A05 = r9;
        this.A03 = r7;
        this.A0G = r12;
        this.A0D = r6;
        this.A0E = r7;
        this.A0F = new C19930wk(r11, false);
    }

    private void A02(ConcurrentMap concurrentMap, long j, short s, boolean z) {
        C21820zr r1;
        if (!concurrentMap.isEmpty()) {
            Iterator it = new HashSet(concurrentMap.keySet()).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C21820zr r0 = (C21820zr) concurrentMap.get(next);
                if (r0 != null && ((!z || r0.A0C) && (r1 = (C21820zr) concurrentMap.remove(next)) != null)) {
                    r1.A02(j, s);
                    this.A09.add(r1);
                    this.A0C.decrementAndGet();
                }
            }
            Bxa();
        }
    }

    public static boolean A03(C21470zI r1, String str, double d, int i) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return true;
        }
        r1.BKG(i, str, d);
        return false;
    }

    public void BPH(int i, int i2, short s, String str) {
        C21820zr A052 = A05(Integer.valueOf(i2), i, SystemClock.elapsedRealtimeNanos(), s);
        if (A052 != null) {
            if (!A052.A04(str)) {
                this.A02.Blh(i, str);
            }
            A08(A052);
        }
    }

    public void BPI(String str, int i, short s) {
        C21820zr A052 = A05((Integer) null, 1029386189, SystemClock.elapsedRealtimeNanos(), s);
        if (A052 != null) {
            if (!A052.A04(str)) {
                this.A02.Blh(1029386189, str);
            }
            A08(A052);
        }
    }

    public void BPM(int i, int i2, boolean z) {
        A06(Integer.valueOf(i2), i, SystemClock.elapsedRealtimeNanos(), z);
    }

    public void BsN(int i, int i2, String str) {
        C21820zr A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A07.put("subType", str);
        }
    }

    public long currentMonotonicTimestampNanos() {
        return SystemClock.elapsedRealtimeNanos();
    }

    public boolean isMarkerOn(int i, int i2) {
        C21820zr A042 = A04(Integer.valueOf(i2), i);
        if (A042 == null) {
            return false;
        }
        if (A042.A0A.get() == -1 || A042.A0B.get() == -1) {
            return true;
        }
        return false;
    }

    public void markerEnd(int i, int i2, short s) {
        A08(A05(Integer.valueOf(i2), i, SystemClock.elapsedRealtimeNanos(), s));
    }

    public void markerPoint(int i, int i2, String str) {
        C21820zr A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A01(SystemClock.elapsedRealtimeNanos(), str, (String) null);
        }
    }

    public void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit) {
        A06(Integer.valueOf(i2), i, timeUnit.toNanos(j), z);
    }

    public void markerAnnotate(int i, int i2, String str, double d) {
        C21820zr A042;
        if (A03(this.A02, str, d, i) && (A042 = A04(Integer.valueOf(i2), i)) != null) {
            A042.A00(1, str, Double.valueOf(d));
        }
    }

    public void markerAnnotate(int i, int i2, String str, int i3) {
        C21820zr A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A00(1, str, Long.valueOf((long) i3));
        }
    }

    public void markerAnnotate(int i, int i2, String str, long j) {
        C21820zr A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A00(1, str, Long.valueOf(j));
        }
    }

    public void markerAnnotate(int i, int i2, String str, String str2) {
        C21820zr A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A00(str2.length(), str, str2);
        }
    }

    public void markerAnnotate(int i, int i2, String str, boolean z) {
        C21820zr A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A00(1, str, Boolean.valueOf(z));
        }
    }

    public void markerAnnotate(int i, int i2, String str, double[] dArr) {
        C21470zI r4 = this.A02;
        int length = dArr.length;
        int i3 = 0;
        while (i3 < length) {
            if (A03(r4, str, dArr[i3], i)) {
                i3++;
            } else {
                return;
            }
        }
        C21820zr A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A00(length, str, dArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, int[] iArr) {
        C21820zr A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            int length = iArr.length;
            long[] jArr = new long[length];
            for (int i3 = 0; i3 < length; i3++) {
                jArr[i3] = (long) iArr[i3];
            }
            A042.A00(length, str, jArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, long[] jArr) {
        C21820zr A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A00(jArr.length, str, jArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, String[] strArr) {
        C21820zr A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            int i3 = 0;
            for (String str2 : strArr) {
                if (str2 == null) {
                    i3++;
                } else {
                    i3 += str2.length();
                }
            }
            A042.A00(i3, str, strArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
        C21820zr A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A00(zArr.length, str, zArr);
        }
    }

    public void markerAnnotate(int i, String str, double d) {
        C21820zr A042;
        if (A03(this.A02, str, d, i) && (A042 = A04((Integer) null, i)) != null) {
            A042.A00(1, str, Double.valueOf(d));
        }
    }

    public void markerAnnotate(int i, String str, int i2) {
        C21820zr A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A00(1, str, Long.valueOf((long) i2));
        }
    }

    public void markerAnnotate(int i, String str, long j) {
        C21820zr A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A00(1, str, Long.valueOf(j));
        }
    }

    public void markerAnnotate(int i, String str, String str2) {
        C21820zr A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A00(str2.length(), str, str2);
        }
    }

    public void markerAnnotate(int i, String str, boolean z) {
        C21820zr A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A00(1, str, Boolean.valueOf(z));
        }
    }

    public void markerAnnotate(int i, String str, double[] dArr) {
        C21470zI r4 = this.A02;
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (A03(r4, str, dArr[i2], i)) {
                i2++;
            } else {
                return;
            }
        }
        C21820zr A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A00(length, str, dArr);
        }
    }

    public void markerAnnotate(int i, String str, int[] iArr) {
        C21820zr A042 = A04((Integer) null, i);
        if (A042 != null) {
            int length = iArr.length;
            long[] jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = (long) iArr[i2];
            }
            A042.A00(length, str, jArr);
        }
    }

    public void markerAnnotate(int i, String str, long[] jArr) {
        C21820zr A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A00(jArr.length, str, jArr);
        }
    }

    public void markerAnnotate(int i, String str, String[] strArr) {
        C21820zr A042 = A04((Integer) null, i);
        if (A042 != null) {
            int i2 = 0;
            for (String str2 : strArr) {
                if (str2 == null) {
                    i2++;
                } else {
                    i2 += str2.length();
                }
            }
            A042.A00(i2, str, strArr);
        }
    }

    public void markerAnnotate(int i, String str, boolean[] zArr) {
        C21820zr A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A00(zArr.length, str, zArr);
        }
    }

    public void markerDrop(int i, int i2) {
        A07(i, Integer.valueOf(i2));
    }

    public void markerEnd(int i, short s) {
        A08(A05((Integer) null, i, SystemClock.elapsedRealtimeNanos(), s));
    }

    public void markerPoint(int i, String str) {
        C21820zr A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A01(SystemClock.elapsedRealtimeNanos(), str, (String) null);
        }
    }

    public void markerStart(int i, int i2) {
        A06(Integer.valueOf(i2), i, SystemClock.elapsedRealtimeNanos(), true);
    }

    public void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit) {
        A08(A05(Integer.valueOf(i2), i, timeUnit.toNanos(j), s));
    }

    public void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        C21820zr A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A01(timeUnit.toNanos(j), str, str2);
        }
    }

    public void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        C21820zr A062 = A06(Integer.valueOf(i2), i, timeUnit.toNanos(j), true);
        if (A062 != null) {
            A062.A00(str2.length(), str, str2);
        }
    }

    public void markerEnd(int i, short s, long j, TimeUnit timeUnit) {
        A08(A05((Integer) null, i, timeUnit.toNanos(j), s));
    }

    public void markerPoint(int i, int i2, String str, String str2) {
        C21820zr A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A01(SystemClock.elapsedRealtimeNanos(), str, str2);
        }
    }

    public void markerStart(int i, int i2, String str, String str2) {
        C21820zr A062 = A06(Integer.valueOf(i2), i, SystemClock.elapsedRealtimeNanos(), true);
        if (A062 != null) {
            A062.A00(str2.length(), str, str2);
        }
    }

    public void markerPoint(int i, String str, long j, TimeUnit timeUnit) {
        C21820zr A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A01(timeUnit.toNanos(j), str, (String) null);
        }
    }

    public void markerStart(int i) {
        A06((Integer) null, i, SystemClock.elapsedRealtimeNanos(), true);
    }

    public void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
        C21820zr A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A01(timeUnit.toNanos(j), str, str2);
        }
    }

    public void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit) {
        C21820zr A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A01(timeUnit.toNanos(j), str, (String) null);
        }
    }

    public void markerPoint(int i, String str, String str2) {
        C21820zr A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A01(SystemClock.elapsedRealtimeNanos(), str, str2);
        }
    }
}
