package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import com.whatsapp.R;

/* renamed from: X.0xZ  reason: invalid class name and case insensitive filesystem */
public final class C20440xZ implements AnonymousClass00M {
    public final AnonymousClass1T1 A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass171 A02;
    public final C19630wG A03;
    public final C28371Sj A04;
    public final C21060yb A05;
    public final C18820ts A06;
    public final C20810yC A07;
    public final AnonymousClass1FR A08;
    public final C19890wg A09;
    public final AnonymousClass1AW A0A;
    public final AnonymousClass1EM A0B;
    public final AnonymousClass005 A0C;

    public C20440xZ(AnonymousClass1T1 r2, AnonymousClass16D r3, AnonymousClass171 r4, C21060yb r5, C19630wG r6, C18820ts r7, C20810yC r8, C28371Sj r9, AnonymousClass1FR r10, C19890wg r11, AnonymousClass1AW r12, AnonymousClass1EM r13, AnonymousClass005 r14) {
        AnonymousClass00C.A0D(r8, 1);
        AnonymousClass00C.A0D(r9, 2);
        AnonymousClass00C.A0D(r6, 3);
        AnonymousClass00C.A0D(r10, 4);
        AnonymousClass00C.A0D(r3, 5);
        AnonymousClass00C.A0D(r13, 6);
        AnonymousClass00C.A0D(r5, 7);
        AnonymousClass00C.A0D(r7, 8);
        AnonymousClass00C.A0D(r4, 9);
        AnonymousClass00C.A0D(r14, 10);
        AnonymousClass00C.A0D(r11, 11);
        AnonymousClass00C.A0D(r2, 12);
        AnonymousClass00C.A0D(r12, 13);
        this.A07 = r8;
        this.A04 = r9;
        this.A03 = r6;
        this.A08 = r10;
        this.A01 = r3;
        this.A0B = r13;
        this.A05 = r5;
        this.A06 = r7;
        this.A02 = r4;
        this.A0C = r14;
        this.A09 = r11;
        this.A00 = r2;
        this.A0A = r12;
    }

    private final CharSequence A01(Context context, Paint paint, AnonymousClass3T1 r13, CharSequence charSequence) {
        CharSequence charSequence2;
        Paint paint2 = paint;
        if (!C20800yB.A01(C21000yV.A01, this.A07, 4093) || !(paint instanceof TextPaint)) {
            C28371Sj r2 = this.A04;
            CharSequence A082 = AnonymousClass6YV.A08(this.A05, this.A09, charSequence);
            if (A082 != null) {
                CharSequence A012 = r2.A01(context, r13, A082);
                AnonymousClass00C.A08(A012);
                return A012;
            }
            throw new IllegalStateException("Required value was null.");
        }
        int A002 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        int A003 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        CharSequence A013 = this.A04.A01(context, r13, charSequence);
        AnonymousClass00C.A08(A013);
        Pair A052 = AnonymousClass6YV.A05((TextPaint) paint2, this.A05, this.A09, A013, A002, A003, false);
        if (A052 == null || (charSequence2 = (CharSequence) A052.first) == null) {
            return A013;
        }
        return charSequence2;
    }

    public CharSequence A02(Context context, Paint paint, AnonymousClass3T1 r11) {
        String string;
        AnonymousClass2bU r1 = (AnonymousClass2bU) r11;
        boolean z = false;
        if (r1.A09 == 1) {
            z = true;
        }
        int i = r1.A0B;
        C19630wG r0 = this.A03;
        if (i == 0) {
            Context context2 = r0.A00;
            int i2 = R.string.f12nameremoved;
            if (z) {
                i2 = R.string.f12nameremoved;
            }
            string = context2.getString(i2);
        } else {
            Context context3 = r0.A00;
            int i3 = R.string.f12nameremoved;
            if (z) {
                i3 = R.string.f12nameremoved;
            }
            string = context3.getString(i3, new Object[]{AnonymousClass3UY.A07(this.A06, (long) i)});
        }
        AnonymousClass00C.A0B(string);
        int i4 = r11.A09;
        int i5 = R.drawable.msg_status_audio;
        if (i4 == 1) {
            i5 = R.drawable.msg_status_mic;
        }
        CharSequence A022 = C37351mE.A02(paint, AnonymousClass3UF.A02(context, i5, R.color.f6nameremoved), string);
        AnonymousClass00C.A08(A022);
        return A022;
    }

    public CharSequence A03(Context context, Paint paint, AnonymousClass3T1 r7) {
        C106265Iz r72 = (C106265Iz) r7;
        Object obj = this.A0C.get();
        if (obj != null) {
            AnonymousClass6X4 r2 = (AnonymousClass6X4) obj;
            CharSequence A022 = C37351mE.A02(paint, r2.A05(context, r72, false), context.getString(r2.A04(r72)));
            AnonymousClass00C.A08(A022);
            return A022;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r3 != null) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence A06(android.content.Context r9, android.graphics.Paint r10, X.AnonymousClass3T1 r11) {
        /*
            r8 = this;
            r4 = r11
            X.2by r4 = (X.C46972by) r4
            java.lang.String r3 = r4.A01
            java.lang.String r2 = ""
            if (r3 != 0) goto L_0x000a
            r3 = r2
        L_0x000a:
            int r1 = r4.A09
            r0 = 7
            if (r1 != r0) goto L_0x0055
            X.0ts r7 = r8.A06
            boolean r0 = X.C131806Qs.A02(r4)
            if (r0 == 0) goto L_0x00ae
            int r6 = X.AnonymousClass3RN.A00(r4)
            r2 = 1
            if (r6 != r2) goto L_0x0043
            java.lang.String r3 = r4.A1b()
            if (r3 != 0) goto L_0x002b
            r0 = 2131888236(0x7f12086c, float:1.9411102E38)
            java.lang.String r3 = r9.getString(r0)
        L_0x002b:
            r1 = 2131233224(0x7f0809c8, float:1.808258E38)
        L_0x002e:
            if (r3 == 0) goto L_0x00ae
        L_0x0030:
            r0 = 2131101697(0x7f060801, float:1.781581E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A02(r9, r1, r0)
            java.lang.CharSequence r0 = X.C37351mE.A02(r10, r0, r3)
            X.AnonymousClass00C.A08(r0)
            java.lang.CharSequence r0 = r8.A01(r9, r10, r11, r0)
            return r0
        L_0x0043:
            r5 = 2131755212(0x7f1000cc, float:1.9141297E38)
            long r0 = (long) r6
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r4[r3] = r2
            java.lang.String r3 = r7.A0L(r4, r5, r0)
            goto L_0x002b
        L_0x0055:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x005f
            r1 = 2131233227(0x7f0809cb, float:1.8082586E38)
            goto L_0x0030
        L_0x005f:
            java.lang.String r3 = X.C202359le.A00(r11)
            if (r3 != 0) goto L_0x0066
            r3 = r2
        L_0x0066:
            java.lang.String r0 = r4.A1b()
            if (r0 == 0) goto L_0x006d
            r2 = r0
        L_0x006d:
            int r0 = r3.length()
            if (r0 > 0) goto L_0x0085
            r3 = r2
            int r0 = r2.length()
            if (r0 != 0) goto L_0x0085
            X.0wG r0 = r8.A03
            android.content.Context r1 = r0.A00
            r0 = 2131888476(0x7f12095c, float:1.9411588E38)
            java.lang.String r3 = r1.getString(r0)
        L_0x0085:
            int r2 = r4.A00
            if (r2 == 0) goto L_0x00aa
            X.0ts r1 = r8.A06
            java.lang.String r0 = r4.A05
            java.lang.String r2 = X.C25571Gv.A03(r1, r0, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r0 = " ("
            r1.append(r0)
            r1.append(r2)
            r0 = 41
            r1.append(r0)
            java.lang.String r3 = r1.toString()
        L_0x00aa:
            r1 = 2131233227(0x7f0809cb, float:1.8082586E38)
            goto L_0x002e
        L_0x00ae:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20440xZ.A06(android.content.Context, android.graphics.Paint, X.3T1):java.lang.CharSequence");
    }

    public CharSequence A0A(Context context, Paint paint, AnonymousClass3T1 r7) {
        AnonymousClass2bU r2 = (AnonymousClass2bU) r7;
        String A002 = C202359le.A00(r7);
        String str = "";
        if (A002 == null) {
            A002 = str;
        }
        String A1a = r2.A1a();
        if (A1a != null) {
            str = A1a;
        }
        if (A002.length() <= 0) {
            if (str.length() == 0 || C202359le.A04(r7)) {
                A002 = this.A03.A00.getString(R.string.f12nameremoved);
                AnonymousClass00C.A0B(A002);
            } else {
                A002 = str;
            }
        }
        CharSequence A022 = C37351mE.A02(paint, AnonymousClass3UF.A02(context, R.drawable.msg_status_image, R.color.f6nameremoved), A002);
        AnonymousClass00C.A08(A022);
        return A01(context, paint, r2, A022);
    }

    public CharSequence A0B(Context context, Paint paint, AnonymousClass3T1 r6) {
        C200259gz A012 = this.A0A.A01((C23043B1o) r6);
        if (A012 != null) {
            CharSequence A082 = AnonymousClass6YV.A08(this.A05, this.A09, A012.A07(context, paint));
            if (A082 == null) {
                A082 = "";
            }
            return A01(context, paint, r6, A082);
        }
        String string = this.A03.A00.getString(R.string.f12nameremoved);
        AnonymousClass00C.A08(string);
        return string;
    }

    public CharSequence A0C(Context context, Paint paint, AnonymousClass3T1 r8) {
        String str;
        C207149ud r4 = ((AnonymousClass2cT) r8).A00;
        if (r4 == null || AnonymousClass90O.EXTENSIONS_1 != r4.A00) {
            String A0b = r8.A0b();
            if (A0b != null) {
                return A01(context, paint, r8, A0b);
            }
            throw new IllegalStateException("Required value was null.");
        }
        String str2 = r4.A02;
        if (str2 == null || str2.length() == 0) {
            str = r4.A04;
            AnonymousClass00C.A0B(str);
            AnonymousClass00C.A0B(str);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("\n     ");
            sb.append(r4.A04);
            sb.append("\n     ");
            sb.append(str2);
            sb.append("\n     ");
            str = AnonymousClass091.A01(sb.toString());
        }
        return C174778Yk.A0B(context, paint, str, C18820ts.A00(this.A06).A06);
    }

    public CharSequence A0I(Context context, Paint paint, AnonymousClass3T1 r10) {
        String obj;
        AnonymousClass2bU r102 = (AnonymousClass2bU) r10;
        Context context2 = this.A03.A00;
        Object[] objArr = new Object[1];
        if (r102.A0B <= 0) {
            obj = "";
        } else {
            String A072 = AnonymousClass3UY.A07(this.A06, (long) r102.A0B);
            AnonymousClass00C.A08(A072);
            StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(A072);
            sb.append(')');
            obj = sb.toString();
        }
        objArr[0] = obj;
        String string = context2.getString(R.string.f12nameremoved, objArr);
        AnonymousClass00C.A08(string);
        CharSequence A022 = C37351mE.A02(paint, AnonymousClass3UF.A02(context, R.drawable.msg_status_video, R.color.f6nameremoved), string);
        AnonymousClass00C.A08(A022);
        return A022;
    }

    public CharSequence A0K(Context context, Paint paint, AnonymousClass3T1 r5) {
        C88854Uh r1 = (C88854Uh) r5;
        int A002 = C53932s8.A00(r1);
        CharSequence BGO = r1.BGO();
        AnonymousClass00C.A08(BGO);
        if (A002 != 0) {
            Drawable A003 = AnonymousClass00E.A00(context, A002);
            if (A003 != null) {
                BGO = C37351mE.A02(paint, A003, BGO);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        AnonymousClass00C.A0B(BGO);
        return A01(context, paint, r5, BGO);
    }

    public CharSequence A0L(Context context, Paint paint, AnonymousClass3T1 r9) {
        CharSequence A012;
        Context context2;
        int i;
        String A0b = r9.A0b();
        String str = "";
        if (A0b == null) {
            A0b = str;
        }
        C202319lY r2 = r9.A0M;
        if (r2 != null || "UNSET".equals(r9.A0t)) {
            if (A0b.length() == 0) {
                if (r2 == null || !r2.A0K()) {
                    context2 = this.A03.A00;
                    i = R.string.f12nameremoved;
                } else {
                    context2 = this.A03.A00;
                    i = R.string.f12nameremoved;
                }
                A012 = context2.getString(i);
                AnonymousClass00C.A0B(A012);
            } else {
                A012 = A01(context, paint, r9, A0b);
            }
            C202319lY r22 = r9.A0M;
            if (r22 == null || AnonymousClass00C.A0J(r22.A03(), AnonymousClass16W.A06)) {
                return A012;
            }
            CharSequence A013 = AnonymousClass1FR.A01(context, r22);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A013);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.f6nameremoved)), 0, A013.length(), 0);
            spannableStringBuilder.append(" ");
            spannableStringBuilder.append(A012);
            return spannableStringBuilder;
        } else if (!C202359le.A04(r9)) {
            return A01(context, paint, r9, A0b);
        } else {
            String A002 = C202359le.A00(r9);
            if (A002 != null) {
                str = A002;
            }
            if (A0b.length() != 0) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                sb2.append('*');
                sb2.append(A0b);
                sb2.append('*');
                sb.append(sb2.toString());
                sb.append(10);
                sb.append(str);
                str = sb.toString();
            }
            return A01(context, paint, r9, str);
        }
    }

    public CharSequence A0M(Context context, Paint paint, AnonymousClass3T1 r8) {
        AnonymousClass2bU r2 = (AnonymousClass2bU) r8;
        String A1a = r2.A1a();
        String str = "";
        if (A1a == null) {
            A1a = str;
        }
        String A002 = C202359le.A00(r8);
        if (A002 != null) {
            str = A002;
        }
        if (str.length() > 0) {
            A1a = str;
        } else if (A1a.length() == 0 || C202359le.A04(r8)) {
            A1a = this.A03.A00.getString(R.string.f12nameremoved);
            AnonymousClass00C.A0B(A1a);
        }
        if (r2.A0B != 0) {
            String A072 = AnonymousClass3UY.A07(this.A06, (long) r2.A0B);
            AnonymousClass00C.A08(A072);
            StringBuilder sb = new StringBuilder();
            sb.append(A1a);
            sb.append(" (");
            sb.append(A072);
            sb.append(')');
            A1a = sb.toString();
        }
        CharSequence A022 = C37351mE.A02(paint, AnonymousClass3UF.A02(context, R.drawable.msg_status_video, R.color.f6nameremoved), A1a);
        AnonymousClass00C.A08(A022);
        return A01(context, paint, r2, A022);
    }

    public String A0N(Context context, AnonymousClass3T1 r8) {
        AnonymousClass1FR r4 = this.A08;
        C64933Qa r0 = r8.A1J;
        boolean z = r0.A02;
        AnonymousClass11F r2 = r0.A00;
        if (r2 != null) {
            String A0M = r4.A02.A0M(r4.A01.A0D(r2));
            if (r4.A08.A03()) {
                r4.A09.A05().BFa();
            }
            int i = R.string.f12nameremoved;
            if (z) {
                i = R.string.f12nameremoved;
            }
            String string = context.getString(i, new Object[]{A0M});
            AnonymousClass00C.A07(string);
            return string;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public CharSequence A04(Context context, Paint paint, AnonymousClass3T1 r11) {
        String str;
        C18820ts r7 = this.A06;
        int size = ((AnonymousClass2bW) r11).A1X().size();
        if (size > 0) {
            str = r7.A0L(new Object[]{Integer.valueOf(size)}, R.plurals.f10nameremoved, (long) size);
        } else {
            str = "";
        }
        AnonymousClass00C.A08(str);
        CharSequence A022 = C37351mE.A02(paint, AnonymousClass3UF.A02(context, R.drawable.msg_status_contact, R.color.f6nameremoved), str);
        AnonymousClass00C.A08(A022);
        return A022;
    }

    public CharSequence A05(Context context, Paint paint, AnonymousClass3T1 r7) {
        String string = this.A03.A00.getString(R.string.f12nameremoved);
        AnonymousClass00C.A08(string);
        String str = ((AnonymousClass2bX) r7).A00;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        if (str2.length() > 0) {
            String A0C2 = AnonymousClass14B.A0C(str, 128);
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(": ");
            sb.append(A0C2);
            string = sb.toString();
        }
        CharSequence A022 = C37351mE.A02(paint, AnonymousClass3UF.A02(context, R.drawable.msg_status_contact, R.color.f6nameremoved), string);
        AnonymousClass00C.A08(A022);
        return A022;
    }

    public CharSequence A07(Context context, Paint paint, AnonymousClass3T1 r6) {
        String str;
        AnonymousClass2bT r62;
        if (!(r6 instanceof AnonymousClass2bT) || (r62 = (AnonymousClass2bT) r6) == null || (str = r62.A05) == null) {
            str = "";
        }
        CharSequence A022 = C37351mE.A02(paint, AnonymousClass3UF.A02(context, R.drawable.vec_ic_calendar, R.color.f6nameremoved), str);
        AnonymousClass00C.A08(A022);
        return A022;
    }

    public CharSequence A08(Context context, Paint paint, AnonymousClass3T1 r6) {
        AnonymousClass2bU r62 = (AnonymousClass2bU) r6;
        String A1a = r62.A1a();
        if (A1a == null) {
            A1a = "";
        }
        if (A1a.length() == 0) {
            String string = this.A03.A00.getString(R.string.f12nameremoved);
            AnonymousClass00C.A08(string);
            CharSequence A082 = AnonymousClass6YV.A08(this.A05, this.A09, string);
            if (A082 != null) {
                CharSequence A022 = C37351mE.A02(paint, AnonymousClass3UF.A02(context, R.drawable.msg_status_gif, R.color.f6nameremoved), A082);
                AnonymousClass00C.A08(A022);
                return A022;
            }
            throw new IllegalStateException("Required value was null.");
        }
        CharSequence A023 = C37351mE.A02(paint, AnonymousClass3UF.A02(context, R.drawable.msg_status_gif, R.color.f6nameremoved), A1a);
        AnonymousClass00C.A08(A023);
        return A01(context, paint, r62, A023);
    }

    public CharSequence A09(Context context, Paint paint, AnonymousClass3T1 r6) {
        AnonymousClass2bQ r62 = (AnonymousClass2bQ) r6;
        String str = r62.A04;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            Context context2 = this.A03.A00;
            boolean A032 = this.A0B.A03(r62.A00);
            int i = R.string.f12nameremoved;
            if (A032) {
                i = R.string.f12nameremoved;
            }
            str = context2.getString(i);
        }
        AnonymousClass00C.A0B(str);
        CharSequence A022 = C37351mE.A02(paint, AnonymousClass3UF.A02(context, R.drawable.msg_status_invite, R.color.f6nameremoved), str);
        AnonymousClass00C.A08(A022);
        return A022;
    }

    public CharSequence A0D(Context context, Paint paint, AnonymousClass3T1 r6) {
        String str;
        C46902br r0;
        if (!(r6 instanceof C46902br) || (r0 = (C46902br) r6) == null || (str = r0.A03) == null) {
            str = "";
        }
        if (str.length() == 0) {
            String string = this.A03.A00.getString(R.string.f12nameremoved);
            AnonymousClass00C.A08(string);
            CharSequence A022 = C37351mE.A02(paint, AnonymousClass3UF.A02(context, R.drawable.ic_quoted_live_location, R.color.f6nameremoved), string);
            AnonymousClass00C.A08(A022);
            return A022;
        }
        CharSequence A023 = C37351mE.A02(paint, AnonymousClass3UF.A02(context, R.drawable.ic_quoted_live_location, R.color.f6nameremoved), str);
        AnonymousClass00C.A08(A023);
        return A01(context, paint, r6, A023);
    }

    public CharSequence A0E(Context context, Paint paint, AnonymousClass3T1 r6) {
        String str = ((AnonymousClass2bP) r6).A02;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            str = this.A03.A00.getString(R.string.f12nameremoved);
        }
        AnonymousClass00C.A0B(str);
        CharSequence A022 = C37351mE.A02(paint, AnonymousClass3UF.A02(context, R.drawable.vec_ic_newsletter, R.color.f6nameremoved), str);
        AnonymousClass00C.A08(A022);
        return A022;
    }

    public CharSequence A0F(Context context, Paint paint, AnonymousClass3T1 r6) {
        String A032 = C65853Ts.A03(this.A06, (C46952bw) r6);
        AnonymousClass00C.A08(A032);
        CharSequence A022 = C37351mE.A02(paint, AnonymousClass3UF.A02(context, R.drawable.msg_status_order, R.color.f6nameremoved), A032);
        AnonymousClass00C.A08(A022);
        return A022;
    }

    public CharSequence A0G(Context context, Paint paint, AnonymousClass3T1 r7) {
        String str;
        AnonymousClass2bS r72;
        if (!(r7 instanceof AnonymousClass2bS) || (r72 = (AnonymousClass2bS) r7) == null || (str = r72.A03) == null) {
            str = "";
        }
        boolean A012 = C20800yB.A01(C21000yV.A02, this.A07, 3223);
        int i = R.drawable.msg_status_poll;
        if (A012) {
            i = R.drawable.msg_status_poll_v2;
        }
        CharSequence A022 = C37351mE.A02(paint, AnonymousClass3UF.A02(context, i, R.color.f6nameremoved), str);
        AnonymousClass00C.A08(A022);
        return A022;
    }

    public CharSequence A0H(Context context, Paint paint, AnonymousClass3T1 r6) {
        String str = ((C46852bm) r6).A09;
        if (str == null) {
            str = "";
        }
        CharSequence A022 = C37351mE.A02(paint, AnonymousClass3UF.A02(context, R.drawable.msg_status_product, R.color.f6nameremoved), str);
        AnonymousClass00C.A08(A022);
        return A022;
    }

    public static final CharSequence A00(Context context, Paint paint, int i) {
        CharSequence A022 = C37351mE.A02(paint, AnonymousClass3UF.A02(context, R.drawable.ic_viewonce, R.color.f6nameremoved), context.getString(i));
        AnonymousClass00C.A08(A022);
        return A022;
    }

    public CharSequence A0J(Context context, Paint paint, AnonymousClass3T1 r6) {
        C46912bs r0;
        String str;
        String A002 = C202359le.A00(r6);
        String str2 = "";
        if (A002 == null) {
            A002 = str2;
        }
        if (!(!(r6 instanceof C46912bs) || (r0 = (C46912bs) r6) == null || (str = r0.A01) == null)) {
            str2 = str;
        }
        if (A002.length() <= 0) {
            A002 = str2;
            if (str2.length() == 0) {
                A002 = this.A03.A00.getString(R.string.f12nameremoved);
            }
        }
        CharSequence A022 = C37351mE.A02(paint, AnonymousClass3UF.A02(context, R.drawable.msg_status_location, R.color.f6nameremoved), A002);
        AnonymousClass00C.A08(A022);
        return A01(context, paint, r6, A022);
    }
}
