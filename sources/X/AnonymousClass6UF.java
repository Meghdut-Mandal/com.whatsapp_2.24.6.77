package X;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.6UF  reason: invalid class name */
public abstract class AnonymousClass6UF {
    public static String A01(String str) {
        return C90514aH.A0z(A03(str, new Date()), str.indexOf(46) + 1);
    }

    public static String A02(String str, String str2) {
        return C36321k7.A0D(str.substring(str.indexOf(46)), str2);
    }

    public static String A03(String str, Date date) {
        StringBuilder A0v = AnonymousClass000.A0v(C90514aH.A0z(str, str.indexOf(46)));
        A0v.append("-");
        return AnonymousClass000.A0q(new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(date), A0v);
    }

    public static String A00(File file, String str, Date date) {
        String A03 = A03(file.getName(), date);
        String A02 = A02(file.getName(), str);
        File[] listFiles = file.getParentFile().listFiles();
        File file2 = null;
        if (listFiles != null) {
            int i = 0;
            for (File file3 : listFiles) {
                String name = file3.getName();
                if (name.startsWith(A03) && name.endsWith(A02)) {
                    int length = A03.length() + 1;
                    int length2 = name.length();
                    int length3 = length2 - A02.length();
                    if (length3 < length2 && length < length3) {
                        try {
                            int parseInt = Integer.parseInt(name.substring(length, length3));
                            if (parseInt > i) {
                                file2 = file3;
                                i = parseInt;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        if (file2 != null) {
            return file2.getName();
        }
        return AnonymousClass000.A0p(".1", A02, AnonymousClass000.A0v(A03));
    }
}
