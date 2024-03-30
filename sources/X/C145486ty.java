package X;

import com.whatsapp.util.Log;

/* renamed from: X.6ty  reason: invalid class name and case insensitive filesystem */
public final class C145486ty implements C160057kO {
    public final /* synthetic */ AnonymousClass61K A00;
    public final /* synthetic */ AnonymousClass1UD A01;

    public void BWk(Exception exc) {
        C36321k7.A1S("WaffleClientCacheImpl/fetchDataFromServerWithHandler:onFailure Error code: ", AnonymousClass000.A0u(), 1);
    }

    public C145486ty(AnonymousClass61K r1, AnonymousClass1UD r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BVK() {
        Log.e("WaffleClientCacheImpl/fetchDataFromServerWithHandler:onDeliveryFailure");
    }

    public void Bi5(AnonymousClass6OQ r10) {
        AnonymousClass1UD r5 = this.A01;
        AnonymousClass61K r4 = this.A00;
        AnonymousClass1UG r3 = r5.A01;
        if (r3 != null) {
            AnonymousClass6P0 r2 = C113435fX.A00;
            AnonymousClass6GB r1 = new AnonymousClass6GB(r5, 1);
            AnonymousClass00C.A0D(r2, 1);
            C146046uw B4Z = r3.B4Z(r2, (C110925bS) null, r1, (Long) null);
            B4Z.Blp(new C165527tZ(r4, r5, C128936Ee.A00(), B4Z, 1));
            return;
        }
        throw C36331k8.A0d("autoTokenRefreshFactory");
    }
}
