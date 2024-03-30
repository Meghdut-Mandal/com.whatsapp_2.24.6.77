package X;

import com.whatsapp.media.transcode.MediaTranscodeService;

/* renamed from: X.5KF  reason: invalid class name */
public abstract class AnonymousClass5KF extends AnonymousClass1U6 implements C18700tb {
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
            MediaTranscodeService mediaTranscodeService = (MediaTranscodeService) this;
            C18800tq r1 = ((C31141bL) ((C31131bK) generatedComponent())).A05;
            mediaTranscodeService.A03 = C36341k9.A0V(r1);
            mediaTranscodeService.A00 = C36341k9.A0R(r1);
            mediaTranscodeService.A01 = C36341k9.A0S(r1);
            mediaTranscodeService.A02 = (AnonymousClass16J) r1.A57.get();
            mediaTranscodeService.A04 = (AnonymousClass1Y4) r1.AZK.get();
        }
        super.onCreate();
    }
}
