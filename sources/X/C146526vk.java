package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.Mp4Ops;
import com.whatsapp.VideoFrameConverter;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6vk  reason: invalid class name and case insensitive filesystem */
public class C146526vk implements C159527jV {
    public static int A0a;
    public static String A0b;
    public static final byte[] A0c = {102, 116, 121, 112};
    public static final int[] A0d = {19, 20, 21, 39, 2141391872, 2130706688, 25, 2141391876, 2130706433, 2141391875, 2141391873, 11, 2130706944};
    public float A00 = 3.0f;
    public int A01;
    public long A02;
    public long A03;
    public AnonymousClass6SH A04;
    public C158387gq A05;
    public C130586Lq A06;
    public AnonymousClass6VQ A07;
    public File A08;
    public File A09;
    public File A0A;
    public boolean A0B = false;
    public boolean A0C = false;
    public byte[] A0D;
    public C159087in A0E;
    public File A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final long A0K;
    public final long A0L;
    public final RectF A0M;
    public final C19700wN A0N;
    public final AnonymousClass1AV A0O;
    public final C24341Cb A0P;
    public final C19630wG A0Q;
    public final C20810yC A0R;
    public final File A0S;
    public final Mp4Ops A0T;
    public final C132466Tv A0U;
    public final AnonymousClass1GJ A0V;
    public final C19770wU A0W;
    public final boolean A0X;
    public volatile boolean A0Y;
    public volatile boolean A0Z;

    public static float A00(int i, int i2) {
        return Math.max(2.0f, Math.min(10.0f, 153600.0f / ((float) (i * i2))));
    }

    public static int A01(int i) {
        switch (i) {
            case 11:
                return 7;
            case 21:
            case 39:
            case 2130706688:
            case 2141391873:
            case 2141391876:
                return 3;
            case 2130706433:
                return 6;
            case 2130706944:
                return 2;
            case 2141391872:
                return 4;
            case 2141391875:
                return 5;
            default:
                return 1;
        }
    }

    public static void A07(Bitmap bitmap, ByteBuffer byteBuffer, long j) {
        bitmap.copyPixelsToBuffer(byteBuffer);
        VideoFrameConverter.setOverlay(j, byteBuffer, 0, 0, bitmap.getWidth(), bitmap.getHeight());
    }

    public static boolean A0F(String str, String[] strArr) {
        if (strArr != null) {
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            for (String lowerCase2 : strArr) {
                if (lowerCase.startsWith(lowerCase2.toLowerCase(locale))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A0G(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(C90514aH.A0y(Build.MANUFACTURER));
            if (jSONArray.length() != 0) {
                int i = 0;
                while (i < jSONArray.length()) {
                    if (!Build.MODEL.equalsIgnoreCase(jSONArray.getString(i))) {
                        i++;
                    }
                }
                return false;
            }
            return true;
        } catch (JSONException unused) {
        }
    }

    public void cancel() {
        this.A0Y = true;
        C159087in r0 = this.A0E;
        if (r0 != null) {
            r0.cancel();
        }
    }

    public static synchronized int A02(boolean z) {
        int i;
        synchronized (C146526vk.class) {
            i = A0a;
            if (i == 0) {
                String str = null;
                i = 0;
                if (AnonymousClass6YG.A03()) {
                    i = 2;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("videotranscoder/istranscodesupported/unsupported model ");
                    A0u.append(Build.MANUFACTURER);
                    A0u.append("-");
                    C36341k9.A1O(A0u, Build.MODEL);
                } else {
                    try {
                        C36321k7.A1T("videotranscoder/istranscodesupported/number of codecs: ", AnonymousClass000.A0u(), r6);
                        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                            if (mediaCodecInfo.isEncoder() && AnonymousClass6YG.A0E(mediaCodecInfo.getName(), z)) {
                                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                                int length = supportedTypes.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= length) {
                                        break;
                                    } else if (supportedTypes[i2].equals("video/avc")) {
                                        str = mediaCodecInfo.getName();
                                        StringBuilder A0u2 = AnonymousClass000.A0u();
                                        A0u2.append("videotranscoder/istranscodesupported/found ");
                                        C36321k7.A1a(A0u2, mediaCodecInfo.getName());
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                        if (str != null) {
                            i = 1;
                        } else {
                            Log.w("videotranscoder/istranscodesupported/no encoder found");
                            i = 3;
                        }
                    } catch (Exception unused) {
                    }
                }
                A0E(str);
                A0a = i;
            }
        }
        return i;
    }

    public static C130586Lq A04(AnonymousClass6SH r9, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        Integer num;
        String str2;
        int i7;
        String str3;
        C130586Lq r5 = new C130586Lq(i, i2, i3);
        r5.A0A = str;
        int i8 = ~(i4 - 1);
        int i9 = ((i6 + i4) - 1) & i8;
        int i10 = ((i5 + i4) - 1) & i8;
        float f = ((float) i2) / (((float) i3) + 0.0f);
        int i11 = r5.A09;
        if (i11 >= i10 && r5.A06 >= i9) {
            num = C023109s.A00;
        } else if ((i11 >= i10 || r5.A06 < i9) && ((i11 >= i10 && r5.A06 < i9) || f > ((float) i10) / (((float) i9) + 0.0f))) {
            num = C023109s.A0C;
        } else {
            num = C023109s.A01;
        }
        if (num != C023109s.A00) {
            if (num == C023109s.A0C) {
                r5.A06 = i9;
                int i12 = (int) (((float) i11) + (((float) (i9 - r5.A06)) * f));
                r5.A09 = i12;
                int i13 = ((i12 + (i4 / 2)) - 1) & i8;
                r5.A09 = i13;
                i10 = Math.max(i13, i10);
                r5.A09 = i10;
            } else {
                r5.A09 = i10;
                int i14 = (int) (((float) r5.A06) + (((float) (i10 - i11)) / f));
                r5.A06 = i14;
                int i15 = ((i14 + (i4 / 2)) - 1) & i8;
                r5.A06 = i15;
                i9 = Math.max(i15, i9);
                r5.A06 = i9;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("videotranscoder/transcode/encoder parseEncoderFormat expand direction is ");
            switch (num.intValue()) {
                case 0:
                    str3 = "None";
                    break;
                case 1:
                    str3 = "Horizontal";
                    break;
                default:
                    str3 = "Vertical";
                    break;
            }
            A0u.append(str3);
            A0u.append(", input size: ");
            A0u.append(i2);
            A0u.append("x");
            A0u.append(i3);
            A0u.append(", after expansion: ");
            A0u.append(i10);
            C36321k7.A1T("x", A0u, i9);
        }
        int i16 = i4 / 2;
        int i17 = ((r5.A06 + i16) - 1) & i8;
        r5.A06 = i17;
        int i18 = ((r5.A09 + i16) - 1) & i8;
        r5.A09 = i18;
        r5.A08 = i18;
        r5.A07 = i17;
        if (str.startsWith("OMX.Nvidia.")) {
            r5.A08 = ((i18 + 15) / 16) * 16;
            r5.A07 = ((i17 + 15) / 16) * 16;
        }
        A0E(str);
        if (r9 == null || (str2 = r9.A05) == null || i <= 0 || (i7 = r9.A01) <= 0 || !str2.equals(str) || i7 != i) {
            r5.A05 = A01(i);
            if (A05() != null && C90514aH.A0y(A05()).startsWith("mt6572")) {
                r5.A05 = 2;
                Log.i("workaround wrong color format for mt6572 to FRAMECONV_COLOR_FORMAT_YV12");
                return r5;
            }
        } else {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("videotranscoder/parseEncoderFormat/forcing frame conver color id=");
            int i19 = r9.A03;
            C36321k7.A1Y(A0u2, i19);
            r5.A05 = i19;
        }
        return r5;
    }

    public static synchronized String A05() {
        String str;
        synchronized (C146526vk.class) {
            str = A0b;
        }
        return str;
    }

    public static String A06(String str) {
        BufferedReader A0b2;
        String str2 = "";
        try {
            String[] A1S = C36441kJ.A1S();
            A1S[0] = "/system/bin/getprop";
            A1S[1] = str;
            Process start = new ProcessBuilder(A1S).redirectErrorStream(true).start();
            A0b2 = C90484aE.A0b(start.getInputStream());
            while (true) {
                String readLine = A0b2.readLine();
                if (readLine != null) {
                    str2 = readLine;
                } else {
                    A0b2.close();
                    start.destroy();
                    return str2;
                }
            }
        } catch (IOException e) {
            Log.w("getsystemproperty/", e);
            return str2;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x005b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(X.C146526vk r4) {
        /*
            boolean r0 = r4.A0X
            if (r0 == 0) goto L_0x0069
            X.0yC r1 = r4.A0R
            r0 = 6407(0x1907, float:8.978E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0069
            java.io.File r0 = r4.A09
            java.lang.String r1 = r0.getPath()
            java.lang.String r0 = ".gif"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L_0x0069
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.io.File r0 = r4.A09
            java.io.File r0 = r0.getAbsoluteFile()
            r1.append(r0)
            java.lang.String r0 = "."
            r1.append(r0)
            java.lang.String r0 = "gif"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.io.File r0 = X.C90524aI.A0S(r0)
            r4.A0F = r0
            java.io.File r0 = r4.A09     // Catch:{ Exception -> 0x0069 }
            java.io.FileInputStream r3 = X.C90524aI.A0U(r0)     // Catch:{ Exception -> 0x0069 }
            java.io.File r0 = r4.A0F     // Catch:{ Exception -> 0x005b, all -> 0x005f }
            java.io.FileOutputStream r2 = X.C90524aI.A0W(r0)     // Catch:{ Exception -> 0x005b, all -> 0x005f }
            X.AnonymousClass6YY.A0J(r3, r2)     // Catch:{ all -> 0x0051 }
            java.io.File r0 = r4.A0F     // Catch:{ all -> 0x0051 }
            r4.A09 = r0     // Catch:{ all -> 0x0051 }
            r2.close()     // Catch:{ Exception -> 0x005b, all -> 0x005f }
            goto L_0x005b
        L_0x0051:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0056 }
            goto L_0x005a
        L_0x0056:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x005b, all -> 0x005f }
        L_0x005a:
            throw r1     // Catch:{ Exception -> 0x005b, all -> 0x005f }
        L_0x005b:
            r3.close()     // Catch:{ Exception -> 0x0069 }
            return
        L_0x005f:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0064 }
            goto L_0x0068
        L_0x0064:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0069 }
        L_0x0068:
            throw r1     // Catch:{ Exception -> 0x0069 }
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146526vk.A0C(X.6vk):void");
    }

    public static void A0D(C146526vk r6, long j) {
        r6.A02++;
        r6.A03 = j - (r6.A0K * 1000);
    }

    public static synchronized void A0E(String str) {
        synchronized (C146526vk.class) {
            if (A0b == null && "OMX.MTK.VIDEO.ENCODER.AVC".equals(str)) {
                String A062 = A06("ro.board.platform");
                A0b = A062;
                if (TextUtils.isEmpty(A062)) {
                    A0b = A06("ro.mediatek.platform");
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("videotranscoder/setHwBoardPlatform/board/");
                C36321k7.A1a(A0u, A0b);
            }
        }
    }

    public static int[] A0H(String str, int i) {
        if (i <= 0) {
            if (!str.equals("OMX.MTK.VIDEO.ENCODER.AVC") && !str.equals("OMX.MTK.VIDEO.DECODER.AVC")) {
                return A0d;
            }
            i = 2130706944;
        }
        int[] iArr = A0d;
        int[] iArr2 = new int[13];
        iArr2[0] = i;
        int i2 = 1;
        do {
            int i3 = iArr[i2 - 1];
            iArr2[i2] = i3;
            if (i3 == i) {
                iArr2[i2] = 0;
            }
            i2++;
        } while (i2 < 13);
        return iArr2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:298|299|300|301|302|303|611) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r4.A0E(6407) == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x041a, code lost:
        if (r0.A05.Bdi(r11) != false) goto L_0x041c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0650, code lost:
        if (r4.A0E(6407) == false) goto L_0x0652;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0878, code lost:
        if (r12 < 0) goto L_0x0ffb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x087a, code lost:
        r5 = r69.getTrackFormat(r12);
        X.AnonymousClass00C.A08(r5);
        r6 = r5.getString("mime");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0887, code lost:
        if (r6 == null) goto L_0x0fec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x088f, code lost:
        if ("video/unknown".equals(r6) != false) goto L_0x0fec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0891, code lost:
        r69.selectTrack(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x089a, code lost:
        if (r5.containsKey("durationUs") == false) goto L_0x08b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x089c, code lost:
        r22 = r5.getLong("durationUs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x08a0, code lost:
        r11 = X.AnonymousClass000.A0u();
        r11.append("videotranscoder/transcode/decoder format:");
        r11.append(r5);
        X.C36321k7.A1V(" duration:", r11, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x08b4, code lost:
        r22 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:?, code lost:
        r12 = android.media.MediaCodec.createDecoderByType(r6);
        r4 = r4.A0E(1250);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x08c9, code lost:
        if ("samsung".equalsIgnoreCase(android.os.Build.MANUFACTURER) == false) goto L_0x0915;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x08cb, code lost:
        if (r4 == false) goto L_0x0915;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x08cd, code lost:
        r15 = r12.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x08db, code lost:
        if (X.C90514aH.A0y(r15).startsWith("omx.exynos") != false) goto L_0x0911;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x08dd, code lost:
        r14 = X.AnonymousClass1GJ.A09(r6).iterator();
        r12 = null;
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x08eb, code lost:
        if (r14.hasNext() == false) goto L_0x090a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x08ed, code lost:
        r10 = X.AnonymousClass001.A0C(r14);
        r2 = X.C90514aH.A0y(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x08f9, code lost:
        if (r2.startsWith("omx.exynos") == false) goto L_0x08fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x08fb, code lost:
        if (r12 != null) goto L_0x08fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x08fd, code lost:
        r12 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0904, code lost:
        if (r2.startsWith("c2.exynos") != false) goto L_0x08e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0906, code lost:
        if (r11 != null) goto L_0x08e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0908, code lost:
        r11 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x090a, code lost:
        if (r12 == null) goto L_0x090e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x090c, code lost:
        r15 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x090e, code lost:
        if (r11 == null) goto L_0x0911;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0910, code lost:
        r15 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0911, code lost:
        r12 = android.media.MediaCodec.createByCodecName(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0915, code lost:
        if (r12 == null) goto L_0x0fd6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:?, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder created");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:?, code lost:
        r12.configure(r5, (android.view.Surface) null, (android.media.MediaCrypto) null, 0);
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder configured");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0987, code lost:
        r12.start();
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder started");
        r48 = r12.getInputBuffers();
        r47 = r12.getOutputBuffers();
        r9 = new android.media.MediaCodec.BufferInfo();
        r46 = new android.media.MediaCodec.BufferInfo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x09a3, code lost:
        if (r26 <= 0) goto L_0x09c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x09a5, code lost:
        r1 = r26 * 1000;
        r69.seekTo(r1, 0);
        r4 = X.AnonymousClass000.A0u();
        r4.append("videotranscoder/transcode/seek to:");
        r4.append(r1);
        r4.append(" actual:");
        X.C36351kA.A1S(r4, r69.getSampleTime());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x09c6, code lost:
        r35 = com.whatsapp.VideoFrameConverter.create();
        r1 = r0.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x09cc, code lost:
        if (r1 == null) goto L_0x0a21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x09ce, code lost:
        r2 = r1.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x09d2, code lost:
        if ((r2 instanceof java.util.Collection) == false) goto L_0x0a0c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x09d8, code lost:
        if (r2.isEmpty() == false) goto L_0x0a0c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x09da, code lost:
        r55 = X.C90524aI.A09(r67, r68);
        r0.A07.A04((360 - r71) % 360, r55);
        r56 = java.nio.ByteBuffer.allocateDirect((r55.getWidth() * r55.getHeight()) * 4);
        A07(r55, r56, r35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0a07, code lost:
        r66 = r3.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0a0c, code lost:
        r2 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0a14, code lost:
        if (r2.hasNext() == false) goto L_0x09da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0a1c, code lost:
        if ((X.C90524aI.A0N(r2) instanceof X.AnonymousClass5CZ) == false) goto L_0x0a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0a1e, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0a21, code lost:
        r55 = null;
        r56 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:?, code lost:
        r0.A03 = 0;
        r0.A02 = 0;
        r54 = 0;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0a2f, code lost:
        if (r52 != false) goto L_0x0d9b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0a33, code lost:
        if (r0.A0Y != false) goto L_0x0d9b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0a35, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0a38, code lost:
        if (r4 >= 0) goto L_0x0a43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0a3a, code lost:
        X.C36321k7.A1T("videotranscoder/transcode/loop ", X.AnonymousClass000.A0u(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0a43, code lost:
        if (r53 != false) goto L_0x0acc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0a45, code lost:
        r5 = r12.dequeueInputBuffer(1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0a4b, code lost:
        if (r4 >= 0) goto L_0x0a56;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0a4d, code lost:
        X.C36321k7.A1T("videotranscoder/decoder/dequeue/input ", X.AnonymousClass000.A0u(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0a56, code lost:
        if (r5 >= 0) goto L_0x0a59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0a59, code lost:
        r2 = r48[r5];
        X.AnonymousClass00C.A0D(r2, 0);
        r6 = r69.readSampleData(r2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0a64, code lost:
        if (r6 >= 0) goto L_0x0a7d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0a66, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/extractor BUFFER_FLAG_END_OF_STREAM");
        r12.queueInputBuffer(r5, 0, 0, 0, 4);
        r53 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0a7d, code lost:
        if (r4 >= 0) goto L_0x0a97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0a7f, code lost:
        r10 = X.AnonymousClass000.A0u();
        r10.append("videotranscoder/transcode/extractor/sample size:");
        r10.append(r6);
        r10.append(" time:");
        X.C36351kA.A1S(r10, r69.getSampleTime());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0a97, code lost:
        r12.queueInputBuffer(r5, 0, r6, r69.getSampleTime(), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0aa8, code lost:
        if (r4 >= 0) goto L_0x0ab3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0aaa, code lost:
        X.C36321k7.A1T("videotranscoder/decoder/queue/input ", X.AnonymousClass000.A0u(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0ab3, code lost:
        r5 = r69.advance();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0ab7, code lost:
        if (r4 >= 0) goto L_0x0acc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0ab9, code lost:
        X.C36321k7.A1X("videotranscoder/transcode/extractor/advance ", X.AnonymousClass000.A0u(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0ac3, code lost:
        X.C36321k7.A1T("videotranscoder/transcode/decoder/dequeue/input < 0", X.AnonymousClass000.A0u(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0acc, code lost:
        r11 = r12.dequeueOutputBuffer(r9, com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0ad3, code lost:
        if (r4 >= 0) goto L_0x0ade;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0ad5, code lost:
        X.C36321k7.A1T("videotranscoder/transcode/decoder/dequeue/output ", X.AnonymousClass000.A0u(), r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0ae0, code lost:
        if (r11 < 0) goto L_0x0ca5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:?, code lost:
        r49 = r26 * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0ae8, code lost:
        if (r9.presentationTimeUs < r49) goto L_0x0c8f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0aea, code lost:
        r5 = r13.dequeueInputBuffer(com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0af1, code lost:
        if (r4 >= 0) goto L_0x0afc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0af3, code lost:
        X.C36321k7.A1T("videotranscoder/transcode/encoder/dequeue/input ", X.AnonymousClass000.A0u(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0afc, code lost:
        if (r5 < 0) goto L_0x0c1f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0afe, code lost:
        r14 = r31[r5];
        r14.clear();
        r1 = r0.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0b05, code lost:
        if (r1 == null) goto L_0x0b38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0b07, code lost:
        if (r19 == false) goto L_0x0b38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0b09, code lost:
        r19 = true;
        r2 = r1.A04.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0b15, code lost:
        if (r2.hasNext() == false) goto L_0x0b1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0b17, code lost:
        r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0b1b, code lost:
        r55.eraseColor(0);
        r1 = r55;
        r0.A07.A04((360 - r71) % 360, r1);
        r56.rewind();
        A07(r1, r56, r35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0b38, code lost:
        r6 = r47[r11];
        X.C90464aC.A0s(r9, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0b41, code lost:
        if (r0.A02 == 0) goto L_0x0b45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0b43, code lost:
        if (r4 >= 0) goto L_0x0b78;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0b45, code lost:
        r15 = X.AnonymousClass000.A0u();
        r15.append("videotranscoder/transcode/convert decoderBufferInfo.offset:");
        r15.append(r9.offset);
        r15.append(" decoderBufferInfo.size:");
        r15.append(r9.size);
        r15.append(" decoderBufferInfo.presentationTimeUs:");
        r15.append(r9.presentationTimeUs);
        r15.append(" decoderBufferInfo.flags:");
        r15.append(r9.flags);
        X.C36321k7.A1T(" encoderFrameSize:", r15, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0b7a, code lost:
        if (r0.A0D != null) goto L_0x0b87;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0b7c, code lost:
        r1 = new byte[r6.remaining()];
        r6.get(r1);
        r0.A0D = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0b87, code lost:
        com.whatsapp.VideoFrameConverter.convertFrame(r35, r6, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0b90, code lost:
        if (r0.A02 == 0) goto L_0x0b94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0b92, code lost:
        if (r4 >= 0) goto L_0x0b99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0b94, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/converted");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0b99, code lost:
        r13.queueInputBuffer(r5, 0, r18, r9.presentationTimeUs, r9.flags);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0bb0, code lost:
        if (r0.A02 == 0) goto L_0x0bb4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0bb2, code lost:
        if (r4 >= 0) goto L_0x0bb9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0bb4, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/encoder/queue/input");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0bb9, code lost:
        r0.A02++;
        r5 = r9.presentationTimeUs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0bc4, code lost:
        if (r5 <= 0) goto L_0x0bca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0bc6, code lost:
        r0.A03 = r5 - r49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0bcc, code lost:
        if (r24 <= 0) goto L_0x0be5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0bce, code lost:
        r1 = r24 * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0bd2, code lost:
        if (r5 <= r1) goto L_0x0be5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0bd4, code lost:
        r15 = X.AnonymousClass000.A0u();
        r15.append("videotranscoder/transcode/end time detected ");
        r15.append(r5);
        X.C36321k7.A1V(" ", r15, r1);
        r52 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0be7, code lost:
        if (r22 <= 0) goto L_0x0c1f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0beb, code lost:
        if (r26 > 0) goto L_0x0bef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0bed, code lost:
        r49 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0bf1, code lost:
        if (r24 > 0) goto L_0x0bf6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0bf3, code lost:
        r14 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0bf6, code lost:
        r14 = r24 * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0bf8, code lost:
        r5 = (int) (((r9.presentationTimeUs - r49) * 100) / (r14 - r49));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0c05, code lost:
        if (r5 == r54) goto L_0x0c1f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0c09, code lost:
        if (r0.A05 == null) goto L_0x0c1f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0c0d, code lost:
        if (r0.A0Y != false) goto L_0x0c18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0c0f, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0c16, code lost:
        if (r0.A05.Bdi(r5) == false) goto L_0x0c19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0c18, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0c19, code lost:
        r0.A0Y = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0c1c, code lost:
        if (r5 < 5) goto L_0x0c26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0c1f, code lost:
        r5 = r54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0c24, code lost:
        if ((r5 % 5) != 0) goto L_0x0c40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0c26, code lost:
        r6 = X.AnonymousClass000.A0u();
        X.C36351kA.A1M("videotranscoder/transcode/progress ", " frames:", r6, r5);
        r6.append(r0.A02);
        r6.append(" duration:");
        X.C36351kA.A1S(r6, r0.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0c40, code lost:
        r6 = r13.dequeueOutputBuffer(r46, com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0c49, code lost:
        if (r4 >= 0) goto L_0x0c54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0c4b, code lost:
        X.C36321k7.A1T("videotranscoder/transcode/encoder/dequeue/output ", X.AnonymousClass000.A0u(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0c54, code lost:
        if (r6 < 0) goto L_0x0c6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0c56, code lost:
        r2 = r28[r6];
        X.C90464aC.A0s(r46, r2);
        r29.write(r2);
        r2.clear();
        r13.releaseOutputBuffer(r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0c68, code lost:
        if (r4 >= 0) goto L_0x0c8c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0c6a, code lost:
        r1 = "videotranscoder/transcode/encoder/release/output";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0c6e, code lost:
        if (r6 != -3) goto L_0x0c71;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0c72, code lost:
        if (r6 != -2) goto L_0x0c8c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0c74, code lost:
        r1 = X.AnonymousClass000.A0l(r13.getOutputFormat(), "videotranscoder/transcode/encoder output format has changed to ", X.AnonymousClass000.A0u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0c83, code lost:
        r28 = r13.getOutputBuffers();
        r1 = "videotranscoder/transcode/encoder output buffers have changed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0c89, code lost:
        com.whatsapp.util.Log.i(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0c8c, code lost:
        r54 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0c8f, code lost:
        r30 = r30 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0c91, code lost:
        if (r4 >= 0) goto L_0x0c9e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0c93, code lost:
        X.C36321k7.A1T("videotranscoder/transcode/frame skipped ", X.AnonymousClass000.A0u(), r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0c9e, code lost:
        r12.releaseOutputBuffer(r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0ca1, code lost:
        if (r4 >= 0) goto L_0x0d8c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0ca6, code lost:
        if (r11 != -3) goto L_0x0cb0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0ca8, code lost:
        r47 = r12.getOutputBuffers();
        r1 = "videotranscoder/transcode/decoder output buffers have changed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0cb1, code lost:
        if (r11 != -2) goto L_0x0d74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0cb3, code lost:
        r14 = A03(r12.getOutputFormat(), r0.A04, r32.getName());
        r0.A06 = r14;
        r11 = r14.A00;
        r6 = r14.A09;
        r5 = r14.A06;
        r50 = r14.A02;
        r49 = r14.A03;
        r3 = r14.A04;
        r2 = r14.A01;
        r15 = r32.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0cdf, code lost:
        if ("OMX.SEC.avc.enc".equals(r15) != false) goto L_0x0d15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0ce7, code lost:
        if ("OMX.SEC.avc.dec".equals(r15) != false) goto L_0x0d15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0cef, code lost:
        if ("OMX.Exynos.AVC.Encoder".equals(r15) != false) goto L_0x0d15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0cf7, code lost:
        if ("OMX.Exynos.AVC.Decoder".equals(r15) != false) goto L_0x0d15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0cff, code lost:
        if ("OMX.Intel.VideoEncoder.AVC".equals(r15) != false) goto L_0x0d15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0d07, code lost:
        if ("OMX.Intel.VideoDecoder.AVC".equals(r15) != false) goto L_0x0d15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0d09, code lost:
        r5 = java.lang.Math.max(r14.A07, r5);
        r6 = java.lang.Math.max(r14.A08, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0d15, code lost:
        r1 = r14.A05;
        com.whatsapp.VideoFrameConverter.configure(r35, r1, r6, r5, r50, r3, r49, r2, r66, r67, r68);
        r14 = X.AnonymousClass000.A0u();
        r14.append("videotranscoder/transcode/configure frame converter from:(");
        r14.append(r11);
        r14.append("[");
        r14.append(r1);
        X.C90464aC.A1K("] ", " ", r14, r6, r5);
        r14.append(" ");
        r14.append(r50);
        r14.append(" ");
        r14.append(r3);
        r14.append(" ");
        r14.append(r49);
        r14.append(" ");
        r14.append(r2);
        X.C90464aC.A1K(") to:(", "[", r14, r70, r66);
        X.C90464aC.A1K("] ", " ", r14, r67, r68);
        r1 = X.C90474aD.A0f(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0d75, code lost:
        if (r11 != -1) goto L_0x0d8c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0d77, code lost:
        if (r53 == false) goto L_0x0d8c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0d7d, code lost:
        if ((r9.flags & 4) != 0) goto L_0x0d84;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0d7f, code lost:
        com.whatsapp.util.Log.w("videotranscoder/transcode/decoder says try later after extractor finished");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0d84, code lost:
        r52 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0d87, code lost:
        r1 = "videotranscoder/transcode/decoder/release/output";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0d89, code lost:
        com.whatsapp.util.Log.i(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0d90, code lost:
        if ((r9.flags & 4) == 0) goto L_0x0a2d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0d92, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder OutputBuffer BUFFER_FLAG_END_OF_STREAM");
        r52 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:?, code lost:
        A0A(r12, "videotranscoder/transcode/decoder stopped", "videotranscoder/transcode/decoder released");
        A09(r46, r13, r29, r28);
        A0A(r13, "videotranscoder/transcode/encoder stopped", "videotranscoder/transcode/encoder released");
        r69.release();
        com.whatsapp.util.Log.i("videotranscoder/transcode/extractor released");
        com.whatsapp.VideoFrameConverter.release(r35);
        r3 = X.AnonymousClass000.A0u();
        r3.append("videotranscoder/transcode/done cancelled:");
        r3.append(r0.A0Y);
        r3.append(" frames:");
        r3.append(r0.A02);
        r3.append(" size:");
        r3.append(r0.A0A.length());
        r3.append(" duration:");
        r3.append(r0.A03);
        X.C36321k7.A1T(" skipfirstframes:", r3, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0df2, code lost:
        if (r29 == null) goto L_0x0df7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:?, code lost:
        r29.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:?, code lost:
        r37.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0dfc, code lost:
        if (r0.A0Y != false) goto L_0x0e0e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0e06, code lost:
        if (r0.A0A.length() == 0) goto L_0x0fa6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0e0c, code lost:
        if (r0.A02 == 0) goto L_0x0fa6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0e12, code lost:
        if (r0.A03 != 0) goto L_0x0e21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0e14, code lost:
        r0.A03 = java.util.concurrent.TimeUnit.SECONDS.toMicros(r0.A02) / 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0e21, code lost:
        r3 = X.AnonymousClass000.A0u();
        r3.append("videotranscoder/transcode/finished: size:");
        X.C36351kA.A1S(r3, r0.A0A.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0e39, code lost:
        if (r0.A09.exists() == false) goto L_0x0f47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0e3d, code lost:
        if (r0.A0Y != false) goto L_0x0e99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0e3f, code lost:
        r4 = X.AnonymousClass1DC.A04(r0.A09);
        r3 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0e48, code lost:
        if (r3 == 2) goto L_0x0e4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0e4b, code lost:
        if (r3 != 3) goto L_0x0e5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0e4d, code lost:
        r3 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0e50, code lost:
        if (r3 == 4) goto L_0x0e99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0e52, code lost:
        if (r3 == 2) goto L_0x0e99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0e55, code lost:
        if (r3 == 1) goto L_0x0e99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0e57, code lost:
        if (r3 == 0) goto L_0x0e99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0e5b, code lost:
        if (r3 != 8) goto L_0x0e5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0e5e, code lost:
        r2 = X.AnonymousClass000.A0u();
        r2.append(r74.getAbsoluteFile());
        r2 = X.C90524aI.A0S(X.AnonymousClass000.A0q(".aac", r2));
        r0.A08 = r2;
        r3 = new X.C123315wI(r0.A09, r2);
        r3.A01 = r26;
        r3.A02 = r24;
        r3.A00 = 96000;
        r4 = new X.C146516vj(r3);
        r4.A00 = new X.C164847sT(r0, 3);
        r4.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0e99, code lost:
        r73.A0H = X.C36441kJ.A0y(X.AnonymousClass1GW.A03(r74));
        r72.A0D(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0ead, code lost:
        if (r0.A0Y != false) goto L_0x0f2c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:?, code lost:
        r3 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0eb3, code lost:
        if (r3 <= 0) goto L_0x0ebb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0eb5, code lost:
        r20 = (r0.A02 * 1000000000) / r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0ebb, code lost:
        r1 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0ebd, code lost:
        if (r1 == null) goto L_0x0ef3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0ec3, code lost:
        if (r1.exists() == false) goto L_0x0ef1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0ec5, code lost:
        r9 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0ec7, code lost:
        r6 = new X.C1273567y(r0.A09).A01;
        r5 = r0.A0O;
        r11 = r74;
        com.whatsapp.Mp4Ops.A02(r5, r11, r9, r0.A0A, r0.A09, r6, r7, r20, r0.A03 / 1000, r26);
        r2 = true;
        com.whatsapp.Mp4Ops.A03(r5, r11, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0ef1, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0ef3, code lost:
        r9 = r0.A09;
        r7 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0f29, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:?, code lost:
        r8 = X.AnonymousClass000.A0u();
        r8.append("videotranscoder/transcode/input file disappeared, ");
        r7 = r0.A09;
        r6 = X.AnonymousClass000.A0u();
        X.C90464aC.A1A(r7, "file_path=", r6);
        r6.append(", ");
        r4 = r7.exists();
        r3 = r7.canRead();
        r2 = r7.canWrite();
        r6.append("exists=");
        r6.append(r4);
        r6.append(", ");
        r6.append("canRead=");
        r6.append(r3);
        r6.append(", ");
        r6.append("canWrite=");
        r6.append(r2);
        r6.append(", ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0f8d, code lost:
        if (r4 == false) goto L_0x0f97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0f8f, code lost:
        X.C90464aC.A19(r7, "length=", r6);
        r6.append(", ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0f97, code lost:
        X.C36321k7.A1Z(r8, r6.toString());
        r2 = X.C90524aI.A0V("input file missing after transcode");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0fa6, code lost:
        r2 = new X.AnonymousClass1GL();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0fad, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:?, code lost:
        com.whatsapp.util.Log.e("videotranscoder/transcode", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0fb3, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0fb4, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:?, code lost:
        A0A(r12, "videotranscoder/transcode/decoder stopped", "videotranscoder/transcode/decoder released");
        A09(r46, r13, r29, r28);
        A0A(r13, "videotranscoder/transcode/encoder stopped", "videotranscoder/transcode/encoder released");
        r69.release();
        com.whatsapp.util.Log.i("videotranscoder/transcode/extractor released");
        com.whatsapp.VideoFrameConverter.release(r35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0fd6, code lost:
        X.C36321k7.A1P("videotranscoder/transcode/can't create decoder for ", r6, X.AnonymousClass000.A0u());
        r1 = new X.AnonymousClass1GL();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0fe3, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:?, code lost:
        com.whatsapp.util.Log.e(X.C36321k7.A0D("videotranscoder/transcode/can't create decoder for ", r6), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0fec, code lost:
        X.C36321k7.A1P("videotranscoder/transcode/mime ", r6, X.AnonymousClass000.A0u());
        r1 = new X.AnonymousClass1GL();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0ffb, code lost:
        com.whatsapp.util.Log.e("videotranscoder/transcode/not a video file");
        r1 = new X.AnonymousClass1GL();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x101b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x104a, code lost:
        com.whatsapp.util.Log.e("videotranscodequeue/libmp4muxexception", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x1050, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x1051, code lost:
        X.AnonymousClass6YY.A0P(r0.A0A);
        r1 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x1058, code lost:
        if (r1 != null) goto L_0x105a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x105a, code lost:
        X.AnonymousClass6YY.A0P(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x105d, code lost:
        r0 = r0.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x105f, code lost:
        if (r0 != null) goto L_0x1061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x1061, code lost:
        X.AnonymousClass6YY.A0P(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x1064, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r3.A0E(3047) == false) goto L_0x001d;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:15:0x0053, B:507:0x0eaf] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:302:0x0983 */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x050f A[Catch:{ all -> 0x05eb, all -> 0x05f2, all -> 0x05f7 }, LOOP:7: B:171:0x050d->B:172:0x050f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x053d A[SYNTHETIC, Splitter:B:175:0x053d] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0586 A[Catch:{ 5V4 -> 0x0f29, all -> 0x1050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x05b0 A[Catch:{ 5V4 -> 0x0f29, all -> 0x1050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x05be A[Catch:{ all -> 0x05eb, all -> 0x05f2, all -> 0x05f7 }, LOOP:8: B:191:0x05bc->B:192:0x05be, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:527:0x0f35  */
    /* JADX WARNING: Removed duplicated region for block: B:530:0x0f3c  */
    /* JADX WARNING: Removed duplicated region for block: B:533:0x0f43  */
    /* JADX WARNING: Removed duplicated region for block: B:621:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0372 A[Catch:{ Exception -> 0x0500, all -> 0x04fa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I() {
        /*
            r75 = this;
            r0 = r75
            boolean r2 = r0.A0X
            r5 = 4319(0x10df, float:6.052E-42)
            if (r2 != 0) goto L_0x001d
            X.0yC r3 = r0.A0R
            org.json.JSONObject r1 = r3.A0A(r5)
            boolean r1 = A0G(r1)
            if (r1 != 0) goto L_0x001d
            r1 = 3047(0xbe7, float:4.27E-42)
            boolean r1 = r3.A0E(r1)
            r6 = 1
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r6 = 0
        L_0x001e:
            X.0yC r4 = r0.A0R
            org.json.JSONObject r1 = r4.A0A(r5)
            boolean r1 = A0G(r1)
            if (r1 != 0) goto L_0x0035
            if (r2 == 0) goto L_0x0035
            r1 = 6407(0x1907, float:8.978E-42)
            boolean r1 = r4.A0E(r1)
            r5 = 1
            if (r1 != 0) goto L_0x0036
        L_0x0035:
            r5 = 0
        L_0x0036:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.io.File r1 = r0.A0S
            r74 = r1
            java.io.File r1 = r74.getAbsoluteFile()
            r3.append(r1)
            java.lang.String r1 = ".h264"
            java.lang.String r1 = X.AnonymousClass000.A0q(r1, r3)
            java.io.File r1 = X.C90524aI.A0S(r1)
            r0.A0A = r1
            if (r5 == 0) goto L_0x0061
            X.6Tv r2 = r0.A0U     // Catch:{ all -> 0x1050 }
            r1 = 4
            X.58x r2 = r2.A02     // Catch:{ all -> 0x1050 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x1050 }
            r2.A0B = r1     // Catch:{ all -> 0x1050 }
            r3 = 1
            goto L_0x062e
        L_0x0061:
            r16 = 1000(0x3e8, double:4.94E-321)
            r33 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            java.lang.String r45 = "videotranscodequeue/libmp4muxexception"
            r20 = 30000(0x7530, double:1.4822E-319)
            r7 = 0
            if (r2 == 0) goto L_0x0620
            X.6Tv r1 = r0.A0U     // Catch:{ all -> 0x1050 }
            r66 = r1
            r2 = 5
            X.58x r1 = r1.A02     // Catch:{ all -> 0x1050 }
            r73 = r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x1050 }
            r1.A0B = r2     // Catch:{ all -> 0x1050 }
            java.lang.String r30 = " duration:"
            java.lang.String r28 = " frames:"
            java.lang.String r26 = "videotranscoder/transcode/encoder released"
            java.lang.String r25 = "videotranscoder/transcode/encoder stopped"
            java.lang.String r27 = "videotranscoder/transcode/encoder draining "
            java.lang.String r24 = "videotranscoder/transcode/encoder drained"
            java.lang.String r6 = "videotranscoder/transcode/encoder "
            java.lang.String r2 = "video/avc"
            java.lang.String r1 = "x"
            java.lang.String r3 = " "
            r0.A03 = r7     // Catch:{ all -> 0x1050 }
            r0.A02 = r7     // Catch:{ all -> 0x1050 }
            java.io.File r9 = r0.A09     // Catch:{ all -> 0x1050 }
            X.9WW r5 = X.C21656ATx.A04     // Catch:{ all -> 0x1050 }
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r9 = android.os.ParcelFileDescriptor.open(r9, r5)     // Catch:{ all -> 0x1050 }
            r5 = 0
            X.ATx r29 = X.C21656ATx.A01(r9, r5)     // Catch:{ all -> 0x1050 }
            java.lang.String r5 = "videotranscoder/transcode/gif decoder created"
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ all -> 0x061a }
            r5 = r29
            com.facebook.animated.gif.GifImage r5 = r5.A00     // Catch:{ all -> 0x061a }
            r65 = r5
            int r32 = r65.getWidth()     // Catch:{ all -> 0x061a }
            int r31 = r65.getHeight()     // Catch:{ all -> 0x061a }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x061a }
            java.lang.String r5 = "videotranscoder/transcode/gif "
            r9.append(r5)     // Catch:{ all -> 0x061a }
            r5 = r32
            r9.append(r5)     // Catch:{ all -> 0x061a }
            r5 = r31
            X.C36321k7.A1T(r1, r9, r5)     // Catch:{ all -> 0x061a }
            r9 = r32
        L_0x00cc:
            r10 = 128(0x80, float:1.794E-43)
            if (r9 < r10) goto L_0x00d3
            if (r5 < r10) goto L_0x00d3
            goto L_0x00d8
        L_0x00d3:
            int r9 = r9 * 2
            int r5 = r5 * 2
            goto L_0x00cc
        L_0x00d8:
            java.lang.StringBuilder r10 = X.C90464aC.A0h(r9, r6)     // Catch:{ all -> 0x061a }
            X.C36321k7.A1T(r1, r10, r5)     // Catch:{ all -> 0x061a }
            if (r9 <= r5) goto L_0x00e2
            goto L_0x00ec
        L_0x00e2:
            int r10 = r0.A0H     // Catch:{ all -> 0x061a }
            if (r5 <= r10) goto L_0x00f5
            int r9 = r32 * r10
            int r9 = r9 / r31
            r5 = r10
            goto L_0x00f5
        L_0x00ec:
            int r10 = r0.A0H     // Catch:{ all -> 0x061a }
            if (r9 <= r10) goto L_0x00f5
            int r5 = r31 * r10
            int r5 = r5 / r32
            r9 = r10
        L_0x00f5:
            java.lang.StringBuilder r10 = X.C90464aC.A0h(r9, r6)     // Catch:{ all -> 0x061a }
            X.C36321k7.A1T(r1, r10, r5)     // Catch:{ all -> 0x061a }
            int r10 = r9 * r5
            float r10 = (float) r10     // Catch:{ all -> 0x061a }
            float r11 = A00(r9, r5)     // Catch:{ all -> 0x061a }
            float r10 = r10 * r11
            int r10 = (int) r10     // Catch:{ all -> 0x061a }
            r0.A01 = r10     // Catch:{ all -> 0x061a }
            r10 = 422(0x1a6, float:5.91E-43)
            boolean r4 = r4.A0E(r10)     // Catch:{ all -> 0x061a }
            android.media.MediaCodecInfo r12 = X.AnonymousClass1GJ.A04(r4)     // Catch:{ all -> 0x061a }
            if (r12 == 0) goto L_0x060a
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x061a }
            java.lang.String r4 = "videotranscoder/transcode/found "
            r10.append(r4)     // Catch:{ all -> 0x061a }
            java.lang.String r4 = r12.getName()     // Catch:{ all -> 0x061a }
            r10.append(r4)     // Catch:{ all -> 0x061a }
            java.lang.String r4 = " supporting "
            X.C36321k7.A1Q(r4, r2, r10)     // Catch:{ all -> 0x061a }
            int r37 = X.AnonymousClass1GJ.A02(r12)     // Catch:{ all -> 0x061a }
            if (r37 == 0) goto L_0x05fe
            java.lang.String r36 = r12.getName()     // Catch:{ all -> 0x061a }
            java.lang.String r10 = r12.getName()     // Catch:{ all -> 0x061a }
            java.lang.String r4 = "OMX.qcom.video.encoder.avc"
            boolean r4 = r10.equals(r4)     // Catch:{ all -> 0x061a }
            int r40 = X.C90494aF.A07(r4)
            X.6SH r4 = r0.A04     // Catch:{ all -> 0x061a }
            r13 = 0
            r11 = 0
            r42 = 0
            r41 = 0
            r35 = r4
            r38 = r9
            r39 = r5
            X.6Lq r10 = A04(r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x061a }
            int r9 = r10.A00     // Catch:{ all -> 0x061a }
            int r5 = r10.A09     // Catch:{ all -> 0x061a }
            int r4 = r10.A06     // Catch:{ all -> 0x061a }
            java.lang.StringBuilder r6 = X.C90464aC.A0h(r5, r6)     // Catch:{ all -> 0x061a }
            X.C36321k7.A1T(r1, r6, r4)     // Catch:{ all -> 0x061a }
            int r6 = r10.A08     // Catch:{ all -> 0x061a }
            int r1 = r6 / 2
            r52 = r1
            int r1 = r10.A07     // Catch:{ all -> 0x061a }
            int r6 = r6 * r1
            int r52 = r52 * r1
            int r52 = r52 + r6
            java.lang.String r1 = r12.getName()     // Catch:{ all -> 0x061a }
            android.media.MediaCodec r6 = android.media.MediaCodec.createByCodecName(r1)     // Catch:{ all -> 0x061a }
            java.lang.String r1 = "videotranscoder/transcode/encoder created"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x061a }
            android.media.MediaFormat r12 = android.media.MediaFormat.createVideoFormat(r2, r5, r4)     // Catch:{ all -> 0x061a }
            java.lang.String r2 = "bitrate"
            int r1 = r0.A01     // Catch:{ all -> 0x061a }
            r12.setInteger(r2, r1)     // Catch:{ all -> 0x061a }
            java.lang.String r2 = "frame-rate"
            r1 = 15
            r12.setInteger(r2, r1)     // Catch:{ all -> 0x061a }
            java.lang.String r1 = "color-format"
            r12.setInteger(r1, r9)     // Catch:{ all -> 0x061a }
            java.lang.String r2 = "i-frame-interval"
            r1 = 10
            r12.setInteger(r2, r1)     // Catch:{ all -> 0x061a }
            java.lang.String r2 = "stride"
            int r1 = r10.A08     // Catch:{ all -> 0x061a }
            r12.setInteger(r2, r1)     // Catch:{ all -> 0x061a }
            java.lang.String r2 = "slice-height"
            int r1 = r10.A07     // Catch:{ all -> 0x061a }
            r12.setInteger(r2, r1)     // Catch:{ all -> 0x061a }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x061a }
            java.lang.String r1 = "videotranscoder/transcode/configure encoder with output format "
            X.C36321k7.A1K(r12, r1, r2)     // Catch:{ all -> 0x061a }
            r2 = 0
            r1 = 1
            r6.configure(r12, r2, r2, r1)     // Catch:{ all -> 0x061a }
            java.lang.String r1 = "videotranscoder/transcode/encoder configured"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x061a }
            r6.start()     // Catch:{ all -> 0x061a }
            java.lang.String r1 = "videotranscoder/transcode/encoder started"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x061a }
            int r12 = r10.A05     // Catch:{ all -> 0x061a }
            java.nio.ByteBuffer[] r51 = r6.getInputBuffers()     // Catch:{ all -> 0x061a }
            java.nio.ByteBuffer[] r50 = r6.getOutputBuffers()     // Catch:{ all -> 0x061a }
            java.io.File r1 = r0.A0A     // Catch:{ all -> 0x061a }
            java.io.FileOutputStream r48 = X.C90524aI.A0W(r1)     // Catch:{ all -> 0x061a }
            java.nio.channels.FileChannel r49 = r48.getChannel()     // Catch:{ all -> 0x05f7 }
            android.media.MediaCodec$BufferInfo r10 = new android.media.MediaCodec$BufferInfo     // Catch:{ all -> 0x05eb }
            r10.<init>()     // Catch:{ all -> 0x05eb }
            long r22 = com.whatsapp.VideoFrameConverter.create()     // Catch:{ all -> 0x05eb }
            X.6VQ r1 = r0.A07     // Catch:{ all -> 0x05eb }
            if (r1 == 0) goto L_0x0287
            java.util.List r2 = r1.A04     // Catch:{ all -> 0x05eb }
            boolean r1 = r2 instanceof java.util.Collection     // Catch:{ all -> 0x05eb }
            r47 = 0
            if (r1 == 0) goto L_0x0271
            boolean r1 = r2.isEmpty()     // Catch:{ all -> 0x05eb }
            if (r1 == 0) goto L_0x0271
        L_0x01ef:
            android.graphics.Bitmap r46 = X.C90524aI.A09(r5, r4)     // Catch:{ all -> 0x05eb }
            X.6VQ r2 = r0.A07     // Catch:{ all -> 0x05eb }
            r1 = r46
            r2.A04(r13, r1)     // Catch:{ all -> 0x05eb }
            int r2 = r46.getWidth()     // Catch:{ all -> 0x05eb }
            int r1 = r46.getHeight()     // Catch:{ all -> 0x05eb }
            int r2 = r2 * r1
            int r1 = r2 * 4
            java.nio.ByteBuffer r44 = java.nio.ByteBuffer.allocateDirect(r1)     // Catch:{ all -> 0x05eb }
            r14 = r44
            r13 = r46
            r1 = r22
            A07(r13, r14, r1)     // Catch:{ all -> 0x05eb }
        L_0x0212:
            int r2 = r32 + -1
            int r43 = r31 + -1
            r55 = 7
            r58 = 0
            r59 = 0
            r53 = r22
            r56 = r32
            r57 = r31
            r60 = r2
            r61 = r43
            r62 = r12
            r63 = r5
            r64 = r4
            com.whatsapp.VideoFrameConverter.configure(r53, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64)     // Catch:{ all -> 0x05eb }
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x05eb }
            java.lang.String r14 = "videotranscoder/transcode/configure frame converter from:([7] "
            r13 = r32
            r1 = r31
            X.C90464aC.A1K(r14, r3, r15, r13, r1)     // Catch:{ all -> 0x05eb }
            r15.append(r3)     // Catch:{ all -> 0x05eb }
            r15.append(r11)     // Catch:{ all -> 0x05eb }
            r15.append(r3)     // Catch:{ all -> 0x05eb }
            r15.append(r11)     // Catch:{ all -> 0x05eb }
            r15.append(r3)     // Catch:{ all -> 0x05eb }
            r15.append(r2)     // Catch:{ all -> 0x05eb }
            r15.append(r3)     // Catch:{ all -> 0x05eb }
            r1 = r43
            r15.append(r1)     // Catch:{ all -> 0x05eb }
            java.lang.String r1 = ") to:("
            r15.append(r1)     // Catch:{ all -> 0x05eb }
            r15.append(r9)     // Catch:{ all -> 0x05eb }
            java.lang.String r1 = "["
            r15.append(r1)     // Catch:{ all -> 0x05eb }
            r15.append(r12)     // Catch:{ all -> 0x05eb }
            java.lang.String r1 = "] "
            X.C90464aC.A1K(r1, r3, r15, r5, r4)     // Catch:{ all -> 0x05eb }
            java.lang.String r1 = ")"
            X.C36321k7.A1a(r15, r1)     // Catch:{ all -> 0x05eb }
            goto L_0x028e
        L_0x0271:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x05eb }
        L_0x0275:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x05eb }
            if (r1 == 0) goto L_0x01ef
            X.6Ft r1 = X.C90524aI.A0N(r2)     // Catch:{ all -> 0x05eb }
            boolean r1 = r1 instanceof X.AnonymousClass5CZ     // Catch:{ all -> 0x05eb }
            if (r1 == 0) goto L_0x0275
            r47 = 1
            goto L_0x01ef
        L_0x0287:
            r44 = 0
            r46 = 0
            r47 = 0
            goto L_0x0212
        L_0x028e:
            int r42 = r65.getFrameCount()     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            java.lang.String r2 = "videotranscoder/transcode/gif frames:"
            r1 = r42
            X.C36321k7.A1T(r2, r3, r1)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            int r41 = r32 * 3
            int r40 = r41 * r31
            java.nio.ByteBuffer r39 = java.nio.ByteBuffer.allocateDirect(r40)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r2 = 0
            r38 = 0
            r3 = 0
            r18 = 0
        L_0x02ab:
            r1 = r42
            if (r3 >= r1) goto L_0x04d2
            int[] r1 = r65.getFrameDurations()     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r13 = r1[r3]     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r4 = 70
            if (r3 <= 0) goto L_0x02fe
            int r9 = r2 + r13
            if (r9 > r4) goto L_0x02fe
            int r1 = r42 + -1
            if (r3 != r1) goto L_0x04ca
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            java.lang.String r1 = "videotranscoder/handleLastFrame/"
            X.C36321k7.A1T(r1, r2, r3)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r1 = 1000000(0xf4240, double:4.940656E-318)
            int r54 = r6.dequeueInputBuffer(r1)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r11 = r51[r54]     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r11.clear()     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r1 = r22
            r5 = r39
            com.whatsapp.VideoFrameConverter.convertFrame(r1, r5, r11)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            int[] r1 = r65.getFrameDurations()     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r1 = r1[r3]     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            if (r1 >= r4) goto L_0x02e7
            r1 = 70
        L_0x02e7:
            long r1 = (long) r1     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            long r1 = r1 * r16
            long r4 = r18 + r1
            r59 = 4
            r55 = 0
            r53 = r6
            r56 = r52
            r57 = r4
            r53.queueInputBuffer(r54, r55, r56, r57, r59)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            A0D(r0, r4)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            goto L_0x04ca
        L_0x02fe:
            r1 = r29
            android.graphics.Bitmap r53 = r1.A05(r3)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            int r5 = r32 * r31
            int[] r1 = new int[r5]     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r37 = r1
            r9 = 0
            r55 = 0
            r57 = 0
            r58 = 0
            r59 = r32
            r54 = r1
            r56 = r32
            r60 = r31
            r53.getPixels(r54, r55, r56, r57, r58, r59, r60)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            int r1 = r5 * 3
            byte[] r12 = new byte[r1]     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r11 = 0
        L_0x0321:
            if (r11 >= r5) goto L_0x0343
            r15 = r37[r11]     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            int r1 = r15 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r36 = r1
            int r1 = r15 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r14 = (byte) r1     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r1 = r15 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            int r35 = r11 * 3
            r12[r35] = r36     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            int r15 = r35 + 1
            r12[r15] = r14     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            int r14 = r35 + 2
            r12[r14] = r1     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            int r11 = r11 + 1
            goto L_0x0321
        L_0x0343:
            r1 = r40
            byte[] r14 = new byte[r1]     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r15 = r43
            r11 = 0
        L_0x034a:
            if (r15 < 0) goto L_0x035a
            int r5 = r15 * 3
            int r5 = r5 * r32
            r1 = r41
            java.lang.System.arraycopy(r12, r5, r14, r11, r1)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            int r11 = r11 + r41
            int r15 = r15 + -1
            goto L_0x034a
        L_0x035a:
            r1 = r39
            r1.put(r14)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r1.position(r9)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            if (r3 != 0) goto L_0x0369
            if (r13 >= r4) goto L_0x0387
            r13 = 70
            goto L_0x0387
        L_0x0369:
            if (r2 < r4) goto L_0x0373
            long r1 = (long) r2     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            long r1 = r1 * r16
        L_0x036e:
            long r18 = r18 + r1
        L_0x0370:
            if (r3 >= r9) goto L_0x0387
            goto L_0x037e
        L_0x0373:
            int r1 = r2 + r13
            if (r1 <= r4) goto L_0x0370
            int r1 = 70 - r2
            int r13 = r13 - r1
            r1 = 70000(0x11170, double:3.45846E-319)
            goto L_0x036e
        L_0x037e:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            java.lang.String r1 = "videotranscoder/transcode/loop "
            X.C36321k7.A1T(r1, r2, r3)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
        L_0x0387:
            r1 = 1000000(0xf4240, double:4.940656E-318)
            int r4 = r6.dequeueInputBuffer(r1)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            if (r3 >= r9) goto L_0x0399
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            java.lang.String r1 = "videotranscoder/transcode/encoder/dequeue/input "
            X.C36321k7.A1T(r1, r2, r4)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
        L_0x0399:
            if (r4 < 0) goto L_0x0442
            r5 = r51[r4]     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r5.clear()     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            X.6VQ r1 = r0.A07     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            if (r1 == 0) goto L_0x03cb
            if (r47 == 0) goto L_0x03cb
            java.util.List r1 = r1.A04     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
        L_0x03ac:
            boolean r1 = r2.hasNext()     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            if (r1 == 0) goto L_0x03b6
            r2.next()     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            goto L_0x03ac
        L_0x03b6:
            r1 = r46
            r1.eraseColor(r9)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            X.6VQ r2 = r0.A07     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r2.A04(r9, r1)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r44.rewind()     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r12 = r44
            r11 = r1
            r1 = r22
            A07(r11, r12, r1)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
        L_0x03cb:
            r1 = r22
            r11 = r39
            com.whatsapp.VideoFrameConverter.convertFrame(r1, r11, r5)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            long r1 = r0.A02     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x03da
            if (r3 >= r9) goto L_0x03df
        L_0x03da:
            java.lang.String r1 = "videotranscoder/transcode/converted"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
        L_0x03df:
            r59 = 0
            r53 = r6
            r54 = r4
            r56 = r52
            r57 = r18
            r53.queueInputBuffer(r54, r55, r56, r57, r59)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            long r1 = r0.A02     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x03f4
            if (r3 >= r9) goto L_0x03f9
        L_0x03f4:
            java.lang.String r1 = "videotranscoder/transcode/encoder/queue/input"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
        L_0x03f9:
            r1 = r18
            A0D(r0, r1)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r11 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = (double) r3     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r1 = r42
            double r1 = (double) r1     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            double r4 = r4 / r1
            double r4 = r4 * r11
            int r11 = (int) r4     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r1 = r38
            if (r11 == r1) goto L_0x0442
            X.7gq r1 = r0.A05     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            if (r1 == 0) goto L_0x0442
            boolean r1 = r0.A0Y     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            if (r1 != 0) goto L_0x041c
            X.7gq r1 = r0.A05     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            boolean r2 = r1.Bdi(r11)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r1 = 0
            if (r2 == 0) goto L_0x041d
        L_0x041c:
            r1 = 1
        L_0x041d:
            r0.A0Y = r1     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r1 = 5
            if (r11 < r1) goto L_0x0426
            int r1 = r11 % 5
            if (r1 != 0) goto L_0x0440
        L_0x0426:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            java.lang.String r2 = "videotranscoder/transcode/progress "
            r1 = r28
            X.C36351kA.A1M(r2, r1, r4, r11)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            long r1 = r0.A02     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r4.append(r1)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r1 = r30
            r4.append(r1)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            long r1 = r0.A03     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            X.C36351kA.A1S(r4, r1)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
        L_0x0440:
            r38 = r11
        L_0x0442:
            int r4 = r42 + -1
            r1 = 1000000(0xf4240, double:4.940656E-318)
            if (r3 != r4) goto L_0x0481
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r4 = "videotranscoder/handleLastFrame/"
            X.C36321k7.A1T(r4, r5, r3)     // Catch:{ Exception -> 0x04d0 }
            int r54 = r6.dequeueInputBuffer(r1)     // Catch:{ Exception -> 0x04d0 }
            r12 = r51[r54]     // Catch:{ Exception -> 0x04d0 }
            r12.clear()     // Catch:{ Exception -> 0x04d0 }
            r4 = r22
            r11 = r39
            com.whatsapp.VideoFrameConverter.convertFrame(r4, r11, r12)     // Catch:{ Exception -> 0x04d0 }
            int[] r4 = r65.getFrameDurations()     // Catch:{ Exception -> 0x04d0 }
            r5 = r4[r3]     // Catch:{ Exception -> 0x04d0 }
            r4 = 70
            if (r5 >= r4) goto L_0x046e
            r5 = 70
        L_0x046e:
            long r4 = (long) r5     // Catch:{ Exception -> 0x04d0 }
            long r4 = r4 * r16
            long r11 = r18 + r4
            r59 = 4
            r53 = r6
            r56 = r52
            r57 = r11
            r53.queueInputBuffer(r54, r55, r56, r57, r59)     // Catch:{ Exception -> 0x04d0 }
            A0D(r0, r11)     // Catch:{ Exception -> 0x04d0 }
        L_0x0481:
            int r11 = r6.dequeueOutputBuffer(r10, r1)     // Catch:{ Exception -> 0x04d0 }
            if (r3 >= r9) goto L_0x0490
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r4 = "videotranscoder/transcode/encoder/dequeue/output "
            X.C36321k7.A1T(r4, r5, r11)     // Catch:{ Exception -> 0x04d0 }
        L_0x0490:
            if (r11 < 0) goto L_0x04a5
            r5 = r50[r11]     // Catch:{ Exception -> 0x04d0 }
            X.C90464aC.A0s(r10, r5)     // Catch:{ Exception -> 0x04d0 }
            r4 = r49
            r4.write(r5)     // Catch:{ Exception -> 0x04d0 }
            r5.clear()     // Catch:{ Exception -> 0x04d0 }
            r6.releaseOutputBuffer(r11, r9)     // Catch:{ Exception -> 0x04d0 }
            if (r3 >= r9) goto L_0x04cb
            goto L_0x04c4
        L_0x04a5:
            r4 = -3
            if (r11 != r4) goto L_0x04b2
            java.nio.ByteBuffer[] r50 = r6.getOutputBuffers()     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r4 = "videotranscoder/transcode/encoder output buffers have changed"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ Exception -> 0x04d0 }
            goto L_0x04cb
        L_0x04b2:
            r4 = -2
            if (r11 != r4) goto L_0x04cb
            android.media.MediaFormat r9 = r6.getOutputFormat()     // Catch:{ Exception -> 0x04d0 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r4 = "videotranscoder/transcode/encoder output format has changed to "
            java.lang.String r4 = X.AnonymousClass000.A0l(r9, r4, r5)     // Catch:{ Exception -> 0x04d0 }
            goto L_0x04c6
        L_0x04c4:
            java.lang.String r4 = "videotranscoder/transcode/encoder/release/output"
        L_0x04c6:
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ Exception -> 0x04d0 }
            goto L_0x04cb
        L_0x04ca:
            r13 = r9
        L_0x04cb:
            int r3 = r3 + 1
            r2 = r13
            goto L_0x02ab
        L_0x04d0:
            r4 = move-exception
            goto L_0x0504
        L_0x04d2:
            r1 = 1000000(0xf4240, double:4.940656E-318)
            int r4 = r6.dequeueOutputBuffer(r10, r1)     // Catch:{ all -> 0x05eb }
        L_0x04d9:
            if (r4 < 0) goto L_0x052e
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x05eb }
            r3 = r27
            X.C36321k7.A1T(r3, r5, r4)     // Catch:{ all -> 0x05eb }
            r5 = r50[r4]     // Catch:{ all -> 0x05eb }
            X.C90464aC.A0s(r10, r5)     // Catch:{ all -> 0x05eb }
            r3 = r49
            r3.write(r5)     // Catch:{ all -> 0x05eb }
            r5.clear()     // Catch:{ all -> 0x05eb }
            r3 = 0
            r6.releaseOutputBuffer(r4, r3)     // Catch:{ all -> 0x05eb }
            int r4 = r6.dequeueOutputBuffer(r10, r1)     // Catch:{ all -> 0x05eb }
            goto L_0x04d9
        L_0x04fa:
            r7 = move-exception
            r1 = 1000000(0xf4240, double:4.940656E-318)
            goto L_0x05b8
        L_0x0500:
            r4 = move-exception
            r1 = 1000000(0xf4240, double:4.940656E-318)
        L_0x0504:
            java.lang.String r3 = "videotranscoder/transcode"
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ all -> 0x05b7 }
            int r4 = r6.dequeueOutputBuffer(r10, r1)     // Catch:{ all -> 0x05eb }
        L_0x050d:
            if (r4 < 0) goto L_0x052e
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x05eb }
            r3 = r27
            X.C36321k7.A1T(r3, r5, r4)     // Catch:{ all -> 0x05eb }
            r5 = r50[r4]     // Catch:{ all -> 0x05eb }
            X.C90464aC.A0s(r10, r5)     // Catch:{ all -> 0x05eb }
            r3 = r49
            r3.write(r5)     // Catch:{ all -> 0x05eb }
            r5.clear()     // Catch:{ all -> 0x05eb }
            r3 = 0
            r6.releaseOutputBuffer(r4, r3)     // Catch:{ all -> 0x05eb }
            int r4 = r6.dequeueOutputBuffer(r10, r1)     // Catch:{ all -> 0x05eb }
            goto L_0x050d
        L_0x052e:
            com.whatsapp.util.Log.i((java.lang.String) r24)     // Catch:{ all -> 0x05eb }
            r1 = r25
            r2 = r26
            A0A(r6, r1, r2)     // Catch:{ all -> 0x05eb }
            com.whatsapp.VideoFrameConverter.release(r22)     // Catch:{ all -> 0x05eb }
            if (r49 == 0) goto L_0x0540
            r49.close()     // Catch:{ all -> 0x05f7 }
        L_0x0540:
            r48.close()     // Catch:{ all -> 0x061a }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x061a }
            java.lang.String r1 = "videotranscoder/transcode/done cancelled:"
            r3.append(r1)     // Catch:{ all -> 0x061a }
            boolean r1 = r0.A0Y     // Catch:{ all -> 0x061a }
            r3.append(r1)     // Catch:{ all -> 0x061a }
            r1 = r28
            r3.append(r1)     // Catch:{ all -> 0x061a }
            long r1 = r0.A02     // Catch:{ all -> 0x061a }
            r3.append(r1)     // Catch:{ all -> 0x061a }
            java.lang.String r1 = " size:"
            r3.append(r1)     // Catch:{ all -> 0x061a }
            java.io.File r1 = r0.A0A     // Catch:{ all -> 0x061a }
            long r1 = r1.length()     // Catch:{ all -> 0x061a }
            r3.append(r1)     // Catch:{ all -> 0x061a }
            r1 = r30
            r3.append(r1)     // Catch:{ all -> 0x061a }
            long r1 = r0.A03     // Catch:{ all -> 0x061a }
            X.C36351kA.A1S(r3, r1)     // Catch:{ all -> 0x061a }
            r29.close()     // Catch:{ all -> 0x1050 }
            java.io.File r1 = r0.A0A     // Catch:{ all -> 0x1050 }
            long r2 = r1.length()     // Catch:{ all -> 0x1050 }
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x05b0
            long r1 = r0.A03     // Catch:{ all -> 0x1050 }
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x05b0
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = "videotranscoder/transcode/finished: size:"
            r3.append(r1)     // Catch:{ all -> 0x1050 }
            java.io.File r1 = r0.A0A     // Catch:{ all -> 0x1050 }
            long r1 = r1.length()     // Catch:{ all -> 0x1050 }
            X.C36351kA.A1S(r3, r1)     // Catch:{ all -> 0x1050 }
            int r1 = X.AnonymousClass1GW.A03(r74)     // Catch:{ all -> 0x1050 }
            java.lang.Long r2 = X.C36441kJ.A0y(r1)     // Catch:{ all -> 0x1050 }
            r1 = r73
            r1.A0H = r2     // Catch:{ all -> 0x1050 }
            r2 = 1
            r1 = r66
            r1.A0D(r2)     // Catch:{ all -> 0x1050 }
            boolean r1 = r0.A0Y     // Catch:{ all -> 0x1050 }
            if (r1 != 0) goto L_0x0f2c
            goto L_0x0ef8
        L_0x05b0:
            X.1GL r2 = new X.1GL     // Catch:{ all -> 0x1050 }
            r2.<init>()     // Catch:{ all -> 0x1050 }
            goto L_0x104f
        L_0x05b7:
            r7 = move-exception
        L_0x05b8:
            int r4 = r6.dequeueOutputBuffer(r10, r1)     // Catch:{ all -> 0x05eb }
        L_0x05bc:
            if (r4 < 0) goto L_0x05dd
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x05eb }
            r3 = r27
            X.C36321k7.A1T(r3, r5, r4)     // Catch:{ all -> 0x05eb }
            r5 = r50[r4]     // Catch:{ all -> 0x05eb }
            X.C90464aC.A0s(r10, r5)     // Catch:{ all -> 0x05eb }
            r3 = r49
            r3.write(r5)     // Catch:{ all -> 0x05eb }
            r5.clear()     // Catch:{ all -> 0x05eb }
            r3 = 0
            r6.releaseOutputBuffer(r4, r3)     // Catch:{ all -> 0x05eb }
            int r4 = r6.dequeueOutputBuffer(r10, r1)     // Catch:{ all -> 0x05eb }
            goto L_0x05bc
        L_0x05dd:
            com.whatsapp.util.Log.i((java.lang.String) r24)     // Catch:{ all -> 0x05eb }
            r2 = r25
            r1 = r26
            A0A(r6, r2, r1)     // Catch:{ all -> 0x05eb }
            com.whatsapp.VideoFrameConverter.release(r22)     // Catch:{ all -> 0x05eb }
            throw r7     // Catch:{ all -> 0x05eb }
        L_0x05eb:
            r2 = move-exception
            if (r49 == 0) goto L_0x05f6
            r49.close()     // Catch:{ all -> 0x05f2 }
            goto L_0x05f6
        L_0x05f2:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x05f7 }
        L_0x05f6:
            throw r2     // Catch:{ all -> 0x05f7 }
        L_0x05f7:
            r2 = move-exception
            r48.close()     // Catch:{ all -> 0x05fc }
            goto L_0x0619
        L_0x05fc:
            r1 = move-exception
            goto L_0x0616
        L_0x05fe:
            java.lang.String r1 = "videotranscoder/transcode/no known color formats suported"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x061a }
            java.lang.String r1 = "No known color formats suported"
            java.io.FileNotFoundException r2 = X.C90524aI.A0V(r1)     // Catch:{ all -> 0x061a }
            goto L_0x0619
        L_0x060a:
            java.lang.String r1 = "videotranscoder/transcode/no codec supporting video/avc"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x061a }
            java.lang.String r1 = "No codec supporting video/avc"
            java.io.FileNotFoundException r2 = X.C90524aI.A0V(r1)     // Catch:{ all -> 0x061a }
            goto L_0x0619
        L_0x0616:
            r2.addSuppressed(r1)     // Catch:{ all -> 0x061a }
        L_0x0619:
            throw r2     // Catch:{ all -> 0x061a }
        L_0x061a:
            r2 = move-exception
            r29.close()     // Catch:{ all -> 0x102d }
            goto L_0x104f
        L_0x0620:
            if (r6 == 0) goto L_0x06a3
            X.6Tv r2 = r0.A0U     // Catch:{ all -> 0x1050 }
            r1 = 4
            X.58x r2 = r2.A02     // Catch:{ all -> 0x1050 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x1050 }
            r2.A0B = r1     // Catch:{ all -> 0x1050 }
            r3 = 0
        L_0x062e:
            r8 = 1
            r0.A0Z = r8     // Catch:{ all -> 0x1050 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1050 }
            java.io.File r1 = r74.getAbsoluteFile()     // Catch:{ all -> 0x1050 }
            r2.append(r1)     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = ".png"
            java.lang.String r1 = X.AnonymousClass000.A0q(r1, r2)     // Catch:{ all -> 0x1050 }
            java.io.File r6 = X.C90524aI.A0S(r1)     // Catch:{ all -> 0x1050 }
            if (r3 == 0) goto L_0x0652
            r1 = 6407(0x1907, float:8.978E-42)
            boolean r1 = r4.A0E(r1)     // Catch:{ all -> 0x1050 }
            r17 = 1
            if (r1 != 0) goto L_0x0654
        L_0x0652:
            r17 = 0
        L_0x0654:
            int r7 = r0.A0J     // Catch:{ all -> 0x1050 }
            if (r7 <= 0) goto L_0x065c
            int r1 = r0.A0I     // Catch:{ all -> 0x1050 }
            if (r1 > 0) goto L_0x067c
        L_0x065c:
            android.graphics.RectF r1 = r0.A0M     // Catch:{ all -> 0x1050 }
            if (r1 != 0) goto L_0x067c
            java.io.File r5 = r0.A09     // Catch:{ all -> 0x1050 }
            X.6Kh r3 = new X.6Kh     // Catch:{ all -> 0x1050 }
            r3.<init>(r0, r6, r8, r8)     // Catch:{ all -> 0x1050 }
            int r4 = r0.A0I     // Catch:{ all -> 0x1050 }
            r2 = 0
        L_0x066a:
            X.6VQ r1 = r0.A07     // Catch:{ all -> 0x1050 }
            r8 = r0
            r9 = r2
            r10 = r3
            r11 = r1
            r12 = r5
            r13 = r74
            r14 = r6
            r15 = r7
            r16 = r4
            r8.A08(r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1050 }
            goto L_0x0f2c
        L_0x067c:
            X.1Cb r2 = r0.A0P     // Catch:{ all -> 0x1050 }
            java.io.File r1 = r0.A09     // Catch:{ all -> 0x1050 }
            java.io.File r5 = r2.A01(r1)     // Catch:{ all -> 0x1050 }
            java.io.File r3 = r0.A09     // Catch:{ all -> 0x1050 }
            r2 = 2
            X.6Kh r1 = new X.6Kh     // Catch:{ all -> 0x1050 }
            r1.<init>(r0, r6, r8, r2)     // Catch:{ all -> 0x1050 }
            int r4 = r0.A0I     // Catch:{ all -> 0x1050 }
            r9 = 0
            r8 = r0
            r10 = r1
            r11 = r9
            r12 = r3
            r13 = r5
            r14 = r6
            r15 = r7
            r16 = r4
            r8.A08(r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1050 }
            X.6Kh r3 = new X.6Kh     // Catch:{ all -> 0x1050 }
            r3.<init>(r0, r6, r2, r2)     // Catch:{ all -> 0x1050 }
            android.graphics.RectF r2 = r0.A0M     // Catch:{ all -> 0x1050 }
            goto L_0x066a
        L_0x06a3:
            X.6Tv r1 = r0.A0U     // Catch:{ all -> 0x1050 }
            r72 = r1
            r2 = 5
            X.58x r1 = r1.A02     // Catch:{ all -> 0x1050 }
            r73 = r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x1050 }
            r1.A0B = r2     // Catch:{ all -> 0x1050 }
            java.lang.String r43 = "videotranscoder/transcode/extractor released"
            java.lang.String r42 = "videotranscoder/transcode/encoder released"
            java.lang.String r40 = "videotranscoder/transcode/encoder stopped"
            java.lang.String r39 = "videotranscoder/transcode/decoder released"
            java.lang.String r38 = "videotranscoder/transcode/decoder stopped"
            java.lang.String r10 = "durationUs"
            java.lang.String r9 = "videotranscoder/transcode/can't create decoder for "
            java.lang.String r44 = " duration:"
            java.io.File r2 = r0.A09     // Catch:{ all -> 0x1050 }
            X.67y r1 = new X.67y     // Catch:{ all -> 0x1050 }
            r1.<init>(r2)     // Catch:{ all -> 0x1050 }
            int r6 = r1.A02     // Catch:{ all -> 0x1050 }
            int r5 = r1.A00     // Catch:{ all -> 0x1050 }
            int r11 = r1.A01()     // Catch:{ all -> 0x1050 }
            int r1 = r1.A01     // Catch:{ all -> 0x1050 }
            r71 = r1
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = "videotranscoder/transcode/source:"
            r3.append(r1)     // Catch:{ all -> 0x1050 }
            java.io.File r1 = r0.A09     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x1050 }
            r3.append(r1)     // Catch:{ all -> 0x1050 }
            java.lang.String r41 = " size:"
            r1 = r41
            r3.append(r1)     // Catch:{ all -> 0x1050 }
            java.io.File r1 = r0.A09     // Catch:{ all -> 0x1050 }
            long r1 = r1.length()     // Catch:{ all -> 0x1050 }
            r3.append(r1)     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = " bitrate:"
            r3.append(r1)     // Catch:{ all -> 0x1050 }
            r3.append(r11)     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = " frame:"
            r3.append(r1)     // Catch:{ all -> 0x1050 }
            X.C90494aF.A1L(r3, r6)     // Catch:{ all -> 0x1050 }
            r3.append(r5)     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = " rotation:"
            r3.append(r1)     // Catch:{ all -> 0x1050 }
            r1 = r71
            r3.append(r1)     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = " from:"
            r3.append(r1)     // Catch:{ all -> 0x1050 }
            long r1 = r0.A0K     // Catch:{ all -> 0x1050 }
            r26 = r1
            r3.append(r1)     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = " to:"
            r3.append(r1)     // Catch:{ all -> 0x1050 }
            long r1 = r0.A0L     // Catch:{ all -> 0x1050 }
            r24 = r1
            X.C36351kA.A1S(r3, r1)     // Catch:{ all -> 0x1050 }
            int r1 = r0.A0H     // Catch:{ all -> 0x1050 }
            android.util.Pair r1 = X.AnonymousClass1GJ.A05(r6, r5, r1)     // Catch:{ all -> 0x1050 }
            java.lang.Object r2 = r1.first     // Catch:{ all -> 0x1050 }
            int r49 = X.C90514aH.A0H(r2)     // Catch:{ all -> 0x1050 }
            java.lang.Object r1 = r1.second     // Catch:{ all -> 0x1050 }
            int r50 = X.C90514aH.A0H(r1)     // Catch:{ all -> 0x1050 }
            int r3 = r0.A0G     // Catch:{ all -> 0x1050 }
            int r1 = r49 * r50
            float r2 = (float) r1     // Catch:{ all -> 0x1050 }
            float r1 = r0.A00     // Catch:{ all -> 0x1050 }
            float r2 = r2 * r1
            int r1 = (int) r2     // Catch:{ all -> 0x1050 }
            int r1 = java.lang.Math.min(r3, r1)     // Catch:{ all -> 0x1050 }
            r0.A01 = r1     // Catch:{ all -> 0x1050 }
            r1 = 422(0x1a6, float:5.91E-43)
            boolean r2 = r4.A0E(r1)     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = "video/avc"
            android.media.MediaCodecInfo r32 = X.AnonymousClass1GJ.A04(r2)     // Catch:{ all -> 0x1050 }
            if (r32 == 0) goto L_0x103e
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1050 }
            java.lang.String r2 = "videotranscoder/transcode/found "
            r3.append(r2)     // Catch:{ all -> 0x1050 }
            java.lang.String r2 = r32.getName()     // Catch:{ all -> 0x1050 }
            r3.append(r2)     // Catch:{ all -> 0x1050 }
            java.lang.String r2 = " supporting "
            X.C36321k7.A1Q(r2, r1, r3)     // Catch:{ all -> 0x1050 }
            int r48 = X.AnonymousClass1GJ.A02(r32)     // Catch:{ all -> 0x1050 }
            if (r48 == 0) goto L_0x1032
            java.lang.String r47 = r32.getName()     // Catch:{ all -> 0x1050 }
            java.lang.String r3 = r32.getName()     // Catch:{ all -> 0x1050 }
            java.lang.String r2 = "OMX.qcom.video.encoder.avc"
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x1050 }
            int r51 = X.C90494aF.A07(r2)
            X.6SH r2 = r0.A04     // Catch:{ all -> 0x1050 }
            r30 = 0
            r19 = 0
            r52 = 0
            r53 = 0
            r46 = r2
            X.6Lq r3 = A04(r46, r47, r48, r49, r50, r51, r52, r53)     // Catch:{ all -> 0x1050 }
            int r2 = r3.A00     // Catch:{ all -> 0x1050 }
            r70 = r2
            int r2 = r3.A09     // Catch:{ all -> 0x1050 }
            r67 = r2
            int r2 = r3.A06     // Catch:{ all -> 0x1050 }
            r68 = r2
            int r2 = r3.A08     // Catch:{ all -> 0x1050 }
            r18 = r2
            int r5 = r2 / 2
            int r2 = r3.A07     // Catch:{ all -> 0x1050 }
            int r18 = r18 * r2
            int r5 = r5 * r2
            int r18 = r18 + r5
            java.lang.String r2 = r32.getName()     // Catch:{ all -> 0x1050 }
            android.media.MediaCodec r13 = android.media.MediaCodec.createByCodecName(r2)     // Catch:{ all -> 0x1050 }
            java.lang.String r2 = "videotranscoder/transcode/encoder created"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x1050 }
            r5 = r67
            r2 = r68
            android.media.MediaFormat r5 = android.media.MediaFormat.createVideoFormat(r1, r5, r2)     // Catch:{ all -> 0x1050 }
            int r2 = r0.A01     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = "bitrate"
            r5.setInteger(r1, r2)     // Catch:{ all -> 0x1050 }
            r2 = 30
            java.lang.String r1 = "frame-rate"
            r5.setInteger(r1, r2)     // Catch:{ all -> 0x1050 }
            java.lang.String r2 = "color-format"
            r1 = r70
            r5.setInteger(r2, r1)     // Catch:{ all -> 0x1050 }
            r2 = 10
            java.lang.String r1 = "i-frame-interval"
            r5.setInteger(r1, r2)     // Catch:{ all -> 0x1050 }
            int r2 = r3.A08     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = "stride"
            r5.setInteger(r1, r2)     // Catch:{ all -> 0x1050 }
            int r2 = r3.A07     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = "slice-height"
            r5.setInteger(r1, r2)     // Catch:{ all -> 0x1050 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = "videotranscoder/transcode/configure encoder with output format "
            X.C36321k7.A1K(r5, r1, r2)     // Catch:{ all -> 0x1050 }
            r2 = 0
            r1 = 1
            r13.configure(r5, r2, r2, r1)     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = "videotranscoder/transcode/encoder configured"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x1050 }
            r13.start()     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = "videotranscoder/transcode/encoder started"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x1050 }
            java.nio.ByteBuffer[] r31 = r13.getInputBuffers()     // Catch:{ all -> 0x1050 }
            java.nio.ByteBuffer[] r28 = r13.getOutputBuffers()     // Catch:{ all -> 0x1050 }
            java.io.File r1 = r0.A0A     // Catch:{ all -> 0x1050 }
            java.io.FileOutputStream r37 = X.C90524aI.A0W(r1)     // Catch:{ all -> 0x1050 }
            java.nio.channels.FileChannel r29 = r37.getChannel()     // Catch:{ all -> 0x1028 }
            X.611 r5 = new X.611     // Catch:{ all -> 0x101c }
            r5.<init>()     // Catch:{ all -> 0x101c }
            java.io.File r1 = r0.A09     // Catch:{ all -> 0x101c }
            java.lang.String r2 = r1.getAbsolutePath()     // Catch:{ all -> 0x101c }
            r1 = r30
            X.AnonymousClass00C.A0D(r2, r1)     // Catch:{ all -> 0x101c }
            android.media.MediaExtractor r1 = r5.A00     // Catch:{ all -> 0x101c }
            r69 = r1
            r1.setDataSource(r2)     // Catch:{ all -> 0x101c }
            int r14 = r69.getTrackCount()     // Catch:{ all -> 0x101c }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x101c }
            java.lang.String r1 = "videotranscoder/transcode/number of tracks:"
            X.C36321k7.A1T(r1, r2, r14)     // Catch:{ all -> 0x101c }
            r12 = 0
        L_0x0842:
            if (r12 >= r14) goto L_0x0ffb
            r1 = r69
            android.media.MediaFormat r11 = r1.getTrackFormat(r12)     // Catch:{ all -> 0x101c }
            X.AnonymousClass00C.A08(r11)     // Catch:{ all -> 0x101c }
            java.lang.String r6 = "mime"
            java.lang.String r5 = r11.getString(r6)     // Catch:{ all -> 0x101c }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x101c }
            java.lang.String r1 = "videotranscoder/transcode/track:"
            r2.append(r1)     // Catch:{ all -> 0x101c }
            r2.append(r12)     // Catch:{ all -> 0x101c }
            java.lang.String r1 = " mime:"
            r2.append(r1)     // Catch:{ all -> 0x101c }
            r2.append(r5)     // Catch:{ all -> 0x101c }
            java.lang.String r1 = " format:"
            X.C36321k7.A1K(r11, r1, r2)     // Catch:{ all -> 0x101c }
            java.lang.String r1 = "video"
            boolean r1 = r5.startsWith(r1)     // Catch:{ all -> 0x101c }
            if (r1 == 0) goto L_0x0875
            goto L_0x0878
        L_0x0875:
            int r12 = r12 + 1
            goto L_0x0842
        L_0x0878:
            if (r12 < 0) goto L_0x0ffb
            r1 = r69
            android.media.MediaFormat r5 = r1.getTrackFormat(r12)     // Catch:{ all -> 0x101c }
            X.AnonymousClass00C.A08(r5)     // Catch:{ all -> 0x101c }
            java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x101c }
            if (r6 == 0) goto L_0x0fec
            java.lang.String r1 = "video/unknown"
            boolean r1 = r1.equals(r6)     // Catch:{ all -> 0x101c }
            if (r1 != 0) goto L_0x0fec
            r1 = r69
            r1.selectTrack(r12)     // Catch:{ all -> 0x101c }
            boolean r1 = r5.containsKey(r10)     // Catch:{ all -> 0x101c }
            if (r1 == 0) goto L_0x08b4
            long r22 = r5.getLong(r10)     // Catch:{ all -> 0x101c }
        L_0x08a0:
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x101c }
            java.lang.String r1 = "videotranscoder/transcode/decoder format:"
            r11.append(r1)     // Catch:{ all -> 0x101c }
            r11.append(r5)     // Catch:{ all -> 0x101c }
            r10 = r44
            r1 = r22
            X.C36321k7.A1V(r10, r11, r1)     // Catch:{ all -> 0x101c }
            goto L_0x08b7
        L_0x08b4:
            r22 = -1
            goto L_0x08a0
        L_0x08b7:
            android.media.MediaCodec r12 = android.media.MediaCodec.createDecoderByType(r6)     // Catch:{ IllegalArgumentException -> 0x0fe3 }
            r1 = 1250(0x4e2, float:1.752E-42)
            boolean r4 = r4.A0E(r1)     // Catch:{ IllegalArgumentException -> 0x0fe3 }
            java.lang.String r2 = "samsung"
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ IllegalArgumentException -> 0x0fe3 }
            boolean r1 = r2.equalsIgnoreCase(r1)     // Catch:{ IllegalArgumentException -> 0x0fe3 }
            if (r1 == 0) goto L_0x0915
            if (r4 == 0) goto L_0x0915
            java.lang.String r15 = r12.getName()     // Catch:{ IllegalArgumentException -> 0x0fe3 }
            java.lang.String r1 = X.C90514aH.A0y(r15)     // Catch:{ IllegalArgumentException -> 0x0fe3 }
            java.lang.String r4 = "omx.exynos"
            boolean r1 = r1.startsWith(r4)     // Catch:{ IllegalArgumentException -> 0x0fe3 }
            if (r1 != 0) goto L_0x0911
            java.util.ArrayList r1 = X.AnonymousClass1GJ.A09(r6)     // Catch:{ IllegalArgumentException -> 0x0fe3 }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ IllegalArgumentException -> 0x0fe3 }
            r12 = 0
            r11 = r12
        L_0x08e7:
            boolean r1 = r14.hasNext()     // Catch:{ IllegalArgumentException -> 0x0fe3 }
            if (r1 == 0) goto L_0x090a
            java.lang.String r10 = X.AnonymousClass001.A0C(r14)     // Catch:{ IllegalArgumentException -> 0x0fe3 }
            java.lang.String r2 = X.C90514aH.A0y(r10)     // Catch:{ IllegalArgumentException -> 0x0fe3 }
            boolean r1 = r2.startsWith(r4)     // Catch:{ IllegalArgumentException -> 0x0fe3 }
            if (r1 == 0) goto L_0x08fe
            if (r12 != 0) goto L_0x08fe
            r12 = r10
        L_0x08fe:
            java.lang.String r1 = "c2.exynos"
            boolean r1 = r2.startsWith(r1)     // Catch:{ IllegalArgumentException -> 0x0fe3 }
            if (r1 != 0) goto L_0x08e7
            if (r11 != 0) goto L_0x08e7
            r11 = r10
            goto L_0x08e7
        L_0x090a:
            if (r12 == 0) goto L_0x090e
            r15 = r12
            goto L_0x0911
        L_0x090e:
            if (r11 == 0) goto L_0x0911
            r15 = r11
        L_0x0911:
            android.media.MediaCodec r12 = android.media.MediaCodec.createByCodecName(r15)     // Catch:{ IllegalArgumentException -> 0x0fe3 }
        L_0x0915:
            if (r12 == 0) goto L_0x0fd6
            java.lang.String r1 = "videotranscoder/transcode/decoder created"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x101c }
            r2 = 0
            r1 = r30
            r12.configure(r5, r2, r2, r1)     // Catch:{ IllegalStateException -> 0x0928 }
            java.lang.String r1 = "videotranscoder/transcode/decoder configured"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ IllegalStateException -> 0x0928 }
            goto L_0x0987
        L_0x0928:
            r2 = move-exception
            java.lang.String r1 = "videotranscoder/transcode/decoder failed to configure, will try different one "
            com.whatsapp.util.Log.i(r1, r2)     // Catch:{ all -> 0x101c }
            r12.release()     // Catch:{ all -> 0x101c }
            java.util.ArrayList r1 = X.AnonymousClass1GJ.A09(r6)     // Catch:{ all -> 0x101c }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ all -> 0x101c }
        L_0x0939:
            boolean r1 = r14.hasNext()     // Catch:{ all -> 0x101c }
            r10 = 0
            if (r1 == 0) goto L_0x1006
            java.lang.String r4 = X.AnonymousClass001.A0C(r14)     // Catch:{ all -> 0x101c }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x101c }
            java.lang.String r1 = "videotranscoder/transcode/decoder/try "
            X.C36321k7.A1Q(r1, r4, r2)     // Catch:{ all -> 0x101c }
            java.lang.String r1 = "OMX.ittiam.video.decoder.avc"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x101c }
            if (r1 == 0) goto L_0x095f
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x101c }
            java.lang.String r1 = "videotranscoder/transcode/decoder/skip "
            X.C36321k7.A1Q(r1, r4, r2)     // Catch:{ all -> 0x101c }
            goto L_0x0939
        L_0x095f:
            android.media.MediaCodec r12 = android.media.MediaCodec.createByCodecName(r4)     // Catch:{ all -> 0x101c }
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x101c }
            java.lang.String r2 = "videotranscoder/transcode/decoder "
            r11.append(r2)     // Catch:{ all -> 0x101c }
            r11.append(r4)     // Catch:{ all -> 0x101c }
            java.lang.String r1 = " created"
            X.C36321k7.A1a(r11, r1)     // Catch:{ all -> 0x101c }
            r1 = r30
            r12.configure(r5, r10, r10, r1)     // Catch:{ Exception -> 0x0983 }
            java.lang.StringBuilder r2 = X.C36331k8.A0k(r2, r4)     // Catch:{ Exception -> 0x0983 }
            java.lang.String r1 = " is ok"
            X.C36321k7.A1a(r2, r1)     // Catch:{ Exception -> 0x0983 }
            goto L_0x0987
        L_0x0983:
            r12.release()     // Catch:{ all -> 0x101c }
            goto L_0x0939
        L_0x0987:
            r12.start()     // Catch:{ all -> 0x101c }
            java.lang.String r1 = "videotranscoder/transcode/decoder started"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x101c }
            java.nio.ByteBuffer[] r48 = r12.getInputBuffers()     // Catch:{ all -> 0x101c }
            java.nio.ByteBuffer[] r47 = r12.getOutputBuffers()     // Catch:{ all -> 0x101c }
            android.media.MediaCodec$BufferInfo r9 = new android.media.MediaCodec$BufferInfo     // Catch:{ all -> 0x101c }
            r9.<init>()     // Catch:{ all -> 0x101c }
            android.media.MediaCodec$BufferInfo r46 = new android.media.MediaCodec$BufferInfo     // Catch:{ all -> 0x101c }
            r46.<init>()     // Catch:{ all -> 0x101c }
            int r1 = (r26 > r7 ? 1 : (r26 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x09c6
            long r1 = r26 * r16
            r5 = r69
            r4 = r30
            r5.seekTo(r1, r4)     // Catch:{ all -> 0x101c }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x101c }
            java.lang.String r5 = "videotranscoder/transcode/seek to:"
            r4.append(r5)     // Catch:{ all -> 0x101c }
            r4.append(r1)     // Catch:{ all -> 0x101c }
            java.lang.String r1 = " actual:"
            r4.append(r1)     // Catch:{ all -> 0x101c }
            long r1 = r69.getSampleTime()     // Catch:{ all -> 0x101c }
            X.C36351kA.A1S(r4, r1)     // Catch:{ all -> 0x101c }
        L_0x09c6:
            long r35 = com.whatsapp.VideoFrameConverter.create()     // Catch:{ all -> 0x101c }
            X.6VQ r1 = r0.A07     // Catch:{ all -> 0x101c }
            if (r1 == 0) goto L_0x0a21
            java.util.List r2 = r1.A04     // Catch:{ all -> 0x101c }
            boolean r1 = r2 instanceof java.util.Collection     // Catch:{ all -> 0x101c }
            if (r1 == 0) goto L_0x0a0c
            boolean r1 = r2.isEmpty()     // Catch:{ all -> 0x101c }
            if (r1 == 0) goto L_0x0a0c
        L_0x09da:
            r2 = r67
            r1 = r68
            android.graphics.Bitmap r55 = X.C90524aI.A09(r2, r1)     // Catch:{ all -> 0x101c }
            X.6VQ r2 = r0.A07     // Catch:{ all -> 0x101c }
            r1 = r71
            int r1 = 360 - r1
            int r4 = r1 % 360
            r1 = r55
            r2.A04(r4, r1)     // Catch:{ all -> 0x101c }
            int r2 = r55.getWidth()     // Catch:{ all -> 0x101c }
            int r1 = r55.getHeight()     // Catch:{ all -> 0x101c }
            int r2 = r2 * r1
            int r1 = r2 * 4
            java.nio.ByteBuffer r56 = java.nio.ByteBuffer.allocateDirect(r1)     // Catch:{ all -> 0x101c }
            r5 = r56
            r4 = r55
            r1 = r35
            A07(r4, r5, r1)     // Catch:{ all -> 0x101c }
        L_0x0a07:
            int r1 = r3.A05     // Catch:{ all -> 0x101c }
            r66 = r1
            goto L_0x0a26
        L_0x0a0c:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x101c }
        L_0x0a10:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x101c }
            if (r1 == 0) goto L_0x09da
            X.6Ft r1 = X.C90524aI.A0N(r2)     // Catch:{ all -> 0x101c }
            boolean r1 = r1 instanceof X.AnonymousClass5CZ     // Catch:{ all -> 0x101c }
            if (r1 == 0) goto L_0x0a10
            r19 = 1
            goto L_0x09da
        L_0x0a21:
            r55 = 0
            r56 = 0
            goto L_0x0a07
        L_0x0a26:
            r0.A03 = r7     // Catch:{ Exception -> 0x0fad }
            r0.A02 = r7     // Catch:{ Exception -> 0x0fad }
            r54 = 0
            r4 = 0
        L_0x0a2d:
            java.lang.String r51 = " frames:"
            if (r52 != 0) goto L_0x0d9b
            boolean r1 = r0.A0Y     // Catch:{ Exception -> 0x0fad }
            if (r1 != 0) goto L_0x0d9b
            int r4 = r4 + 1
            r3 = 0
            if (r4 >= r3) goto L_0x0a43
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0fad }
            java.lang.String r1 = "videotranscoder/transcode/loop "
            X.C36321k7.A1T(r1, r2, r4)     // Catch:{ Exception -> 0x0fad }
        L_0x0a43:
            if (r53 != 0) goto L_0x0acc
            r1 = 1000(0x3e8, double:4.94E-321)
            int r5 = r12.dequeueInputBuffer(r1)     // Catch:{ Exception -> 0x0fad }
            if (r4 >= r3) goto L_0x0a56
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0fad }
            java.lang.String r1 = "videotranscoder/decoder/dequeue/input "
            X.C36321k7.A1T(r1, r2, r5)     // Catch:{ Exception -> 0x0fad }
        L_0x0a56:
            if (r5 >= 0) goto L_0x0a59
            goto L_0x0ac3
        L_0x0a59:
            r2 = r48[r5]     // Catch:{ Exception -> 0x0fad }
            X.AnonymousClass00C.A0D(r2, r3)     // Catch:{ Exception -> 0x0fad }
            r1 = r69
            int r6 = r1.readSampleData(r2, r3)     // Catch:{ Exception -> 0x0fad }
            if (r6 >= 0) goto L_0x0a7d
            java.lang.String r1 = "videotranscoder/transcode/extractor BUFFER_FLAG_END_OF_STREAM"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x0fad }
            r63 = 4
            r59 = 0
            r60 = 0
            r61 = 0
            r57 = r12
            r58 = r5
            r57.queueInputBuffer(r58, r59, r60, r61, r63)     // Catch:{ Exception -> 0x0fad }
            r53 = 1
            goto L_0x0acc
        L_0x0a7d:
            if (r4 >= r3) goto L_0x0a97
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0fad }
            java.lang.String r1 = "videotranscoder/transcode/extractor/sample size:"
            r10.append(r1)     // Catch:{ Exception -> 0x0fad }
            r10.append(r6)     // Catch:{ Exception -> 0x0fad }
            java.lang.String r1 = " time:"
            r10.append(r1)     // Catch:{ Exception -> 0x0fad }
            long r1 = r69.getSampleTime()     // Catch:{ Exception -> 0x0fad }
            X.C36351kA.A1S(r10, r1)     // Catch:{ Exception -> 0x0fad }
        L_0x0a97:
            long r61 = r69.getSampleTime()     // Catch:{ Exception -> 0x0fad }
            r59 = 0
            r63 = 0
            r57 = r12
            r58 = r5
            r60 = r6
            r57.queueInputBuffer(r58, r59, r60, r61, r63)     // Catch:{ Exception -> 0x0fad }
            if (r4 >= r3) goto L_0x0ab3
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0fad }
            java.lang.String r1 = "videotranscoder/decoder/queue/input "
            X.C36321k7.A1T(r1, r2, r5)     // Catch:{ Exception -> 0x0fad }
        L_0x0ab3:
            boolean r5 = r69.advance()     // Catch:{ Exception -> 0x0fad }
            if (r4 >= r3) goto L_0x0acc
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0fad }
            java.lang.String r1 = "videotranscoder/transcode/extractor/advance "
            X.C36321k7.A1X(r1, r2, r5)     // Catch:{ Exception -> 0x0fad }
            goto L_0x0acc
        L_0x0ac3:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0fad }
            java.lang.String r1 = "videotranscoder/transcode/decoder/dequeue/input < 0"
            X.C36321k7.A1T(r1, r2, r5)     // Catch:{ Exception -> 0x0fad }
        L_0x0acc:
            r1 = 1000000(0xf4240, double:4.940656E-318)
            int r11 = r12.dequeueOutputBuffer(r9, r1)     // Catch:{ Exception -> 0x0fad }
            if (r4 >= r3) goto L_0x0ade
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0fad }
            java.lang.String r1 = "videotranscoder/transcode/decoder/dequeue/output "
            X.C36321k7.A1T(r1, r2, r11)     // Catch:{ Exception -> 0x0fad }
        L_0x0ade:
            java.lang.String r10 = " "
            if (r11 < 0) goto L_0x0ca5
            long r1 = r9.presentationTimeUs     // Catch:{ Exception -> 0x0fad }
            long r49 = r26 * r16
            int r5 = (r1 > r49 ? 1 : (r1 == r49 ? 0 : -1))
            if (r5 < 0) goto L_0x0c8f
            r1 = 1000000(0xf4240, double:4.940656E-318)
            int r5 = r13.dequeueInputBuffer(r1)     // Catch:{ Exception -> 0x0fad }
            if (r4 >= r3) goto L_0x0afc
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0fad }
            java.lang.String r1 = "videotranscoder/transcode/encoder/dequeue/input "
            X.C36321k7.A1T(r1, r2, r5)     // Catch:{ Exception -> 0x0fad }
        L_0x0afc:
            if (r5 < 0) goto L_0x0c1f
            r14 = r31[r5]     // Catch:{ Exception -> 0x0fad }
            r14.clear()     // Catch:{ Exception -> 0x0fad }
            X.6VQ r1 = r0.A07     // Catch:{ Exception -> 0x0fad }
            if (r1 == 0) goto L_0x0b38
            if (r19 == 0) goto L_0x0b38
            r19 = 1
            java.util.List r1 = r1.A04     // Catch:{ Exception -> 0x0fad }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ Exception -> 0x0fad }
        L_0x0b11:
            boolean r1 = r2.hasNext()     // Catch:{ Exception -> 0x0fad }
            if (r1 == 0) goto L_0x0b1b
            r2.next()     // Catch:{ Exception -> 0x0fad }
            goto L_0x0b11
        L_0x0b1b:
            r1 = r55
            r1.eraseColor(r3)     // Catch:{ Exception -> 0x0fad }
            X.6VQ r6 = r0.A07     // Catch:{ Exception -> 0x0fad }
            r1 = r71
            int r1 = 360 - r1
            int r2 = r1 % 360
            r1 = r55
            r6.A04(r2, r1)     // Catch:{ Exception -> 0x0fad }
            r56.rewind()     // Catch:{ Exception -> 0x0fad }
            r15 = r56
            r6 = r1
            r1 = r35
            A07(r6, r15, r1)     // Catch:{ Exception -> 0x0fad }
        L_0x0b38:
            r6 = r47[r11]     // Catch:{ Exception -> 0x0fad }
            X.C90464aC.A0s(r9, r6)     // Catch:{ Exception -> 0x0fad }
            long r1 = r0.A02     // Catch:{ Exception -> 0x0fad }
            int r15 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r15 == 0) goto L_0x0b45
            if (r4 >= r3) goto L_0x0b78
        L_0x0b45:
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0fad }
            java.lang.String r1 = "videotranscoder/transcode/convert decoderBufferInfo.offset:"
            r15.append(r1)     // Catch:{ Exception -> 0x0fad }
            int r1 = r9.offset     // Catch:{ Exception -> 0x0fad }
            r15.append(r1)     // Catch:{ Exception -> 0x0fad }
            java.lang.String r1 = " decoderBufferInfo.size:"
            r15.append(r1)     // Catch:{ Exception -> 0x0fad }
            int r1 = r9.size     // Catch:{ Exception -> 0x0fad }
            r15.append(r1)     // Catch:{ Exception -> 0x0fad }
            java.lang.String r1 = " decoderBufferInfo.presentationTimeUs:"
            r15.append(r1)     // Catch:{ Exception -> 0x0fad }
            long r1 = r9.presentationTimeUs     // Catch:{ Exception -> 0x0fad }
            r15.append(r1)     // Catch:{ Exception -> 0x0fad }
            java.lang.String r1 = " decoderBufferInfo.flags:"
            r15.append(r1)     // Catch:{ Exception -> 0x0fad }
            int r1 = r9.flags     // Catch:{ Exception -> 0x0fad }
            r15.append(r1)     // Catch:{ Exception -> 0x0fad }
            java.lang.String r2 = " encoderFrameSize:"
            r1 = r18
            X.C36321k7.A1T(r2, r15, r1)     // Catch:{ Exception -> 0x0fad }
        L_0x0b78:
            byte[] r1 = r0.A0D     // Catch:{ Exception -> 0x0fad }
            if (r1 != 0) goto L_0x0b87
            int r1 = r6.remaining()     // Catch:{ Exception -> 0x0fad }
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x0fad }
            r6.get(r1)     // Catch:{ Exception -> 0x0fad }
            r0.A0D = r1     // Catch:{ Exception -> 0x0fad }
        L_0x0b87:
            r1 = r35
            com.whatsapp.VideoFrameConverter.convertFrame(r1, r6, r14)     // Catch:{ Exception -> 0x0fad }
            long r1 = r0.A02     // Catch:{ Exception -> 0x0fad }
            int r6 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0b94
            if (r4 >= r3) goto L_0x0b99
        L_0x0b94:
            java.lang.String r1 = "videotranscoder/transcode/converted"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x0fad }
        L_0x0b99:
            long r1 = r9.presentationTimeUs     // Catch:{ Exception -> 0x0fad }
            int r6 = r9.flags     // Catch:{ Exception -> 0x0fad }
            r59 = 0
            r57 = r13
            r58 = r5
            r60 = r18
            r61 = r1
            r63 = r6
            r57.queueInputBuffer(r58, r59, r60, r61, r63)     // Catch:{ Exception -> 0x0fad }
            long r1 = r0.A02     // Catch:{ Exception -> 0x0fad }
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0bb4
            if (r4 >= r3) goto L_0x0bb9
        L_0x0bb4:
            java.lang.String r1 = "videotranscoder/transcode/encoder/queue/input"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x0fad }
        L_0x0bb9:
            long r1 = r0.A02     // Catch:{ Exception -> 0x0fad }
            r5 = 1
            long r1 = r1 + r5
            r0.A02 = r1     // Catch:{ Exception -> 0x0fad }
            long r5 = r9.presentationTimeUs     // Catch:{ Exception -> 0x0fad }
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0bca
            long r1 = r5 - r49
            r0.A03 = r1     // Catch:{ Exception -> 0x0fad }
        L_0x0bca:
            int r1 = (r24 > r7 ? 1 : (r24 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0be5
            long r1 = r24 * r16
            int r14 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r14 <= 0) goto L_0x0be5
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0fad }
            java.lang.String r14 = "videotranscoder/transcode/end time detected "
            r15.append(r14)     // Catch:{ Exception -> 0x0fad }
            r15.append(r5)     // Catch:{ Exception -> 0x0fad }
            X.C36321k7.A1V(r10, r15, r1)     // Catch:{ Exception -> 0x0fad }
            r52 = 1
        L_0x0be5:
            int r1 = (r22 > r7 ? 1 : (r22 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0c1f
            int r1 = (r26 > r7 ? 1 : (r26 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0bef
            r49 = 0
        L_0x0bef:
            int r1 = (r24 > r7 ? 1 : (r24 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0bf6
            r14 = r22
            goto L_0x0bf8
        L_0x0bf6:
            long r14 = r24 * r16
        L_0x0bf8:
            r5 = 100
            long r1 = r9.presentationTimeUs     // Catch:{ Exception -> 0x0fad }
            long r1 = r1 - r49
            long r1 = r1 * r5
            long r14 = r14 - r49
            long r1 = r1 / r14
            int r5 = (int) r1     // Catch:{ Exception -> 0x0fad }
            r1 = r54
            if (r5 == r1) goto L_0x0c1f
            X.7gq r1 = r0.A05     // Catch:{ Exception -> 0x0fad }
            if (r1 == 0) goto L_0x0c1f
            boolean r1 = r0.A0Y     // Catch:{ Exception -> 0x0fad }
            if (r1 != 0) goto L_0x0c18
            X.7gq r1 = r0.A05     // Catch:{ Exception -> 0x0fad }
            boolean r2 = r1.Bdi(r5)     // Catch:{ Exception -> 0x0fad }
            r1 = 0
            if (r2 == 0) goto L_0x0c19
        L_0x0c18:
            r1 = 1
        L_0x0c19:
            r0.A0Y = r1     // Catch:{ Exception -> 0x0fad }
            r1 = 5
            if (r5 < r1) goto L_0x0c26
            goto L_0x0c22
        L_0x0c1f:
            r5 = r54
            goto L_0x0c40
        L_0x0c22:
            int r1 = r5 % 5
            if (r1 != 0) goto L_0x0c40
        L_0x0c26:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0fad }
            java.lang.String r2 = "videotranscoder/transcode/progress "
            r1 = r51
            X.C36351kA.A1M(r2, r1, r6, r5)     // Catch:{ Exception -> 0x0fad }
            long r1 = r0.A02     // Catch:{ Exception -> 0x0fad }
            r6.append(r1)     // Catch:{ Exception -> 0x0fad }
            r1 = r44
            r6.append(r1)     // Catch:{ Exception -> 0x0fad }
            long r1 = r0.A03     // Catch:{ Exception -> 0x0fad }
            X.C36351kA.A1S(r6, r1)     // Catch:{ Exception -> 0x0fad }
        L_0x0c40:
            r1 = 1000000(0xf4240, double:4.940656E-318)
            r6 = r46
            int r6 = r13.dequeueOutputBuffer(r6, r1)     // Catch:{ Exception -> 0x0fad }
            if (r4 >= r3) goto L_0x0c54
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0fad }
            java.lang.String r1 = "videotranscoder/transcode/encoder/dequeue/output "
            X.C36321k7.A1T(r1, r2, r6)     // Catch:{ Exception -> 0x0fad }
        L_0x0c54:
            if (r6 < 0) goto L_0x0c6d
            r2 = r28[r6]     // Catch:{ Exception -> 0x0fad }
            r1 = r46
            X.C90464aC.A0s(r1, r2)     // Catch:{ Exception -> 0x0fad }
            r1 = r29
            r1.write(r2)     // Catch:{ Exception -> 0x0fad }
            r2.clear()     // Catch:{ Exception -> 0x0fad }
            r13.releaseOutputBuffer(r6, r3)     // Catch:{ Exception -> 0x0fad }
            if (r4 >= r3) goto L_0x0c8c
            java.lang.String r1 = "videotranscoder/transcode/encoder/release/output"
            goto L_0x0c89
        L_0x0c6d:
            r1 = -3
            if (r6 != r1) goto L_0x0c71
            goto L_0x0c83
        L_0x0c71:
            r1 = -2
            if (r6 != r1) goto L_0x0c8c
            android.media.MediaFormat r6 = r13.getOutputFormat()     // Catch:{ Exception -> 0x0fad }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0fad }
            java.lang.String r1 = "videotranscoder/transcode/encoder output format has changed to "
            java.lang.String r1 = X.AnonymousClass000.A0l(r6, r1, r2)     // Catch:{ Exception -> 0x0fad }
            goto L_0x0c89
        L_0x0c83:
            java.nio.ByteBuffer[] r28 = r13.getOutputBuffers()     // Catch:{ Exception -> 0x0fad }
            java.lang.String r1 = "videotranscoder/transcode/encoder output buffers have changed"
        L_0x0c89:
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x0fad }
        L_0x0c8c:
            r54 = r5
            goto L_0x0c9e
        L_0x0c8f:
            int r30 = r30 + 1
            if (r4 >= r3) goto L_0x0c9e
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0fad }
            java.lang.String r2 = "videotranscoder/transcode/frame skipped "
            r1 = r30
            X.C36321k7.A1T(r2, r5, r1)     // Catch:{ Exception -> 0x0fad }
        L_0x0c9e:
            r12.releaseOutputBuffer(r11, r3)     // Catch:{ Exception -> 0x0fad }
            if (r4 >= r3) goto L_0x0d8c
            goto L_0x0d87
        L_0x0ca5:
            r1 = -3
            if (r11 != r1) goto L_0x0cb0
            java.nio.ByteBuffer[] r47 = r12.getOutputBuffers()     // Catch:{ Exception -> 0x0fad }
            java.lang.String r1 = "videotranscoder/transcode/decoder output buffers have changed"
            goto L_0x0d89
        L_0x0cb0:
            r1 = -2
            if (r11 != r1) goto L_0x0d74
            android.media.MediaFormat r3 = r12.getOutputFormat()     // Catch:{ Exception -> 0x0fad }
            java.lang.String r2 = r32.getName()     // Catch:{ Exception -> 0x0fad }
            X.6SH r1 = r0.A04     // Catch:{ Exception -> 0x0fad }
            X.6Lq r14 = A03(r3, r1, r2)     // Catch:{ Exception -> 0x0fad }
            r0.A06 = r14     // Catch:{ Exception -> 0x0fad }
            int r11 = r14.A00     // Catch:{ Exception -> 0x0fad }
            int r6 = r14.A09     // Catch:{ Exception -> 0x0fad }
            int r5 = r14.A06     // Catch:{ Exception -> 0x0fad }
            int r1 = r14.A02     // Catch:{ Exception -> 0x0fad }
            r50 = r1
            int r1 = r14.A03     // Catch:{ Exception -> 0x0fad }
            r49 = r1
            int r3 = r14.A04     // Catch:{ Exception -> 0x0fad }
            int r2 = r14.A01     // Catch:{ Exception -> 0x0fad }
            java.lang.String r15 = r32.getName()     // Catch:{ Exception -> 0x0fad }
            java.lang.String r1 = "OMX.SEC.avc.enc"
            boolean r1 = r1.equals(r15)     // Catch:{ Exception -> 0x0fad }
            if (r1 != 0) goto L_0x0d15
            java.lang.String r1 = "OMX.SEC.avc.dec"
            boolean r1 = r1.equals(r15)     // Catch:{ Exception -> 0x0fad }
            if (r1 != 0) goto L_0x0d15
            java.lang.String r1 = "OMX.Exynos.AVC.Encoder"
            boolean r1 = r1.equals(r15)     // Catch:{ Exception -> 0x0fad }
            if (r1 != 0) goto L_0x0d15
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder"
            boolean r1 = r1.equals(r15)     // Catch:{ Exception -> 0x0fad }
            if (r1 != 0) goto L_0x0d15
            java.lang.String r1 = "OMX.Intel.VideoEncoder.AVC"
            boolean r1 = r1.equals(r15)     // Catch:{ Exception -> 0x0fad }
            if (r1 != 0) goto L_0x0d15
            java.lang.String r1 = "OMX.Intel.VideoDecoder.AVC"
            boolean r1 = r1.equals(r15)     // Catch:{ Exception -> 0x0fad }
            if (r1 != 0) goto L_0x0d15
            int r1 = r14.A07     // Catch:{ Exception -> 0x0fad }
            int r5 = java.lang.Math.max(r1, r5)     // Catch:{ Exception -> 0x0fad }
            int r1 = r14.A08     // Catch:{ Exception -> 0x0fad }
            int r6 = java.lang.Math.max(r1, r6)     // Catch:{ Exception -> 0x0fad }
        L_0x0d15:
            int r1 = r14.A05     // Catch:{ Exception -> 0x0fad }
            r57 = r35
            r59 = r1
            r60 = r6
            r61 = r5
            r62 = r50
            r63 = r3
            r64 = r49
            r65 = r2
            com.whatsapp.VideoFrameConverter.configure(r57, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68)     // Catch:{ Exception -> 0x0fad }
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0fad }
            java.lang.String r15 = "videotranscoder/transcode/configure frame converter from:("
            r14.append(r15)     // Catch:{ Exception -> 0x0fad }
            r14.append(r11)     // Catch:{ Exception -> 0x0fad }
            java.lang.String r11 = "["
            r14.append(r11)     // Catch:{ Exception -> 0x0fad }
            r14.append(r1)     // Catch:{ Exception -> 0x0fad }
            java.lang.String r1 = "] "
            X.C90464aC.A1K(r1, r10, r14, r6, r5)     // Catch:{ Exception -> 0x0fad }
            r14.append(r10)     // Catch:{ Exception -> 0x0fad }
            r5 = r50
            r14.append(r5)     // Catch:{ Exception -> 0x0fad }
            r14.append(r10)     // Catch:{ Exception -> 0x0fad }
            r14.append(r3)     // Catch:{ Exception -> 0x0fad }
            r14.append(r10)     // Catch:{ Exception -> 0x0fad }
            r3 = r49
            r14.append(r3)     // Catch:{ Exception -> 0x0fad }
            r14.append(r10)     // Catch:{ Exception -> 0x0fad }
            r14.append(r2)     // Catch:{ Exception -> 0x0fad }
            java.lang.String r5 = ") to:("
            r3 = r70
            r2 = r66
            X.C90464aC.A1K(r5, r11, r14, r3, r2)     // Catch:{ Exception -> 0x0fad }
            r3 = r67
            r2 = r68
            X.C90464aC.A1K(r1, r10, r14, r3, r2)     // Catch:{ Exception -> 0x0fad }
            java.lang.String r1 = X.C90474aD.A0f(r14)     // Catch:{ Exception -> 0x0fad }
            goto L_0x0d89
        L_0x0d74:
            r1 = -1
            if (r11 != r1) goto L_0x0d8c
            if (r53 == 0) goto L_0x0d8c
            int r1 = r9.flags     // Catch:{ Exception -> 0x0fad }
            r1 = r1 & 4
            if (r1 != 0) goto L_0x0d84
            java.lang.String r1 = "videotranscoder/transcode/decoder says try later after extractor finished"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ Exception -> 0x0fad }
        L_0x0d84:
            r52 = 1
            goto L_0x0d8c
        L_0x0d87:
            java.lang.String r1 = "videotranscoder/transcode/decoder/release/output"
        L_0x0d89:
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x0fad }
        L_0x0d8c:
            int r1 = r9.flags     // Catch:{ Exception -> 0x0fad }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0a2d
            java.lang.String r1 = "videotranscoder/transcode/decoder OutputBuffer BUFFER_FLAG_END_OF_STREAM"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x0fad }
            r52 = 1
            goto L_0x0a2d
        L_0x0d9b:
            r2 = r38
            r1 = r39
            A0A(r12, r2, r1)     // Catch:{ all -> 0x101c }
            r2 = r46
            r3 = r29
            r1 = r28
            A09(r2, r13, r3, r1)     // Catch:{ all -> 0x101c }
            r2 = r40
            r1 = r42
            A0A(r13, r2, r1)     // Catch:{ all -> 0x101c }
            r69.release()     // Catch:{ all -> 0x101c }
            com.whatsapp.util.Log.i((java.lang.String) r43)     // Catch:{ all -> 0x101c }
            com.whatsapp.VideoFrameConverter.release(r35)     // Catch:{ all -> 0x101c }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x101c }
            java.lang.String r1 = "videotranscoder/transcode/done cancelled:"
            r3.append(r1)     // Catch:{ all -> 0x101c }
            boolean r1 = r0.A0Y     // Catch:{ all -> 0x101c }
            r3.append(r1)     // Catch:{ all -> 0x101c }
            r1 = r51
            r3.append(r1)     // Catch:{ all -> 0x101c }
            long r1 = r0.A02     // Catch:{ all -> 0x101c }
            r3.append(r1)     // Catch:{ all -> 0x101c }
            r1 = r41
            r3.append(r1)     // Catch:{ all -> 0x101c }
            java.io.File r1 = r0.A0A     // Catch:{ all -> 0x101c }
            long r1 = r1.length()     // Catch:{ all -> 0x101c }
            r3.append(r1)     // Catch:{ all -> 0x101c }
            r1 = r44
            r3.append(r1)     // Catch:{ all -> 0x101c }
            long r1 = r0.A03     // Catch:{ all -> 0x101c }
            r3.append(r1)     // Catch:{ all -> 0x101c }
            java.lang.String r2 = " skipfirstframes:"
            r1 = r30
            X.C36321k7.A1T(r2, r3, r1)     // Catch:{ all -> 0x101c }
            if (r29 == 0) goto L_0x0df7
            r29.close()     // Catch:{ all -> 0x1028 }
        L_0x0df7:
            r37.close()     // Catch:{ all -> 0x1050 }
            boolean r1 = r0.A0Y     // Catch:{ all -> 0x1050 }
            if (r1 != 0) goto L_0x0e0e
            java.io.File r1 = r0.A0A     // Catch:{ all -> 0x1050 }
            long r2 = r1.length()     // Catch:{ all -> 0x1050 }
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0fa6
            long r1 = r0.A02     // Catch:{ all -> 0x1050 }
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0fa6
        L_0x0e0e:
            long r1 = r0.A03     // Catch:{ all -> 0x1050 }
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0e21
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x1050 }
            long r1 = r0.A02     // Catch:{ all -> 0x1050 }
            long r1 = r3.toMicros(r1)     // Catch:{ all -> 0x1050 }
            r3 = 30
            long r1 = r1 / r3
            r0.A03 = r1     // Catch:{ all -> 0x1050 }
        L_0x0e21:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = "videotranscoder/transcode/finished: size:"
            r3.append(r1)     // Catch:{ all -> 0x1050 }
            java.io.File r1 = r0.A0A     // Catch:{ all -> 0x1050 }
            long r1 = r1.length()     // Catch:{ all -> 0x1050 }
            X.C36351kA.A1S(r3, r1)     // Catch:{ all -> 0x1050 }
            java.io.File r1 = r0.A09     // Catch:{ all -> 0x1050 }
            boolean r1 = r1.exists()     // Catch:{ all -> 0x1050 }
            if (r1 == 0) goto L_0x0f47
            boolean r1 = r0.A0Y     // Catch:{ all -> 0x1050 }
            if (r1 != 0) goto L_0x0e99
            java.io.File r1 = r0.A09     // Catch:{ all -> 0x1050 }
            X.1DA r4 = X.AnonymousClass1DC.A04(r1)     // Catch:{ all -> 0x1050 }
            int r3 = r4.A01     // Catch:{ all -> 0x1050 }
            r2 = 2
            if (r3 == r2) goto L_0x0e4d
            r1 = 3
            if (r3 != r1) goto L_0x0e5e
        L_0x0e4d:
            int r3 = r4.A00     // Catch:{ all -> 0x1050 }
            r1 = 4
            if (r3 == r1) goto L_0x0e99
            if (r3 == r2) goto L_0x0e99
            r1 = 1
            if (r3 == r1) goto L_0x0e99
            if (r3 == 0) goto L_0x0e99
            r1 = 8
            if (r3 != r1) goto L_0x0e5e
            goto L_0x0e99
        L_0x0e5e:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1050 }
            java.io.File r1 = r74.getAbsoluteFile()     // Catch:{ all -> 0x1050 }
            r2.append(r1)     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = ".aac"
            java.lang.String r1 = X.AnonymousClass000.A0q(r1, r2)     // Catch:{ all -> 0x1050 }
            java.io.File r2 = X.C90524aI.A0S(r1)     // Catch:{ all -> 0x1050 }
            r0.A08 = r2     // Catch:{ all -> 0x1050 }
            java.io.File r1 = r0.A09     // Catch:{ all -> 0x1050 }
            X.5wI r3 = new X.5wI     // Catch:{ all -> 0x1050 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x1050 }
            r1 = r26
            r3.A01 = r1     // Catch:{ all -> 0x1050 }
            r1 = r24
            r3.A02 = r1     // Catch:{ all -> 0x1050 }
            r1 = 96000(0x17700, float:1.34525E-40)
            r3.A00 = r1     // Catch:{ all -> 0x1050 }
            X.6vj r4 = new X.6vj     // Catch:{ all -> 0x1050 }
            r4.<init>(r3)     // Catch:{ all -> 0x1050 }
            r2 = 3
            X.7sT r1 = new X.7sT     // Catch:{ all -> 0x1050 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x1050 }
            r4.A00 = r1     // Catch:{ all -> 0x1050 }
            r4.A02()     // Catch:{ all -> 0x1050 }
        L_0x0e99:
            int r1 = X.AnonymousClass1GW.A03(r74)     // Catch:{ all -> 0x1050 }
            java.lang.Long r2 = X.C36441kJ.A0y(r1)     // Catch:{ all -> 0x1050 }
            r1 = r73
            r1.A0H = r2     // Catch:{ all -> 0x1050 }
            r2 = 1
            r1 = r72
            r1.A0D(r2)     // Catch:{ all -> 0x1050 }
            boolean r1 = r0.A0Y     // Catch:{ all -> 0x1050 }
            if (r1 != 0) goto L_0x0f2c
            long r3 = r0.A03     // Catch:{ 5V4 -> 0x0f29 }
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0ebb
            long r1 = r0.A02     // Catch:{ 5V4 -> 0x0f29 }
            long r20 = r1 * r33
            long r20 = r20 / r3
        L_0x0ebb:
            java.io.File r1 = r0.A08     // Catch:{ 5V4 -> 0x0f29 }
            if (r1 == 0) goto L_0x0ef3
            boolean r1 = r1.exists()     // Catch:{ 5V4 -> 0x0f29 }
            if (r1 == 0) goto L_0x0ef1
            java.io.File r9 = r0.A08     // Catch:{ 5V4 -> 0x0f29 }
        L_0x0ec7:
            java.io.File r2 = r0.A09     // Catch:{ 5V4 -> 0x0f29 }
            X.67y r1 = new X.67y     // Catch:{ 5V4 -> 0x0f29 }
            r1.<init>(r2)     // Catch:{ 5V4 -> 0x0f29 }
            int r6 = r1.A01     // Catch:{ 5V4 -> 0x0f29 }
            X.1AV r5 = r0.A0O     // Catch:{ 5V4 -> 0x0f29 }
            java.io.File r4 = r0.A0A     // Catch:{ 5V4 -> 0x0f29 }
            java.io.File r3 = r0.A09     // Catch:{ 5V4 -> 0x0f29 }
            long r1 = r0.A03     // Catch:{ 5V4 -> 0x0f29 }
            long r1 = r1 / r16
            r10 = r5
            r11 = r74
            r12 = r9
            r13 = r4
            r14 = r3
            r15 = r6
            r16 = r7
            r18 = r20
            r20 = r1
            r22 = r26
            com.whatsapp.Mp4Ops.A02(r10, r11, r12, r13, r14, r15, r16, r18, r20, r22)     // Catch:{ 5V4 -> 0x0f29 }
            r2 = 1
            com.whatsapp.Mp4Ops.A03(r5, r11, r2)     // Catch:{ 5V4 -> 0x0f29 }
            goto L_0x0f20
        L_0x0ef1:
            r9 = 0
            goto L_0x0ec7
        L_0x0ef3:
            java.io.File r9 = r0.A09     // Catch:{ 5V4 -> 0x0f29 }
            r7 = r26
            goto L_0x0ec7
        L_0x0ef8:
            long r1 = r0.A03     // Catch:{ 5V4 -> 0x0f29 }
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x0f04
            long r3 = r0.A02     // Catch:{ 5V4 -> 0x0f29 }
            long r20 = r3 * r33
            long r20 = r20 / r1
        L_0x0f04:
            X.1AV r5 = r0.A0O     // Catch:{ 5V4 -> 0x0f29 }
            r7 = 0
            java.io.File r4 = r0.A0A     // Catch:{ 5V4 -> 0x0f29 }
            java.io.File r3 = r0.A09     // Catch:{ 5V4 -> 0x0f29 }
            long r1 = r1 / r16
            r10 = 0
            r11 = 0
            r17 = 0
            r6 = r74
            r8 = r4
            r9 = r3
            r13 = r20
            r15 = r1
            com.whatsapp.Mp4Ops.A02(r5, r6, r7, r8, r9, r10, r11, r13, r15, r17)     // Catch:{ 5V4 -> 0x0f29 }
            r2 = 1
            com.whatsapp.Mp4Ops.A03(r5, r6, r2)     // Catch:{ 5V4 -> 0x0f29 }
        L_0x0f20:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ 5V4 -> 0x0f29 }
            r1 = r73
            r1.A02 = r2     // Catch:{ 5V4 -> 0x0f29 }
            goto L_0x0f2c
        L_0x0f29:
            r2 = move-exception
            goto L_0x104a
        L_0x0f2c:
            java.io.File r1 = r0.A0A
            X.AnonymousClass6YY.A0P(r1)
            java.io.File r1 = r0.A08
            if (r1 == 0) goto L_0x0f38
            X.AnonymousClass6YY.A0P(r1)
        L_0x0f38:
            java.io.File r1 = r0.A0F
            if (r1 == 0) goto L_0x0f3f
            X.AnonymousClass6YY.A0P(r1)
        L_0x0f3f:
            boolean r0 = r0.A0Y
            if (r0 == 0) goto L_0x0f46
            X.AnonymousClass6YY.A0P(r74)
        L_0x0f46:
            return
        L_0x0f47:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = "videotranscoder/transcode/input file disappeared, "
            r8.append(r1)     // Catch:{ all -> 0x1050 }
            java.io.File r7 = r0.A09     // Catch:{ all -> 0x1050 }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = "file_path="
            X.C90464aC.A1A(r7, r1, r6)     // Catch:{ all -> 0x1050 }
            java.lang.String r5 = ", "
            r6.append(r5)     // Catch:{ all -> 0x1050 }
            boolean r4 = r7.exists()     // Catch:{ all -> 0x1050 }
            boolean r3 = r7.canRead()     // Catch:{ all -> 0x1050 }
            boolean r2 = r7.canWrite()     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = "exists="
            r6.append(r1)     // Catch:{ all -> 0x1050 }
            r6.append(r4)     // Catch:{ all -> 0x1050 }
            r6.append(r5)     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = "canRead="
            r6.append(r1)     // Catch:{ all -> 0x1050 }
            r6.append(r3)     // Catch:{ all -> 0x1050 }
            r6.append(r5)     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = "canWrite="
            r6.append(r1)     // Catch:{ all -> 0x1050 }
            r6.append(r2)     // Catch:{ all -> 0x1050 }
            r6.append(r5)     // Catch:{ all -> 0x1050 }
            if (r4 == 0) goto L_0x0f97
            java.lang.String r1 = "length="
            X.C90464aC.A19(r7, r1, r6)     // Catch:{ all -> 0x1050 }
            r6.append(r5)     // Catch:{ all -> 0x1050 }
        L_0x0f97:
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x1050 }
            X.C36321k7.A1Z(r8, r1)     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = "input file missing after transcode"
            java.io.FileNotFoundException r2 = X.C90524aI.A0V(r1)     // Catch:{ all -> 0x1050 }
            goto L_0x104f
        L_0x0fa6:
            X.1GL r2 = new X.1GL     // Catch:{ all -> 0x1050 }
            r2.<init>()     // Catch:{ all -> 0x1050 }
            goto L_0x104f
        L_0x0fad:
            r2 = move-exception
            java.lang.String r1 = "videotranscoder/transcode"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0fb4 }
            throw r2     // Catch:{ all -> 0x0fb4 }
        L_0x0fb4:
            r1 = move-exception
            r3 = r38
            r2 = r39
            A0A(r12, r3, r2)     // Catch:{ all -> 0x101c }
            r4 = r46
            r3 = r29
            r2 = r28
            A09(r4, r13, r3, r2)     // Catch:{ all -> 0x101c }
            r3 = r40
            r2 = r42
            A0A(r13, r3, r2)     // Catch:{ all -> 0x101c }
            r69.release()     // Catch:{ all -> 0x101c }
            com.whatsapp.util.Log.i((java.lang.String) r43)     // Catch:{ all -> 0x101c }
            com.whatsapp.VideoFrameConverter.release(r35)     // Catch:{ all -> 0x101c }
            goto L_0x101b
        L_0x0fd6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x101c }
            X.C36321k7.A1P(r9, r6, r1)     // Catch:{ all -> 0x101c }
            X.1GL r1 = new X.1GL     // Catch:{ all -> 0x101c }
            r1.<init>()     // Catch:{ all -> 0x101c }
            goto L_0x101b
        L_0x0fe3:
            r1 = move-exception
            java.lang.String r2 = X.C36321k7.A0D(r9, r6)     // Catch:{ all -> 0x101c }
            com.whatsapp.util.Log.e(r2, r1)     // Catch:{ all -> 0x101c }
            goto L_0x101b
        L_0x0fec:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x101c }
            java.lang.String r1 = "videotranscoder/transcode/mime "
            X.C36321k7.A1P(r1, r6, r2)     // Catch:{ all -> 0x101c }
            X.1GL r1 = new X.1GL     // Catch:{ all -> 0x101c }
            r1.<init>()     // Catch:{ all -> 0x101c }
            goto L_0x101b
        L_0x0ffb:
            java.lang.String r1 = "videotranscoder/transcode/not a video file"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x101c }
            X.1GL r1 = new X.1GL     // Catch:{ all -> 0x101c }
            r1.<init>()     // Catch:{ all -> 0x101c }
            goto L_0x101b
        L_0x1006:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x101c }
            X.C36321k7.A1P(r9, r6, r1)     // Catch:{ all -> 0x101c }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x101c }
            java.lang.String r1 = "Can't create decoder for "
            java.lang.String r1 = X.AnonymousClass000.A0p(r1, r6, r2)     // Catch:{ all -> 0x101c }
            java.io.FileNotFoundException r1 = X.C90524aI.A0V(r1)     // Catch:{ all -> 0x101c }
        L_0x101b:
            throw r1     // Catch:{ all -> 0x101c }
        L_0x101c:
            r2 = move-exception
            if (r29 == 0) goto L_0x1027
            r29.close()     // Catch:{ all -> 0x1023 }
            goto L_0x1027
        L_0x1023:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x1028 }
        L_0x1027:
            throw r2     // Catch:{ all -> 0x1028 }
        L_0x1028:
            r2 = move-exception
            r37.close()     // Catch:{ all -> 0x102d }
            goto L_0x104f
        L_0x102d:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x1050 }
            goto L_0x104f
        L_0x1032:
            java.lang.String r1 = "videotranscoder/transcode/no known color formats suported"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = "No known color formats suported"
            java.io.FileNotFoundException r2 = X.C90524aI.A0V(r1)     // Catch:{ all -> 0x1050 }
            goto L_0x104f
        L_0x103e:
            java.lang.String r1 = "videotranscoder/transcode/no codec supporting video/avc"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x1050 }
            java.lang.String r1 = "No codec supporting video/avc"
            java.io.FileNotFoundException r2 = X.C90524aI.A0V(r1)     // Catch:{ all -> 0x1050 }
            goto L_0x104f
        L_0x104a:
            r1 = r45
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x1050 }
        L_0x104f:
            throw r2     // Catch:{ all -> 0x1050 }
        L_0x1050:
            r2 = move-exception
            java.io.File r1 = r0.A0A
            X.AnonymousClass6YY.A0P(r1)
            java.io.File r1 = r0.A08
            if (r1 == 0) goto L_0x105d
            X.AnonymousClass6YY.A0P(r1)
        L_0x105d:
            java.io.File r0 = r0.A0F
            if (r0 == 0) goto L_0x1064
            X.AnonymousClass6YY.A0P(r0)
        L_0x1064:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146526vk.A0I():void");
    }

    public void A0J() {
        Throwable th;
        AnonymousClass5V4 r2;
        try {
            AnonymousClass1AV r4 = this.A0O;
            File file = this.A09;
            File file2 = this.A0S;
            long j = this.A0K;
            long j2 = this.A0L;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("mp4ops/trim/start from ");
            A0u.append(j);
            A0u.append(" to ");
            A0u.append(j2);
            A0u.append(" size:");
            C36351kA.A1S(A0u, file.length());
            if ((j > 0 || j2 > 0) && j != j2) {
                float f = ((float) j) / 1000.0f;
                float f2 = ((float) (j2 - j)) / 1000.0f;
                C1041958q A022 = r4.A02(file, file);
                try {
                    Mp4Ops.LibMp4OperationResult mp4mux = Mp4Ops.mp4mux(file.getAbsolutePath(), file.getAbsolutePath(), file2.getAbsolutePath(), -1.0f, f, f2, -1.0f, -1, file.getAbsolutePath(), f);
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("mp4ops/trim/result: ");
                    C36331k8.A1S(A0u2, mp4mux.success);
                    r4.A04(mp4mux, A022, file2);
                    if (A022 != null) {
                        r4.A01.Bly(A022);
                    }
                    if (!mp4mux.success) {
                        StringBuilder A0u3 = AnonymousClass000.A0u();
                        A0u3.append("mp4ops/trim/error_message/");
                        C36321k7.A1Z(A0u3, mp4mux.errorMessage);
                        if (mp4mux.ioException) {
                            th = C90524aI.A0X("No space");
                        } else {
                            StringBuilder A0u4 = AnonymousClass000.A0u();
                            A0u4.append("invalid result, error_code: ");
                            int i = mp4mux.errorCode;
                            A0u4.append(i);
                            A0u4.append(" | message: ");
                            r2 = new AnonymousClass5V4(i, AnonymousClass000.A0q(mp4mux.errorMessage, A0u4));
                            throw r2;
                        }
                    } else {
                        Log.i("mp4ops/trim/finished: size");
                        C132466Tv r22 = this.A0U;
                        Long A0y = C36441kJ.A0y(AnonymousClass1GW.A03(file2));
                        C1042658x r1 = r22.A02;
                        r1.A0H = A0y;
                        r22.A0D(true);
                        Mp4Ops.A03(r4, file2, true);
                        r1.A02 = true;
                        return;
                    }
                } catch (Error e) {
                    Log.e("mp4ops/trim/failed: mp4mux error, exiting", e);
                    r2 = new AnonymousClass5V4(0, e.getMessage());
                }
            } else {
                StringBuilder A0u5 = AnonymousClass000.A0u();
                A0u5.append("timeFrom:");
                A0u5.append(j);
                th = AnonymousClass001.A08(C36381kD.A0z(" timeTo:", A0u5, j2));
            }
            throw th;
        } catch (AnonymousClass5V4 e2) {
            Log.e("videotranscodequeue/libmp4muxexception", e2);
            throw e2;
        }
    }

    public boolean BK3() {
        return AnonymousClass000.A1V(this.A0A);
    }

    public C146526vk(RectF rectF, C19700wN r9, Mp4Ops mp4Ops, C132466Tv r11, AnonymousClass1AV r12, C24341Cb r13, C19630wG r14, C20810yC r15, AnonymousClass1GJ r16, C19770wU r17, File file, File file2, int i, int i2, int i3, int i4, long j, long j2, boolean z) {
        this.A0Q = r14;
        this.A0T = mp4Ops;
        this.A0R = r15;
        this.A0N = r9;
        this.A0W = r17;
        this.A0V = r16;
        this.A0O = r12;
        this.A0P = r13;
        this.A09 = file;
        this.A0S = file2;
        long j3 = j;
        this.A0K = j3;
        long j4 = j2;
        this.A0L = j4;
        this.A0J = i;
        this.A0I = i2;
        this.A0M = rectF;
        this.A0H = i3;
        this.A0G = i4;
        this.A0X = z;
        this.A0U = r11;
        if (j2 <= 0 || j != j2) {
            A0C(this);
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("timeFrom:");
        A0u.append(j3);
        throw AnonymousClass001.A08(C36381kD.A0z(" timeTo:", A0u, j4));
    }

    public static C130586Lq A03(MediaFormat mediaFormat, AnonymousClass6SH r4, String str) {
        int i;
        String str2;
        int i2;
        C36321k7.A1K(mediaFormat, "videotranscoder/transcode/getDecoderFormat output format has changed to ", AnonymousClass000.A0u());
        C130586Lq r2 = new C130586Lq();
        r2.A0A = str;
        r2.A00 = mediaFormat.getInteger("color-format");
        r2.A09 = mediaFormat.getInteger("width");
        r2.A06 = mediaFormat.getInteger("height");
        try {
            r2.A02 = mediaFormat.getInteger("crop-left");
        } catch (Exception unused) {
        }
        try {
            r2.A03 = mediaFormat.getInteger("crop-right");
        } catch (Exception unused2) {
        }
        try {
            r2.A04 = mediaFormat.getInteger("crop-top");
        } catch (Exception unused3) {
        }
        try {
            r2.A01 = mediaFormat.getInteger("crop-bottom");
        } catch (Exception unused4) {
        }
        try {
            r2.A07 = mediaFormat.getInteger("slice-height");
        } catch (Exception unused5) {
        }
        if (str.startsWith("OMX.Nvidia.")) {
            r2.A07 = ((r2.A06 + 16) - 1) & (~15);
        } else if (str.equalsIgnoreCase("OMX.SEC.avc.dec")) {
            r2.A07 = r2.A06;
            r2.A08 = r2.A09;
        }
        try {
            r2.A08 = mediaFormat.getInteger("stride");
        } catch (Exception unused6) {
        }
        A0E(str);
        if (r4 != null) {
            int i3 = r2.A00;
            String str3 = r4.A04;
            if (str3 != null && i3 > 0 && (i2 = r4.A00) > 0 && str3.equals(str) && i2 == i3) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("videotranscoder/parseDecoderFormat/forcing frame convert color id=");
                i = r4.A02;
                str2 = C36381kD.A10(A0u, i);
                Log.i(str2);
                r2.A05 = i;
                return r2;
            }
        }
        int i4 = r2.A00;
        r2.A05 = A01(i4);
        i = 3;
        if (i4 != 25) {
            if (i4 != 2141391876) {
                if (i4 == 2130706433 && (A05() == null || !C90514aH.A0y(A05()).startsWith("mt6589"))) {
                    r2.A05 = 1;
                    return r2;
                }
            }
            r2.A05 = i;
        } else if ("OMX.k3.video.encoder.avc".equals(str) || "OMX.k3.video.decoder.avc".equals(str)) {
            str2 = "videotranscoder/transcode/decoder color format for Huaiwei is VideoFrameConverter.FRAMECONV_COLOR_FORMAT_NV12";
            Log.i(str2);
            r2.A05 = i;
        }
        return r2;
    }

    public static void A09(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, WritableByteChannel writableByteChannel, ByteBuffer[] byteBufferArr) {
        while (true) {
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, SearchActionVerificationClientService.MS_TO_NS);
            if (dequeueOutputBuffer >= 0) {
                C36321k7.A1T("videotranscoder/transcode/encoder draining ", AnonymousClass000.A0u(), dequeueOutputBuffer);
                ByteBuffer byteBuffer = byteBufferArr[dequeueOutputBuffer];
                C90464aC.A0s(bufferInfo, byteBuffer);
                writableByteChannel.write(byteBuffer);
                byteBuffer.clear();
                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
            } else {
                Log.i("videotranscoder/transcode/encoder drained");
                return;
            }
        }
    }

    public static void A0A(MediaCodec mediaCodec, String str, String str2) {
        mediaCodec.stop();
        Log.i(str);
        mediaCodec.release();
        Log.i(str2);
    }

    public static void A0B(AnonymousClass7ez r6, AnonymousClass7ez r7, AnonymousClass5TE r8, AnonymousClass6QD r9, HashMap hashMap) {
        AnonymousClass65N B78;
        HashMap A032 = r9.A03(r8);
        if (A032 != null) {
            HashMap A0J2 = AnonymousClass001.A0J();
            hashMap.put(r8, A0J2);
            Iterator A10 = C36371kC.A10(A032);
            while (A10.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A10);
                ArrayList A0I2 = AnonymousClass001.A0I();
                A0J2.put(A11.getKey(), A0I2);
                Iterator A0r = C90474aD.A0r(((C128956Eg) A11.getValue()).A01);
                while (A0r.hasNext()) {
                    AnonymousClass6F1 r0 = (AnonymousClass6F1) A0r.next();
                    File file = r0.A01;
                    if (r0.A01()) {
                        Objects.requireNonNull(r6);
                        B78 = r6.B78(Uri.fromFile(file));
                    } else {
                        Objects.requireNonNull(r7);
                        B78 = r7.B78(Uri.fromFile(file));
                    }
                    A0I2.add(B78);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [boolean, int] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        if (r5 == 7) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cc, code lost:
        if (r5 == 180) goto L_0x00ce;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A08(android.graphics.RectF r60, X.C130246Kh r61, X.AnonymousClass6VQ r62, java.io.File r63, java.io.File r64, java.io.File r65, int r66, int r67, boolean r68) {
        /*
            r59 = this;
            r0 = r59
            X.0wG r1 = r0.A0Q
            android.content.Context r1 = r1.A00
            r19 = r1
            X.1GJ r3 = r0.A0V
            X.6M6 r15 = new X.6M6
            r15.<init>()
            int r2 = r0.A0H
            int r1 = r0.A0G
            r18 = r1
            float r13 = r0.A00
            X.6Tv r1 = r0.A0U
            r57 = r1
            r12 = 0
            r1 = r19
            boolean r6 = X.C36341k9.A1a(r1, r3)
            r11 = 2
            r20 = r63
            r1 = r20
            X.AnonymousClass00C.A0D(r1, r11)
            r17 = 3
            r16 = 4
            r1 = 1920(0x780, float:2.69E-42)
            if (r2 < r1) goto L_0x0037
            java.lang.Integer r4 = X.C023109s.A0G
        L_0x0034:
            if (r68 == 0) goto L_0x0060
            goto L_0x0048
        L_0x0037:
            r1 = 1280(0x500, float:1.794E-42)
            if (r2 < r1) goto L_0x003e
            java.lang.Integer r4 = X.C023109s.A0C
            goto L_0x0034
        L_0x003e:
            r1 = 848(0x350, float:1.188E-42)
            if (r2 < r1) goto L_0x0045
            java.lang.Integer r4 = X.C023109s.A01
            goto L_0x0034
        L_0x0045:
            java.lang.Integer r4 = X.C023109s.A00
            goto L_0x0034
        L_0x0048:
            X.6ml r2 = new X.6ml     // Catch:{ Exception -> 0x005a }
            r2.<init>()     // Catch:{ Exception -> 0x005a }
            java.lang.String r1 = r20.getPath()     // Catch:{ Exception -> 0x005a }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x005a }
            X.65N r2 = r2.B78(r1)     // Catch:{ Exception -> 0x005a }
            goto L_0x0073
        L_0x005a:
            X.5LY r0 = new X.5LY
            r0.<init>()
            throw r0
        L_0x0060:
            java.lang.String r5 = r20.getPath()
            if (r5 == 0) goto L_0x0551
            android.net.Uri r2 = X.C133036Wk.A01(r5)     // Catch:{ Exception -> 0x0545 }
            X.AnonymousClass00C.A08(r2)     // Catch:{ Exception -> 0x0545 }
            r1 = r19
            X.65N r2 = X.C129256Gb.A00(r1, r2, r12)     // Catch:{ Exception -> 0x0545 }
        L_0x0073:
            if (r2 == 0) goto L_0x0551
            int r5 = r2.A02
            r1 = 6
            if (r5 == r1) goto L_0x007e
            r1 = 7
            r3 = 0
            if (r5 != r1) goto L_0x007f
        L_0x007e:
            r3 = 1
        L_0x007f:
            r1 = r57
            X.58x r1 = r1.A02
            r56 = r1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1.A07 = r3
            X.6OY r1 = X.AnonymousClass1GJ.A08(r2, r4)
            r4 = r66
            if (r66 <= 0) goto L_0x009b
            r3 = r67
            if (r67 <= 0) goto L_0x009b
            r1.A09 = r4
            r1.A07 = r3
        L_0x009b:
            int r10 = r1.A09
            int r9 = r1.A07
            r3 = r62
            if (r62 == 0) goto L_0x015c
            android.graphics.Bitmap r7 = X.C90524aI.A09(r10, r9)
            X.AnonymousClass00C.A08(r7)
            r3.A04(r12, r7)
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.PNG
            java.io.FileOutputStream r4 = X.C90524aI.A0W(r65)
            r3 = 100
            r7.compress(r5, r3, r4)
            r4.close()
            android.net.Uri r3 = android.net.Uri.fromFile(r65)
            X.AnonymousClass00C.A08(r3)
            r8 = 1065353216(0x3f800000, float:1.0)
            int r5 = r2.A04
            r4 = 180(0xb4, float:2.52E-43)
            if (r5 == 0) goto L_0x00ce
            float r7 = (float) r9
            float r2 = (float) r10
            if (r5 != r4) goto L_0x00d0
        L_0x00ce:
            float r7 = (float) r10
            float r2 = (float) r9
        L_0x00d0:
            float r7 = r7 / r2
            int r5 = r5 % r4
            if (r5 == 0) goto L_0x00d7
            float r2 = (float) r6
            float r7 = r2 / r7
        L_0x00d7:
            X.AU0 r14 = r15.A00(r3)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r14 == 0) goto L_0x00fe
            java.lang.Object r2 = r14.A01()     // Catch:{ all -> 0x00fb }
            X.AnonymousClass00C.A08(r2)     // Catch:{ all -> 0x00fb }
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch:{ all -> 0x00fb }
            int r4 = r2.getHeight()     // Catch:{ all -> 0x00fb }
            int r2 = r2.getWidth()     // Catch:{ all -> 0x00fb }
            r14.close()
            if (r2 <= 0) goto L_0x00fe
            if (r4 <= 0) goto L_0x00fe
            float r5 = (float) r2
            float r2 = (float) r4
            float r5 = r5 / r2
            goto L_0x00fe
        L_0x00fb:
            r14.close()
        L_0x00fe:
            X.5uM r4 = new X.5uM
            r4.<init>()
            java.lang.String r2 = r3.toString()
            r4.A02 = r2
            r4.A01 = r8
            r3 = 0
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0113
            float r8 = r8 * r7
            float r3 = r8 / r5
        L_0x0113:
            r4.A00 = r3
            r4.A03 = r6
            X.5uN r8 = new X.5uN
            r8.<init>(r4)
            r2 = r68 ^ 1
            X.6mh r7 = new X.6mh
            r7.<init>(r2)
            r14 = r60
            if (r60 == 0) goto L_0x014d
            r2 = 8
            float[] r5 = new float[r2]
            float r4 = r14.left
            r5[r12] = r4
            float r3 = r14.bottom
            r5[r6] = r3
            float r2 = r14.right
            r5[r11] = r2
            r5[r17] = r3
            r5[r16] = r4
            r4 = 5
            float r3 = r14.top
            r5[r4] = r3
            X.C90494aF.A1P(r5, r2, r3)
            X.5oM r2 = r7.A04
            java.nio.FloatBuffer r2 = r2.A01
            r2.put(r5)
            r2.position(r12)
        L_0x014d:
            X.6mg r3 = new X.6mg
            r3.<init>(r15, r8)
            X.7lR[] r2 = new X.C160697lR[r11]
            r2[r12] = r7
            java.util.List r2 = X.C36341k9.A0m(r3, r2, r6)
            r1.A0F = r2
        L_0x015c:
            if (r68 == 0) goto L_0x0353
            float r13 = A00(r10, r9)
            r4 = 15
        L_0x0164:
            int r10 = r10 * r9
            float r2 = (float) r10
            float r2 = r2 * r13
            int r3 = (int) r2
            r2 = r18
            int r2 = java.lang.Math.min(r2, r3)
            r1.A08 = r12
            r1.A0I = r6
            r1.A01 = r4
            r1.A00 = r2
            r1.A0G = r6
            java.lang.String r2 = "video/avc"
            android.media.MediaCodec r3 = android.media.MediaCodec.createDecoderByType(r2)
            android.media.MediaCodecInfo r2 = r3.getCodecInfo()
            int r11 = X.AnonymousClass1GJ.A02(r2)
            int r12 = r1.A09
            int r13 = r1.A07
            android.media.MediaCodecInfo r2 = r3.getCodecInfo()
            java.lang.String r10 = r2.getName()
            android.media.MediaCodecInfo r2 = r3.getCodecInfo()
            java.lang.String r3 = r2.getName()
            java.lang.String r2 = "OMX.qcom.video.encoder.avc"
            boolean r2 = r3.equals(r2)
            int r14 = X.C90494aF.A07(r2)
            X.6SH r9 = r0.A04
            r22 = 0
            r8 = 0
            r15 = 0
            r16 = 0
            X.6Lq r2 = A04(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.A06 = r2
            X.0yC r2 = r0.A0R
            r55 = r2
            r3 = 7412(0x1cf4, float:1.0386E-41)
            boolean r21 = r2.A0E(r3)
            X.0wU r9 = r0.A0W
            long r4 = r0.A0K
            long r2 = r0.A0L
            boolean r7 = r0.A0C
            if (r7 != 0) goto L_0x01ca
            boolean r7 = r0.A0B
            if (r7 == 0) goto L_0x01cb
        L_0x01ca:
            r8 = 1
        L_0x01cb:
            r10 = 3768(0xeb8, float:5.28E-42)
            r7 = r55
            boolean r12 = r7.A0E(r10)
            X.AnonymousClass00C.A0D(r9, r6)
            X.5oX r7 = new X.5oX
            r6 = r20
            r7.<init>(r6)
            r10 = 0
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x01e5
            r4 = 0
        L_0x01e5:
            int r6 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x01eb
            r2 = -1
        L_0x01eb:
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.6F3 r6 = new X.6F3
            r13 = r6
            r15 = r4
            r17 = r2
            r13.<init>(r14, r15, r17)
            r7.A00 = r6
            X.6F1 r6 = new X.6F1
            r6.<init>(r7)
            X.5TE r10 = X.AnonymousClass5TE.VIDEO
            X.6LQ r3 = new X.6LQ
            r3.<init>(r10)
            java.util.List r2 = r3.A02
            r2.add(r6)
            X.6Eg r5 = new X.6Eg
            r5.<init>(r3)
            X.5TE r7 = X.AnonymousClass5TE.AUDIO
            X.6LQ r4 = new X.6LQ
            r4.<init>(r7)
            java.util.List r2 = r4.A02
            r2.add(r6)
            X.6Eg r3 = new X.6Eg
            r3.<init>(r4)
            X.62Y r2 = new X.62Y
            r2.<init>()
            r2.A00(r5)
            r2.A00(r3)
            X.6QD r4 = new X.6QD
            r4.<init>(r2)
            X.6Lv r2 = new X.6Lv
            r2.<init>()
            r2.A04 = r1
            r58 = r64
            java.lang.String r3 = r58.getPath()
            r2.A0B = r3
            r2.A05 = r4
            r3 = r20
            r2.A0A = r3
            r2.A0D = r8
            r3 = r61
            r2.A09 = r3
            X.4rl r3 = new X.4rl
            r3.<init>()
            r2.A07 = r3
            if (r12 == 0) goto L_0x033f
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newCachedThreadPool()
        L_0x0257:
            X.AnonymousClass00C.A0B(r5)
            if (r21 == 0) goto L_0x0338
            X.6mw r4 = new X.6mw
            r4.<init>()
        L_0x0261:
            X.7io r4 = (X.C159097io) r4
            X.5yz r11 = new X.5yz
            r11.<init>()
            X.5zI r3 = new X.5zI
            r3.<init>(r2)
            r11.A0C = r3
            r2 = r19
            r11.A00 = r2
            X.5Yi r2 = new X.5Yi
            r2.<init>()
            r11.A06 = r2
            r11.A0D = r5
            r11.A09 = r4
            X.5Yj r2 = new X.5Yj
            r2.<init>()
            r11.A07 = r2
            X.5Yk r2 = new X.5Yk
            r2.<init>()
            r11.A08 = r2
            if (r68 == 0) goto L_0x032f
            X.6ml r3 = new X.6ml
            r3.<init>()
        L_0x0293:
            X.7ez r3 = (X.AnonymousClass7ez) r3
            r11.A05 = r3
            X.5Yl r2 = new X.5Yl
            r2.<init>()
            r11.A0A = r2
            X.5Yg r2 = new X.5Yg
            r2.<init>()
            r11.A04 = r2
            if (r68 == 0) goto L_0x02ae
            X.63I r2 = new X.63I
            r2.<init>()
            r11.A01 = r2
        L_0x02ae:
            java.util.Objects.requireNonNull(r19)
            X.5zI r2 = r11.A0C
            java.util.Objects.requireNonNull(r2)
            X.5Yi r2 = r11.A06
            java.util.Objects.requireNonNull(r2)
            java.util.concurrent.ExecutorService r2 = r11.A0D
            java.util.Objects.requireNonNull(r2)
            X.7io r2 = r11.A09
            java.util.Objects.requireNonNull(r2)
            X.5Yj r2 = r11.A07
            java.util.Objects.requireNonNull(r2)
            X.5Yl r3 = r11.A0A
            if (r3 != 0) goto L_0x02d5
            X.5Yl r3 = new X.5Yl
            r3.<init>()
            r11.A0A = r3
        L_0x02d5:
            X.7ez r9 = r11.A05
            if (r9 != 0) goto L_0x02e2
            android.content.Context r2 = r11.A00
            X.6mm r9 = new X.6mm
            r9.<init>(r2)
            r11.A05 = r9
        L_0x02e2:
            X.6M6 r8 = r11.A02
            if (r8 != 0) goto L_0x02ea
            X.6M6 r8 = X.C112755eP.A00
            r11.A02 = r8
        L_0x02ea:
            X.5Yg r6 = r11.A04
            if (r6 != 0) goto L_0x02f5
            X.5Yg r6 = new X.5Yg
            r6.<init>()
            r11.A04 = r6
        L_0x02f5:
            X.5oZ r5 = r11.A0B
            if (r5 != 0) goto L_0x0305
            X.6Xb r2 = new X.6Xb
            r2.<init>()
            X.5oZ r5 = new X.5oZ
            r5.<init>(r2, r3)
            r11.A0B = r5
        L_0x0305:
            X.6Ga r4 = r11.A03
            if (r4 != 0) goto L_0x0310
            X.6Ga r4 = new X.6Ga
            r4.<init>()
            r11.A03 = r4
        L_0x0310:
            X.5zI r3 = r11.A0C
            android.content.Context r2 = r11.A00
            r54 = r2
            X.5Yi r2 = r11.A06
            r53 = r2
            java.util.concurrent.ExecutorService r2 = r11.A0D
            r52 = r2
            X.7io r2 = r11.A09
            r51 = r2
            X.5Yj r2 = r11.A07
            r50 = r2
            X.5Yk r2 = r11.A08
            r49 = r2
            X.63I r2 = r11.A01
            r48 = r2
            goto L_0x0357
        L_0x032f:
            X.6mm r3 = new X.6mm
            r2 = r19
            r3.<init>(r2)
            goto L_0x0293
        L_0x0338:
            X.6mv r4 = new X.6mv
            r4.<init>()
            goto L_0x0261
        L_0x033f:
            java.util.concurrent.LinkedBlockingQueue r13 = new java.util.concurrent.LinkedBlockingQueue
            r13.<init>()
            java.lang.String r12 = "VideoliteTranscodeQueue"
            r17 = 0
            r14 = 1
            r15 = 1
            r16 = 1
            r11 = r9
            X.2kb r5 = r11.B4z(r12, r13, r14, r15, r16, r17)
            goto L_0x0257
        L_0x0353:
            r4 = 30
            goto L_0x0164
        L_0x0357:
            X.AnonymousClass00C.A08(r3)     // Catch:{ all -> 0x04d1 }
            X.6QD r13 = r3.A05     // Catch:{ all -> 0x04d1 }
            if (r13 == 0) goto L_0x03fe
            X.6ml r20 = new X.6ml     // Catch:{ all -> 0x04d1 }
            r20.<init>()     // Catch:{ all -> 0x04d1 }
            java.lang.String r2 = "MediaCompositionMetadataExtractor.extractVideoMetadata"
            android.os.Trace.beginSection(r2)     // Catch:{ all -> 0x04d1 }
            r12 = r10
            java.util.HashMap r2 = r13.A03(r10)     // Catch:{ all -> 0x04d1 }
            if (r2 != 0) goto L_0x0370
            r12 = r7
        L_0x0370:
            long r18 = X.AnonymousClass6U7.A00(r9, r12, r13)     // Catch:{ all -> 0x04d1 }
            java.util.HashMap r2 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x04d1 }
            r11 = r20
            A0B(r11, r9, r10, r13, r2)     // Catch:{ all -> 0x04d1 }
            A0B(r11, r9, r7, r13, r2)     // Catch:{ all -> 0x04d1 }
            r10 = 0
            if (r12 != r7) goto L_0x03ab
            java.lang.Object r11 = r2.get(r7)     // Catch:{ all -> 0x04d1 }
            if (r11 == 0) goto L_0x041d
            java.lang.Object r11 = r2.get(r7)     // Catch:{ all -> 0x04d1 }
            java.util.HashMap r11 = (java.util.HashMap) r11     // Catch:{ all -> 0x04d1 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x04d1 }
            java.lang.Object r11 = r11.get(r12)     // Catch:{ all -> 0x04d1 }
            if (r11 == 0) goto L_0x041d
            java.lang.Object r7 = r2.get(r7)     // Catch:{ all -> 0x04d1 }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ all -> 0x04d1 }
            java.util.List r10 = X.C90524aI.A0n(r12, r7)     // Catch:{ all -> 0x04d1 }
            r7 = 0
            java.lang.Object r10 = r10.get(r7)     // Catch:{ all -> 0x04d1 }
            X.65N r10 = (X.AnonymousClass65N) r10     // Catch:{ all -> 0x04d1 }
            goto L_0x041d
        L_0x03ab:
            java.util.HashMap r7 = r13.A03(r12)     // Catch:{ all -> 0x04d1 }
            java.util.Objects.requireNonNull(r7)     // Catch:{ all -> 0x04d1 }
            int r17 = r7.size()     // Catch:{ all -> 0x04d1 }
            r16 = -1
            r14 = 0
        L_0x03b9:
            r7 = r17
            if (r14 >= r7) goto L_0x041a
            java.util.List r11 = r13.A04(r12, r14)     // Catch:{ all -> 0x04d1 }
            java.util.Objects.requireNonNull(r11)     // Catch:{ all -> 0x04d1 }
            r7 = 0
            java.lang.Object r15 = r11.get(r7)     // Catch:{ all -> 0x04d1 }
            X.6F1 r15 = (X.AnonymousClass6F1) r15     // Catch:{ all -> 0x04d1 }
            boolean r7 = r15.A01()     // Catch:{ all -> 0x04d1 }
            r11 = r9
            if (r7 == 0) goto L_0x03d4
            r11 = r20
        L_0x03d4:
            java.util.Objects.requireNonNull(r11)     // Catch:{ all -> 0x04d1 }
            java.io.File r7 = r15.A01     // Catch:{ all -> 0x04d1 }
            java.lang.String r7 = r7.getCanonicalPath()     // Catch:{ all -> 0x04d1 }
            java.io.File r7 = X.C90524aI.A0S(r7)     // Catch:{ all -> 0x04d1 }
            android.net.Uri r7 = android.net.Uri.fromFile(r7)     // Catch:{ all -> 0x04d1 }
            X.65N r11 = r11.B78(r7)     // Catch:{ all -> 0x04d1 }
            if (r11 == 0) goto L_0x03fb
            int r7 = r11.A05     // Catch:{ all -> 0x04d1 }
            r15 = r7
            int r7 = r11.A03     // Catch:{ all -> 0x04d1 }
            int r7 = java.lang.Math.min(r15, r7)     // Catch:{ all -> 0x04d1 }
            r15 = r16
            if (r7 <= r15) goto L_0x03fb
            r10 = r11
            r16 = r7
        L_0x03fb:
            int r14 = r14 + 1
            goto L_0x03b9
        L_0x03fe:
            java.io.File r2 = r3.A0A     // Catch:{ all -> 0x04d1 }
            if (r2 == 0) goto L_0x0412
            android.net.Uri r2 = android.net.Uri.fromFile(r2)     // Catch:{ all -> 0x04d1 }
            X.65N r23 = r9.B78(r2)     // Catch:{ all -> 0x04d1 }
            if (r23 != 0) goto L_0x0488
            java.lang.IllegalStateException r2 = X.C36381kD.A0l()     // Catch:{ all -> 0x04d1 }
            goto L_0x049b
        L_0x0412:
            java.lang.String r2 = "unable to extract MediaMetadata without MediaComposition or input file"
            java.lang.IllegalArgumentException r2 = X.AnonymousClass001.A08(r2)     // Catch:{ all -> 0x04d1 }
            goto L_0x049b
        L_0x041a:
            java.util.Objects.requireNonNull(r10)     // Catch:{ all -> 0x04d1 }
        L_0x041d:
            java.util.Objects.requireNonNull(r10)     // Catch:{ all -> 0x04d1 }
            long r11 = r10.A08     // Catch:{ all -> 0x04d1 }
            r13 = 1000(0x3e8, double:4.94E-321)
            long r41 = r18 / r13
            int r7 = r10.A05     // Catch:{ all -> 0x04d1 }
            r35 = r7
            int r7 = r10.A03     // Catch:{ all -> 0x04d1 }
            r36 = r7
            int r7 = r10.A04     // Catch:{ all -> 0x04d1 }
            r37 = r7
            int r7 = r10.A02     // Catch:{ all -> 0x04d1 }
            r38 = r7
            int r7 = r10.A01     // Catch:{ all -> 0x04d1 }
            r39 = r7
            r43 = 8
            long r43 = r43 * r11
            long r43 = r43 * r13
            long r43 = r43 * r13
            long r43 = r43 / r18
            int r7 = r10.A00     // Catch:{ all -> 0x04d1 }
            r40 = r7
            X.9tY r7 = r10.A09     // Catch:{ all -> 0x04d1 }
            r24 = r7
            java.lang.String r7 = r10.A0E     // Catch:{ all -> 0x04d1 }
            r20 = r7
            java.lang.String r7 = r10.A0I     // Catch:{ all -> 0x04d1 }
            r19 = r7
            java.lang.String r7 = r10.A0C     // Catch:{ all -> 0x04d1 }
            r18 = r7
            java.lang.String r7 = r10.A0G     // Catch:{ all -> 0x04d1 }
            r17 = r7
            java.lang.String r7 = r10.A0F     // Catch:{ all -> 0x04d1 }
            r16 = r7
            java.lang.String r15 = r10.A0B     // Catch:{ all -> 0x04d1 }
            java.lang.String r14 = r10.A0A     // Catch:{ all -> 0x04d1 }
            java.lang.String r13 = r10.A0D     // Catch:{ all -> 0x04d1 }
            java.lang.String r7 = r10.A0H     // Catch:{ all -> 0x04d1 }
            r47 = 0
            X.65N r23 = new X.65N     // Catch:{ all -> 0x04d1 }
            r25 = r20
            r26 = r19
            r27 = r18
            r28 = r17
            r29 = r16
            r30 = r15
            r31 = r14
            r32 = r13
            r33 = r7
            r34 = r2
            r45 = r11
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43, r45, r47)     // Catch:{ all -> 0x04d1 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x04d1 }
        L_0x0488:
            X.AnonymousClass00C.A08(r49)     // Catch:{ all -> 0x04d1 }
            boolean r2 = r3.A0E     // Catch:{ all -> 0x04d1 }
            if (r2 != 0) goto L_0x049c
            boolean r2 = X.C129256Gb.A01(r3)     // Catch:{ all -> 0x04d1 }
            if (r2 == 0) goto L_0x049c
            java.lang.String r2 = "Incompatible MediaExtractor for pass through"
            java.lang.IllegalArgumentException r2 = X.AnonymousClass001.A08(r2)     // Catch:{ all -> 0x04d1 }
        L_0x049b:
            throw r2     // Catch:{ all -> 0x04d1 }
        L_0x049c:
            X.5zN r7 = new X.5zN     // Catch:{ all -> 0x04d1 }
            r24 = r7
            r25 = r54
            r26 = r48
            r27 = r8
            r28 = r4
            r29 = r6
            r30 = r23
            r31 = r9
            r32 = r53
            r33 = r50
            r34 = r49
            r35 = r51
            r36 = r5
            r37 = r3
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x04d1 }
            X.5i5 r6 = new X.5i5     // Catch:{ all -> 0x04d1 }
            r2 = r52
            r6.<init>(r2)     // Catch:{ all -> 0x04d1 }
            X.6mk r5 = new X.6mk     // Catch:{ all -> 0x04d1 }
            r5.<init>(r7)     // Catch:{ all -> 0x04d1 }
            java.util.concurrent.ExecutorService r4 = r6.A00     // Catch:{ all -> 0x04d1 }
            r2 = 21
            X.C1503374w.A01(r6, r7, r5, r4, r2)     // Catch:{ all -> 0x04d1 }
            goto L_0x04ea
        L_0x04d1:
            r5 = move-exception
            java.lang.String r4 = "TranscodeUtil"
            java.lang.String r2 = "Throwable"
            X.AnonymousClass6YR.A09(r4, r2, r5)
            r5.getMessage()
            X.6Kh r2 = r3.A09
            if (r2 == 0) goto L_0x04e5
            X.5VN r2 = new X.5VN
            r2.<init>((java.lang.Throwable) r5)
        L_0x04e5:
            X.6mj r5 = new X.6mj
            r5.<init>()
        L_0x04ea:
            r0.A0E = r5
            r5.BxQ()     // Catch:{ 5V4 -> 0x0536, InterruptedException | ExecutionException -> 0x0532 }
            int r2 = X.AnonymousClass1GW.A03(r58)     // Catch:{ 5V4 -> 0x0536, InterruptedException | ExecutionException -> 0x0532 }
            java.lang.Long r3 = X.C36441kJ.A0y(r2)     // Catch:{ 5V4 -> 0x0536, InterruptedException | ExecutionException -> 0x0532 }
            r2 = r56
            r2.A0H = r3     // Catch:{ 5V4 -> 0x0536, InterruptedException | ExecutionException -> 0x0532 }
            r3 = 1
            r2 = r57
            r2.A0D(r3)     // Catch:{ 5V4 -> 0x0536, InterruptedException | ExecutionException -> 0x0532 }
            int r1 = r1.A00()     // Catch:{ 5V4 -> 0x0536, InterruptedException | ExecutionException -> 0x0532 }
            r0.A01 = r1     // Catch:{ 5V4 -> 0x0536, InterruptedException | ExecutionException -> 0x0532 }
            boolean r1 = r0.A0Y     // Catch:{ 5V4 -> 0x0536, InterruptedException | ExecutionException -> 0x0532 }
            if (r1 != 0) goto L_0x0531
            if (r21 == 0) goto L_0x0520
            r2 = 8043(0x1f6b, float:1.127E-41)
            r1 = r55
            boolean r1 = r1.A0E(r2)     // Catch:{ 5V4 -> 0x0536, InterruptedException | ExecutionException -> 0x0532 }
            if (r1 == 0) goto L_0x0520
            X.1AV r2 = r0.A0O     // Catch:{ 5V4 -> 0x0536, InterruptedException | ExecutionException -> 0x0532 }
            r1 = 0
            r0 = r58
            com.whatsapp.Mp4Ops.A03(r2, r0, r1)     // Catch:{ 5V4 -> 0x0536, InterruptedException | ExecutionException -> 0x0532 }
            goto L_0x0529
        L_0x0520:
            com.whatsapp.Mp4Ops r2 = r0.A0T     // Catch:{ 5V4 -> 0x0536, InterruptedException | ExecutionException -> 0x0532 }
            X.1AV r1 = r0.A0O     // Catch:{ 5V4 -> 0x0536, InterruptedException | ExecutionException -> 0x0532 }
            r0 = r58
            r2.A04(r1, r0)     // Catch:{ 5V4 -> 0x0536, InterruptedException | ExecutionException -> 0x0532 }
        L_0x0529:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch:{ 5V4 -> 0x0536, InterruptedException | ExecutionException -> 0x0532 }
            r0 = r56
            r0.A02 = r1     // Catch:{ 5V4 -> 0x0536, InterruptedException | ExecutionException -> 0x0532 }
        L_0x0531:
            return
        L_0x0532:
            r2 = move-exception
            java.lang.String r0 = "videotranscodequeue/videolite exception"
            goto L_0x0541
        L_0x0536:
            r2 = move-exception
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r22)
            r0 = r56
            r0.A02 = r1
            java.lang.String r0 = "videotranscodequeue/libmp4muxexception"
        L_0x0541:
            com.whatsapp.util.Log.e(r0, r2)
            throw r2
        L_0x0545:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r12] = r5
            java.lang.String r1 = "TranscodeUtil"
            java.lang.String r0 = "Exception in extractVideoMetadata for filePath: %s"
            X.AnonymousClass6YR.A0E(r1, r0, r3, r2)
        L_0x0551:
            java.lang.String r0 = "VideoliteHelper/getMediaTranscodeParams/VideoMetadataFetchException sourceVideoMetadata==null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.2hu r0 = new X.2hu
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146526vk.A08(android.graphics.RectF, X.6Kh, X.6VQ, java.io.File, java.io.File, java.io.File, int, int, boolean):void");
    }
}
