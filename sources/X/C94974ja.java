package X;

import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: X.4ja  reason: invalid class name and case insensitive filesystem */
public final class C94974ja extends C137896gu {
    public static C94974ja A01;
    public BreakIterator A00;

    private final boolean A00(int i) {
        if (i < 0 || i >= C137896gu.A01(this)) {
            return false;
        }
        return Character.isLetterOrDigit(A02().codePointAt(i));
    }

    public C94974ja(Locale locale) {
        this.A00 = BreakIterator.getWordInstance(locale);
    }

    public int[] B7W(int i) {
        if (C137896gu.A01(this) > 0 && i < C137896gu.A01(this)) {
            if (i < 0) {
                i = 0;
            }
            while (!A00(i) && (!A00(i) || (i != 0 && A00(i - 1)))) {
                BreakIterator breakIterator = this.A00;
                if (breakIterator == null) {
                    throw C36331k8.A0d("impl");
                }
                i = breakIterator.following(i);
                if (i == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.A00;
            if (breakIterator2 == null) {
                throw C36331k8.A0d("impl");
            }
            int following = breakIterator2.following(i);
            if (following != -1 && following > 0 && A00(following - 1) && (following == C137896gu.A01(this) || !A00(following))) {
                return A03(i, following);
            }
        }
        return null;
    }

    public int[] Bm1(int i) {
        int A012 = C137896gu.A01(this);
        if (A012 > 0 && i > 0) {
            if (i > A012) {
                i = A012;
            }
            while (i > 0) {
                int i2 = i - 1;
                if (A00(i2) || (A00(i2) && (i == C137896gu.A01(this) || !A00(i)))) {
                    break;
                }
                BreakIterator breakIterator = this.A00;
                if (breakIterator == null) {
                    throw C36331k8.A0d("impl");
                }
                i = breakIterator.preceding(i);
                if (i == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.A00;
            if (breakIterator2 == null) {
                throw C36331k8.A0d("impl");
            }
            int preceding = breakIterator2.preceding(i);
            if (preceding != -1 && A00(preceding) && (preceding == 0 || !A00(preceding - 1))) {
                return A03(preceding, i);
            }
        }
        return null;
    }
}
