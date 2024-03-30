package X;

import com.whatsapp.util.Log;

/* renamed from: X.AoJ  reason: case insensitive filesystem */
public final class C22537AoJ extends AnonymousClass00R implements C006302t {
    public static final C22537AoJ A00 = new C22537AoJ();

    public C22537AoJ() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        Object r2;
        boolean z;
        C203399nx r4 = (C203399nx) obj;
        AnonymousClass00C.A0D(r4, 0);
        C203399nx A0c = r4.A0c("result");
        if (A0c == null) {
            Log.e("PasskeyServer/parsePasskeyExistsResponse/result node missing");
            return new C182138ob(new C1889291i("result node missing"));
        }
        byte[] bArr = A0c.A01;
        if (bArr != null) {
            str = C165607th.A0w(bArr);
        } else {
            str = null;
        }
        if (AnonymousClass00C.A0J(str, "true")) {
            z = C36371kC.A0m();
        } else if (AnonymousClass00C.A0J(str, "false")) {
            z = false;
        } else {
            C36321k7.A1P("PasskeyServer/parsePasskeyExistsResponse/bad data: ", str, AnonymousClass000.A0u());
            r2 = new C182138ob(new C1889291i(AnonymousClass000.A0p("bad data: ", str, AnonymousClass000.A0u())));
            C36321k7.A1K(r2, "PasskeyServer/parsePasskeyExistsResponse/success: ", AnonymousClass000.A0u());
            return r2;
        }
        r2 = new C182148oc(z);
        C36321k7.A1K(r2, "PasskeyServer/parsePasskeyExistsResponse/success: ", AnonymousClass000.A0u());
        return r2;
    }
}
