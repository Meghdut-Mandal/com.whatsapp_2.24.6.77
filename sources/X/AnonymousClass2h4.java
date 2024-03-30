package X;

import android.view.View;
import com.google.android.material.imageview.ShapeableImageView;
import com.whatsapp.R;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.ArrayList;

/* renamed from: X.2h4  reason: invalid class name */
public class AnonymousClass2h4 extends C48492hP {
    public final ShapeableImageView A00;
    public final ShapeableImageView A01;
    public final AnonymousClass171 A02;
    public final C32111cz A03;
    public final AnonymousClass13J A04;
    public final WDSProfilePhoto A05;
    public final AnonymousClass00T A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2h4(View view, AnonymousClass1LI r11, AnonymousClass1Pp r12, AnonymousClass171 r13, AnonymousClass1RY r14, C70143ef r15, C32111cz r16, C55662uz r17, AnonymousClass39Z r18, AnonymousClass3O2 r19, AnonymousClass13J r20) {
        super(view, r12, r14, r15, r17, r18, r19);
        C36321k7.A0x(view, r14);
        AnonymousClass00C.A0D(r12, 4);
        AnonymousClass13J r0 = r20;
        C36321k7.A14(r11, r0, r13);
        this.A04 = r0;
        this.A02 = r13;
        this.A03 = r16;
        this.A06 = C36431kI.A1I(new AnonymousClass4HM(view, r11));
        this.A05 = (WDSProfilePhoto) C36361kB.A0F(view, R.id.wds_profile_picture);
        this.A01 = (ShapeableImageView) C36361kB.A0F(view, R.id.status_preview);
        this.A00 = (ShapeableImageView) C36361kB.A0F(view, R.id.overlay);
    }

    public void A0G(C48032ga r3) {
        A0D(this.A01, r3, true, true);
    }

    public final void A0F(C65663Sz r8) {
        int A022;
        C112005dC r0;
        AnonymousClass5TU r02;
        AnonymousClass5TU r1;
        if (r8.A02() > 32) {
            A022 = 1;
        } else {
            A022 = r8.A02();
        }
        int A032 = r8.A03();
        ArrayList A0I = AnonymousClass001.A0I();
        WDSProfilePhoto wDSProfilePhoto = this.A05;
        wDSProfilePhoto.setStatusIndicatorEnabled(AnonymousClass000.A1R(A022));
        if (A022 == 1) {
            if (A032 > 0) {
                r1 = AnonymousClass5TU.UNSEEN;
            } else {
                r1 = AnonymousClass5TU.SEEN;
            }
            r0 = new AnonymousClass5QJ(r1);
        } else {
            for (int i = 0; i < A022; i++) {
                if (i < A032) {
                    r02 = AnonymousClass5TU.UNSEEN;
                } else {
                    r02 = AnonymousClass5TU.SEEN;
                }
                A0I.add(r02);
            }
            r0 = new AnonymousClass5QK(A0I);
        }
        wDSProfilePhoto.setProfileStatus(r0);
    }
}
