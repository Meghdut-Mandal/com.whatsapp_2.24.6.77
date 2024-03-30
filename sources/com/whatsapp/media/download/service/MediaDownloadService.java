package com.whatsapp.media.download.service;

import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1ST;
import X.AnonymousClass5K8;
import X.AnonymousClass6YC;
import X.AnonymousClass70H;
import X.C1508677b;
import X.C18910u1;
import X.C19630wG;
import X.C19770wU;
import X.C19930wk;
import X.C19970wo;
import X.C25711Hj;
import X.C36331k8;
import android.content.Intent;
import android.content.res.Resources;
import android.os.IBinder;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public final class MediaDownloadService extends AnonymousClass5K8 {
    public AnonymousClass16D A00;
    public AnonymousClass171 A01;
    public C19970wo A02;
    public C19630wG A03;
    public AnonymousClass1ST A04;
    public C19930wk A05;
    public C19770wU A06;
    public C25711Hj A07;
    public boolean A08 = false;
    public boolean A09;
    public final AnonymousClass005 A0A = new C18910u1((Object) null, C1508677b.A00);

    public IBinder onBind(Intent intent) {
        return null;
    }

    public MediaDownloadService() {
        super("media-download-service", true);
    }

    public void onCreate() {
        Log.i("media-download-service/onCreate");
        A02();
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("media-download-service/onDestroy");
        C25711Hj r1 = this.A07;
        if (r1 != null) {
            this.A04.A07.A02(r1);
            this.A07 = null;
        }
        stopForeground(true);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("media-download-service/onStartCommand:");
        A0u.append(intent);
        A0u.append("; startId: ");
        A0u.append(i2);
        A0u.append(" largeMediaDownloadsInProgress=");
        C36331k8.A1S(A0u, this.A09);
        if (intent != null) {
            if ("com.whatsapp.media.download.service.MediaDownloadService.DOWNLOAD_STARTED".equals(intent.getAction())) {
                this.A09 = true;
            } else if ("com.whatsapp.media.download.service.MediaDownloadService.DOWNLOADS_COMPLETED".equals(intent.getAction())) {
                this.A09 = false;
            }
        }
        String string = getString(R.string.f12nameremoved);
        Resources resources = getResources();
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, 1, 0);
        A04(AnonymousClass6YC.A03(this, this.A00, string, resources.getQuantityString(R.plurals.f10nameremoved, 1, objArr), (ArrayList) null), (Integer) null, i2, 240677004);
        if (!this.A09) {
            this.A00.A01(this.A03.A00, MediaDownloadService.class);
            return 2;
        } else if (this.A07 != null) {
            return 2;
        } else {
            this.A07 = new AnonymousClass70H(this, i2);
            C19930wk r2 = this.A05;
            if (r2 == null) {
                r2 = new C19930wk(this.A06, false);
                this.A05 = r2;
            }
            AnonymousClass1ST r0 = this.A04;
            r0.A07.A03(this.A07, r2);
            return 2;
        }
    }
}
