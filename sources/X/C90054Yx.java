package X;

/* renamed from: X.4Yx  reason: invalid class name and case insensitive filesystem */
public class C90054Yx implements B2S {
    public Object A00;
    public final int A01;

    public void BWk(Exception exc) {
        AnonymousClass00C.A0D(exc, 0);
        ((AnonymousClass4TU) this.A00).onFailure(exc);
    }

    public C90054Yx(AnonymousClass4TU r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public void BVK() {
        int i = this.A01;
        AnonymousClass4TU r2 = (AnonymousClass4TU) this.A00;
        if (i != 0) {
            r2.onFailure(new Exception("AvatarUserManagementHelper/generateAvatarRefreshToken/onDeliveryFailure"));
        } else {
            r2.onFailure(new Exception("AvatarUserManagementHelper/deleteAvatarUser/onDeliveryFailure"));
        }
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
            ((AnonymousClass4TU) this.A00).onSuccess();
        }
    }
}
