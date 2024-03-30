package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.4Zi  reason: invalid class name and case insensitive filesystem */
public class C90164Zi implements C160197kc {
    public Object A00;
    public final int A01;

    public C90164Zi(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BZt() {
        switch (this.A01) {
            case 0:
                return;
            case 1:
                throw AnonymousClass001.A0A("photoViewRef");
            default:
                AnonymousClass2I1 r0 = (AnonymousClass2I1) this.A00;
                WDSProfilePhoto wDSProfilePhoto = r0.A09;
                Drawable A012 = C013105r.A01(r0.getContext(), R.drawable.ic_empty_profile);
                C128376Ca r2 = new C128376Ca(R.dimen.f7nameremoved, R.dimen.f7nameremoved, R.dimen.f7nameremoved, R.dimen.f7nameremoved);
                if (A012 != null && wDSProfilePhoto != null) {
                    wDSProfilePhoto.setProfileBadge(new C50922mr(A012, r2, new C50892mo()));
                    return;
                }
                return;
        }
    }

    public void Bj5(Bitmap bitmap) {
        switch (this.A01) {
            case 0:
                AnonymousClass00C.A0D(bitmap, 0);
                ((AnonymousClass2EI) this.A00).A0F.A0C(bitmap);
                return;
            case 1:
                AnonymousClass00C.A0D(bitmap, 0);
                throw AnonymousClass001.A0A("photoViewRef");
            default:
                AnonymousClass00C.A0D(bitmap, 0);
                AnonymousClass2I1 r0 = (AnonymousClass2I1) this.A00;
                WDSProfilePhoto wDSProfilePhoto = r0.A09;
                Resources A0J = C36441kJ.A0J(r0);
                C128376Ca r3 = new C128376Ca(R.dimen.f7nameremoved, R.dimen.f7nameremoved, R.dimen.f7nameremoved, R.dimen.f7nameremoved);
                C03220Dq r2 = new C03220Dq(A0J, bitmap);
                r2.A01();
                if (wDSProfilePhoto != null) {
                    wDSProfilePhoto.setProfileBadge(new C50922mr(r2, r3, new C50892mo()));
                    return;
                }
                return;
        }
    }

    public void Bj4() {
    }
}
