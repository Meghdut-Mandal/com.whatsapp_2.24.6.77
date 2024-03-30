package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.6VP  reason: invalid class name */
public class AnonymousClass6VP {
    public long A00;
    public long A01 = Long.MAX_VALUE;
    public long A02;
    public AnonymousClass6D7 A03;
    public AnonymousClass6F3 A04 = new AnonymousClass6F3(TimeUnit.MICROSECONDS, -1, -1);
    public C114965i7 A05;
    public File A06;
    public HashMap A07;
    public int A08 = 0;
    public AnonymousClass65N A09;
    public AnonymousClass7ez A0A;
    public C109655Yk A0B;
    public AnonymousClass65W A0C;
    public boolean A0D;

    public static void A01(AnonymousClass6VP r10) {
        String str;
        Throwable th;
        C121025sT r8;
        Throwable th2;
        C109605Yf.A00("BaseMediaDemuxer", "checkAndInitialize", new Object[0]);
        if (!r10.A0D) {
            try {
                File file = r10.A06;
                if (file == null || !file.exists()) {
                    th = new FileNotFoundException();
                } else {
                    AnonymousClass6F3 r2 = r10.A04;
                    TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                    r10.A02 = timeUnit.convert(r2.A01, r2.A02);
                    AnonymousClass6F3 r22 = r10.A04;
                    long convert = timeUnit.convert(r22.A00, r22.A02);
                    r10.A00 = convert;
                    long j = r10.A02;
                    if (j < 0) {
                        j = 0;
                    }
                    r10.A02 = j;
                    if (convert <= 0) {
                        convert = TimeUnit.MILLISECONDS.toMicros(r10.A05().A07);
                        r10.A00 = convert;
                    }
                    long j2 = r10.A02;
                    if (convert > j2) {
                        C114965i7 r23 = new C114965i7(new MediaExtractor());
                        r10.A05 = r23;
                        r23.A00.setDataSource(r10.A06.getAbsolutePath());
                        ArrayList A0I = AnonymousClass001.A0I();
                        C121025sT r7 = null;
                        try {
                            r8 = C131726Qh.A00(r10.A05);
                        } catch (C98584rf e) {
                            A0I.add(e.toString());
                            r8 = null;
                        }
                        try {
                            C114965i7 r24 = r10.A05;
                            ArrayList A022 = C131726Qh.A02(r24, "video/");
                            if (!A022.isEmpty()) {
                                Iterator it = A022.iterator();
                                while (it.hasNext()) {
                                    C121025sT r1 = (C121025sT) it.next();
                                    if (AnonymousClass6Xb.A05(r1.A02)) {
                                        if (A022.size() > 1) {
                                            C131726Qh.A01(A022);
                                        }
                                        r7 = r1;
                                        if (r8 != null) {
                                            C36341k9.A1K(AnonymousClass5TE.AUDIO, r10.A07, r8.A00);
                                        }
                                        if (r7 != null) {
                                            C36341k9.A1K(AnonymousClass5TE.VIDEO, r10.A07, r7.A00);
                                        }
                                        AnonymousClass6D7 r12 = r10.A03;
                                        r12.A04 = A0I.toString();
                                        r12.A05 = r10.A07.toString();
                                        r10.A0D = true;
                                        return;
                                    }
                                }
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append("Unsupported video codec. Contained ");
                                th2 = new C98584rf(AnonymousClass000.A0q(C131726Qh.A01(A022), A0u));
                            } else {
                                StringBuilder A0u2 = AnonymousClass000.A0u();
                                A0u2.append("No video track exception. Track Info List: ");
                                th2 = new C98614ri(AnonymousClass000.A0q(C131726Qh.A01(C131726Qh.A02(r24, "")), A0u2));
                            }
                            throw th2;
                        } catch (C98584rf | C98614ri e2) {
                            A0I.add(e2.toString());
                        }
                    } else {
                        Object[] A0M = AnonymousClass001.A0M();
                        AnonymousClass000.A1M(A0M, 0, convert);
                        AnonymousClass000.A1M(A0M, 1, j2);
                        C109605Yf.A00("BaseMediaDemuxer", "setStartAndEndTime: MediaDemuxerException mEndTimeUs=%s, mStartTimeUs=%s", A0M);
                        StringBuilder A0u3 = AnonymousClass000.A0u();
                        A0u3.append("End time is lesser than the start time. StartTimeUs : ");
                        A0u3.append(r10.A02);
                        A0u3.append(", EndTimeUs = ");
                        th = new C98604rh(C36411kG.A11(A0u3, r10.A00));
                    }
                }
                throw th;
            } catch (IOException e3) {
                C109605Yf.A00("BaseMediaDemuxer", "checkAndInitialize MediaDemuxerException=%s", e3);
                StringBuilder A0u4 = AnonymousClass000.A0u();
                A0u4.append("Failed to initialize. path = ");
                File file2 = r10.A06;
                if (file2 != null) {
                    str = file2.getAbsolutePath();
                } else {
                    str = "";
                }
                throw new C98604rh(AnonymousClass000.A0q(str, A0u4), e3);
            }
        }
    }

    public boolean A08() {
        C114965i7 r0 = this.A05;
        if (r0 == null || !r0.A00.advance()) {
            return false;
        }
        AnonymousClass6F3 r4 = this.A04;
        long sampleTime = this.A05.A00.getSampleTime();
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        if (sampleTime != -1) {
            long convert = timeUnit.convert(r4.A00, r4.A02);
            if (convert < 0 || sampleTime <= convert) {
                return true;
            }
        }
        this.A08++;
        return false;
    }

    public int A02(ByteBuffer byteBuffer) {
        C114965i7 r0 = this.A05;
        if (r0 == null) {
            return -1;
        }
        long sampleTime = r0.A00.getSampleTime();
        AnonymousClass6F3 r5 = this.A04;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        boolean z = false;
        if (sampleTime != -1) {
            long convert = timeUnit.convert(r5.A00, r5.A02);
            if (convert < 0 || sampleTime <= convert) {
                z = true;
            }
        }
        if (!z) {
            AnonymousClass6D7 r52 = this.A03;
            if (r52.A01 != -1) {
                return -1;
            }
            r52.A01 = sampleTime;
            return -1;
        }
        if (!this.A04.A01(sampleTime, timeUnit)) {
            AnonymousClass6F3 r02 = this.A04;
            if (sampleTime < timeUnit.convert(r02.A01, r02.A02)) {
                this.A03.A02 = sampleTime;
            }
        } else {
            AnonymousClass6D7 r53 = this.A03;
            if (r53.A03 == -1) {
                r53.A03 = sampleTime;
            }
            r53.A00 = sampleTime;
        }
        return this.A05.A00.readSampleData(byteBuffer, 0);
    }

    public long A03() {
        C114965i7 r0 = this.A05;
        if (r0 == null) {
            return -1;
        }
        long sampleTime = r0.A00.getSampleTime();
        if (this.A04.A01(sampleTime, TimeUnit.MICROSECONDS)) {
            return (sampleTime - this.A02) - this.A01;
        }
        if (sampleTime >= 0) {
            return -2;
        }
        return sampleTime;
    }

    public MediaFormat A04() {
        C114965i7 r2 = this.A05;
        if (r2 == null) {
            return null;
        }
        try {
            return r2.A00.getTrackFormat(r2.A00.getSampleTrackIndex());
        } catch (Exception e) {
            C109605Yf.A00("BaseMediaDemuxer", "getSampleMediaFormat: IllegalStateException=%s, getTrackInfos=%s", e, A00(this.A05).toString());
            throw new IllegalStateException(String.format(Locale.ROOT, "getSampleMediaFormat failed: %s, MediaDemuxerStats: %s", new Object[]{A00(this.A05), this.A03}), e);
        }
    }

    public AnonymousClass65N A05() {
        AnonymousClass65N r0 = this.A09;
        if (r0 == null) {
            try {
                r0 = this.A0A.B78(Uri.fromFile(this.A06));
                this.A09 = r0;
                if (r0 == null) {
                    C109605Yf.A00("BaseMediaDemuxer", "getMediaMetadata: Media metadata is null", new Object[0]);
                    throw new C98604rh("Media metadata is null");
                }
            } catch (IOException e) {
                Object[] A0L = AnonymousClass001.A0L();
                A0L[0] = e;
                C109605Yf.A00("BaseMediaDemuxer", "getMediaMetadata: IOException=%s", A0L);
                throw new C98604rh("Cannot extract metadata", e);
            }
        }
        return r0;
    }

    public void A06(long j) {
        long j2 = j + this.A02 + this.A01;
        if (this.A05 != null) {
            if (this.A04.A01(j2, TimeUnit.MICROSECONDS)) {
                C114965i7 r3 = this.A05;
                int i = 0;
                if (j2 == 0) {
                    i = 2;
                }
                r3.A00.seekTo(j2, i);
            }
        }
    }

    public AnonymousClass6VP(AnonymousClass7ez r7, C109655Yk r8, AnonymousClass65W r9) {
        this.A0A = r7;
        this.A07 = AnonymousClass001.A0J();
        this.A0B = r8;
        this.A03 = new AnonymousClass6D7();
        this.A0C = r9;
    }

    public static JSONObject A00(C114965i7 r8) {
        JSONObject A1B = C36441kJ.A1B();
        try {
            MediaExtractor mediaExtractor = r8.A00;
            A1B.put("sample-track-index", mediaExtractor.getSampleTrackIndex());
            A1B.put("track-count", mediaExtractor.getTrackCount());
            for (int i = 0; i < mediaExtractor.getTrackCount(); i++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                Locale locale = Locale.ROOT;
                Object[] A0L = AnonymousClass001.A0L();
                AnonymousClass000.A1L(A0L, i, 0);
                C90504aG.A1J(trackFormat, String.format(locale, "track-%d", A0L), A1B);
            }
        } catch (Exception unused) {
        }
        return A1B;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AnonymousClass5TE r8) {
        /*
            r7 = this;
            A01(r7)
            java.util.HashMap r1 = r7.A07
            boolean r0 = r1.containsKey(r8)
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r1.get(r8)
            int r1 = X.AnonymousClass000.A0I(r0)
            X.5i7 r0 = r7.A05
            android.media.MediaExtractor r0 = r0.A00
            r0.selectTrack(r1)
            X.5i7 r6 = r7.A05
            long r2 = r7.A02
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L_0x0026
            r1 = 2
        L_0x0026:
            android.media.MediaExtractor r0 = r6.A00
            r0.seekTo(r2, r1)
            X.5i7 r0 = r7.A05
            android.media.MediaExtractor r0 = r0.A00
            r0.getSampleTime()
        L_0x0032:
            X.5i7 r0 = r7.A05
            android.media.MediaExtractor r0 = r0.A00
            long r2 = r0.getSampleTime()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            X.6F3 r0 = r7.A04
            boolean r0 = r0.A01(r2, r1)
            if (r0 == 0) goto L_0x005e
            X.5i7 r0 = r7.A05
            android.media.MediaExtractor r0 = r0.A00
            long r2 = r0.getSampleTime()
            long r0 = r7.A02
            long r2 = r2 - r0
            long r0 = r7.A01
            long r0 = java.lang.Math.min(r2, r0)
            r7.A01 = r0
            X.5i7 r0 = r7.A05
            android.media.MediaExtractor r0 = r0.A00
            r0.getSampleTime()
        L_0x005e:
            long r3 = r7.A01
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x006f
            boolean r0 = r7.A08()
            if (r0 != 0) goto L_0x0032
        L_0x006f:
            r0 = 0
            r7.A08 = r0
            X.5i7 r6 = r7.A05
            long r2 = r7.A02
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L_0x007e
            r1 = 2
        L_0x007e:
            android.media.MediaExtractor r0 = r6.A00
            r0.seekTo(r2, r1)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VP.A07(X.5TE):void");
    }
}
