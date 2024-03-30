package X;

import java.util.regex.Pattern;

/* renamed from: X.9b4  reason: invalid class name and case insensitive filesystem */
public abstract class C197059b4 {
    public static final Pattern A00 = Pattern.compile("%([A-Fa-f0-9]{2})");
    public static final Pattern A01 = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
    public static final Pattern A02 = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
    public static final Pattern A03 = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    public static boolean A00(Object obj, Object obj2) {
        if (obj == null) {
            return AnonymousClass000.A1W(obj2);
        }
        return obj.equals(obj2);
    }
}
