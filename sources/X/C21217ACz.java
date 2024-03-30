package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;

/* renamed from: X.ACz  reason: case insensitive filesystem */
public final class C21217ACz implements B14 {
    public final C19730wQ A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass9ZI A02;
    public final C30681ab A03;

    public void Bd3(AnonymousClass6CO r8, AnonymousClass8NK r9, AnonymousClass3T1 r10) {
        C88944Uq r0;
        GroupJid A0l;
        AnonymousClass141 A08;
        AnonymousClass00C.A0D(r10, 0);
        C36321k7.A0v(r9, 1, r8);
        if (r10.A1S(1)) {
            AnonymousClass11F r02 = r10.A1J.A00;
            if ((r02 == null || (A0l = C36441kJ.A0l(r02)) == null || (A08 = this.A01.A08(A0l)) == null || !A08.A0j || r8.A03) && (r0 = r10.A0J) != null) {
                for (AnonymousClass2bM r1 : r0.B8Y()) {
                    AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageReaction");
                    C180868mY r4 = (C180868mY) r1;
                    AnonymousClass8NN A0p = AnonymousClass8RO.DEFAULT_INSTANCE.A0p();
                    AnonymousClass8NG A002 = AnonymousClass9ZI.A00(r1);
                    AnonymousClass8RO r12 = (AnonymousClass8RO) C90524aI.A0H(A0p);
                    r12.key_ = AnonymousClass8NN.A0G(A002);
                    r12.bitField0_ |= 1;
                    String str = r4.A01;
                    if (!(str == null || str.length() == 0)) {
                        AnonymousClass8RO r13 = (AnonymousClass8RO) C90524aI.A0H(A0p);
                        r13.bitField0_ |= 2;
                        r13.text_ = str;
                    }
                    if (r4.A0D != 17) {
                        AnonymousClass8RO r14 = (AnonymousClass8RO) C90524aI.A0H(A0p);
                        r14.bitField0_ |= 16;
                        r14.unread_ = true;
                    }
                    long j = r4.A00;
                    AnonymousClass8RO r15 = (AnonymousClass8RO) C90524aI.A0H(A0p);
                    r15.bitField0_ |= 8;
                    r15.senderTimestampMs_ = j;
                    AnonymousClass8SU A0I = AnonymousClass8NN.A0I(r9);
                    C170918Hz A0R = A0p.A0R();
                    int i = AnonymousClass8SU.AGENT_ID_FIELD_NUMBER;
                    A0R.getClass();
                    C23122B6c b6c = A0I.reactions_;
                    if (!((C21886AcE) b6c).A00) {
                        b6c = C170918Hz.A0A(b6c);
                        A0I.reactions_ = b6c;
                    }
                    b6c.add(A0R);
                }
            }
        }
    }

    public void Bd4(C1275768v r20, AnonymousClass8SU r21, AnonymousClass3T1 r22) {
        AnonymousClass8SU r5 = r21;
        AnonymousClass3T1 r4 = r22;
        boolean A1a = C36331k8.A1a(r5, r4);
        if (r5.reactions_.size() > 0) {
            ArrayList A0I = AnonymousClass001.A0I();
            C195759Vv A002 = C195759Vv.A00(r4);
            long j = r4.A1N;
            C23122B6c<AnonymousClass8RO> b6c = r5.reactions_;
            AnonymousClass00C.A08(b6c);
            for (AnonymousClass8RO r6 : b6c) {
                long A003 = C30681ab.A00(r5);
                AnonymousClass8SW r0 = r6.key_;
                if (r0 == null) {
                    r0 = AnonymousClass8SW.DEFAULT_INSTANCE;
                }
                AnonymousClass00C.A08(r0);
                C180868mY r8 = new C180868mY(C30681ab.A01(r0), A002, (C195759Vv) null, r6.text_, A003, j, r6.senderTimestampMs_);
                C222713q r1 = AnonymousClass11F.A00;
                AnonymousClass8SW r02 = r6.key_;
                if (r02 == null) {
                    r02 = AnonymousClass8SW.DEFAULT_INSTANCE;
                }
                r8.A0q(r1.A02(r02.participant_));
                if (!r6.unread_) {
                    r8.A0n(17);
                }
                A0I.add(r8);
            }
            r4.A1U(new C68983cm(this.A00, A0I));
            r4.A0i(A1a ? 1 : 0);
        }
    }

    public C21217ACz(C19730wQ r1, AnonymousClass9ZI r2, AnonymousClass16D r3, C30681ab r4) {
        C36321k7.A0x(r1, r3);
        this.A00 = r1;
        this.A01 = r3;
        this.A02 = r2;
        this.A03 = r4;
    }
}
