package X;

import java.util.regex.Pattern;

/* renamed from: X.8TA  reason: invalid class name */
public class AnonymousClass8TA extends C200269h0 {
    public final Pattern A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass8TA)) {
                return false;
            }
            Pattern pattern = this.A00;
            Pattern pattern2 = ((AnonymousClass8TA) obj).A00;
            if (pattern == null) {
                return pattern2 == null;
            }
            if (!pattern.equals(pattern2)) {
                return false;
            }
        }
    }

    public String toString() {
        String str = this.A02;
        if (str.startsWith("/")) {
            return str;
        }
        StringBuilder A0k = C36331k8.A0k("/", str);
        A0k.append("/");
        return AnonymousClass000.A0q(this.A01, A0k);
    }

    public AnonymousClass8TA(CharSequence charSequence) {
        String str;
        int i;
        String charSequence2 = charSequence.toString();
        int indexOf = charSequence2.indexOf(47);
        int lastIndexOf = charSequence2.lastIndexOf(47);
        String substring = charSequence2.substring(indexOf + 1, lastIndexOf);
        this.A02 = substring;
        int i2 = lastIndexOf + 1;
        if (charSequence2.length() > i2) {
            str = charSequence2.substring(i2);
        } else {
            str = "";
        }
        this.A01 = str;
        int i3 = 0;
        for (char c : str.toCharArray()) {
            Integer[] A002 = C023109s.A00(7);
            int length = A002.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    i = 0;
                    break;
                }
                Integer num = A002[i4];
                if (C200389hK.A00(num) == c) {
                    i = C200389hK.A01(num);
                    break;
                }
                i4++;
            }
            i3 |= i;
        }
        this.A00 = Pattern.compile(substring, i3);
    }

    public AnonymousClass8TA(Pattern pattern) {
        this.A02 = pattern.pattern();
        this.A00 = pattern;
        int flags = pattern.flags();
        StringBuilder A0u = AnonymousClass000.A0u();
        for (Integer num : C023109s.A00(7)) {
            int A012 = C200389hK.A01(num);
            if ((A012 & flags) == A012) {
                A0u.append(C200389hK.A00(num));
            }
        }
        this.A01 = A0u.toString();
    }
}
