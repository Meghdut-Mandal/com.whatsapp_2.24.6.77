package X;

import android.net.Uri;

/* renamed from: X.67I  reason: invalid class name */
public final class AnonymousClass67I {
    public final /* synthetic */ C1271967i A00;
    public final /* synthetic */ C100674vP A01;
    public final /* synthetic */ C160377ku A02;
    public final /* synthetic */ C160377ku A03;

    public void A00(Uri uri) {
        AnonymousClass00C.A0D(uri, 0);
        C160377ku r4 = this.A03;
        if (r4 != null) {
            C1271967i r0 = this.A00;
            AnonymousClass6JI.A00(this.A01, new AnonymousClass6MO(C36341k9.A0m(uri.toString(), C36411kG.A1b(r0), 1)), r4);
        }
    }

    public AnonymousClass67I(C1271967i r1, C100674vP r2, C160377ku r3, C160377ku r4) {
        this.A03 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r4;
    }

    public void A01(Integer num) {
        String str;
        C160377ku r4 = this.A02;
        if (r4 != null) {
            C1271967i r0 = this.A00;
            C100674vP r3 = this.A01;
            Object[] A1b = C36411kG.A1b(r0);
            switch (num.intValue()) {
                case 0:
                    str = "file_not_found";
                    break;
                case 1:
                    str = "invalid_parameter";
                    break;
                default:
                    str = "internal_error";
                    break;
            }
            AnonymousClass6JI.A00(r3, new AnonymousClass6MO(C36341k9.A0m(str, A1b, 1)), r4);
        }
    }
}
