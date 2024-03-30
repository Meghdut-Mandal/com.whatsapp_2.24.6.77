package X;

import com.whatsapp.productinfra.avatar.data.profilephoto.AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1;
import java.util.List;

/* renamed from: X.6Ld  reason: invalid class name and case insensitive filesystem */
public final class C130456Ld {
    public final AnonymousClass17Y A00;
    public final C24261Bt A01;
    public final AnonymousClass1HC A02;
    public final C19770wU A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass004 A05;
    public final C20810yC A06;

    public static final List A00(C130456Ld r3, List list, boolean z, boolean z2) {
        C130926Mz r2 = (C130926Mz) r3.A04.get();
        boolean A0E = r3.A06.A0E(3237);
        List list2 = list;
        if (!A0E) {
            return r2.A01(list, z, z2);
        }
        return (List) C110515an.A00(C008903u.A00, new AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1(r2, list2, (C023509x) null, z, z2));
    }

    public C130456Ld(AnonymousClass17Y r1, C20810yC r2, C24261Bt r3, AnonymousClass1HC r4, C19770wU r5, AnonymousClass005 r6, AnonymousClass004 r7) {
        C36321k7.A1B(r2, r1, r5, r3, r4);
        C36321k7.A10(r6, r7);
        this.A06 = r2;
        this.A00 = r1;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r6;
        this.A05 = r7;
    }
}
