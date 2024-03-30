package X;

import com.whatsapp.util.Log;

/* renamed from: X.AHt  reason: case insensitive filesystem */
public class C21341AHt implements C236119d {
    public final AnonymousClass19A A00;
    public final B2Q A01;

    public void BVN(String str) {
        Log.e("error delivering blocking chat psa");
        this.A01.BVK();
    }

    public void BiM(C203399nx r2, String str) {
        Log.i("success setting block status for chat psa");
        this.A01.Bi9(r2);
    }

    public C21341AHt(B2Q b2q, AnonymousClass19A r2) {
        this.A00 = r2;
        this.A01 = b2q;
    }

    public void BWw(C203399nx r4, String str) {
        int A002 = AnonymousClass3ME.A00(r4);
        C36321k7.A1S("error blocking chat psa ", AnonymousClass000.A0u(), A002);
        this.A01.onError(A002);
    }
}
