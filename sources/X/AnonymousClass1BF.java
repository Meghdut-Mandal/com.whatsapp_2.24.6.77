package X;

import com.whatsapp.productinfra.avatar.data.AvatarConfigRepository$hasAvatarAwait$2;
import com.whatsapp.util.Log;

/* renamed from: X.1BF  reason: invalid class name */
public final class AnonymousClass1BF {
    public final AnonymousClass004 A00;
    public final AnonymousClass004 A01;
    public final C005502l A02;
    public final AnonymousClass004 A03;

    public AnonymousClass1BF(AnonymousClass004 r2, AnonymousClass004 r3, AnonymousClass004 r4, C005502l r5) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r4, 4);
        this.A02 = r5;
        this.A03 = r2;
        this.A00 = r3;
        this.A01 = r4;
    }

    public final Object A00(C023509x r5, boolean z) {
        C24261Bt r3 = (C24261Bt) this.A01.get();
        if (((AnonymousClass1XW) ((AnonymousClass39Q) this.A03.get()).A04.get()).A00() != null) {
            return AnonymousClass0A2.A00(r5, this.A02, new AvatarConfigRepository$hasAvatarAwait$2(this, r3, (C023509x) null, z));
        }
        Log.e("AvatarConfigRepository/hasAvatarAwait avatar user does not exist");
        return false;
    }

    public final boolean A01() {
        Boolean A002 = ((C24261Bt) this.A01.get()).A00();
        if (A002 != null) {
            return A002.booleanValue();
        }
        Log.i("AvatarRepository/unknown avatar config state, returning false.");
        return false;
    }
}
