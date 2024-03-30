package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.9Te  reason: invalid class name */
public final class AnonymousClass9Te {
    public final C195739Vt A00;

    public final AnonymousClass8KQ A00(C196159Xy r8, AnonymousClass8KQ r9, C46852bm r10) {
        BigDecimal bigDecimal;
        C36321k7.A0v(r10, 0, r9);
        UserJid userJid = r10.A01;
        if (userJid != null) {
            AnonymousClass8RR r0 = ((AnonymousClass8SX) r8.A00.A00).productMessage_;
            if (r0 == null) {
                r0 = AnonymousClass8RR.DEFAULT_INSTANCE;
            }
            C173458Rt r02 = r0.product_;
            if (r02 == null) {
                r02 = C173458Rt.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r02.A0q();
            C195739Vt r1 = this.A00;
            AnonymousClass8SF r03 = ((C173458Rt) A0q.A00).productImage_;
            if (r03 == null) {
                r03 = AnonymousClass8SF.DEFAULT_INSTANCE;
            }
            AnonymousClass8NJ A002 = r1.A00(r8, (AnonymousClass8NJ) r03.A0q(), r10);
            if (A002 != null) {
                String A0K = AnonymousClass8NN.A0K(r9, userJid);
                AnonymousClass8RR r12 = (AnonymousClass8RR) r9.A00;
                A0K.getClass();
                r12.bitField0_ |= 2;
                r12.businessOwnerJid_ = A0K;
                String str = r10.A06;
                if (!(str == null || str.length() == 0)) {
                    C173458Rt r13 = (C173458Rt) C90524aI.A0H(A0q);
                    r13.bitField0_ |= 2;
                    r13.productId_ = str;
                }
                String str2 = r10.A04;
                if (!(str2 == null || str2.length() == 0)) {
                    C173458Rt r14 = (C173458Rt) C90524aI.A0H(A0q);
                    r14.bitField0_ |= 8;
                    r14.description_ = str2;
                }
                String str3 = r10.A09;
                if (!(str3 == null || str3.length() == 0)) {
                    C173458Rt r15 = (C173458Rt) C90524aI.A0H(A0q);
                    r15.bitField0_ |= 4;
                    r15.title_ = str3;
                }
                String str4 = r10.A03;
                if (!(str4 == null || str4.length() == 0 || (bigDecimal = r10.A0A) == null)) {
                    C173458Rt r16 = (C173458Rt) C90524aI.A0H(A0q);
                    r16.bitField0_ |= 16;
                    r16.currencyCode_ = str4;
                    BigDecimal bigDecimal2 = C129676Ia.A00;
                    long longValue = bigDecimal.multiply(bigDecimal2).longValue();
                    C173458Rt r17 = (C173458Rt) C90524aI.A0H(A0q);
                    r17.bitField0_ |= 32;
                    r17.priceAmount1000_ = longValue;
                    BigDecimal bigDecimal3 = r10.A0B;
                    if (!(bigDecimal3 == null || BigDecimal.ZERO.compareTo(bigDecimal3) == 0)) {
                        long longValue2 = bigDecimal3.multiply(bigDecimal2).longValue();
                        C173458Rt r18 = (C173458Rt) C90524aI.A0H(A0q);
                        r18.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                        r18.salePriceAmount1000_ = longValue2;
                    }
                }
                String str5 = r10.A08;
                if (!(str5 == null || str5.length() == 0)) {
                    C173458Rt r19 = (C173458Rt) C90524aI.A0H(A0q);
                    r19.bitField0_ |= 64;
                    r19.retailerId_ = str5;
                }
                String str6 = r10.A07;
                if (!(str6 == null || str6.length() == 0)) {
                    C173458Rt r110 = (C173458Rt) C90524aI.A0H(A0q);
                    r110.bitField0_ |= 128;
                    r110.url_ = str6;
                }
                int i = r10.A00;
                C173458Rt r111 = (C173458Rt) C90524aI.A0H(A0q);
                r111.bitField0_ |= 256;
                r111.productImageCount_ = i;
                C173458Rt r112 = (C173458Rt) C90524aI.A0H(A0q);
                AnonymousClass8SF r04 = (AnonymousClass8SF) A002.A0R();
                r04.getClass();
                r112.productImage_ = r04;
                r112.bitField0_ |= 1;
                AnonymousClass8RR r113 = (AnonymousClass8RR) C90524aI.A0H(r9);
                C173458Rt r05 = (C173458Rt) A0q.A0R();
                r05.getClass();
                r113.product_ = r05;
                r113.bitField0_ |= 1;
                return r9;
            }
        }
        return null;
    }

    public AnonymousClass9Te(C195739Vt r1) {
        this.A00 = r1;
    }

    public final void A01(AnonymousClass8RR r10, C46852bm r11, int i, boolean z, boolean z2) {
        boolean A1V = C36371kC.A1V(r10);
        C46852bm r5 = r11;
        try {
            C222813r r0 = UserJid.Companion;
            r11.A01 = C222813r.A01(r10.businessOwnerJid_);
        } catch (C19740wR unused) {
        }
        if (r11.A01 != null) {
            C173458Rt r3 = r10.product_;
            if (r3 == null) {
                r3 = C173458Rt.DEFAULT_INSTANCE;
            }
            AnonymousClass00C.A08(r3);
            r11.A06 = r3.productId_;
            r11.A09 = r3.title_;
            r11.A04 = r3.description_;
            String str = r3.currencyCode_;
            r11.A03 = str;
            if (!(str == null || str.length() == 0)) {
                try {
                    r11.A0A = C129676Ia.A00(new C132386Tk(str), r3.priceAmount1000_);
                    r11.A0B = C129676Ia.A00(new C132386Tk(str), r3.salePriceAmount1000_);
                } catch (IllegalArgumentException unused2) {
                    r11.A03 = null;
                }
            }
            r11.A08 = r3.retailerId_;
            r11.A07 = r3.url_;
            r11.A00 = r3.productImageCount_;
            AnonymousClass8SF r4 = r3.productImage_;
            if (r4 == null) {
                r4 = AnonymousClass8SF.DEFAULT_INSTANCE;
            }
            this.A00.A02(r4, r5, i, z, z2);
            return;
        }
        throw C165567td.A0J(A1V ? 1 : 0);
    }
}
