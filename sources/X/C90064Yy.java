package X;

import com.whatsapp.util.Log;

/* renamed from: X.4Yy  reason: invalid class name and case insensitive filesystem */
public class C90064Yy implements B2S {
    public Object A00;
    public final int A01;

    public C90064Yy(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BVK() {
        if (this.A01 != 0) {
            ((AnonymousClass4TU) this.A00).onFailure(new Exception("AvatarUserManagementHelper/createAvatarUser/onDeliveryFailure"));
        } else {
            Log.e("DeleteAccountConfirmation/Failed to delete shops user.");
        }
    }

    public void BWk(Exception exc) {
        if (this.A01 != 0) {
            AnonymousClass00C.A0D(exc, 0);
            ((AnonymousClass4TU) this.A00).onFailure(exc);
            return;
        }
        Log.e("DeleteAccountConfirmation/Failed to delete shops user.");
    }

    public void Bi5(AnonymousClass6OQ r3) {
        if (this.A01 != 0) {
            AnonymousClass4TU r1 = (AnonymousClass4TU) this.A00;
            if (r3 != null) {
                r1.onSuccess();
            } else {
                r1.onFailure(AnonymousClass001.A09("Avatar User Entity is null"));
            }
        } else {
            Log.i("DeleteAccountConfirmation/Shops user deleted successfully.");
        }
    }
}
