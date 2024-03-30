package X;

import android.content.Context;
import android.widget.ImageView;
import com.whatsapp.Mp4Ops;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.1GZ  reason: invalid class name */
public final class AnonymousClass1GZ {
    public static final C25371Ga A0J = new C25381Gb();
    public C106755Lf A00;
    public AnonymousClass6CW A01;
    public ThreadPoolExecutor A02;
    public final C19700wN A03;
    public final C25391Gc A04;
    public final C20690y0 A05;
    public final AnonymousClass17Y A06;
    public final Mp4Ops A07;
    public final C20050ww A08;
    public final AnonymousClass1AV A09;
    public final C24341Cb A0A;
    public final C19970wo A0B;
    public final C19630wG A0C;
    public final C20810yC A0D;
    public final AnonymousClass13E A0E;
    public final AnonymousClass005 A0F;
    public final boolean A0G;
    public final C19770wU A0H;
    public volatile C106755Lf A0I;

    public static C106755Lf A00(AnonymousClass1GZ r3) {
        if (r3.A0I == null) {
            synchronized (r3) {
                if (r3.A0I == null) {
                    r3.A0I = r3.A04.A00("gif_content_obj_store", 32);
                }
            }
        }
        return r3.A0I;
    }

    public AnonymousClass1GZ(C19700wN r3, C25391Gc r4, C20690y0 r5, AnonymousClass17Y r6, Mp4Ops mp4Ops, C20050ww r8, AnonymousClass1AV r9, C24341Cb r10, C19970wo r11, C19630wG r12, C20810yC r13, AnonymousClass13E r14, C19770wU r15, AnonymousClass005 r16) {
        this.A0C = r12;
        this.A04 = r4;
        this.A0B = r11;
        this.A07 = mp4Ops;
        this.A0D = r13;
        this.A06 = r6;
        this.A03 = r3;
        this.A0H = r15;
        this.A05 = r5;
        this.A08 = r8;
        this.A09 = r9;
        this.A0A = r10;
        this.A0E = r14;
        this.A0F = r16;
        this.A0G = C20800yB.A01(C21000yV.A02, r13, 1662);
    }

    public static ThreadPoolExecutor A01(AnonymousClass1GZ r8) {
        C18740tg.A01();
        ThreadPoolExecutor threadPoolExecutor = r8.A02;
        if (threadPoolExecutor != null) {
            return threadPoolExecutor;
        }
        C50342kb B4z = r8.A0H.B4z("GifCacheWorker", new LinkedBlockingQueue(), 4, 4, 10, 1);
        r8.A02 = B4z;
        return B4z;
    }

    public void A02(ImageView imageView, String str) {
        Context context = imageView.getContext();
        C18740tg.A01();
        AnonymousClass6CW r0 = this.A01;
        if (r0 == null) {
            File file = new File(this.A0C.A00.getCacheDir(), "GifsCache");
            if (!file.mkdirs() && !file.isDirectory()) {
                Log.w("gif/cache/unable to create gifs directory");
            }
            AnonymousClass658 r3 = new AnonymousClass658(this.A06, this.A08, this.A0E, file, "gif-cache");
            r3.A00 = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            r0 = r3.A01();
            this.A01 = r0;
        }
        r0.A01(imageView, str);
    }

    public byte[] A03(String str) {
        C159467jP r0;
        C18740tg.A01();
        C18740tg.A01();
        if (this.A0G) {
            r0 = (C159467jP) this.A0F.get();
        } else {
            C159467jP r02 = this.A00;
            r0 = r02;
            if (r02 == null) {
                C106755Lf A002 = this.A04.A00("gif_preview_obj_store", 256);
                this.A00 = A002;
                r0 = A002;
            }
        }
        C121635tS B81 = r0.B81(str);
        if (B81 != null) {
            return B81.A02;
        }
        return null;
    }
}
