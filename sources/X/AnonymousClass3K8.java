package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.provider.MediaStore;
import java.util.ArrayList;

/* renamed from: X.3K8  reason: invalid class name */
public class AnonymousClass3K8 {
    public boolean A00;
    public final Handler A01;
    public final AnonymousClass1PM A02;
    public final ArrayList A03 = AnonymousClass001.A0I();
    public final C21060yb A04;
    public final Thread A05;

    public void A00() {
        ArrayList arrayList = this.A03;
        synchronized (arrayList) {
            this.A00 = true;
            arrayList.notifyAll();
        }
        C65323Rp A012 = C65323Rp.A01();
        Thread thread = this.A05;
        C21050ya A0O = this.A04.A0O();
        synchronized (A012) {
            C61773Dj A002 = C65323Rp.A00(A012, thread);
            A002.A00 = 0;
            BitmapFactory.Options options = A002.A01;
            if (options != null) {
                options.requestCancelDecode();
            }
            A012.notifyAll();
            synchronized (A002) {
                if (A002.A02) {
                    MediaStore.Images.Thumbnails.cancelThumbnailRequest(A0O.A00, -1, thread.getId());
                    MediaStore.Video.Thumbnails.cancelThumbnailRequest(A0O.A00, -1, thread.getId());
                }
            }
        }
        thread.interrupt();
    }

    public void A01(AnonymousClass4TB r4) {
        if (r4 != null) {
            ArrayList arrayList = this.A03;
            synchronized (arrayList) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    } else if (((C595334h) arrayList.get(i)).A00 != r4) {
                        i++;
                    } else if (i >= 0) {
                        arrayList.remove(i);
                    }
                }
            }
        }
    }

    public void A02(AnonymousClass4TB r4, AnonymousClass4U2 r5) {
        C18740tg.A0D(!this.A05.isInterrupted(), "Thumb loader reused after destroy");
        Bitmap bitmap = (Bitmap) this.A02.A09(r4.BIB());
        if (bitmap != null) {
            r5.Bi2(bitmap, true);
            return;
        }
        r5.B1h();
        ArrayList arrayList = this.A03;
        synchronized (arrayList) {
            arrayList.add(new C595334h(r4, r5));
            arrayList.notifyAll();
        }
    }

    public AnonymousClass3K8(Handler handler, AnonymousClass16L r6, C21060yb r7, String str) {
        this.A04 = r7;
        this.A01 = handler;
        AnonymousClass1SZ A022 = r6.A02();
        this.A02 = A022;
        this.A00 = false;
        C19950wm r0 = new C19950wm(C80243v5.A00(this, 30), AnonymousClass000.A0p("image-loader-", str, AnonymousClass000.A0u()));
        this.A05 = r0;
        r0.start();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("imageloader/cachesize:");
        C36321k7.A1Y(A0u, A022.A02.A01());
    }
}
