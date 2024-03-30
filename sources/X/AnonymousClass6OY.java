package X;

import android.graphics.RectF;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.6OY  reason: invalid class name */
public class AnonymousClass6OY {
    public static final RectF A0J = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    public int A00;
    public int A01 = 30;
    public int A02 = -1;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A = -1;
    public RectF A0B = A0J;
    public C128116Ay A0C;
    public Integer A0D;
    public String A0E;
    public List A0F;
    public boolean A0G;
    public boolean A0H = false;
    public boolean A0I;

    public int A00() {
        AnonymousClass6YR.A02(this.A0C, "MediaTranscodeParams", "transcode profile level: %s");
        C128116Ay r1 = this.A0C;
        if (r1 != null) {
            C108365Tf r0 = C108365Tf.CODEC_VIDEO_HEVC;
            C108365Tf r2 = r1.A02;
            if (r0.equals(r2) || 1 != r1.A01 || !C108365Tf.CODEC_VIDEO_H264.equals(r2)) {
                int i = this.A02;
                if (i == -1) {
                    int i2 = this.A00;
                    i = Math.min(Math.max((int) (((double) i2) * 0.85d), 655000), i2);
                    this.A02 = i;
                }
                AnonymousClass6YR.A02(Integer.valueOf(i), "MediaTranscodeParams", "using main/high bitrate: %s");
                return this.A02;
            }
        }
        AnonymousClass6YR.A02(Integer.valueOf(this.A00), "MediaTranscodeParams", "using baseline bitrate: %s");
        return this.A00;
    }

    public String toString() {
        int i;
        Integer valueOf;
        HashMap A0J2 = AnonymousClass001.A0J();
        A0J2.put("sourceWidth", Integer.valueOf(this.A06));
        A0J2.put("sourceHeight", Integer.valueOf(this.A04));
        A0J2.put("sourceRotationDegreesClockwise", Integer.valueOf(this.A05));
        A0J2.put("targetWidth", Integer.valueOf(this.A09));
        A0J2.put("targetHeight", Integer.valueOf(this.A07));
        A0J2.put("outputAspectRatio", Float.valueOf(0.0f));
        A0J2.put("shouldRetainAspectRatio", Boolean.valueOf(this.A0I));
        A0J2.put("targetRotationDegreesClockwise", Integer.valueOf(this.A08));
        A0J2.put("outputRotationDegreesClockwise", Integer.valueOf(this.A03));
        A0J2.put("cropRectangle", this.A0B);
        Integer num = this.A0D;
        if (num == null) {
            valueOf = null;
        } else {
            if (1 - num.intValue() != 0) {
                i = 0;
            } else {
                i = 1;
            }
            valueOf = Integer.valueOf(i);
        }
        A0J2.put("videoMirroringMode", valueOf);
        A0J2.put("baselineBitRate", Integer.valueOf(this.A00));
        A0J2.put("mainHighBitRate", Integer.valueOf(this.A02));
        A0J2.put("iframeinterval", C36331k8.A0S("frameRate", Integer.valueOf(this.A01), A0J2));
        A0J2.put("videoBitrateMode", Integer.valueOf(this.A0A));
        A0J2.put("videoTranscodeProfileLevelParams", this.A0C);
        A0J2.put("glRenderers", this.A0F);
        A0J2.put("debugStats", this.A0E);
        A0J2.put("forceAvcEncoding", Boolean.valueOf(this.A0G));
        return C131736Qi.A01(AnonymousClass6OY.class, A0J2);
    }
}
