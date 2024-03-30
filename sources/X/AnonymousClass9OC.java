package X;

import android.media.MediaCodec;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.9OC  reason: invalid class name */
public final class AnonymousClass9OC {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public byte[] A04;
    public byte[] A05;
    public int[] A06;
    public int[] A07;
    public final MediaCodec.CryptoInfo A08;
    public final C197519bq A09;

    public AnonymousClass9OC() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.A08 = cryptoInfo;
        this.A09 = Util.A00 >= 24 ? new C197519bq(cryptoInfo) : null;
    }
}
