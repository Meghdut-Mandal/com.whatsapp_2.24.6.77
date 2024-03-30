package X;

import android.util.Log;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.6S3  reason: invalid class name */
public class AnonymousClass6S3 {
    public boolean A00 = false;
    public final ConcurrentLinkedQueue A01 = new ConcurrentLinkedQueue();
    public final /* synthetic */ AnonymousClass6V0 A02;

    public AnonymousClass6S3(AnonymousClass6V0 r2) {
        this.A02 = r2;
    }

    public static C23079B3l A00(String str, boolean z) {
        if (z && str.equals("meta.dav1d.av1.decoder")) {
            try {
                return (C23079B3l) Class.forName("exoplayer2.av1.src.Dav1dMediaCodecAdapter").getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e) {
                Object[] A1b = C36411kG.A1b("exoplayer2.av1.src.Dav1dMediaCodecAdapter");
                C90514aH.A1U(e, A1b, 1);
                Log.w("MediaCodecPoolOptimized", String.format("Exception when trying to instantiate %s: %s", A1b));
            }
        }
        return new C209239zg(str);
    }

    public static void A01(C23079B3l b3l, AnonymousClass6S3 r5, String str) {
        Set A0r;
        AnonymousClass6V0 r3 = r5.A02;
        synchronized (r3.A03) {
            A0r = C90524aI.A0r(str, r3.A03);
        }
        if (A0r != null) {
            synchronized (A0r) {
                if (A0r.remove(b3l)) {
                    r3.A00--;
                }
            }
        }
    }
}
