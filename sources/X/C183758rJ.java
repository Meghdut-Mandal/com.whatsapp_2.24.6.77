package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.8rJ  reason: invalid class name and case insensitive filesystem */
public class C183758rJ extends C132446Tt {
    public final boolean A00;
    public final C64933Qa A01;
    public final String A02;
    public final /* synthetic */ C167797yq A03;

    public C183758rJ(C167797yq r1, C64933Qa r2, String str, boolean z) {
        this.A03 = r1;
        this.A01 = r2;
        this.A02 = str;
        this.A00 = z;
    }

    public void A09() {
        if (this.A00) {
            this.A03.A0p(false);
        }
        this.A03.A05 = null;
    }

    public void A0A() {
        if (this.A00) {
            this.A03.A0p(true);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C175708av r0;
        C193689Ml r02;
        C202319lY r2;
        C193689Ml r13 = (C193689Ml) obj;
        C167797yq r3 = this.A03;
        C24611Dc r4 = r3.A0c;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("onTransactionDetailData loaded: ");
        C165577te.A1E(r4, A0u, AnonymousClass000.A1V(r13));
        if (r13.A01 == null) {
            r4.A06("onTransactionDetailData transactionInfo is null");
            r3.A08.A0D(new C194139Og(18));
        } else {
            if (this.A00) {
                r3.A0p(false);
            }
            if ("native".equals(r3.A0A)) {
                C36391kE.A1S(r3.A0h, this, r13, 24);
                if (r13.A02 != null) {
                    r3.A08.A0D(new C194139Og(3));
                }
            }
            if (r3 instanceof C180338lb) {
                C180338lb r42 = (C180338lb) r3;
                r42.A06 = r13;
                C202319lY r22 = r13.A01;
                if (r22.A03 == 1000 || (!r22.A0K() && r42.A06.A01.A0N() && !TextUtils.isEmpty(r42.A06.A01.A0K))) {
                    r42.A0p(true);
                    r42.A08.A04(new AFH(r42), r42.A06.A01.A0K);
                } else {
                    r42.A0Z();
                    int i = r22.A03;
                    if (!((i != 20 && i != 40) || (r0 = r22.A0A) == null || Boolean.TRUE.equals(r0.A03) || (r02 = r42.A06) == null || (r2 = r02.A01) == null)) {
                        C202319lY r5 = new C202319lY(r2.A0G, r2.A03, r2.A04, r2.A01, r2.A05);
                        C175708av r1 = r2.A0A;
                        r5.A0A = r1;
                        if (r1 != null) {
                            r1.A03 = C36371kC.A0m();
                            AnonymousClass736.A00(r42.A0h, r42, r5, r2, 39);
                        }
                    }
                    C001700s r23 = r42.A01;
                    List A0w = C36401kF.A0w(r23);
                    if (A0w != null) {
                        A0w.clear();
                    }
                    C193689Ml r03 = r42.A06;
                    if (!(r03 == null || r03.A01 == null)) {
                        r42.A0g(A0w);
                        r23.A0D(A0w);
                    }
                }
            } else {
                r3.A06 = r13;
                if (r3.A0X.A01()) {
                    BAG.A00(r3.A0K, C36441kJ.A0n(r3.A0J), r3, 8);
                } else {
                    C167797yq.A03(r3);
                }
            }
            r3.A0a();
        }
        r3.A05 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r3 == null) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C193689Ml A0G() {
        /*
            r8 = this;
            X.7yq r2 = r8.A03
            X.1Ed r3 = r2.A0R
            java.lang.String r1 = r8.A02
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r6 = 0
            if (r0 == 0) goto L_0x006c
            X.3Qa r0 = r8.A01
            java.lang.String r0 = r0.A01
        L_0x0011:
            X.9lY r4 = X.C165587tf.A0R(r3, r0, r1)
            if (r4 == 0) goto L_0x0082
            int r1 = r4.A03
            r0 = 9
            if (r1 != r0) goto L_0x003c
            X.8av r0 = r4.A0A
            if (r0 == 0) goto L_0x003c
            X.9ue r0 = r0.A00
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = r0.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x003c
            X.8av r0 = r4.A0A
            X.9ue r0 = r0.A00
            java.lang.String r0 = r0.A03
            X.C18740tg.A06(r0)
            X.9lY r0 = r3.A0K(r0)
            r2.A03 = r0
        L_0x003c:
            r7 = 1
            java.lang.String r0 = r4.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x006a
            X.16S r1 = r2.A0m
            java.lang.String r0 = r4.A0H
            X.9un r3 = r1.A07(r0)
            if (r3 != 0) goto L_0x006e
        L_0x004f:
            java.util.ArrayList r0 = r4.A0N
            if (r0 == 0) goto L_0x006e
            java.util.Iterator r1 = r0.iterator()
        L_0x0057:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r1.next()
            X.9K8 r0 = (X.AnonymousClass9K8) r0
            X.9un r0 = r0.A01
            if (r0 == 0) goto L_0x0057
            r3 = r0
            r7 = 0
            goto L_0x0057
        L_0x006a:
            r3 = r6
            goto L_0x004f
        L_0x006c:
            r0 = r6
            goto L_0x0011
        L_0x006e:
            X.8av r0 = r4.A0A
            if (r0 == 0) goto L_0x0084
            X.9uo r0 = r0.A02
            if (r0 == 0) goto L_0x0084
            X.1FF r1 = r2.A0j
            X.C18740tg.A06(r0)
            java.lang.String r0 = r0.A02
            X.2bZ r6 = r1.A01(r0)
            goto L_0x0084
        L_0x0082:
            r3 = r6
            r7 = 1
        L_0x0084:
            X.1VZ r0 = r2.A0k
            X.3T1 r5 = r0.A00(r4)
            X.9Ml r2 = new X.9Ml
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183758rJ.A0G():X.9Ml");
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return A0G();
    }
}
