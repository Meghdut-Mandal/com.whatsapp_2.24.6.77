package X;

import android.content.Context;
import android.net.Uri;
import android.text.Editable;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6YV  reason: invalid class name */
public abstract class AnonymousClass6YV {
    public static SpannableStringBuilder A01(CharSequence charSequence, float f, int i, int i2, boolean z) {
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        List list = (List) A06(charSequence, i2, false).first;
        A0K(valueOf, A0D((TextPaint) null, charSequence2, list, f, i2, -16777216, false));
        A0L(valueOf, list, i, z);
        return valueOf;
    }

    public static Pair A05(TextPaint textPaint, C21060yb r12, C19890wg r13, CharSequence charSequence, int i, int i2, boolean z) {
        boolean z2;
        int i3;
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            return null;
        }
        int A01 = AnonymousClass1K2.A01(r12, r13);
        int i4 = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        if (A01 < 2011) {
            i4 = 512;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        TextPaint textPaint2 = textPaint;
        float textSize = textPaint.getTextSize();
        Pair A06 = A06(charSequence2, i4, true);
        List<AnonymousClass6L9> list = (List) A06.first;
        List list2 = (List) A06.second;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((AnonymousClass6L9) it.next()).A02 == 6) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        boolean valueOf2 = Boolean.valueOf(z2);
        if (list2.size() > 0) {
            ArrayList A0D = A0D(textPaint2, charSequence2, list, textSize, i4, i, true);
            if (A0D.size() > 0) {
                valueOf2 = true;
            }
            A0K(valueOf, A0D);
        }
        ArrayList A0I = AnonymousClass001.A0I();
        for (AnonymousClass6L9 r3 : list) {
            if (r3.A02 == 6) {
                if (z) {
                    A0H(valueOf, r3, -16777216);
                }
                A0I.add(r3);
            } else {
                if (z) {
                    A0H(valueOf, r3, -16777216);
                } else {
                    A0I(valueOf, r3, list);
                }
                valueOf.setSpan(r3.A04, r3.A00, r3.A01, 17);
            }
        }
        Iterator it2 = A0I.iterator();
        while (it2.hasNext()) {
            AnonymousClass6L9 r7 = (AnonymousClass6L9) it2.next();
            valueOf.setSpan(r7.A04, r7.A00, r7.A01, 17);
            if (!z) {
                int i5 = r7.A00;
                int i6 = r7.A03;
                String str = C19430v1.A08;
                valueOf.replace(i5 - i6, i5, str);
                int i7 = r7.A01;
                valueOf.replace(i7, i7 + i6, str);
                i3 = 1;
            } else {
                i3 = 0;
            }
            valueOf.setSpan(new BackgroundColorSpan(i2), r7.A00 - i3, r7.A01 + i3, 17);
        }
        return C36441kJ.A0Q(valueOf, valueOf2);
    }

    public static CharSequence A08(C21060yb r2, C19890wg r3, CharSequence charSequence) {
        return A09(r2, r3, charSequence, -16777216, false);
    }

    public static void A0J(Editable editable, Class cls, int i) {
        Object[] spans = editable.getSpans(0, i, cls);
        if (spans != null) {
            for (Object removeSpan : spans) {
                editable.removeSpan(removeSpan);
            }
        }
    }

    public static CharSequence A09(C21060yb r1, C19890wg r2, CharSequence charSequence, int i, boolean z) {
        if (charSequence == null) {
            return null;
        }
        int A01 = AnonymousClass1K2.A01(r1, r2);
        int i2 = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        if (A01 < 2011) {
            i2 = 512;
        }
        List list = (List) A06(charSequence, i2, false).first;
        if (list.isEmpty()) {
            return charSequence;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        A0L(valueOf, list, i, z);
        return valueOf;
    }

    public static CharSequence A0A(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        List<AnonymousClass6L9> list = (List) A06(charSequence, 150, false).first;
        if (list.isEmpty()) {
            return charSequence;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        for (AnonymousClass6L9 r4 : list) {
            int i = r4.A00;
            int i2 = r4.A03;
            valueOf.replace(i - i2, i, "");
            A0O(list, r4.A00 - i2, i2);
            int i3 = r4.A01;
            valueOf.replace(i3, i3 + i2, "");
            A0O(list, r4.A01, i2);
        }
        return valueOf;
    }

    public static String A0B(String str, boolean z) {
        if (str == null) {
            return "";
        }
        if (str.contains("⠀")) {
            str = str.replace("⠀", " ");
        }
        String trim = str.trim();
        if (!z || !AnonymousClass6YG.A06() || !trim.contains("­")) {
            return trim;
        }
        return trim.replace("­", "");
    }

    public static ArrayList A0C(Spannable spannable) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        Object[] spans = spannable.getSpans(0, spannable.length(), URLSpan.class);
        if (spans == null || spans.length == 0) {
            return null;
        }
        ArrayList A10 = C36351kA.A10(spans);
        Collections.sort(A10, new C163897qw(spannable, 18));
        int size = A10.size();
        while (i4 < size - 1) {
            Object obj = A10.get(i4);
            int i5 = i4 + 1;
            Object obj2 = A10.get(i5);
            int spanStart = spannable.getSpanStart(obj);
            int spanEnd = spannable.getSpanEnd(obj);
            int spanStart2 = spannable.getSpanStart(obj2);
            int spanEnd2 = spannable.getSpanEnd(obj2);
            if (spanStart <= spanStart2 && spanEnd > spanStart2) {
                if (spanEnd2 <= spanEnd || (i2 = spanEnd - spanStart) > (i3 = spanEnd2 - spanStart2)) {
                    spannable.removeSpan(obj2);
                    i = i5;
                } else if (i2 < i3) {
                    spannable.removeSpan(obj);
                    i = i4;
                }
                if (i != -1) {
                    A10.remove(i);
                    size--;
                }
            }
            i4 = i5;
        }
        return A10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075 A[LOOP:0: B:4:0x0035->B:20:0x0075, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ea A[EDGE_INSN: B:64:0x00ea->B:45:0x00ea ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A0D(android.text.TextPaint r24, java.lang.CharSequence r25, java.util.List r26, float r27, int r28, int r29, boolean r30) {
        /*
            r10 = r30
            r1 = r27
            if (r30 == 0) goto L_0x00e3
            X.5LH r9 = new X.5LH
            r9.<init>(r1)
        L_0x000b:
            r0 = 1043207291(0x3e2e147b, float:0.17)
            float r0 = r0 * r27
            int r8 = (int) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r27
            int r7 = (int) r0
            r0 = 1041194025(0x3e0f5c29, float:0.14)
            float r0 = r27 * r0
            int r6 = (int) r0
            r0 = 1072902963(0x3ff33333, float:1.9)
            float r1 = r27 * r0
            int r0 = (int) r1
            r17 = r0
            r12 = r25
            int r5 = r12.length()
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            r2 = 0
            r1 = -1
            r14 = 0
        L_0x0035:
            r13 = r24
            r11 = r29
            if (r2 >= r5) goto L_0x00ea
            char r15 = r12.charAt(r2)
            java.lang.Character r0 = java.lang.Character.valueOf(r15)
            X.6L8 r16 = A07(r12, r0, r2, r10)
            if (r16 == 0) goto L_0x007c
            java.util.Iterator r15 = r26.iterator()
        L_0x004d:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.Object r14 = r15.next()
            X.6L9 r14 = (X.AnonymousClass6L9) r14
            int r1 = r14.A02
            r0 = 1
            if (r1 != r0) goto L_0x004d
            int r0 = r14.A00
            if (r0 >= r2) goto L_0x004d
            int r0 = r14.A01
            if (r0 <= r2) goto L_0x004d
        L_0x0066:
            r1 = -1
            r14 = 0
        L_0x0068:
            int r15 = r26.size()
            int r0 = r4.size()
            int r15 = r15 + r0
            r0 = r28
            if (r15 >= r0) goto L_0x00ea
            int r2 = r2 + 1
            goto L_0x0035
        L_0x0078:
            r1 = r2
            r14 = r16
            goto L_0x0068
        L_0x007c:
            r0 = 10
            if (r15 == r0) goto L_0x0084
            int r0 = r5 + -1
            if (r2 != r0) goto L_0x0068
        L_0x0084:
            if (r14 == 0) goto L_0x0066
            r0 = -1
            if (r1 == r0) goto L_0x0066
            int r15 = r14.A03
            r0 = 2
            if (r15 != r0) goto L_0x0092
            A0N(r9, r4, r1, r2)
            goto L_0x0066
        L_0x0092:
            if (r30 == 0) goto L_0x0066
            if (r24 == 0) goto L_0x00b4
            int r0 = r14.A03
            r15 = 4
            if (r0 != r15) goto L_0x00b4
            int r0 = r14.A03
            if (r0 != r15) goto L_0x00b2
            int r1 = r14.A04
            int r0 = r14.A02
            int r0 = r0 + r1
            int r0 = r0 + 2
            float r0 = android.text.Layout.getDesiredWidth(r12, r1, r0, r13)
        L_0x00aa:
            r14.A00 = r0
            r14.A01 = r2
            r3.add(r14)
            goto L_0x0066
        L_0x00b2:
            r0 = 0
            goto L_0x00aa
        L_0x00b4:
            int r14 = r14.A03
            r0 = 5
            if (r14 != r0) goto L_0x0066
            int r15 = r2 + 1
            android.text.style.ForegroundColorSpan r14 = new android.text.style.ForegroundColorSpan
            r14.<init>(r11)
            X.6L9 r0 = new X.6L9
            r0.<init>(r14, r1, r15)
            r4.add(r0)
            float r0 = (float) r6
            X.4cl r14 = new X.4cl
            r14.<init>(r0, r8, r7, r11)
            r22 = 2
            r23 = 5
            X.6L9 r0 = new X.6L9
            r19 = r14
            r20 = r1
            r21 = r15
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23)
            r4.add(r0)
            goto L_0x0066
        L_0x00e3:
            X.634 r9 = new X.634
            r9.<init>(r1)
            goto L_0x000b
        L_0x00ea:
            if (r14 == 0) goto L_0x00f7
            r0 = -1
            if (r1 == r0) goto L_0x00f7
            int r2 = r14.A03
            r0 = 2
            if (r2 != r0) goto L_0x0122
            A0N(r9, r4, r1, r5)
        L_0x00f7:
            java.util.Iterator r3 = r3.iterator()
        L_0x00fb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0160
            java.lang.Object r2 = r3.next()
            X.6L8 r2 = (X.AnonymousClass6L8) r2
            float r0 = r2.A00
            int r0 = (int) r0
            int r1 = r17 - r0
            int r7 = r2.A04
            int r8 = r2.A01
            X.4cm r6 = new X.4cm
            r0 = r17
            r6.<init>(r1, r0)
            r9 = 2
            r10 = 4
            X.6L9 r5 = new X.6L9
            r5.<init>(r6, r7, r8, r9, r10)
            r4.add(r5)
            goto L_0x00fb
        L_0x0122:
            if (r30 == 0) goto L_0x00f7
            if (r24 == 0) goto L_0x013c
            r0 = 4
            if (r2 != r0) goto L_0x013c
            int r1 = r14.A04
            int r0 = r14.A02
            int r0 = r0 + r1
            int r0 = r0 + 2
            float r0 = android.text.Layout.getDesiredWidth(r12, r1, r0, r13)
            r14.A00 = r0
            r14.A01 = r5
            r3.add(r14)
            goto L_0x00f7
        L_0x013c:
            r0 = 5
            if (r2 != r0) goto L_0x00f7
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            r2.<init>(r11)
            X.6L9 r0 = new X.6L9
            r0.<init>(r2, r1, r5)
            r4.add(r0)
            float r2 = (float) r6
            X.4cl r0 = new X.4cl
            r0.<init>(r2, r8, r7, r11)
            r11 = 5
            X.6L9 r6 = new X.6L9
            r10 = 2
            r7 = r0
            r8 = r1
            r9 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            r4.add(r6)
            goto L_0x00f7
        L_0x0160:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YV.A0D(android.text.TextPaint, java.lang.CharSequence, java.util.List, float, int, int, boolean):java.util.ArrayList");
    }

    public static void A0E(Context context, Uri uri, C24801Dv r10, AnonymousClass17Y r11, TextEmojiLabel textEmojiLabel, C21060yb r13, C20810yC r14, String str, String str2) {
        A0G(context, r10, r11, textEmojiLabel, r13, r14, str, new C82313yV(str2, uri));
    }

    public static void A0I(Editable editable, AnonymousClass6L9 r5, List list) {
        int i = r5.A00;
        int i2 = r5.A03;
        editable.replace(i - i2, i, "");
        A0O(list, r5.A00 - i2, i2);
        int i3 = r5.A01;
        editable.replace(i3, i3 + i2, "");
        A0O(list, r5.A01, i2);
    }

    public static void A0N(AnonymousClass634 r8, List list, int i, int i2) {
        int i3;
        int i4 = r8.A02;
        if (r8 instanceof AnonymousClass5LH) {
            i3 = ((AnonymousClass5LH) r8).A00;
        } else {
            i3 = r8.A00;
        }
        int i5 = i;
        int i6 = i2;
        list.add(new AnonymousClass6L9(new LeadingMarginSpan.Standard(i4, (i3 * 2) + i4), i5, i6, 2, 3));
        list.add(new AnonymousClass6L9(new C91894cn(i3, r8.A01), i5, i6, 2, 2));
    }

    public static boolean A0P(C21060yb r0, C19890wg r1, CharSequence charSequence) {
        if (charSequence == null || AnonymousClass14B.A0F(A08(r0, r1, charSequence))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (java.lang.Character.codePointAt(r8, r1) != 46) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (java.lang.Character.codePointAt(r8, r6 + 2) != 32) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r8.charAt(r6 + 3) != ' ') goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(java.lang.CharSequence r8, java.lang.Character r9, int r10) {
        /*
            char r0 = r9.charValue()
            boolean r0 = java.lang.Character.isDigit(r0)
            r7 = 0
            if (r0 == 0) goto L_0x0017
            if (r10 <= 0) goto L_0x0018
            int r0 = r10 + -1
            char r1 = r8.charAt(r0)
            r0 = 10
            if (r1 == r0) goto L_0x001a
        L_0x0017:
            return r7
        L_0x0018:
            if (r10 != 0) goto L_0x0017
        L_0x001a:
            r6 = r10
        L_0x001b:
            int r1 = r6 + 1
            int r0 = r8.length()
            if (r1 >= r0) goto L_0x002f
            char r0 = r8.charAt(r1)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x002f
            r6 = r1
            goto L_0x001b
        L_0x002f:
            int r0 = r8.length()
            if (r1 >= r0) goto L_0x003e
            int r1 = java.lang.Character.codePointAt(r8, r1)
            r0 = 46
            r5 = 1
            if (r1 == r0) goto L_0x003f
        L_0x003e:
            r5 = 0
        L_0x003f:
            int r0 = r8.length()
            r4 = 2
            int r0 = r0 - r4
            r1 = 32
            if (r6 >= r0) goto L_0x0052
            int r0 = r6 + 2
            int r0 = java.lang.Character.codePointAt(r8, r0)
            r3 = 1
            if (r0 == r1) goto L_0x0053
        L_0x0052:
            r3 = 0
        L_0x0053:
            int r0 = r8.length()
            int r0 = r0 + -3
            if (r6 >= r0) goto L_0x0066
            int r0 = r6 + 3
            char r2 = r8.charAt(r0)
            r0 = 32
            r1 = 1
            if (r2 == r0) goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            int r6 = r6 - r10
            int r0 = r6 + 1
            if (r0 > r4) goto L_0x0017
            if (r1 != 0) goto L_0x0017
            if (r5 == 0) goto L_0x0017
            if (r3 == 0) goto L_0x0017
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YV.A00(java.lang.CharSequence, java.lang.Character, int):int");
    }

    public static SpannableStringBuilder A02(String str) {
        SpannableStringBuilder A0P = C36441kJ.A0P(str);
        A0P.setSpan(new C37401mJ(), 0, str.length(), 0);
        return A0P;
    }

    public static SpannableStringBuilder A03(String str, Map map) {
        Spanned fromHtml = Html.fromHtml(str);
        SpannableStringBuilder A0P = C36441kJ.A0P(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                Object obj = map.get(uRLSpan.getURL());
                if (obj != null) {
                    int spanStart = A0P.getSpanStart(uRLSpan);
                    int spanEnd = A0P.getSpanEnd(uRLSpan);
                    int spanFlags = A0P.getSpanFlags(uRLSpan);
                    A0P.removeSpan(uRLSpan);
                    A0P.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
        return A0P;
    }

    public static SpannableStringBuilder A04(String str, Spannable... spannableArr) {
        SpannableStringBuilder A0P = C36441kJ.A0P(str);
        int i = 0;
        while (i < spannableArr.length) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("%");
            int i2 = i + 1;
            A0u.append(i2);
            String A0q = AnonymousClass000.A0q("$s", A0u);
            int indexOf = A0P.toString().indexOf(A0q);
            if (indexOf != -1) {
                A0P.replace(indexOf, A0q.length() + indexOf, spannableArr[i]);
            } else {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("RichTextUtils/formatSpannableString: skipping placeholder of index ");
                A0u2.append(i2);
                C36321k7.A1P(" as we cannot find it in template: ", str, A0u2);
            }
            i = i2;
        }
        return A0P;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01b6, code lost:
        if (r3 == '`') goto L_0x01b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A06(java.lang.CharSequence r18, int r19, boolean r20) {
        /*
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            r8 = r18
            int r5 = r8.length()
            r4 = 0
            r13 = 32
            r10 = -1
            r9 = -1
            r3 = 32
            r2 = 0
        L_0x0016:
            if (r2 >= r5) goto L_0x01dc
            char r1 = r8.charAt(r2)
            r0 = 42
            if (r1 != r0) goto L_0x0035
            int r0 = r5 + -1
            if (r2 >= r0) goto L_0x0035
            int r0 = r2 + 1
            int r11 = java.lang.Character.codePointAt(r8, r0)
            r0 = 8419(0x20e3, float:1.1798E-41)
            if (r11 == r0) goto L_0x0033
            r0 = 65039(0xfe0f, float:9.1139E-41)
            if (r11 != r0) goto L_0x0035
        L_0x0033:
            r1 = 32
        L_0x0035:
            r15 = r20
            if (r20 == 0) goto L_0x01bb
            java.lang.Character r0 = java.lang.Character.valueOf(r1)
            X.6L8 r0 = A07(r8, r0, r2, r15)
            if (r0 == 0) goto L_0x0046
            r6.add(r0)
        L_0x0046:
            int r0 = r5 + -1
            if (r2 >= r0) goto L_0x01bb
            int r0 = r2 + 1
            char r14 = r8.charAt(r0)
        L_0x0050:
            r12 = 42
            r11 = 0
            if (r1 == r12) goto L_0x005f
            r0 = 95
            r11 = 1
            if (r1 == r0) goto L_0x005f
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 != r0) goto L_0x01ad
            r11 = 2
        L_0x005f:
            java.lang.String r0 = "monospace"
            if (r11 < 0) goto L_0x012c
            if (r4 != 0) goto L_0x006c
            r4 = 4
            int[] r4 = new int[r4]
            r13 = -1
            java.util.Arrays.fill(r4, r13)
        L_0x006c:
            r13 = r4[r11]
            if (r13 >= 0) goto L_0x00d0
            if (r3 == r1) goto L_0x00d0
            boolean r13 = java.lang.Character.isWhitespace(r3)
            if (r13 != 0) goto L_0x00ba
            r13 = 95
            if (r3 == r13) goto L_0x00ba
            r13 = 126(0x7e, float:1.77E-43)
            if (r3 == r13) goto L_0x00ba
            if (r3 == r12) goto L_0x00ba
            r13 = 46
            if (r3 == r13) goto L_0x00ba
            r13 = 44
            if (r3 == r13) goto L_0x00ba
            r13 = 58
            if (r3 == r13) goto L_0x00ba
            r13 = 34
            if (r3 == r13) goto L_0x00ba
            r13 = 40
            if (r3 == r13) goto L_0x00ba
            r13 = 47
            if (r3 == r13) goto L_0x00ba
            r13 = 59
            if (r3 == r13) goto L_0x00ba
            r13 = 8206(0x200e, float:1.1499E-41)
            if (r3 == r13) goto L_0x00ba
            r13 = 8207(0x200f, float:1.15E-41)
            if (r3 == r13) goto L_0x00ba
            r13 = 8294(0x2066, float:1.1622E-41)
            if (r3 == r13) goto L_0x00ba
            r13 = 8295(0x2067, float:1.1624E-41)
            if (r3 == r13) goto L_0x00ba
            r13 = 8296(0x2068, float:1.1625E-41)
            if (r3 == r13) goto L_0x00ba
            r13 = 8237(0x202d, float:1.1542E-41)
            if (r3 == r13) goto L_0x00ba
            r13 = 8238(0x202e, float:1.1544E-41)
            if (r3 != r13) goto L_0x00d0
        L_0x00ba:
            int r12 = r2 + 1
            if (r12 >= r5) goto L_0x00ca
            char r0 = r8.charAt(r12)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 != 0) goto L_0x00ca
        L_0x00c8:
            r4[r11] = r12
        L_0x00ca:
            int r2 = r2 + 1
            r13 = r3
            r3 = r1
            goto L_0x0016
        L_0x00d0:
            r13 = r4[r11]
            if (r13 < 0) goto L_0x00ca
            boolean r13 = java.lang.Character.isWhitespace(r3)
            if (r13 != 0) goto L_0x00ca
            int r13 = r5 + -1
            if (r2 == r13) goto L_0x00ea
            int r13 = r2 + 1
            int r13 = java.lang.Character.codePointAt(r8, r13)
            boolean r13 = java.lang.Character.isLetterOrDigit(r13)
            if (r13 != 0) goto L_0x00ca
        L_0x00ea:
            r13 = r4[r11]
            if (r13 >= r2) goto L_0x01ed
            r14 = 3
            if (r11 != r14) goto L_0x01bf
            java.util.ArrayList r14 = X.AnonymousClass001.A0I()
            java.util.Iterator r16 = r7.iterator()
        L_0x00f9:
            boolean r12 = r16.hasNext()
            if (r12 == 0) goto L_0x0113
            java.lang.Object r13 = r16.next()
            X.6L9 r13 = (X.AnonymousClass6L9) r13
            int r15 = r13.A00
            r12 = r4[r11]
            if (r15 <= r12) goto L_0x00f9
            int r12 = r13.A01
            if (r12 >= r2) goto L_0x00f9
            r14.add(r13)
            goto L_0x00f9
        L_0x0113:
            r7.removeAll(r14)
            r15 = r4[r11]
            android.text.style.TypefaceSpan r12 = new android.text.style.TypefaceSpan
            r12.<init>(r0)
            r17 = 1
            r18 = 6
            X.6L9 r0 = new X.6L9
            r13 = r0
            r14 = r12
            r16 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            goto L_0x01d1
        L_0x012c:
            r14 = r10
            r11 = 96
            if (r1 != r11) goto L_0x01a1
            if (r3 != r11) goto L_0x00ca
            if (r13 != r11) goto L_0x00ca
            if (r9 < 0) goto L_0x013b
            int r11 = r2 + -2
            if (r9 >= r11) goto L_0x00ca
        L_0x013b:
            if (r10 >= 0) goto L_0x0140
            int r10 = r2 + 1
            goto L_0x00ca
        L_0x0140:
            int r11 = r2 + -2
            if (r10 >= r11) goto L_0x00ca
        L_0x0144:
            if (r10 >= r11) goto L_0x019e
            char r12 = r8.charAt(r10)
            boolean r12 = java.lang.Character.isWhitespace(r12)
            if (r12 != 0) goto L_0x0186
            r16 = 3
            android.text.style.TypefaceSpan r9 = new android.text.style.TypefaceSpan
            r9.<init>(r0)
            r17 = 1
            X.6L9 r0 = new X.6L9
            r12 = r0
            r13 = r9
            r15 = r11
            r12.<init>(r13, r14, r15, r16, r17)
            r7.add(r0)
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()
            java.util.Iterator r13 = r7.iterator()
        L_0x016c:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0189
            java.lang.Object r10 = r13.next()
            X.6L9 r10 = (X.AnonymousClass6L9) r10
            int r9 = r10.A00
            int r0 = r14 + -1
            if (r9 <= r0) goto L_0x016c
            int r0 = r10.A01
            if (r0 >= r11) goto L_0x016c
            r12.add(r10)
            goto L_0x016c
        L_0x0186:
            int r10 = r10 + 1
            goto L_0x0144
        L_0x0189:
            r7.removeAll(r12)
            if (r4 == 0) goto L_0x0192
            r0 = -1
            java.util.Arrays.fill(r4, r0)
        L_0x0192:
            int r9 = r7.size()
            r0 = r19
            if (r9 >= r0) goto L_0x01dc
            r9 = r2
            r10 = -1
            goto L_0x00ca
        L_0x019e:
            r10 = r14
            goto L_0x00ca
        L_0x01a1:
            r0 = 10
            if (r1 != r0) goto L_0x00ca
            if (r4 == 0) goto L_0x00ca
            r0 = -1
            java.util.Arrays.fill(r4, r0)
            goto L_0x00ca
        L_0x01ad:
            if (r20 == 0) goto L_0x01b8
            r0 = 96
            if (r1 != r0) goto L_0x01b8
            if (r14 == r0) goto L_0x01b8
            r11 = 3
            if (r3 != r0) goto L_0x005f
        L_0x01b8:
            r11 = -1
            goto L_0x005f
        L_0x01bb:
            r14 = 32
            goto L_0x0050
        L_0x01bf:
            r14 = 1
            if (r1 == r12) goto L_0x01e7
            r0 = 95
            r14 = 2
            if (r1 == r0) goto L_0x01e7
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 == r0) goto L_0x01e1
            r12 = 0
        L_0x01cc:
            X.6L9 r0 = new X.6L9
            r0.<init>(r12, r13, r2)
        L_0x01d1:
            r7.add(r0)
            int r12 = r7.size()
            r0 = r19
            if (r12 < r0) goto L_0x01ed
        L_0x01dc:
            android.util.Pair r0 = X.C36441kJ.A0Q(r7, r6)
            return r0
        L_0x01e1:
            android.text.style.StrikethroughSpan r12 = new android.text.style.StrikethroughSpan
            r12.<init>()
            goto L_0x01cc
        L_0x01e7:
            android.text.style.StyleSpan r12 = new android.text.style.StyleSpan
            r12.<init>(r14)
            goto L_0x01cc
        L_0x01ed:
            r13 = 0
        L_0x01ee:
            int r0 = r4.length
            if (r13 >= r0) goto L_0x01ff
            if (r13 == r11) goto L_0x01fc
            r12 = r4[r11]
            r0 = r4[r13]
            if (r12 >= r0) goto L_0x01fc
            r0 = -1
            r4[r13] = r0
        L_0x01fc:
            int r13 = r13 + 1
            goto L_0x01ee
        L_0x01ff:
            r12 = -1
            r0 = r4[r11]
            if (r0 >= r10) goto L_0x00c8
            r10 = -1
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YV.A06(java.lang.CharSequence, int, boolean):android.util.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (java.lang.Character.codePointAt(r6, r8 + 1) != 32) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r3 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass6L8 A07(java.lang.CharSequence r6, java.lang.Character r7, int r8, boolean r9) {
        /*
            char r4 = r7.charValue()
            r5 = 1
            r0 = 42
            if (r4 == r0) goto L_0x000d
            r0 = 45
            if (r4 != r0) goto L_0x003c
        L_0x000d:
            if (r8 <= 0) goto L_0x0038
            int r0 = r8 + -1
            char r1 = r6.charAt(r0)
            r0 = 10
            if (r1 == r0) goto L_0x003a
        L_0x0019:
            r3 = 0
        L_0x001a:
            int r0 = r6.length()
            int r0 = r0 - r5
            if (r8 >= r0) goto L_0x002c
            int r0 = r8 + 1
            int r2 = java.lang.Character.codePointAt(r6, r0)
            r1 = 32
            r0 = 1
            if (r2 == r1) goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            if (r3 == 0) goto L_0x003c
            if (r0 == 0) goto L_0x003c
            r0 = 2
        L_0x0032:
            X.6L8 r2 = new X.6L8
            r2.<init>(r0, r8)
            return r2
        L_0x0038:
            if (r8 != 0) goto L_0x0019
        L_0x003a:
            r3 = 1
            goto L_0x001a
        L_0x003c:
            if (r9 == 0) goto L_0x008d
            int r1 = A00(r6, r7, r8)
            if (r1 <= 0) goto L_0x004b
            r0 = 4
            X.6L8 r2 = new X.6L8
            r2.<init>(r0, r8, r1)
            return r2
        L_0x004b:
            r0 = 62
            if (r4 != r0) goto L_0x008d
            if (r8 <= 0) goto L_0x0089
            int r0 = r8 + -1
            char r1 = r6.charAt(r0)
            r0 = 10
            if (r1 == r0) goto L_0x008b
        L_0x005b:
            r2 = 0
        L_0x005c:
            int r0 = r6.length()
            int r0 = r0 - r5
            if (r8 >= r0) goto L_0x0087
            int r0 = r8 + 1
            int r1 = java.lang.Character.codePointAt(r6, r0)
            r0 = 32
            if (r1 != r0) goto L_0x0087
        L_0x006d:
            int r1 = r8 + 2
            int r0 = r6.length()
            if (r1 >= r0) goto L_0x0085
            char r0 = r6.charAt(r1)
            boolean r0 = java.lang.Character.isWhitespace(r0)
        L_0x007d:
            if (r2 == 0) goto L_0x008d
            if (r5 == 0) goto L_0x008d
            if (r0 != 0) goto L_0x008d
            r0 = 5
            goto L_0x0032
        L_0x0085:
            r0 = 1
            goto L_0x007d
        L_0x0087:
            r5 = 0
            goto L_0x006d
        L_0x0089:
            if (r8 != 0) goto L_0x005b
        L_0x008b:
            r2 = 1
            goto L_0x005c
        L_0x008d:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YV.A07(java.lang.CharSequence, java.lang.Character, int, boolean):X.6L8");
    }

    public static void A0F(Context context, Editable editable, TextPaint textPaint, C21060yb r12, AnonymousClass1H2 r13, C19890wg r14, int i, boolean z) {
        Editable editable2 = editable;
        TextPaint textPaint2 = textPaint;
        C21060yb r3 = r12;
        C19890wg r4 = r14;
        if (z) {
            int A00 = AnonymousClass00F.A00(context, i);
            int A002 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
            C36331k8.A1G(context, 1, r13);
            AnonymousClass3UG.A07(context, textPaint, editable, r13, 1.3f);
            A0M(editable, true);
            A05(textPaint2, r3, r4, editable2, A00, A002, true);
            return;
        }
        C36331k8.A1G(context, 1, r13);
        AnonymousClass3UG.A07(context, textPaint, editable, r13, 1.3f);
        A0M(editable, false);
        A09(r12, r14, editable, textPaint.getColor(), true);
    }

    public static void A0G(Context context, C24801Dv r11, AnonymousClass17Y r12, TextEmojiLabel textEmojiLabel, C21060yb r14, C20810yC r15, String str, Map map) {
        HashMap A0J = AnonymousClass001.A0J();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (true) {
            C21060yb r8 = r14;
            if (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                A0J.put(A11.getKey(), new C429721s(context, r11, r12, r8, A11.getValue().toString()));
            } else {
                SpannableStringBuilder A03 = A03(str, A0J);
                C36331k8.A1A(r15, textEmojiLabel);
                C36331k8.A16(textEmojiLabel, r14);
                textEmojiLabel.setText(A03);
                return;
            }
        }
    }

    public static void A0H(Editable editable, AnonymousClass6L9 r6, int i) {
        int i2 = (i & 16777215) | 855638016;
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i2);
        int i3 = r6.A00;
        int i4 = r6.A03;
        editable.setSpan(foregroundColorSpan, i3 - i4, i3, 18);
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(i2);
        int i5 = r6.A01;
        editable.setSpan(foregroundColorSpan2, i5, i5 + i4, 18);
    }

    public static void A0K(Editable editable, List list) {
        AbsoluteSizeSpan absoluteSizeSpan;
        int i;
        int i2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass6L9 r4 = (AnonymousClass6L9) it.next();
            int i3 = r4.A02;
            if (i3 == 2) {
                absoluteSizeSpan = new AbsoluteSizeSpan(0, false);
                i = r4.A00;
                i2 = i + 1;
            } else if (i3 == 5) {
                absoluteSizeSpan = new AbsoluteSizeSpan(0, false);
                i = r4.A00;
                i2 = i + 2;
            } else {
                editable.setSpan(r4.A04, r4.A00, r4.A01, 33);
            }
            editable.setSpan(absoluteSizeSpan, i, i2, 33);
            editable.setSpan(r4.A04, r4.A00, r4.A01, 33);
        }
    }

    public static void A0L(Editable editable, List list, int i, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass6L9 r0 = (AnonymousClass6L9) it.next();
            if (z) {
                A0H(editable, r0, i);
            } else {
                A0I(editable, r0, list);
            }
            editable.setSpan(r0.A04, r0.A00, r0.A01, 17);
        }
    }

    public static void A0M(Editable editable, boolean z) {
        for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) editable.getSpans(0, editable.length(), ForegroundColorSpan.class)) {
            if (!(foregroundColorSpan instanceof AnonymousClass0p6)) {
                editable.removeSpan(foregroundColorSpan);
            }
        }
        A0J(editable, StyleSpan.class, editable.length());
        A0J(editable, StrikethroughSpan.class, editable.length());
        A0J(editable, TypefaceSpan.class, editable.length());
        A0J(editable, C91894cn.class, editable.length());
        A0J(editable, LeadingMarginSpan.Standard.class, editable.length());
        A0J(editable, AbsoluteSizeSpan.class, editable.length());
        if (z) {
            A0J(editable, BackgroundColorSpan.class, editable.length());
        }
    }

    public static void A0O(List list, int i, int i2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass6L9 r1 = (AnonymousClass6L9) it.next();
            int i3 = r1.A00;
            if (i3 > i) {
                r1.A00 = i3 - i2;
            }
            int i4 = r1.A01;
            if (i4 > i) {
                r1.A01 = i4 - i2;
            }
        }
    }
}
