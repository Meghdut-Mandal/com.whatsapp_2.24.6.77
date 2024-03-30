package X;

import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: X.5nn  reason: invalid class name and case insensitive filesystem */
public final class C118385nn {
    public final CharSequence A00;
    public final BreakIterator A01;

    public C118385nn(CharSequence charSequence, Locale locale, int i) {
        this.A00 = charSequence;
        if (0 > charSequence.length()) {
            throw AnonymousClass001.A08("input start index is outside the CharSequence");
        } else if (i < 0 || i > charSequence.length()) {
            throw AnonymousClass001.A08("input end index is outside the CharSequence");
        } else {
            BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
            this.A01 = wordInstance;
            charSequence.length();
            wordInstance.setText(new AnonymousClass75P(charSequence, i));
        }
    }
}
