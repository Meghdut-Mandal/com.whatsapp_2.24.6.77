package X;

/* renamed from: X.9Oz  reason: invalid class name and case insensitive filesystem */
public final class C194299Oz {
    public final String A00(String str, String str2) {
        String A0y;
        if (str == null || (A0y = C36371kC.A0y(str)) == null) {
            return str;
        }
        String A05 = AnonymousClass098.A05(A0y, "-", "", false);
        if (!AnonymousClass00C.A0J(str2, "cep") || A05.length() <= 5) {
            return str;
        }
        StringBuilder A0i = C90524aI.A0i(A05);
        A0i.insert(5, '-');
        return A0i.toString();
    }
}
