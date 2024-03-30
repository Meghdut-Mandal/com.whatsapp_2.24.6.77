package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;
import java.io.File;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.9mj  reason: invalid class name and case insensitive filesystem */
public abstract class C202829mj {
    public static Pattern A00 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$");
    public static final Pattern A01 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$");

    public static C21664AUg A01(File file, String str, long j, long j2, long j3) {
        long j4 = j3;
        File file2 = file;
        if (j3 <= 0) {
            j4 = file.length();
        }
        return new C21664AUg(file2, str, j, j4, j2, true);
    }

    public static C21664AUg A00(File file, long j, long j2, boolean z, boolean z2) {
        int lastIndexOf;
        int lastIndexOf2;
        long j3 = j2;
        long j4 = j;
        File file2 = file;
        if (z2) {
            String name = file2.getName();
            int lastIndexOf3 = name.lastIndexOf(46);
            if (lastIndexOf3 == -1 || (lastIndexOf = name.lastIndexOf(46, lastIndexOf3 - 1)) == -1 || (lastIndexOf2 = name.lastIndexOf(46, lastIndexOf - 1)) == -1) {
                return null;
            }
            String substring = name.substring(lastIndexOf2 + 1, lastIndexOf);
            int lastIndexOf4 = name.lastIndexOf(46, lastIndexOf2 - 1);
            if (lastIndexOf4 == -1) {
                return null;
            }
            String substring2 = name.substring(lastIndexOf4 + 1, lastIndexOf2);
            String A0z = C90514aH.A0z(name, lastIndexOf4);
            if (j == -1) {
                j4 = file2.length();
            }
            if (j4 == 0) {
                return null;
            }
            if (j2 == -9223372036854775807L) {
                try {
                    j3 = Long.parseLong(substring);
                } catch (NumberFormatException e) {
                    Log.e("CacheSpan", AnonymousClass000.A0p("invalid filename: ", name, AnonymousClass000.A0u()), e);
                    return null;
                }
            }
            return A01(file2, A0z, Long.parseLong(substring2), j3, j4);
        }
        Matcher matcher = A01.matcher(file2.getName());
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        if (!z) {
            int length = group.length();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (group.charAt(i3) == '%') {
                    i2++;
                }
            }
            if (i2 != 0) {
                int i4 = length - (i2 * 2);
                StringBuilder A0h = C90524aI.A0h(i4);
                Matcher matcher2 = Util.A05.matcher(group);
                while (i2 > 0 && matcher2.find()) {
                    String group2 = matcher2.group(1);
                    Objects.requireNonNull(group2);
                    char parseInt = (char) Integer.parseInt(group2, 16);
                    A0h.append(group, i, matcher2.start());
                    A0h.append(parseInt);
                    i = matcher2.end();
                    i2--;
                }
                if (i < length) {
                    A0h.append(group, i, length);
                }
                if (A0h.length() != i4) {
                    return null;
                }
                group = A0h.toString();
            }
            return A01(file2, group, Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)), j4);
        }
        if (group == null) {
            return null;
        }
        return A01(file2, group, Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)), j4);
    }

    public static C21664AUg A02(String str, long j) {
        return new C21664AUg((File) null, str, j, -1, -1, false);
    }

    public static File A03(File file, String str, long j, long j2, boolean z) {
        if (!z) {
            int length = str.length();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (Util.A0C(str.charAt(i3))) {
                    i2++;
                }
            }
            if (i2 != 0) {
                StringBuilder A0h = C90524aI.A0h((i2 * 2) + length);
                while (i2 > 0) {
                    int i4 = i + 1;
                    char charAt = str.charAt(i);
                    if (Util.A0C(charAt)) {
                        A0h.append('%');
                        C90504aG.A0z(charAt, A0h);
                        i2--;
                    } else {
                        A0h.append(charAt);
                    }
                    i = i4;
                }
                if (i < length) {
                    A0h.append(str, i, length);
                }
                str = A0h.toString();
            }
        }
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append(".");
        A0v.append(j);
        A0v.append(".");
        A0v.append(j2);
        return C90464aC.A0K(file, ".v2.exo", A0v);
    }

    public static File A04(File file, boolean z) {
        Matcher matcher = A00.matcher(file.getName());
        if (!matcher.matches()) {
            return file;
        }
        File A03 = A03(file.getParentFile(), matcher.group(1), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)), z);
        file.renameTo(A03);
        return A03;
    }
}
