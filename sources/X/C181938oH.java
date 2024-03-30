package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.8oH  reason: invalid class name and case insensitive filesystem */
public class C181938oH extends C200259gz {
    public final C20810yC A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C181938oH(C20810yC r2, C207219uk r3, AnonymousClass9IS r4) {
        super(r3, r4);
        AnonymousClass00C.A0D(r2, 3);
        this.A00 = r2;
    }

    public String A0D(Context context) {
        AnonymousClass00C.A0D(context, 0);
        C207219uk r2 = this.A02;
        if (!C207219uk.A01(r2) && !"payment_status".equals(r2.A02()) && !"payment_method".equals(r2.A02())) {
            return super.A0D(context);
        }
        String A0C = A0C(context);
        if (A0C == null) {
            return "";
        }
        return A0C;
    }

    public String A0E(Context context) {
        AnonymousClass00C.A0D(context, 0);
        C207219uk r2 = this.A02;
        if (!C207219uk.A01(r2) && !"payment_status".equals(r2.A02()) && !"payment_method".equals(r2.A02())) {
            return super.A0E(context);
        }
        String A0C = A0C(context);
        if (A0C == null) {
            return "";
        }
        return A0C;
    }

    public void A0F(C196159Xy r10, AnonymousClass3T1 r11) {
        List<C206569tc> list;
        C36321k7.A0w(r10, r11);
        super.A0F(r10, r11);
        C207219uk BA8 = ((C23043B1o) r11).BA8();
        String str = null;
        if (BA8 != null && BA8.A04 != null && BA8.A00 == 5) {
            AnonymousClass8NL r4 = r10.A00;
            AnonymousClass8NN A02 = C170918Hz.A02(r4);
            AnonymousClass8NN A0q = ((AnonymousClass8SV) A02.A00).A0u().A0q();
            C207089uX r0 = BA8.A04;
            if (r0 != null) {
                str = r0.A02;
            }
            AnonymousClass8Q1 r1 = (AnonymousClass8Q1) C90524aI.A0H(A0q);
            int i = AnonymousClass8Q1.BUTTONS_FIELD_NUMBER;
            str.getClass();
            r1.bitField0_ |= 1;
            r1.messageParamsJson_ = str;
            C207089uX r02 = BA8.A04;
            if (r02 != null) {
                list = r02.A03;
            } else {
                list = C023409w.A00;
            }
            for (C206569tc r12 : list) {
                AnonymousClass8NN A0p = AnonymousClass8P5.DEFAULT_INSTANCE.A0p();
                C206969uL r3 = r12.A01;
                String str2 = r3.A00;
                AnonymousClass8P5 r13 = (AnonymousClass8P5) C90524aI.A0H(A0p);
                str2.getClass();
                r13.bitField0_ |= 1;
                r13.name_ = str2;
                String str3 = r3.A01;
                if (str3 != null) {
                    AnonymousClass8P5 r14 = (AnonymousClass8P5) C90524aI.A0H(A0p);
                    r14.bitField0_ |= 2;
                    r14.buttonParamsJson_ = str3;
                }
                AnonymousClass8Q1 r32 = (AnonymousClass8Q1) C90524aI.A0H(A0q);
                C170918Hz A0R = A0p.A0R();
                A0R.getClass();
                C23122B6c b6c = r32.buttons_;
                if (!((C21886AcE) b6c).A00) {
                    b6c = C170918Hz.A0A(b6c);
                    r32.buttons_ = b6c;
                }
                b6c.add(A0R);
            }
            C200259gz.A00(A02, A0q).interactiveMessageCase_ = 6;
            r4.A0a((AnonymousClass8SV) A02.A0R());
        }
    }
}
