package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Pair;
import android.util.Range;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1GJ  reason: invalid class name */
public class AnonymousClass1GJ {
    public final C19700wN A00;
    public final C20690y0 A01;
    public final C20810yC A02;
    public final AnonymousClass1DC A03;
    public final C21060yb A04;
    public final AnonymousClass1D4 A05;
    public final C19890wg A06;

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cc, code lost:
        if (r7 == 270) goto L_0x00ce;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass6OY A08(X.AnonymousClass65N r21, java.lang.Integer r22) {
        /*
            r6 = 1
            r13 = 0
            r5 = r22
            int r2 = r5.intValue()
            r0 = 0
            r1 = 2
            if (r2 == r0) goto L_0x00ab
            if (r2 == r6) goto L_0x00a4
            r0 = 3
            int[] r3 = new int[r1]
            if (r2 == r0) goto L_0x009f
            r3 = {720, 1280} // fill-array
        L_0x0016:
            X.9bb r2 = X.C197369bb.A01
            r4 = 1
            r1 = r3[r6]
            r0 = 0
            r0 = r3[r0]
            int r8 = java.lang.Math.max(r1, r0)
            r2.A00 = r8
            r0 = r21
            int r7 = r0.A04
            int r1 = r7 % 180
            if (r1 != 0) goto L_0x002d
            r4 = 0
        L_0x002d:
            X.6OY r3 = new X.6OY
            r3.<init>()
            int r10 = r0.A05
            r3.A06 = r10
            int r6 = r0.A03
            r3.A04 = r6
            r3.A05 = r7
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (int) r0
            r3.A01 = r0
            r3.A0F = r13
            if (r1 == 0) goto L_0x0096
            if (r4 == 0) goto L_0x0096
            r3.A09 = r6
            r4 = r6
            r3.A07 = r10
            r1 = r10
            r0 = 0
            r3.A08 = r0
        L_0x0050:
            int r0 = java.lang.Math.max(r10, r6)
            int r9 = java.lang.Math.min(r0, r8)
            float r4 = (float) r4
            float r0 = (float) r1
            float r4 = r4 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r3.A09 = r9
            float r0 = (float) r9
            float r0 = r0 / r4
            int r1 = (int) r0
            r3.A07 = r1
        L_0x0068:
            r8 = r9
            int r0 = r9 % 16
            if (r0 == 0) goto L_0x0071
            int r0 = 16 - r0
            int r8 = r9 + r0
        L_0x0071:
            float r4 = (float) r1
            float r1 = (float) r8
            float r0 = (float) r9
            float r1 = r1 / r0
            float r4 = r4 * r1
            int r1 = (int) r4
            r3.A07 = r1
            r3.A09 = r8
            int r0 = r1 % 16
            if (r0 == 0) goto L_0x0082
            int r0 = 16 - r0
            int r1 = r1 + r0
        L_0x0082:
            r3.A07 = r1
            java.lang.Integer r0 = X.C023109s.A00
            if (r5 == r0) goto L_0x00b2
            java.lang.Integer r0 = X.C023109s.A01
            if (r5 == r0) goto L_0x00b2
            return r3
        L_0x008d:
            r3.A07 = r9
            r1 = r9
            float r0 = (float) r9
            float r0 = r0 * r4
            int r9 = (int) r0
            r3.A09 = r9
            goto L_0x0068
        L_0x0096:
            r3.A09 = r10
            r4 = r10
            r3.A07 = r6
            r1 = r6
            r3.A08 = r7
            goto L_0x0050
        L_0x009f:
            r3 = {1080, 1920} // fill-array
            goto L_0x0016
        L_0x00a4:
            int[] r3 = new int[r1]
            r3 = {480, 848} // fill-array
            goto L_0x0016
        L_0x00ab:
            int[] r3 = new int[r1]
            r3 = {360, 640} // fill-array
            goto L_0x0016
        L_0x00b2:
            int r0 = r3.A03
            r22 = r0
            android.graphics.RectF r1 = r3.A0B
            java.lang.Integer r0 = r3.A0D
            r21 = r0
            X.6Ay r0 = r3.A0C
            r20 = r0
            int r15 = r3.A0A
            boolean r14 = r3.A0G
            r0 = 90
            if (r7 == r0) goto L_0x00ce
            r4 = 270(0x10e, float:3.78E-43)
            r0 = r10
            r3 = r6
            if (r7 != r4) goto L_0x00d0
        L_0x00ce:
            r0 = r6
            r3 = r10
        L_0x00d0:
            float r11 = (float) r0
            float r0 = r1.width()
            float r4 = r11 * r0
            float r5 = (float) r3
            float r0 = r1.height()
            float r3 = r5 * r0
            int r9 = (int) r4
            int r8 = (int) r3
            if (r9 <= r8) goto L_0x03d5
            int r0 = r2.A00
            if (r9 <= r0) goto L_0x03d5
            int r8 = r8 * r0
            int r8 = r8 / r9
            r9 = r0
        L_0x00e9:
            android.media.MediaCodecInfo$CodecCapabilities r2 = A03()
            if (r2 == 0) goto L_0x03d1
            android.media.MediaCodecInfo$VideoCapabilities r0 = r2.getVideoCapabilities()
            if (r0 == 0) goto L_0x03d1
            android.media.MediaCodecInfo$VideoCapabilities r0 = r2.getVideoCapabilities()
            int r19 = r0.getWidthAlignment()
        L_0x00fd:
            android.media.MediaCodecInfo$CodecCapabilities r2 = A03()
            if (r2 == 0) goto L_0x03cd
            android.media.MediaCodecInfo$VideoCapabilities r0 = r2.getVideoCapabilities()
            if (r0 == 0) goto L_0x03cd
            android.media.MediaCodecInfo$VideoCapabilities r0 = r2.getVideoCapabilities()
            int r18 = r0.getHeightAlignment()
        L_0x0111:
            float r12 = (float) r9
            float r16 = r12 / r4
            float r4 = (float) r8
            float r0 = r4 / r3
            float r3 = r1.left
            float r2 = r1.top
            float r16 = r16 * r11
            float r12 = r12 / r16
            float r1 = r3 + r12
            float r0 = r0 * r5
            float r4 = r4 / r0
            float r0 = r2 + r4
            android.graphics.RectF r12 = new android.graphics.RectF
            r12.<init>(r3, r2, r1, r0)
            r11 = 0
            android.media.MediaCodecInfo$CodecCapabilities r1 = A03()
            if (r1 == 0) goto L_0x03bb
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            if (r0 == 0) goto L_0x03bb
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            android.util.Range r17 = r0.getSupportedWidths()
        L_0x013f:
            android.media.MediaCodecInfo$CodecCapabilities r1 = A03()
            if (r1 == 0) goto L_0x03a9
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            if (r0 == 0) goto L_0x03a9
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            android.util.Range r16 = r0.getSupportedHeights()
        L_0x0153:
            X.6OY r5 = new X.6OY
            r5.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "getCorrectedResolution: Input targetWidth="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " targetHeight = "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            r4.append(r0)
            if (r8 == 0) goto L_0x017d
            if (r9 != 0) goto L_0x0186
        L_0x017d:
            java.lang.String r0 = "getCorrectedResolution-1"
            r4.append(r0)
            r8 = 1280(0x500, float:1.794E-42)
            r9 = 720(0x2d0, float:1.009E-42)
        L_0x0186:
            boolean r0 = A0A(r9, r8)
            if (r0 != 0) goto L_0x018f
            A0A(r8, r9)
        L_0x018f:
            r1 = r9
            r2 = r8
            int r0 = r9 % r19
            if (r0 == 0) goto L_0x019e
            int r1 = r19 - r0
            int r1 = r1 + r9
            float r3 = (float) r8
            float r2 = (float) r1
            float r0 = (float) r9
            float r2 = r2 / r0
            float r3 = r3 * r2
            int r2 = (int) r3
        L_0x019e:
            int r0 = r2 % r18
            if (r0 == 0) goto L_0x01a5
            int r0 = r18 - r0
            int r2 = r2 + r0
        L_0x01a5:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r1, r0)
            boolean r0 = A0A(r9, r8)
            if (r0 != 0) goto L_0x01e3
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            boolean r0 = A0A(r1, r0)
            if (r0 == 0) goto L_0x01e3
            java.lang.String r0 = "getCorrectedResolution-3"
            r4.append(r0)
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
        L_0x01e3:
            boolean r0 = A0A(r9, r8)
            if (r0 != 0) goto L_0x01fc
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            A0A(r1, r0)
        L_0x01fc:
            r2 = r9
            r3 = r8
            int r0 = r9 % r19
            if (r0 == 0) goto L_0x020a
            int r2 = r9 - r0
            float r3 = (float) r8
            float r1 = (float) r2
            float r0 = (float) r9
            float r1 = r1 / r0
            float r3 = r3 * r1
            int r3 = (int) r3
        L_0x020a:
            int r0 = r3 % r18
            if (r0 == 0) goto L_0x020f
            int r3 = r3 - r0
        L_0x020f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r1, r0)
            boolean r0 = A0A(r9, r8)
            if (r0 != 0) goto L_0x024d
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            boolean r0 = A0A(r1, r0)
            if (r0 == 0) goto L_0x024d
            java.lang.String r0 = "getCorrectedResolution-5"
            r4.append(r0)
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
        L_0x024d:
            boolean r0 = A0A(r9, r8)
            if (r0 != 0) goto L_0x0266
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            A0A(r1, r0)
        L_0x0266:
            r16.getUpper()
            r17.getUpper()
            boolean r0 = A0A(r9, r8)
            if (r0 != 0) goto L_0x02c5
            java.lang.Comparable r0 = r16.getUpper()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r8 <= r0) goto L_0x02c5
            java.lang.String r0 = "getCorrectedResolution-9"
            r4.append(r0)
            double r2 = (double) r9
            double r0 = (double) r8
            double r2 = r2 / r0
            java.lang.Comparable r0 = r16.getUpper()
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
            java.lang.Comparable r0 = r16.getUpper()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            double r0 = (double) r0
            double r2 = r2 * r0
            int r1 = (int) r2
            int r1 = r1 / r19
            int r1 = r1 * r19
            android.util.Range r0 = A07(r8)
            java.lang.Comparable r0 = r0.getLower()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = java.lang.Math.max(r1, r0)
            android.util.Range r0 = A07(r8)
            java.lang.Comparable r0 = r0.getUpper()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r9 = java.lang.Math.min(r1, r0)
        L_0x02c5:
            boolean r0 = A0A(r9, r8)
            if (r0 != 0) goto L_0x02fa
            java.lang.Comparable r0 = r17.getUpper()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r9 <= r0) goto L_0x02fa
            java.lang.String r0 = "getCorrectedResolution-10"
            r4.append(r0)
            double r0 = (double) r8
            double r2 = (double) r9
            double r0 = r0 / r2
            java.lang.Comparable r2 = r17.getUpper()
            java.lang.Number r2 = (java.lang.Number) r2
            int r9 = r2.intValue()
            java.lang.Comparable r2 = r17.getUpper()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            double r2 = (double) r2
            double r0 = r0 * r2
            int r8 = (int) r0
            int r8 = r8 / r18
            int r8 = r8 * r18
        L_0x02fa:
            boolean r0 = A0A(r9, r8)
            if (r0 != 0) goto L_0x032f
            java.lang.Comparable r0 = r16.getLower()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r8 >= r0) goto L_0x032f
            java.lang.String r0 = "getCorrectedResolution-11"
            r4.append(r0)
            double r2 = (double) r9
            double r0 = (double) r8
            double r2 = r2 / r0
            java.lang.Comparable r0 = r16.getLower()
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
            java.lang.Comparable r0 = r16.getLower()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            double r0 = (double) r0
            double r2 = r2 * r0
            int r9 = (int) r2
            int r9 = r9 / r19
            int r9 = r9 * r19
        L_0x032f:
            boolean r0 = A0A(r9, r8)
            if (r0 != 0) goto L_0x0364
            java.lang.Comparable r0 = r17.getLower()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r9 >= r0) goto L_0x0364
            java.lang.String r0 = "getCorrectedResolution-12"
            r4.append(r0)
            double r2 = (double) r8
            double r0 = (double) r9
            double r2 = r2 / r0
            java.lang.Comparable r0 = r17.getLower()
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            java.lang.Comparable r0 = r17.getLower()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            double r0 = (double) r0
            double r2 = r2 * r0
            int r8 = (int) r2
            int r8 = r8 / r18
            int r8 = r8 * r18
        L_0x0364:
            boolean r0 = A0A(r9, r8)
            if (r0 != 0) goto L_0x03e0
            java.lang.String r0 = "getCorrectedResolution-13"
            r4.append(r0)
            java.lang.Comparable r0 = r17.getUpper()
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            android.media.MediaCodecInfo$CodecCapabilities r1 = A03()
            if (r1 == 0) goto L_0x0398
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            if (r0 == 0) goto L_0x0398
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            android.util.Range r0 = r0.getSupportedHeightsFor(r9)
        L_0x038d:
            java.lang.Comparable r0 = r0.getUpper()
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
            goto L_0x03e0
        L_0x0398:
            r0 = 32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1280(0x500, float:1.794E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Range r0 = android.util.Range.create(r1, r0)
            goto L_0x038d
        L_0x03a9:
            r0 = 32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1280(0x500, float:1.794E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Range r16 = android.util.Range.create(r1, r0)
            goto L_0x0153
        L_0x03bb:
            r0 = 32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1280(0x500, float:1.794E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Range r17 = android.util.Range.create(r1, r0)
            goto L_0x013f
        L_0x03cd:
            r18 = 16
            goto L_0x0111
        L_0x03d1:
            r19 = 16
            goto L_0x00fd
        L_0x03d5:
            if (r8 <= r9) goto L_0x00e9
            int r0 = r2.A00
            if (r8 <= r0) goto L_0x00e9
            int r9 = r9 * r0
            int r9 = r9 / r8
            r8 = r0
            goto L_0x00e9
        L_0x03e0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0468 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0468 }
            java.lang.String r0 = "getSupportedFrameRatesFor ="
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x0468 }
            android.media.MediaCodecInfo$CodecCapabilities r1 = A03()     // Catch:{ IllegalArgumentException -> 0x0468 }
            if (r1 == 0) goto L_0x0457
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()     // Catch:{ IllegalArgumentException -> 0x0468 }
            if (r0 == 0) goto L_0x0457
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()     // Catch:{ IllegalArgumentException -> 0x0468 }
            android.util.Range r0 = r0.getSupportedFrameRatesFor(r9, r8)     // Catch:{ IllegalArgumentException -> 0x0468 }
        L_0x03fe:
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x0468 }
            java.lang.String r0 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x0468 }
            r4.append(r0)     // Catch:{ IllegalArgumentException -> 0x0468 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0468 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0468 }
            java.lang.String r0 = "getBitrateRange ="
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x0468 }
            android.media.MediaCodecInfo$CodecCapabilities r1 = A03()     // Catch:{ IllegalArgumentException -> 0x0468 }
            if (r1 == 0) goto L_0x0447
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()     // Catch:{ IllegalArgumentException -> 0x0468 }
            if (r0 == 0) goto L_0x0447
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()     // Catch:{ IllegalArgumentException -> 0x0468 }
            android.util.Range r0 = r0.getBitrateRange()     // Catch:{ IllegalArgumentException -> 0x0468 }
        L_0x0426:
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x0468 }
            java.lang.String r0 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x0468 }
            r4.append(r0)     // Catch:{ IllegalArgumentException -> 0x0468 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0468 }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x0468 }
            java.lang.String r0 = "mediaTranscodeParams.targetRotationDegreesClockwise = "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x0468 }
            int r0 = r5.A08     // Catch:{ IllegalArgumentException -> 0x0468 }
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x0468 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x0468 }
            r4.append(r0)     // Catch:{ IllegalArgumentException -> 0x0468 }
            goto L_0x0481
        L_0x0447:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ IllegalArgumentException -> 0x0468 }
            r0 = 500000(0x7a120, float:7.00649E-40)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0468 }
            android.util.Range r0 = android.util.Range.create(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0468 }
            goto L_0x0426
        L_0x0457:
            r0 = 0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0468 }
            r16 = 4629137466983448576(0x403e000000000000, double:30.0)
            java.lang.Double r0 = java.lang.Double.valueOf(r16)     // Catch:{ IllegalArgumentException -> 0x0468 }
            android.util.Range r0 = android.util.Range.create(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0468 }
            goto L_0x03fe
        L_0x0468:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "exception = "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.append(r0)
        L_0x0481:
            r5.A09 = r9
            r5.A07 = r8
            java.lang.String r1 = r4.toString()
            r5.A0E = r1
            int r0 = r5.A08
            int r11 = r11 + r0
            X.6OY r2 = new X.6OY
            r2.<init>()
            r2.A04 = r6
            r2.A06 = r10
            r2.A05 = r7
            r0 = r22
            r2.A03 = r0
            r0 = 0
            r2.A0I = r0
            r2.A08 = r11
            r2.A07 = r8
            r2.A09 = r9
            r2.A0B = r12
            r0 = r21
            r2.A0D = r0
            r0 = 655360(0xa0000, float:9.18355E-40)
            r2.A00 = r0
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = java.lang.Math.round(r0)
            r2.A01 = r0
            r0 = r20
            r2.A0C = r0
            r2.A0F = r13
            r2.A0A = r15
            r2.A0E = r1
            r2.A0G = r14
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GJ.A08(X.65N, java.lang.Integer):X.6OY");
    }

    public boolean A0H(C25471Gl r4, File file) {
        if (file != null) {
            try {
                if (AnonymousClass6Y1.A09(r4)) {
                    if (AnonymousClass1DC.A04(file).A01 != 0) {
                        return true;
                    }
                } else if ((C25471Gl.A05 == r4 || C25471Gl.A0L == r4 || C25471Gl.A0Q == r4 || C25471Gl.A0U == r4) && AnonymousClass1DC.A04(file).A01 == 2) {
                    return true;
                }
            } catch (IOException e) {
                Log.e("transcodeutils/isEligibleForMp4Check exception", e);
                return false;
            }
        }
        return false;
    }

    public boolean A0J(C25471Gl r6, File file, long j, boolean z, boolean z2) {
        int i;
        if (!z && !z2) {
            C20810yC r2 = this.A02;
            if (r6 == C25471Gl.A0X) {
                i = 4155;
            } else {
                i = 3656;
                if (AnonymousClass6Y1.A08(r6)) {
                    i = 3185;
                }
            }
            if (j <= ((long) C20800yB.A00(C21000yV.A02, r2, i)) * 1048576) {
                return !this.A03.A0G(file);
            }
        }
        return true;
    }

    public static float A00(int i, int i2, int i3, int i4, long j) {
        if (i2 == 0 || i3 == 0) {
            return 3.0f;
        }
        float f = (((float) ((i * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)) * 8000.0f) / ((float) (((i2 * i3) * 3) + 96000));
        float max = Math.max(0.0f, f - ((float) j)) / f;
        return (((float) (i4 - 3)) * max * max) + 3.0f;
    }

    private int A01(int i) {
        JSONObject jSONObject;
        Float A012 = this.A05.A01(0);
        C20810yC r2 = this.A02;
        r2.A0A(5550);
        JSONObject A0A = r2.A0A(5550);
        if (i <= 640) {
            try {
                jSONObject = A0A.getJSONObject("360");
            } catch (JSONException unused) {
            }
        } else if (i <= 854) {
            jSONObject = A0A.getJSONObject("480");
        } else if (i <= 1280) {
            jSONObject = A0A.getJSONObject("720");
        } else {
            jSONObject = A0A.getJSONObject("1080");
        }
        int i2 = jSONObject.getInt("min_bitrate");
        int i3 = jSONObject.getInt("max_bitrate");
        int i4 = jSONObject.getInt("null_bitrate");
        int i5 = jSONObject.getInt("min_bandwidth");
        int i6 = jSONObject.getInt("max_bandwidth");
        if (A012 != null) {
            float floatValue = A012.floatValue();
            float f = (float) i5;
            if (floatValue <= f) {
                i4 = i2;
            } else if (floatValue >= ((float) i6)) {
                i4 = i3;
            } else {
                i4 = (int) ((((floatValue - f) / ((float) (i6 - i5))) * ((float) (i3 - i2))) + ((float) i2));
            }
        }
        if (i4 > 0 && C20800yB.A01(C21000yV.A02, r2, 5549)) {
            return i4;
        }
        int i7 = 3755;
        if (i > 640) {
            i7 = 3756;
            if (i > 854) {
                i7 = 3758;
                if (i <= 1280) {
                    i7 = 3757;
                }
            }
        }
        return C20800yB.A00(C21000yV.A02, r2, i7);
    }

    public static int A02(MediaCodecInfo mediaCodecInfo) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc");
        StringBuilder sb = new StringBuilder();
        sb.append("videotranscoder/transcode/color formats: ");
        sb.append(capabilitiesForType.colorFormats.length);
        Log.i(sb.toString());
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i >= iArr.length || i2 != 0) {
                return i2;
            }
            int i3 = iArr[i];
            if (!(i3 == 39 || i3 == 2130706688)) {
                switch (i3) {
                    case 19:
                    case 20:
                    case 21:
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("videotranscoder/transcode/skipping unsupported color format ");
                        sb2.append(i3);
                        Log.i(sb2.toString());
                        continue;
                }
            }
            if (!"OMX.SEC.avc.enc".equals(mediaCodecInfo.getName()) || i3 != 19) {
                i2 = i3;
                i++;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("videotranscoder/transcode/skipping ");
                sb3.append(i3);
                sb3.append(" for OMX.SEC.avc.enc");
                Log.i(sb3.toString());
                i++;
            }
        }
        return i2;
    }

    public static MediaCodecInfo.CodecCapabilities A03() {
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.equalsIgnoreCase("video/avc")) {
                        return mediaCodecInfo.getCapabilitiesForType(str);
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static MediaCodecInfo A04(boolean z) {
        String name;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        StringBuilder sb = new StringBuilder();
        sb.append("videotranscoder/transcode/number of codecs: ");
        sb.append(r5);
        Log.i(sb.toString());
        MediaCodecInfo mediaCodecInfo = null;
        for (MediaCodecInfo mediaCodecInfo2 : codecInfos) {
            if (mediaCodecInfo2.isEncoder()) {
                if (AnonymousClass6YG.A0E(mediaCodecInfo2.getName(), false)) {
                    for (String equals : mediaCodecInfo2.getSupportedTypes()) {
                        if (equals.equals("video/avc")) {
                            return mediaCodecInfo2;
                        }
                    }
                    continue;
                } else if (z && (name = mediaCodecInfo2.getName()) != null && name.equals("OMX.google.h264.encoder")) {
                    String[] supportedTypes = mediaCodecInfo2.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        } else if (supportedTypes[i].equals("video/avc")) {
                            mediaCodecInfo = mediaCodecInfo2;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return mediaCodecInfo;
    }

    public static Pair A05(int i, int i2, int i3) {
        Integer valueOf;
        Integer valueOf2;
        if (i > i2) {
            if (i > i3) {
                valueOf = Integer.valueOf(i3);
                i2 = (i2 * i3) / i;
            }
            valueOf = Integer.valueOf(i);
        } else {
            if (i2 > i3) {
                valueOf = Integer.valueOf((i * i3) / i2);
                valueOf2 = Integer.valueOf(i3);
                return new Pair(valueOf, valueOf2);
            }
            valueOf = Integer.valueOf(i);
        }
        valueOf2 = Integer.valueOf(i2);
        return new Pair(valueOf, valueOf2);
    }

    public static Pair A06(AnonymousClass6BV r13, C1273567y r14, int i) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        int i2 = r14.A02;
        int i3 = r14.A00;
        long j = r14.A03;
        boolean z = true;
        if (!r14.A07) {
            if (i == 13) {
                if (r14.A06) {
                    str2 = "GifHasGifTag";
                } else if (r14.A05.length() > 262144) {
                    float A012 = ((float) r14.A01()) / ((float) (i2 * i3));
                    float A002 = C146526vk.A00(i2, i3) * 1.1f;
                    if (A012 <= A002) {
                        z = false;
                        StringBuilder sb = new StringBuilder();
                        sb.append("originalBitrate<=1.1TimesTranscodeBitrate | ");
                        sb.append(A012);
                        sb.append(" <= ");
                        sb.append(A002);
                        str = sb.toString();
                    }
                } else {
                    str2 = "IsAnimatedGif";
                }
                arrayList.add(str2);
                z = false;
            } else {
                int i4 = r13.A02;
                if (i2 > i4 || i3 > i4) {
                    if (i2 < i3) {
                        i2 = (i2 * i4) / i3;
                        i3 = i4;
                    } else {
                        i3 = (i3 * i4) / i2;
                        i2 = i4;
                    }
                }
                long j2 = j / 1000;
                if (((long) (((Math.min((float) r13.A01, ((float) (i2 * i3)) * A00(r13.A00, i2, i3, 9, j)) * ((float) j2)) / 8.0f) + ((float) ((j2 * 96000) / 8)))) >= r14.A05.length()) {
                    z = false;
                    str = "estimatedDstSize>=inputSize";
                }
            }
            arrayList.add(str);
        }
        return new Pair(Boolean.valueOf(z), arrayList);
    }

    public static ArrayList A09(String str) {
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
            if (!mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                int length = supportedTypes.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (supportedTypes[i].equals(str)) {
                        arrayList.add(mediaCodecInfo.getName());
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (((java.lang.Boolean) A06(r12, r13, r0).first).booleanValue() == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a1, code lost:
        if (r20 != false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A0B(X.AnonymousClass6BV r12, X.C1273567y r13, java.io.File r14, long r15, long r17, boolean r19, boolean r20, boolean r21) {
        /*
            r11 = this;
            long r0 = r15 - r17
            r2 = 1000(0x3e8, double:4.94E-321)
            long r9 = java.lang.Math.max(r2, r0)
            X.0yC r4 = r11.A02
            r1 = 422(0x1a6, float:5.91E-43)
            X.0yV r0 = X.C21000yV.A02
            boolean r8 = X.C20800yB.A01(r0, r4, r1)
            if (r21 != 0) goto L_0x0034
            r4 = 0
            int r0 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0034
            long r0 = r13.A03
            int r4 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0034
            long r6 = r14.length()
            int r0 = r12.A00
            long r0 = (long) r0
            r4 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 * r4
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x0034
            long r2 = r14.length()
            return r2
        L_0x0034:
            int r1 = X.C146526vk.A02(r8)
            r0 = 1
            if (r1 != r0) goto L_0x0050
            if (r21 != 0) goto L_0x0059
            r0 = 3
            if (r19 == 0) goto L_0x0042
            r0 = 13
        L_0x0042:
            android.util.Pair r0 = A06(r12, r13, r0)
            java.lang.Object r0 = r0.first
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0059
        L_0x0050:
            long r2 = r14.length()
            long r2 = r2 * r9
            long r0 = r13.A03
            long r2 = r2 / r0
            return r2
        L_0x0059:
            int r5 = r13.A02
            int r4 = r13.A00
            int r1 = r12.A02
            int r0 = java.lang.Math.max(r5, r4)
            int r0 = java.lang.Math.min(r1, r0)
            android.util.Pair r1 = A05(r5, r4, r0)
            java.lang.Object r0 = r1.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            java.lang.Object r0 = r1.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            if (r19 == 0) goto L_0x008b
            int r6 = r6 * r7
            int r0 = r6 * 2
            float r1 = (float) r0
        L_0x0081:
            r0 = 0
        L_0x0082:
            float r1 = r1 + r0
            long r9 = r9 / r2
            float r0 = (float) r9
            float r1 = r1 * r0
            r0 = 1090519040(0x41000000, float:8.0)
            float r1 = r1 / r0
            long r2 = (long) r1
            return r2
        L_0x008b:
            int r0 = r12.A01
            float r4 = (float) r0
            int r0 = r6 * r7
            float r1 = (float) r0
            int r5 = r12.A00
            r8 = 9
            float r0 = A00(r5, r6, r7, r8, r9)
            float r1 = r1 * r0
            float r1 = java.lang.Math.min(r4, r1)
            r0 = 1203470336(0x47bb8000, float:96000.0)
            if (r20 == 0) goto L_0x0082
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GJ.A0B(X.6BV, X.67y, java.io.File, long, long, boolean, boolean, boolean):long");
    }

    public Pair A0C(long j, long j2) {
        int i;
        ArrayList arrayList = new ArrayList();
        C20810yC r4 = this.A02;
        C21000yV r1 = C21000yV.A02;
        int A002 = C20800yB.A00(r1, r4, 3183);
        if (A002 > 1280 && !C20800yB.A01(r1, r4, 3047)) {
            A002 = VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH;
        }
        boolean z = true;
        boolean z2 = true;
        if (j <= 262144) {
            z2 = false;
            StringBuilder sb = new StringBuilder();
            sb.append("videoSize<=MIN_FILE_SIZE_FOR_BITRATE_CHECK | ");
            sb.append(j / 1024);
            sb.append("Kb <= 256Kb");
            arrayList.add(sb.toString());
        }
        if (j2 == 0) {
            i = 0;
        } else {
            i = (int) ((j * 8) / (j2 * 1000));
        }
        boolean z3 = false;
        if (i > A01(A002)) {
            z3 = true;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("videoBitrate<=maxBitrate | ");
            sb2.append(i);
            sb2.append("Kbps <= ");
            sb2.append(A01(A002));
            sb2.append("Kbps");
            arrayList.add(sb2.toString());
        }
        if (!z2 || !z3) {
            z = false;
        }
        return new Pair(Boolean.valueOf(z), arrayList);
    }

    public AnonymousClass6BV A0D() {
        C20810yC r2 = this.A02;
        C21000yV r1 = C21000yV.A02;
        int A002 = C20800yB.A00(r1, r2, 594);
        if (A002 > 1280 && !C20800yB.A01(r1, r2, 3047)) {
            A002 = VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH;
        }
        return new AnonymousClass6BV(C20800yB.A00(r1, r2, 596), A002, (int) (((long) A01(A002)) * 1000));
    }

    public AnonymousClass6BV A0E(boolean z, boolean z2, boolean z3) {
        C20810yC r2 = this.A02;
        C21000yV r1 = C21000yV.A02;
        int A002 = C20800yB.A00(r1, r2, 3183);
        int A003 = C20800yB.A00(r1, r2, 3185);
        if (z2) {
            A003 = C20800yB.A00(r1, r2, 3656);
            A002 = C20800yB.A00(r1, r2, 3654);
        }
        if (z3) {
            A003 = C20800yB.A00(r1, r2, 4155);
            A002 = C20800yB.A00(r1, r2, 4686);
        }
        if (z) {
            A003 = C20800yB.A00(r1, r2, 3659);
            A002 = C20800yB.A00(r1, r2, 4685);
        }
        if (A002 > 1280 && !C20800yB.A01(r1, r2, 3047)) {
            A002 = VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH;
        }
        return new AnonymousClass6BV(A003, A002, (int) (((long) A01(A002)) * 1000));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass011 A0F(android.content.Context r34, android.net.Uri r35, X.C1273567y r36, int r37) {
        /*
            r33 = this;
            r3 = r33
            r8 = r36
            if (r36 == 0) goto L_0x007c
            X.0yC r2 = r3.A02
            r1 = 6781(0x1a7d, float:9.502E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x007c
            long r2 = r8.A03
            int r6 = r8.A02
            int r5 = r8.A00
            int r4 = r8.A01
            int r0 = r8.A01()
            long r0 = (long) r0
            java.io.File r7 = r8.A05
            long r30 = r7.length()
            r9 = 0
            boolean r7 = r8.A07
            r32 = r7 ^ 1
            r23 = 0
            java.lang.String r18 = "VIDEO"
            X.65N r8 = new X.65N
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r19 = r9
            r24 = 0
            r25 = 0
            r10 = r9
            r26 = r2
            r28 = r0
            r20 = r6
            r21 = r5
            r22 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r32)
        L_0x004d:
            r0 = 1920(0x780, float:2.69E-42)
            r1 = r37
            if (r1 < r0) goto L_0x006b
            java.lang.Integer r0 = X.C023109s.A0G
        L_0x0055:
            X.6OY r1 = A08(r8, r0)
            int r0 = r1.A07
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r1.A09
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.011 r1 = new X.011
            r1.<init>(r2, r0)
            return r1
        L_0x006b:
            r0 = 1280(0x500, float:1.794E-42)
            if (r1 < r0) goto L_0x0072
            java.lang.Integer r0 = X.C023109s.A0C
            goto L_0x0055
        L_0x0072:
            r0 = 848(0x350, float:1.188E-42)
            if (r1 < r0) goto L_0x0079
            java.lang.Integer r0 = X.C023109s.A01
            goto L_0x0055
        L_0x0079:
            java.lang.Integer r0 = X.C023109s.A00
            goto L_0x0055
        L_0x007c:
            X.0yC r2 = r3.A02
            r1 = 6654(0x19fe, float:9.324E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            r2 = r34
            r1 = r35
            X.65N r8 = X.C129256Gb.A00(r2, r1, r0)
            if (r8 != 0) goto L_0x004d
            java.lang.String r0 = "videolite/BadVideoException sourceVideoMetadata==null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.011 r1 = new X.011
            r1.<init>(r0, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GJ.A0F(android.content.Context, android.net.Uri, X.67y, int):X.011");
    }

    public boolean A0I(C25471Gl r11, File file) {
        int i;
        try {
            byte[] bArr = C25471Gl.A0q;
            if (!AnonymousClass6Y1.A09(r11)) {
                return false;
            }
            C20810yC r4 = this.A02;
            if (r11 == C25471Gl.A0X) {
                i = 4155;
            } else {
                i = 3656;
                if (AnonymousClass6Y1.A08(r11)) {
                    i = 3185;
                }
            }
            C21000yV r3 = C21000yV.A02;
            if (file.length() > ((long) C20800yB.A00(r3, r4, i)) * 1048576) {
                return true;
            }
            if (C146526vk.A02(C20800yB.A01(r3, r4, 422)) == 1) {
                try {
                    C1273567y r6 = new C1273567y(file);
                    int A002 = C20800yB.A00(r3, r4, 3183);
                    if (A002 > 1280 && !C20800yB.A01(r3, r4, 3047)) {
                        A002 = VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH;
                    }
                    if (file.length() > 262144 && r6.A01() / 1000 > A01(A002)) {
                        return true;
                    }
                } catch (AnonymousClass1GL e) {
                    Log.e("videopreview/bad video", e);
                    return true;
                }
            }
            return !this.A03.A0G(file);
        } catch (IOException e2) {
            Log.e("transcodeutils/needtranscodemedia exception", e2);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0061, code lost:
        if (r2.A07 <= 0) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0073, code lost:
        if (X.AnonymousClass1GW.A0H(r10.A01, r1).exists() == false) goto L_0x0075;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002b */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0053 A[Catch:{ IOException -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0097 A[Catch:{ IOException -> 0x009d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K(X.AnonymousClass2bU r11) {
        /*
            r10 = this;
            X.3Qj r2 = r11.A01     // Catch:{ IOException -> 0x009d }
            boolean r0 = r11.A1h()     // Catch:{ IOException -> 0x009d }
            r1 = 0
            if (r0 == 0) goto L_0x0010
            if (r2 == 0) goto L_0x009c
            java.io.File r0 = r2.A0I     // Catch:{ IOException -> 0x009d }
            if (r0 != 0) goto L_0x0010
            return r1
        L_0x0010:
            X.C18740tg.A06(r2)     // Catch:{ IOException -> 0x009d }
            boolean r0 = r2.A0U     // Catch:{ IOException -> 0x009d }
            if (r0 != 0) goto L_0x009c
            X.1Gl r4 = X.AnonymousClass6Y1.A02(r11)     // Catch:{ IOException -> 0x009d }
            X.1Gl r0 = X.C25471Gl.A04     // Catch:{ IOException -> 0x009d }
            if (r4 == r0) goto L_0x0023
            X.1Gl r0 = X.C25471Gl.A0S     // Catch:{ IOException -> 0x009d }
            if (r4 != r0) goto L_0x002b
        L_0x0023:
            java.io.File r0 = r2.A0I     // Catch:{ IOException -> 0x009d }
            if (r0 == 0) goto L_0x009b
            X.C21656ATx.A04(r0)     // Catch:{ IOException -> 0x002b }
            goto L_0x009b
        L_0x002b:
            X.1Gl r0 = X.C25471Gl.A0D     // Catch:{ IOException -> 0x009d }
            if (r4 == r0) goto L_0x0097
            X.1Gl r0 = X.C25471Gl.A0l     // Catch:{ IOException -> 0x009d }
            if (r4 == r0) goto L_0x0097
            X.1Gl r0 = X.C25471Gl.A0J     // Catch:{ IOException -> 0x009d }
            if (r4 == r0) goto L_0x0097
            X.1Gl r0 = X.C25471Gl.A08     // Catch:{ IOException -> 0x009d }
            if (r4 == r0) goto L_0x0097
            X.1Gl r0 = X.C25471Gl.A0b     // Catch:{ IOException -> 0x009d }
            if (r4 == r0) goto L_0x0097
            X.1Gl r0 = X.C25471Gl.A0g     // Catch:{ IOException -> 0x009d }
            if (r4 == r0) goto L_0x0097
            X.1Gl r0 = X.C25471Gl.A09     // Catch:{ IOException -> 0x009d }
            if (r4 == r0) goto L_0x0097
            X.1Gl r0 = X.C25471Gl.A0T     // Catch:{ IOException -> 0x009d }
            if (r4 == r0) goto L_0x0097
            X.1Gl r0 = X.C25471Gl.A0G     // Catch:{ IOException -> 0x009d }
            if (r4 == r0) goto L_0x0097
            X.1Gl r0 = X.C25471Gl.A0H     // Catch:{ IOException -> 0x009d }
            if (r4 == r0) goto L_0x0097
            boolean r0 = X.AnonymousClass6Y1.A09(r4)     // Catch:{ IOException -> 0x009d }
            r3 = r10
            if (r0 == 0) goto L_0x007f
            int r0 = r2.A08     // Catch:{ IOException -> 0x009d }
            if (r0 <= 0) goto L_0x0063
            int r0 = r2.A07     // Catch:{ IOException -> 0x009d }
            r8 = 1
            if (r0 > 0) goto L_0x0064
        L_0x0063:
            r8 = 0
        L_0x0064:
            java.lang.String r1 = r2.A0K     // Catch:{ IOException -> 0x009d }
            if (r1 == 0) goto L_0x0075
            X.0y0 r0 = r10.A01     // Catch:{ IOException -> 0x009d }
            java.io.File r0 = X.AnonymousClass1GW.A0H(r0, r1)     // Catch:{ IOException -> 0x009d }
            boolean r0 = r0.exists()     // Catch:{ IOException -> 0x009d }
            r9 = 1
            if (r0 != 0) goto L_0x0076
        L_0x0075:
            r9 = 0
        L_0x0076:
            java.io.File r5 = r2.A0I     // Catch:{ IOException -> 0x009d }
            long r6 = r11.A00     // Catch:{ IOException -> 0x009d }
            boolean r1 = r3.A0J(r4, r5, r6, r8, r9)     // Catch:{ IOException -> 0x009d }
            return r1
        L_0x007f:
            boolean r0 = X.AnonymousClass6Y1.A03(r4)     // Catch:{ IOException -> 0x009d }
            if (r0 == 0) goto L_0x0090
            X.1DC r1 = r10.A03     // Catch:{ IOException -> 0x009d }
            java.io.File r0 = r2.A0I     // Catch:{ IOException -> 0x009d }
            boolean r0 = r1.A0F(r0)     // Catch:{ IOException -> 0x009d }
            r1 = r0 ^ 1
            return r1
        L_0x0090:
            boolean r0 = X.AnonymousClass6Y1.A07(r4)     // Catch:{ IOException -> 0x009d }
            if (r0 == 0) goto L_0x009c
            goto L_0x009b
        L_0x0097:
            java.io.File r0 = r2.A0I     // Catch:{ IOException -> 0x009d }
            if (r0 != 0) goto L_0x009c
        L_0x009b:
            r1 = 1
        L_0x009c:
            return r1
        L_0x009d:
            r1 = move-exception
            java.lang.String r0 = "transcodeutils/needtranscodemedia exception"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GJ.A0K(X.2bU):boolean");
    }

    public AnonymousClass1GJ(C19700wN r1, C20690y0 r2, C21060yb r3, C20810yC r4, AnonymousClass1D4 r5, C19890wg r6, AnonymousClass1DC r7) {
        this.A02 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r3;
        this.A05 = r5;
        this.A03 = r7;
        this.A06 = r6;
    }

    public static Range A07(int i) {
        MediaCodecInfo.CodecCapabilities A032 = A03();
        if (A032 == null || A032.getVideoCapabilities() == null) {
            return Range.create(32, Integer.valueOf(VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT));
        }
        return A032.getVideoCapabilities().getSupportedWidthsFor(i);
    }

    public static boolean A0A(int i, int i2) {
        MediaCodecInfo.CodecCapabilities A032 = A03();
        if (A032 == null || A032.getVideoCapabilities() == null) {
            return true;
        }
        return A032.getVideoCapabilities().isSizeSupported(i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0018 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0G(X.C25471Gl r6, java.io.File r7) {
        /*
            r5 = this;
            boolean r0 = X.AnonymousClass6Y1.A09(r6)
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x001a
            X.0yC r2 = r5.A02
            r1 = 422(0x1a6, float:5.91E-43)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            int r0 = X.C146526vk.A02(r0)
            if (r0 != r3) goto L_0x0019
        L_0x0018:
            r4 = 1
        L_0x0019:
            return r4
        L_0x001a:
            X.1Gl r0 = X.C25471Gl.A05
            if (r6 == r0) goto L_0x0051
            X.1Gl r0 = X.C25471Gl.A0k
            if (r6 == r0) goto L_0x0051
            X.1Gl r0 = X.C25471Gl.A0D
            if (r6 == r0) goto L_0x0018
            X.1Gl r0 = X.C25471Gl.A0l
            if (r6 == r0) goto L_0x0018
            X.1Gl r0 = X.C25471Gl.A0b
            if (r6 == r0) goto L_0x0018
            X.1Gl r0 = X.C25471Gl.A08
            if (r6 == r0) goto L_0x0018
            boolean r0 = X.AnonymousClass6Y1.A07(r6)
            if (r0 != 0) goto L_0x0018
            X.1Gl r0 = X.C25471Gl.A0J
            if (r6 == r0) goto L_0x0018
            X.1Gl r0 = X.C25471Gl.A0O
            if (r6 == r0) goto L_0x0018
            X.1Gl r0 = X.C25471Gl.A09
            if (r6 == r0) goto L_0x0018
            X.1Gl r0 = X.C25471Gl.A0T
            if (r6 == r0) goto L_0x0018
            X.1Gl r0 = X.C25471Gl.A0G
            if (r6 == r0) goto L_0x0018
            X.1Gl r0 = X.C25471Gl.A0H
            if (r6 != r0) goto L_0x0019
            goto L_0x0018
        L_0x0051:
            boolean r0 = X.C146516vj.A01(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GJ.A0G(X.1Gl, java.io.File):boolean");
    }
}
