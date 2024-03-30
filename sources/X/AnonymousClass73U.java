package X;

import com.whatsapp.media.download.service.MediaDownloadService;
import java.util.ArrayList;

/* renamed from: X.73U  reason: invalid class name */
public final /* synthetic */ class AnonymousClass73U implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MediaDownloadService A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ ArrayList A04;

    public /* synthetic */ AnonymousClass73U(MediaDownloadService mediaDownloadService, String str, String str2, ArrayList arrayList, int i) {
        this.A01 = mediaDownloadService;
        this.A02 = str;
        this.A00 = i;
        this.A04 = arrayList;
        this.A03 = str2;
    }

    public final void run() {
        MediaDownloadService mediaDownloadService = this.A01;
        String str = this.A02;
        int i = this.A00;
        ArrayList arrayList = this.A04;
        String str2 = this.A03;
        if (str != null) {
            mediaDownloadService.A04(AnonymousClass6YC.A03(mediaDownloadService, mediaDownloadService.A00, str, str2, arrayList), (Integer) null, i, 240677004);
        }
    }
}
