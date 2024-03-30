package X;

import android.view.ViewGroup;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6fE  reason: invalid class name and case insensitive filesystem */
public final class C136906fE implements C159837k0 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C129136Fi A04;
    public SubcomposeSlotReusePolicy A05;
    public final C1506776e A06 = C1506776e.A02(new Object[16]);
    public final C137766gg A07 = new C137766gg(this);
    public final C137816gm A08 = new C137816gm(this);
    public final C137846gp A09;
    public final HashMap A0A = AnonymousClass001.A0J();
    public final HashMap A0B = AnonymousClass001.A0J();
    public final HashMap A0C = AnonymousClass001.A0J();
    public final Map A0D = C36431kI.A1G();
    public final AnonymousClass75R A0E = new AnonymousClass75R((Set) null, (C05250Oz) null, 1);

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        if ((true ^ r9.A0D.isEmpty()) != false) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C136906fE r12, boolean r13) {
        /*
            r7 = 0
            r12.A02 = r7
            java.util.HashMap r0 = r12.A0B
            r0.clear()
            X.6gp r0 = r12.A09
            X.5ni r0 = r0.A0Q
            X.76e r6 = r0.A00
            int r5 = X.C1506776e.A00(r6)
            int r0 = r12.A03
            if (r0 == r5) goto L_0x0111
            r12.A03 = r5
            androidx.compose.runtime.snapshots.Snapshot r11 = X.AnonymousClass6VV.A02()
            androidx.compose.runtime.snapshots.Snapshot r10 = r11.A06()     // Catch:{ all -> 0x0104 }
            r4 = 0
        L_0x0021:
            if (r4 >= r5) goto L_0x0100
            java.util.List r0 = r6.A05()     // Catch:{ all -> 0x00fb }
            java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x00fb }
            X.6gp r1 = (X.C137846gp) r1     // Catch:{ all -> 0x00fb }
            java.util.HashMap r0 = r12.A0A     // Catch:{ all -> 0x00fb }
            java.lang.Object r3 = r0.get(r1)     // Catch:{ all -> 0x00fb }
            X.5wj r3 = (X.C123575wj) r3     // Catch:{ all -> 0x00fb }
            if (r3 == 0) goto L_0x00ed
            X.7n5 r0 = r3.A00     // Catch:{ all -> 0x00fb }
            boolean r0 = X.C90474aD.A1U(r0)     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x00ed
            X.6Et r2 = r1.A0P     // Catch:{ all -> 0x00fb }
            X.4ih r0 = r2.A0G     // Catch:{ all -> 0x00fb }
            java.lang.Integer r1 = X.C023109s.A0C     // Catch:{ all -> 0x00fb }
            r0.A07 = r1     // Catch:{ all -> 0x00fb }
            X.4ig r0 = r2.A04     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x004d
            r0.A04 = r1     // Catch:{ all -> 0x00fb }
        L_0x004d:
            if (r13 == 0) goto L_0x0095
            X.7mx r9 = r3.A01     // Catch:{ all -> 0x00fb }
            if (r9 == 0) goto L_0x00db
            X.6fP r9 = (X.C136986fP) r9     // Catch:{ all -> 0x00fb }
            X.72c r8 = r9.A08     // Catch:{ all -> 0x00fb }
            int r0 = r8.A00     // Catch:{ all -> 0x00fb }
            r2 = 1
            r1 = 1
            if (r0 > 0) goto L_0x0067
            r1 = 0
            java.util.HashSet r0 = r9.A0D     // Catch:{ all -> 0x00fb }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00fb }
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x009e
        L_0x0067:
            java.lang.String r0 = "Compose:deactivate"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x00fb }
            java.util.HashSet r0 = r9.A0D     // Catch:{ all -> 0x00f6 }
            X.6fQ r2 = new X.6fQ     // Catch:{ all -> 0x00f6 }
            r2.<init>(r0)     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x0091
            X.7dk r0 = r9.A04     // Catch:{ all -> 0x00f6 }
            X.6YK r1 = r8.A02()     // Catch:{ all -> 0x00f6 }
            X.AnonymousClass6XJ.A02(r2, r1)     // Catch:{ all -> 0x00f1 }
            r1.A0L()     // Catch:{ all -> 0x00f6 }
            X.6fD r0 = (X.C136896fD) r0     // Catch:{ all -> 0x00f6 }
            java.lang.Object r0 = r0.A01     // Catch:{ all -> 0x00f6 }
            X.6gp r0 = (X.C137846gp) r0     // Catch:{ all -> 0x00f6 }
            X.7mZ r0 = r0.A09     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x008e
            r0.BWU()     // Catch:{ all -> 0x00f6 }
        L_0x008e:
            r2.A01()     // Catch:{ all -> 0x00f6 }
        L_0x0091:
            r2.A00()     // Catch:{ all -> 0x00f6 }
            goto L_0x009b
        L_0x0095:
            X.7n5 r0 = r3.A00     // Catch:{ all -> 0x00fb }
            X.C90474aD.A11(r0, r7)     // Catch:{ all -> 0x00fb }
            goto L_0x00e9
        L_0x009b:
            android.os.Trace.endSection()     // Catch:{ all -> 0x00fb }
        L_0x009e:
            X.68K r0 = r9.A0B     // Catch:{ all -> 0x00fb }
            X.0GA r0 = r0.A00     // Catch:{ all -> 0x00fb }
            r0.A05()     // Catch:{ all -> 0x00fb }
            X.68K r0 = r9.A0A     // Catch:{ all -> 0x00fb }
            X.0GA r0 = r0.A00     // Catch:{ all -> 0x00fb }
            r0.A05()     // Catch:{ all -> 0x00fb }
            X.6Si r8 = r9.A00     // Catch:{ all -> 0x00fb }
            r8.A00 = r7     // Catch:{ all -> 0x00fb }
            java.lang.Object[] r1 = r8.A01     // Catch:{ all -> 0x00fb }
            r2 = 0
            int r0 = r1.length     // Catch:{ all -> 0x00fb }
            java.util.Arrays.fill(r1, r7, r0, r2)     // Catch:{ all -> 0x00fb }
            java.lang.Object[] r1 = r8.A02     // Catch:{ all -> 0x00fb }
            int r0 = r1.length     // Catch:{ all -> 0x00fb }
            java.util.Arrays.fill(r1, r7, r0, r2)     // Catch:{ all -> 0x00fb }
            X.5h1 r0 = r9.A09     // Catch:{ all -> 0x00fb }
            X.6Ek r0 = r0.A00     // Catch:{ all -> 0x00fb }
            r0.A02()     // Catch:{ all -> 0x00fb }
            X.6fF r1 = r9.A05     // Catch:{ all -> 0x00fb }
            X.5h0 r0 = r1.A0Z     // Catch:{ all -> 0x00fb }
            java.util.ArrayList r0 = r0.A00     // Catch:{ all -> 0x00fb }
            r0.clear()     // Catch:{ all -> 0x00fb }
            java.util.List r0 = r1.A0c     // Catch:{ all -> 0x00fb }
            r0.clear()     // Catch:{ all -> 0x00fb }
            X.5h1 r0 = r1.A0F     // Catch:{ all -> 0x00fb }
            X.6Ek r0 = r0.A00     // Catch:{ all -> 0x00fb }
            r0.A02()     // Catch:{ all -> 0x00fb }
            r1.A0J = r2     // Catch:{ all -> 0x00fb }
        L_0x00db:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00fb }
            X.6fY r1 = X.C137076fY.A00     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.4hT r0 = X.C93994hT.A00(r1, r2, r0)     // Catch:{ all -> 0x00fb }
            r3.A00 = r0     // Catch:{ all -> 0x00fb }
        L_0x00e9:
            X.5zT r0 = X.C129576Hp.A00     // Catch:{ all -> 0x00fb }
            r3.A02 = r0     // Catch:{ all -> 0x00fb }
        L_0x00ed:
            int r4 = r4 + 1
            goto L_0x0021
        L_0x00f1:
            r0 = move-exception
            r1.A0L()     // Catch:{ all -> 0x00f6 }
            throw r0     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x00fb }
            throw r0     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r0 = move-exception
            X.C1269066c.A00(r10)     // Catch:{ all -> 0x0104 }
            throw r0     // Catch:{ all -> 0x0104 }
        L_0x0100:
            X.C1269066c.A00(r10)     // Catch:{ all -> 0x0104 }
            goto L_0x0109
        L_0x0104:
            r0 = move-exception
            r11.A0B()
            throw r0
        L_0x0109:
            r11.A0B()
            java.util.HashMap r0 = r12.A0C
            r0.clear()
        L_0x0111:
            r12.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136906fE.A02(X.6fE, boolean):void");
    }

    public final void A05(int i) {
        Snapshot A062;
        this.A03 = 0;
        C137846gp r8 = this.A09;
        C1506776e r7 = r8.A0Q.A00;
        int A002 = (C1506776e.A00(r7) - this.A02) - 1;
        if (i <= A002) {
            AnonymousClass75R r4 = this.A0E;
            r4.clear();
            if (i <= A002) {
                int i2 = i;
                while (true) {
                    Object obj = this.A0A.get(r7.A05().get(i2));
                    AnonymousClass00C.A0B(obj);
                    r4.A00.add(((C123575wj) obj).A02);
                    if (i2 == A002) {
                        break;
                    }
                    i2++;
                }
            }
            this.A05.BHh(r4);
            Snapshot A022 = AnonymousClass6VV.A02();
            try {
                A062 = A022.A06();
                boolean z = false;
                while (A002 >= i) {
                    C137846gp r1 = (C137846gp) r7.A05().get(A002);
                    HashMap hashMap = this.A0A;
                    Object obj2 = hashMap.get(r1);
                    AnonymousClass00C.A0B(obj2);
                    C123575wj r10 = (C123575wj) obj2;
                    Object obj3 = r10.A02;
                    if (r4.contains(obj3)) {
                        this.A03++;
                        if (C90474aD.A1U(r10.A00)) {
                            C129056Et r2 = r1.A0P;
                            C94734ih r0 = r2.A0G;
                            Integer num = C023109s.A0C;
                            r0.A07 = num;
                            C94724ig r02 = r2.A04;
                            if (r02 != null) {
                                r02.A04 = num;
                            }
                            C90474aD.A11(r10.A00, false);
                            z = true;
                        }
                    } else {
                        r8.A0F = true;
                        hashMap.remove(r1);
                        C161467mx r03 = r10.A01;
                        if (r03 != null) {
                            r03.dispose();
                        }
                        r8.A0Q(A002, 1);
                        r8.A0F = false;
                    }
                    this.A0C.remove(obj3);
                    A002--;
                }
                C1269066c.A00(A062);
                A022.A0B();
                if (z) {
                    AnonymousClass6VV.A04();
                }
            } catch (Throwable th) {
                A022.A0B();
                throw th;
            }
        }
        A04();
    }

    public void BVE() {
        A02(this, true);
    }

    public void BfY() {
        A02(this, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        if (r1 == -1) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C137846gp A00(X.C136906fE r11, java.lang.Object r12) {
        /*
            int r0 = r11.A03
            r4 = 0
            if (r0 == 0) goto L_0x009c
            X.6gp r9 = r11.A09
            X.5ni r0 = r9.A0Q
            X.76e r7 = r0.A00
            int r10 = X.C1506776e.A00(r7)
            int r0 = r11.A02
            int r10 = r10 - r0
            int r0 = r11.A03
            int r6 = r10 - r0
            r5 = 1
            int r10 = r10 - r5
            r1 = r10
        L_0x0019:
            r8 = -1
            if (r1 < r6) goto L_0x0039
            java.util.List r0 = r7.A05()
            java.lang.Object r0 = r0.get(r1)
            java.util.HashMap r3 = r11.A0A
            java.lang.Object r0 = r3.get(r0)
            X.AnonymousClass00C.A0B(r0)
            X.5wj r0 = (X.C123575wj) r0
            java.lang.Object r0 = r0.A02
            boolean r0 = X.AnonymousClass00C.A0J(r0, r12)
            if (r0 == 0) goto L_0x005f
            if (r1 != r8) goto L_0x0065
        L_0x0039:
            if (r10 < r6) goto L_0x009c
            java.util.List r0 = r7.A05()
            java.lang.Object r0 = r0.get(r10)
            java.util.HashMap r3 = r11.A0A
            java.lang.Object r2 = r3.get(r0)
            X.AnonymousClass00C.A0B(r2)
            X.5wj r2 = (X.C123575wj) r2
            java.lang.Object r1 = r2.A02
            X.5zT r0 = X.C129576Hp.A00
            if (r1 == r0) goto L_0x0062
            androidx.compose.ui.layout.SubcomposeSlotReusePolicy r0 = r11.A05
            boolean r0 = r0.B1O(r12, r1)
            if (r0 != 0) goto L_0x0062
            int r10 = r10 + -1
            goto L_0x0039
        L_0x005f:
            int r1 = r1 + -1
            goto L_0x0019
        L_0x0062:
            r2.A02 = r12
            r1 = r10
        L_0x0065:
            if (r1 == r8) goto L_0x009c
            if (r1 == r6) goto L_0x0071
            r9.A0F = r5
            r9.A0R(r1, r6, r5)
            r0 = 0
            r9.A0F = r0
        L_0x0071:
            int r0 = r11.A03
            int r0 = r0 + -1
            r11.A03 = r0
            java.util.List r0 = r7.A05()
            java.lang.Object r4 = r0.get(r6)
            X.6gp r4 = (X.C137846gp) r4
            java.lang.Object r3 = r3.get(r4)
            X.AnonymousClass00C.A0B(r3)
            X.5wj r3 = (X.C123575wj) r3
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            X.6fY r1 = X.C137076fY.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.4hT r0 = X.C93994hT.A00(r1, r2, r0)
            r3.A00 = r0
            r3.A05 = r5
            r3.A04 = r5
        L_0x009c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136906fE.A00(X.6fE, java.lang.Object):X.6gp");
    }

    public static final void A01(C136906fE r11, C137846gp r12, Object obj, C009003v r14) {
        boolean z;
        Snapshot A062;
        Throwable th;
        HashMap hashMap = r11.A0A;
        Object obj2 = hashMap.get(r12);
        if (obj2 == null) {
            obj2 = new C123575wj(obj, C112415dr.A00);
            hashMap.put(r12, obj2);
        }
        C123575wj r4 = (C123575wj) obj2;
        C161467mx r0 = r4.A01;
        if (r0 != null) {
            C136986fP r02 = (C136986fP) r0;
            synchronized (r02.A0C) {
                z = AnonymousClass000.A1R(r02.A00.A00);
            }
        } else {
            z = true;
        }
        if (r4.A03 != r14 || z || r4.A04) {
            r4.A03 = r14;
            Snapshot A022 = AnonymousClass6VV.A02();
            try {
                A062 = A022.A06();
                C137846gp r5 = r11.A09;
                r5.A0F = true;
                C009003v r03 = r4.A03;
                C161467mx r6 = r4.A01;
                C129136Fi r8 = r11.A04;
                if (r8 != null) {
                    boolean z2 = r4.A05;
                    C1509977p r2 = new C1509977p(-1750409193, new AnonymousClass7YH(r4, r03), true);
                    if (r6 == null || ((C136986fP) r6).A02) {
                        ViewGroup.LayoutParams layoutParams = C112465dw.A00;
                        r6 = new C136986fP(new C136896fD(r12), r8);
                    }
                    if (!z2) {
                        r6.Bqa(r2);
                    } else {
                        C136986fP r1 = (C136986fP) r6;
                        C136916fF r3 = r1.A05;
                        r3.A05 = 100;
                        r3.A0P = true;
                        if (!r1.A02) {
                            r1.A01 = r2;
                            r1.A06.A0B(r1, r2);
                            if (r3.A0M || r3.A05 != 100) {
                                th = AnonymousClass001.A08("Cannot disable reuse from root if it was caused by other groups");
                            } else {
                                r3.A05 = -1;
                                r3.A0P = false;
                            }
                        } else {
                            th = AnonymousClass001.A09("The composition is disposed");
                        }
                    }
                    r4.A01 = r6;
                    r4.A05 = false;
                    r5.A0F = false;
                    C1269066c.A00(A062);
                    A022.A0B();
                    r4.A04 = false;
                    return;
                }
                th = AnonymousClass001.A09("parent composition reference not set");
                throw th;
            } catch (Throwable th2) {
                A022.A0B();
                throw th2;
            }
        }
    }

    public final C159877k4 A03(Object obj, C009003v r8) {
        C137846gp r4;
        C137846gp r5 = this.A09;
        if (r5.A09 == null) {
            return new C137796gk();
        }
        A04();
        if (!this.A0C.containsKey(obj)) {
            this.A0D.remove(obj);
            HashMap hashMap = this.A0B;
            Object obj2 = hashMap.get(obj);
            C137846gp r42 = obj2;
            if (obj2 == null) {
                C137846gp A002 = A00(this, obj);
                C118335ni r0 = r5.A0Q;
                if (A002 != null) {
                    C1506776e r1 = r0.A00;
                    int indexOf = r1.A05().indexOf(A002);
                    int A003 = C1506776e.A00(r1);
                    r5.A0F = true;
                    r5.A0R(indexOf, A003, 1);
                    r4 = A002;
                } else {
                    int A004 = C1506776e.A00(r0.A00);
                    C137846gp r43 = new C137846gp(true, C112475dx.A00.addAndGet(1));
                    r5.A0F = true;
                    r5.A0S(r43, A004);
                    r4 = r43;
                }
                r5.A0F = false;
                this.A02++;
                hashMap.put(obj, r4);
                r42 = r4;
            }
            A01(this, (C137846gp) r42, obj, r8);
        }
        return new C137806gl(this, obj);
    }

    public final void A04() {
        int A002 = C1506776e.A00(this.A09.A0Q.A00);
        HashMap hashMap = this.A0A;
        if (hashMap.size() == A002) {
            int i = this.A03;
            int i2 = this.A02;
            if ((A002 - i) - i2 >= 0) {
                HashMap hashMap2 = this.A0B;
                if (hashMap2.size() != i2) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Incorrect state. Precomposed children ");
                    A0u.append(i2);
                    A0u.append(". Map size ");
                    A0u.append(hashMap2.size());
                    throw AnonymousClass000.A0b(A0u);
                }
                return;
            }
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("Incorrect state. Total children ");
            A0u2.append(A002);
            A0u2.append(". Reusable children ");
            A0u2.append(i);
            throw AnonymousClass000.A0d(". Precomposed children ", A0u2, i2);
        }
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append("Inconsistency between the count of nodes tracked by the state (");
        A0u3.append(hashMap.size());
        A0u3.append(") and the children count on the SubcomposeLayout (");
        A0u3.append(A002);
        throw AnonymousClass000.A0c("). Are you trying to use the state of the disposed SubcomposeLayout?", A0u3);
    }

    public void BeU() {
        C137846gp r3 = this.A09;
        r3.A0F = true;
        HashMap hashMap = this.A0A;
        Iterator A10 = C36391kE.A10(hashMap);
        while (A10.hasNext()) {
            C161467mx r0 = ((C123575wj) A10.next()).A01;
            if (r0 != null) {
                r0.dispose();
            }
        }
        r3.A0M();
        r3.A0F = false;
        hashMap.clear();
        this.A0C.clear();
        this.A02 = 0;
        this.A03 = 0;
        this.A0B.clear();
        A04();
    }

    public C136906fE(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy, C137846gp r5) {
        this.A09 = r5;
        this.A05 = subcomposeSlotReusePolicy;
    }
}
