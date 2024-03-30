package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1IZ  reason: invalid class name */
public class AnonymousClass1IZ implements AnonymousClass1IX, AnonymousClass1IY {
    public C61723De A00 = null;
    public final AnonymousClass1C3 A01;
    public final C25881Ia A02;
    public final AnonymousClass1AB A03;
    public final C237119n A04;
    public final AnonymousClass1A9 A05;
    public final AnonymousClass1AK A06;
    public final C237219o A07;
    public final AnonymousClass1AE A08;
    public final Set A09;
    public final C19730wQ A0A;
    public final C19980wp A0B;
    public final AnonymousClass1AC A0C;
    public final Object A0D = new Object();
    public final Set A0E;

    public synchronized void A02(C61723De r2) {
        this.A00 = r2;
    }

    public void A03(List list) {
        C61723De r5;
        C173408Ro r4;
        synchronized (this) {
            r5 = this.A00;
        }
        if (r5 != null) {
            synchronized (r5) {
                Iterator it = list.iterator();
                long j = 0;
                while (it.hasNext()) {
                    C604137t r42 = (C604137t) it.next();
                    if (r42 != null && "critical_unblock_low".equals(r42.A01)) {
                        for (Object obj : r42.A02) {
                            if (obj instanceof AnonymousClass2Lk) {
                                j++;
                            }
                        }
                    }
                }
                r5.A00 = j;
                Iterator it2 = list.iterator();
                long j2 = 0;
                while (it2.hasNext()) {
                    C604137t r0 = (C604137t) it2.next();
                    if (!(r0 == null || (r4 = r0.A00) == null)) {
                        j2 += (long) r4.A0k((C23073B3d) null);
                        if ((r4.bitField0_ & 2) != 0) {
                            C100024uL r02 = r4.externalMutations_;
                            if (r02 == null) {
                                r02 = C100024uL.DEFAULT_INSTANCE;
                            }
                            j2 += r02.fileSizeBytes_;
                        }
                    }
                }
                r5.A01 = j2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("SyncdBootstrapManager/syncdRequestPrepared: ");
            sb.append(r5);
            Log.i(sb.toString());
            int i = C237119n.A00(this.A04).getInt("syncd_bootstrap_state", 0);
            AnonymousClass1AB r3 = this.A03;
            AnonymousClass3I3 r2 = r5.A02;
            int i2 = 2;
            if (i == 1) {
                i2 = 1;
            }
            r3.A0E(r2, i2, true);
        }
    }

    public void BXG(boolean z) {
        C61723De r3;
        synchronized (this) {
            r3 = this.A00;
        }
        if (r3 != null) {
            int i = C237119n.A00(this.A04).getInt("syncd_bootstrap_state", 0);
            StringBuilder sb = new StringBuilder();
            sb.append("SyncdBootstrapManager/criticalBootstrapFailed currentState: ");
            sb.append(i);
            Log.i(sb.toString());
            int i2 = 1;
            if (i != 0) {
                if (i != 1) {
                    i2 = 2;
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                Log.e("SyncdBootstrapManager/criticalBootstrapFailed should never reach here");
                            }
                            A02((C61723De) null);
                        }
                    }
                }
                this.A03.A0D(r3.A02, i2, 0, 0, false);
                A02((C61723De) null);
            }
            this.A03.A0E(r3.A02, i2, false);
            A02((C61723De) null);
        }
    }

    public void onSuccess() {
    }

    public void A00() {
        int i;
        int i2;
        synchronized (this.A0D) {
            C19730wQ r3 = this.A0A;
            boolean A0L = r3.A0L();
            StringBuilder sb = new StringBuilder();
            sb.append("SyncdBootstrapManager/bootstrapNewFeatures isCompanion=");
            sb.append(A0L);
            Log.i(sb.toString());
            if (!A0L) {
                i = C237119n.A00(this.A04).getInt("syncd_bootstrap_state", 0);
                i2 = 4;
            } else {
                i = C19980wp.A00(this.A0B).getInt("companion_syncd_critical_bootstrap_state", 0);
                i2 = 3;
            }
            if (i == i2) {
                C237119n r6 = this.A04;
                if (r6.A02().isEmpty()) {
                    r6.A07(this.A09);
                }
                Set A022 = r6.A02();
                AnonymousClass1AE r7 = this.A08;
                Set<String> A023 = r7.A02();
                A023.removeAll(A022);
                if (r3.A0L()) {
                    A023.retainAll(this.A0E);
                }
                if (!A023.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (String A002 : A023) {
                        AnonymousClass1LZ A003 = r7.A00(A002);
                        if (A003 != null) {
                            arrayList.addAll(A003.A0D(true));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("SyncdBootstrapManager/bootstrapNewFeatures adding mutations for ");
                            sb2.append(A003.getClass().getCanonicalName());
                            Log.i(sb2.toString());
                        } else {
                            Log.e("SyncdBootstrapManager/bootstrapNewFeatures handler not found");
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        this.A06.A05(arrayList);
                    }
                    r6.A07(A023);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r12 = this;
            X.19n r2 = r12.A04
            android.content.SharedPreferences r3 = X.C237119n.A00(r2)
            java.lang.String r1 = "syncd_bootstrap_state"
            r0 = 0
            int r5 = r3.getInt(r1, r0)
            r3 = r12
            monitor-enter(r3)
            X.3De r0 = r12.A00     // Catch:{ all -> 0x011c }
            monitor-exit(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "SyncdBootstrapManager/onSyncdSuccess "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = "; bootstrapState: "
            r3.append(r1)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r4 = 2
            r6 = 1
            if (r5 == r6) goto L_0x004c
            if (r5 == r4) goto L_0x0070
            r1 = 3
            if (r5 != r1) goto L_0x004b
            java.util.Set r1 = X.C201669k5.A08
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r1)
            java.util.Set r1 = X.C201669k5.A09
            r3.removeAll(r1)
            X.1AC r1 = r12.A0C
            boolean r1 = r1.A0K(r3)
            if (r1 != 0) goto L_0x00f8
        L_0x004b:
            return
        L_0x004c:
            X.1AC r3 = r12.A0C
            java.util.Set r1 = X.C201669k5.A09
            boolean r1 = r3.A0K(r1)
            if (r1 == 0) goto L_0x004b
            r2.A04(r4)
            X.19o r1 = r12.A07
            r1.A02(r6)
            if (r0 == 0) goto L_0x0070
            X.1AB r4 = r12.A03
            X.3I3 r5 = r0.A02
            monitor-enter(r0)
            long r7 = r0.A00     // Catch:{ all -> 0x0105 }
            monitor-exit(r0)
            monitor-enter(r0)
            long r9 = r0.A01     // Catch:{ all -> 0x0105 }
            monitor-exit(r0)
            r11 = 1
            r4.A0D(r5, r6, r7, r9, r11)
        L_0x0070:
            java.lang.String r1 = "SyncdBootstrapManager/prepareAppStateSyncNonCriticalBootstrap"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Set r1 = X.C201669k5.A08
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>(r1)
            java.util.Set r1 = X.C201669k5.A09
            r8.removeAll(r1)
            X.1AE r5 = r12.A08
            java.util.Set r1 = r5.A02()
            java.util.Iterator r10 = r1.iterator()
        L_0x0095:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x00df
            java.lang.Object r4 = r10.next()
            java.lang.String r4 = (java.lang.String) r4
            X.1LZ r9 = r5.A00(r4)
            if (r9 != 0) goto L_0x00ad
            java.lang.String r1 = "SyncdBootstrapManager/prepareAppStateSyncNonCriticalBootstrap handler not found"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0095
        L_0x00ad:
            java.lang.String r1 = r9.A0B()
            boolean r1 = r8.contains(r1)
            if (r1 == 0) goto L_0x0095
            r1 = 0
            java.util.List r1 = r9.A0D(r1)
            r6.addAll(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "SyncdBootstrapManager/prepareAppStateSyncNonCriticalBootstrap adding mutations for "
            r3.append(r1)
            java.lang.Class r1 = r9.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r7.add(r4)
            goto L_0x0095
        L_0x00df:
            X.1AK r1 = r12.A06
            r1.A05(r6)
            r2.A07(r7)
            r1 = 3
            r2.A04(r1)
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x004b
            java.util.List r1 = java.util.Collections.emptyList()
            r12.A03(r1)
        L_0x00f8:
            r1 = 4
            r2.A04(r1)
            if (r0 == 0) goto L_0x0117
            X.1AB r1 = r12.A03
            X.3I3 r2 = r0.A02
            r8 = 1
            monitor-enter(r0)
            goto L_0x0108
        L_0x0105:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0108:
            long r4 = r0.A00     // Catch:{ all -> 0x010f }
            monitor-exit(r0)
            monitor-enter(r0)
            long r6 = r0.A01     // Catch:{ all -> 0x010f }
            goto L_0x0112
        L_0x010f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0112:
            monitor-exit(r0)
            r3 = 2
            r1.A0D(r2, r3, r4, r6, r8)
        L_0x0117:
            r0 = 0
            r12.A02(r0)
            return
        L_0x011c:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1IZ.A01():void");
    }

    public void Bis() {
        Log.i("SyncdBootstrapManager/onSyncdFailed");
        this.A07.A02(false);
    }

    public AnonymousClass1IZ(C19730wQ r2, AnonymousClass1C3 r3, C25881Ia r4, AnonymousClass1AB r5, C237119n r6, AnonymousClass1A9 r7, AnonymousClass1AK r8, C19980wp r9, C237219o r10, AnonymousClass1AC r11, AnonymousClass1AE r12, Set set, Set set2) {
        this.A0A = r2;
        this.A05 = r7;
        this.A06 = r8;
        this.A08 = r12;
        this.A03 = r5;
        this.A01 = r3;
        this.A0C = r11;
        this.A04 = r6;
        this.A07 = r10;
        this.A0B = r9;
        this.A09 = set;
        this.A0E = set2;
        this.A02 = r4;
    }

    public void Bit() {
        A01();
    }
}
