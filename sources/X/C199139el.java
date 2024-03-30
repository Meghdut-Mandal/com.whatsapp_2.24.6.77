package X;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.facebook.android.exoplayer2.util.Util;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: X.9el  reason: invalid class name and case insensitive filesystem */
public final class C199139el {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public AudioTrack A0G;
    public C198059cq A0H;
    public Method A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final C191009Bf A0M;
    public final long[] A0N;

    public static long A00(C199139el r12) {
        AudioTrack audioTrack = r12.A0G;
        Objects.requireNonNull(audioTrack);
        long j = r12.A0F;
        if (j != -9223372036854775807L) {
            return Math.min(r12.A05, r12.A0E + C165597tg.A0E((SystemClock.elapsedRealtime() * 1000) - j, (long) r12.A02));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (r12.A0L) {
            if (playState == 2 && playbackHeadPosition == 0) {
                r12.A0B = r12.A09;
            }
            playbackHeadPosition += r12.A0B;
        }
        if (Util.A00 <= 29) {
            if (playbackHeadPosition == 0) {
                long j2 = r12.A09;
                if (j2 > 0 && playState == 3) {
                    if (r12.A06 == -9223372036854775807L) {
                        r12.A06 = SystemClock.elapsedRealtime();
                    }
                    return j2;
                }
            }
            r12.A06 = -9223372036854775807L;
        }
        if (r12.A09 > playbackHeadPosition) {
            r12.A0C++;
        }
        r12.A09 = playbackHeadPosition;
        return playbackHeadPosition + (r12.A0C << 32);
    }

    public C199139el(C191009Bf r4) {
        Objects.requireNonNull(r4);
        this.A0M = r4;
        try {
            this.A0I = AudioTrack.class.getMethod("getLatency", (Class[]) null);
        } catch (NoSuchMethodException unused) {
        }
        this.A0N = new long[10];
    }

    public boolean A01(long j) {
        if (j > A00(this)) {
            return true;
        }
        if (!this.A0L) {
            return false;
        }
        AudioTrack audioTrack = this.A0G;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 2 && A00(this) == 0) {
            return true;
        }
        return false;
    }
}
