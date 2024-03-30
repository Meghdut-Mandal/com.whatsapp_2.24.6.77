package X;

import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* renamed from: X.6O2  reason: invalid class name */
public class AnonymousClass6O2 {
    public InputMethodSubtype A00;
    public Set A01;
    public final C21060yb A02;

    public Locale A01() {
        InputMethodManager A0N = this.A02.A0N();
        C18740tg.A06(A0N);
        C18740tg.A06(A0N);
        InputMethodSubtype currentInputMethodSubtype = A0N.getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype == null || !currentInputMethodSubtype.getMode().equals("keyboard")) {
            return null;
        }
        InputMethodSubtype inputMethodSubtype = this.A00;
        if (!(inputMethodSubtype == null || inputMethodSubtype == currentInputMethodSubtype || inputMethodSubtype.equals(currentInputMethodSubtype))) {
            A00();
        }
        this.A00 = currentInputMethodSubtype;
        if (this.A01 == null) {
            A00();
        }
        Set set = this.A01;
        if (set == null || !set.contains(currentInputMethodSubtype)) {
            return null;
        }
        String locale = currentInputMethodSubtype.getLocale();
        if (TextUtils.isEmpty(locale)) {
            return null;
        }
        if (Pattern.matches("[a-z]{2}_[A-Z]{2}", locale)) {
            return Locale.forLanguageTag(locale.replace("_", "-"));
        }
        if (Pattern.matches("[a-z]{2}", locale)) {
            return new Locale(locale);
        }
        C36321k7.A1P("keyboardLanguageExtractor/error/cannot parse locale ", locale, AnonymousClass000.A0u());
        return null;
    }

    public TreeSet A02() {
        String str;
        int length;
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        InputMethodManager A0N = this.A02.A0N();
        C18740tg.A06(A0N);
        for (InputMethodInfo enabledInputMethodSubtypeList : A0N.getEnabledInputMethodList()) {
            for (InputMethodSubtype next : A0N.getEnabledInputMethodSubtypeList(enabledInputMethodSubtypeList, true)) {
                if (next.getMode().equals("keyboard")) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        str = next.getLanguageTag();
                    } else {
                        str = "";
                    }
                    if (str.isEmpty()) {
                        str = new Locale(next.getLocale()).getLanguage();
                    }
                    if (str.isEmpty() || (length = str.length()) < 2) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("KeyboardLanguageExtractor/getTwoLetterLanguageCode/unexpected language result from input method, language: '");
                        A0u.append(str);
                        C36341k9.A1O(A0u, "'");
                    } else if (length <= 2 || (str = C90514aH.A0z(str, 2)) != null) {
                        treeSet.add(str);
                    }
                }
            }
        }
        return treeSet;
    }

    public AnonymousClass6O2(C21060yb r1) {
        this.A02 = r1;
    }

    private void A00() {
        this.A01 = C36441kJ.A16();
        InputMethodManager A0N = this.A02.A0N();
        C18740tg.A06(A0N);
        C18740tg.A06(A0N);
        for (InputMethodInfo next : A0N.getEnabledInputMethodList()) {
            if (next.getId().startsWith("com.google.android.inputmethod")) {
                this.A01.addAll(A0N.getEnabledInputMethodSubtypeList(next, true));
            }
        }
    }
}
