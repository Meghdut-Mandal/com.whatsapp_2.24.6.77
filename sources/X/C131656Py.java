package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Py  reason: invalid class name and case insensitive filesystem */
public abstract class C131656Py {
    public static final AnonymousClass75W A06 = new AnonymousClass75W(false);
    public static final AnonymousClass75W A07 = new AnonymousClass75W(true);
    public long A00 = Long.MAX_VALUE;
    public final Set A01;
    public final long A02;
    public final AnonymousClass65W A03;
    public final List A04 = AnonymousClass001.A0I();
    public final Queue A05 = new PriorityQueue(16, A07);

    public C131656Py(AnonymousClass65W r8, Map map) {
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            this.A04.add(new C1269366h((AnonymousClass6F3) A11.getValue(), C90494aF.A0f(A11)));
        }
        this.A02 = TimeUnit.MILLISECONDS.toMicros(0);
        this.A01 = C36441kJ.A16();
        this.A03 = r8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x0014 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(long r21) {
        /*
            r20 = this;
            r8 = r20
            long r4 = r8.A00
            r2 = r21
            int r0 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            java.util.Queue r1 = r8.A05
            r1.clear()
            java.util.List r0 = r8.A04
            r1.addAll(r0)
        L_0x0014:
            java.util.Queue r10 = r8.A05
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x00d3
            long r6 = r8.A02
            long r6 = r6 + r21
            java.lang.Object r0 = r10.peek()
            X.66h r0 = (X.C1269366h) r0
            X.6F3 r4 = r0.A00
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r0 = r4.A01
            java.util.concurrent.TimeUnit r4 = r4.A02
            long r4 = r9.convert(r0, r4)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00d3
            java.lang.Object r6 = r10.poll()
            X.66h r6 = (X.C1269366h) r6
            X.6F3 r0 = r6.A00
            long r4 = r0.A00
            java.util.concurrent.TimeUnit r0 = r0.A02
            long r4 = r9.convert(r4, r0)
            int r0 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            java.util.Set r1 = r8.A01
            boolean r0 = r1.contains(r6)
            if (r0 != 0) goto L_0x0014
            r1.add(r6)
            java.lang.String r1 = r6.A01
            boolean r0 = r8 instanceof X.C162587op
            if (r0 != 0) goto L_0x0014
            boolean r0 = r8 instanceof X.C98634rk
            if (r0 == 0) goto L_0x0014
            r0 = r8
            X.4rk r0 = (X.C98634rk) r0
            X.6XM r5 = r0.A00
            int r4 = java.lang.Integer.parseInt(r1)
            X.5zI r0 = r5.A08
            X.6QD r6 = r0.A05
            if (r6 == 0) goto L_0x00c1
            java.util.Map r9 = r5.A0J
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            boolean r0 = r9.containsKey(r7)
            if (r0 != 0) goto L_0x00b5
            X.7ez r10 = r5.A0F
            X.5TE r0 = X.AnonymousClass5TE.AUDIO
            X.6Eg r0 = r6.A01(r0, r4)
            java.util.List r0 = r0.A01
            java.util.Iterator r11 = X.C90474aD.A0r(r0)
        L_0x0088:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00a7
            java.lang.Object r1 = r11.next()
            X.6F1 r1 = (X.AnonymousClass6F1) r1
            boolean r0 = r1.A01()
            if (r0 != 0) goto L_0x0088
            java.io.File r0 = r1.A01     // Catch:{ Exception -> 0x00ad }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ Exception -> 0x00ad }
            X.65N r0 = r10.B78(r0)     // Catch:{ Exception -> 0x00ad }
            if (r0 == 0) goto L_0x00ad
            goto L_0x00a9
        L_0x00a7:
            r0 = 0
            goto L_0x00ae
        L_0x00a9:
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x0088
        L_0x00ad:
            r0 = 1
        L_0x00ae:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.put(r7, r0)
        L_0x00b5:
            java.lang.Object r0 = r9.get(r7)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 != 0) goto L_0x00c1
            goto L_0x0014
        L_0x00c1:
            java.util.concurrent.ExecutorService r1 = r5.A0K
            X.76l r0 = new X.76l
            r0.<init>(r5, r6, r4)
            java.util.concurrent.Future r1 = r1.submit(r0)
            java.util.Map r0 = r5.A0I
            X.C90504aG.A1K(r1, r0, r4)
            goto L_0x0014
        L_0x00d3:
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            java.util.Set r6 = r8.A01
            java.util.Iterator r19 = r6.iterator()
        L_0x00e5:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x012a
            java.lang.Object r10 = r19.next()
            X.66h r10 = (X.C1269366h) r10
            X.6F3 r14 = r10.A00
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            boolean r1 = r14.A01(r2, r0)
            boolean r0 = r10.A02
            if (r1 != 0) goto L_0x0124
            if (r0 == 0) goto L_0x0102
            r11.add(r10)
        L_0x0102:
            long r4 = r8.A02
            long r17 = r21 - r4
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r0 = r14.A00
            java.util.concurrent.TimeUnit r12 = r14.A02
            long r15 = r13.convert(r0, r12)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x0120
            long r4 = r4 + r21
            long r0 = r14.A01
            long r12 = r13.convert(r0, r12)
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e5
        L_0x0120:
            r7.add(r10)
            goto L_0x00e5
        L_0x0124:
            if (r0 != 0) goto L_0x0102
            r9.add(r10)
            goto L_0x0102
        L_0x012a:
            X.75W r5 = A06
            java.util.Collections.sort(r11, r5)
            java.util.Iterator r4 = r11.iterator()
        L_0x0133:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0148
            java.lang.Object r1 = r4.next()
            X.66h r1 = (X.C1269366h) r1
            r0 = 0
            r1.A02 = r0
            java.lang.String r0 = r1.A01
            r8.A01(r0)
            goto L_0x0133
        L_0x0148:
            X.75W r0 = A07
            java.util.Collections.sort(r9, r0)
            java.util.Iterator r9 = r9.iterator()
        L_0x0151:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01c0
            java.lang.Object r1 = r9.next()
            X.66h r1 = (X.C1269366h) r1
            r0 = 1
            r1.A02 = r0
            java.lang.String r4 = r1.A01
            boolean r0 = r8 instanceof X.C98624rj
            if (r0 == 0) goto L_0x0178
            X.4rj r8 = (X.C98624rj) r8
            java.util.Map r0 = r8.A02
            java.lang.Object r0 = r0.get(r4)
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = "trackIndex"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0178:
            boolean r0 = r8 instanceof X.C162587op
            if (r0 == 0) goto L_0x019d
            r0 = r8
            X.7op r0 = (X.C162587op) r0
            int r1 = r0.A02
            java.lang.Object r0 = r0.A01
            if (r1 == 0) goto L_0x01b0
            X.5iD r0 = (X.C115025iD) r0
            int r4 = java.lang.Integer.parseInt(r4)
            X.6ED r0 = r0.A00
            java.util.Map r1 = r0.A01
            r0 = 0
            java.lang.Object r0 = X.C36371kC.A0r(r1, r0)
            java.util.Objects.requireNonNull(r0)
            X.7lu r0 = (X.C160987lu) r0
            r0.B0o(r4)
            goto L_0x0151
        L_0x019d:
            r0 = r8
            X.4rk r0 = (X.C98634rk) r0
            X.6XM r0 = r0.A00
            X.67h r0 = r0.A0E
            int r4 = java.lang.Integer.parseInt(r4)
            X.6Sq r0 = r0.A02
            boolean[] r1 = r0.A03
            r0 = 1
            r1[r4] = r0
            goto L_0x0151
        L_0x01b0:
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r4)
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = "trackIndex"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x01c0:
            java.util.Collections.sort(r7, r5)
            java.util.Iterator r1 = r7.iterator()
        L_0x01c7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01d9
            java.lang.Object r0 = r1.next()
            X.66h r0 = (X.C1269366h) r0
            java.lang.String r0 = r0.A01
            r8.A02(r0)
            goto L_0x01c7
        L_0x01d9:
            r6.removeAll(r7)
            r8.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131656Py.A00(long):void");
    }

    public void A01(String str) {
        if (this instanceof C98624rj) {
            Objects.requireNonNull(((C98624rj) this).A02.get(str));
            throw AnonymousClass001.A0A("trackIndex");
        } else if (this instanceof C162587op) {
            C162587op r1 = (C162587op) this;
            if (r1.A02 != 0) {
                int parseInt = Integer.parseInt(str);
                Object A0r = C36371kC.A0r(((C115015iC) r1.A00).A00.A01, 0);
                Objects.requireNonNull(A0r);
                ((C160987lu) A0r).Bo2(parseInt);
                return;
            }
            Objects.requireNonNull(((Map) r1.A01).get(str));
            throw AnonymousClass001.A0A("trackIndex");
        } else {
            C1271867h r0 = ((C98634rk) this).A00.A0E;
            r0.A02.A03[Integer.parseInt(str)] = false;
        }
    }

    public void A02(String str) {
        if (!(this instanceof C162587op) && (this instanceof C98634rk)) {
            AnonymousClass6XM r5 = ((C98634rk) this).A00;
            Object remove = r5.A0I.remove(Integer.valueOf(Integer.parseInt(str)));
            if (remove != null) {
                r5.A0H.add(r5.A0K.submit(new C163757qi(r5, remove, 1)));
            }
        }
    }
}
