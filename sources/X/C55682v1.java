package X;

/* renamed from: X.2v1  reason: invalid class name and case insensitive filesystem */
public abstract class C55682v1 {
    public static String A00(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 272787191:
                    if (str.equals("UNBANNED")) {
                        return "UNBANNED";
                    }
                    break;
                case 527514546:
                    if (str.equals("IN_REVIEW")) {
                        return "IN_REVIEW";
                    }
                    break;
                case 1166090011:
                    if (str.equals("NO_APPEAL_OPENED")) {
                        return "NO_APPEAL_OPENED";
                    }
                    break;
                case 1951953694:
                    if (str.equals("BANNED")) {
                        return "BANNED";
                    }
                    break;
            }
        }
        return "UNKNOWN_IN_CLIENT";
    }
}
