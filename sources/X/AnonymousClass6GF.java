package X;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.6GF  reason: invalid class name */
public abstract class AnonymousClass6GF {
    public static final LocaleSpan A00(AnonymousClass75Q r3) {
        ArrayList A0J = C36321k7.A0J(r3);
        Iterator it = r3.iterator();
        while (it.hasNext()) {
            A0J.add(AnonymousClass68T.A00(it.next()));
        }
        Locale[] localeArr = (Locale[]) A0J.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public static final void A01(AnonymousClass75Q r3, C91764ca r4) {
        ArrayList A0J = C36321k7.A0J(r3);
        Iterator it = r3.iterator();
        while (it.hasNext()) {
            A0J.add(AnonymousClass68T.A00(it.next()));
        }
        Locale[] localeArr = (Locale[]) A0J.toArray(new Locale[0]);
        r4.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
