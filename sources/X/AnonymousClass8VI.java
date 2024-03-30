package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.8VI  reason: invalid class name */
public abstract class AnonymousClass8VI extends AnonymousClass8WR {
    public final AnonymousClass17Y A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass185 A02;
    public final AnonymousClass171 A03;
    public final C18820ts A04;

    public AnonymousClass8VI(C24801Dv r9, AnonymousClass17Y r10, C19730wQ r11, C202279lS r12, C196089Xp r13, AnonymousClass16D r14, AnonymousClass185 r15, AnonymousClass171 r16, C18820ts r17, C20810yC r18, UserJid userJid) {
        super(r9, r11, r12, r13, r18, userJid);
        this.A00 = r10;
        this.A01 = r14;
        this.A03 = r16;
        this.A04 = r17;
        this.A02 = r15;
    }

    public AnonymousClass80I A0M(ViewGroup viewGroup, int i) {
        if (i != 2) {
            return super.A0M(viewGroup, i);
        }
        UserJid userJid = this.A06;
        C19730wQ r3 = this.A03;
        C24801Dv r2 = this.A02;
        AnonymousClass16D r4 = this.A01;
        AnonymousClass171 r6 = this.A03;
        return new C102334zl(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), r2, r3, r4, this.A02, r6, userJid);
    }

    public void A0Q(int i) {
        int A07;
        int i2;
        List list = this.A00;
        if (list.size() > 0 && (C36401kF.A0n(list) instanceof AnonymousClass8WN) && (A07 = C36431kI.A07(list)) != -1) {
            AnonymousClass8WN r2 = (AnonymousClass8WN) list.get(A07);
            if (i == -1) {
                i2 = 4;
            } else {
                C36321k7.A1U("biz-collection-product-list-adapter/error: ", AnonymousClass000.A0u(), i);
                i2 = 2;
            }
            r2.A00 = i2;
            A07(A07);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r2 = r7.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0R(X.C195929Wv r7, java.util.List r8) {
        /*
            r6 = this;
            java.util.List r5 = r6.A00
            r5.clear()
            if (r7 == 0) goto L_0x0011
            X.9Wa r2 = r7.A00
            int r1 = r2.A00
            r0 = 1
            if (r1 == r0) goto L_0x003e
            r0 = 2
            if (r1 == r0) goto L_0x003e
        L_0x0011:
            if (r8 == 0) goto L_0x0049
            java.util.Iterator r4 = r8.iterator()
        L_0x0017:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r3 = r4.next()
            X.9up r3 = (X.C207269up) r3
            boolean r0 = r6 instanceof X.AnonymousClass8Wg
            if (r0 != 0) goto L_0x002b
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
        L_0x002b:
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x0017
            long r1 = r6.A0L(r3)
            X.8WQ r0 = new X.8WQ
            r0.<init>(r3, r1)
            r5.add(r0)
            goto L_0x0017
        L_0x003e:
            java.lang.String r1 = r7.A03
            X.8WP r0 = new X.8WP
            r0.<init>(r2, r1)
            r5.add(r0)
            goto L_0x0011
        L_0x0049:
            X.8WN r0 = new X.8WN
            r0.<init>()
            r5.add(r0)
            int r0 = X.C36431kI.A07(r5)
            r6.A08(r0)
            r6.A06()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8VI.A0R(X.9Wv, java.util.List):void");
    }

    public void A0S(C207269up r5) {
        boolean z = this instanceof AnonymousClass8Wg;
        if (r5.A01()) {
            int i = 0;
            while (true) {
                List list = this.A00;
                if (i < list.size()) {
                    AnonymousClass9EL r2 = (AnonymousClass9EL) list.get(i);
                    if (r2 instanceof AnonymousClass8WQ) {
                        AnonymousClass8WQ r22 = (AnonymousClass8WQ) r2;
                        if (r22.A01.A0F.equals(r5.A0F)) {
                            r22.A01 = r5;
                            r22.A00 = A0L(r5);
                            A07(i);
                            return;
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void A0T(Boolean bool) {
        int A07;
        if (bool == null || !bool.booleanValue()) {
            A0N();
        } else {
            A0O();
        }
        List list = this.A00;
        if (list.size() > 0 && (C36401kF.A0n(list) instanceof AnonymousClass8WN) && (A07 = C36431kI.A07(list)) != -1) {
            ((AnonymousClass8WN) list.get(A07)).A00 = 5;
        }
    }
}
