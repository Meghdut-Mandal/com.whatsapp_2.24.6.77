package X;

import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: X.4jY  reason: invalid class name and case insensitive filesystem */
public class C94954jY extends C137896gu {
    public static C94954jY A01;
    public BreakIterator A00;

    public C94954jY(Locale locale) {
        this.A00 = BreakIterator.getCharacterInstance(locale);
    }

    public int[] B7W(int i) {
        int A012 = C137896gu.A01(this);
        if (A012 > 0 && i < A012) {
            if (i < 0) {
                i = 0;
            }
            do {
                BreakIterator breakIterator = this.A00;
                if (breakIterator == null) {
                    throw C36331k8.A0d("impl");
                } else if (!breakIterator.isBoundary(i)) {
                    i = breakIterator.following(i);
                } else {
                    int following = breakIterator.following(i);
                    if (following != -1) {
                        return A03(i, following);
                    }
                }
            } while (i != -1);
            return null;
        }
        return null;
    }

    public int[] Bm1(int i) {
        int A012 = C137896gu.A01(this);
        if (A012 > 0 && i > 0) {
            if (i > A012) {
                i = A012;
            }
            do {
                BreakIterator breakIterator = this.A00;
                if (breakIterator == null) {
                    throw C36331k8.A0d("impl");
                } else if (!breakIterator.isBoundary(i)) {
                    i = breakIterator.preceding(i);
                } else {
                    int preceding = breakIterator.preceding(i);
                    if (preceding != -1) {
                        return A03(preceding, i);
                    }
                }
            } while (i != -1);
            return null;
        }
        return null;
    }
}
