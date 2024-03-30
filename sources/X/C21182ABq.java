package X;

import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.ABq  reason: case insensitive filesystem */
public class C21182ABq implements C22938Ayo, C22942Ays, C17740rx {
    public final AnonymousClass9Te A00;
    public final C20810yC A01;
    public final C202029kv A02;
    public final C195739Vt A03;

    public void B24(C196159Xy r6, AnonymousClass3T1 r7) {
        if (r7 instanceof C46852bm) {
            C46852bm r72 = (C46852bm) r7;
            AnonymousClass9Te r1 = this.A00;
            AnonymousClass8NL r3 = r6.A00;
            AnonymousClass8RR r0 = ((AnonymousClass8SX) r3.A00).productMessage_;
            if (r0 == null) {
                r0 = AnonymousClass8RR.DEFAULT_INSTANCE;
            }
            AnonymousClass8KQ A002 = r1.A00(r6, (AnonymousClass8KQ) r0.A0q(), r72);
            if (A002 != null) {
                if (!TextUtils.isEmpty(r72.A02)) {
                    String str = r72.A02;
                    AnonymousClass8RR r12 = (AnonymousClass8RR) C90524aI.A0H(A002);
                    int i = AnonymousClass8RR.BODY_FIELD_NUMBER;
                    str.getClass();
                    r12.bitField0_ |= 8;
                    r12.body_ = str;
                }
                if (!TextUtils.isEmpty(r72.A05)) {
                    String str2 = r72.A05;
                    AnonymousClass8RR r13 = (AnonymousClass8RR) C90524aI.A0H(A002);
                    int i2 = AnonymousClass8RR.BODY_FIELD_NUMBER;
                    str2.getClass();
                    r13.bitField0_ |= 16;
                    r13.footer_ = str2;
                }
                C80103un r2 = r6.A02;
                byte[] bArr = r6.A0B;
                if (C202029kv.A02(r2, r72, bArr)) {
                    AnonymousClass8SG A003 = C196159Xy.A00(this.A02, r6, r2, r72, bArr);
                    AnonymousClass8RR r14 = (AnonymousClass8RR) C90524aI.A0H(A002);
                    int i3 = AnonymousClass8RR.BODY_FIELD_NUMBER;
                    A003.getClass();
                    r14.contextInfo_ = A003;
                    r14.bitField0_ |= 32;
                }
                AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r3);
                AnonymousClass8RR r02 = (AnonymousClass8RR) A002.A0R();
                r02.getClass();
                A0E.productMessage_ = r02;
                A0E.bitField0_ |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            C165577te.A1F(r72, "FMessageProduct/buildE2eMessage/unable to send encrypted media message due to missing mediaKey or businessOwnerJid; message.key=", A0u);
            A0u.append("; media_wa_type=");
            A0u.append(r72.A1I);
            A0u.append("; business_owner_jid=");
            C36351kA.A1L(r72.A01, A0u);
            if (r72.A01 == null && r6.A03 && C165597tg.A1R(this.A01)) {
                throw C165567td.A0K(0);
            }
            return;
        }
        throw AnonymousClass001.A08("FMessageProductProtobuf/not supported message");
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r9) {
        AnonymousClass8SX r2 = r9.A0A;
        if ((r2.bitField0_ & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 0) {
            return null;
        }
        AnonymousClass8RR r0 = r2.productMessage_;
        AnonymousClass8RR r3 = r0;
        if (r0 == null) {
            r0 = AnonymousClass8RR.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 1) == 0) {
            return null;
        }
        if (r3 == null) {
            r3 = AnonymousClass8RR.DEFAULT_INSTANCE;
        }
        C18740tg.A06(r3);
        C46852bm r4 = new C46852bm(r9.A0C, r9.A04);
        this.A00.A01(r3, r4, r9.A01, r9.A03(), r9.A0O);
        r4.A02 = r3.body_;
        r4.A05 = r3.footer_;
        return r4;
    }

    public C21182ABq(C20810yC r1, C202029kv r2, C195739Vt r3, AnonymousClass9Te r4) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = r4;
    }
}
