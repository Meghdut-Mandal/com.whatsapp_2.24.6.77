package X;

/* renamed from: X.1Sv  reason: invalid class name and case insensitive filesystem */
public final class C28481Sv {
    public final String A00(String str, String str2, String str3) {
        int length;
        AnonymousClass00C.A0D(str3, 2);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(' ');
        if (!(str == null || (length = str.length()) == 0)) {
            if (((long) length) > 1024) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str.subSequence(0, 1020));
                sb2.append(8230);
                str = sb2.toString();
            }
            str3 = str;
        }
        sb.append(str3);
        return sb.toString();
    }
}
