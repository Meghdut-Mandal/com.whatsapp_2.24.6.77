package X;

import android.content.Context;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.2I1  reason: invalid class name */
public abstract class AnonymousClass2I1 extends C43402Hj {
    public AnonymousClass1KK A00;
    public AnonymousClass16I A01;
    public C27731Pn A02;
    public AnonymousClass141 A03 = this.A1C.A01(C64933Qa.A01(this.A0K));
    public boolean A04 = true;
    public final ViewGroup A05;
    public final AnonymousClass3SF A06 = AnonymousClass3SF.A01(this, this.A08, R.id.contact_name);
    public final WaTextView A07;
    public final AnonymousClass1RY A08;
    public final WDSProfilePhoto A09;
    public final AnonymousClass00T A0A = C36431kI.A1I(new C83614Ab(this));

    public AnonymousClass2I1(Context context, C89004Uw r5, AnonymousClass2bI r6) {
        super(context, r5, r6);
        WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) C36361kB.A0F(this, R.id.contact_photo);
        this.A09 = wDSProfilePhoto;
        wDSProfilePhoto.setContentDescription(getResources().getText(R.string.f12nameremoved));
        this.A08 = getContactPhotos().A05(context, "conversation-row-contact-info");
        this.A07 = C36351kA.A0Q(this, R.id.info);
        this.A05 = (ViewGroup) C36361kB.A0F(this, R.id.contact_info_header);
    }

    public abstract void A2H();

    public int getBackgroundResource() {
        return 0;
    }

    public abstract int getLayout();

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    public final void setBusinessProfileManager(AnonymousClass1KK r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setContact(AnonymousClass141 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setContactObservers(AnonymousClass16I r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setContactPhotos(C27731Pn r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    private final C226815j getContactObserver() {
        return (C226815j) this.A0A.getValue();
    }

    public void A22(AnonymousClass3T1 r3, boolean z) {
        if (z) {
            A2H();
        }
        if (this.A04) {
            getContactObservers().registerObserver(getContactObserver());
            this.A04 = false;
        }
    }

    public C226815j A2G() {
        return new AnonymousClass2Fk(this);
    }

    public final AnonymousClass1KK getBusinessProfileManager() {
        AnonymousClass1KK r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("businessProfileManager");
    }

    public final AnonymousClass16I getContactObservers() {
        AnonymousClass16I r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactObservers");
    }

    public final C27731Pn getContactPhotos() {
        C27731Pn r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactPhotos");
    }

    public void onDetachedFromWindow() {
        this.A08.A02();
        getContactObservers().unregisterObserver(getContactObserver());
        this.A04 = true;
        super.onDetachedFromWindow();
    }

    public void A1Y() {
        A2H();
    }

    public int getCenteredLayoutId() {
        return getLayout();
    }

    public final AnonymousClass141 getContact() {
        return this.A03;
    }

    public final AnonymousClass3SF getContactNameViewController() {
        return this.A06;
    }

    public final WDSProfilePhoto getContactPhoto() {
        return this.A09;
    }

    public final AnonymousClass1RY getContactPhotoLoader() {
        return this.A08;
    }

    public final WaTextView getContactType() {
        return this.A07;
    }

    public final ViewGroup getHeader() {
        return this.A05;
    }

    public int getIncomingLayoutId() {
        return getLayout();
    }

    public int getOutgoingLayoutId() {
        return getLayout();
    }
}
