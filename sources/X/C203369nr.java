package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.9nr  reason: invalid class name and case insensitive filesystem */
public abstract class C203369nr {
    public static AnonymousClass3T1 A01(AnonymousClass3T1 r1) {
        AnonymousClass2bZ B9R;
        if (!(r1 instanceof AnonymousClass4TW) || (B9R = ((AnonymousClass4TW) r1).B9R()) == null) {
            return r1;
        }
        return B9R;
    }

    public static void A06(C202029kv r11, C196159Xy r12, AnonymousClass3T1 r13) {
        C207219uk BA8;
        AnonymousClass90a r2;
        C206819u1 r7;
        AnonymousClass8NL r3 = r12.A00;
        AnonymousClass8SP r0 = ((AnonymousClass8SX) r3.A00).listMessage_;
        if (r0 == null) {
            r0 = AnonymousClass8SP.DEFAULT_INSTANCE;
        }
        AnonymousClass8NN A0q = r0.A0q();
        if ((r13 instanceof C23043B1o) && (BA8 = ((C23043B1o) r13).BA8()) != null) {
            int i = BA8.A00;
            if (i == 1) {
                r2 = AnonymousClass90a.SINGLE_SELECT;
            } else if (i == 2 || i == 6) {
                r2 = AnonymousClass90a.PRODUCT_LIST;
            } else {
                r2 = AnonymousClass90a.UNKNOWN;
            }
            AnonymousClass8SP r1 = (AnonymousClass8SP) C90524aI.A0H(A0q);
            int i2 = AnonymousClass8SP.BUTTON_TEXT_FIELD_NUMBER;
            r1.listType_ = r2.value;
            r1.bitField0_ |= 8;
            C206659tl r02 = BA8.A03;
            if (r02 != null) {
                String str = r02.A01;
                if (!TextUtils.isEmpty(str)) {
                    AnonymousClass8SP A00 = A00(A0q, str);
                    A00.bitField0_ |= 1;
                    A00.title_ = str;
                }
            }
            if (!TextUtils.isEmpty(BA8.A0A)) {
                String str2 = BA8.A0A;
                AnonymousClass8SP A002 = A00(A0q, str2);
                A002.bitField0_ |= 32;
                A002.footerText_ = str2;
            }
            String str3 = BA8.A09;
            AnonymousClass8SP A003 = A00(A0q, str3);
            A003.bitField0_ |= 2;
            A003.description_ = str3;
            String str4 = BA8.A08;
            AnonymousClass8SP A004 = A00(A0q, str4);
            A004.bitField0_ |= 4;
            A004.buttonText_ = str4;
            int i3 = BA8.A00;
            if (i3 == 1) {
                for (C206689to r5 : BA8.A0C) {
                    AnonymousClass8NN A0p = AnonymousClass8P9.DEFAULT_INSTANCE.A0p();
                    String str5 = r5.A01;
                    if (!TextUtils.isEmpty(str5)) {
                        AnonymousClass8P9 r14 = (AnonymousClass8P9) C90524aI.A0H(A0p);
                        r14.bitField0_ |= 1;
                        r14.title_ = str5;
                    }
                    for (C206729ts r6 : r5.A02) {
                        AnonymousClass8NN A0p2 = AnonymousClass8Q6.DEFAULT_INSTANCE.A0p();
                        String str6 = r6.A03;
                        AnonymousClass8Q6 r15 = (AnonymousClass8Q6) C90524aI.A0H(A0p2);
                        r15.bitField0_ |= 1;
                        r15.title_ = str6;
                        String str7 = r6.A02;
                        AnonymousClass8Q6 r16 = (AnonymousClass8Q6) C90524aI.A0H(A0p2);
                        r16.bitField0_ |= 4;
                        r16.rowId_ = str7;
                        String str8 = r6.A00;
                        if (!TextUtils.isEmpty(str8)) {
                            AnonymousClass8Q6 r17 = (AnonymousClass8Q6) C90524aI.A0H(A0p2);
                            str8.getClass();
                            r17.bitField0_ |= 2;
                            r17.description_ = str8;
                        }
                        C170918Hz A0R = A0p2.A0R();
                        AnonymousClass8P9 r22 = (AnonymousClass8P9) C90524aI.A0H(A0p);
                        A0R.getClass();
                        C23122B6c b6c = r22.rows_;
                        if (!((C21886AcE) b6c).A00) {
                            b6c = C170918Hz.A0A(b6c);
                            r22.rows_ = b6c;
                        }
                        b6c.add(A0R);
                    }
                    C170918Hz A0R2 = A0p.A0R();
                    AnonymousClass8SP A005 = A00(A0q, A0R2);
                    C23122B6c b6c2 = A005.sections_;
                    if (!((C21886AcE) b6c2).A00) {
                        b6c2 = C170918Hz.A0A(b6c2);
                        A005.sections_ = b6c2;
                    }
                    b6c2.add(A0R2);
                }
            } else if ((i3 == 2 || i3 == 6) && (r7 = BA8.A05) != null) {
                AnonymousClass8NN A0p3 = AnonymousClass8Q5.DEFAULT_INSTANCE.A0p();
                for (C206579td r62 : r7.A02) {
                    AnonymousClass8NN A0p4 = AnonymousClass8P8.DEFAULT_INSTANCE.A0p();
                    String str9 = r62.A00;
                    if (!TextUtils.isEmpty(str9)) {
                        AnonymousClass8P8 r18 = (AnonymousClass8P8) C90524aI.A0H(A0p4);
                        str9.getClass();
                        r18.bitField0_ |= 1;
                        r18.title_ = str9;
                    }
                    for (C206509tW r19 : r62.A01) {
                        AnonymousClass8NN A0p5 = C172378Np.DEFAULT_INSTANCE.A0p();
                        String str10 = r19.A00;
                        if (!TextUtils.isEmpty(str10)) {
                            C172378Np r110 = (C172378Np) C90524aI.A0H(A0p5);
                            r110.bitField0_ |= 1;
                            r110.productId_ = str10;
                            C170918Hz A0R3 = A0p5.A0R();
                            AnonymousClass8P8 r23 = (AnonymousClass8P8) C90524aI.A0H(A0p4);
                            A0R3.getClass();
                            C23122B6c b6c3 = r23.products_;
                            if (!((C21886AcE) b6c3).A00) {
                                b6c3 = C170918Hz.A0A(b6c3);
                                r23.products_ = b6c3;
                            }
                            b6c3.add(A0R3);
                        }
                    }
                    C170918Hz A0R4 = A0p4.A0R();
                    AnonymousClass8Q5 r24 = (AnonymousClass8Q5) C90524aI.A0H(A0p3);
                    A0R4.getClass();
                    C23122B6c b6c4 = r24.productSections_;
                    if (!((C21886AcE) b6c4).A00) {
                        b6c4 = C170918Hz.A0A(b6c4);
                        r24.productSections_ = b6c4;
                    }
                    b6c4.add(A0R4);
                    String A0K = AnonymousClass8NN.A0K(A0p3, r7.A00);
                    AnonymousClass8Q5 r111 = (AnonymousClass8Q5) A0p3.A00;
                    A0K.getClass();
                    r111.bitField0_ |= 2;
                    r111.businessOwnerJid_ = A0K;
                }
                AnonymousClass8NN A0p6 = AnonymousClass8P7.DEFAULT_INSTANCE.A0p();
                C206669tm r72 = r7.A01;
                byte[] bArr = r72.A02;
                if (bArr != null) {
                    AnonymousClass8I5 A0O = C90474aD.A0O(A0p6, bArr);
                    AnonymousClass8P7 r112 = (AnonymousClass8P7) A0p6.A00;
                    r112.bitField0_ |= 2;
                    r112.jpegThumbnail_ = A0O;
                }
                String str11 = r72.A01;
                AnonymousClass8P7 r113 = (AnonymousClass8P7) C90524aI.A0H(A0p6);
                r113.bitField0_ |= 1;
                r113.productId_ = str11;
                AnonymousClass8Q5 r114 = (AnonymousClass8Q5) C90524aI.A0H(A0p3);
                AnonymousClass8P7 r03 = (AnonymousClass8P7) A0p6.A0R();
                r03.getClass();
                r114.headerImage_ = r03;
                r114.bitField0_ |= 1;
                AnonymousClass8Q5 r04 = (AnonymousClass8Q5) A0p3.A0R();
                AnonymousClass8SP A006 = A00(A0q, r04);
                A006.productListInfo_ = r04;
                A006.bitField0_ |= 16;
            }
            C80103un r25 = r12.A02;
            byte[] bArr2 = r12.A0B;
            if (C202029kv.A02(r25, r13, bArr2)) {
                AnonymousClass8SG A007 = C196159Xy.A00(r11, r12, r25, r13, bArr2);
                AnonymousClass8SP A008 = A00(A0q, A007);
                A008.contextInfo_ = A007;
                A008.bitField0_ |= 64;
            }
            AnonymousClass8SP r05 = (AnonymousClass8SP) A0q.A0R();
            AnonymousClass8SX A0F = AnonymousClass8NN.A0F(r3, r05);
            A0F.listMessage_ = r05;
            A0F.bitField0_ |= 134217728;
        }
    }

    public static boolean A08(AnonymousClass3T1 r2) {
        C207219uk BA8;
        if (!(r2 instanceof C23043B1o) || !(r2.A1J instanceof C46772be) || (BA8 = ((C23043B1o) r2).BA8()) == null || !BA8.A05()) {
            return false;
        }
        return true;
    }

    public static boolean A09(AnonymousClass3T1 r4) {
        C207219uk BA8;
        if (!(r4 instanceof C23043B1o) || (BA8 = ((C23043B1o) r4).BA8()) == null || BA8.A00 != 7 || BA8.A02 == null) {
            return false;
        }
        return true;
    }

    public static AnonymousClass8SP A00(AnonymousClass8NN r0, Object obj) {
        r0.A0S();
        AnonymousClass8SP r02 = (AnonymousClass8SP) r0.A00;
        obj.getClass();
        return r02;
    }

    public static AnonymousClass3T1 A02(AnonymousClass3T1 r1, int i) {
        List A1X;
        if (!A09(r1) || (A1X = ((AnonymousClass2bZ) r1).A1X()) == null || i < 0 || i >= A1X.size()) {
            return null;
        }
        return (AnonymousClass3T1) A1X.get(i);
    }

    public static Integer A03(AnonymousClass3T1 r1) {
        if (A08(r1)) {
            return Integer.valueOf(((C46772be) r1.A1J).A00);
        }
        return null;
    }

    public static String A04(Context context, C20810yC r6, C207219uk r7, String str) {
        Number number;
        Map map;
        Map map2;
        if (!TextUtils.isEmpty(r7.A03())) {
            String A03 = r7.A03();
            if (C207219uk.A01(r7)) {
                if (A03 != null) {
                    String A02 = C202869mo.A02(A03);
                    if (AnonymousClass000.A1P(C165587tf.A05(r6))) {
                        map2 = C202869mo.A03;
                    } else {
                        map2 = C202869mo.A02;
                    }
                    number = C90524aI.A0b(A02, map2);
                }
                number = null;
            } else if ("payment_method".equals(r7.A02())) {
                number = C202869mo.A00(r6, A03);
            } else {
                if ("payment_status".equals(r7.A02()) && !TextUtils.isEmpty(A03)) {
                    String str2 = null;
                    if (!TextUtils.isEmpty(A03)) {
                        try {
                            str2 = C36441kJ.A1C(A03).optString("payment_status", "pending");
                        } catch (JSONException e) {
                            Log.e("CheckoutInfoContentParser/getCustomPaymentMethodStr failed to parse parameters json", e);
                        }
                    }
                    if (C202869mo.A03(r6)) {
                        map = C202869mo.A01;
                    } else {
                        map = C202869mo.A00;
                    }
                    number = C90524aI.A0b(str2, map);
                }
                number = null;
            }
            if (number != null) {
                String string = context.getResources().getString(number.intValue());
                if (TextUtils.isEmpty(str)) {
                    return string;
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                C36331k8.A1N(string, str, charSequenceArr);
                return AnonymousClass14B.A08("\n", charSequenceArr);
            }
        }
        return str;
    }

    public static String A05(AnonymousClass3T1 r2) {
        String str;
        AnonymousClass3F4 BIE;
        C207219uk BA8;
        AnonymousClass3T1 A01 = A01(r2);
        if (!(A01 instanceof C23043B1o) || (BA8 = ((C23043B1o) A01).BA8()) == null) {
            str = null;
        } else {
            str = BA8.A0B;
        }
        if (!TextUtils.isEmpty(str) || !(A01 instanceof C88854Uh) || (BIE = ((C88854Uh) A01).BIE()) == null) {
            return str;
        }
        return BIE.A05;
    }

    public static boolean A07(AnonymousClass3T1 r0) {
        return !AnonymousClass14B.A0F(A05(r0));
    }
}
