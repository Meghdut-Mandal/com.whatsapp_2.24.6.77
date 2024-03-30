package X;

/* renamed from: X.ABa  reason: case insensitive filesystem */
public class C21166ABa implements C22938Ayo, C22942Ays, C17740rx {
    public final C198499df A00;

    public void B24(C196159Xy r12, AnonymousClass3T1 r13) {
        AnonymousClass3T1 r8 = r13;
        if (this instanceof C177658eA) {
            C177658eA r5 = (C177658eA) this;
            C18740tg.A0E(r13 instanceof AnonymousClass2cB, C165567td.A0W(r13, "Message type is not supported ", AnonymousClass000.A0u()));
            AnonymousClass2cB r82 = (AnonymousClass2cB) r8;
            C207219uk r1 = r82.A00;
            if (r1 != null) {
                r5.A01.A00(r1).A0F(r12, r82);
                AnonymousClass8NL r4 = r12.A00;
                AnonymousClass8NF r3 = (AnonymousClass8NF) C170918Hz.A02(r4);
                AnonymousClass8ND r2 = (AnonymousClass8ND) C170918Hz.A0G(r3).A0q();
                C173508Ry r0 = ((AnonymousClass8SX) r4.A00).locationMessage_;
                if (r0 == null) {
                    r0 = C173508Ry.DEFAULT_INSTANCE;
                }
                AnonymousClass8K7 r6 = (AnonymousClass8K7) r0.A0q();
                r5.A00.A01(r6, r12.A02, r82, r12.A0B, r12.A04);
                C170918Hz.A0V(r2, r4, r3, C170918Hz.A0I(r6, r2), 8);
            }
        } else if (r13 instanceof C46912bs) {
            C46912bs r83 = (C46912bs) r8;
            AnonymousClass8NL r32 = r12.A00;
            C173508Ry r02 = ((AnonymousClass8SX) r32.A00).locationMessage_;
            if (r02 == null) {
                r02 = C173508Ry.DEFAULT_INSTANCE;
            }
            AnonymousClass8K7 r62 = (AnonymousClass8K7) r02.A0q();
            this.A00.A01(r62, r12.A02, r83, r12.A0B, r12.A04);
            if (C202359le.A04(r83)) {
                C173308Re r03 = ((AnonymousClass8SX) r32.A00).buttonsMessage_;
                if (r03 == null) {
                    r03 = C173308Re.DEFAULT_INSTANCE;
                }
                AnonymousClass8N3 r22 = (AnonymousClass8N3) r03.A0q();
                C170918Hz.A0F(r62, r22, r83).headerCase_ = 5;
                r22.A0U(AnonymousClass91C.LOCATION);
                r32.A0W((C173308Re) r22.A0R());
                return;
            }
            AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r32);
            C173508Ry r04 = (C173508Ry) r62.A0R();
            r04.getClass();
            A0E.locationMessage_ = r04;
            A0E.bitField0_ |= 16;
        } else {
            throw AnonymousClass001.A08("FMessageStaticLocationSerializer/not supported message");
        }
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r6) {
        AnonymousClass8SX r1 = r6.A0A;
        if ((r1.bitField0_ & 16) == 0) {
            return null;
        }
        C173508Ry r4 = r1.locationMessage_;
        if (r4 == null) {
            r4 = C173508Ry.DEFAULT_INSTANCE;
        }
        C18740tg.A06(r4);
        C46912bs r12 = new C46912bs(r6.A0C, r6.A04);
        C198499df.A00(r4, r12, r6.A0O);
        return r12;
    }

    public C21166ABa(C198499df r1) {
        this.A00 = r1;
    }
}
