package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.TypefaceSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Y5  reason: invalid class name */
public final class AnonymousClass6Y5 {
    public static final AnonymousClass6Y5 A00 = new AnonymousClass6Y5();

    public static final C120785s4 A03(C1271967i r9, C140456lc r10, List list, boolean z) {
        C1271967i r4 = r9;
        List list2 = list;
        C36321k7.A0w(list, r9);
        AnonymousClass6Y5 r2 = A00;
        C140456lc r5 = r10;
        if (!z) {
            return A02(r9, r10, list);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder A0u = AnonymousClass000.A0u();
        ArrayList A04 = r2.A04(spannableStringBuilder, r4, r5, A0u, list2);
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            C122065uF r102 = (C122065uF) it.next();
            if (r102.A03) {
                A0I.add(r102);
            } else {
                r102.A02.A00((Layout) null, spannableStringBuilder, r102, -1, -1);
            }
        }
        return new C120785s4(spannableStringBuilder, C36381kD.A0y(A0u), A0I);
    }

    public static final void A05(Spannable spannable, C1271967i r5, String str, int i, int i2) {
        if (str != null) {
            try {
                spannable.setSpan(new AbsoluteSizeSpan((int) C90464aC.A02(r5.A00, AnonymousClass6Y7.A02(str), 2)), i, i2, 0);
            } catch (AnonymousClass5R5 e) {
                AnonymousClass6RS.A00(r5, "TextNodeUtils:TextSpan:size-parsing", "Error parsing TextSpan size", e);
            }
        }
    }

    public static final void A06(Spannable spannable, C1271967i r6, String str, String str2, int i, int i2) {
        Typeface typeface;
        if (str != null) {
            Context context = r6.A00;
            AnonymousClass00C.A08(context);
            typeface = AnonymousClass6NR.A00().A03.A00(context, str);
        } else {
            typeface = null;
        }
        if (str2 != null) {
            try {
                Context context2 = r6.A00;
                AnonymousClass00C.A08(context2);
                typeface = C109545Xz.A00(context2, typeface, str2, str);
            } catch (AnonymousClass5R5 e) {
                AnonymousClass6RS.A00(r6, "TextNodeUtils:TextSpan:text-style-parsing", "Error parsing TextSpan textStyle", e);
            }
        }
        if (typeface != null) {
            spannable.setSpan(A00(typeface), i, i2, 0);
        }
    }

    public static final MetricAffectingSpan A00(Typeface typeface) {
        if (Build.VERSION.SDK_INT >= 28) {
            return A01(typeface);
        }
        return new C91964cu(typeface);
    }

    public static final TypefaceSpan A01(Typeface typeface) {
        return new TypefaceSpan(typeface);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C120785s4 A02(X.C1271967i r22, X.C140456lc r23, java.util.List r24) {
        /*
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.util.Iterator r11 = r24.iterator()
        L_0x000d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01a2
            X.6lc r15 = X.C90514aH.A0Y(r11)
            int r5 = r3.length()
            r0 = 59
            X.6lc r0 = r15.A0W(r0)
            boolean r7 = X.AnonymousClass000.A1V(r0)
            r0 = 41
            X.6lc r2 = r15.A0W(r0)
            r1 = 38
            java.lang.String r0 = ""
            java.lang.String r4 = X.C140456lc.A0P(r15, r0, r1)
            if (r7 == 0) goto L_0x0197
            java.lang.String r4 = " "
        L_0x0037:
            r3.append(r4)
            int r2 = r3.length()
            r13 = r22
            if (r7 == 0) goto L_0x00ca
            r0 = 62
            java.lang.Object r9 = X.C140456lc.A0I(r15, r0)
            java.lang.String r9 = (java.lang.String) r9
            r0 = 61
            java.lang.Object r8 = X.C140456lc.A0I(r15, r0)
            java.lang.String r8 = (java.lang.String) r8
            r0 = 59
            X.6lc r7 = r15.A0W(r0)
            r0 = 68
            X.C140456lc.A0I(r15, r0)
            r0 = 69
            X.6lc r1 = r15.A0W(r0)
            java.lang.String r0 = X.C140456lc.A0O(r15)
            if (r0 != 0) goto L_0x006e
            r0 = 35
            X.C140456lc.A0I(r15, r0)
        L_0x006e:
            A07(r13, r7, r1, r9, r8)
        L_0x0071:
            r0 = 66
            java.lang.Object r7 = X.C140456lc.A0I(r15, r0)
            java.lang.String r7 = (java.lang.String) r7
            r0 = 67
            java.lang.Object r1 = X.C140456lc.A0I(r15, r0)
            java.lang.String r1 = (java.lang.String) r1
            r0 = 36
            X.7ku r16 = r15.A0X(r0)
            r0 = 0
            r14 = r23
            if (r16 == 0) goto L_0x009a
            X.4rF r12 = new X.4rF
            r19 = 0
            r17 = r7
            r18 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r3.setSpan(r12, r5, r2, r0)
        L_0x009a:
            r8 = 57
            X.7ku r16 = r15.A0X(r8)
            if (r16 == 0) goto L_0x00b0
            r19 = 1
            X.4rF r12 = new X.4rF
            r17 = r7
            r18 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r3.setSpan(r12, r5, r2, r0)
        L_0x00b0:
            r0 = 66
            java.lang.Object r1 = X.C140456lc.A0I(r15, r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00c5
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00c5
            r6.append(r1)
            goto L_0x000d
        L_0x00c5:
            r6.append(r4)
            goto L_0x000d
        L_0x00ca:
            r0 = 44
            X.6lc r1 = r15.A0W(r0)
            java.lang.String r0 = X.C140456lc.A0M(r15)
            if (r1 == 0) goto L_0x0181
            int r0 = X.AnonymousClass5Z8.A00(r13, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00de:
            if (r0 == 0) goto L_0x00ed
            int r0 = r0.intValue()
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            r0 = 0
            r3.setSpan(r1, r5, r2, r0)
        L_0x00ed:
            java.lang.String r0 = X.C140456lc.A0O(r15)
            A05(r3, r13, r0, r5, r2)
            java.lang.String r18 = X.C140456lc.A0J(r15)
            r0 = 43
            java.lang.Object r0 = X.C140456lc.A0I(r15, r0)
            java.lang.String r0 = (java.lang.String) r0
            r17 = r13
            r16 = r3
            r19 = r0
            r20 = r5
            r21 = r2
            A06(r16, r17, r18, r19, r20, r21)
            r0 = 45
            r1 = 0
            boolean r0 = r15.A0f(r0, r1)
            if (r0 == 0) goto L_0x011e
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r3.setSpan(r0, r5, r2, r1)
        L_0x011e:
            r0 = 52
            boolean r0 = r15.A0f(r0, r1)
            if (r0 == 0) goto L_0x012e
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r3.setSpan(r0, r5, r2, r1)
        L_0x012e:
            r0 = 56
            r1 = 0
            float r10 = r15.A0S(r0, r1)
            r0 = 54
            float r9 = r15.A0S(r0, r1)
            r0 = 55
            float r7 = r15.A0S(r0, r1)
            r0 = 53
            X.6lc r1 = r15.A0W(r0)
            r8 = 0
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x015b
            if (r1 == 0) goto L_0x017f
            int r1 = X.AnonymousClass5Z8.A01(r13, r1, r8)
        L_0x0153:
            X.4ch r0 = new X.4ch
            r0.<init>(r10, r9, r7, r1)
            r3.setSpan(r0, r5, r2, r8)
        L_0x015b:
            r1 = 49
            r0 = 1
            float r7 = r15.A0S(r1, r0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0071
            X.6NR r0 = X.AnonymousClass6NR.A00()
            android.content.Context r0 = r0.A00
            X.AnonymousClass00C.A08(r0)
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0X(r0)
            float r1 = r0.scaledDensity
            X.4cv r0 = new X.4cv
            r0.<init>(r7, r1)
            r3.setSpan(r0, r5, r2, r8)
            goto L_0x0071
        L_0x017f:
            r1 = 0
            goto L_0x0153
        L_0x0181:
            if (r0 == 0) goto L_0x00ed
            int r0 = X.AnonymousClass6Y7.A04(r0)     // Catch:{ 5R5 -> 0x018d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 5R5 -> 0x018d }
            goto L_0x00de
        L_0x018d:
            r7 = move-exception
            java.lang.String r1 = "TextNodeUtils:TextSpan:color-parsing"
            java.lang.String r0 = "Error parsing TextSpan color"
            X.AnonymousClass6RS.A00(r13, r1, r0, r7)
            goto L_0x00ed
        L_0x0197:
            if (r2 == 0) goto L_0x019d
            java.lang.String r4 = X.AnonymousClass5Z7.A00(r2)
        L_0x019d:
            X.AnonymousClass00C.A0B(r4)
            goto L_0x0037
        L_0x01a2:
            java.lang.String r2 = X.C36381kD.A0y(r6)
            X.09w r1 = X.C023409w.A00
            X.5s4 r0 = new X.5s4
            r0.<init>(r3, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Y5.A02(X.67i, X.6lc, java.util.List):X.5s4");
    }

    public static final void A07(C1271967i r7, C140456lc r8, C140456lc r9, String str, String str2) {
        String str3;
        String str4;
        if (str == null || str2 == null || r8 == null) {
            AnonymousClass6RS.A01("TextNodeUtils:ImageSpan:invalid-attributes", "Invalid image span attributes specified.");
            return;
        }
        try {
            float A01 = AnonymousClass6Y7.A01(str);
            try {
                if (AnonymousClass6Y7.A01(str2) == 0.0f || A01 == 0.0f) {
                    e = null;
                    str3 = "TextNodeUtils:ImageSpan:invalid-dimens";
                    str4 = "Invalid dimensions specified for image span";
                    AnonymousClass6RS.A00(r7, str3, str4, e);
                } else if (r9 != null) {
                    int A002 = (int) AnonymousClass6Qn.A00(r9, 42);
                    int A003 = (int) AnonymousClass6Qn.A00(r9, 40);
                    int A004 = (int) AnonymousClass6Qn.A00(r9, 41);
                    int A005 = (int) AnonymousClass6Qn.A00(r9, 35);
                    int A006 = (int) AnonymousClass6Qn.A00(r9, 36);
                    int A007 = (int) AnonymousClass6Qn.A00(r9, 38);
                    Context context = r7.A00;
                    AnonymousClass00C.A08(context);
                    if (AnonymousClass5ZC.A00(context)) {
                        if (A004 == 0) {
                            A004 = A006;
                        }
                        if (A002 == 0) {
                            A002 = A007;
                        }
                        new Rect(A004, A003, A002, A005);
                        return;
                    }
                    if (A002 == 0) {
                        A002 = A006;
                    }
                    if (A004 == 0) {
                        A004 = A007;
                    }
                    new Rect(A002, A003, A004, A005);
                } else {
                    new Rect();
                }
            } catch (AnonymousClass5R5 e) {
                e = e;
                str3 = "TextNodeUtils:ImageSpan:img-height-parsing";
                str4 = "Error parsing image height";
            }
        } catch (AnonymousClass5R5 e2) {
            e = e2;
            str3 = "TextNodeUtils:ImageSpan:img-width-parsing";
            str4 = "Error parsing image width";
        }
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.ArrayList A04(android.text.SpannableStringBuilder r26, X.C1271967i r27, X.C140456lc r28, java.lang.StringBuilder r29, java.util.List r30) {
        /*
            r25 = this;
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r14 = r30.iterator()
        L_0x0008:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0142
            X.6lc r4 = X.C90514aH.A0Y(r14)
            int r3 = r4.A04
            r0 = 16887(0x41f7, float:2.3664E-41)
            r16 = r27
            r18 = r28
            r11 = r26
            r7 = r29
            if (r3 != r0) goto L_0x0083
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()
            java.lang.String r13 = X.C140456lc.A0J(r4)
            r0 = 36
            java.util.List r24 = r4.A0d(r0)
            X.AnonymousClass00C.A08(r24)
            int r8 = r11.length()
            r19 = r25
            r20 = r11
            r21 = r16
            r22 = r18
            r23 = r9
            java.util.ArrayList r10 = r19.A04(r20, r21, r22, r23, r24)
            int r11 = r11.length()
            r0 = 38
            java.util.List r0 = r4.A0d(r0)
            java.util.Iterator r12 = X.C90514aH.A14(r0)
        L_0x0055:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0132
            X.6lc r3 = X.C90514aH.A0Y(r12)
            r23 = 0
            int r2 = r3.A04
            r0 = 16891(0x41fb, float:2.367E-41)
            r1 = 1
            if (r2 == r0) goto L_0x0069
            r1 = 0
        L_0x0069:
            X.64u r15 = new X.64u
            r24 = r1
            r21 = r8
            r22 = r11
            r19 = r3
            r20 = r2
            r17 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.5uF r0 = new X.5uF
            r0.<init>(r15, r8, r11, r1)
            r6.add(r0)
            goto L_0x0055
        L_0x0083:
            r0 = 16898(0x4202, float:2.3679E-41)
            if (r3 != r0) goto L_0x0129
            r10 = 1
            r2 = 0
        L_0x0089:
            java.lang.String r1 = ""
            if (r10 == 0) goto L_0x0118
            java.lang.String r6 = " "
        L_0x008f:
            int r9 = r11.length()
            r11.append(r6)
            int r8 = r11.length()
            r0 = 35
            if (r10 == 0) goto L_0x00a0
            r0 = 44
        L_0x00a0:
            java.lang.Object r1 = X.C140456lc.A0I(r4, r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00af
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00af
            r6 = r1
        L_0x00af:
            r0 = 36
            if (r10 == 0) goto L_0x00b5
            r0 = 43
        L_0x00b5:
            java.util.List r2 = r4.A0d(r0)
            X.AnonymousClass00C.A08(r2)
            r7.append(r6)
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            if (r10 == 0) goto L_0x00e6
            r23 = 1
            r0 = 16891(0x41fb, float:2.367E-41)
            r1 = 1
            if (r3 == r0) goto L_0x00cd
            r1 = 0
        L_0x00cd:
            X.64u r15 = new X.64u
            r19 = r4
            r24 = r1
            r21 = r9
            r22 = r8
            r20 = r3
            r17 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.5uF r0 = new X.5uF
            r0.<init>(r15, r9, r8, r1)
            r6.add(r0)
        L_0x00e6:
            java.util.Iterator r7 = r2.iterator()
        L_0x00ea:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x013d
            X.6lc r3 = X.C90514aH.A0Y(r7)
            r23 = 0
            int r2 = r3.A04
            r0 = 16891(0x41fb, float:2.367E-41)
            r1 = 1
            if (r2 == r0) goto L_0x00fe
            r1 = 0
        L_0x00fe:
            X.64u r15 = new X.64u
            r24 = r1
            r21 = r9
            r22 = r8
            r19 = r3
            r20 = r2
            r17 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.5uF r0 = new X.5uF
            r0.<init>(r15, r9, r8, r1)
            r6.add(r0)
            goto L_0x00ea
        L_0x0118:
            r0 = 38
            java.lang.String r6 = X.C140456lc.A0P(r4, r1, r0)
            if (r2 == 0) goto L_0x0124
            java.lang.String r6 = X.AnonymousClass5Z7.A00(r2)
        L_0x0124:
            X.AnonymousClass00C.A0B(r6)
            goto L_0x008f
        L_0x0129:
            r10 = 0
            r0 = 40
            X.6lc r2 = r4.A0W(r0)
            goto L_0x0089
        L_0x0132:
            r6.addAll(r10)
            if (r13 == 0) goto L_0x0138
            r9 = r13
        L_0x0138:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r7.append(r9)
        L_0x013d:
            r5.addAll(r6)
            goto L_0x0008
        L_0x0142:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Y5.A04(android.text.SpannableStringBuilder, X.67i, X.6lc, java.lang.StringBuilder, java.util.List):java.util.ArrayList");
    }
}
