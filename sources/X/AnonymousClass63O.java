package X;

/* renamed from: X.63O  reason: invalid class name */
public final class AnonymousClass63O {
    public final /* synthetic */ C160377ku A00;
    public final /* synthetic */ C1271967i A01;
    public final /* synthetic */ C100674vP A02;
    public final /* synthetic */ C160377ku A03;

    public AnonymousClass63O(C1271967i r1, C100674vP r2, C160377ku r3, C160377ku r4) {
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r4;
    }

    public void A00(Integer num) {
        String str;
        C160377ku r4 = this.A00;
        if (r4 != null) {
            C1271967i r0 = this.A01;
            C100674vP r3 = this.A02;
            Object[] A1b = C36411kG.A1b(r0);
            switch (num.intValue()) {
                case 0:
                    str = "NOT_AVAILABLE";
                    break;
                case 1:
                    str = "NO_PERMISSION";
                    break;
                case 2:
                    str = "USER_CANCELLED";
                    break;
                default:
                    str = "INTERNAL_ERROR";
                    break;
            }
            AnonymousClass6JI.A00(r3, new AnonymousClass6MO(C36341k9.A0m(str, A1b, 1)), r4);
        }
    }
}
