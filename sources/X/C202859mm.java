package X;

import android.text.TextUtils;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.9mm  reason: invalid class name and case insensitive filesystem */
public abstract class C202859mm {
    public static final ThreadLocal A00 = new C21846AbP();
    public static final Pattern A01 = Pattern.compile("[\\p{ASCII}&&[^\\p{Alnum}]]");
    public static final ThreadLocal A02 = new C21847AbQ();

    public static ArrayList A03(C18820ts r1, String str) {
        Object obj = A00(r1, str, true).A01;
        C18740tg.A06(obj);
        return (ArrayList) obj;
    }

    public static boolean A04(C18820ts r9, String str, List list, boolean z) {
        boolean equals;
        if (str == null) {
            return false;
        }
        String replaceAll = A01.matcher(str).replaceAll(" ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            BreakIterator A022 = A02(r9);
            A022.setText(replaceAll);
            int first = A022.first();
            while (true) {
                int next = A022.next();
                int i = first;
                first = next;
                if (next == -1) {
                    return false;
                }
                String A05 = AnonymousClass14B.A05(replaceAll.substring(i, next));
                if (z) {
                    equals = A05.startsWith(A0C);
                    continue;
                } else {
                    equals = A05.equals(A0C);
                    continue;
                }
                if (equals) {
                }
            }
        }
        return true;
    }

    public static AnonymousClass00I A00(C18820ts r9, String str, boolean z) {
        String A06;
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        if (!TextUtils.isEmpty(str)) {
            String replaceAll = A01.matcher(str).replaceAll(" ");
            BreakIterator A022 = A02(r9);
            A022.setText(replaceAll);
            int first = A022.first();
            while (true) {
                int next = A022.next();
                int i = first;
                first = next;
                if (next == -1) {
                    break;
                }
                String substring = replaceAll.substring(i, next);
                if (z) {
                    A06 = AnonymousClass14B.A05(substring);
                } else {
                    A06 = AnonymousClass14B.A06(substring);
                }
                if (!TextUtils.isEmpty(A06) && !Character.isSpaceChar(A06.codePointAt(0))) {
                    AnonymousClass000.A1F(A0I2, i);
                    AnonymousClass000.A1F(A0I2, next);
                    A0I.add(A06);
                }
            }
        }
        return new AnonymousClass00I(A0I2, A0I);
    }

    public static String A01(C18820ts r9, String str) {
        if (str.isEmpty()) {
            return str;
        }
        boolean z = false;
        if (!C165587tf.A1a(str, C1906699v.A00)) {
            z = true;
            str = AnonymousClass14B.A06(str);
        }
        StringBuilder A0h = C90524aI.A0h(str.length());
        BreakIterator A022 = A02(r9);
        A022.setText(str);
        int first = A022.first();
        while (true) {
            int next = A022.next();
            int i = first;
            first = next;
            if (next == -1) {
                break;
            } else if (next - i != 1 || str.codePointAt(i) != 32) {
                CharSequence subSequence = str.subSequence(i, next);
                if (!z) {
                    subSequence = AnonymousClass14B.A06(subSequence);
                }
                A0h.append(subSequence);
                A0h.append(' ');
            }
        }
        if (A0h.length() > 0) {
            A0h.setLength(A0h.length() - 1);
        }
        return A0h.toString();
    }

    public static BreakIterator A02(C18820ts r3) {
        Locale A0x = C36401kF.A0x(r3);
        ThreadLocal threadLocal = A00;
        if (A0x.equals(threadLocal.get())) {
            return (BreakIterator) A02.get();
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(A0x);
        threadLocal.set(A0x);
        A02.set(wordInstance);
        return wordInstance;
    }
}
