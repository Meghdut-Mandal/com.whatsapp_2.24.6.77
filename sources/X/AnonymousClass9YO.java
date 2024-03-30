package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9YO  reason: invalid class name */
public abstract class AnonymousClass9YO {
    public final AnonymousClass00T A00 = C36431kI.A1I(new C22043Afq(this));

    public int A00() {
        B70 b70 = (B70) this;
        if (2 - b70.A01 != 0) {
            return 0;
        }
        return ((C191759Ef) b70.A00).A00.A07(6897);
    }

    public Integer A04() {
        B70 b70 = (B70) this;
        int i = b70.A01;
        Object obj = b70.A00;
        if (2 - i != 0) {
            return ((C200999ib) obj).A03.A04;
        }
        String A19 = C36431kI.A19(((C191759Ef) obj).A00, 6901);
        if (A19.equals("H264")) {
            return C023109s.A00;
        }
        if (A19.equals("H265")) {
            return C023109s.A01;
        }
        throw AnonymousClass001.A08(A19);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r1 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r1 = X.C007103b.A0N(X.C90524aI.A0q(r4));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(int r6) {
        /*
            r5 = this;
            X.00T r4 = r5.A00
            java.util.List r3 = X.C90524aI.A0q(r4)
            java.util.List r0 = X.C90524aI.A0q(r4)
            java.util.Iterator r2 = r0.iterator()
        L_0x000e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.88B r0 = (X.AnonymousClass88B) r0
            X.0mZ r0 = r0.A04
            int r0 = r0.A00
            if (r0 > r6) goto L_0x000e
            if (r1 != 0) goto L_0x002b
        L_0x0023:
            java.util.List r0 = X.C90524aI.A0q(r4)
            java.lang.Object r1 = X.C007103b.A0N(r0)
        L_0x002b:
            int r0 = r3.indexOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9YO.A01(int):int");
    }

    public AnonymousClass88A A03() {
        AnonymousClass88B r2 = (AnonymousClass88B) C36391kE.A0t(C90524aI.A0q(this.A00));
        return AnonymousClass95E.A00(r2, A04(), r2.A04.A01);
    }

    public List A05(boolean z) {
        String str;
        if (!z) {
            B70 b70 = (B70) this;
            int i = b70.A01;
            Object obj = b70.A00;
            switch (i) {
                case 0:
                    str = ((C200999ib) obj).A0H;
                    break;
                case 1:
                    str = ((C200999ib) obj).A0I;
                    break;
                default:
                    str = C36431kI.A19(((C191759Ef) obj).A00, 6900);
                    break;
            }
        } else {
            str = "720,1280,1000000-1000000,30|504,896,500000-1000000,30|432,768,270000-500000,30|360,640,200000-270000,30";
        }
        C200159gk r4 = AnonymousClass9AO.A01;
        r4.A03("sup:BaseBitrateLadderProvider", AnonymousClass000.A0p("Parsing bitrate ladder string: ", str, AnonymousClass000.A0u()));
        try {
            int i2 = 0;
            List A0L = AnonymousClass099.A0L(str, new String[]{"|"}, 0);
            ArrayList A0J = C36321k7.A0J(A0L);
            for (Object next : A0L) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    throw C36351kA.A0v();
                }
                List A0i = C90494aF.A0i((String) next, ",");
                List A0i2 = C90494aF.A0i((CharSequence) A0i.get(2), "-");
                AnonymousClass88B r13 = new AnonymousClass88B(C023109s.A00(4)[i2], new C15020mZ(Integer.parseInt(C36371kC.A0y(C36401kF.A0s(A0i2, 0))), Integer.parseInt(C36371kC.A0y(C36401kF.A0s(A0i2, 1)))), Integer.parseInt(C36371kC.A0y(C36401kF.A0s(A0i, 0))), Integer.parseInt(C36371kC.A0y(C36401kF.A0s(A0i, 1))), Integer.parseInt(C36371kC.A0y(C36401kF.A0s(A0i, 3))));
                r4.A03("sup:BaseBitrateLadderProvider", AnonymousClass000.A0l(r13, "Adding Bitrate Rung To Ladder: ", AnonymousClass000.A0u()));
                A0J.add(r13);
                i2 = i3;
            }
            return A0J;
        } catch (IndexOutOfBoundsException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Exception parsing ladder config ");
            A0u.append(str);
            r4.A04("sup:BaseBitrateLadderProvider", AnonymousClass000.A0q(". Attempt with fallback", A0u), e);
            if (!z) {
                return A05(true);
            }
            r4.A04("sup:BaseBitrateLadderProvider", "Failed to parse ladder config AND Default Value Format(??) - Returning empty list", (Throwable) null);
            return AnonymousClass001.A0I();
        }
    }

    public AnonymousClass88A A02() {
        if (A00() <= 0 || A00() > A03().A00) {
            return A03();
        }
        return AnonymousClass95E.A00((AnonymousClass88B) C36391kE.A0t(C90524aI.A0q(this.A00)), A04(), A00());
    }
}
