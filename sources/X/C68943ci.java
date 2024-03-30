package X;

import android.content.Intent;
import com.whatsapp.inappsupportbloks.components.BloksSupportVideoView;

/* renamed from: X.3ci  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68943ci implements AnonymousClass4P8 {
    public final /* synthetic */ BloksSupportVideoView A00;

    public /* synthetic */ C68943ci(BloksSupportVideoView bloksSupportVideoView) {
        this.A00 = bloksSupportVideoView;
    }

    public final boolean BQk(Intent intent, int i, int i2) {
        BloksSupportVideoView bloksSupportVideoView = this.A00;
        int i3 = 0;
        if (i != 0 || i2 != -1) {
            return false;
        }
        if (intent != null) {
            i3 = intent.getIntExtra("video_start_position", 0);
        }
        bloksSupportVideoView.A00 = i3;
        return true;
    }
}
