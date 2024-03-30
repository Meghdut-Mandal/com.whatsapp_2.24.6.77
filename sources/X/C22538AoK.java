package X;

import com.whatsapp.util.Log;

/* renamed from: X.AoK  reason: case insensitive filesystem */
public final class C22538AoK extends AnonymousClass00R implements C006302t {
    public static final C22538AoK A00 = new C22538AoK();

    public C22538AoK() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C203399nx r3 = (C203399nx) obj;
        AnonymousClass00C.A0D(r3, 0);
        C203399nx A0c = r3.A0c("credential_create");
        if (A0c == null) {
            Log.e("PasskeyServer/parseStartRegisterResponse/credential_create node missing");
            return new C182138ob(new C1889291i("credential_create node missing"));
        }
        byte[] bArr = A0c.A01;
        if (bArr != null) {
            return new C182148oc(C165607th.A0w(bArr));
        }
        Log.e("PasskeyServer/parseStartRegisterResponse/credential_create node has no data");
        return new C182138ob(new C1889291i("credential_create node not set"));
    }
}
