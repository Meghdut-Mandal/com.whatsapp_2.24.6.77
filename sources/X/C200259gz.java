package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.9gz  reason: invalid class name and case insensitive filesystem */
public abstract class C200259gz {
    public final C18820ts A00;
    public final C202029kv A01;
    public final C207219uk A02;

    public CharSequence A07(Context context, Paint paint) {
        String str;
        int length;
        StringBuilder A0u = AnonymousClass000.A0u();
        String A0B = A0B();
        if (!(A0B == null || (length = A0B.length()) == 0)) {
            int i = length - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= i) {
                int i3 = i;
                if (!z) {
                    i3 = i2;
                }
                boolean A1Q = C90484aE.A1Q(AnonymousClass00C.A00(A0B.charAt(i3), 32));
                if (z) {
                    if (!A1Q) {
                        break;
                    }
                    i--;
                } else if (!A1Q) {
                    z = true;
                } else {
                    i2++;
                }
            }
            C36351kA.A1K(A0B.subSequence(i2, i + 1), A0u);
        }
        C206659tl r0 = this.A02.A03;
        if (r0 != null) {
            str = r0.A00;
        } else {
            str = null;
        }
        A02(str, "\n", A0u);
        A02(A06(context, paint), "\n", A0u);
        Drawable A04 = A04(context);
        if (A04 == null) {
            return A0u;
        }
        CharSequence A022 = C37351mE.A02(paint, A04, A0u);
        AnonymousClass00C.A0B(A022);
        return A022;
    }

    public static final void A02(CharSequence charSequence, String str, StringBuilder sb) {
        if (charSequence != null && charSequence.length() != 0) {
            if (sb.length() > 0) {
                sb.append(str);
            }
            sb.append(charSequence);
        }
    }

    public int A03() {
        if (this instanceof C181928oG) {
            return 33;
        }
        if (this instanceof C181898oD) {
            return 25;
        }
        if (this instanceof C181938oH) {
            if (!"galaxy_message".equals(this.A02.A02())) {
                return 35;
            }
            return 1;
        } else if (this instanceof C181918oF) {
            return 55;
        } else {
            return 1;
        }
    }

    public Drawable A04(Context context) {
        if (this instanceof C181928oG) {
            AnonymousClass00C.A0D(context, 0);
            boolean z = C222013h.A07;
            int i = R.drawable.msg_status_shop;
            if (z) {
                i = R.drawable.msg_status_shop_filled_wds;
            }
            Drawable A0D = C165587tf.A0D(context, i);
            AnonymousClass00C.A08(A0D);
            return A0D;
        } else if (!(this instanceof C181948oI)) {
            return null;
        } else {
            AnonymousClass00C.A0D(context, 0);
            boolean z2 = C222013h.A07;
            int i2 = R.drawable.vec_ic_receipt_16dp;
            if (z2) {
                i2 = R.drawable.vec_ic_receipt_16dp_filled_wds;
            }
            return AnonymousClass3UF.A02(context, i2, R.color.f6nameremoved);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r1.A0E(r0) != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C51342nf A05() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C181928oG
            if (r0 != 0) goto L_0x002e
            boolean r0 = r4 instanceof X.C181908oE
            if (r0 != 0) goto L_0x002e
            boolean r0 = r4 instanceof X.C181938oH
            if (r0 == 0) goto L_0x0031
            r3 = r4
            X.8oH r3 = (X.C181938oH) r3
            X.9uk r2 = r3.A02
            X.9uX r0 = r2.A04
            if (r0 == 0) goto L_0x001a
            int r1 = r0.A01
            r0 = 1
            if (r1 == r0) goto L_0x002e
        L_0x001a:
            java.lang.String r0 = r2.A0B
            if (r0 == 0) goto L_0x003d
            int r0 = r0.length()
            if (r0 == 0) goto L_0x003d
            X.0yC r1 = r3.A00
            r0 = 4672(0x1240, float:6.547E-42)
        L_0x0028:
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x003d
        L_0x002e:
            X.2nf r0 = X.C51342nf.ALL
            return r0
        L_0x0031:
            boolean r0 = r4 instanceof X.C181888oC
            if (r0 == 0) goto L_0x003d
            r0 = r4
            X.8oC r0 = (X.C181888oC) r0
            X.0yC r1 = r0.A00
            r0 = 2909(0xb5d, float:4.076E-42)
            goto L_0x0028
        L_0x003d:
            X.2nf r0 = X.C51342nf.NONE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200259gz.A05():X.2nf");
    }

    public String A08() {
        String str;
        if (this instanceof C181948oI) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C207219uk r2 = this.A02;
            return A01(r2, r2.A09, "\n", A0u);
        } else if (this instanceof C181918oF) {
            return A09();
        } else {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A02(A0B(), "\n", A0u2);
            C207219uk r1 = this.A02;
            C206659tl r0 = r1.A03;
            if (r0 != null) {
                str = r0.A00;
            } else {
                str = null;
            }
            A02(str, "\n", A0u2);
            return A01(r1, r1.A09, "\n", A0u2);
        }
    }

    public String A0A() {
        String str;
        C207009uP r0;
        if (this instanceof C181948oI) {
            C207219uk r5 = this.A02;
            String str2 = null;
            C207199ui r02 = r5.A01;
            if (r02 == null) {
                return null;
            }
            List list = r02.A09.A09;
            C18820ts r6 = this.A00;
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass00C.A0B(list);
            AnonymousClass000.A1L(A0L, list.size(), 0);
            String A0D = r6.A0D(R.string.f12nameremoved, A0L);
            StringBuilder A0u = AnonymousClass000.A0u();
            C207199ui r03 = r5.A01;
            if (!(r03 == null || (r0 = r03.A09) == null)) {
                str2 = r0.A01();
            }
            A02(str2, " ", A0u);
            C207199ui r1 = r5.A01;
            if (!(r1 == null || r1.A08 == null || r1.A0B == null)) {
                A02(r1.A06(r6), " ", A0u);
            }
            A02(A0D, " ", A0u);
            return A01(r5, r5.A09, " ", A0u);
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A02(A0B(), " ", A0u2);
        C207219uk r12 = this.A02;
        C206659tl r04 = r12.A03;
        if (r04 != null) {
            str = r04.A00;
        } else {
            str = null;
        }
        A02(str, " ", A0u2);
        return A01(r12, r12.A09, " ", A0u2);
    }

    public final String A0B() {
        C206659tl r0 = this.A02.A03;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public String A0C(Context context) {
        C207219uk r3;
        String str;
        C20810yC r0;
        if (this instanceof C181938oH) {
            C181938oH r1 = (C181938oH) this;
            AnonymousClass00C.A0D(context, 0);
            r3 = r1.A02;
            str = r3.A09;
            r0 = r1.A00;
        } else if (!(this instanceof C181948oI)) {
            return this.A02.A09;
        } else {
            C181948oI r12 = (C181948oI) this;
            AnonymousClass00C.A0D(context, 0);
            r3 = r12.A02;
            str = r3.A09;
            r0 = r12.A00;
        }
        return C203369nr.A04(context, r0, r3, str);
    }

    public C200259gz(C207219uk r2, AnonymousClass9IS r3) {
        this.A02 = r2;
        this.A01 = r3.A01;
        this.A00 = r3.A00;
    }

    public static AnonymousClass8SV A00(AnonymousClass8NN r1, AnonymousClass8NN r2) {
        r1.A0S();
        AnonymousClass8SV r12 = (AnonymousClass8SV) r1.A00;
        C170918Hz A0R = r2.A0R();
        A0R.getClass();
        r12.interactiveMessage_ = A0R;
        return r12;
    }

    public static String A01(C207219uk r0, CharSequence charSequence, String str, StringBuilder sb) {
        A02(charSequence, str, sb);
        A02(r0.A0A, str, sb);
        String obj = sb.toString();
        AnonymousClass00C.A08(obj);
        return obj;
    }

    public CharSequence A06(Context context, Paint paint) {
        StringBuilder A0u = AnonymousClass000.A0u();
        C207219uk r2 = this.A02;
        return A01(r2, r2.A09, "\n", A0u);
    }

    public String A09() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A02(A0B(), " ", A0u);
        C207219uk r1 = this.A02;
        C206659tl r0 = r1.A03;
        if (r0 != null) {
            str = r0.A00;
        } else {
            str = null;
        }
        A02(str, " ", A0u);
        return A01(r1, r1.A09, " ", A0u);
    }

    public String A0D(Context context) {
        int length;
        StringBuilder A0u = AnonymousClass000.A0u();
        String A0B = A0B();
        if (!(A0B == null || (length = A0B.length()) == 0)) {
            A0u.append("*");
            int i = length - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= i) {
                int i3 = i;
                if (!z) {
                    i3 = i2;
                }
                boolean A1Q = C90484aE.A1Q(AnonymousClass00C.A00(A0B.charAt(i3), 32));
                if (z) {
                    if (!A1Q) {
                        break;
                    }
                    i--;
                } else if (!A1Q) {
                    z = true;
                } else {
                    i2++;
                }
            }
            C36351kA.A1K(A0B.subSequence(i2, i + 1), A0u);
            A0u.append("*\n");
        }
        C207219uk r2 = this.A02;
        return A01(r2, r2.A09, "\n", A0u);
    }

    public String A0E(Context context) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A02(A0B(), " ", A0u);
        C207219uk r1 = this.A02;
        return A01(r1, r1.A09, " ", A0u);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0142, code lost:
        if (r1 == false) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(X.C196159Xy r11, X.AnonymousClass3T1 r12) {
        /*
            r10 = this;
            X.C36321k7.A0w(r11, r12)
            boolean r0 = r12 instanceof X.C23043B1o
            if (r0 == 0) goto L_0x013e
            r0 = r12
            X.B1o r0 = (X.C23043B1o) r0
            if (r0 == 0) goto L_0x013e
            X.9uk r0 = r0.BA8()
            if (r0 == 0) goto L_0x013e
            X.8NL r3 = r11.A00
            X.8NN r2 = X.C170918Hz.A02(r3)
            X.8SN r0 = X.C170918Hz.A0G(r2)
            X.8NN r5 = r0.A0q()
            X.8ND r5 = (X.AnonymousClass8ND) r5
            X.8Hz r0 = r2.A00
            X.8SV r0 = (X.AnonymousClass8SV) r0
            X.8Nn r0 = r0.body_
            if (r0 != 0) goto L_0x002c
            X.8Nn r0 = X.C172358Nn.DEFAULT_INSTANCE
        L_0x002c:
            X.8NN r9 = r0.A0q()
            X.8Hz r0 = r2.A00
            X.8SV r0 = (X.AnonymousClass8SV) r0
            X.8No r0 = r0.footer_
            if (r0 != 0) goto L_0x003a
            X.8No r0 = X.C172368No.DEFAULT_INSTANCE
        L_0x003a:
            X.8NN r8 = r0.A0q()
            java.lang.String r4 = r10.A0B()
            if (r4 == 0) goto L_0x0146
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0146
            X.8Hz r1 = X.C90524aI.A0H(r5)
            X.8SN r1 = (X.AnonymousClass8SN) r1
            int r0 = X.AnonymousClass8SN.DOCUMENT_MESSAGE_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.title_ = r4
            r1 = 0
        L_0x005b:
            X.9uk r4 = r10.A02
            X.9tl r7 = r4.A03
            if (r7 == 0) goto L_0x007c
            java.lang.String r6 = r7.A00
            if (r6 == 0) goto L_0x007c
            int r0 = r6.length()
            if (r0 == 0) goto L_0x007c
            X.8Hz r1 = X.C90524aI.A0H(r5)
            X.8SN r1 = (X.AnonymousClass8SN) r1
            int r0 = X.AnonymousClass8SN.DOCUMENT_MESSAGE_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.subtitle_ = r6
            r1 = 0
        L_0x007c:
            if (r7 == 0) goto L_0x0142
            byte[] r0 = r7.A02
            if (r0 == 0) goto L_0x0142
            X.8I5 r6 = X.C90474aD.A0O(r5, r0)
            X.8Hz r1 = r5.A00
            X.8SN r1 = (X.AnonymousClass8SN) r1
            int r0 = X.AnonymousClass8SN.DOCUMENT_MESSAGE_FIELD_NUMBER
            r0 = 6
            r1.mediaCase_ = r0
            r1.media_ = r6
            r5.A0U()
        L_0x0094:
            X.8Hz r1 = X.C90524aI.A0H(r2)
            X.8SV r1 = (X.AnonymousClass8SV) r1
            X.8Hz r0 = r5.A0R()
            X.8SN r0 = (X.AnonymousClass8SN) r0
            r0.getClass()
            r1.header_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
        L_0x00ab:
            java.lang.String r5 = r4.A09
            if (r5 == 0) goto L_0x00dc
            int r0 = r5.length()
            if (r0 == 0) goto L_0x00dc
            X.8Hz r1 = X.C90524aI.A0H(r9)
            X.8Nn r1 = (X.C172358Nn) r1
            int r0 = X.C172358Nn.TEXT_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.text_ = r5
            X.8Hz r1 = X.C90524aI.A0H(r2)
            X.8SV r1 = (X.AnonymousClass8SV) r1
            X.8Hz r0 = r9.A0R()
            X.8Nn r0 = (X.C172358Nn) r0
            r0.getClass()
            r1.body_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
        L_0x00dc:
            java.lang.String r4 = r4.A0A
            if (r4 == 0) goto L_0x010d
            int r0 = r4.length()
            if (r0 == 0) goto L_0x010d
            X.8Hz r1 = X.C90524aI.A0H(r8)
            X.8No r1 = (X.C172368No) r1
            int r0 = X.C172368No.TEXT_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.text_ = r4
            X.8Hz r1 = X.C90524aI.A0H(r2)
            X.8SV r1 = (X.AnonymousClass8SV) r1
            X.8Hz r0 = r8.A0R()
            X.8No r0 = (X.C172368No) r0
            r0.getClass()
            r1.footer_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
        L_0x010d:
            X.3un r5 = r11.A02
            byte[] r4 = r11.A0B
            boolean r0 = X.C202029kv.A02(r5, r12, r4)
            if (r0 == 0) goto L_0x0135
            r1 = r10
            boolean r0 = r10 instanceof X.C181898oD
            if (r0 == 0) goto L_0x013f
            X.8oD r1 = (X.C181898oD) r1
            X.9kv r0 = r1.A00
        L_0x0120:
            X.8SG r0 = X.C196159Xy.A00(r0, r11, r5, r12, r4)
            X.8Hz r1 = X.C90524aI.A0H(r2)
            X.8SV r1 = (X.AnonymousClass8SV) r1
            r0.getClass()
            r1.contextInfo_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
        L_0x0135:
            X.8Hz r0 = r2.A0R()
            X.8SV r0 = (X.AnonymousClass8SV) r0
            r3.A0a(r0)
        L_0x013e:
            return
        L_0x013f:
            X.9kv r0 = r10.A01
            goto L_0x0120
        L_0x0142:
            if (r1 != 0) goto L_0x00ab
            goto L_0x0094
        L_0x0146:
            r1 = 1
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200259gz.A0F(X.9Xy, X.3T1):void");
    }
}
