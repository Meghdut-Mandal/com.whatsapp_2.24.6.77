package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.0ck  reason: invalid class name and case insensitive filesystem */
public final class C09670ck implements C17180qr {
    public static final Locale A01;
    public static final Locale A02 = new Locale("ar", "XB");
    public static final Locale A03 = new Locale("en", "XA");
    public static final Locale[] A04 = new Locale[0];
    public final Locale[] A00;

    static {
        Locale locale;
        C07530Yc r0 = C07530Yc.A01;
        String str = "-";
        if (!"en-Latn".contains(str)) {
            str = "_";
            if (!"en-Latn".contains(str)) {
                locale = new Locale("en-Latn");
                A01 = locale;
            }
        }
        String[] split = "en-Latn".split(str, -1);
        int length = split.length;
        if (length > 2) {
            locale = new Locale(split[0], split[1], split[2]);
        } else if (length > 1) {
            locale = new Locale(split[0], split[1]);
        } else if (length == 1) {
            locale = new Locale(split[0]);
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Can not parse language tag: [");
            A0u.append("en-Latn");
            throw AnonymousClass000.A0c("]", A0u);
        }
        A01 = locale;
    }

    public Locale B85(int i) {
        Locale[] localeArr = this.A00;
        if (0 < localeArr.length) {
            return localeArr[0];
        }
        return null;
    }

    public Object BDc() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C09670ck) {
                Locale[] localeArr = ((C09670ck) obj).A00;
                Locale[] localeArr2 = this.A00;
                int length = localeArr2.length;
                if (length == localeArr.length) {
                    int i = 0;
                    while (i < length) {
                        if (localeArr2[i].equals(localeArr[i])) {
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (Locale hashCode : this.A00) {
            i = (i * 31) + hashCode.hashCode();
        }
        return i;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1Q(this.A00.length);
    }

    public C09670ck(Locale... localeArr) {
        Locale[] localeArr2;
        int length = localeArr.length;
        if (length == 0) {
            localeArr2 = A04;
        } else {
            ArrayList A0I = AnonymousClass001.A0I();
            HashSet hashSet = new HashSet();
            int i = 0;
            do {
                Locale locale = localeArr[i];
                if (locale != null) {
                    if (!hashSet.contains(locale)) {
                        Locale locale2 = (Locale) locale.clone();
                        A0I.add(locale2);
                        locale2.getCountry();
                        hashSet.add(locale2);
                    }
                    i++;
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("list[");
                    A0u.append(i);
                    throw AnonymousClass001.A0A(AnonymousClass000.A0q("] is null", A0u));
                }
            } while (i < length);
            localeArr2 = (Locale[]) A0I.toArray(new Locale[0]);
        }
        this.A00 = localeArr2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.A00;
            int length = localeArr.length;
            if (i >= length) {
                return AnonymousClass000.A0q("]", A0u);
            }
            A0u.append(localeArr[i]);
            if (i < length - 1) {
                A0u.append(',');
            }
            i++;
        }
    }
}
