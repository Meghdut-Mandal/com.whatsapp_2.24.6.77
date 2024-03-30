package X;

import android.app.job.JobService;
import com.whatsapp.media.download.service.MediaDownloadJobService;

/* renamed from: X.4am  reason: invalid class name and case insensitive filesystem */
public abstract class C90764am extends JobService implements C18700tb {
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
            MediaDownloadJobService mediaDownloadJobService = (MediaDownloadJobService) this;
            mediaDownloadJobService.A0B = C26581Ks.A00();
            mediaDownloadJobService.A0A = C25141Fd.A00();
            C18800tq r1 = ((C31141bL) ((C31131bK) generatedComponent())).A05;
            mediaDownloadJobService.A03 = C36351kA.A0W(r1);
            mediaDownloadJobService.A08 = C36341k9.A0Z(r1);
            mediaDownloadJobService.A00 = C36341k9.A0R(r1);
            mediaDownloadJobService.A01 = C36341k9.A0S(r1);
            mediaDownloadJobService.A05 = (AnonymousClass1ST) r1.A4i.get();
            mediaDownloadJobService.A04 = C36351kA.A0h(r1);
            mediaDownloadJobService.A02 = C36351kA.A0V(r1);
            mediaDownloadJobService.A06 = (C19650wI) r1.A4f.get();
        }
        super.onCreate();
    }
}
