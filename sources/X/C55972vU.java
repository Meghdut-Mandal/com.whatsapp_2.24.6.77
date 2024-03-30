package X;

/* renamed from: X.2vU  reason: invalid class name and case insensitive filesystem */
public abstract class C55972vU {
    public static final String A00(String str) {
        String str2;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 191367207) {
                if (hashCode == 272787191) {
                    str2 = "UNBANNED";
                } else if (hashCode == 1951953694) {
                    str2 = "BANNED";
                }
                if (!str.equals(str2)) {
                    return "UNKNOWN_IN_CLIENT";
                }
                return str;
            } else if (str.equals("CHECKPOINTED")) {
                return str;
            }
        }
        return "UNKNOWN_IN_CLIENT";
    }
}
