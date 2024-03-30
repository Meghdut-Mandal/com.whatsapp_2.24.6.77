package X;

/* renamed from: X.ABk  reason: case insensitive filesystem */
public final class C21176ABk implements C22938Ayo, C22942Ays, C17740rx {
    public final C19730wQ A00;
    public final C202029kv A01;

    public C21176ABk(C19730wQ r2, C202029kv r3) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void B24(C196159Xy r11, AnonymousClass3T1 r12) {
        C36331k8.A1I(r12, r11);
        if (r12 instanceof AnonymousClass2bP) {
            AnonymousClass2bP r7 = (AnonymousClass2bP) r12;
            C28981Uw r9 = r7.A01;
            if (r9 != null) {
                long j = r7.A00;
                String str = r7.A03;
                String str2 = r7.A02;
                AnonymousClass8NL r2 = r11.A00;
                AnonymousClass8RQ r0 = ((AnonymousClass8SX) r2.A00).newsletterAdminInviteMessage_;
                if (r0 == null) {
                    r0 = AnonymousClass8RQ.DEFAULT_INSTANCE;
                }
                AnonymousClass8NN A0q = r0.A0q();
                AnonymousClass8RQ r1 = (AnonymousClass8RQ) C90524aI.A0H(A0q);
                int i = AnonymousClass8RQ.CAPTION_FIELD_NUMBER;
                r1.bitField0_ |= 16;
                r1.inviteExpiration_ = j / ((long) 1000);
                if (str != null) {
                    AnonymousClass8RQ r13 = (AnonymousClass8RQ) C90524aI.A0H(A0q);
                    r13.bitField0_ |= 2;
                    r13.newsletterName_ = str;
                }
                String A0K = AnonymousClass8NN.A0K(A0q, r9);
                AnonymousClass8RQ r14 = (AnonymousClass8RQ) A0q.A00;
                A0K.getClass();
                r14.bitField0_ |= 1;
                r14.newsletterJid_ = A0K;
                if (!(str2 == null || str2.length() == 0)) {
                    AnonymousClass8RQ r15 = (AnonymousClass8RQ) C90524aI.A0H(A0q);
                    r15.bitField0_ |= 8;
                    r15.caption_ = str2;
                }
                C63683Kz A0V = r7.A0V();
                if (!(A0V == null || A0V.A02() == null)) {
                    AnonymousClass8I5 A0O = C90474aD.A0O(A0q, A0V.A02());
                    AnonymousClass8RQ r16 = (AnonymousClass8RQ) A0q.A00;
                    r16.bitField0_ |= 4;
                    r16.jpegThumbnail_ = A0O;
                }
                C80103un r4 = r11.A02;
                byte[] bArr = r11.A0B;
                if (C202029kv.A02(r4, r12, bArr)) {
                    AnonymousClass8SG A002 = C196159Xy.A00(this.A01, r11, r4, r12, bArr);
                    AnonymousClass8RQ r17 = (AnonymousClass8RQ) C90524aI.A0H(A0q);
                    A002.getClass();
                    r17.contextInfo_ = A002;
                    r17.bitField0_ |= 32;
                }
                AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r2);
                AnonymousClass8RQ r02 = (AnonymousClass8RQ) A0q.A0R();
                r02.getClass();
                A0E.newsletterAdminInviteMessage_ = r02;
                A0E.bitField1_ |= Integer.MIN_VALUE;
                return;
            }
            throw C165567td.A0K(0);
        }
        throw AnonymousClass001.A08("FMessageNewsletterAdminInviteProtobuf/not supported message");
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r15) {
        AnonymousClass00C.A0D(r15, 0);
        AnonymousClass8SX r2 = r15.A0A;
        if ((r2.bitField1_ & Integer.MIN_VALUE) == 0) {
            return null;
        }
        AnonymousClass8RQ r4 = r2.newsletterAdminInviteMessage_;
        if (r4 == null) {
            r4 = AnonymousClass8RQ.DEFAULT_INSTANCE;
        }
        AnonymousClass2bP r5 = new AnonymousClass2bP((C28981Uw) null, r15.A0C, (String) null, (String) null, r15.A04, 0);
        C28981Uw A012 = C28981Uw.A03.A01(r4.newsletterJid_);
        if (A012 != null) {
            r5.A01 = A012;
            r5.A03 = r4.newsletterName_;
            r5.A00 = r4.inviteExpiration_ * ((long) 1000);
            r5.A02 = r4.caption_;
            byte[] A06 = r4.jpegThumbnail_.A06();
            AnonymousClass00C.A0B(A06);
            if (A06.length != 0) {
                r5.A0l(1);
                if (r5.A0V() != null) {
                    r5.A1D(A06, r15.A0O);
                }
            }
            return r5;
        }
        throw C165617ti.A0S(0, "FMessageNewsletterAdminInviteProtobuf/unexpected empty newsletterJid");
    }
}
