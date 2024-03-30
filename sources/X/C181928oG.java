package X;

import android.content.Context;

/* renamed from: X.8oG  reason: invalid class name and case insensitive filesystem */
public final class C181928oG extends C200259gz {
    public String A0D(Context context) {
        String str = this.A02.A09;
        if (str != null && str.length() != 0) {
            return str;
        }
        String A0B = A0B();
        if (A0B == null) {
            return "";
        }
        return A0B;
    }

    public String A0E(Context context) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("🛍 ");
        String str = this.A02.A09;
        if (str == null || str.length() == 0) {
            str = A0B();
        }
        return AnonymousClass000.A0q(str, A0u);
    }

    public void A0F(C196159Xy r9, AnonymousClass3T1 r10) {
        C170918Hz r0;
        String str;
        C1887790r r2;
        C36321k7.A0w(r9, r10);
        super.A0F(r9, r10);
        if (r10 instanceof C23043B1o) {
            C207219uk BA8 = ((C23043B1o) r10).BA8();
            String str2 = null;
            if (BA8 != null && BA8.A06 != null) {
                AnonymousClass8NL r3 = r9.A00;
                AnonymousClass8NN A02 = C170918Hz.A02(r3);
                AnonymousClass8SV r5 = (AnonymousClass8SV) A02.A00;
                if (r5.interactiveMessageCase_ == 4) {
                    r0 = (C170918Hz) r5.interactiveMessage_;
                } else {
                    r0 = AnonymousClass8Q2.DEFAULT_INSTANCE;
                }
                AnonymousClass8NN A0q = r0.A0q();
                C206679tn r7 = BA8.A06;
                if (r7 == null || (str = r7.A02) == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    if (r7 != null) {
                        str2 = r7.A02;
                    }
                    AnonymousClass8Q2 r1 = (AnonymousClass8Q2) C90524aI.A0H(A0q);
                    int i = AnonymousClass8Q2.ID_FIELD_NUMBER;
                    str2.getClass();
                    r1.bitField0_ |= 1;
                    r1.id_ = str2;
                }
                AnonymousClass00C.A0B(r7);
                int i2 = r7.A00;
                if (i2 == 1) {
                    r2 = C1887790r.FB;
                } else if (i2 == 2) {
                    r2 = C1887790r.IG;
                } else if (i2 != 3) {
                    r2 = C1887790r.UNKNOWN_SURFACE;
                } else {
                    r2 = C1887790r.WA;
                }
                AnonymousClass8Q2 r12 = (AnonymousClass8Q2) C90524aI.A0H(A0q);
                int i3 = AnonymousClass8Q2.ID_FIELD_NUMBER;
                r12.surface_ = r2.value;
                r12.bitField0_ |= 2;
                int i4 = r7.A01;
                AnonymousClass8Q2 r13 = (AnonymousClass8Q2) C90524aI.A0H(A0q);
                r13.bitField0_ |= 4;
                r13.messageVersion_ = i4;
                if (BA8.A00 == 4) {
                    C200259gz.A00(A02, A0q).interactiveMessageCase_ = 4;
                }
                r3.A0a((AnonymousClass8SV) A02.A0R());
            }
        }
    }

    public C181928oG(C207219uk r1, AnonymousClass9IS r2) {
        super(r1, r2);
    }
}
