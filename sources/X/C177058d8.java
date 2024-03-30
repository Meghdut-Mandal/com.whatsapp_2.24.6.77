package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8d8  reason: invalid class name and case insensitive filesystem */
public abstract class C177058d8 extends C177068d9 implements C23021B0r {
    public final int A00;
    public final C194309Pd A01;
    public final C198409dV A02;
    public final C603237k A03;
    public final AnonymousClass9IN A04;
    public final C19770wU A05;
    public final C193349Lc A06;

    public static void A01(C177058d8 r2, int i) {
        r2.A05.Boy(new AVW(r2, i));
    }

    public static void A02(C177058d8 r4, UserJid userJid) {
        C194309Pd r3 = r4.A01;
        AnonymousClass1KK r2 = r3.A00;
        if ((r2.A03.A00() & 128) <= 0 || (r2.A09(userJid) != null && !r2.A04.A06(userJid))) {
            r4.A06();
        } else {
            r2.A0C(new BAH(r4, r3, userJid, 2), userJid);
        }
    }

    public UserJid A04() {
        UserJid userJid;
        if (this instanceof AnonymousClass8W3) {
            return ((AnonymousClass8W3) this).A01.A04;
        }
        if (this instanceof AnonymousClass8W1) {
            return ((AnonymousClass8W1) this).A03.A01;
        }
        if (this instanceof AnonymousClass8W2) {
            userJid = ((AnonymousClass8W2) this).A07.A01;
        } else if (this instanceof AnonymousClass8W4) {
            userJid = ((AnonymousClass8W4) this).A06.A07;
        } else if (this instanceof AnonymousClass8W0) {
            return ((AnonymousClass8W0) this).A02.A05;
        } else {
            if (this instanceof C174308Vz) {
                return ((C174308Vz) this).A01.A02;
            }
            return ((C174298Vy) this).A01.A00;
        }
        AnonymousClass00C.A07(userJid);
        return userJid;
    }

    public AnonymousClass97P A05() {
        if (this instanceof AnonymousClass8W3) {
            if (((AnonymousClass8W3) this).A01.A08) {
                return new C180788mO();
            }
        } else if ((this instanceof AnonymousClass8W4) && ((AnonymousClass8W4) this).A06.A00 != null) {
            return new C180778mN();
        }
        return new C180808mQ();
    }

    public void A06() {
        C21700zf A0V;
        C21700zf A0V2;
        if (this instanceof AnonymousClass8W3) {
            A01(this, 10);
        } else if (this instanceof AnonymousClass8W1) {
            AnonymousClass8W1 r2 = (AnonymousClass8W1) this;
            C21114A8z.A00(r2.A04, 0);
            r2.A08.A02("plm_details_view_tag");
            A01(r2, 9);
        } else if (this instanceof AnonymousClass8W2) {
            AnonymousClass8W2 r22 = (AnonymousClass8W2) this;
            r22.A0A.A02("view_product_tag");
            A01(r22, 8);
        } else if (this instanceof AnonymousClass8W4) {
            AnonymousClass8W4 r23 = (AnonymousClass8W4) this;
            if (r23.A06.A08 == null && (A0V2 = C165597tg.A0V(r23.A08)) != null) {
                A0V2.A07("datasource_catalog");
            }
            A01(r23, 7);
        } else if (this instanceof AnonymousClass8W0) {
            AnonymousClass8W0 r24 = (AnonymousClass8W0) this;
            if (r24.A02.A06 == null && (A0V = C165597tg.A0V(r24.A06)) != null) {
                A0V.A07("datasource_collections");
            }
            A01(r24, 6);
        } else if (this instanceof C174308Vz) {
            A01(this, 5);
        } else {
            A01(this, 4);
        }
    }

    public final void A07() {
        AnonymousClass9IN r2 = this.A04;
        Integer A012 = C200469hS.A01(A05(), this.A00);
        if (A012 != null) {
            AnonymousClass9IO r22 = r2.A00;
            r22.A00 = Integer.valueOf(r22.A01.A02(A012.intValue()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if (r12 != 2498054) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08(com.whatsapp.jid.UserJid r11, int r12, boolean r13) {
        /*
            r10 = this;
            X.37k r4 = r10.A03
            int r6 = r10.A00
            long r8 = (long) r12
            r7 = 2
            X.0wU r0 = r4.A03
            X.3vY r3 = new X.3vY
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.Boy(r3)
            X.9IN r3 = r10.A04
            X.97P r0 = r10.A05()
            java.lang.Integer r2 = X.C200469hS.A01(r0, r6)
            if (r2 == 0) goto L_0x0038
            java.lang.String r1 = "graphql"
            r0 = 0
            X.5vO r4 = new X.5vO
            r4.<init>(r11, r1, r0, r0)
            X.9IO r3 = r3.A00
            int r2 = r2.intValue()
            java.lang.Integer r0 = r3.A00
            if (r0 == 0) goto L_0x0038
            int r1 = r0.intValue()
            X.6TX r0 = r3.A01
            r0.A03(r4, r2, r1)
        L_0x0038:
            X.9Lc r2 = r10.A06
            if (r13 == 0) goto L_0x0042
            r1 = 2498054(0x261e06, float:3.500519E-39)
            r0 = 1
            if (r12 == r1) goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            r1 = 1
            if (r0 == 0) goto L_0x0069
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x004f
            r10.BVl(r11)
        L_0x004d:
            r0 = 1
            return r0
        L_0x004f:
            r2.A01 = r1
            X.9Pd r2 = r2.A02
            X.1KK r1 = r2.A00
            java.lang.String r0 = r1.A09(r11)
            if (r0 == 0) goto L_0x0060
            X.1KM r0 = r1.A04
            r0.A06(r11)
        L_0x0060:
            X.BAH r0 = new X.BAH
            r0.<init>(r10, r2, r11, r7)
            r1.A0C(r0, r11)
            goto L_0x004d
        L_0x0069:
            int r0 = r2.A00
            int r0 = r0 + 1
            r2.A00 = r0
            if (r0 != r1) goto L_0x0184
            X.9dV r0 = r2.A03
            boolean r0 = r0 instanceof X.C174228Vq
            if (r0 != 0) goto L_0x0184
            java.util.Set r0 = X.C198409dV.A00
            boolean r0 = X.AnonymousClass000.A1Z(r0, r12)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0184
            r3 = r10
            boolean r0 = r10 instanceof X.AnonymousClass8W3
            if (r0 == 0) goto L_0x00a6
            X.8W3 r3 = (X.AnonymousClass8W3) r3
            X.0yC r1 = r3.A05
            r0 = 2503(0x9c7, float:3.507E-42)
            boolean r0 = r1.A0E(r0)
            r2 = 0
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = "GetSingleCollectionGraphQLService/sendFallbackRequest - GraphQL request failed, calling onFailure instead of falling back on SMAX"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.B0x r1 = r3.A02
            X.9XP r0 = r3.A01
            r1.BXK(r0, r2)
            goto L_0x004d
        L_0x00a0:
            X.8V8 r0 = r3.A03
            r0.A03()
            goto L_0x004d
        L_0x00a6:
            boolean r0 = r10 instanceof X.AnonymousClass8W1
            if (r0 == 0) goto L_0x00ca
            X.8W1 r3 = (X.AnonymousClass8W1) r3
            X.0yC r1 = r3.A07
            r0 = 2503(0x9c7, float:3.507E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00c2
            java.lang.String r0 = "GetProductListGraphQLService/sendFallbackRequest - GraphQL request failed, calling onFailure instead of falling back on SMAX"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.AyT r1 = r3.A04
            r0 = 4
            X.C21114A8z.A00(r1, r0)
            goto L_0x004d
        L_0x00c2:
            X.8VC r1 = r3.A05
            X.1KK r0 = r1.A01
            X.AnonymousClass8VH.A01(r0, r1)
            goto L_0x004d
        L_0x00ca:
            boolean r0 = r10 instanceof X.AnonymousClass8W2
            if (r0 == 0) goto L_0x0104
            X.8W2 r3 = (X.AnonymousClass8W2) r3
            X.0yC r1 = r3.A08
            r0 = 2503(0x9c7, float:3.507E-42)
            boolean r0 = r1.A0E(r0)
            r2 = 0
            if (r0 == 0) goto L_0x00e9
            java.lang.String r0 = "GetProductGraphQLService/sendFallbackRequest - GraphQL request failed, calling onFailure instead of falling back on SMAX"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.B0y r1 = r3.A04
            X.9NZ r0 = r3.A07
            r1.BXY(r0, r2)
            goto L_0x004d
        L_0x00e9:
            X.8VD r1 = r3.A05
            X.0wD r0 = r1.A01
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x00fd
            X.B0y r2 = r1.A00
            X.9NZ r1 = r1.A02
            r0 = -1
            r2.BXY(r1, r0)
            goto L_0x004d
        L_0x00fd:
            X.1KK r0 = r1.A01
            X.AnonymousClass8VH.A01(r0, r1)
            goto L_0x004d
        L_0x0104:
            boolean r0 = r10 instanceof X.AnonymousClass8W4
            if (r0 == 0) goto L_0x0132
            X.8W4 r3 = (X.AnonymousClass8W4) r3
            X.9iV r4 = r3.A06
            X.9K5 r0 = r4.A00
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r2 = 0
            if (r0 != 0) goto L_0x0126
            X.0yC r1 = r3.A07
            r0 = 2503(0x9c7, float:3.507E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0126
            X.8VF r0 = r3.A04
            r0.A07()
            goto L_0x004d
        L_0x0126:
            java.lang.String r0 = "GetProductCatalogGraphQLService/sendFallbackRequest - GraphQL request failed, calling onFailure instead of falling back on SMAX"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.B0v r0 = r3.A03
            r0.BXL(r4, r2)
            goto L_0x004d
        L_0x0132:
            boolean r0 = r10 instanceof X.AnonymousClass8W0
            if (r0 == 0) goto L_0x016c
            X.8W0 r3 = (X.AnonymousClass8W0) r3
            X.0yC r1 = r3.A05
            r0 = 2503(0x9c7, float:3.507E-42)
            boolean r0 = r1.A0E(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0151
            java.lang.String r0 = "GetCollectionsGraphQLService/sendFallbackRequest - GraphQL request failed, calling onFailure instead of falling back on SMAX"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.9TW r1 = r3.A00
            X.9Nr r0 = r3.A02
            r1.A01(r0, r2)
            goto L_0x004d
        L_0x0151:
            X.8VG r1 = r3.A03
            X.0wD r0 = r1.A02
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0165
            X.9TW r2 = r1.A00
            X.9Nr r1 = r1.A01
            r0 = -1
            r2.A01(r1, r0)
            goto L_0x004d
        L_0x0165:
            X.1KK r0 = r1.A01
            X.AnonymousClass8VH.A01(r0, r1)
            goto L_0x004d
        L_0x016c:
            boolean r0 = r10 instanceof X.C174308Vz
            if (r0 == 0) goto L_0x017c
            X.8Vz r3 = (X.C174308Vz) r3
            r2 = 0
            X.B0t r1 = r3.A03
            X.6Co r0 = r3.A01
            r1.BXJ(r0, r2)
            goto L_0x004d
        L_0x017c:
            X.8Vy r3 = (X.C174298Vy) r3
            r0 = 0
            X.C174298Vy.A00(r3, r0)
            goto L_0x004d
        L_0x0184:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177058d8.A08(com.whatsapp.jid.UserJid, int, boolean):boolean");
    }

    public C177058d8(C194309Pd r1, C198409dV r2, C193349Lc r3, C603237k r4, AnonymousClass9IN r5, C19770wU r6, int i) {
        super(r2);
        this.A02 = r2;
        this.A05 = r6;
        this.A06 = r3;
        this.A01 = r1;
        this.A03 = r4;
        this.A00 = i;
        this.A04 = r5;
    }
}
