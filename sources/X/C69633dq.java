package X;

import com.whatsapp.util.Log;

/* renamed from: X.3dq  reason: invalid class name and case insensitive filesystem */
public final class C69633dq implements C88404So {
    public final /* synthetic */ AnonymousClass4SV A00;
    public final /* synthetic */ C24971Em A01;

    public C69633dq(AnonymousClass4SV r1, C24971Em r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BXH() {
        Log.i("WabaiConsentManager/accept/error");
        this.A00.BfK(false);
    }

    public void onSuccess() {
        Log.i("WabaiConsentManager/accept/success");
        ((C63473Ke) this.A01.A04.getValue()).A03("yes", true);
        this.A00.BfK(true);
    }
}
