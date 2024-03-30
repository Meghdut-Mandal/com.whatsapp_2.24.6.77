package X;

import java.lang.Character;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class AYC implements Iterator {
    public static final Pattern A08;
    public static final Pattern A09;
    public static final Pattern A0A = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
    public static final Pattern A0B = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
    public static final Pattern A0C = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d [0-2]\\d$");
    public static final Pattern A0D = Pattern.compile(":[0-5]\\d");
    public static final Pattern A0E;
    public static final Pattern A0F;
    public long A00;
    public AnonymousClass9W4 A01 = null;
    public Integer A02 = C023109s.A00;
    public int A03 = 0;
    public final CharSequence A04;
    public final C187568y7 A05;
    public final C203559oI A06;
    public final String A07;

    private AnonymousClass9W4 A00(String str, int i) {
        char charAt;
        char charAt2;
        try {
            String str2 = str;
            if (C36361kB.A1Z(str, A0F)) {
                C187568y7 r3 = this.A05;
                if (r3.compareTo(C187568y7.A00) >= 0) {
                    if (i > 0 && !A0E.matcher(str).lookingAt() && ((charAt2 = this.A04.charAt(i - 1)) == '%' || Character.getType(charAt2) == 26 || A03(charAt2))) {
                        return null;
                    }
                    int length = str.length() + i;
                    CharSequence charSequence = this.A04;
                    if (length < charSequence.length() && ((charAt = charSequence.charAt(length)) == '%' || Character.getType(charAt) == 26 || A03(charAt))) {
                        return null;
                    }
                }
                C203559oI r5 = this.A06;
                String str3 = this.A07;
                AUN aun = new AUN();
                C203559oI.A06(r5, aun, str2, str3, true, true);
                if (r3.A00(r5, aun, str)) {
                    aun.hasCountryCodeSource = false;
                    aun.countryCodeSource_ = C187918yk.FROM_NUMBER_WITH_PLUS_SIGN;
                    aun.hasRawInput = false;
                    aun.rawInput_ = "";
                    aun.hasPreferredDomesticCarrierCode = false;
                    aun.preferredDomesticCarrierCode_ = "";
                    return new AnonymousClass9W4(aun, str, i);
                }
                return null;
            }
            return null;
        } catch (AnonymousClass172 unused) {
        }
    }

    static {
        String A022 = A02(0, 3);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("(?:[");
        A0u.append("(\\[（［");
        A0u.append("])?(?:");
        A0u.append("[^(\\[（［)\\]）］]");
        A0u.append("+[");
        A0u.append(")\\]）］");
        A0u.append("])?");
        A0u.append("[^(\\[（［)\\]）］]");
        A0u.append("+(?:[");
        A0u.append("(\\[（［");
        C36321k7.A1O("]", "[^(\\[（［)\\]）］]", "+[", ")\\]）］", A0u);
        AnonymousClass000.A1D("])", A022, "[^(\\[（［)\\]）］]", A0u);
        A0F = Pattern.compile(AnonymousClass000.A0q("*", A0u));
        String A023 = A02(0, 2);
        String A024 = A02(0, 4);
        String A025 = A02(0, 19);
        String A0p = AnonymousClass000.A0p("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]", A024, AnonymousClass000.A0u());
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("\\p{Nd}");
        String A0q = AnonymousClass000.A0q(A02(1, 19), A0u2);
        String A0p2 = AnonymousClass000.A0p("(\\[（［+＋", "]", C90484aE.A0p());
        A0E = Pattern.compile(A0p2);
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append("\\p{Z}[^");
        A0u3.append("(\\[（［+＋");
        A08 = Pattern.compile(AnonymousClass000.A0q("\\p{Nd}]*", A0u3));
        StringBuilder A0u4 = AnonymousClass000.A0u();
        AnonymousClass000.A1D("(?:", A0p2, A0p, A0u4);
        C36321k7.A1O(")", A023, A0q, "(?:", A0u4);
        C36321k7.A1O(A0p, A0q, ")", A025, A0u4);
        A0u4.append("(?:");
        A0u4.append(C203559oI.A08);
        A09 = Pattern.compile(AnonymousClass000.A0q(")?", A0u4), 66);
    }

    public boolean hasNext() {
        AnonymousClass9W4 r0;
        Integer num = this.A02;
        if (num == C023109s.A00) {
            int i = this.A03;
            Pattern pattern = A09;
            CharSequence charSequence = this.A04;
            Matcher matcher = pattern.matcher(charSequence);
            while (true) {
                if (this.A00 <= 0 || !matcher.find(i)) {
                    r0 = null;
                } else {
                    int start = matcher.start();
                    CharSequence A012 = A01(charSequence.subSequence(start, matcher.end()), C203559oI.A0H);
                    if (!C165587tf.A1a(A012, A0A) && !C165587tf.A1a(A012, A0B)) {
                        if (C165587tf.A1a(A012, A0C)) {
                            if (A0D.matcher(charSequence.toString().substring(A012.length() + start)).lookingAt()) {
                                continue;
                            }
                        }
                        String charSequence2 = A012.toString();
                        r0 = A00(charSequence2, start);
                        if (r0 != null) {
                            break;
                        }
                        Matcher matcher2 = A08.matcher(charSequence2);
                        if (matcher2.find()) {
                            String substring = charSequence2.substring(0, matcher2.start());
                            Pattern pattern2 = C203559oI.A0J;
                            CharSequence A013 = A01(substring, pattern2);
                            r0 = A00(A013.toString(), start);
                            if (r0 != null) {
                                break;
                            }
                            this.A00--;
                            int end = matcher2.end();
                            r0 = A00(A01(charSequence2.substring(end), pattern2).toString(), start + end);
                            if (r0 != null) {
                                break;
                            }
                            long j = this.A00 - 1;
                            this.A00 = j;
                            if (j > 0) {
                                while (matcher2.find()) {
                                    end = matcher2.start();
                                }
                                CharSequence A014 = A01(charSequence2.substring(0, end), pattern2);
                                if (!A014.equals(A013)) {
                                    r0 = A00(A014.toString(), start);
                                    if (r0 != null) {
                                        break;
                                    }
                                    this.A00--;
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    i = start + A012.length();
                    this.A00--;
                }
            }
            this.A01 = r0;
            if (r0 == null) {
                num = C023109s.A0C;
            } else {
                this.A03 = r0.A00 + r0.A01.length();
                num = C023109s.A01;
            }
            this.A02 = num;
        }
        return C36361kB.A1a(num, C023109s.A01);
    }

    public static CharSequence A01(CharSequence charSequence, Pattern pattern) {
        Matcher matcher = pattern.matcher(charSequence);
        if (matcher.find()) {
            return charSequence.subSequence(0, matcher.start());
        }
        return charSequence;
    }

    public static String A02(int i, int i2) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("{");
        A0u.append(i);
        A0u.append(",");
        A0u.append(i2);
        return AnonymousClass000.A0q("}", A0u);
    }

    public static boolean A03(char c) {
        if (Character.isLetter(c) || Character.getType(c) == 6) {
            Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
            if (of.equals(Character.UnicodeBlock.BASIC_LATIN) || of.equals(Character.UnicodeBlock.LATIN_1_SUPPLEMENT) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_A) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_B) || of.equals(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS)) {
                return true;
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            AnonymousClass9W4 r1 = this.A01;
            this.A01 = null;
            this.A02 = C023109s.A00;
            return r1;
        }
        throw C165617ti.A0e();
    }

    public void remove() {
        throw AnonymousClass001.A0D();
    }

    public AYC(C187568y7 r4, C203559oI r5, CharSequence charSequence, String str) {
        this.A06 = r5;
        this.A04 = charSequence;
        this.A07 = str;
        this.A05 = r4;
        this.A00 = Long.MAX_VALUE;
    }
}
