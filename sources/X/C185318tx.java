package X;

import java.util.ArrayList;

/* renamed from: X.8tx  reason: invalid class name and case insensitive filesystem */
public final class C185318tx extends C118095nK implements C22838Awn {
    public final C184088rs A00;

    public C185318tx(C203399nx r6) {
        Object obj;
        C203399nx.A0A(r6, "picture");
        C22993Azj[] azjArr = new C22993Azj[4];
        azjArr[0] = AME.A00;
        azjArr[1] = AMF.A00;
        azjArr[2] = AMG.A00;
        ArrayList A0d = C165567td.A0d(AMH.A00, azjArr, 3);
        String[] strArr = new String[0];
        C203539oF r0 = C203379ns.A00;
        AnonymousClass00C.A0D(r6, 0);
        try {
            obj = r0.A0a(r6, "PictureDidNotChange|PictureNotFound|BadServerProfilePictureError|BadLinkedGroupProfilePictureError", A0d, strArr);
        } catch (C235919b unused) {
            obj = null;
        }
        this.A00 = (C184088rs) obj;
        this.A00 = r6;
    }
}
