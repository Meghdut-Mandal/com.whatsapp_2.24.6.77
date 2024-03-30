package X;

import com.whatsapp.calling.service.VoiceFGService;
import com.whatsapp.instrumentation.service.InstrumentationFGService;
import com.whatsapp.media.download.service.MediaDownloadService;
import com.whatsapp.migration.android.integration.service.GoogleMigrateService;
import com.whatsapp.service.GcmFGService;

/* renamed from: X.5KB  reason: invalid class name */
public abstract class AnonymousClass5KB extends AnonymousClass1U6 implements C18700tb {
    public final Object A00 = C36441kJ.A11();
    public volatile C31091bG A01;

    public void A02() {
        if (this instanceof GcmFGService) {
            GcmFGService gcmFGService = (GcmFGService) this;
            if (!gcmFGService.A02) {
                gcmFGService.A02 = true;
                C18800tq A012 = A01(gcmFGService);
                gcmFGService.A00 = C36351kA.A0V(A012);
                gcmFGService.A01 = C36351kA.A0g(A012);
            }
        } else if (this instanceof GoogleMigrateService) {
            GoogleMigrateService googleMigrateService = (GoogleMigrateService) this;
            if (!googleMigrateService.A07) {
                googleMigrateService.A07 = true;
                C18800tq A013 = A01(googleMigrateService);
                googleMigrateService.A06 = C36341k9.A0Z(A013);
                googleMigrateService.A00 = C36391kE.A0V(A013);
                C18830tt r1 = A013.A00;
                googleMigrateService.A05 = (AnonymousClass3TX) r1.A1p.get();
                googleMigrateService.A01 = C36351kA.A0U(A013);
                googleMigrateService.A03 = (AnonymousClass5FX) r1.A8i.get();
                googleMigrateService.A02 = (AnonymousClass6X5) r1.A8g.get();
                googleMigrateService.A04 = (AnonymousClass6Sk) r1.A8h.get();
            }
        } else if (this instanceof MediaDownloadService) {
            MediaDownloadService mediaDownloadService = (MediaDownloadService) this;
            if (!mediaDownloadService.A08) {
                mediaDownloadService.A08 = true;
                C18800tq A014 = A01(mediaDownloadService);
                mediaDownloadService.A03 = C36351kA.A0W(A014);
                mediaDownloadService.A06 = C36341k9.A0Z(A014);
                mediaDownloadService.A00 = C36341k9.A0R(A014);
                mediaDownloadService.A01 = C36341k9.A0S(A014);
                mediaDownloadService.A04 = (AnonymousClass1ST) A014.A4i.get();
                mediaDownloadService.A02 = C36351kA.A0V(A014);
            }
        } else if (this instanceof InstrumentationFGService) {
            InstrumentationFGService instrumentationFGService = (InstrumentationFGService) this;
            if (!instrumentationFGService.A00) {
                instrumentationFGService.A00 = true;
                instrumentationFGService.A00 = (AnonymousClass1MM) ((C31141bL) ((C31131bK) instrumentationFGService.generatedComponent())).A05.ANj.get();
            }
        } else {
            VoiceFGService voiceFGService = (VoiceFGService) this;
            if (!voiceFGService.A03) {
                voiceFGService.A03 = true;
                C18800tq A015 = A01(voiceFGService);
                voiceFGService.A01 = (AnonymousClass1PW) A015.A74.get();
                voiceFGService.A02 = (AnonymousClass2ZH) A015.A00.AD4.get();
                voiceFGService.A00 = (C21390zA) A015.A0J.get();
            }
        }
    }

    public final Object generatedComponent() {
        if (this.A01 == null) {
            synchronized (this.A00) {
                if (this.A01 == null) {
                    this.A01 = new C31091bG(this);
                }
            }
        }
        return this.A01.generatedComponent();
    }

    public static C18800tq A01(AnonymousClass5K8 r2) {
        C18800tq r1 = ((C31141bL) ((C31131bK) r2.generatedComponent())).A05;
        r2.A00 = (AnonymousClass1MM) r1.ANj.get();
        return r1;
    }

    public void onCreate() {
        A02();
        super.onCreate();
    }
}
