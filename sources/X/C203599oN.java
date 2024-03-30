package X;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.facebook.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.9oN  reason: invalid class name and case insensitive filesystem */
public final class C203599oN {
    public static final Pattern A00 = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap A01 = AnonymousClass001.A0J();

    public static void A05(String str) {
        String str2;
        try {
            A03(str, false);
            return;
        } catch (AnonymousClass5UT e) {
            e = e;
            str2 = "Codec warming failed";
        } catch (UnsatisfiedLinkError e2) {
            e = e2;
            str2 = "Codec warming failed with UnsatisfiedLinkError";
        }
        Log.e("MediaCodecUtil", str2, e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0190, code lost:
        if (r1.equals(r0) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0192, code lost:
        r6 = r11.A0N;
        r7 = "Ignoring malformed HEVC codec string: ";
        r1 = "MediaCodecUtil";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x019a, code lost:
        if (r5.length < 4) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x019c, code lost:
        r4 = 1;
        r2 = A00.matcher(r5[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01a9, code lost:
        if (r2.matches() == false) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ab, code lost:
        r3 = r2.group(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01b5, code lost:
        if ("1".equals(r3) != false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01bd, code lost:
        if ("2".equals(r3) == false) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01bf, code lost:
        if (r6 == null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01c1, code lost:
        r2 = r6.A03;
        r4 = com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01c6, code lost:
        if (r2 == 6) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01c8, code lost:
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01c9, code lost:
        r3 = r5[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01cc, code lost:
        if (r3 == null) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01d9, code lost:
        switch(r3.hashCode()) {
            case 70821: goto L_0x01e4;
            case 70914: goto L_0x01f2;
            case 70917: goto L_0x0200;
            case 71007: goto L_0x020c;
            case 71010: goto L_0x0218;
            case 74665: goto L_0x0224;
            case 74758: goto L_0x0232;
            case 74761: goto L_0x0240;
            case 74851: goto L_0x024e;
            case 74854: goto L_0x025a;
            case 2193639: goto L_0x0266;
            case 2193642: goto L_0x0272;
            case 2193732: goto L_0x027e;
            case 2193735: goto L_0x028b;
            case 2193738: goto L_0x0297;
            case 2193825: goto L_0x02a2;
            case 2193828: goto L_0x02ad;
            case 2193831: goto L_0x02b8;
            case 2312803: goto L_0x02c3;
            case 2312806: goto L_0x02ce;
            case 2312896: goto L_0x02d9;
            case 2312899: goto L_0x02e4;
            case 2312902: goto L_0x02ef;
            case 2312989: goto L_0x02fa;
            case 2312992: goto L_0x0305;
            case 2312995: goto L_0x0310;
            default: goto L_0x01dc;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01dc, code lost:
        r2 = X.AnonymousClass000.A0u();
        r0 = "Unknown HEVC level string: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01ea, code lost:
        if (r3.equals("H30") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01ec, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01f8, code lost:
        if (r3.equals("H60") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01fa, code lost:
        r2 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0206, code lost:
        if (r3.equals("H63") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0208, code lost:
        r0 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0212, code lost:
        if (r3.equals("H90") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0214, code lost:
        r0 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x021e, code lost:
        if (r3.equals("H93") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0220, code lost:
        r0 = 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x022a, code lost:
        if (r3.equals("L30") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x022c, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0238, code lost:
        if (r3.equals("L60") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x023a, code lost:
        r2 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0246, code lost:
        if (r3.equals("L63") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0248, code lost:
        r2 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0254, code lost:
        if (r3.equals("L90") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0256, code lost:
        r0 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0260, code lost:
        if (r3.equals("L93") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0262, code lost:
        r0 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x026c, code lost:
        if (r3.equals("H120") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x026e, code lost:
        r0 = androidx.core.view.inputmethod.EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0278, code lost:
        if (r3.equals("H123") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x027a, code lost:
        r0 = com.facebook.msys.mci.DefaultCrypto.BUFFER_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0284, code lost:
        if (r3.equals("H150") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0286, code lost:
        r0 = 32768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0291, code lost:
        if (r3.equals("H153") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0293, code lost:
        r0 = X.C132986Wc.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x029d, code lost:
        if (r3.equals("H156") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x029f, code lost:
        r0 = 524288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02a8, code lost:
        if (r3.equals("H180") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02aa, code lost:
        r0 = 2097152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02b3, code lost:
        if (r3.equals("H183") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02b5, code lost:
        r0 = 8388608;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02be, code lost:
        if (r3.equals("H186") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02c0, code lost:
        r0 = 33554432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02c9, code lost:
        if (r3.equals("L120") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02cb, code lost:
        r0 = androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02d4, code lost:
        if (r3.equals("L123") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02d6, code lost:
        r0 = com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02df, code lost:
        if (r3.equals("L150") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x02e1, code lost:
        r0 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02ea, code lost:
        if (r3.equals("L153") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02ec, code lost:
        r0 = 65536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x02f5, code lost:
        if (r3.equals("L156") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x02f7, code lost:
        r0 = 262144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0300, code lost:
        if (r3.equals("L180") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0302, code lost:
        r0 = 1048576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x030b, code lost:
        if (r3.equals("L183") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x030d, code lost:
        r0 = 4194304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0316, code lost:
        if (r3.equals("L186") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0318, code lost:
        r0 = androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x031a, code lost:
        r2 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x031e, code lost:
        if (r2 == null) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0328, code lost:
        return X.C36441kJ.A0Q(java.lang.Integer.valueOf(r4), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0329, code lost:
        r2 = X.AnonymousClass000.A0u();
        r0 = "Unknown HEVC profile string: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x04a0, code lost:
        if (r1.equals(r0) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x04a2, code lost:
        r9 = r5.length;
        r2 = "MediaCodecUtil";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x04a8, code lost:
        if (r9 >= 2) goto L_0x04b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x04aa, code lost:
        r1 = X.C36331k8.A0k("Ignoring malformed AVC codec string: ", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x04ae, code lost:
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:?, code lost:
        r4 = r5[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x04bc, code lost:
        if (r4.length() != 6) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x04be, code lost:
        r4 = java.lang.Integer.parseInt(X.C90514aH.A0z(r4, 2), 16);
        r3 = java.lang.Integer.parseInt(r5[1].substring(4), 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x04d5, code lost:
        if (r9 < 3) goto L_0x056c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x04d7, code lost:
        r4 = java.lang.Integer.parseInt(r4);
        r3 = X.C165617ti.A08(r5, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x04e1, code lost:
        if (r4 == 66) goto L_0x051b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x04e5, code lost:
        if (r4 == 77) goto L_0x0519;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x04e9, code lost:
        if (r4 == 88) goto L_0x0517;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x04ed, code lost:
        if (r4 == 100) goto L_0x0514;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x04f1, code lost:
        if (r4 == 110) goto L_0x0511;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x04f5, code lost:
        if (r4 == 122) goto L_0x050e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x04f7, code lost:
        r1 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x04fb, code lost:
        if (r4 == 244) goto L_0x04fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x04fd, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x04ff, code lost:
        if (r1 != -1) goto L_0x051d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0501, code lost:
        r1 = X.AnonymousClass000.A0u();
        r0 = "Unknown AVC profile: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0507, code lost:
        r1.append(r0);
        r1.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x050e, code lost:
        r1 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0511, code lost:
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0514, code lost:
        r1 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0517, code lost:
        r1 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0519, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x051b, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x051d, code lost:
        switch(r3) {
            case 10: goto L_0x0562;
            case 11: goto L_0x0564;
            case 12: goto L_0x0566;
            case 13: goto L_0x0569;
            default: goto L_0x0520;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0520, code lost:
        switch(r3) {
            case 20: goto L_0x0559;
            case 21: goto L_0x055c;
            case 22: goto L_0x055f;
            default: goto L_0x0523;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0523, code lost:
        switch(r3) {
            case 30: goto L_0x0550;
            case 31: goto L_0x0553;
            case 32: goto L_0x0556;
            default: goto L_0x0526;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0526, code lost:
        switch(r3) {
            case 40: goto L_0x0547;
            case 41: goto L_0x054a;
            case 42: goto L_0x054d;
            default: goto L_0x0529;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0529, code lost:
        switch(r3) {
            case 50: goto L_0x053d;
            case 51: goto L_0x0540;
            case 52: goto L_0x0544;
            default: goto L_0x052c;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x052c, code lost:
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x052d, code lost:
        if (r4 != -1) goto L_0x05ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x052f, code lost:
        r1 = X.AnonymousClass000.A0u();
        r0 = "Unknown AVC level: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0535, code lost:
        r1.append(r0);
        r1.append(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x053d, code lost:
        r4 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0540, code lost:
        r4 = 32768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0544, code lost:
        r4 = 65536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0547, code lost:
        r4 = androidx.core.view.inputmethod.EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x054a, code lost:
        r4 = com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x054d, code lost:
        r4 = com.facebook.msys.mci.DefaultCrypto.BUFFER_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0550, code lost:
        r4 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0553, code lost:
        r4 = 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0556, code lost:
        r4 = androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0559, code lost:
        r4 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x055c, code lost:
        r4 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x055f, code lost:
        r4 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0562, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0564, code lost:
        r4 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0566, code lost:
        r4 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0569, code lost:
        r4 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:?, code lost:
        android.util.Log.w(r2, X.C36321k7.A0D("Ignoring malformed AVC codec string: ", r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0575, code lost:
        r0 = X.AnonymousClass000.A0v("Ignoring malformed AVC codec string: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x05ed, code lost:
        r2 = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x05f6, code lost:
        r0 = java.lang.Integer.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x05fe, code lost:
        return X.C36441kJ.A0Q(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x05ff, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c2, code lost:
        r2 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c6, code lost:
        if (r2 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c8, code lost:
        r3 = r5[2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ca, code lost:
        if (r3 == null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d0, code lost:
        switch(r3.hashCode()) {
            case 1537: goto L_0x00db;
            case 1538: goto L_0x00e9;
            case 1539: goto L_0x00f7;
            case 1540: goto L_0x0104;
            case 1541: goto L_0x0111;
            case 1542: goto L_0x011c;
            case 1543: goto L_0x0127;
            case 1544: goto L_0x0132;
            case 1545: goto L_0x013d;
            case 1567: goto L_0x0148;
            case 1568: goto L_0x0153;
            case 1569: goto L_0x015e;
            case 1570: goto L_0x0169;
            default: goto L_0x00d3;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d3, code lost:
        r2 = X.AnonymousClass000.A0u();
        r0 = "Unknown Dolby Vision level string: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e1, code lost:
        if (r3.equals("01") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e3, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ef, code lost:
        if (r3.equals("02") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f1, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fd, code lost:
        if (r3.equals("03") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ff, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010a, code lost:
        if (r3.equals("04") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010c, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0117, code lost:
        if (r3.equals("05") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0119, code lost:
        r0 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0122, code lost:
        if (r3.equals("06") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0124, code lost:
        r0 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x012d, code lost:
        if (r3.equals("07") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x012f, code lost:
        r0 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0138, code lost:
        if (r3.equals("08") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x013a, code lost:
        r0 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0143, code lost:
        if (r3.equals("09") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0145, code lost:
        r0 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x014e, code lost:
        if (r3.equals("10") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0150, code lost:
        r0 = 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0159, code lost:
        if (r3.equals("11") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x015b, code lost:
        r0 = androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0164, code lost:
        if (r3.equals("12") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0166, code lost:
        r0 = androidx.core.view.inputmethod.EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016f, code lost:
        if (r3.equals("13") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0171, code lost:
        r0 = com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0173, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0177, code lost:
        if (r0 != null) goto L_0x05fa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A00(X.C207099uY r11) {
        /*
            java.lang.String r3 = r11.A0O
            r10 = 0
            if (r3 == 0) goto L_0x004c
            java.lang.String r0 = "\\."
            java.lang.String[] r5 = r3.split(r0)
            java.lang.String r1 = r11.A0S
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017b
            int r2 = r5.length
            java.lang.String r7 = "Ignoring malformed Dolby Vision codec string: "
            java.lang.String r1 = "MediaCodecUtil"
            r0 = 3
            if (r2 < r0) goto L_0x0331
            java.util.regex.Pattern r2 = A00
            r4 = 1
            r0 = r5[r4]
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r0 = r2.matches()
            if (r0 == 0) goto L_0x0331
            java.lang.String r3 = r2.group(r4)
            if (r3 == 0) goto L_0x003d
            int r0 = r3.hashCode()
            r8 = 8
            r7 = 4
            r6 = 2
            switch(r0) {
                case 1536: goto L_0x004d;
                case 1537: goto L_0x005a;
                case 1538: goto L_0x0067;
                case 1539: goto L_0x0074;
                case 1540: goto L_0x0081;
                case 1541: goto L_0x008c;
                case 1542: goto L_0x0097;
                case 1543: goto L_0x00a2;
                case 1544: goto L_0x00ad;
                case 1545: goto L_0x00b8;
                default: goto L_0x003d;
            }
        L_0x003d:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown Dolby Vision profile string: "
        L_0x0043:
            r2.append(r0)
        L_0x0046:
            r2.append(r3)
        L_0x0049:
            X.AnonymousClass000.A1A(r2, r1)
        L_0x004c:
            return r10
        L_0x004d:
            java.lang.String r0 = "00"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            goto L_0x00c6
        L_0x005a:
            java.lang.String r0 = "01"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            goto L_0x00c6
        L_0x0067:
            java.lang.String r0 = "02"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x00c6
        L_0x0074:
            java.lang.String r0 = "03"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x00c6
        L_0x0081:
            java.lang.String r0 = "04"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 16
            goto L_0x00c2
        L_0x008c:
            java.lang.String r0 = "05"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 32
            goto L_0x00c2
        L_0x0097:
            java.lang.String r0 = "06"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 64
            goto L_0x00c2
        L_0x00a2:
            java.lang.String r0 = "07"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x00c2
        L_0x00ad:
            java.lang.String r0 = "08"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x00c2
        L_0x00b8:
            java.lang.String r0 = "09"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 512(0x200, float:7.175E-43)
        L_0x00c2:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x00c6:
            if (r2 == 0) goto L_0x003d
            r3 = r5[r6]
            if (r3 == 0) goto L_0x00d3
            int r0 = r3.hashCode()
            switch(r0) {
                case 1537: goto L_0x00db;
                case 1538: goto L_0x00e9;
                case 1539: goto L_0x00f7;
                case 1540: goto L_0x0104;
                case 1541: goto L_0x0111;
                case 1542: goto L_0x011c;
                case 1543: goto L_0x0127;
                case 1544: goto L_0x0132;
                case 1545: goto L_0x013d;
                case 1567: goto L_0x0148;
                case 1568: goto L_0x0153;
                case 1569: goto L_0x015e;
                case 1570: goto L_0x0169;
                default: goto L_0x00d3;
            }
        L_0x00d3:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown Dolby Vision level string: "
            goto L_0x0043
        L_0x00db:
            java.lang.String r0 = "01"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x0177
        L_0x00e9:
            java.lang.String r0 = "02"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            goto L_0x0177
        L_0x00f7:
            java.lang.String r0 = "03"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            goto L_0x0177
        L_0x0104:
            java.lang.String r0 = "04"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            goto L_0x0177
        L_0x0111:
            java.lang.String r0 = "05"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            r0 = 16
            goto L_0x0173
        L_0x011c:
            java.lang.String r0 = "06"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            r0 = 32
            goto L_0x0173
        L_0x0127:
            java.lang.String r0 = "07"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            r0 = 64
            goto L_0x0173
        L_0x0132:
            java.lang.String r0 = "08"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x0173
        L_0x013d:
            java.lang.String r0 = "09"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x0173
        L_0x0148:
            java.lang.String r0 = "10"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x0173
        L_0x0153:
            java.lang.String r0 = "11"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x0173
        L_0x015e:
            java.lang.String r0 = "12"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x0173
        L_0x0169:
            java.lang.String r0 = "13"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            r0 = 4096(0x1000, float:5.74E-42)
        L_0x0173:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0177:
            if (r0 != 0) goto L_0x05fa
            goto L_0x00d3
        L_0x017b:
            java.lang.String r1 = X.C165617ti.A0a(r5)
            int r0 = r1.hashCode()
            switch(r0) {
                case 3004662: goto L_0x03db;
                case 3006243: goto L_0x0497;
                case 3006244: goto L_0x049a;
                case 3199032: goto L_0x0187;
                case 3214780: goto L_0x018a;
                case 3356560: goto L_0x057a;
                case 3624515: goto L_0x0337;
                default: goto L_0x0186;
            }
        L_0x0186:
            return r10
        L_0x0187:
            java.lang.String r0 = "hev1"
            goto L_0x018c
        L_0x018a:
            java.lang.String r0 = "hvc1"
        L_0x018c:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004c
            X.9tt r6 = r11.A0N
            int r2 = r5.length
            java.lang.String r7 = "Ignoring malformed HEVC codec string: "
            java.lang.String r1 = "MediaCodecUtil"
            r0 = 4
            if (r2 < r0) goto L_0x0331
            java.util.regex.Pattern r2 = A00
            r4 = 1
            r0 = r5[r4]
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r0 = r2.matches()
            if (r0 == 0) goto L_0x0331
            java.lang.String r3 = r2.group(r4)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x01c9
            java.lang.String r0 = "2"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0329
            if (r6 == 0) goto L_0x01c8
            int r2 = r6.A03
            r0 = 6
            r4 = 4096(0x1000, float:5.74E-42)
            if (r2 == r0) goto L_0x01c9
        L_0x01c8:
            r4 = 2
        L_0x01c9:
            r0 = 3
            r3 = r5[r0]
            if (r3 == 0) goto L_0x01dc
            int r0 = r3.hashCode()
            r8 = 16
            r7 = 8
            r6 = 4
            r5 = 2
            r2 = 1
            switch(r0) {
                case 70821: goto L_0x01e4;
                case 70914: goto L_0x01f2;
                case 70917: goto L_0x0200;
                case 71007: goto L_0x020c;
                case 71010: goto L_0x0218;
                case 74665: goto L_0x0224;
                case 74758: goto L_0x0232;
                case 74761: goto L_0x0240;
                case 74851: goto L_0x024e;
                case 74854: goto L_0x025a;
                case 2193639: goto L_0x0266;
                case 2193642: goto L_0x0272;
                case 2193732: goto L_0x027e;
                case 2193735: goto L_0x028b;
                case 2193738: goto L_0x0297;
                case 2193825: goto L_0x02a2;
                case 2193828: goto L_0x02ad;
                case 2193831: goto L_0x02b8;
                case 2312803: goto L_0x02c3;
                case 2312806: goto L_0x02ce;
                case 2312896: goto L_0x02d9;
                case 2312899: goto L_0x02e4;
                case 2312902: goto L_0x02ef;
                case 2312989: goto L_0x02fa;
                case 2312992: goto L_0x0305;
                case 2312995: goto L_0x0310;
                default: goto L_0x01dc;
            }
        L_0x01dc:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown HEVC level string: "
            goto L_0x0043
        L_0x01e4:
            java.lang.String r0 = "H30"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            goto L_0x031e
        L_0x01f2:
            java.lang.String r0 = "H60"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x031e
        L_0x0200:
            java.lang.String r0 = "H63"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 32
            goto L_0x031a
        L_0x020c:
            java.lang.String r0 = "H90"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x031a
        L_0x0218:
            java.lang.String r0 = "H93"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x031a
        L_0x0224:
            java.lang.String r0 = "L30"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x031e
        L_0x0232:
            java.lang.String r0 = "L60"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            goto L_0x031e
        L_0x0240:
            java.lang.String r0 = "L63"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x031e
        L_0x024e:
            java.lang.String r0 = "L90"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 64
            goto L_0x031a
        L_0x025a:
            java.lang.String r0 = "L93"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x031a
        L_0x0266:
            java.lang.String r0 = "H120"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x031a
        L_0x0272:
            java.lang.String r0 = "H123"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 8192(0x2000, float:1.14794E-41)
            goto L_0x031a
        L_0x027e:
            java.lang.String r0 = "H150"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L_0x031a
        L_0x028b:
            java.lang.String r0 = "H153"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L_0x031a
        L_0x0297:
            java.lang.String r0 = "H156"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 524288(0x80000, float:7.34684E-40)
            goto L_0x031a
        L_0x02a2:
            java.lang.String r0 = "H180"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x031a
        L_0x02ad:
            java.lang.String r0 = "H183"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x031a
        L_0x02b8:
            java.lang.String r0 = "H186"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x031a
        L_0x02c3:
            java.lang.String r0 = "L120"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x031a
        L_0x02ce:
            java.lang.String r0 = "L123"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x031a
        L_0x02d9:
            java.lang.String r0 = "L150"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x031a
        L_0x02e4:
            java.lang.String r0 = "L153"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 65536(0x10000, float:9.18355E-41)
            goto L_0x031a
        L_0x02ef:
            java.lang.String r0 = "L156"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 262144(0x40000, float:3.67342E-40)
            goto L_0x031a
        L_0x02fa:
            java.lang.String r0 = "L180"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x031a
        L_0x0305:
            java.lang.String r0 = "L183"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x031a
        L_0x0310:
            java.lang.String r0 = "L186"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r0 = 16777216(0x1000000, float:2.3509887E-38)
        L_0x031a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x031e:
            if (r2 == 0) goto L_0x01dc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            android.util.Pair r10 = X.C36441kJ.A0Q(r0, r2)
            return r10
        L_0x0329:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown HEVC profile string: "
            goto L_0x0043
        L_0x0331:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r7)
            goto L_0x0046
        L_0x0337:
            java.lang.String r0 = "vp09"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004c
            int r4 = r5.length
            java.lang.String r2 = "Ignoring malformed VP9 codec string: "
            java.lang.String r1 = "MediaCodecUtil"
            r0 = 3
            if (r4 >= r0) goto L_0x034d
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r2)
            goto L_0x0046
        L_0x034d:
            r0 = 1
            int r4 = X.C165617ti.A08(r5, r0)     // Catch:{ NumberFormatException -> 0x05dc }
            r0 = 2
            r0 = r5[r0]     // Catch:{ NumberFormatException -> 0x05dc }
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x05dc }
            r0 = 1
            r5 = 1
            if (r4 == 0) goto L_0x0368
            r5 = 2
            if (r4 == r0) goto L_0x0368
            if (r4 == r5) goto L_0x0379
            r0 = 3
            r5 = 8
            if (r4 == r0) goto L_0x0368
            r5 = -1
        L_0x0368:
            r2 = -1
            if (r5 != r2) goto L_0x037b
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown VP9 profile: "
            r2.append(r0)
            r2.append(r4)
            goto L_0x0049
        L_0x0379:
            r5 = 4
            goto L_0x0368
        L_0x037b:
            r0 = 10
            if (r3 == r0) goto L_0x03d9
            r0 = 11
            if (r3 == r0) goto L_0x03d7
            r0 = 20
            if (r3 == r0) goto L_0x03d5
            r0 = 21
            if (r3 == r0) goto L_0x03d2
            r0 = 30
            if (r3 == r0) goto L_0x03cf
            r0 = 31
            if (r3 == r0) goto L_0x03cc
            r0 = 40
            if (r3 == r0) goto L_0x03c9
            r0 = 41
            if (r3 == r0) goto L_0x03c6
            r0 = 50
            if (r3 == r0) goto L_0x03c3
            r0 = 51
            if (r3 == r0) goto L_0x03c0
            switch(r3) {
                case 60: goto L_0x03b7;
                case 61: goto L_0x03ba;
                case 62: goto L_0x03bd;
                default: goto L_0x03a6;
            }
        L_0x03a6:
            r4 = -1
        L_0x03a7:
            if (r4 != r2) goto L_0x05f2
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown VP9 level: "
            r2.append(r0)
            r2.append(r3)
            goto L_0x0049
        L_0x03b7:
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x03a7
        L_0x03ba:
            r4 = 4096(0x1000, float:5.74E-42)
            goto L_0x03a7
        L_0x03bd:
            r4 = 8192(0x2000, float:1.14794E-41)
            goto L_0x03a7
        L_0x03c0:
            r4 = 512(0x200, float:7.175E-43)
            goto L_0x03a7
        L_0x03c3:
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x03a7
        L_0x03c6:
            r4 = 128(0x80, float:1.794E-43)
            goto L_0x03a7
        L_0x03c9:
            r4 = 64
            goto L_0x03a7
        L_0x03cc:
            r4 = 32
            goto L_0x03a7
        L_0x03cf:
            r4 = 16
            goto L_0x03a7
        L_0x03d2:
            r4 = 8
            goto L_0x03a7
        L_0x03d5:
            r4 = 4
            goto L_0x03a7
        L_0x03d7:
            r4 = 2
            goto L_0x03a7
        L_0x03d9:
            r4 = 1
            goto L_0x03a7
        L_0x03db:
            java.lang.String r0 = "av01"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004c
            X.9tt r8 = r11.A0N
            int r1 = r5.length
            java.lang.String r9 = "Ignoring malformed AV1 codec string: "
            java.lang.String r2 = "MediaCodecUtil"
            r0 = 4
            if (r1 >= r0) goto L_0x03f3
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r9)
            goto L_0x058e
        L_0x03f3:
            r7 = 1
            int r6 = X.C165617ti.A08(r5, r7)     // Catch:{ NumberFormatException -> 0x0491 }
            r1 = 2
            r0 = r5[r1]     // Catch:{ NumberFormatException -> 0x0491 }
            java.lang.String r0 = X.C90514aH.A0z(r0, r1)     // Catch:{ NumberFormatException -> 0x0491 }
            int r4 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0491 }
            r0 = 3
            int r3 = X.C165617ti.A08(r5, r0)     // Catch:{ NumberFormatException -> 0x0491 }
            if (r6 == 0) goto L_0x0418
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown AV1 profile: "
            r1.append(r0)
            r1.append(r6)
            goto L_0x04ae
        L_0x0418:
            r1 = 8
            if (r3 == r1) goto L_0x0428
            r0 = 10
            if (r3 == r0) goto L_0x0428
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown AV1 bit depth: "
            goto L_0x0535
        L_0x0428:
            if (r3 == r1) goto L_0x043a
            if (r8 == 0) goto L_0x048f
            byte[] r0 = r8.A04
            if (r0 != 0) goto L_0x0438
            int r1 = r8.A03
            r0 = 7
            if (r1 == r0) goto L_0x0438
            r0 = 6
            if (r1 != r0) goto L_0x048f
        L_0x0438:
            r7 = 4096(0x1000, float:5.74E-42)
        L_0x043a:
            switch(r4) {
                case 0: goto L_0x0449;
                case 1: goto L_0x044b;
                case 2: goto L_0x044d;
                case 3: goto L_0x044f;
                case 4: goto L_0x0452;
                case 5: goto L_0x0455;
                case 6: goto L_0x0458;
                case 7: goto L_0x045b;
                case 8: goto L_0x045e;
                case 9: goto L_0x0461;
                case 10: goto L_0x0464;
                case 11: goto L_0x0467;
                case 12: goto L_0x046a;
                case 13: goto L_0x046d;
                case 14: goto L_0x0470;
                case 15: goto L_0x0473;
                case 16: goto L_0x0477;
                case 17: goto L_0x047a;
                case 18: goto L_0x047d;
                case 19: goto L_0x0480;
                case 20: goto L_0x0483;
                case 21: goto L_0x0486;
                case 22: goto L_0x0489;
                case 23: goto L_0x048c;
                default: goto L_0x043d;
            }
        L_0x043d:
            r1 = -1
        L_0x043e:
            r0 = -1
            if (r1 != r0) goto L_0x05e4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown AV1 level: "
            goto L_0x0507
        L_0x0449:
            r1 = 1
            goto L_0x043e
        L_0x044b:
            r1 = 2
            goto L_0x043e
        L_0x044d:
            r1 = 4
            goto L_0x043e
        L_0x044f:
            r1 = 8
            goto L_0x043e
        L_0x0452:
            r1 = 16
            goto L_0x043e
        L_0x0455:
            r1 = 32
            goto L_0x043e
        L_0x0458:
            r1 = 64
            goto L_0x043e
        L_0x045b:
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x043e
        L_0x045e:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x043e
        L_0x0461:
            r1 = 512(0x200, float:7.175E-43)
            goto L_0x043e
        L_0x0464:
            r1 = 1024(0x400, float:1.435E-42)
            goto L_0x043e
        L_0x0467:
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x043e
        L_0x046a:
            r1 = 4096(0x1000, float:5.74E-42)
            goto L_0x043e
        L_0x046d:
            r1 = 8192(0x2000, float:1.14794E-41)
            goto L_0x043e
        L_0x0470:
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x043e
        L_0x0473:
            r1 = 32768(0x8000, float:4.5918E-41)
            goto L_0x043e
        L_0x0477:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x043e
        L_0x047a:
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L_0x043e
        L_0x047d:
            r1 = 262144(0x40000, float:3.67342E-40)
            goto L_0x043e
        L_0x0480:
            r1 = 524288(0x80000, float:7.34684E-40)
            goto L_0x043e
        L_0x0483:
            r1 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x043e
        L_0x0486:
            r1 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x043e
        L_0x0489:
            r1 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x043e
        L_0x048c:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x043e
        L_0x048f:
            r7 = 2
            goto L_0x043a
        L_0x0491:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r9)
            goto L_0x058e
        L_0x0497:
            java.lang.String r0 = "avc1"
            goto L_0x049c
        L_0x049a:
            java.lang.String r0 = "avc2"
        L_0x049c:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004c
            int r9 = r5.length
            java.lang.String r8 = "Ignoring malformed AVC codec string: "
            r6 = 2
            java.lang.String r2 = "MediaCodecUtil"
            if (r9 >= r6) goto L_0x04b4
            java.lang.StringBuilder r1 = X.C36331k8.A0k(r8, r3)
        L_0x04ae:
            java.lang.String r0 = r1.toString()
            goto L_0x0592
        L_0x04b4:
            r7 = 1
            r4 = r5[r7]     // Catch:{ NumberFormatException -> 0x0575 }
            int r1 = r4.length()     // Catch:{ NumberFormatException -> 0x0575 }
            r0 = 6
            if (r1 != r0) goto L_0x04d4
            java.lang.String r0 = X.C90514aH.A0z(r4, r6)     // Catch:{ NumberFormatException -> 0x0575 }
            r6 = 16
            int r4 = java.lang.Integer.parseInt(r0, r6)     // Catch:{ NumberFormatException -> 0x0575 }
            r1 = r5[r7]     // Catch:{ NumberFormatException -> 0x0575 }
            r0 = 4
            java.lang.String r0 = r1.substring(r0)     // Catch:{ NumberFormatException -> 0x0575 }
            int r3 = java.lang.Integer.parseInt(r0, r6)     // Catch:{ NumberFormatException -> 0x0575 }
            goto L_0x04df
        L_0x04d4:
            r0 = 3
            if (r9 < r0) goto L_0x056c
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0575 }
            int r3 = X.C165617ti.A08(r5, r6)     // Catch:{ NumberFormatException -> 0x0575 }
        L_0x04df:
            r0 = 66
            if (r4 == r0) goto L_0x051b
            r0 = 77
            if (r4 == r0) goto L_0x0519
            r0 = 88
            if (r4 == r0) goto L_0x0517
            r0 = 100
            if (r4 == r0) goto L_0x0514
            r0 = 110(0x6e, float:1.54E-43)
            if (r4 == r0) goto L_0x0511
            r0 = 122(0x7a, float:1.71E-43)
            if (r4 == r0) goto L_0x050e
            r0 = 244(0xf4, float:3.42E-43)
            r1 = 64
            if (r4 == r0) goto L_0x04fe
            r1 = -1
        L_0x04fe:
            r0 = -1
            if (r1 != r0) goto L_0x051d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown AVC profile: "
        L_0x0507:
            r1.append(r0)
            r1.append(r4)
            goto L_0x04ae
        L_0x050e:
            r1 = 32
            goto L_0x04fe
        L_0x0511:
            r1 = 16
            goto L_0x04fe
        L_0x0514:
            r1 = 8
            goto L_0x04fe
        L_0x0517:
            r1 = 4
            goto L_0x04fe
        L_0x0519:
            r1 = 2
            goto L_0x04fe
        L_0x051b:
            r1 = 1
            goto L_0x04fe
        L_0x051d:
            switch(r3) {
                case 10: goto L_0x0562;
                case 11: goto L_0x0564;
                case 12: goto L_0x0566;
                case 13: goto L_0x0569;
                default: goto L_0x0520;
            }
        L_0x0520:
            switch(r3) {
                case 20: goto L_0x0559;
                case 21: goto L_0x055c;
                case 22: goto L_0x055f;
                default: goto L_0x0523;
            }
        L_0x0523:
            switch(r3) {
                case 30: goto L_0x0550;
                case 31: goto L_0x0553;
                case 32: goto L_0x0556;
                default: goto L_0x0526;
            }
        L_0x0526:
            switch(r3) {
                case 40: goto L_0x0547;
                case 41: goto L_0x054a;
                case 42: goto L_0x054d;
                default: goto L_0x0529;
            }
        L_0x0529:
            switch(r3) {
                case 50: goto L_0x053d;
                case 51: goto L_0x0540;
                case 52: goto L_0x0544;
                default: goto L_0x052c;
            }
        L_0x052c:
            r4 = -1
        L_0x052d:
            if (r4 != r0) goto L_0x05ed
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown AVC level: "
        L_0x0535:
            r1.append(r0)
            r1.append(r3)
            goto L_0x04ae
        L_0x053d:
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x052d
        L_0x0540:
            r4 = 32768(0x8000, float:4.5918E-41)
            goto L_0x052d
        L_0x0544:
            r4 = 65536(0x10000, float:9.18355E-41)
            goto L_0x052d
        L_0x0547:
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x052d
        L_0x054a:
            r4 = 4096(0x1000, float:5.74E-42)
            goto L_0x052d
        L_0x054d:
            r4 = 8192(0x2000, float:1.14794E-41)
            goto L_0x052d
        L_0x0550:
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x052d
        L_0x0553:
            r4 = 512(0x200, float:7.175E-43)
            goto L_0x052d
        L_0x0556:
            r4 = 1024(0x400, float:1.435E-42)
            goto L_0x052d
        L_0x0559:
            r4 = 32
            goto L_0x052d
        L_0x055c:
            r4 = 64
            goto L_0x052d
        L_0x055f:
            r4 = 128(0x80, float:1.794E-43)
            goto L_0x052d
        L_0x0562:
            r4 = 1
            goto L_0x052d
        L_0x0564:
            r4 = 4
            goto L_0x052d
        L_0x0566:
            r4 = 8
            goto L_0x052d
        L_0x0569:
            r4 = 16
            goto L_0x052d
        L_0x056c:
            java.lang.String r0 = X.C36321k7.A0D(r8, r3)     // Catch:{ NumberFormatException -> 0x0575 }
            android.util.Log.w(r2, r0)     // Catch:{ NumberFormatException -> 0x0575 }
            goto L_0x05ff
        L_0x0575:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r8)
            goto L_0x058e
        L_0x057a:
            java.lang.String r0 = "mp4a"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004c
            int r1 = r5.length
            java.lang.String r4 = "Ignoring malformed MP4A codec string: "
            java.lang.String r2 = "MediaCodecUtil"
            r0 = 3
            if (r1 == r0) goto L_0x0596
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r4)
        L_0x058e:
            java.lang.String r0 = X.AnonymousClass000.A0q(r3, r0)
        L_0x0592:
            android.util.Log.w(r2, r0)
            return r10
        L_0x0596:
            r0 = 1
            r1 = r5[r0]     // Catch:{ NumberFormatException -> 0x060a }
            r0 = 16
            int r0 = java.lang.Integer.parseInt(r1, r0)     // Catch:{ NumberFormatException -> 0x060a }
            java.lang.String r1 = X.C203249nb.A03(r0)     // Catch:{ NumberFormatException -> 0x060a }
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r1)     // Catch:{ NumberFormatException -> 0x060a }
            if (r0 == 0) goto L_0x004c
            r0 = 2
            int r0 = X.C165617ti.A08(r5, r0)     // Catch:{ NumberFormatException -> 0x060a }
            r1 = 17
            if (r0 == r1) goto L_0x05cc
            r1 = 20
            if (r0 == r1) goto L_0x05cc
            r1 = 23
            if (r0 == r1) goto L_0x05cc
            r1 = 29
            if (r0 == r1) goto L_0x05cc
            r1 = 39
            if (r0 == r1) goto L_0x05cc
            r1 = 42
            if (r0 == r1) goto L_0x05cc
            switch(r0) {
                case 1: goto L_0x05d0;
                case 2: goto L_0x05d2;
                case 3: goto L_0x05d4;
                case 4: goto L_0x05d6;
                case 5: goto L_0x05d8;
                case 6: goto L_0x05da;
                default: goto L_0x05cb;
            }     // Catch:{ NumberFormatException -> 0x060a }
        L_0x05cb:
            r1 = -1
        L_0x05cc:
            r0 = -1
            if (r1 == r0) goto L_0x004c
            goto L_0x0600
        L_0x05d0:
            r1 = 1
            goto L_0x05cc
        L_0x05d2:
            r1 = 2
            goto L_0x05cc
        L_0x05d4:
            r1 = 3
            goto L_0x05cc
        L_0x05d6:
            r1 = 4
            goto L_0x05cc
        L_0x05d8:
            r1 = 5
            goto L_0x05cc
        L_0x05da:
            r1 = 6
            goto L_0x05cc
        L_0x05dc:
            java.lang.String r0 = X.C36321k7.A0D(r2, r3)
            android.util.Log.w(r1, r0)
            return r10
        L_0x05e4:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x05fa
        L_0x05ed:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            goto L_0x05f6
        L_0x05f2:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
        L_0x05f6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
        L_0x05fa:
            android.util.Pair r10 = X.C36441kJ.A0Q(r2, r0)
            return r10
        L_0x05ff:
            return r10
        L_0x0600:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x060a }
            r0 = 0
            android.util.Pair r10 = X.C36341k9.A0I(r1, r0)     // Catch:{ NumberFormatException -> 0x060a }
            return r10
        L_0x060a:
            java.lang.String r0 = X.C36321k7.A0D(r4, r3)
            android.util.Log.w(r2, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203599oN.A00(X.9uY):android.util.Pair");
    }

    public static String A01(C207099uY r2) {
        Pair A002;
        String str = r2.A0S;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(str) || (A002 = A00(r2)) == null) {
            return null;
        }
        int A04 = C36381kD.A04(A002);
        if (A04 == 16 || A04 == 256) {
            return "video/hevc";
        }
        if (A04 == 512) {
            return "video/avc";
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b1, code lost:
        if ("OMX.MTK.AUDIO.DECODER.DSPAC3".equals(r3) != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (A06(r13) == false) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x014c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b8 A[Catch:{ Exception -> 0x01a8, Exception -> 0x01e9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A02(X.C195259Tj r21, X.C23070B2z r22) {
        /*
            java.lang.String r9 = "secure-playback"
            java.lang.String r8 = "tunneled-playback"
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ Exception -> 0x01e9 }
            r15 = r21
            java.lang.String r6 = r15.A00     // Catch:{ Exception -> 0x01e9 }
            r10 = r22
            int r14 = r10.B9p()     // Catch:{ Exception -> 0x01e9 }
            boolean r16 = r10.BpX()     // Catch:{ Exception -> 0x01e9 }
            r5 = 0
        L_0x0017:
            if (r5 >= r14) goto L_0x01e8
            android.media.MediaCodecInfo r13 = r10.B9q(r5)     // Catch:{ Exception -> 0x01e9 }
            int r4 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ Exception -> 0x01e9 }
            r0 = 29
            if (r4 < r0) goto L_0x002a
            boolean r1 = A06(r13)     // Catch:{ Exception -> 0x01e9 }
            r0 = 1
            if (r1 != 0) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            if (r0 != 0) goto L_0x014c
            java.lang.String r3 = r13.getName()     // Catch:{ Exception -> 0x01e9 }
            boolean r0 = r13.isEncoder()     // Catch:{ Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x00b3
            if (r16 != 0) goto L_0x0042
            java.lang.String r0 = ".secure"
            boolean r0 = r3.endsWith(r0)     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x0042
            goto L_0x00b3
        L_0x0042:
            r0 = 24
            java.lang.String r1 = "samsung"
            if (r4 >= r0) goto L_0x00b5
            java.lang.String r0 = "OMX.SEC.aac.dec"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = "OMX.Exynos.AAC.Decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x00a3
        L_0x0058:
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A03     // Catch:{ Exception -> 0x01e9 }
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x00a3
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A01     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r0 = "zeroflte"
            boolean r0 = r1.startsWith(r0)     // Catch:{ Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "zerolte"
            boolean r0 = r1.startsWith(r0)     // Catch:{ Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "zenlte"
            boolean r0 = r1.startsWith(r0)     // Catch:{ Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "SC-05G"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "marinelteatt"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "404SC"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "SC-04G"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "SCV31"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x00a3
            goto L_0x00b3
        L_0x00a3:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r0 = r0.equals(r6)     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x00b5
        L_0x00b3:
            r0 = 0
            goto L_0x00b6
        L_0x00b5:
            r0 = 1
        L_0x00b6:
            if (r0 == 0) goto L_0x014c
            java.lang.String[] r12 = r13.getSupportedTypes()     // Catch:{ Exception -> 0x01e9 }
            int r11 = r12.length     // Catch:{ Exception -> 0x01e9 }
            r1 = 0
        L_0x00be:
            if (r1 >= r11) goto L_0x00cb
            r2 = r12[r1]     // Catch:{ Exception -> 0x01e9 }
            boolean r0 = r2.equalsIgnoreCase(r6)     // Catch:{ Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x012b
            int r1 = r1 + 1
            goto L_0x00be
        L_0x00cb:
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x00f1
            java.lang.String r0 = "OMX.MS.HEVCDV.Decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x00de
            java.lang.String r2 = "video/hevcdv"
            goto L_0x012b
        L_0x00de:
            java.lang.String r0 = "OMX.RTK.video.decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x00ee
            java.lang.String r0 = "OMX.realtek.video.decoder.tunneled"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x012a
        L_0x00ee:
            java.lang.String r2 = "video/dv_hevc"
            goto L_0x012b
        L_0x00f1:
            java.lang.String r0 = "audio/alac"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "OMX.lge.alac.decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x0104
            java.lang.String r2 = "audio/x-lg-alac"
            goto L_0x012b
        L_0x0104:
            java.lang.String r0 = "audio/flac"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x0117
            java.lang.String r0 = "OMX.lge.flac.decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x0117
            java.lang.String r2 = "audio/x-lg-flac"
            goto L_0x012b
        L_0x0117:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x012a
            java.lang.String r0 = "OMX.lge.ac3.decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x012a
            java.lang.String r2 = "audio/lg-ac3"
            goto L_0x012b
        L_0x012a:
            r2 = 0
        L_0x012b:
            if (r2 == 0) goto L_0x014c
            android.media.MediaCodecInfo$CodecCapabilities r1 = r13.getCapabilitiesForType(r2)     // Catch:{ Exception -> 0x01a8 }
            r10.BLn(r1, r8, r2)     // Catch:{ Exception -> 0x01a8 }
            boolean r0 = r10.BLm(r1, r8, r2)     // Catch:{ Exception -> 0x01a8 }
            if (r0 != 0) goto L_0x014c
            boolean r12 = r10.BLn(r1, r9, r2)     // Catch:{ Exception -> 0x01a8 }
            boolean r0 = r10.BLm(r1, r9, r2)     // Catch:{ Exception -> 0x01a8 }
            boolean r11 = r15.A01     // Catch:{ Exception -> 0x01a8 }
            if (r11 != 0) goto L_0x0148
            if (r0 != 0) goto L_0x014c
        L_0x0148:
            if (r11 == 0) goto L_0x0150
            if (r12 != 0) goto L_0x0150
        L_0x014c:
            int r5 = r5 + 1
            goto L_0x0017
        L_0x0150:
            r0 = 29
            if (r4 < r0) goto L_0x0155
            goto L_0x015c
        L_0x0155:
            boolean r0 = A09(r13, r6)     // Catch:{ Exception -> 0x01a8 }
            r20 = r0 ^ 1
            goto L_0x0160
        L_0x015c:
            boolean r20 = A07(r13)     // Catch:{ Exception -> 0x01a8 }
        L_0x0160:
            boolean r21 = A09(r13, r6)     // Catch:{ Exception -> 0x01a8 }
            r0 = 29
            if (r4 < r0) goto L_0x016c
            A04(r13)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x0173
        L_0x016c:
            java.lang.String r0 = r13.getName()     // Catch:{ Exception -> 0x01a8 }
            X.C1897495k.A00(r0)     // Catch:{ Exception -> 0x01a8 }
        L_0x0173:
            if (r16 == 0) goto L_0x0177
            if (r11 == r12) goto L_0x0198
        L_0x0177:
            if (r16 != 0) goto L_0x017c
            if (r11 != 0) goto L_0x017c
            goto L_0x0198
        L_0x017c:
            if (r16 != 0) goto L_0x014c
            if (r12 == 0) goto L_0x014c
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0v(r3)     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r0 = ".secure"
            java.lang.String r18 = X.AnonymousClass000.A0q(r0, r11)     // Catch:{ Exception -> 0x01a8 }
            r22 = 1
            r17 = r1
            r19 = r6
            X.9l7 r0 = X.C202149l7.A00(r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x01a8 }
            r7.add(r0)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x01cb
        L_0x0198:
            r22 = 0
            r17 = r1
            r18 = r3
            r19 = r6
            X.9l7 r0 = X.C202149l7.A00(r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x01a8 }
            r7.add(r0)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x014c
        L_0x01a8:
            r12 = move-exception
            r0 = 23
            java.lang.String r11 = "MediaCodecUtil"
            if (r4 > r0) goto L_0x01cc
            boolean r0 = r7.isEmpty()     // Catch:{ Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x01cc
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r0 = "Skipping codec "
            r1.append(r0)     // Catch:{ Exception -> 0x01e9 }
            r1.append(r3)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r0 = " (failed to query capabilities)"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ Exception -> 0x01e9 }
            android.util.Log.e(r11, r0)     // Catch:{ Exception -> 0x01e9 }
            goto L_0x014c
        L_0x01cb:
            return r7
        L_0x01cc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r0 = "Failed to query codec "
            r1.append(r0)     // Catch:{ Exception -> 0x01e9 }
            r1.append(r3)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r0 = " ("
            r1.append(r0)     // Catch:{ Exception -> 0x01e9 }
            r1.append(r2)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r0 = X.C90474aD.A0f(r1)     // Catch:{ Exception -> 0x01e9 }
            android.util.Log.e(r11, r0)     // Catch:{ Exception -> 0x01e9 }
            throw r12     // Catch:{ Exception -> 0x01e9 }
        L_0x01e8:
            return r7
        L_0x01e9:
            r1 = move-exception
            X.5UT r0 = new X.5UT
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203599oN.A02(X.9Tj, X.B2z):java.util.ArrayList");
    }

    public static synchronized List A03(String str, boolean z) {
        List list;
        synchronized (C203599oN.class) {
            C195259Tj r4 = new C195259Tj(str, z);
            HashMap hashMap = A01;
            list = (List) hashMap.get(r4);
            if (list == null) {
                int i = Util.A00;
                ArrayList A02 = A02(r4, new C139156jK(z));
                if (z && A02.isEmpty() && i <= 23) {
                    A02 = A02(r4, new C139146jJ());
                    if (!A02.isEmpty()) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("MediaCodecList API didn't list secure decoder for: ");
                        A0u.append(str);
                        A0u.append(". Assuming: ");
                        A0u.append(((C202149l7) C36441kJ.A12(A02)).A02);
                        AnonymousClass000.A1A(A0u, "MediaCodecUtil");
                    }
                }
                if ("audio/raw".equals(str)) {
                    if (i < 26 && Util.A01.equals("R9") && A02.size() == 1 && ((C202149l7) A02.get(0)).A02.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        A02.add(C202149l7.A00((MediaCodecInfo.CodecCapabilities) null, "OMX.google.raw.decoder", "audio/raw", false, true, false));
                    }
                    Collections.sort(A02, new C23176B8k(C198379dS.A00, 1));
                }
                if (i < 32 && A02.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((C202149l7) A02.get(0)).A02)) {
                    A02.add(A02.remove(0));
                }
                list = C23931Ak.copyOf((Collection) A02);
                hashMap.put(r4, list);
            }
        }
        return list;
    }

    public static boolean A09(MediaCodecInfo mediaCodecInfo, String str) {
        if (Util.A00 >= 29) {
            return A08(mediaCodecInfo);
        }
        if (!"audio".equals(C203249nb.A05(str))) {
            String A002 = C1897495k.A00(mediaCodecInfo.getName());
            if (A002.startsWith("arc.")) {
                return false;
            }
            if (A002.startsWith("omx.google.") || A002.startsWith("omx.ffmpeg.") || ((A002.startsWith("omx.sec.") && A002.contains(".sw.")) || A002.equals("omx.qcom.video.decoder.hevcswvdec") || A002.startsWith("c2.android.") || A002.startsWith("c2.google.") || (!A002.startsWith("omx.") && !A002.startsWith("c2.")))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean A06(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static boolean A07(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean A08(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static void A04(MediaCodecInfo mediaCodecInfo) {
        mediaCodecInfo.isVendor();
    }
}
