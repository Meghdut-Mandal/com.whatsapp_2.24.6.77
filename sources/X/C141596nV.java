package X;

import com.google.android.gms.tasks.OnSuccessListener;
import com.whatsapp.util.Log;

/* renamed from: X.6nV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C141596nV implements OnSuccessListener {
    public final /* synthetic */ C590532l A00;
    public final /* synthetic */ Boolean A01;

    public /* synthetic */ C141596nV(C590532l r1, Boolean bool) {
        this.A00 = r1;
        this.A01 = bool;
    }

    public final void onSuccess(Object obj) {
        C590532l r3 = this.A00;
        Boolean bool = this.A01;
        Log.i("BackupTokenUtils/setBlockStoreBytes/bytes stored");
        if (r3 != null) {
            boolean booleanValue = bool.booleanValue();
            Log.i("BackupTokenProtocolHelper/encryptAndSaveToken/onSuccess");
            AnonymousClass1XF.A00(r3.A00.A03, (Exception) null, booleanValue);
        }
    }
}
