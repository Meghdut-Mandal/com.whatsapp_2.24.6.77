package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.quicklog.EventBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.6je  reason: invalid class name and case insensitive filesystem */
public class C139356je implements C161027m0 {
    public static final String[] A0G = new String[0];
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final C148316yf A04;
    public final String A05;
    public final ConcurrentHashMap A06 = C90524aI.A0s();
    public final ConcurrentHashMap A07 = C90524aI.A0s();
    public final ConcurrentLinkedQueue A08 = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue A09 = new ConcurrentLinkedQueue();
    public final AtomicLong A0A;
    public final C19970wo A0B;
    public final C118045nF A0C;
    public final AtomicBoolean A0D;
    public final AtomicInteger A0E;
    public volatile String A0F;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C139356je(X.C19970wo r14, X.C148316yf r15, X.C118045nF r16, java.lang.String r17, int r18, int r19, long r20, long r22) {
        /*
            r13 = this;
            r3 = 0
            r8 = 1
            r13.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = X.C90524aI.A0s()
            r13.A07 = r0
            java.util.concurrent.ConcurrentHashMap r0 = X.C90524aI.A0s()
            r13.A06 = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r13.A08 = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r13.A09 = r0
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>(r3)
            r13.A0D = r2
            r0 = 0
            java.util.concurrent.atomic.AtomicLong r4 = new java.util.concurrent.atomic.AtomicLong
            r4.<init>(r0)
            r13.A0A = r4
            r13.A0B = r14
            r13.A04 = r15
            r0 = r16
            r13.A0C = r0
            r4 = r17
            r13.A05 = r4
            r7 = r18
            r13.A01 = r7
            r9 = r19
            r13.A00 = r9
            r0 = r20
            r13.A03 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r3)
            r13.A0E = r0
            r10 = r22
            r13.A02 = r10
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.NANOSECONDS
            if (r17 == 0) goto L_0x00a2
            X.6Wm r6 = r15.A06
            X.C133056Wm.A01(r6)
            java.util.concurrent.ConcurrentHashMap r0 = r6.A03
            java.lang.Object r5 = r0.get(r4)
            X.5rO r5 = (X.C120365rO) r5
            if (r5 != 0) goto L_0x0073
            r1 = 812974081(0x30750001, float:8.9130486E-10)
            r0 = -1
            X.5rO r5 = new X.5rO
            r5.<init>(r0, r1)
            java.util.concurrent.ConcurrentHashMap r0 = r6.A03
            r0.put(r4, r5)
        L_0x0073:
            int r1 = r5.A00
        L_0x0075:
            if (r1 != r8) goto L_0x009c
            X.0zE r6 = r15.A03
        L_0x0079:
            r6.markerStartWithCancelPolicy(r7, r8, r9, r10, r12)
        L_0x007c:
            if (r17 == 0) goto L_0x0083
            java.lang.String r0 = "app_id"
            r15.markerAnnotate((int) r7, (int) r9, (java.lang.String) r0, (java.lang.String) r4)
        L_0x0083:
            X.0zI r4 = r15.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            X.4qp r1 = new X.4qp
            r1.<init>(r4, r15, r0, r7)
            java.lang.String r0 = "ttrc_tracking_version"
            r1.annotate((java.lang.String) r0, (int) r8)
            java.lang.String r0 = "ttrc_back_start_on_touch_up"
            r1.annotate((java.lang.String) r0, (boolean) r3)
            r2.set(r3)
            return
        L_0x009c:
            r0 = 2
            if (r1 != r0) goto L_0x007c
            X.0zE r6 = r15.A02
            goto L_0x0079
        L_0x00a2:
            X.6Wm r0 = r15.A06
            X.5va r0 = X.C133056Wm.A00(r0, r7)
            int r1 = r0.A00
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139356je.<init>(X.0wo, X.6yf, X.5nF, java.lang.String, int, int, long, long):void");
    }

    public static void A04(C139356je r5, String str) {
        r5.A09(3, str);
        if (r5.A0A()) {
            r5.A06(C023109s.A0R);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("marker_id:");
        int i = r5.A01;
        A0u.append(i);
        String A0p = AnonymousClass000.A0p(",error:", str, A0u);
        StringBuilder A0h = C90464aC.A0h(i, "marker_id:");
        A0h.append(",instance_key:");
        A0h.append(r5.A00);
        String A0p2 = AnonymousClass000.A0p(",error:", str, A0h);
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("TTRCTrace|");
        String A0q = AnonymousClass000.A0q(r5.A05, A0u2);
        C148316yf r2 = r5.A04;
        StringBuilder A0v = AnonymousClass000.A0v(A0q);
        A0v.append(" : ");
        AnonymousClass000.A1D(A0p, " : ", A0p2, A0v);
        r2.A00.BoH(A0v.toString());
    }

    public void A07(long j, String str) {
        String str2 = str;
        if (str != null) {
            this.A04.markerPoint(this.A01, this.A00, str2, (String) null, TimeUnit.MILLISECONDS.toNanos(j), TimeUnit.NANOSECONDS);
        }
    }

    public void BPA(String str, long j) {
        String str2 = str;
        if (str != null) {
            this.A04.markerAnnotate(this.A01, this.A00, str2, j);
        }
    }

    public void BPL(String str, long j) {
        String str2 = str;
        if (str != null && !"surface_core_created_at".equals(str)) {
            this.A04.markerPoint(this.A01, this.A00, str2, (String) null, TimeUnit.MILLISECONDS.toNanos(j), TimeUnit.NANOSECONDS);
        }
    }

    private void A01() {
        Iterator A10 = C36391kE.A10(this.A07);
        while (A10.hasNext()) {
            AnonymousClass6OL r2 = (AnonymousClass6OL) A10.next();
            if (r2 != null && r2.A00() != C023109s.A0G && r2.A00() != C023109s.A0R) {
                return;
            }
        }
        if (A05()) {
            A00();
            A02();
        }
    }

    private void A02() {
        String str = this.A0F;
        if (str == null) {
            this.A04.markerEnd(this.A01, this.A00, 2);
        } else {
            C148316yf r0 = this.A04;
            r0.A03.BPH(this.A01, this.A00, 2, str);
        }
        A06(C023109s.A0G);
    }

    private void A03(long j) {
        Integer A002;
        AtomicBoolean atomicBoolean = this.A0D;
        if (!atomicBoolean.get() && A05()) {
            Integer BIV = BIV();
            int i = 0;
            Integer num = C023109s.A0C;
            Integer[] numArr = {C023109s.A00, num};
            while (BIV != numArr[i]) {
                i++;
                if (i >= 2) {
                    return;
                }
            }
            if (!atomicBoolean.getAndSet(true)) {
                Iterator A10 = C36391kE.A10(this.A07);
                while (A10.hasNext()) {
                    AnonymousClass6OL r0 = (AnonymousClass6OL) A10.next();
                    if (r0 != null && (A002 = r0.A00()) != C023109s.A0G && A002 != C023109s.A0R && A002 != num) {
                        return;
                    }
                }
                A07(TimeUnit.NANOSECONDS.toMillis(j), "time_to_initial_content");
            }
        }
    }

    private boolean A05() {
        Iterator A10 = C36391kE.A10(this.A06);
        while (A10.hasNext()) {
            C118055nG r0 = (C118055nG) A10.next();
            if (r0 != null) {
                AtomicInteger atomicInteger = r0.A00;
                if (C023109s.A00(3)[atomicInteger.get()] != C023109s.A01) {
                    if (C023109s.A00(3)[atomicInteger.get()] != C023109s.A0C) {
                        return false;
                    }
                } else {
                    continue;
                }
            }
        }
        return true;
    }

    public void A08(String str, String[] strArr) {
        if (strArr != null) {
            this.A04.markerAnnotate(this.A01, this.A00, str, strArr);
        }
    }

    public void B0i(String str, TimeUnit timeUnit, long j) {
        AnonymousClass6OL r2;
        if (A0B(C023109s.A01)) {
            if (j == -1) {
                r2 = new AnonymousClass6OL(this, str);
            } else {
                r2 = new AnonymousClass6OL(this, str, timeUnit.toMillis(j));
            }
            if (this.A07.putIfAbsent(str, r2) != null) {
                A04(this, AnonymousClass000.A0p("Attempted to Add Query Twice for: ", str, AnonymousClass000.A0u()));
            }
        }
    }

    public void B0l(String str) {
        if (A0B(C023109s.A01)) {
            if (this.A06.putIfAbsent(str, new C118055nG()) != null) {
                A04(this, AnonymousClass000.A0p("Attempted to Add Additional Step Twice for: ", str, AnonymousClass000.A0u()));
            }
        }
    }

    public void B2A(long j, String str, boolean z, long j2) {
        Integer num = C023109s.A0C;
        if (A0B(num)) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(j2);
            AnonymousClass6OL r6 = (AnonymousClass6OL) this.A07.get(str);
            if (r6 != null) {
                if (z) {
                    num = C023109s.A0G;
                }
                int intValue = num.intValue();
                boolean z2 = true;
                if (intValue != 2) {
                    AtomicInteger atomicInteger = r6.A05;
                    if (!atomicInteger.compareAndSet(0, intValue) && !atomicInteger.compareAndSet(2, intValue) && !atomicInteger.compareAndSet(1, intValue)) {
                        return;
                    }
                } else {
                    z2 = r6.A05.compareAndSet(0, intValue);
                }
                boolean z3 = false;
                if (z2) {
                    r6.A02 = true;
                    if (j > r6.A03) {
                        z3 = true;
                    }
                    r6.A00 = z3;
                    C139356je r5 = r6.A06;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("cache_was_recent_for_");
                    String str2 = r6.A04;
                    r5.BPC(AnonymousClass000.A0q(str2, A0u), !z3);
                    r5.BPA(AnonymousClass000.A0p("cache_age_ms_for_", str2, AnonymousClass000.A0u()), j);
                    r5.A0F = AnonymousClass000.A0p("ttcc_for_", str2, AnonymousClass000.A0u());
                    r5.A0A.set(nanos);
                    r5.A07(TimeUnit.NANOSECONDS.toMillis(nanos), r5.A0F);
                    A03(nanos);
                    if (z) {
                        r6.A01();
                        A01();
                    }
                }
            }
        }
    }

    public Integer BIV() {
        return C023109s.A00(7)[this.A0E.get()];
    }

    public void BO3() {
        BO4("leftSurface");
    }

    public void BPB(String str, String str2) {
        if (str != null && str2 != null) {
            this.A04.markerAnnotate(this.A01, this.A00, str, str2);
        }
    }

    public void BPC(String str, boolean z) {
        if (str != null) {
            this.A04.markerAnnotate(this.A01, this.A00, str, z);
        }
    }

    public void BPK(String str) {
        if (str != null) {
            C148316yf r0 = this.A04;
            r0.A03.markerPoint(this.A01, this.A00, str);
        }
    }

    private void A00() {
        String obj;
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        ConcurrentHashMap concurrentHashMap = this.A07;
        Iterator A10 = C36391kE.A10(concurrentHashMap);
        while (A10.hasNext()) {
            AnonymousClass6OL r3 = (AnonymousClass6OL) A10.next();
            if (r3 != null && r3.A00() == C023109s.A0R) {
                A0I.add(r3.A04);
            }
        }
        Iterator A102 = C36371kC.A10(this.A06);
        while (A102.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A102);
            if (A11 != null) {
                Object key = A11.getKey();
                C118055nG r0 = (C118055nG) A11.getValue();
                if (r0 != null) {
                    if (C023109s.A00(3)[r0.A00.get()] == C023109s.A0C) {
                        A0I2.add(key);
                    }
                }
            }
        }
        if (!A0I.isEmpty()) {
            A08("revoked_queries", (String[]) A0I.toArray(A0G));
        }
        if (!A0I2.isEmpty()) {
            A08("revoked_steps", (String[]) A0I2.toArray(A0G));
        }
        ArrayList A0I3 = AnonymousClass001.A0I();
        ArrayList A0I4 = AnonymousClass001.A0I();
        Iterator A103 = C36391kE.A10(concurrentHashMap);
        while (A103.hasNext()) {
            AnonymousClass6OL r32 = (AnonymousClass6OL) A103.next();
            if (r32 != null && r32.A00() == C023109s.A0G) {
                if (!r32.A02 || r32.A01) {
                    A0I4.add(r32.A04);
                } else {
                    A0I3.add(r32.A04);
                }
            }
        }
        if (!A0I3.isEmpty() || !A0I4.isEmpty()) {
            if (A0I4.isEmpty()) {
                obj = "CACHE";
            } else if (A0I3.isEmpty()) {
                obj = "NETWORK";
            } else {
                Collections.sort(A0I3);
                Collections.sort(A0I4);
                StringBuilder A0u = AnonymousClass000.A0u();
                Iterator it = A0I3.iterator();
                while (it.hasNext()) {
                    String A0C2 = AnonymousClass001.A0C(it);
                    if (A0C2 != null) {
                        if (A0u.length() != 0) {
                            A0u.append(", ");
                        }
                        A0u.append(A0C2);
                        A0u.append("_C");
                    }
                }
                Iterator it2 = A0I4.iterator();
                while (it2.hasNext()) {
                    String A0C3 = AnonymousClass001.A0C(it2);
                    if (A0C3 != null) {
                        A0u.append(", ");
                        A0u.append(A0C3);
                        A0u.append("_N");
                    }
                }
                obj = A0u.toString();
            }
            BPB("ttrc_source", obj);
        }
        ArrayList A0I5 = AnonymousClass001.A0I();
        Iterator A104 = C36391kE.A10(concurrentHashMap);
        while (A104.hasNext()) {
            AnonymousClass6OL r1 = (AnonymousClass6OL) A104.next();
            if (r1 != null && r1.A02) {
                A0I5.add(r1.A04);
            }
        }
        if (!A0I5.isEmpty()) {
            Collections.sort(A0I5);
            StringBuilder A0u2 = AnonymousClass000.A0u();
            Iterator it3 = A0I5.iterator();
            while (it3.hasNext()) {
                String A0C4 = AnonymousClass001.A0C(it3);
                if (A0C4 != null) {
                    if (A0u2.length() != 0) {
                        C90504aG.A1M(A0u2);
                    }
                    A0u2.append(A0C4);
                }
            }
            BPB("ttrc_cache_rendered", A0u2.toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
        if (r2 != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        if (r2 != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        r0 = r7.A08;
        r1 = A0G;
        A08("cache_and_network_queries", (java.lang.String[]) r0.toArray(r1));
        A08("network_only_queries", (java.lang.String[]) r7.A09.toArray(r1));
        A08("steps", (java.lang.String[]) r7.A06.keySet().toArray(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A06(java.lang.Integer r8) {
        /*
            r7 = this;
            int r5 = r8.intValue()
            r2 = 1
            java.lang.String r3 = "steps"
            java.lang.String r4 = "network_only_queries"
            java.lang.String r6 = "cache_and_network_queries"
            switch(r5) {
                case 1: goto L_0x008f;
                case 2: goto L_0x0086;
                case 3: goto L_0x0075;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.util.concurrent.atomic.AtomicInteger r1 = r7.A0E
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r5)
            if (r0 != 0) goto L_0x004b
            boolean r0 = r1.compareAndSet(r2, r5)
            if (r0 != 0) goto L_0x004b
            r0 = 2
            boolean r0 = r1.compareAndSet(r0, r5)
            if (r0 == 0) goto L_0x0099
        L_0x0024:
            java.util.concurrent.ConcurrentLinkedQueue r0 = r7.A08
            java.lang.String[] r1 = A0G
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r7.A08(r6, r0)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r7.A09
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r7.A08(r4, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r7.A06
            java.util.Set r0 = r0.keySet()
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r7.A08(r3, r0)
        L_0x004b:
            X.5nF r3 = r7.A0C
            long r0 = r7.A03
            java.util.concurrent.ConcurrentHashMap r4 = r3.A00
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r4.get(r3)
            X.7m0 r0 = (X.C161027m0) r0
            if (r0 == 0) goto L_0x0074
            java.lang.Integer r1 = r0.BIV()
            java.lang.Integer r0 = X.C023109s.A0S
            if (r1 == r0) goto L_0x0071
            java.lang.Integer r0 = X.C023109s.A0V
            if (r1 == r0) goto L_0x0071
            java.lang.Integer r0 = X.C023109s.A0R
            if (r1 == r0) goto L_0x0071
            java.lang.Integer r0 = X.C023109s.A0G
            if (r1 != r0) goto L_0x0074
        L_0x0071:
            r4.remove(r3)
        L_0x0074:
            return r2
        L_0x0075:
            java.util.concurrent.atomic.AtomicInteger r1 = r7.A0E
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r5)
            if (r0 != 0) goto L_0x004b
            r0 = 2
            boolean r0 = r1.compareAndSet(r0, r5)
            if (r0 == 0) goto L_0x0099
            goto L_0x004b
        L_0x0086:
            java.util.concurrent.atomic.AtomicInteger r0 = r7.A0E
            boolean r2 = r0.compareAndSet(r2, r5)
            if (r2 == 0) goto L_0x0074
            goto L_0x0024
        L_0x008f:
            java.util.concurrent.atomic.AtomicInteger r1 = r7.A0E
            r0 = 0
            boolean r2 = r1.compareAndSet(r0, r5)
            if (r2 == 0) goto L_0x0074
            goto L_0x004b
        L_0x0099:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139356je.A06(java.lang.Integer):boolean");
    }

    public void A09(short s, String str) {
        if (!TextUtils.isEmpty(str)) {
            C148316yf r4 = this.A04;
            C98074qp r1 = new C98074qp(r4.A00, r4, Integer.valueOf(this.A00), this.A01);
            r1.annotate("end_reason", str);
            r1.markerEditingCompleted();
        }
        this.A04.markerEnd(this.A01, this.A00, s);
    }

    public boolean A0A() {
        Integer BIV = BIV();
        Integer[] numArr = {C023109s.A00, C023109s.A01, C023109s.A0C};
        int i = 0;
        while (BIV != numArr[i]) {
            i++;
            if (i >= 3) {
                return false;
            }
        }
        return true;
    }

    public boolean A0B(Integer num) {
        if (BIV() == new Integer[]{num}[0] || A06(num)) {
            return true;
        }
        if (BIV() != new Integer[]{num}[0]) {
            return false;
        }
        return true;
    }

    public void B79(String str) {
        EventBuilder eventBuilder;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (A0A()) {
            A06(C023109s.A0R);
            A00();
            A09(3, str);
            long millis = elapsedRealtime - TimeUnit.NANOSECONDS.toMillis(this.A02);
            C148316yf r6 = this.A04;
            String str2 = this.A05;
            if (r6.A01.A01(78315522)) {
                eventBuilder = new C140286lL(r6.A00, r6, (Integer) null, str2, 78315522);
            } else {
                eventBuilder = C140296lM.A00;
            }
            EventBuilder level = eventBuilder.annotate("duration", millis).setLevel(3);
            if (str != null) {
                level.annotate("message", str);
            }
            level.report();
        }
    }

    public void BO4(String str) {
        Integer A002;
        EventBuilder eventBuilder;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (A0A()) {
            A00();
            ConcurrentHashMap concurrentHashMap = this.A07;
            if (!concurrentHashMap.isEmpty() || !this.A06.isEmpty()) {
                Iterator A10 = C36391kE.A10(concurrentHashMap);
                while (true) {
                    if (A10.hasNext()) {
                        AnonymousClass6OL r4 = (AnonymousClass6OL) A10.next();
                        if (r4 != null && (((A002 = r4.A00()) != C023109s.A0C || r4.A00) && A002 != C023109s.A0G && A002 != C023109s.A0R)) {
                            break;
                        }
                    } else if (A05()) {
                        Iterator A102 = C36391kE.A10(concurrentHashMap);
                        while (A102.hasNext()) {
                            AnonymousClass6OL r2 = (AnonymousClass6OL) A102.next();
                            if (r2 != null && r2.A00() == C023109s.A0C) {
                                r2.A01();
                            }
                        }
                        A02();
                        return;
                    }
                }
            }
            A06(C023109s.A0S);
            A09(4, str);
            long millis = elapsedRealtime - TimeUnit.NANOSECONDS.toMillis(this.A02);
            if (millis > 5000) {
                String str2 = this.A05;
                if (str2 == null) {
                    str2 = Integer.toString(this.A01);
                }
                C148316yf r5 = this.A04;
                if (r5.A01.A01(78315521)) {
                    eventBuilder = new C140286lL(r5.A00, r5, (Integer) null, str2, 78315521);
                } else {
                    eventBuilder = C140296lM.A00;
                }
                eventBuilder.annotate("duration", millis).setLevel(5).report();
            }
        }
    }

    public void BQ7(String str, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (A0B(C023109s.A0C)) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(elapsedRealtime);
            AnonymousClass6OL r6 = (AnonymousClass6OL) this.A07.get(str);
            if (r6 != null) {
                AtomicInteger atomicInteger = r6.A05;
                if (atomicInteger.compareAndSet(0, 3) || atomicInteger.compareAndSet(2, 3) || atomicInteger.compareAndSet(1, 3)) {
                    r6.A01 = true;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("ttnc_for_");
                    String A0q = AnonymousClass000.A0q(r6.A04, A0u);
                    C139356je r4 = r6.A06;
                    r4.A0F = A0q;
                    r4.A0A.set(nanos);
                    r4.A07(TimeUnit.NANOSECONDS.toMillis(nanos), A0q);
                    r6.A01();
                    A03(nanos);
                    A01();
                }
            }
        }
    }

    public void Bv4(String str) {
        C118055nG r0;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (A0B(C023109s.A0C) && (r0 = (C118055nG) this.A06.get(str)) != null) {
            AtomicInteger atomicInteger = r0.A00;
            if (C023109s.A00(3)[atomicInteger.get()] == C023109s.A00 && atomicInteger.compareAndSet(0, 1)) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(elapsedRealtime);
                String A0p = AnonymousClass000.A0p("step_completed_", str, AnonymousClass000.A0u());
                AtomicLong atomicLong = this.A0A;
                if (atomicLong.get() <= nanos) {
                    this.A0F = A0p;
                    atomicLong.set(nanos);
                }
                A07(elapsedRealtime, A0p);
                A03(atomicLong.get());
                A01();
            }
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A01);
        A0u.append("_");
        return C36381kD.A10(A0u, this.A00);
    }
}
