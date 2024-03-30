package X;

import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.OutcomeReceiver;
import android.util.Log;

/* renamed from: X.9q5  reason: invalid class name and case insensitive filesystem */
public final class C204489q5 implements OutcomeReceiver {
    public final /* synthetic */ C207779wy A00;
    public final /* synthetic */ B0O A01;

    public C204489q5(B0O b0o, C207779wy r2) {
        this.A01 = b0o;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ void onError(Throwable th) {
        GetCredentialException getCredentialException = (GetCredentialException) th;
        AnonymousClass00C.A0D(getCredentialException, 0);
        Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
        this.A01.BWn(C207779wy.A02(getCredentialException));
    }

    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) obj;
        AnonymousClass00C.A0D(getCredentialResponse, 0);
        Log.i("CredManProvService", "GetCredentialResponse returned from framework");
        B0O b0o = this.A01;
        AnonymousClass9BY A002 = C207779wy.A00(getCredentialResponse);
        AnonymousClass00C.A0D(A002, 0);
        ((C023509x) ((C23202B9k) b0o).A00).resumeWith(A002);
    }
}
