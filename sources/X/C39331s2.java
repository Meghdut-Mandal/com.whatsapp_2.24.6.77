package X;

import com.whatsapp.profile.ViewProfilePhoto;

/* renamed from: X.1s2  reason: invalid class name and case insensitive filesystem */
public abstract class C39331s2 extends AnonymousClass01I implements C18700tb {
    public final Object A00 = C36441kJ.A11();
    public volatile C27011Mj A01;

    public void A23() {
        ViewProfilePhoto.SavePhoto savePhoto = (ViewProfilePhoto.SavePhoto) this;
        if (!savePhoto.A00) {
            savePhoto.A00 = true;
            C18800tq r1 = ((C27111My) ((C27101Mx) savePhoto.generatedComponent())).A5g;
            savePhoto.A01 = C36351kA.A0M(r1);
            savePhoto.A00 = (C20690y0) r1.A6r.get();
        }
    }

    public final Object generatedComponent() {
        if (this.A01 == null) {
            synchronized (this.A00) {
                if (this.A01 == null) {
                    this.A01 = new C27011Mj(this);
                }
            }
        }
        return this.A01.generatedComponent();
    }

    public C39331s2() {
        C89354Wf.A00(this, 23);
    }

    public AnonymousClass04G BAw() {
        return C28721Tt.A00(this, super.BAw());
    }
}
