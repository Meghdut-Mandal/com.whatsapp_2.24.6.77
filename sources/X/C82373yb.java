package X;

import com.whatsapp.util.Log;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.3yb  reason: invalid class name and case insensitive filesystem */
public final class C82373yb extends C005302j implements CoroutineExceptionHandler {
    public final /* synthetic */ C51162nN A00;
    public final /* synthetic */ C34831hi A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82373yb(C51162nN r1, C34831hi r2, C12640iQ r3) {
        super(r3);
        this.A01 = r2;
        this.A00 = r1;
    }

    public void handleException(C005102h r4, Throwable th) {
        Log.e("AllowNonAdminGroupCreationManager/updateAllowNonAdminSubgroupCreationValue/", th);
        C62843Ht.A00(this.A01, this.A00, C51742oJ.FAILED);
    }
}
