package X;

import java.util.ArrayList;

/* renamed from: X.8ty  reason: invalid class name and case insensitive filesystem */
public final class C185328ty extends C118095nK implements C22838Awn {
    public final C183998rj A00;
    public final C184488sW A01;
    public final C22839Awo A02;

    public C185328ty(C203399nx r6) {
        Object obj;
        C203399nx.A0A(r6, "picture");
        this.A00 = (C183998rj) C203539oF.A02(r6, AMU.A00, 0);
        this.A01 = (C184488sW) C203539oF.A02(r6, AMV.A00, 0);
        C22993Azj[] azjArr = new C22993Azj[2];
        azjArr[0] = AMW.A00;
        ArrayList A0c = C165567td.A0c(AMX.A00, azjArr);
        String[] strArr = new String[0];
        C203539oF r0 = C203379ns.A00;
        AnonymousClass00C.A0D(r6, 0);
        try {
            obj = r0.A0a(r6, "ProfilePictureUrlResponse|ProfilePictureBlobResponse", A0c, strArr);
        } catch (C235919b unused) {
            obj = null;
        }
        this.A02 = (C22839Awo) obj;
        this.A00 = r6;
    }
}
