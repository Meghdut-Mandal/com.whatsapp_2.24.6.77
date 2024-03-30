package X;

import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.UserJid;

/* renamed from: X.ABp  reason: case insensitive filesystem */
public class C21181ABp implements C22938Ayo, C22942Ays, C17740rx {
    public final C195739Vt A00;
    public final C19700wN A01;
    public final C20810yC A02;
    public final C202029kv A03;

    public void B24(C196159Xy r8, AnonymousClass3T1 r9) {
        UserJid userJid;
        if (r9 instanceof C46842bl) {
            C46842bl r92 = (C46842bl) r9;
            AnonymousClass8NL r4 = r8.A00;
            AnonymousClass8RR r0 = ((AnonymousClass8SX) r4.A00).productMessage_;
            if (r0 == null) {
                r0 = AnonymousClass8RR.DEFAULT_INSTANCE;
            }
            AnonymousClass8KQ r3 = (AnonymousClass8KQ) r0.A0q();
            AnonymousClass8RR r02 = ((AnonymousClass8SX) r4.A00).productMessage_;
            if (r02 == null) {
                r02 = AnonymousClass8RR.DEFAULT_INSTANCE;
            }
            AnonymousClass8Q9 r03 = r02.catalog_;
            if (r03 == null) {
                r03 = AnonymousClass8Q9.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r03.A0q();
            C195739Vt r1 = this.A00;
            AnonymousClass8SF r04 = ((AnonymousClass8Q9) A0q.A00).catalogImage_;
            if (r04 == null) {
                r04 = AnonymousClass8SF.DEFAULT_INSTANCE;
            }
            AnonymousClass8NJ A002 = r1.A00(r8, (AnonymousClass8NJ) r04.A0q(), r92);
            if (A002 == null || (userJid = r92.A00) == null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                C165577te.A1F(r92, "FMessageCatalog/buildE2eMessage/unable to send encrypted media message due to missing mediaKey or businessOwnerJid; message.key=", A0u);
                A0u.append("; media_wa_type=");
                A0u.append(r92.A1I);
                A0u.append("; business_owner_jid=");
                C36351kA.A1L(r92.A00, A0u);
                if (r92.A00 == null && r8.A03 && C165597tg.A1R(this.A02)) {
                    throw C165567td.A0K(0);
                }
                return;
            }
            String A0K = AnonymousClass8NN.A0K(r3, userJid);
            AnonymousClass8RR r12 = (AnonymousClass8RR) r3.A00;
            A0K.getClass();
            r12.bitField0_ |= 2;
            r12.businessOwnerJid_ = A0K;
            if (!TextUtils.isEmpty(r92.A01)) {
                String str = r92.A01;
                AnonymousClass8Q9 r13 = (AnonymousClass8Q9) C90524aI.A0H(A0q);
                str.getClass();
                r13.bitField0_ |= 4;
                r13.description_ = str;
            }
            if (!TextUtils.isEmpty(r92.A02)) {
                String str2 = r92.A02;
                AnonymousClass8Q9 r14 = (AnonymousClass8Q9) C90524aI.A0H(A0q);
                str2.getClass();
                r14.bitField0_ |= 2;
                r14.title_ = str2;
            }
            AnonymousClass8Q9 r15 = (AnonymousClass8Q9) C90524aI.A0H(A0q);
            AnonymousClass8SF r05 = (AnonymousClass8SF) A002.A0R();
            r05.getClass();
            r15.catalogImage_ = r05;
            r15.bitField0_ |= 1;
            AnonymousClass8RR r16 = (AnonymousClass8RR) C90524aI.A0H(r3);
            AnonymousClass8Q9 r06 = (AnonymousClass8Q9) A0q.A0R();
            r06.getClass();
            r16.catalog_ = r06;
            r16.bitField0_ |= 4;
            C80103un r2 = r8.A02;
            byte[] bArr = r8.A0B;
            if (C202029kv.A02(r2, r92, bArr)) {
                AnonymousClass8SG A003 = C196159Xy.A00(this.A03, r8, r2, r92, bArr);
                AnonymousClass8RR r17 = (AnonymousClass8RR) C90524aI.A0H(r3);
                A003.getClass();
                r17.contextInfo_ = A003;
                r17.bitField0_ |= 32;
            }
            AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r4);
            AnonymousClass8RR r07 = (AnonymousClass8RR) r3.A0R();
            r07.getClass();
            A0E.productMessage_ = r07;
            A0E.bitField0_ |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
            return;
        }
        throw AnonymousClass001.A08("FMessageCatalogProtobuf/not supported message");
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r9) {
        AnonymousClass8SX r4 = r9.A0A;
        if ((r4.bitField0_ & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 0) {
            return null;
        }
        AnonymousClass8RR r0 = r4.productMessage_;
        if (r0 == null) {
            r0 = AnonymousClass8RR.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 4) == 0) {
            return null;
        }
        this.A01.A0E("fmessage-protobuf-catalog-deprecation", "", false);
        AnonymousClass8RR r3 = r4.productMessage_;
        if (r3 == null) {
            r3 = AnonymousClass8RR.DEFAULT_INSTANCE;
        }
        C18740tg.A06(r3);
        C46842bl r42 = new C46842bl(r9.A0C, r9.A04);
        try {
            String str = r3.businessOwnerJid_;
            C222813r r02 = UserJid.Companion;
            r42.A00 = C222813r.A01(str);
        } catch (C19740wR unused) {
        }
        if (r42.A00 != null) {
            AnonymousClass8Q9 r1 = r3.catalog_;
            if (r1 == null) {
                r1 = AnonymousClass8Q9.DEFAULT_INSTANCE;
            }
            r42.A02 = r1.title_;
            r42.A01 = r1.description_;
            AnonymousClass8SF r32 = r1.catalogImage_;
            if (r32 == null) {
                r32 = AnonymousClass8SF.DEFAULT_INSTANCE;
            }
            this.A00.A02(r32, r42, r9.A01, r9.A03(), r9.A0O);
            return r42;
        }
        throw C165567td.A0J(0);
    }

    public C21181ABp(C19700wN r1, C20810yC r2, C202029kv r3, C195739Vt r4) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A00 = r4;
    }
}
