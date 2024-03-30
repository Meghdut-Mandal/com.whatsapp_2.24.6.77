package X;

import android.media.AudioTrack;
import com.facebook.android.exoplayer2.audio.DefaultAudioSink;

/* renamed from: X.7uE  reason: invalid class name and case insensitive filesystem */
public class C165837uE extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ AnonymousClass9U2 A00;
    public final /* synthetic */ DefaultAudioSink A01;

    public C165837uE(AnonymousClass9U2 r1, DefaultAudioSink defaultAudioSink) {
        this.A00 = r1;
        this.A01 = defaultAudioSink;
    }

    public void onDataRequest(AudioTrack audioTrack, int i) {
        C200319h9.A02(C36361kB.A1a(audioTrack, this.A00.A02.A0B));
    }

    public void onTearDown(AudioTrack audioTrack) {
        C200319h9.A02(C36361kB.A1a(audioTrack, this.A00.A02.A0B));
    }
}
