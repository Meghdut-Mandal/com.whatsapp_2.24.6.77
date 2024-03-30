package X;

import com.whatsapp.location.LocationSharingService;

/* renamed from: X.5KI  reason: invalid class name */
public abstract class AnonymousClass5KI extends AnonymousClass1U6 implements C18700tb {
    public boolean A00 = false;
    public final Object A01 = C36441kJ.A11();
    public volatile C31091bG A02;

    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new C31091bG(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }

    public void onCreate() {
        if (!this.A00) {
            this.A00 = true;
            LocationSharingService locationSharingService = (LocationSharingService) this;
            C18800tq r1 = ((C31141bL) ((C31131bK) generatedComponent())).A05;
            locationSharingService.A06 = C36351kA.A0V(r1);
            locationSharingService.A0A = C36341k9.A0Z(r1);
            locationSharingService.A05 = C36351kA.A0U(r1);
            locationSharingService.A08 = C36351kA.A0Y(r1);
            locationSharingService.A07 = C36351kA.A0X(r1);
            locationSharingService.A03 = (C227815t) r1.A0h.get();
            locationSharingService.A02 = C90484aE.A0T(r1);
            locationSharingService.A09 = C36411kG.A0l(r1);
            locationSharingService.A04 = (AnonymousClass1BN) r1.AWf.get();
            locationSharingService.A01 = (C21390zA) r1.A0J.get();
        }
        super.onCreate();
    }
}
