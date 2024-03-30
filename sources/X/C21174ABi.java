package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.ABi  reason: case insensitive filesystem */
public class C21174ABi implements C22938Ayo, C22942Ays, C17740rx {
    public final C19730wQ A00;
    public final C202029kv A01;

    public void B24(C196159Xy r12, AnonymousClass3T1 r13) {
        if (r13 instanceof AnonymousClass2bQ) {
            AnonymousClass2bQ r132 = (AnonymousClass2bQ) r13;
            AnonymousClass147 r7 = r132.A02;
            String str = r132.A06;
            boolean z = r132.A07;
            long j = r132.A01;
            String str2 = r132.A05;
            String str3 = r132.A04;
            AnonymousClass8NL r4 = r12.A00;
            C173318Rf r0 = ((AnonymousClass8SX) r4.A00).groupInviteMessage_;
            if (r0 == null) {
                r0 = C173318Rf.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r0.A0q();
            if (r7 != null) {
                if (str != null) {
                    C173318Rf r9 = (C173318Rf) C90524aI.A0H(A0q);
                    int i = C173318Rf.CAPTION_FIELD_NUMBER;
                    r9.bitField0_ |= 2;
                    r9.inviteCode_ = str;
                } else {
                    Log.e("FMessageGroupInvite/buildE2eMessage missing invite hash");
                }
                if (!r12.A02() || !z) {
                    C173318Rf r8 = (C173318Rf) C90524aI.A0H(A0q);
                    int i2 = C173318Rf.CAPTION_FIELD_NUMBER;
                    r8.bitField0_ |= 4;
                    r8.inviteExpiration_ = j;
                } else {
                    C173318Rf r82 = (C173318Rf) C90524aI.A0H(A0q);
                    int i3 = C173318Rf.CAPTION_FIELD_NUMBER;
                    r82.bitField0_ |= 4;
                    r82.inviteExpiration_ = 0;
                }
                if (str2 != null) {
                    C173318Rf r1 = (C173318Rf) C90524aI.A0H(A0q);
                    r1.bitField0_ |= 8;
                    r1.groupName_ = str2;
                }
                String A0K = AnonymousClass8NN.A0K(A0q, r7);
                C173318Rf r14 = (C173318Rf) A0q.A00;
                A0K.getClass();
                r14.bitField0_ |= 1;
                r14.groupJid_ = A0K;
                if (!TextUtils.isEmpty(str3)) {
                    C173318Rf r15 = (C173318Rf) C90524aI.A0H(A0q);
                    str3.getClass();
                    r15.bitField0_ |= 32;
                    r15.caption_ = str3;
                }
                C63683Kz A0V = r132.A0V();
                if (!(A0V == null || A0V.A02() == null)) {
                    AnonymousClass8I5 A0O = C90474aD.A0O(A0q, A0V.A02());
                    C173318Rf r16 = (C173318Rf) A0q.A00;
                    r16.bitField0_ |= 16;
                    r16.jpegThumbnail_ = A0O;
                }
                C80103un r2 = r12.A02;
                byte[] bArr = r12.A0B;
                if (C202029kv.A02(r2, r132, bArr)) {
                    AnonymousClass8SG A002 = C196159Xy.A00(this.A01, r12, r2, r132, bArr);
                    C173318Rf r17 = (C173318Rf) C90524aI.A0H(A0q);
                    A002.getClass();
                    r17.contextInfo_ = A002;
                    r17.bitField0_ |= 64;
                }
                AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r4);
                C173318Rf r02 = (C173318Rf) A0q.A0R();
                r02.getClass();
                A0E.groupInviteMessage_ = r02;
                A0E.bitField0_ |= 4194304;
                return;
            }
            Log.w("FMessageGroupInvite/buildE2eMessage failed to build e2e message");
            return;
        }
        throw AnonymousClass001.A08("FMessageGroupInviteProtobuf/not supported message");
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r6) {
        UserJid A0b;
        AnonymousClass90N r1;
        AnonymousClass8SX r4 = r6.A0A;
        if ((r4.bitField0_ & 4194304) == 0) {
            return null;
        }
        AnonymousClass2bQ r2 = new AnonymousClass2bQ(r6.A0C, r6.A04);
        C173318Rf r3 = r4.groupInviteMessage_;
        if (r3 == null) {
            r3 = C173318Rf.DEFAULT_INSTANCE;
        }
        C19730wQ r42 = this.A00;
        C64933Qa r12 = r2.A1J;
        if (r12.A02) {
            A0b = C36441kJ.A0n(r42);
        } else {
            A0b = C36401kF.A0b(r12.A00);
        }
        r2.A03 = A0b;
        r2.A02 = AnonymousClass147.A01.A06(r3.groupJid_);
        r2.A05 = r3.groupName_;
        r2.A01 = r3.inviteExpiration_;
        r2.A06 = r3.inviteCode_;
        r2.A04 = r3.caption_;
        int i = r3.groupType_;
        if (i == 0 || i != 1) {
            r1 = AnonymousClass90N.DEFAULT;
        } else {
            r1 = AnonymousClass90N.PARENT;
        }
        r2.A00 = C36361kB.A1a(r1, AnonymousClass90N.PARENT) ? 1 : 0;
        byte[] A06 = r3.jpegThumbnail_.A06();
        if (A06.length > 0) {
            r2.A0l(1);
            r2.A1D(A06, r6.A0O);
        }
        return r2;
    }

    public C21174ABi(C19730wQ r1, C202029kv r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
