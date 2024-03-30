package X;

import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Map;

/* renamed from: X.9lS  reason: invalid class name and case insensitive filesystem */
public final class C202279lS {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C001700s A03 = C36431kI.A0S();
    public final C001700s A04 = C36431kI.A0S();
    public final C001700s A05 = C36441kJ.A0Z(C36381kD.A0j());
    public final AnonymousClass9Pa A06;
    public final AnonymousClass17Y A07;
    public final C19730wQ A08;
    public final AnonymousClass1KK A09;
    public final AnonymousClass2ZL A0A;
    public final C29461Ws A0B;
    public final AnonymousClass9Y1 A0C;
    public final C200119ge A0D;
    public final C31781cN A0E;
    public final AnonymousClass9EK A0F;
    public final AnonymousClass9UB A0G;
    public final C19600wD A0H;
    public final C20810yC A0I;
    public final C199349fA A0J;
    public final AnonymousClass19A A0K;
    public final AnonymousClass3L6 A0L;
    public final C63273Jk A0M;
    public final List A0N = AnonymousClass001.A0I();
    public final List A0O = AnonymousClass001.A0I();
    public final Map A0P = AnonymousClass001.A0J();
    public final AnonymousClass9LZ A0Q;
    public final AnonymousClass9EC A0R = new AnonymousClass9EC(this);
    public final A9M A0S = new A9M(this);

    public static final void A01(C202279lS r4, UserJid userJid, int i, int i2, boolean z) {
        C202279lS r3 = r4;
        UserJid userJid2 = userJid;
        r4.A0G.A01(userJid2, AnonymousClass96V.A00(), new C22497Ana(r3, userJid2, i2, i, z));
    }

    private final void A02(UserJid userJid, String str, int i, int i2, boolean z) {
        String str2;
        C29461Ws r1 = this.A0B;
        UserJid userJid2 = userJid;
        String str3 = str;
        AnonymousClass9VS A042 = r1.A04(userJid, str);
        if (A042 != null) {
            str2 = A042.A00;
        } else {
            str2 = null;
        }
        AnonymousClass9VS A043 = r1.A04(userJid, str);
        if (A043 == null || A043.A01) {
            C001700s r2 = this.A05;
            if (!AnonymousClass00C.A0J(r2.A04(), true)) {
                r2.A0D(true);
                this.A0G.A01(userJid, AnonymousClass96V.A00(), new C22499Anc(this, userJid2, str3, str2, i2, i, z));
            }
        }
    }

    public final void A03(int i, UserJid userJid, String str, boolean z) {
        AnonymousClass9VT r2;
        UserJid userJid2 = userJid;
        String str2 = str;
        boolean A1a = C36331k8.A1a(userJid, str);
        boolean equals = str.equals("catalog_products_all_items_collection_id");
        int A002 = C36371kC.A00(this.A08.A0M(userJid) ? 1 : 0) * 9;
        int i2 = i;
        if (equals) {
            C29461Ws r0 = this.A0B;
            r0.A0E(userJid, A002);
            if (r0.A0I(userJid)) {
                this.A03.A0D(new AnonymousClass8WB(userJid, str, A1a, A1a));
                A002 *= 2;
            }
            A01(this, userJid, i, A002, A1a);
            return;
        }
        C29461Ws r4 = this.A0B;
        synchronized (r4) {
            C198089ct r02 = (C198089ct) r4.A01.get(userJid);
            if (!(r02 == null || (r2 = (AnonymousClass9VT) r02.A05.get(str)) == null)) {
                r2.A00 = new AnonymousClass9VS(A1a, (String) null);
                List list = r2.A01.A04;
                int size = list.size();
                if (size > A002) {
                    for (int i3 = A002; i3 < size; i3++) {
                        list.remove(C36431kI.A07(list));
                    }
                }
            }
        }
        C195929Wv A052 = r4.A05(userJid, str);
        if (A052 != null && C36401kF.A1a(A052.A04)) {
            this.A03.A0D(new AnonymousClass8WB(userJid, A052.A03, A1a, A1a));
            A002 *= 2;
        }
        A02(userJid2, str2, i2, A002, z);
    }

    public final void A04(int i, UserJid userJid, String str, boolean z) {
        UserJid userJid2 = userJid;
        String str2 = str;
        boolean A1a = C36331k8.A1a(userJid, str);
        int A002 = C36371kC.A00(this.A08.A0M(userJid) ? 1 : 0) * 9;
        int i2 = i;
        if (str.equals("catalog_products_all_items_collection_id")) {
            A01(this, userJid, i, A002, A1a);
        } else {
            A02(userJid2, str2, i2, A002, z);
        }
    }

    public final void A08(UserJid userJid, int i) {
        AnonymousClass00C.A0D(userJid, 0);
        int i2 = 1;
        if (this.A08.A0M(userJid)) {
            i2 = 4;
        }
        int i3 = i2 * 6;
        C29461Ws r0 = this.A0B;
        r0.A0E(userJid, i3);
        if (r0.A0I(userJid)) {
            this.A0A.A00(userJid, true, true);
            i3 *= 2;
        }
        A01(this, userJid, i, i3, false);
    }

    public final boolean A0B(UserJid userJid) {
        AnonymousClass9VS r0;
        AnonymousClass00C.A0D(userJid, 0);
        C29461Ws r1 = this.A0B;
        synchronized (r1) {
            C198089ct r02 = (C198089ct) r1.A01.get(userJid);
            if (r02 != null) {
                r0 = r02.A01;
            } else {
                r0 = null;
            }
        }
        if ((r0 == null || r0.A01) && !this.A02) {
            return true;
        }
        return false;
    }

    public C202279lS(AnonymousClass9Pa r8, AnonymousClass17Y r9, C19730wQ r10, AnonymousClass9LZ r11, AnonymousClass1KK r12, AnonymousClass2ZL r13, C29461Ws r14, AnonymousClass9Y1 r15, C200119ge r16, C31781cN r17, AnonymousClass9EK r18, AnonymousClass9UB r19, C19600wD r20, C20810yC r21, C199349fA r22, AnonymousClass19A r23, AnonymousClass3L6 r24, C63273Jk r25) {
        AnonymousClass19A r2 = r23;
        AnonymousClass3L6 r1 = r24;
        C20810yC r4 = r21;
        C36321k7.A1B(r4, r9, r10, r1, r2);
        C199349fA r3 = r22;
        C36321k7.A1C(r13, r14, r12, r15, r3);
        C19600wD r5 = r20;
        AnonymousClass00C.A0D(r5, 11);
        AnonymousClass00C.A0D(r8, 13);
        C63273Jk r6 = r25;
        AnonymousClass00C.A0D(r6, 16);
        this.A0I = r4;
        this.A07 = r9;
        this.A08 = r10;
        this.A0L = r1;
        this.A0K = r2;
        this.A0A = r13;
        this.A0B = r14;
        this.A09 = r12;
        this.A0C = r15;
        this.A0J = r3;
        this.A0H = r5;
        this.A0D = r16;
        this.A06 = r8;
        this.A0E = r17;
        this.A0Q = r11;
        this.A0M = r6;
        this.A0G = r19;
        this.A0F = r18;
    }

    public static final void A00(C202279lS r3, UserJid userJid) {
        if (!r3.A00) {
            r3.A00 = true;
            r3.A09.A0E(new C21103A8o(r3), userJid, (String) null);
        }
    }

    public final void A05(C159217j0 r13, C200939iV r14) {
        boolean A072;
        C200119ge r3 = this.A0D;
        C200939iV r8 = r14;
        UserJid userJid = r14.A07;
        AnonymousClass00C.A07(userJid);
        if (r3.A00.A0M(userJid) || !this.A0I.A0E(1096)) {
            AnonymousClass9LZ r2 = this.A0Q;
            C23227BAj bAj = new C23227BAj(this, 1);
            C18800tq r0 = r2.A02.A00.A00;
            C19700wN A0V = C36391kE.A0V(r0);
            AnonymousClass3L6 A0U = C165597tg.A0U(r0);
            AnonymousClass19A A0c = C36361kB.A0c(r0);
            A072 = new AnonymousClass8VF(A0V, C165587tf.A0L(r0), bAj, C18800tq.A2x(r0), C36391kE.A0c(r0), r8, (C199349fA) r0.A3c.get(), A0c, A0U).A07();
        } else {
            A072 = r3.A04(new C23227BAj(this, 0), r14);
        }
        if (A072) {
            this.A0P.put(r14, r13);
        } else {
            r13.BXl(r14, -1);
        }
    }

    public final void A06(C159237j2 r14, UserJid userJid) {
        C200119ge r1 = this.A0D;
        AnonymousClass9HF r4 = new AnonymousClass9HF(userJid, this.A0C.A02);
        AnonymousClass9HC r3 = new AnonymousClass9HC(r14, this);
        C198319dG r2 = r1.A01;
        C198409dV r6 = r2.A05;
        C19770wU r12 = r2.A0J;
        C174228Vq r0 = r2.A06;
        C194309Pd r5 = r2.A04;
        C200119ge.A00(new C174298Vy(r3, r4, r5, r6, new C193349Lc(r5, r0), r2.A07, r2.A08, r2.A0B, C198319dG.A00(r2), r12), r1);
    }

    public final void A07(AnonymousClass9N9 r4, boolean z) {
        this.A07.A0H(new AnonymousClass752(this, r4, 5, z));
    }

    public final boolean A09(AnonymousClass9N9 r10) {
        this.A0L.A00(774782053, "report_product_tag", "CatalogManager");
        AnonymousClass9LZ r0 = this.A0Q;
        AnonymousClass9EC r3 = this.A0R;
        C18800tq r1 = r0.A03.A00.A00;
        AnonymousClass3L6 A0U = C165597tg.A0U(r1);
        AnonymousClass19A A0c = C36361kB.A0c(r1);
        return new AnonymousClass8V7(C165587tf.A0L(r1), r3, r10, C36341k9.A0V(r1), (C199349fA) r1.A3c.get(), A0c, A0U).A03();
    }

    public final boolean A0A(AnonymousClass9NZ r12) {
        C200119ge r4 = this.A0D;
        AnonymousClass9NZ r7 = r12;
        UserJid userJid = r12.A01;
        AnonymousClass00C.A07(userJid);
        C19730wQ r2 = r4.A00;
        if ((!r2.A0M(userJid) && this.A0I.A0E(1096)) || (r2.A0M(userJid) && this.A0I.A0E(7324))) {
            return r4.A05(this.A0S, r12);
        }
        AnonymousClass9LZ r0 = this.A0Q;
        A9M a9m = this.A0S;
        C18800tq r1 = r0.A00.A00.A00;
        AnonymousClass19A A0c = C36361kB.A0c(r1);
        AnonymousClass3L6 A0U = C165597tg.A0U(r1);
        AnonymousClass8VD r13 = new AnonymousClass8VD(C165587tf.A0L(r1), (C29461Ws) r1.A1S.get(), a9m, C18800tq.A2x(r1), C36391kE.A0c(r1), r7, (C199349fA) r1.A3c.get(), A0c, A0U);
        if (!r13.A01.A09()) {
            r13.A00.BXY(r13.A02, -1);
            return false;
        }
        AnonymousClass8VH.A01(r13.A01, r13);
        return true;
    }
}
