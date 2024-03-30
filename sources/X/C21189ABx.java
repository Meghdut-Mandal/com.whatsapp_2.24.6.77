package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.ABx  reason: case insensitive filesystem */
public final class C21189ABx implements C22938Ayo, C22942Ays, C17740rx {
    public final AnonymousClass1HK A00;

    public C21189ABx(AnonymousClass1HK r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r20) {
        AnonymousClass11F r8;
        AnonymousClass5UA r0;
        AnonymousClass9YL r6 = r20;
        AnonymousClass8SX A002 = AnonymousClass9YL.A00(r6);
        if (AnonymousClass000.A1P(A002.bitField1_ & 8388608)) {
            AnonymousClass8RC r3 = A002.callLogMesssage_;
            if (r3 == null) {
                r3 = AnonymousClass8RC.DEFAULT_INSTANCE;
            }
            int i = r3.bitField0_;
            if (!C165577te.A1W(i)) {
                throw C165617ti.A0S(11, "call log message missing is_video");
            } else if ((i & 2) == 0) {
                throw C165617ti.A0S(11, "call log message missing call_outcome");
            } else if (AnonymousClass000.A1P(i & 8)) {
                C64933Qa r2 = r6.A0C;
                boolean z = r3.isVideo_;
                AnonymousClass91D A003 = AnonymousClass91D.A00(r3.callOutcome_);
                if (A003 == null) {
                    A003 = AnonymousClass91D.CONNECTED;
                }
                C23122B6c<B64> b6c = r3.participants_;
                ArrayList A13 = C36411kG.A13(b6c);
                for (B64 b64 : b6c) {
                    if (!b64.BJt()) {
                        throw C165617ti.A0S(11, "call log message participant missing jid");
                    } else if (b64.BJm()) {
                        C222813r r02 = UserJid.Companion;
                        A13.add(new C107255Nf(C222813r.A01(b64.BDE()), A00(b64.B9G()), -1));
                    } else {
                        throw C165617ti.A0S(11, "call log message participant missing call_outcome");
                    }
                }
                AnonymousClass11F r5 = r2.A00;
                if (r5 instanceof UserJid) {
                    r8 = r5;
                } else {
                    r8 = r6.A07;
                    if (r8 instanceof UserJid) {
                        AnonymousClass00C.A0E(r8, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                    }
                    throw C165617ti.A0S(11, "call log message missing call_type");
                }
                UserJid userJid = (UserJid) r8;
                if (userJid != null) {
                    C135006by r14 = new C135006by(-1, userJid, r2.A01, r2.A02);
                    C107265Nh r12 = new C107265Nh((DeviceJid) null, r14, A13, r6.A04, z);
                    r12.A0F(A00(A003));
                    int i2 = r3.callType_;
                    if (i2 == 0) {
                        r0 = AnonymousClass5UA.REGULAR;
                    } else if (i2 == 1) {
                        r0 = AnonymousClass5UA.SCHEDULED_CALL;
                    } else if (i2 != 2) {
                        r0 = AnonymousClass5UA.REGULAR;
                    } else {
                        r0 = AnonymousClass5UA.VOICE_CHAT;
                    }
                    int ordinal = r0.ordinal();
                    int i3 = 2;
                    if (ordinal == 0) {
                        i3 = 0;
                    } else if (ordinal == 1) {
                        i3 = 1;
                    }
                    r12.A0G(i3);
                    if (r5 instanceof GroupJid) {
                        r12.A0J((GroupJid) r5);
                    }
                    if (r6.A0O) {
                        return new C106265Iz((AnonymousClass1HQ) null, r2, r12);
                    }
                    C107265Nh A05 = this.A00.A05(r14);
                    if (A05 != null) {
                        return new C106265Iz((AnonymousClass1HQ) null, r2, A05);
                    }
                }
                throw C165617ti.A0S(11, "call log message missing call_type");
            } else {
                throw C165617ti.A0S(11, "call log message missing call_type");
            }
        }
        return null;
    }

    public static final int A00(AnonymousClass91D r0) {
        switch (r0.ordinal()) {
            case 0:
                return 5;
            case 1:
            case 6:
            case 7:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 6;
            default:
                return 0;
        }
    }

    public static final AnonymousClass91D A01(int i) {
        switch (i) {
            case 1:
            case 2:
                return AnonymousClass91D.MISSED;
            case 3:
                return AnonymousClass91D.FAILED;
            case 4:
                return AnonymousClass91D.REJECTED;
            case 5:
                return AnonymousClass91D.CONNECTED;
            case 6:
                return AnonymousClass91D.ACCEPTED_ELSEWHERE;
            default:
                return AnonymousClass91D.ONGOING;
        }
    }

    public void B24(C196159Xy r10, AnonymousClass3T1 r11) {
        AnonymousClass91D A01;
        AnonymousClass5UA r0;
        C36321k7.A0w(r11, r10);
        if (r11 instanceof C106265Iz) {
            C107265Nh r2 = (C107265Nh) ((C106265Iz) r11).A01.A00;
            if (r2 != null) {
                AnonymousClass8NL r3 = r10.A00;
                AnonymousClass8RC r02 = ((AnonymousClass8SX) r3.A00).callLogMesssage_;
                if (r02 == null) {
                    r02 = AnonymousClass8RC.DEFAULT_INSTANCE;
                }
                AnonymousClass8NN A0q = r02.A0q();
                boolean z = r2.A0K;
                AnonymousClass8RC r1 = (AnonymousClass8RC) C90524aI.A0H(A0q);
                int i = AnonymousClass8RC.CALL_OUTCOME_FIELD_NUMBER;
                r1.bitField0_ |= 1;
                r1.isVideo_ = z;
                if (r2.A0P()) {
                    A01 = AnonymousClass91D.SILENCED_BY_DND;
                } else if (r2.A0O()) {
                    A01 = AnonymousClass91D.SILENCED_UNKNOWN_CALLER;
                } else {
                    A01 = A01(r2.A07);
                }
                AnonymousClass8RC r12 = (AnonymousClass8RC) C90524aI.A0H(A0q);
                r12.callOutcome_ = A01.value;
                r12.bitField0_ |= 2;
                long j = (long) r2.A09;
                AnonymousClass8RC r13 = (AnonymousClass8RC) C90524aI.A0H(A0q);
                r13.bitField0_ |= 4;
                r13.durationSecs_ = j;
                int i2 = r2.A08;
                if (i2 == 1) {
                    r0 = AnonymousClass5UA.SCHEDULED_CALL;
                } else if (i2 != 2) {
                    r0 = AnonymousClass5UA.REGULAR;
                } else {
                    r0 = AnonymousClass5UA.VOICE_CHAT;
                }
                AnonymousClass8RC r14 = (AnonymousClass8RC) C90524aI.A0H(A0q);
                r14.callType_ = r0.value;
                r14.bitField0_ |= 8;
                ArrayList A0C = r2.A0C();
                ArrayList A0J = C36321k7.A0J(A0C);
                Iterator it = A0C.iterator();
                while (it.hasNext()) {
                    C107255Nf r6 = (C107255Nf) it.next();
                    AnonymousClass8NN A0p = AnonymousClass8SY.DEFAULT_INSTANCE.A0p();
                    String A0K = AnonymousClass8NN.A0K(A0p, r6.A00);
                    AnonymousClass8SY r15 = (AnonymousClass8SY) A0p.A00;
                    A0K.getClass();
                    r15.bitField0_ |= 1;
                    r15.jid_ = A0K;
                    AnonymousClass91D A012 = A01(r6.A01);
                    AnonymousClass8SY r16 = (AnonymousClass8SY) C90524aI.A0H(A0p);
                    r16.callOutcome_ = A012.value;
                    r16.bitField0_ |= 2;
                    A0J.add(A0p.A0R());
                }
                AnonymousClass8RC r22 = (AnonymousClass8RC) C90524aI.A0H(A0q);
                C23122B6c b6c = r22.participants_;
                if (!((C21886AcE) b6c).A00) {
                    b6c = C170918Hz.A0A(b6c);
                    r22.participants_ = b6c;
                }
                C21071A7i.A0O(A0J, b6c);
                AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r3);
                AnonymousClass8RC r03 = (AnonymousClass8RC) A0q.A0R();
                r03.getClass();
                A0E.callLogMesssage_ = r03;
                A0E.bitField1_ |= 8388608;
                return;
            }
            return;
        }
        throw AnonymousClass001.A08("FMessageCallLogProtobuf/not supported message");
    }
}
