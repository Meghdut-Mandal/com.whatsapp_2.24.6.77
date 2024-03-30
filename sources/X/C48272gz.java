package X;

import android.view.View;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.2gz  reason: invalid class name and case insensitive filesystem */
public final class C48272gz extends AnonymousClass2h4 {
    public final AnonymousClass00T A00 = C36431kI.A1I(AnonymousClass4II.A00);
    public final AnonymousClass00T A01 = C36431kI.A1I(AnonymousClass4IJ.A00);

    public void A0G(C48032ga r3) {
        if (r3 instanceof C48012gY) {
            C65663Sz A002 = r3.A00();
            if (A002 == null || A002.A02() == 0) {
                this.A01.setBackgroundColor(AnonymousClass3UN.A00());
            } else {
                super.A0G(r3);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48272gz(View view, AnonymousClass1LI r4, AnonymousClass1Pp r5, AnonymousClass171 r6, AnonymousClass1RY r7, C70143ef r8, C32111cz r9, C55662uz r10, AnonymousClass39Z r11, AnonymousClass3O2 r12, AnonymousClass13J r13) {
        super(view, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
        C36321k7.A0x(view, r7);
        AnonymousClass00C.A0D(r5, 5);
        AnonymousClass00C.A0D(r4, 9);
        C36361kB.A1K(r13, r6);
        WDSProfilePhoto wDSProfilePhoto = this.A05;
        AnonymousClass3Y9.A00(wDSProfilePhoto, this, 26);
        wDSProfilePhoto.setProfileBadge((AnonymousClass6K4) this.A00.getValue());
    }
}
