package X;

import android.media.MediaScannerConnection;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3WU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3WU implements MediaScannerConnection.OnScanCompletedListener {
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ AtomicInteger A01;

    public /* synthetic */ AnonymousClass3WU(Runnable runnable, AtomicInteger atomicInteger) {
        this.A01 = atomicInteger;
        this.A00 = runnable;
    }

    public final void onScanCompleted(String str, Uri uri) {
        AtomicInteger atomicInteger = this.A01;
        Runnable runnable = this.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("fmessageio/rescan/scan completed: file=");
        A0u.append(str);
        C36321k7.A1K(uri, " uri=", A0u);
        if (atomicInteger.decrementAndGet() <= 0 && runnable != null) {
            runnable.run();
        }
    }
}
