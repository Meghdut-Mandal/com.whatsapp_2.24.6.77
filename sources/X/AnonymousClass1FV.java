package X;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1FV  reason: invalid class name */
public final class AnonymousClass1FV {
    public static final long A09 = TimeUnit.DAYS.toMillis(1);
    public final C19970wo A00;
    public final AnonymousClass1ER A01;
    public final C220412q A02;
    public final C219712j A03;
    public final AnonymousClass1FW A04;
    public final AnonymousClass12O A05;
    public final AnonymousClass1FX A06;
    public final Map A07;
    public final Set A08;

    public AnonymousClass1FV(C19970wo r3, AnonymousClass1ER r4, C220412q r5, C219712j r6, AnonymousClass1FW r7, AnonymousClass12O r8, AnonymousClass1FX r9) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass00C.A0D(r8, 5);
        AnonymousClass00C.A0D(r9, 7);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = r3;
        this.A03 = r6;
        this.A05 = r8;
        this.A04 = r7;
        this.A06 = r9;
        this.A08 = linkedHashSet;
        this.A07 = linkedHashMap;
    }

    public synchronized Boolean A06(C223313w r6) {
        Boolean bool;
        AnonymousClass00C.A0D(r6, 0);
        long A072 = this.A03.A07(r6);
        Map map = this.A07;
        Long valueOf = Long.valueOf(A072);
        if (map.containsKey(valueOf)) {
            AnonymousClass3Q1 r0 = (AnonymousClass3Q1) map.get(valueOf);
            if (r0 != null) {
                bool = r0.A01;
            }
        } else if (A072 != -1) {
            bool = this.A04.A01(A072);
            A05(bool, A072);
        }
        bool = null;
        return bool;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r4 != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A07(X.C223313w r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)     // Catch:{ all -> 0x0049 }
            java.lang.Boolean r0 = r5.A06(r6)     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0047
            X.12q r0 = r5.A02     // Catch:{ all -> 0x0049 }
            r4 = 1
            X.3Qp r0 = r0.A09(r6, r4)     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0023
            X.2oy r0 = r0.A0Z     // Catch:{ all -> 0x0049 }
        L_0x0016:
            X.2oy r1 = X.C52152oy.USERNAME     // Catch:{ all -> 0x0049 }
            if (r0 == r1) goto L_0x0026
            X.1ER r0 = r5.A01     // Catch:{ all -> 0x0049 }
            X.2oy r0 = r0.A00(r6)     // Catch:{ all -> 0x0049 }
            if (r0 == r1) goto L_0x0026
            goto L_0x0025
        L_0x0023:
            r0 = 0
            goto L_0x0016
        L_0x0025:
            r4 = 0
        L_0x0026:
            X.12O r0 = r5.A05     // Catch:{ all -> 0x0049 }
            com.whatsapp.jid.PhoneUserJid r0 = r0.A0A(r6)     // Catch:{ all -> 0x0049 }
            r3 = 0
            if (r0 != 0) goto L_0x0030
            r3 = 1
        L_0x0030:
            X.12j r0 = r5.A03     // Catch:{ all -> 0x0049 }
            long r1 = r0.A07(r6)     // Catch:{ all -> 0x0049 }
            if (r3 == 0) goto L_0x003b
            r0 = 1
            if (r4 == 0) goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            A04(r5, r6, r1, r0)     // Catch:{ all -> 0x0049 }
            if (r3 == 0) goto L_0x0047
            X.1FX r1 = r5.A06     // Catch:{ all -> 0x0049 }
            r0 = 1
            r1.A00(r6, r0, r0, r0)     // Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r5)
            return
        L_0x0049:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FV.A07(X.13w):void");
    }

    public synchronized void A08(C223313w r4) {
        AnonymousClass00C.A0D(r4, 0);
        A04(this, r4, this.A03.A07(r4), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.C05600Qi.A00(r7, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.C05600Qi.A00(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A09(X.C223313w r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            X.AnonymousClass00C.A0D(r10, r0)     // Catch:{ all -> 0x0089 }
            X.12j r0 = r9.A03     // Catch:{ all -> 0x0089 }
            long r1 = r0.A07(r10)     // Catch:{ all -> 0x0089 }
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0087
            X.1FW r0 = r9.A04     // Catch:{ all -> 0x0089 }
            X.12P r0 = r0.A00     // Catch:{ all -> 0x005e }
            X.1M0 r6 = r0.A05()     // Catch:{ all -> 0x005e }
            X.AnonymousClass00C.A0B(r6)     // Catch:{ all -> 0x0057 }
            X.71s r7 = r6.B1k()     // Catch:{ all -> 0x0057 }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x0050 }
            r8.<init>()     // Catch:{ all -> 0x0050 }
            java.lang.String r3 = "jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0050 }
            r8.put(r3, r0)     // Catch:{ all -> 0x0050 }
            java.lang.String r3 = "pnh_duplicate_lid_thread"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x0050 }
            r8.put(r3, r0)     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = "LidChatStateStore/SET_LID_DUPLICATE_FLAG"
            X.14e r4 = r6.A02     // Catch:{ all -> 0x0050 }
            java.lang.String r3 = "lid_chat_state"
            r0 = 5
            r4.A08(r3, r5, r8, r0)     // Catch:{ all -> 0x0050 }
            r7.A00()     // Catch:{ all -> 0x0050 }
            r7.close()     // Catch:{ all -> 0x0057 }
            r0 = 1
            r6.close()     // Catch:{ all -> 0x005e }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x005e }
            goto L_0x0064
        L_0x0050:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            X.C05600Qi.A00(r7, r3)     // Catch:{ all -> 0x0057 }
            throw r0     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            X.C05600Qi.A00(r6, r3)     // Catch:{ all -> 0x005e }
            throw r0     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            X.03N r4 = new X.03N     // Catch:{ all -> 0x0089 }
            r4.<init>(r0)     // Catch:{ all -> 0x0089 }
        L_0x0064:
            java.lang.Throwable r3 = X.AnonymousClass0AK.A00(r4)     // Catch:{ all -> 0x0089 }
            if (r3 == 0) goto L_0x006f
            java.lang.String r0 = "{LidChatStateStore/}failed to set duplicate flag"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x0089 }
        L_0x006f:
            r0 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0089 }
            boolean r0 = r4 instanceof X.AnonymousClass03N     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0079
            r4 = r3
        L_0x0079:
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0089 }
            boolean r0 = r4.booleanValue()     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0087
            r9.A01(r1, r11)     // Catch:{ all -> 0x0089 }
            A03(r9, r10, r1)     // Catch:{ all -> 0x0089 }
        L_0x0087:
            monitor-exit(r9)
            return
        L_0x0089:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FV.A09(X.13w, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0A(X.C223313w r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)     // Catch:{ all -> 0x0036 }
            X.12j r0 = r5.A03     // Catch:{ all -> 0x0036 }
            long r1 = r0.A07(r6)     // Catch:{ all -> 0x0036 }
            java.util.Map r3 = r5.A07     // Catch:{ all -> 0x0036 }
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x0036 }
            X.3Q1 r0 = (X.AnonymousClass3Q1) r0     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0023
            boolean r3 = r0.A02     // Catch:{ all -> 0x0036 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0023
            monitor-exit(r5)
            return r3
        L_0x0023:
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
            r0 = 0
        L_0x002a:
            monitor-exit(r5)
            return r0
        L_0x002c:
            X.1FW r0 = r5.A04     // Catch:{ all -> 0x0036 }
            boolean r0 = r0.A02(r1)     // Catch:{ all -> 0x0036 }
            r5.A01(r1, r0)     // Catch:{ all -> 0x0036 }
            goto L_0x002a
        L_0x0036:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FV.A0A(X.13w):boolean");
    }

    public synchronized boolean A0B(C223313w r7) {
        boolean z;
        z = false;
        if (A00(this, r7) + A09 > System.currentTimeMillis()) {
            z = true;
        }
        return z;
    }

    public static final long A00(AnonymousClass1FV r6, C223313w r7) {
        long A072 = r6.A03.A07(r7);
        Map map = r6.A07;
        Long valueOf = Long.valueOf(A072);
        if (map.containsKey(valueOf)) {
            AnonymousClass3Q1 r0 = (AnonymousClass3Q1) map.get(valueOf);
            if (r0 != null) {
                return r0.A00;
            }
            return 0;
        }
        long A002 = r6.A04.A00(A072);
        A02(r6, A072, A002);
        return A002;
    }

    private final void A01(long j, boolean z) {
        Boolean A012;
        long A002;
        Map map = this.A07;
        Long valueOf = Long.valueOf(j);
        AnonymousClass3Q1 r0 = (AnonymousClass3Q1) map.get(valueOf);
        if (r0 != null) {
            A012 = r0.A01;
            A002 = r0.A00;
        } else {
            AnonymousClass1FW r02 = this.A04;
            A012 = r02.A01(j);
            A002 = r02.A00(j);
        }
        map.put(valueOf, new AnonymousClass3Q1(A012, A002, z));
    }

    public static final void A02(AnonymousClass1FV r5, long j, long j2) {
        Boolean A012;
        boolean A022;
        Map map = r5.A07;
        Long valueOf = Long.valueOf(j);
        AnonymousClass3Q1 r0 = (AnonymousClass3Q1) map.get(valueOf);
        if (r0 != null) {
            A012 = r0.A01;
            A022 = r0.A02;
        } else {
            AnonymousClass1FW r02 = r5.A04;
            A012 = r02.A01(j);
            A022 = r02.A02(j);
        }
        map.put(valueOf, new AnonymousClass3Q1(A012, j2, A022));
    }

    public static final void A03(AnonymousClass1FV r4, C223313w r5, long j) {
        AnonymousClass3Q1 r3 = (AnonymousClass3Q1) r4.A07.get(Long.valueOf(j));
        if (r3 != null) {
            Set<AnonymousClass4QF> set = r4.A08;
            synchronized (set) {
                for (AnonymousClass4QF Bce : set) {
                    Bce.Bce(r3, r5);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.AnonymousClass1FV r7, X.C223313w r8, long r9, boolean r11) {
        /*
            r1 = -1
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x007c
            X.1FW r0 = r7.A04
            X.12P r0 = r0.A00     // Catch:{ all -> 0x004f }
            X.1M0 r4 = r0.A05()     // Catch:{ all -> 0x004f }
            X.AnonymousClass00C.A0B(r4)     // Catch:{ all -> 0x0048 }
            X.71s r5 = r4.B1k()     // Catch:{ all -> 0x0048 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0041 }
            r6.<init>()     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0041 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = "is_pn_shared"
            X.AnonymousClass3SW.A02(r6, r0, r11)     // Catch:{ all -> 0x0041 }
            java.lang.String r3 = "LidChatStateStore/SET_PN_SHARED_FOR_JID"
            X.14e r2 = r4.A02     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "lid_chat_state"
            r0 = 5
            r2.A08(r1, r3, r6, r0)     // Catch:{ all -> 0x0041 }
            r5.A00()     // Catch:{ all -> 0x0041 }
            r5.close()     // Catch:{ all -> 0x0048 }
            r0 = 1
            r4.close()     // Catch:{ all -> 0x004f }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x004f }
            goto L_0x0055
        L_0x0041:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x004f }
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            X.03N r2 = new X.03N
            r2.<init>(r0)
        L_0x0055:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r2)
            if (r1 == 0) goto L_0x0060
            java.lang.String r0 = "LidChatStateStore/failed to set phone number shared state"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0060:
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r2 instanceof X.AnonymousClass03N
            if (r0 == 0) goto L_0x006a
            r2 = r1
        L_0x006a:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 == 0) goto L_0x007c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r7.A05(r0, r9)
            A03(r7, r8, r9)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FV.A04(X.1FV, X.13w, long, boolean):void");
    }

    private final void A05(Boolean bool, long j) {
        long A002;
        boolean A022;
        Map map = this.A07;
        Long valueOf = Long.valueOf(j);
        AnonymousClass3Q1 r0 = (AnonymousClass3Q1) map.get(valueOf);
        if (r0 != null) {
            A002 = r0.A00;
            A022 = r0.A02;
        } else {
            AnonymousClass1FW r02 = this.A04;
            A002 = r02.A00(j);
            A022 = r02.A02(j);
        }
        map.put(valueOf, new AnonymousClass3Q1(bool, A002, A022));
    }
}
