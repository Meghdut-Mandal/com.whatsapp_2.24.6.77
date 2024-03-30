package X;

/* renamed from: X.0mh  reason: invalid class name and case insensitive filesystem */
public abstract class C15100mh extends C06780Vb {
    public static final boolean A02(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
