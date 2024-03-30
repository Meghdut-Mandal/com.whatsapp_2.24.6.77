package X;

/* renamed from: X.3nL  reason: invalid class name and case insensitive filesystem */
public final class C75503nL implements C87954Qv {
    public void BU5(Integer num) {
        String str;
        StringBuilder A0i = C36341k9.A0i(num);
        A0i.append("contactinfo/maybeverifyidentitykeys Identity verification for contact and self completed with result: ");
        switch (num.intValue()) {
            case 0:
                str = "SUCCESS";
                break;
            case 1:
                str = "PENDING";
                break;
            default:
                str = "FAIL";
                break;
        }
        C36321k7.A1Z(A0i, str);
    }
}
