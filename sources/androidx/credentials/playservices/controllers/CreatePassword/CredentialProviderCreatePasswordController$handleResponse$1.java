package androidx.credentials.playservices.controllers.CreatePassword;

import X.AnonymousClass00C;
import X.AnonymousClass00R;
import X.AnonymousClass00S;
import X.AnonymousClass0AJ;
import X.C009003v;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CredentialProviderController;

public final class CredentialProviderCreatePasswordController$handleResponse$1 extends AnonymousClass00R implements C009003v {
    public static final CredentialProviderCreatePasswordController$handleResponse$1 INSTANCE = new CredentialProviderCreatePasswordController$handleResponse$1();

    public CredentialProviderCreatePasswordController$handleResponse$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((CancellationSignal) obj, (AnonymousClass00S) obj2);
        return AnonymousClass0AJ.A00;
    }

    public final void invoke(CancellationSignal cancellationSignal, AnonymousClass00S r3) {
        AnonymousClass00C.A0D(r3, 1);
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, r3);
    }
}
