package X;

import com.whatsapp.util.Log;

/* renamed from: X.AAy  reason: case insensitive filesystem */
public abstract class C21164AAy implements C160077kQ {
    public final B2S A00;

    public final void BVM(Exception exc) {
        Log.e("FBUserEntityManagement : Network failed  while sending the payload");
        this.A00.BVK();
    }

    public final void BWk(Exception exc) {
        Log.e("FBUserEntityManagement : On error response while sending the payload");
        this.A00.BWk(exc);
    }

    public C21164AAy(B2S b2s) {
        this.A00 = b2s;
    }
}
