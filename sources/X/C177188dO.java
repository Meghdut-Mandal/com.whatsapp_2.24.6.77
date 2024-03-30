package X;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8dO  reason: invalid class name and case insensitive filesystem */
public final class C177188dO extends C21197ACf {
    public final AnonymousClass9ZI A00;
    public final C30681ab A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177188dO(AnonymousClass9ZI r2, C20520xh r3, C30681ab r4) {
        super(r3);
        AnonymousClass00C.A0D(r3, 3);
        this.A00 = r2;
        this.A01 = r4;
    }

    public void B22(AnonymousClass6CO r12, AnonymousClass8NK r13, AnonymousClass3T1 r14) {
        AnonymousClass2bS r4;
        List<AnonymousClass2bM> list;
        C36331k8.A1I(r14, r13);
        AnonymousClass00C.A0D(r12, 2);
        if (!(r14 instanceof AnonymousClass2bS) || (r4 = (AnonymousClass2bS) r14) == null) {
            throw C165567td.A0K(0);
        }
        super.B22(r12, r13, r14);
        if (r4.A1S(2) && r12.A03 && (list = r4.A04) != null) {
            for (AnonymousClass2bM r8 : list) {
                AnonymousClass00C.A0E(r8, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessagePollVote");
                C180858mX r7 = (C180858mX) r8;
                AnonymousClass8NN A0p = AnonymousClass8RN.DEFAULT_INSTANCE.A0p();
                C172178Mv r3 = (C172178Mv) AnonymousClass8NX.DEFAULT_INSTANCE.A0p();
                List list2 = r7.A01;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        byte[] decode = Base64.decode(AnonymousClass001.A0C(it), 2);
                        r3.A0U(C21674AUx.A01(decode, 0, decode.length));
                    }
                    AnonymousClass8NG A002 = AnonymousClass9ZI.A00(r8);
                    AnonymousClass8RN r1 = (AnonymousClass8RN) C90524aI.A0H(A0p);
                    AnonymousClass8NX r0 = (AnonymousClass8NX) r3.A0R();
                    r0.getClass();
                    r1.vote_ = r0;
                    r1.bitField0_ |= 2;
                    AnonymousClass8RN r15 = (AnonymousClass8RN) C90524aI.A0H(A0p);
                    r15.pollUpdateMessageKey_ = AnonymousClass8NN.A0G(A002);
                    r15.bitField0_ |= 1;
                    long j = r7.A00;
                    AnonymousClass8RN r32 = (AnonymousClass8RN) C90524aI.A0H(A0p);
                    r32.bitField0_ |= 4;
                    r32.senderTimestampMs_ = j;
                    if (r7.A0D != 17) {
                        AnonymousClass8RN r2 = (AnonymousClass8RN) C90524aI.A0H(A0p);
                        r2.bitField0_ |= 16;
                        r2.unread_ = true;
                    }
                    AnonymousClass8SU A0I = AnonymousClass8NN.A0I(r13);
                    C170918Hz A0R = A0p.A0R();
                    int i = AnonymousClass8SU.AGENT_ID_FIELD_NUMBER;
                    A0R.getClass();
                    C23122B6c b6c = A0I.pollUpdates_;
                    if (!((C21886AcE) b6c).A00) {
                        b6c = C170918Hz.A0A(b6c);
                        A0I.pollUpdates_ = b6c;
                    }
                    b6c.add(A0R);
                }
            }
        }
        if (r4.A00 != 0) {
            AnonymousClass8NN A012 = C170918Hz.A01(AnonymousClass8OY.DEFAULT_INSTANCE);
            AnonymousClass8OY r22 = (AnonymousClass8OY) A012.A00;
            r22.bitField0_ |= 1;
            r22.pollInvalidated_ = true;
            AnonymousClass8SU A0I2 = AnonymousClass8NN.A0I(r13);
            AnonymousClass8OY r16 = (AnonymousClass8OY) A012.A0R();
            int i2 = AnonymousClass8SU.AGENT_ID_FIELD_NUMBER;
            r16.getClass();
            A0I2.pollAdditionalMetadata_ = r16;
            A0I2.bitField0_ |= Integer.MIN_VALUE;
        }
    }

    public AnonymousClass3T1 A00(C1275768v r19, AnonymousClass8SU r20, AnonymousClass3T1 r21) {
        AnonymousClass2bS r3;
        AnonymousClass3T1 r32 = r21;
        AnonymousClass8SU r4 = r20;
        C36331k8.A1I(r32, r4);
        if (!(r32 instanceof AnonymousClass2bS) || (r3 = (AnonymousClass2bS) r32) == null) {
            throw C165567td.A0J(0);
        }
        if (r4.pollUpdates_.size() > 0) {
            ArrayList A0I = AnonymousClass001.A0I();
            C195759Vv r12 = new C195759Vv(r3.A0L(), r3.A1J);
            long j = r3.A1N;
            long A002 = C30681ab.A00(r4);
            for (AnonymousClass8RN r5 : r4.pollUpdates_) {
                ArrayList A0I2 = AnonymousClass001.A0I();
                AnonymousClass8NX r0 = r5.vote_;
                if (r0 == null) {
                    r0 = AnonymousClass8NX.DEFAULT_INSTANCE;
                }
                for (C21674AUx A06 : r0.selectedOptions_) {
                    String encodeToString = Base64.encodeToString(A06.A06(), 2);
                    AnonymousClass00C.A0B(encodeToString);
                    A0I2.add(encodeToString);
                }
                AnonymousClass8SW r02 = r5.pollUpdateMessageKey_;
                if (r02 == null) {
                    r02 = AnonymousClass8SW.DEFAULT_INSTANCE;
                }
                AnonymousClass00C.A08(r02);
                C180858mX r8 = new C180858mX(A002, C30681ab.A01(r02), r12, (List) A0I2, j, r5.senderTimestampMs_);
                C222713q r1 = AnonymousClass11F.A00;
                AnonymousClass8SW r03 = r5.pollUpdateMessageKey_;
                if (r03 == null) {
                    r03 = AnonymousClass8SW.DEFAULT_INSTANCE;
                }
                r8.A0q(r1.A02(r03.participant_));
                if (!r5.unread_) {
                    r8.A0n(17);
                }
                A0I.add(r8);
            }
            r3.A1X(A0I);
            r3.A0i(2);
        }
        if ((r4.bitField0_ & Integer.MIN_VALUE) != 0) {
            AnonymousClass8OY r04 = r4.pollAdditionalMetadata_;
            if (r04 == null) {
                r04 = AnonymousClass8OY.DEFAULT_INSTANCE;
            }
            r3.A00 = r04.pollInvalidated_ ? 1 : 0;
        }
        return r3;
    }
}
