package X;

import android.os.Handler;
import com.whatsapp.media.download.service.MediaDownloadService;
import java.util.ArrayList;

/* renamed from: X.70H  reason: invalid class name */
public final /* synthetic */ class AnonymousClass70H implements C25711Hj {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MediaDownloadService A01;

    public /* synthetic */ AnonymousClass70H(MediaDownloadService mediaDownloadService, int i) {
        this.A01 = mediaDownloadService;
        this.A00 = i;
    }

    public final void accept(Object obj) {
        MediaDownloadService mediaDownloadService = this.A01;
        int i = this.A00;
        ArrayList arrayList = (ArrayList) obj;
        if (!arrayList.isEmpty()) {
            ((Handler) mediaDownloadService.A0A.get()).post(new AnonymousClass73U(mediaDownloadService, AnonymousClass6YC.A07(mediaDownloadService, arrayList), AnonymousClass6YC.A06(mediaDownloadService, mediaDownloadService.A00, mediaDownloadService.A01, arrayList), arrayList, i));
            return;
        }
        mediaDownloadService.A00.A03(mediaDownloadService.A03.A00, C36441kJ.A0I("com.whatsapp.media.download.service.MediaDownloadService.DOWNLOADS_COMPLETED"), MediaDownloadService.class);
    }
}
