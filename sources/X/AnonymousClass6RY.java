package X;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import com.whatsapp.TextEmojiLabel;
import java.text.MessageFormat;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.6RY  reason: invalid class name */
public abstract class AnonymousClass6RY {
    public static final Pattern A00 = Pattern.compile("\\[(\\d+)]");

    public static void A01(Spannable spannable, AnonymousClass07P r7, C1271967i r8, C140456lc r9, C132376Ti r10) {
        C36331k8.A1A(r10.A07, (TextEmojiLabel) r7);
        r7.setText(spannable);
        String A0L = C140456lc.A0L(r9);
        if (A0L != null) {
            try {
                r7.setGravity(AnonymousClass6Y7.A06(A0L));
            } catch (AnonymousClass5R5 e) {
                AnonymousClass6RS.A00(r8, "WaRcRichTextComponentBinderUtils", String.format("Failed to parse text align %s", new Object[]{A0L}), e);
            }
        }
        String A0J = C140456lc.A0J(r9);
        if (A0J != null) {
            try {
                r7.setLineHeight((int) AnonymousClass6Y7.A01(A0J));
            } catch (AnonymousClass5R5 e2) {
                AnonymousClass6RS.A00(r8, "WaRcRichTextComponentBinderUtils", String.format("Failed to parse line height pixel  %s", new Object[]{A0J}), e2);
            }
        }
    }

    public static SpannableStringBuilder A00(C1271967i r15, C140456lc r16) {
        Object[] objArr;
        Integer num;
        C140456lc r11 = r16;
        Object A0I = C140456lc.A0I(r11, 44);
        int i = 0;
        if (A0I != null) {
            objArr = ((List) A0I).toArray(new String[0]);
        } else {
            objArr = null;
        }
        String A0K = C140456lc.A0K(r11);
        if (objArr != null) {
            A0K = MessageFormat.format(A0K, objArr);
        }
        if (A0K == null) {
            return new SpannableStringBuilder();
        }
        SpannableStringBuilder A0P = C36441kJ.A0P(A0K);
        C140456lc A0W = r11.A0W(43);
        String str = (String) C140456lc.A0I(r11, 40);
        C1271967i r12 = r15;
        if (A0W != null) {
            num = Integer.valueOf(AnonymousClass5Z8.A01(r15, A0W, 0));
        } else {
            if (str != null) {
                try {
                    num = Integer.valueOf(AnonymousClass6Y7.A04(str));
                } catch (AnonymousClass5R5 e) {
                    AnonymousClass6RS.A00(r15, "WaRcRichTextComponentBinderUtils", String.format("Failed to parse text color %s", new Object[]{str}), e);
                }
            }
            num = null;
        }
        if (num != null) {
            A0P.setSpan(new ForegroundColorSpan(num.intValue()), 0, A0K.length(), 0);
        }
        String A0N = C140456lc.A0N(r11);
        if (A0N != null) {
            try {
                A0P.setSpan(new AbsoluteSizeSpan(Math.round(AnonymousClass6Y7.A01(A0N))), 0, A0K.length(), 0);
            } catch (AnonymousClass5R5 e2) {
                AnonymousClass6RS.A00(r15, "WaRcRichTextComponentBinderUtils", String.format("Failed to parse text color %s", new Object[]{str}), e2);
            }
        }
        String A0O = C140456lc.A0O(r11);
        if (A0O != null) {
            try {
                A0P.setSpan(new StyleSpan(AnonymousClass6Y7.A08(A0O)), 0, A0K.length(), 0);
            } catch (AnonymousClass5R5 e3) {
                AnonymousClass6RS.A00(r15, "WaRcRichTextComponentBinderUtils", String.format("Failed to textStyle  %s", new Object[]{A0N}), e3);
            }
        }
        Matcher matcher = A00.matcher(A0K);
        int i2 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            int A002 = AnonymousClass6R8.A00(group.replaceAll("[\\[\\]]", ""), -1);
            if (A002 >= 0 && A002 < r11.A0b().size()) {
                C140456lc A0K2 = C90504aG.A0K(r11.A0b(), A002);
                String A0L = C140456lc.A0L(A0K2);
                if (objArr != null) {
                    A0L = MessageFormat.format(A0L, objArr);
                }
                int start = matcher.start() + i2;
                if (A0L != null) {
                    int length = A0L.length();
                    int length2 = group.length();
                    i2 += length - length2;
                    SpannableStringBuilder A0P2 = C36441kJ.A0P(A0L);
                    String str2 = (String) C140456lc.A0I(A0K2, 40);
                    if (str2 != null) {
                        try {
                            A0P2.setSpan(new ForegroundColorSpan(AnonymousClass6Y7.A04(str2)), i, length, i);
                        } catch (AnonymousClass5R5 unused) {
                            AnonymousClass6RS.A01("WaRcRichTextComponentBinderUtils", "Error parsing TextSpan color");
                        }
                    }
                    C140456lc A0W2 = A0K2.A0W(44);
                    if (A0W2 != null) {
                        A0P2.setSpan(new ForegroundColorSpan(AnonymousClass5Z8.A01(r12, A0W2, i)), 0, length, 0);
                    }
                    String A0O2 = C140456lc.A0O(A0K2);
                    if (A0O2 != null) {
                        try {
                            A0P2.setSpan(new AbsoluteSizeSpan(Math.round(C90464aC.A02(r12.A00, AnonymousClass6Y7.A02(A0O2), 2))), 0, length, 0);
                        } catch (AnonymousClass5R5 unused2) {
                            AnonymousClass6RS.A01("WaRcRichTextComponentBinderUtils", "Error parsing TextSpan size");
                        }
                    }
                    String str3 = (String) C140456lc.A0I(A0K2, 43);
                    if (str3 != null) {
                        try {
                            A0P2.setSpan(new StyleSpan(AnonymousClass6Y7.A08(str3)), 0, length, 0);
                        } catch (AnonymousClass5R5 unused3) {
                            AnonymousClass6RS.A01("WaRcRichTextComponentBinderUtils", "Error parsing TextSpan textStyle");
                        }
                    }
                    String A0J = C140456lc.A0J(A0K2);
                    if (A0J != null) {
                        A0P2.setSpan(new TypefaceSpan(A0J), 0, length, 0);
                    }
                    C160377ku A0X = A0K2.A0X(36);
                    if (A0X != null) {
                        int A0B = C90484aE.A0B(num);
                        if (A0W2 != null) {
                            A0B = AnonymousClass5Z8.A00(r12, A0W2);
                        }
                        A0P2.setSpan(new C100734vV(new C1502474n(r11, A0X, r12, 2), A0B), 0, length, 0);
                    }
                    A0P.replace(start, length2 + start, A0P2);
                }
            }
            i = 0;
        }
        return A0P;
    }
}
