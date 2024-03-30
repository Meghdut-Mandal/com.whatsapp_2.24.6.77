package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.status.playback.widget.VoiceStatusContentView;
import java.lang.ref.WeakReference;

/* renamed from: X.3ed  reason: invalid class name and case insensitive filesystem */
public final class C70123ed implements C88514Sz {
    public final WeakReference A00;
    public final C88514Sz A01;

    public void Btf(Bitmap bitmap, ImageView imageView, boolean z) {
        AnonymousClass00C.A0D(imageView, 0);
        this.A01.Btf(bitmap, imageView, z);
        VoiceStatusContentView voiceStatusContentView = (VoiceStatusContentView) this.A00.get();
        if (voiceStatusContentView != null) {
            VoiceStatusContentView.A02(voiceStatusContentView);
        }
    }

    public void Btv(ImageView imageView) {
        AnonymousClass00C.A0D(imageView, 0);
        this.A01.Btv(imageView);
        VoiceStatusContentView voiceStatusContentView = (VoiceStatusContentView) this.A00.get();
        if (voiceStatusContentView != null) {
            VoiceStatusContentView.A02(voiceStatusContentView);
        }
    }

    public C70123ed(C70133ee r2, VoiceStatusContentView voiceStatusContentView) {
        this.A00 = AnonymousClass001.A0F(voiceStatusContentView);
        this.A01 = r2;
    }
}
