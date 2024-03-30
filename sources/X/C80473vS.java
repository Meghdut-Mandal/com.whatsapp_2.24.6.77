package X;

import com.whatsapp.status.playback.StatusPlaybackActivity;

/* renamed from: X.3vS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80473vS implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ StatusPlaybackActivity A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C80473vS(StatusPlaybackActivity statusPlaybackActivity, String str, int i, int i2) {
        this.A02 = statusPlaybackActivity;
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void run() {
        StatusPlaybackActivity.A01(this.A02, this.A03, this.A00, this.A01);
    }
}
