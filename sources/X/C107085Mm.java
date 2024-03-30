package X;

import android.view.View;
import com.whatsapp.mediacomposer.VideoTimelineView;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.5Mm  reason: invalid class name and case insensitive filesystem */
public class C107085Mm extends C132446Tt {
    public long A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final File A04;
    public final WeakReference A05;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        View A0Y = AnonymousClass000.A0Y(this.A05);
        if (A0Y != null) {
            A0Y.invalidate();
        }
    }

    public C107085Mm(VideoTimelineView videoTimelineView, File file, float f, float f2, int i) {
        this.A05 = AnonymousClass001.A0F(videoTimelineView);
        this.A04 = file;
        this.A03 = i;
        this.A02 = f;
        this.A01 = f2;
    }
}
