package X;

import com.whatsapp.util.Log;

/* renamed from: X.3db  reason: invalid class name and case insensitive filesystem */
public final class C69483db implements B2Q {
    public final /* synthetic */ AnonymousClass1NG A00;

    public void BVK() {
    }

    public void Bi9(C203399nx r5) {
        AnonymousClass00C.A0D(r5, 0);
        Log.i("success getting chat block status");
        AnonymousClass1NG r3 = this.A00;
        r3.A0J.Boy(new C1501874h(r3, r5, 2));
    }

    public C69483db(AnonymousClass1NG r1) {
        this.A00 = r1;
    }

    public void onError(int i) {
        C36321k7.A1S("error getting chat block status ", AnonymousClass000.A0u(), i);
    }
}
