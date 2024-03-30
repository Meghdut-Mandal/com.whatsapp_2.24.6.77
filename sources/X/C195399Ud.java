package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9Ud  reason: invalid class name and case insensitive filesystem */
public final class C195399Ud {
    public final C29461Ws A00;
    public final C193049Jq A01;
    public final Map A02 = C36431kI.A1G();
    public final AnonymousClass17Y A03;
    public final AnonymousClass9LZ A04;
    public final C200119ge A05;
    public final C31801cP A06;
    public final C20810yC A07;

    public final void A00(C001700s r9, C199899gC r10) {
        AnonymousClass00C.A0D(r9, 1);
        Map map = this.A02;
        A9E a9e = (A9E) map.get(r10);
        if (a9e == null) {
            a9e = new A9E(this.A03, this.A00, this.A01, r10.A01, r10.A04);
            map.put(r10, a9e);
        }
        a9e.A02 = r9;
        C21114A8z a8z = new C21114A8z(a9e.A01);
        a8z.A01 = A9E.A00(a9e);
        C001700s r0 = a9e.A02;
        if (r0 != null) {
            r0.A0D(a8z);
        }
    }

    public final void A01(C199899gC r19) {
        C21114A8z a8z;
        int ceil;
        ArrayList A0I;
        Map map = this.A02;
        C199899gC r3 = r19;
        A9E a9e = (A9E) map.get(r3);
        if (a9e == null) {
            a9e = new A9E(this.A03, this.A00, this.A01, r3.A01, r3.A04);
            map.put(r3, a9e);
        }
        int i = a9e.A01;
        int i2 = 0;
        if (i != 0) {
            if (i != 5) {
                int i3 = a9e.A00;
                List list = a9e.A06;
                if (i3 < list.size()) {
                    C193049Jq r6 = a9e.A04;
                    int size = list.size();
                    boolean A1Q = AnonymousClass000.A1Q(a9e.A00);
                    float f = (float) AnonymousClass000.A0X(r6.A01.A00).heightPixels;
                    float f2 = r6.A00;
                    if (f < f2) {
                        ceil = 1;
                    } else {
                        ceil = (int) Math.ceil((double) (f / f2));
                    }
                    if (!A1Q || size >= ceil * 3) {
                        size = ceil * 2;
                    }
                    int A072 = r6.A02.A07(464);
                    if (A072 > size) {
                        A072 = size;
                    }
                    int i4 = a9e.A00;
                    int size2 = list.size();
                    int i5 = a9e.A00 + A072;
                    if (size2 > i5) {
                        size2 = i5;
                    }
                    if (i4 > size2) {
                        A0I = AnonymousClass001.A0I();
                    } else {
                        List subList = list.subList(i4, size2);
                        a9e.A00 += A072;
                        A0I = AnonymousClass001.A0I();
                        Iterator it = subList.iterator();
                        while (it.hasNext()) {
                            String A0C = AnonymousClass001.A0C(it);
                            if (C165617ti.A0N(a9e.A03, A0C) == null) {
                                A0I.add(A0C);
                            }
                        }
                    }
                    if (!A0I.isEmpty()) {
                        C199899gC r12 = new C199899gC(r3.A00, r3.A01, r3.A03, r3.A02, A0I);
                        if (this.A07.A0E(1096)) {
                            this.A05.A02(r12, a9e);
                            return;
                        }
                        AnonymousClass9LZ r4 = this.A04;
                        C31791cO r10 = new C31791cO(this.A06, 1);
                        UserJid userJid = r12.A01;
                        String str = r12.A03;
                        String str2 = r12.A02;
                        List list2 = r12.A04;
                        C18800tq r1 = r4.A01.A00.A00;
                        AnonymousClass8VC r62 = new AnonymousClass8VC(C36391kE.A0V(r1), C165587tf.A0L(r1), a9e, r10, userJid, (C199349fA) r1.A3c.get(), C36361kB.A0c(r1), (AnonymousClass1LA) r1.A0u.get(), str, str2, list2);
                        AnonymousClass8VH.A01(r62.A01, r62);
                        return;
                    } else if (a9e.A00 < list.size()) {
                        ArrayList A0I2 = AnonymousClass001.A0I();
                        a8z = new C21114A8z(1);
                        a8z.A01 = A0I2;
                        a9e.Blo(a8z);
                    }
                }
            }
            i2 = 5;
        }
        a8z = new C21114A8z(i2);
        a9e.Blo(a8z);
    }

    public C195399Ud(AnonymousClass17Y r2, AnonymousClass9LZ r3, C29461Ws r4, C200119ge r5, C31801cP r6, C19630wG r7, C20810yC r8) {
        C36321k7.A18(r8, r2, r7, r4);
        this.A07 = r8;
        this.A03 = r2;
        this.A00 = r4;
        this.A06 = r6;
        this.A05 = r5;
        this.A04 = r3;
        this.A01 = new C193049Jq(r7, r8);
    }
}
