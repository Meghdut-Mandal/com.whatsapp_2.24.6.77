package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.742  reason: invalid class name */
public final class AnonymousClass742 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C130466Le A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ Set A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public AnonymousClass742(C130466Le r1, Integer num, String str, Map map, Set set, long j, boolean z, boolean z2) {
        this.A01 = r1;
        this.A03 = str;
        this.A04 = map;
        this.A05 = set;
        this.A00 = j;
        this.A02 = num;
        this.A06 = z;
        this.A07 = z2;
    }

    public final void run() {
        C130466Le r5 = this.A01;
        String str = this.A03;
        Map map = this.A04;
        Set set = this.A05;
        LinkedHashMap linkedHashMap = map;
        if (set != null) {
            LinkedHashMap A1G = C36431kI.A1G();
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                if (set.contains(A11.getKey())) {
                    C36411kG.A1T(A1G, A11);
                }
            }
            linkedHashMap = A1G;
        }
        String A002 = AnonymousClass6Vs.A00(str, linkedHashMap);
        AnonymousClass6C0 r14 = new AnonymousClass6C0(this.A02, str, map, this.A00);
        C123105vw r9 = r5.A02;
        boolean z = this.A06;
        Executor executor = r5.A06;
        r5.A01.B8s();
        AnonymousClass7V6 r15 = new AnonymousClass7V6(r5, map, this.A07);
        AnonymousClass00C.A0D(executor, 4);
        StringBuilder A0v = AnonymousClass000.A0v(A002);
        A0v.append(':');
        long j = r14.A00;
        String A112 = C36411kG.A11(A0v, j);
        Set set2 = r9.A03;
        if (!set2.contains(A112)) {
            set2.add(A112);
            C1259662a r52 = r9.A01.A00;
            C155257Vj r8 = new C155257Vj(r9, r14, A112, A002, str, executor, r15, z);
            long now = r52.A00.now();
            C100454v2 r7 = new C100454v2();
            C117985n9 r53 = r52.A02;
            C118835oo r6 = (C118835oo) r53.A00.A01(new C162977pS(A002, 1), "ASYNC_COMPONENT");
            AnonymousClass011 r54 = null;
            if (r6 != null && (r6 instanceof C100554vD) && AnonymousClass6Vs.A02(r6, j, now)) {
                r7.A01("cache_src", "memory");
                r54 = C36441kJ.A19(r6, new C100474v5(C000400e.A0B(r7.A01), C000400e.A0B(r7.A00)));
            }
            r8.invoke(r54);
        }
    }
}
