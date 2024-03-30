package X;

import com.whatsapp.util.Log;

/* renamed from: X.71a  reason: invalid class name and case insensitive filesystem */
public final class C1493871a implements C159807jx {
    public final /* synthetic */ C128936Ee A00;
    public final /* synthetic */ AnonymousClass5V6 A01;
    public final /* synthetic */ C120385rQ A02;
    public final /* synthetic */ Runnable A03;

    public C1493871a(C128936Ee r1, AnonymousClass5V6 r2, C120385rQ r3, Runnable runnable) {
        this.A00 = r1;
        this.A03 = runnable;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void BXH() {
        Log.e("BloksPreConsentGraphqlIntegrityCheckIqHelper/callForceSuspendState:onFailure");
        C120385rQ r2 = this.A02;
        AnonymousClass5V6 r1 = this.A01;
        AnonymousClass00C.A0D(r1, 0);
        r2.A00.A01.A01.A00(r1);
    }

    public void onSuccess() {
        Log.i("BloksPreConsentGraphqlIntegrityCheckIqHelper/callForceSuspendState:onSuccess");
        if (this.A00.A04()) {
            this.A03.run();
        }
    }
}
