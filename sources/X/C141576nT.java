package X;

import com.google.android.gms.tasks.OnFailureListener;
import com.whatsapp.util.Log;

/* renamed from: X.6nT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C141576nT implements OnFailureListener {
    public final /* synthetic */ C590532l A00;
    public final /* synthetic */ Boolean A01;

    public /* synthetic */ C141576nT(C590532l r1, Boolean bool) {
        this.A00 = r1;
        this.A01 = bool;
    }

    public final void onFailure(Exception exc) {
        C590532l r1 = this.A00;
        Boolean bool = this.A01;
        Log.e("BackupTokenUtils/setBlockStoreBytes/exception storing bytes", exc);
        if (r1 != null) {
            Log.e("BackupTokenProtocolHelper/encryptAndSaveToken/onFailure", exc);
            AnonymousClass1XF.A00(r1.A00.A03, exc, bool.booleanValue());
        }
    }
}
