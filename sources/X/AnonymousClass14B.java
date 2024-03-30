package X;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.14B  reason: invalid class name */
public abstract class AnonymousClass14B {
    public static String A09(Character ch, String str) {
        int length;
        C18740tg.A0B(true);
        if (str == null || (length = str.length()) <= 4) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.join("", Collections.nCopies(length - 4, ch)));
        sb.append(A0B(str, 4));
        return sb.toString();
    }

    public static String A0B(String str, int i) {
        int length;
        C18740tg.A0B(true);
        if (str == null || (length = str.length()) <= i) {
            return str;
        }
        return str.substring(length - i);
    }

    public static String A0E(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r5 * 2);
        for (byte b : bArr) {
            sb.append(Character.forDigit((b >> 4) & 15, 16));
            sb.append(Character.forDigit(b & 15, 16));
        }
        return sb.toString();
    }

    public static boolean A0F(CharSequence charSequence) {
        int length;
        if (!(charSequence == null || (length = charSequence.length()) == 0)) {
            for (int i = 0; i < length; i++) {
                char charAt = charSequence.charAt(i);
                if (charAt != 8203 && !Character.isWhitespace(charAt)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Object[] A0I(Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        for (int i = 0; i < copyOf.length; i++) {
            if (copyOf[i] instanceof CharSequence) {
                copyOf[i] = Html.escapeHtml((CharSequence) copyOf[i]);
            }
        }
        return copyOf;
    }

    public static String A03(Context context, int i) {
        return String.format(Locale.US, "%06X", new Object[]{Integer.valueOf(AnonymousClass00F.A00(context, i) & 16777215)});
    }

    public static String A05(CharSequence charSequence) {
        String normalize = Normalizer.normalize(charSequence, Normalizer.Form.NFKD);
        Pattern pattern = C108945Vo.A00;
        if (pattern == null) {
            pattern = Pattern.compile("\\p{Mn}+");
            C108945Vo.A00 = pattern;
        }
        return pattern.matcher(normalize).replaceAll("").toLowerCase(Locale.US).replace(305, 'i');
    }

    public static String A06(CharSequence charSequence) {
        AnonymousClass62C r0 = C108935Vn.A00;
        if (r0 == null) {
            r0 = new AnonymousClass62C(new String[]{"ı", "i", "ة", "ه", "ـ", "", "ى", "ي", "ٱ", "ا", "ڤ", "ف", "ک", "ك", "ں", "ن", "ھ", "ه", "ۃ", "ۂ", "ی", "ي", "ے", "ي", "ە", "ه", "۰", "٠", "۱", "١", "۲", "٢", "۳", "٣", "۴", "٤", "۵", "٥", "۶", "٦", "۷", "٧", "۸", "٨", "۹", "٩", "ࢻ", "ف", "ࢼ", "ق", "ࢽ", "ن", "‌", ""});
            C108935Vn.A00 = r0;
        }
        AnonymousClass62C r2 = C108935Vn.A01;
        if (r2 == null) {
            r2 = new AnonymousClass62C(new String[]{"ٵ", "ٴا", "ٶ", "ٴو", "ٷ", "ٴۇ", "ٸ", "ٴى", "अॆ", "ऄ", "अा", "आ", "र्इ", "ई", "उु", "ऊ", "एॅ", "ऍ", "एॆ", "ऎ", "एे", "ऐ", "अॉ", "ऑ", "आॅ", "ऑ", "अॊ", "ऒ", "आॆ", "ऒ", "अो", "ओ", "आे", "ओ", "अौ", "औ", "आै", "औ", "अॅ", "ॲ", "अऺ", "ॳ", "अऻ", "ॴ", "आऺ", "ॴ", "अॏ", "ॵ", "अॖ", "ॶ", "अॗ", "ॷ", "অা", "আ", "ঋৃ", "ৠ", "ঌৢ", "ৡ", "ਅਾ", "ਆ", "ੲਿ", "ਇ", "ੲੀ", "ਈ", "ੳੁ", "ਉ", "ੳੂ", "ਊ", "ੲੇ", "ਏ", "ਅੈ", "ਐ", "ੳੋ", "ਓ", "ਅੌ", "ਔ", "અા", "આ", "અૅ", "ઍ", "અે", "એ", "અૈ", "ઐ", "અૉ", "ઑ", "અો", "ઓ", "અાૅ", "ઓ", "અૌ", "ઔ", "અાૈ", "ઔ", "ૅા", "ૉ", "ଅା", "ଆ", "ଏୗ", "ଐ", "ଓୗ", "ଔ", "ஸ்ரீ", "ஶ்ரீ", "ఒౕ", "ఓ", "ఒౌ", "ఔ", "ిౕ", "ీ", "ెౕ", "ే", "ొౕ", "ో", "ಉಾ", "ಊ", "ಒೌ", "ಔ", "ಋಾ", "ೠ", "ഇൗ", "ഈ", "ഉൗ", "ഊ", "എെ", "ഐ", "ഒാ", "ഓ", "ഒൗ", "ഔ", "ണ്‍", "ൺ", "ന്‍", "ൻ", "ര്‍", "ർ", "ല്‍", "ൽ", "ള്‍", "ൾ", "අා", "ආ", "අැ", "ඇ", "අෑ", "ඈ", "උෟ", "ඌ", "ඍෘ", "ඎ", "ඏෟ", "ඐ", "එ්", "ඒ", "එෙ", "ඓ", "ඔෟ", "ඖ"});
            C108935Vn.A01 = r2;
        }
        String normalize = Normalizer.normalize(r2.A00(charSequence), Normalizer.Form.NFKD);
        Pattern pattern = C108945Vo.A00;
        if (pattern == null) {
            pattern = Pattern.compile("\\p{Mn}+");
            C108945Vo.A00 = pattern;
        }
        return r0.A00(pattern.matcher(normalize).replaceAll("").toLowerCase(Locale.US)).toString();
    }

    public static String A07(CharSequence charSequence, Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
            sb.append(charSequence);
        }
        if (sb.length() > 0) {
            return sb.substring(0, sb.length() - charSequence.length());
        }
        return "";
    }

    public static String A08(CharSequence charSequence, CharSequence... charSequenceArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int length = charSequenceArr.length;
            if (i >= length) {
                return sb.toString();
            }
            sb.append(charSequenceArr[i]);
            if (i < length - 1) {
                sb.append(charSequence);
            }
            i++;
        }
    }

    public static String A0A(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    public static String A0C(String str, int i) {
        if (str == null || str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        return str.substring(0, str.offsetByCodePoints(0, i));
    }

    public static String A0D(String str, int i) {
        if (str == null) {
            return "";
        }
        String A0C = A0C(str, i);
        if (str.equals(A0C)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A0C);
        sb.append("…");
        return sb.toString();
    }

    public static int A00(CharSequence charSequence, int i) {
        if (charSequence.length() == 0) {
            return 0;
        }
        return Math.min((i + Character.charCount(Character.codePointAt(charSequence, i - 1))) - 1, charSequence.length());
    }

    public static Spanned A01(Context context, Object[] objArr, int i) {
        return Html.fromHtml(context.getString(i, A0I(objArr)));
    }

    public static CharSequence A02(CharSequence charSequence) {
        int i;
        if (!TextUtils.isEmpty(charSequence) && (i = Build.VERSION.SDK_INT) >= 26 && i <= 29) {
            Pattern pattern = C108945Vo.A01;
            if (pattern == null) {
                pattern = Pattern.compile("[\\u1680\\u2000-\\u200a\\u205f\\u3000]+\\u0020");
                C108945Vo.A01 = pattern;
            }
            Matcher matcher = pattern.matcher(charSequence);
            if (matcher.find()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                int i2 = 0;
                int i3 = 0;
                while (matcher.find(i2)) {
                    i2 = matcher.end();
                    int start = matcher.start();
                    spannableStringBuilder.replace(start - i3, i2 - i3, " ");
                    i3 += (i2 - start) - 1;
                }
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    public static String A04(C18820ts r3, String str, String str2) {
        String str3;
        String A06 = r3.A06();
        if ("ar".equals(A06) || "fa".equals(A06) || "ur".equals(A06)) {
            str3 = " — ";
        } else {
            str3 = " • ";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r3.A0G(str));
        sb.append(str3);
        sb.append(r3.A0G(str2));
        return sb.toString();
    }

    public static boolean A0G(CharSequence charSequence, CharSequence charSequence2) {
        if ((!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(charSequence2)) && !TextUtils.equals(charSequence, charSequence2)) {
            return false;
        }
        return true;
    }

    public static byte[] A0H(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[(length / 2)];
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                int digit = Character.digit(charAt, 16);
                if (digit != -1) {
                    int i2 = i / 2;
                    byte b = bArr[i2];
                    int i3 = 0;
                    if (i % 2 == 0) {
                        i3 = 4;
                    }
                    bArr[i2] = (byte) ((digit << i3) | b);
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("invalid character; char=");
                    sb.append(charAt);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            return bArr;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("even length input string required; length=");
        sb2.append(length);
        throw new IllegalArgumentException(sb2.toString());
    }
}
