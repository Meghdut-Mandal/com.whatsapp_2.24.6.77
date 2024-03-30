package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2LE  reason: invalid class name */
public class AnonymousClass2LE extends C81843xi {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final Paint A03;
    public final C21060yb A04;
    public final C18820ts A05;
    public final AnonymousClass1H2 A06;
    public final C19890wg A07;
    public final CharSequence A08;
    public final List A09;

    public AnonymousClass2LE(Context context, Paint paint, C21060yb r3, C18820ts r4, AnonymousClass1H2 r5, C19890wg r6, CharSequence charSequence, List list, int i, int i2) {
        this.A02 = context;
        this.A03 = paint;
        this.A01 = i;
        this.A00 = i2;
        this.A08 = charSequence;
        this.A09 = list;
        this.A06 = r5;
        this.A04 = r3;
        this.A05 = r4;
        this.A07 = r6;
    }

    public static List A00(BreakIterator breakIterator, List list, int i, int i2) {
        if (list.size() == 0) {
            return list;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        int min = Math.min(list.size(), 5);
        for (int i3 = 0; i3 < min; i3++) {
            AnonymousClass00I r1 = (AnonymousClass00I) list.get(i3);
            Number number = (Number) r1.A00;
            C18740tg.A06(number);
            Number number2 = (Number) r1.A01;
            C18740tg.A06(number2);
            int max = Math.max(0, breakIterator.preceding(AnonymousClass001.A02(number.intValue(), i, 0)));
            int following = breakIterator.following(Math.min(i2, number2.intValue() + i)) - 1;
            if (following < 0) {
                following = i2;
            }
            AnonymousClass00I A0W = C36441kJ.A0W(Integer.valueOf(max), Integer.valueOf(following));
            if (A0I.size() != 0) {
                int size = A0I.size() - 1;
                AnonymousClass00I r10 = (AnonymousClass00I) A0I.get(size);
                Object obj = A0W.A00;
                C18740tg.A06(obj);
                int A0I2 = AnonymousClass000.A0I(obj);
                Object obj2 = A0W.A01;
                C18740tg.A06(obj2);
                int A0I3 = AnonymousClass000.A0I(obj2);
                Object obj3 = r10.A00;
                C18740tg.A06(obj3);
                int A0I4 = AnonymousClass000.A0I(obj3);
                Object obj4 = r10.A01;
                C18740tg.A06(obj4);
                int A0I5 = AnonymousClass000.A0I(obj4);
                if ((A0I2 <= A0I4 && A0I4 <= A0I3) || (A0I4 <= A0I2 && A0I2 <= A0I5)) {
                    int min2 = Math.min(A0I2, A0I4);
                    int max2 = Math.max(A0I3, A0I5);
                    A0I.remove(size);
                    A0W = C36441kJ.A0W(Integer.valueOf(min2), Integer.valueOf(max2));
                }
            }
            A0I.add(A0W);
        }
        return A0I;
    }

    public static void A01(SpannableStringBuilder spannableStringBuilder, AnonymousClass2LE r9, CharSequence charSequence, List list) {
        long length = (long) (charSequence.length() - 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass00I r6 = (AnonymousClass00I) it.next();
            r9.A00.A04();
            Object obj = r6.A00;
            if (!(obj == null || AnonymousClass000.A0I(obj) == 0)) {
                if (spannableStringBuilder.length() == 0) {
                    spannableStringBuilder.append(" ");
                    spannableStringBuilder.append("…");
                } else if (!"…".equals(String.valueOf(spannableStringBuilder.charAt(spannableStringBuilder.length() - 1)))) {
                    if (!Character.isWhitespace(spannableStringBuilder.charAt(spannableStringBuilder.length() - 1))) {
                        spannableStringBuilder.append(" ");
                    }
                    spannableStringBuilder.append("…");
                    spannableStringBuilder.append(" ");
                }
            }
            C18740tg.A06(obj);
            int A0I = AnonymousClass000.A0I(obj);
            Number number = (Number) r6.A01;
            C18740tg.A06(number);
            spannableStringBuilder.append(charSequence.subSequence(A0I, number.intValue()));
            if (((long) number.intValue()) < length) {
                spannableStringBuilder.append(" ");
                spannableStringBuilder.append("…");
            }
        }
    }
}
