package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.9Z1  reason: invalid class name */
public abstract class AnonymousClass9Z1 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: X.9zo[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0345, code lost:
        if ("main".equals(r2) == false) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03ff, code lost:
        if (r0.contains("hvq_mobile_landscape") == false) goto L_0x0401;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0403, code lost:
        if (r0 != null) goto L_0x0405;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0405, code lost:
        r92 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x040d, code lost:
        if (r0.contains("hvq_mobile_portrait") != false) goto L_0x0413;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x040f, code lost:
        r92 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0411, code lost:
        if (r0 == null) goto L_0x041d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0413, code lost:
        r91 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x041b, code lost:
        if (r0.contains("avoid_on_cellular") != false) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x041d, code lost:
        r91 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x041f, code lost:
        if (r0 == null) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0421, code lost:
        r90 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0429, code lost:
        if (r0.contains("avoid_on_cellular_intentional") != false) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x042b, code lost:
        r90 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x042d, code lost:
        if (r0 == null) goto L_0x0439;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x042f, code lost:
        r89 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0437, code lost:
        if (r0.contains("avoid_on_cell_datasaver") != false) goto L_0x043d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0439, code lost:
        r89 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x043b, code lost:
        if (r0 == null) goto L_0x0447;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x043d, code lost:
        r88 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0445, code lost:
        if (r0.contains("avoid_on_cell_datasaver_intentional") != false) goto L_0x044b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0447, code lost:
        r88 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0449, code lost:
        if (r0 == null) goto L_0x0455;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x044b, code lost:
        r86 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0453, code lost:
        if (r0.contains("avoid_on_abr") != false) goto L_0x0459;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0455, code lost:
        r86 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0457, code lost:
        if (r0 == null) goto L_0x0463;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0459, code lost:
        r85 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0461, code lost:
        if (r0.contains("avoid_on_abr_intentional") != false) goto L_0x0465;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0463, code lost:
        r85 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0465, code lost:
        r107 = null;
        r0 = r4.getAttributeValue((java.lang.String) null, "FBPlaybackResolutionMos");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x046d, code lost:
        if (r0 == null) goto L_0x0471;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x046f, code lost:
        r107 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0471, code lost:
        r106 = null;
        r0 = r4.getAttributeValue((java.lang.String) null, "FBPlaybackResolutionMosConfidenceLevel");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0479, code lost:
        if (r0 == null) goto L_0x047d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x047b, code lost:
        r106 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x047d, code lost:
        r105 = null;
        r0 = r4.getAttributeValue((java.lang.String) null, "FBPlaybackResolutionCsvqm");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0485, code lost:
        if (r0 == null) goto L_0x0489;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0487, code lost:
        r105 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0489, code lost:
        r101 = null;
        r0 = r4.getAttributeValue((java.lang.String) null, "FBEncodingTag");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0491, code lost:
        if (r0 == null) goto L_0x0495;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0493, code lost:
        r101 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x049b, code lost:
        r84 = X.AnonymousClass000.A1S(X.C22736Av0.A01("FBUltraLowLatencyEncoding", r4, 0), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04a1, code lost:
        if (r13 != false) goto L_0x04ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:?, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04ab, code lost:
        if (X.C22736Av0.A01("FBDefaultQuality", r4, 0) == 0) goto L_0x04ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04ad, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04ae, code lost:
        r81 = X.AnonymousClass001.A0I();
        r80 = X.AnonymousClass001.A0I();
        r13 = X.AnonymousClass001.A0I();
        r136 = null;
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04bd, code lost:
        r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04c6, code lost:
        if (X.C196299Yr.A01("BaseURL", r4) == false) goto L_0x04cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04c8, code lost:
        if (r2 != false) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04d0, code lost:
        if (X.C196299Yr.A01("AudioChannelConfiguration", r4) == false) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04d2, code lost:
        r98 = X.C22736Av0.A02(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04de, code lost:
        if (X.C196299Yr.A01("SegmentBase", r4) == false) goto L_0x04e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04e0, code lost:
        r9 = r11.A0H((X.AnonymousClass834) r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04ee, code lost:
        if (X.C196299Yr.A01("SegmentList", r4) == false) goto L_0x04f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04f0, code lost:
        r9 = r11.A0E((X.AnonymousClass831) r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04fd, code lost:
        if (X.C196299Yr.A01("SegmentTemplate", r4) == false) goto L_0x0508;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04ff, code lost:
        r9 = r11.A0F((X.AnonymousClass832) r9, r4, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x050c, code lost:
        if (X.C196299Yr.A01("ContentProtection", r4) == false) goto L_0x0524;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x050e, code lost:
        r1 = X.C22736Av0.A06(r4);
        r0 = r1.first;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0514, code lost:
        if (r0 == null) goto L_0x051a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0516, code lost:
        r136 = (java.lang.String) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x051a, code lost:
        r1 = r1.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x051c, code lost:
        if (r1 == null) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x051e, code lost:
        r81.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x052a, code lost:
        if (X.C196299Yr.A01("InbandEventStream", r4) == false) goto L_0x0536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x052c, code lost:
        r80.add(X.C22736Av0.A07("InbandEventStream", r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x053a, code lost:
        if (X.C196299Yr.A01("SupplementalProperty", r4) == false) goto L_0x0544;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x053c, code lost:
        r13.add(X.C22736Av0.A07("SupplementalProperty", r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x054a, code lost:
        if (X.C196299Yr.A01("FBInitializationBinary", r4) == false) goto L_0x0550;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x054c, code lost:
        r4.nextText();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0556, code lost:
        if (X.C196299Yr.A01("FBSegmentIndexBinary", r4) == false) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0558, code lost:
        r4.nextText();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x055c, code lost:
        r4.next();
        r72 = X.C131676Qa.A00(r72, r4.getText());
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x056e, code lost:
        if (X.C196299Yr.A00("Representation", r4) == false) goto L_0x04bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0573, code lost:
        r79 = X.AnonymousClass000.A1R(r81.size());
        r2 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0583, code lost:
        if ("audio".equals(X.C203249nb.A05(r12)) == false) goto L_0x05b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0585, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0586, code lost:
        if (r8 == null) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x058c, code lost:
        if (android.text.TextUtils.isEmpty(r8) == false) goto L_0x0594;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x058e, code lost:
        r1 = new java.lang.String[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0591, code lost:
        r6 = r1.length;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0594, code lost:
        r1 = r8.trim().split("(\\s*,\\s*)", -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05a0, code lost:
        if (r0 >= r6) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05a2, code lost:
        r78 = X.C203249nb.A04(r1[r0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05a8, code lost:
        if (r78 == null) goto L_0x05b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x05b2, code lost:
        if ("audio".equals(X.C203249nb.A05(r78)) == false) goto L_0x05b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x05b5, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05c2, code lost:
        if ("video".equals(X.C203249nb.A05(r12)) == false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05c4, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05c5, code lost:
        if (r8 == null) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x05cb, code lost:
        if (android.text.TextUtils.isEmpty(r8) == false) goto L_0x05d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05cd, code lost:
        r1 = new java.lang.String[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x05d0, code lost:
        r7 = r1.length;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x05d3, code lost:
        r1 = r8.trim().split("(\\s*,\\s*)", -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x05df, code lost:
        if (r0 >= r7) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x05e1, code lost:
        r78 = X.C203249nb.A04(r1[r0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05e7, code lost:
        if (r78 == null) goto L_0x05f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x05f1, code lost:
        if ("video".equals(X.C203249nb.A05(r78)) == false) goto L_0x05f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x05f4, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x05f7, code lost:
        r2 = r78;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x05fe, code lost:
        if (X.C22736Av0.A0B(r12) == false) goto L_0x0603;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0600, code lost:
        if (r12 == null) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0603, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x060a, code lost:
        if ("application/mp4".equals(r12) == false) goto L_0x062a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0612, code lost:
        if ("stpp".equals(r8) == false) goto L_0x061f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0614, code lost:
        r2 = "application/ttml+xml";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x061c, code lost:
        if ("audio/eac3".equals(r2) == false) goto L_0x0687;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0625, code lost:
        if ("wvtt".equals(r8) == false) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0627, code lost:
        r2 = "application/x-mp4-vtt";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0630, code lost:
        if ("application/x-rawcc".equals(r12) == false) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0632, code lost:
        if (r8 == null) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x063a, code lost:
        if (r8.contains("cea708") == false) goto L_0x063f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x063c, code lost:
        r2 = "application/cea-708";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0645, code lost:
        if (r8.contains("eia608") != false) goto L_0x064f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x064d, code lost:
        if (r8.contains("cea608") == false) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x064f, code lost:
        r2 = "application/cea-608";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0652, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0654, code lost:
        r2 = A00(r83, r12, r2, r8, r82);
        r2.A0F = r29;
        r2.A0Q = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0669, code lost:
        if (r1 >= r13.size()) goto L_0x0742;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x066b, code lost:
        r0 = (X.AnonymousClass9U3) r13.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0679, code lost:
        if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(r0.A01) == false) goto L_0x073e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0683, code lost:
        if ("ec+3".equals(r0.A02) == false) goto L_0x073e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0685, code lost:
        r2 = "audio/eac3-joc";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0691, code lost:
        if ("video".equals(X.C203249nb.A05(r2)) == false) goto L_0x070a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0693, code lost:
        r2 = A00(r83, r12, r2, r8, r82);
        r2.A0H = r99;
        r2.A08 = r97;
        r2.A00 = r96;
        r2.A0S = null;
        r2.A0F = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x06ad, code lost:
        r1 = new X.C194119Oe();
        r1.A05 = r116;
        r1.A0F = r94;
        r1.A0G = r92;
        r1.A0C = r91;
        r1.A0B = r90;
        r1.A0A = r89;
        r1.A09 = r88;
        r1.A08 = r86;
        r1.A07 = r85;
        r1.A0H = r79;
        r1.A03 = r107;
        r1.A04 = r106;
        r1.A02 = r105;
        r1.A06 = r125;
        r1.A01 = r101;
        r1.A0E = r15;
        r1.A00 = r87;
        r1.A0D = r93;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x06f8, code lost:
        r1.A0I = r84;
        r2.A0J = new X.C206379tI(r1);
        r0 = new X.C207099uY(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0712, code lost:
        if ("audio".equals(X.C203249nb.A05(r2)) == false) goto L_0x0745;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0714, code lost:
        r2 = A00(r83, r12, r2, r8, r82);
        r2.A04 = r98;
        r2.A0E = r95;
        r2.A0S = null;
        r2.A0F = r29;
        r2.A0Q = r30;
        r1 = new X.C194119Oe();
        r1.A01 = r101;
        r1.A0E = r15;
        r1.A00 = r87;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x073e, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0742, code lost:
        r2 = "audio/eac3";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0749, code lost:
        if (X.C22736Av0.A0B(r2) == false) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0751, code lost:
        if ("application/cea-608".equals(r2) == false) goto L_0x0795;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0753, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0758, code lost:
        if (r1 >= r56.size()) goto L_0x07df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x075a, code lost:
        r0 = (X.AnonymousClass9U3) r56.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x076a, code lost:
        if ("urn:scte:dash:cc:cea-608:2015".equals(r0.A01) == false) goto L_0x0792;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x076e, code lost:
        if (r0.A02 == null) goto L_0x0792;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0770, code lost:
        r3 = X.C22736Av0.A06.matcher(r0.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x077c, code lost:
        if (r3.matches() != false) goto L_0x07e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x077e, code lost:
        r3 = X.AnonymousClass000.A0u();
        r3.append("Unable to parse CEA-608 channel number from: ");
        android.util.Log.w("MpdParser", X.AnonymousClass000.A0q(r0.A02, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0792, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x079b, code lost:
        if ("application/cea-708".equals(r2) == false) goto L_0x07df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x079d, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x07a2, code lost:
        if (r1 >= r56.size()) goto L_0x07df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x07a4, code lost:
        r0 = (X.AnonymousClass9U3) r56.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x07b4, code lost:
        if ("urn:scte:dash:cc:cea-708:2015".equals(r0.A01) == false) goto L_0x07dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x07b8, code lost:
        if (r0.A02 == null) goto L_0x07dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x07ba, code lost:
        r3 = X.C22736Av0.A07.matcher(r0.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x07c6, code lost:
        if (r3.matches() != false) goto L_0x07e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x07c8, code lost:
        r3 = X.AnonymousClass000.A0u();
        r3.append("Unable to parse CEA-708 service block number from: ");
        android.util.Log.w("MpdParser", X.AnonymousClass000.A0q(r0.A02, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x07dc, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x07df, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x07e1, code lost:
        r3 = X.C165607th.A0A(r3, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x07e6, code lost:
        r1 = A00(r83, r12, r2, r8, r82);
        r1.A0F = r29;
        r1.A0Q = r30;
        r1.A02 = r3;
        r0 = new X.C207099uY(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x07fd, code lost:
        if (r9 != null) goto L_0x0804;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x07ff, code lost:
        r9 = new X.AnonymousClass834();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0804, code lost:
        r132 = new X.C193809My(r0, r9, r72, r136, r81, r80);
        r2 = r132.A00.A0S;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x081d, code lost:
        if (android.text.TextUtils.isEmpty(r2) != false) goto L_0x083f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0829, code lost:
        if ("video".equals(X.C203249nb.A05(r2)) == false) goto L_0x082d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x082b, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0835, code lost:
        if ("audio".equals(X.C203249nb.A05(r2)) == false) goto L_0x0838;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0838, code lost:
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x083d, code lost:
        if (X.C22736Av0.A0B(r2) != false) goto L_0x0842;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x083f, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0841, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0842, code lost:
        r0 = r60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0845, code lost:
        if (r0 != -1) goto L_0x084a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0847, code lost:
        r60 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x084a, code lost:
        if (r1 == -1) goto L_0x0853;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:?, code lost:
        X.C200319h9.A02(X.AnonymousClass000.A1S(r0, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0853, code lost:
        r55.add(r132);
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0c1e, code lost:
        if (r118 != false) goto L_0x0c20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x0cac, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:?, code lost:
        X.C165607th.A1L("Failed to parse manifest: %s", "DashManifestHelper2", r3, new java.lang.Object[]{r34});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x0cc0, code lost:
        throw new X.AnonymousClass91X(r34, r3);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:591:0x0cac A[ExcHandler: 8xn | RuntimeException (r3v1 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:22:0x0044] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass9XZ A01(android.net.Uri r136, X.C22736Av0 r137, java.lang.String r138) {
        /*
            r5 = 0
            r1 = r138
            if (r138 == 0) goto L_0x0cd5
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0cd5
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r1.getBytes(r0)     // Catch:{ 91X -> 0x0cd3, IOException -> 0x0cd2 }
            java.io.ByteArrayInputStream r77 = X.C90524aI.A0P(r0)     // Catch:{ 91X -> 0x0cd3, IOException -> 0x0cd2 }
            java.lang.String r76 = "Failed to close manifest input stream"
            java.lang.String r75 = "DashManifestHelper2"
            r23 = 0
            r34 = r136
            long r37 = java.lang.System.currentTimeMillis()     // Catch:{ 8xn | RuntimeException -> 0x0cac, IOException -> 0x0c9e }
            r11 = r137
            X.9Fy r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r16 = r0
            if (r0 == 0) goto L_0x0049
            java.lang.String r1 = r11.A03     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 != 0) goto L_0x0049
            monitor-enter(r16)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0c94 }
            if (r0 == 0) goto L_0x003a
            r0 = 0
            goto L_0x0044
        L_0x003a:
            r0 = r16
            android.util.LruCache r0 = r0.A00     // Catch:{ all -> 0x0c94 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0c94 }
            X.9XZ r0 = (X.AnonymousClass9XZ) r0     // Catch:{ all -> 0x0c94 }
        L_0x0044:
            monitor-exit(r16)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0049
            goto L_0x0c48
        L_0x0049:
            org.xmlpull.v1.XmlPullParserFactory r0 = r11.A04     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            org.xmlpull.v1.XmlPullParser r4 = r0.newPullParser()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r21 = 0
            r0 = r77
            r4.setInput(r0, r5)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            int r1 = r4.next()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = 2
            if (r1 != r0) goto L_0x0c80
            java.lang.String r74 = "MPD"
            java.lang.String r1 = r4.getName()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r74
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0c80
            if (r136 == 0) goto L_0x0071
            java.lang.String r21 = r34.toString()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x0071:
            java.lang.String r0 = "availabilityStartTime"
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            X.C22736Av0.A0A(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r2 = "mediaPresentationDuration"
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r35 = X.C22736Av0.A04(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r2 = "minBufferTime"
            X.C22736Av0.A04(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r40 = 0
            java.lang.String r0 = "type"
            java.lang.String r1 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r1 == 0) goto L_0x00f6
            java.lang.String r0 = "dynamic"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x00f6
            r22 = 1
            java.lang.String r2 = "minimumUpdatePeriod"
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            X.C22736Av0.A04(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r2 = "timeShiftBufferDepth"
            X.C22736Av0.A04(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r2 = "suggestedPresentationDelay"
            X.C22736Av0.A04(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x00b3:
            java.lang.String r0 = "publishTime"
            X.C22736Av0.A0A(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "availabilityEndTime"
            X.C22736Av0.A0A(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r2 = "firstAvTimeMs"
            r0 = -1
            long r108 = X.C22736Av0.A05(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r2 = "currentServerTimeMs"
            long r110 = X.C22736Av0.A05(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r2 = "lastVideoFrameTs"
            long r112 = X.C22736Av0.A05(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r2 = "publishFrameTime"
            r0 = 0
            long r114 = X.C22736Av0.A05(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "FBWasLive"
            boolean r39 = A02(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "FBIsLiveTemplated"
            boolean r118 = A02(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "FBMS"
            boolean r120 = A02(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "usingASRCaptions"
            java.lang.String r1 = "0"
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x00fa
            goto L_0x00f9
        L_0x00f6:
            r22 = 0
            goto L_0x00b3
        L_0x00f9:
            r1 = r0
        L_0x00fa:
            java.lang.String r0 = "1"
            boolean r121 = r1.equals(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "loapStreamId"
            r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r1 = "loapStreamType"
            r0 = 0
            X.C22736Av0.A01(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "validationErrors"
            java.lang.String r71 = ""
            r104 = r71
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0119
            r104 = r0
        L_0x0119:
            boolean r0 = r11.A05     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x012a
            java.lang.String r0 = "FBManifestIdentifier"
            r102 = r5
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x012c
            r102 = r0
            goto L_0x012c
        L_0x012a:
            r102 = r5
        L_0x012c:
            java.lang.String r0 = "FBTagsetUsed"
            r103 = r5
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0138
            r103 = r0
        L_0x0138:
            java.lang.String r0 = "FBDeliveryExperimentName"
            r1 = r5
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0142
            r1 = r0
        L_0x0142:
            java.lang.String r0 = "FBDeliveryExperimentGroup"
            java.lang.String r2 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r2 == 0) goto L_0x0159
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = 58
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r1.append(r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r1.toString()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x0159:
            java.lang.String r0 = "FBManifestTimestamp"
            r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r21 == 0) goto L_0x0172
            java.util.regex.Pattern r1 = X.C22736Av0.A08     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r21
            java.util.regex.Matcher r1 = r1.matcher(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            boolean r0 = r1.find()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0172
            r0 = 1
            r1.group(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x0172:
            java.util.ArrayList r73 = X.AnonymousClass001.A0I()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r22 == 0) goto L_0x0179
            goto L_0x017c
        L_0x0179:
            r19 = 0
            goto L_0x0181
        L_0x017c:
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0181:
            r32 = 0
            r33 = 0
            r119 = 0
            r100 = r5
        L_0x0189:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r68 = "BaseURL"
            r0 = r68
            boolean r0 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x019a
            if (r32 != 0) goto L_0x0b92
            goto L_0x0b83
        L_0x019a:
            java.lang.String r0 = "UTCTiming"
            boolean r0 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x01b7
            java.lang.String r0 = "schemeIdUri"
            java.lang.String r2 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "value"
            java.lang.String r1 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9QG r40 = new X.9QG     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r40
            r0.<init>(r2, r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x0b92
        L_0x01b7:
            java.lang.String r0 = "Location"
            boolean r0 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x01c9
            java.lang.String r0 = r4.nextText()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            android.net.Uri r100 = android.net.Uri.parse(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x0b92
        L_0x01c9:
            java.lang.String r67 = "Period"
            r0 = r67
            boolean r0 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0b92
            if (r33 != 0) goto L_0x0b92
            r66 = r21
            r65 = 0
            java.lang.String r64 = "id"
            r1 = r65
            r0 = r64
            r4.getAttributeValue(r1, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r2 = "start"
            r0 = r19
            long r62 = X.C22736Av0.A04(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r61 = "duration"
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r61
            long r26 = X.C22736Av0.A04(r0, r4, r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.util.ArrayList r69 = X.AnonymousClass001.A0I()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.util.ArrayList r70 = X.AnonymousClass001.A0I()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r24 = r65
            r25 = 0
        L_0x0203:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r68
            boolean r0 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0212
            if (r25 != 0) goto L_0x0b0c
            goto L_0x0afd
        L_0x0212:
            java.lang.String r54 = "AdaptationSet"
            r0 = r54
            boolean r0 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0973
            r10 = r24
            r53 = r66
            r1 = -1
            r0 = r64
            X.C22736Av0.A01(r0, r4, r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            int r60 = X.C22736Av0.A03(r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "FBUploadResolutionMos"
            r123 = r5
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0236
            r123 = r0
        L_0x0236:
            java.lang.String r0 = "FBUploadResolutionMosConfidenceLevel"
            r124 = r5
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0242
            r124 = r0
        L_0x0242:
            java.lang.String r0 = "FBUnifiedUploadResolutionMos"
            r125 = r5
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x024e
            r125 = r0
        L_0x024e:
            java.lang.String r0 = "subsegmentAlignment"
            boolean r131 = A02(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "bitstreamSwitching"
            boolean r130 = A02(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r51 = "mimeType"
            r0 = r51
            java.lang.String r52 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r49 = "codecs"
            r0 = r49
            java.lang.String r50 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r48 = "width"
            r0 = r48
            int r47 = X.C22736Av0.A01(r0, r4, r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r46 = "height"
            r0 = r46
            int r45 = X.C22736Av0.A01(r0, r4, r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r44 = X.C22736Av0.A00(r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r43 = "audioSamplingRate"
            r0 = r43
            int r42 = X.C22736Av0.A01(r0, r4, r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r41 = "lang"
            r0 = r41
            java.lang.String r30 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.util.ArrayList r58 = X.AnonymousClass001.A0I()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.util.ArrayList r57 = X.AnonymousClass001.A0I()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.util.ArrayList r56 = X.AnonymousClass001.A0I()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.util.ArrayList r59 = X.AnonymousClass001.A0I()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.util.ArrayList r55 = X.AnonymousClass001.A0I()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r117 = r5
            r13 = 1
            r31 = -1
            r28 = 0
            r29 = 0
        L_0x02ad:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r68
            boolean r0 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x02bc
            if (r28 != 0) goto L_0x08ae
            goto L_0x089f
        L_0x02bc:
            java.lang.String r14 = "ContentProtection"
            boolean r0 = X.C196299Yr.A01(r14, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x02db
            android.util.Pair r1 = X.C22736Av0.A06(r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.Object r0 = r1.first     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x02d0
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r117 = r0
        L_0x02d0:
            java.lang.Object r1 = r1.second     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r1 == 0) goto L_0x08ae
            r0 = r58
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x08ae
        L_0x02db:
            java.lang.String r0 = "ContentComponent"
            boolean r0 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0311
            r0 = r41
            java.lang.String r1 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r30 != 0) goto L_0x02ee
            r30 = r1
            goto L_0x02f9
        L_0x02ee:
            if (r1 == 0) goto L_0x02f9
            r0 = r30
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.C200319h9.A02(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x02f9:
            int r2 = X.C22736Av0.A03(r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r1 = -1
            r0 = r60
            if (r0 != r1) goto L_0x0306
            r60 = r2
            goto L_0x08ae
        L_0x0306:
            if (r2 == r1) goto L_0x08ae
            boolean r0 = X.AnonymousClass000.A1S(r0, r2)
            X.C200319h9.A02(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x08ae
        L_0x0311:
            java.lang.String r0 = "Role"
            boolean r1 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r1 == 0) goto L_0x034c
            java.lang.String r1 = "schemeIdUri"
            r2 = 0
            r3 = r5
            java.lang.String r1 = r4.getAttributeValue(r5, r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r1 == 0) goto L_0x0324
            r3 = r1
        L_0x0324:
            java.lang.String r1 = "value"
            java.lang.String r1 = r4.getAttributeValue(r5, r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r1 == 0) goto L_0x032d
            r2 = r1
        L_0x032d:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            boolean r1 = X.C196299Yr.A00(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r1 == 0) goto L_0x032d
            java.lang.String r0 = "urn:mpeg:dash:role:2011"
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0347
            java.lang.String r0 = "main"
            boolean r1 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = 1
            if (r1 != 0) goto L_0x0348
        L_0x0347:
            r0 = 0
        L_0x0348:
            r29 = r29 | r0
            goto L_0x08ae
        L_0x034c:
            java.lang.String r7 = "AudioChannelConfiguration"
            boolean r0 = X.C196299Yr.A01(r7, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x035a
            int r31 = X.C22736Av0.A02(r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x08ae
        L_0x035a:
            java.lang.String r0 = "Accessibility"
            boolean r1 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r1 == 0) goto L_0x036d
            X.9U3 r1 = X.C22736Av0.A07(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r56
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x08ae
        L_0x036d:
            java.lang.String r3 = "SupplementalProperty"
            boolean r0 = X.C196299Yr.A01(r3, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0380
            X.9U3 r1 = X.C22736Av0.A07(r3, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r59
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x08ae
        L_0x0380:
            java.lang.String r6 = "Representation"
            boolean r0 = X.C196299Yr.A01(r6, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x085a
            r72 = r53
            r9 = r10
            r98 = r31
            r8 = r50
            r12 = r52
            r0 = r64
            java.lang.String r83 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "bandwidth"
            r2 = -1
            int r82 = X.C22736Av0.A01(r0, r4, r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r51
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x03a7
            r12 = r0
        L_0x03a7:
            r0 = r49
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x03b0
            r8 = r0
        L_0x03b0:
            r1 = r48
            r0 = r47
            int r99 = X.C22736Av0.A01(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r1 = r46
            r0 = r45
            int r97 = X.C22736Av0.A01(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r44
            float r96 = X.C22736Av0.A00(r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r1 = r43
            r0 = r42
            int r95 = X.C22736Av0.A01(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "FBQualityLabel"
            r116 = r5
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x03da
            r116 = r0
        L_0x03da:
            java.lang.String r0 = "FBMaxBandwidth"
            int r87 = X.C22736Av0.A01(r0, r4, r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r1 = "FBAbrPolicyTags"
            r0 = r5
            java.lang.String r1 = r4.getAttributeValue(r5, r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r1 == 0) goto L_0x03ea
            r0 = r1
        L_0x03ea:
            java.lang.String r1 = "FBDynamicQualityDropped"
            int r2 = X.C22736Av0.A01(r1, r4, r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r1 = 1
            boolean r93 = X.AnonymousClass000.A1S(r2, r1)
            if (r0 == 0) goto L_0x0401
            java.lang.String r1 = "hvq_mobile_landscape"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r94 = 1
            if (r1 != 0) goto L_0x0405
        L_0x0401:
            r94 = 0
            if (r0 == 0) goto L_0x040f
        L_0x0405:
            java.lang.String r1 = "hvq_mobile_portrait"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r92 = 1
            if (r1 != 0) goto L_0x0413
        L_0x040f:
            r92 = 0
            if (r0 == 0) goto L_0x041d
        L_0x0413:
            java.lang.String r1 = "avoid_on_cellular"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r91 = 1
            if (r1 != 0) goto L_0x0421
        L_0x041d:
            r91 = 0
            if (r0 == 0) goto L_0x042b
        L_0x0421:
            java.lang.String r1 = "avoid_on_cellular_intentional"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r90 = 1
            if (r1 != 0) goto L_0x042f
        L_0x042b:
            r90 = 0
            if (r0 == 0) goto L_0x0439
        L_0x042f:
            java.lang.String r1 = "avoid_on_cell_datasaver"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r89 = 1
            if (r1 != 0) goto L_0x043d
        L_0x0439:
            r89 = 0
            if (r0 == 0) goto L_0x0447
        L_0x043d:
            java.lang.String r1 = "avoid_on_cell_datasaver_intentional"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r88 = 1
            if (r1 != 0) goto L_0x044b
        L_0x0447:
            r88 = 0
            if (r0 == 0) goto L_0x0455
        L_0x044b:
            java.lang.String r1 = "avoid_on_abr"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r86 = 1
            if (r1 != 0) goto L_0x0459
        L_0x0455:
            r86 = 0
            if (r0 == 0) goto L_0x0463
        L_0x0459:
            java.lang.String r1 = "avoid_on_abr_intentional"
            boolean r0 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r85 = 1
            if (r0 != 0) goto L_0x0465
        L_0x0463:
            r85 = 0
        L_0x0465:
            java.lang.String r0 = "FBPlaybackResolutionMos"
            r107 = r5
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0471
            r107 = r0
        L_0x0471:
            java.lang.String r0 = "FBPlaybackResolutionMosConfidenceLevel"
            r106 = r5
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x047d
            r106 = r0
        L_0x047d:
            java.lang.String r0 = "FBPlaybackResolutionCsvqm"
            r105 = r5
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0489
            r105 = r0
        L_0x0489:
            java.lang.String r0 = "FBEncodingTag"
            r101 = r5
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0495
            r101 = r0
        L_0x0495:
            java.lang.String r1 = "FBUltraLowLatencyEncoding"
            r0 = 0
            int r1 = X.C22736Av0.A01(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = 1
            boolean r84 = X.AnonymousClass000.A1S(r1, r0)
            if (r13 != 0) goto L_0x04ad
            java.lang.String r1 = "FBDefaultQuality"
            r0 = 0
            int r0 = X.C22736Av0.A01(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r15 = 0
            if (r0 == 0) goto L_0x04ae
        L_0x04ad:
            r15 = 1
        L_0x04ae:
            java.util.ArrayList r81 = X.AnonymousClass001.A0I()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.util.ArrayList r80 = X.AnonymousClass001.A0I()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r136 = r5
            r2 = 0
        L_0x04bd:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r68
            boolean r0 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x04cc
            if (r2 != 0) goto L_0x056a
            goto L_0x055c
        L_0x04cc:
            boolean r0 = X.C196299Yr.A01(r7, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x04d8
            int r98 = X.C22736Av0.A02(r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x056a
        L_0x04d8:
            java.lang.String r0 = "SegmentBase"
            boolean r0 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x04e8
            X.834 r9 = (X.AnonymousClass834) r9     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.834 r9 = r11.A0H(r9, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x056a
        L_0x04e8:
            java.lang.String r0 = "SegmentList"
            boolean r0 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x04f7
            X.831 r9 = (X.AnonymousClass831) r9     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.831 r9 = r11.A0E(r9, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x056a
        L_0x04f7:
            java.lang.String r0 = "SegmentTemplate"
            boolean r0 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0508
            X.832 r9 = (X.AnonymousClass832) r9     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r22
            X.832 r9 = r11.A0F(r9, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x056a
        L_0x0508:
            boolean r0 = X.C196299Yr.A01(r14, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0524
            android.util.Pair r1 = X.C22736Av0.A06(r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.Object r0 = r1.first     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x051a
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r136 = r0
        L_0x051a:
            java.lang.Object r1 = r1.second     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r1 == 0) goto L_0x056a
            r0 = r81
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x056a
        L_0x0524:
            java.lang.String r0 = "InbandEventStream"
            boolean r1 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r1 == 0) goto L_0x0536
            X.9U3 r1 = X.C22736Av0.A07(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r80
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x056a
        L_0x0536:
            boolean r0 = X.C196299Yr.A01(r3, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0544
            X.9U3 r0 = X.C22736Av0.A07(r3, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r13.add(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x056a
        L_0x0544:
            java.lang.String r0 = "FBInitializationBinary"
            boolean r0 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0550
            r4.nextText()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x056a
        L_0x0550:
            java.lang.String r0 = "FBSegmentIndexBinary"
            boolean r0 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x056a
            r4.nextText()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x056a
        L_0x055c:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r72
            java.lang.String r72 = X.C131676Qa.A00(r0, r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r2 = 1
        L_0x056a:
            boolean r0 = X.C196299Yr.A00(r6, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x04bd
            int r0 = r81.size()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            boolean r79 = X.AnonymousClass000.A1R(r0)
            r2 = r12
            java.lang.String r0 = X.C203249nb.A05(r12)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r14 = "audio"
            boolean r0 = r14.equals(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x05b8
            r2 = 0
            if (r8 == 0) goto L_0x0654
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0594
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x0591:
            int r6 = r1.length     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = 0
            goto L_0x05a0
        L_0x0594:
            java.lang.String r3 = r8.trim()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r1 = "(\\s*,\\s*)"
            r0 = -1
            java.lang.String[] r1 = r3.split(r1, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x0591
        L_0x05a0:
            if (r0 >= r6) goto L_0x0654
            r3 = r1[r0]     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r78 = X.C203249nb.A04(r3)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r78 == 0) goto L_0x05b5
            java.lang.String r3 = X.C203249nb.A05(r78)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            boolean r3 = r14.equals(r3)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r3 == 0) goto L_0x05b5
            goto L_0x05f7
        L_0x05b5:
            int r0 = r0 + 1
            goto L_0x05a0
        L_0x05b8:
            java.lang.String r0 = X.C203249nb.A05(r12)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r3 = "video"
            boolean r0 = r3.equals(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x05fa
            r2 = 0
            if (r8 == 0) goto L_0x0654
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x05d3
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x05d0:
            int r7 = r1.length     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = 0
            goto L_0x05df
        L_0x05d3:
            java.lang.String r6 = r8.trim()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r1 = "(\\s*,\\s*)"
            r0 = -1
            java.lang.String[] r1 = r6.split(r1, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x05d0
        L_0x05df:
            if (r0 >= r7) goto L_0x0654
            r6 = r1[r0]     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r78 = X.C203249nb.A04(r6)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r78 == 0) goto L_0x05f4
            java.lang.String r6 = X.C203249nb.A05(r78)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            boolean r6 = r3.equals(r6)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r6 == 0) goto L_0x05f4
            goto L_0x05f7
        L_0x05f4:
            int r0 = r0 + 1
            goto L_0x05df
        L_0x05f7:
            r2 = r78
            goto L_0x0616
        L_0x05fa:
            boolean r0 = X.C22736Av0.A0B(r12)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0603
            if (r12 == 0) goto L_0x0654
            goto L_0x0616
        L_0x0603:
            java.lang.String r0 = "application/mp4"
            boolean r0 = r0.equals(r12)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r2 = 0
            if (r0 == 0) goto L_0x062a
            java.lang.String r0 = "stpp"
            boolean r0 = r0.equals(r8)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x061f
            java.lang.String r2 = "application/ttml+xml"
        L_0x0616:
            java.lang.String r6 = "audio/eac3"
            boolean r0 = r6.equals(r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0687
            goto L_0x0652
        L_0x061f:
            java.lang.String r0 = "wvtt"
            boolean r0 = r0.equals(r8)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0654
            java.lang.String r2 = "application/x-mp4-vtt"
            goto L_0x0616
        L_0x062a:
            java.lang.String r0 = "application/x-rawcc"
            boolean r0 = r0.equals(r12)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0654
            if (r8 == 0) goto L_0x0654
            java.lang.String r0 = "cea708"
            boolean r0 = r8.contains(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x063f
            java.lang.String r2 = "application/cea-708"
            goto L_0x0616
        L_0x063f:
            java.lang.String r0 = "eia608"
            boolean r0 = r8.contains(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 != 0) goto L_0x064f
            java.lang.String r0 = "cea608"
            boolean r0 = r8.contains(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0654
        L_0x064f:
            java.lang.String r2 = "application/cea-608"
            goto L_0x0616
        L_0x0652:
            r1 = 0
            goto L_0x0665
        L_0x0654:
            r1 = r83
            r0 = r82
            X.9en r2 = A00(r1, r12, r2, r8, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r29
            r2.A0F = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r30
            r2.A0Q = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x06ad
        L_0x0665:
            int r0 = r13.size()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r1 >= r0) goto L_0x0742
            java.lang.Object r0 = r13.get(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9U3 r0 = (X.AnonymousClass9U3) r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r3 = r0.A01     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r2 = "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r2 == 0) goto L_0x073e
            java.lang.String r2 = r0.A02     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "ec+3"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x073e
            java.lang.String r2 = "audio/eac3-joc"
        L_0x0687:
            java.lang.String r1 = X.C203249nb.A05(r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "video"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x070a
            r1 = r83
            r0 = r82
            X.9en r2 = A00(r1, r12, r2, r8, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r99
            r2.A0H = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r97
            r2.A08 = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r96
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r2.A0S = r5     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r29
            r2.A0F = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x06ad:
            X.9Oe r1 = new X.9Oe     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r116
            r1.A05 = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r94
            r1.A0F = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r92
            r1.A0G = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r91
            r1.A0C = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r90
            r1.A0B = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r89
            r1.A0A = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r88
            r1.A09 = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r86
            r1.A08 = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r85
            r1.A07 = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r79
            r1.A0H = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r107
            r1.A03 = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r106
            r1.A04 = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r105
            r1.A02 = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r125
            r1.A06 = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r101
            r1.A01 = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r1.A0E = r15     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r87
            r1.A00 = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r93
            r1.A0D = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x06f8:
            r0 = r84
            r1.A0I = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9tI r0 = new X.9tI     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0.<init>(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r2.A0J = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9uY r0 = new X.9uY     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0.<init>(r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x07fd
        L_0x070a:
            java.lang.String r0 = X.C203249nb.A05(r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            boolean r0 = r14.equals(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0745
            r1 = r83
            r0 = r82
            X.9en r2 = A00(r1, r12, r2, r8, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r98
            r2.A04 = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r95
            r2.A0E = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r2.A0S = r5     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r29
            r2.A0F = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r30
            r2.A0Q = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9Oe r1 = new X.9Oe     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r101
            r1.A01 = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r1.A0E = r15     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r87
            r1.A00 = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x06f8
        L_0x073e:
            int r1 = r1 + 1
            goto L_0x0665
        L_0x0742:
            r2 = r6
            goto L_0x0687
        L_0x0745:
            boolean r0 = X.C22736Av0.A0B(r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0654
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0795
            r1 = 0
        L_0x0754:
            int r0 = r56.size()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r1 >= r0) goto L_0x07df
            r0 = r56
            java.lang.Object r0 = r0.get(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9U3 r0 = (X.AnonymousClass9U3) r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r6 = r0.A01     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r3 = "urn:scte:dash:cc:cea-608:2015"
            boolean r3 = r3.equals(r6)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r3 == 0) goto L_0x0792
            java.lang.String r3 = r0.A02     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r3 == 0) goto L_0x0792
            java.util.regex.Pattern r6 = X.C22736Av0.A06     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r3 = r0.A02     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.util.regex.Matcher r3 = r6.matcher(r3)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            boolean r6 = r3.matches()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r6 != 0) goto L_0x07e1
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r6 = "Unable to parse CEA-608 channel number from: "
            r3.append(r6)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = r0.A02     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r3 = X.AnonymousClass000.A0q(r0, r3)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "MpdParser"
            android.util.Log.w(r0, r3)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x0792:
            int r1 = r1 + 1
            goto L_0x0754
        L_0x0795:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x07df
            r1 = 0
        L_0x079e:
            int r0 = r56.size()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r1 >= r0) goto L_0x07df
            r0 = r56
            java.lang.Object r0 = r0.get(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9U3 r0 = (X.AnonymousClass9U3) r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r6 = r0.A01     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r3 = "urn:scte:dash:cc:cea-708:2015"
            boolean r3 = r3.equals(r6)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r3 == 0) goto L_0x07dc
            java.lang.String r3 = r0.A02     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r3 == 0) goto L_0x07dc
            java.util.regex.Pattern r6 = X.C22736Av0.A07     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r3 = r0.A02     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.util.regex.Matcher r3 = r6.matcher(r3)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            boolean r6 = r3.matches()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r6 != 0) goto L_0x07e1
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r6 = "Unable to parse CEA-708 service block number from: "
            r3.append(r6)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = r0.A02     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r3 = X.AnonymousClass000.A0q(r0, r3)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "MpdParser"
            android.util.Log.w(r0, r3)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x07dc:
            int r1 = r1 + 1
            goto L_0x079e
        L_0x07df:
            r3 = -1
            goto L_0x07e6
        L_0x07e1:
            r0 = 1
            int r3 = X.C165607th.A0A(r3, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x07e6:
            r1 = r83
            r0 = r82
            X.9en r1 = A00(r1, r12, r2, r8, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r29
            r1.A0F = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r30
            r1.A0Q = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r1.A02 = r3     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9uY r0 = new X.9uY     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0.<init>(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x07fd:
            if (r9 != 0) goto L_0x0804
            X.834 r9 = new X.834     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r9.<init>()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x0804:
            X.9My r3 = new X.9My     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r132 = r3
            r133 = r0
            r134 = r9
            r135 = r72
            r137 = r81
            r138 = r80
            r132.<init>(r133, r134, r135, r136, r137, r138)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9uY r0 = r3.A00     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r2 = r0.A0S     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 != 0) goto L_0x083f
            java.lang.String r1 = X.C203249nb.A05(r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "video"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x082d
            r1 = 2
            goto L_0x0842
        L_0x082d:
            java.lang.String r0 = X.C203249nb.A05(r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            boolean r0 = r14.equals(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0838
            goto L_0x0841
        L_0x0838:
            boolean r0 = X.C22736Av0.A0B(r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r1 = 3
            if (r0 != 0) goto L_0x0842
        L_0x083f:
            r1 = -1
            goto L_0x0842
        L_0x0841:
            r1 = 1
        L_0x0842:
            r2 = -1
            r0 = r60
            if (r0 != r2) goto L_0x084a
            r60 = r1
            goto L_0x0853
        L_0x084a:
            if (r1 == r2) goto L_0x0853
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            X.C200319h9.A02(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x0853:
            r0 = r55
            r0.add(r3)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r13 = 0
            goto L_0x08ae
        L_0x085a:
            java.lang.String r0 = "SegmentBase"
            boolean r0 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0869
            X.834 r10 = (X.AnonymousClass834) r10     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.834 r10 = r11.A0H(r10, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x08ae
        L_0x0869:
            java.lang.String r0 = "SegmentList"
            boolean r0 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0878
            X.831 r10 = (X.AnonymousClass831) r10     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.831 r10 = r11.A0E(r10, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x08ae
        L_0x0878:
            java.lang.String r0 = "SegmentTemplate"
            boolean r0 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0889
            X.832 r10 = (X.AnonymousClass832) r10     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r22
            X.832 r10 = r11.A0F(r10, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x08ae
        L_0x0889:
            java.lang.String r0 = "InbandEventStream"
            boolean r1 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r1 == 0) goto L_0x089b
            X.9U3 r1 = X.C22736Av0.A07(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r57
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x08ae
        L_0x089b:
            r4.getEventType()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x08ae
        L_0x089f:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r53
            java.lang.String r53 = X.C131676Qa.A00(r0, r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r28 = 1
        L_0x08ae:
            r0 = r54
            boolean r0 = X.C196299Yr.A00(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x02ad
            java.util.ArrayList r12 = X.C36401kF.A0v(r55)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r9 = 0
        L_0x08bb:
            int r0 = r55.size()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r9 >= r0) goto L_0x095d
            r0 = r55
            java.lang.Object r1 = r0.get(r9)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9My r1 = (X.C193809My) r1     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r13 = r117
            X.9uY r8 = r1.A00     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = r1.A03     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x08d2
            r13 = r0
        L_0x08d2:
            java.util.ArrayList r3 = r1.A04     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r58
            r3.addAll(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            boolean r0 = r3.isEmpty()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 != 0) goto L_0x0933
            int r2 = r3.size()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x08e3:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0915
            java.lang.Object r0 = r3.get(r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9uV r0 = (X.C207069uV) r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            byte[] r6 = r0.A04     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r6 != 0) goto L_0x08e3
            r7 = 0
        L_0x08f2:
            int r6 = r3.size()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r7 >= r6) goto L_0x08e3
            java.lang.Object r6 = r3.get(r7)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9uV r6 = (X.C207069uV) r6     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            byte[] r10 = r6.A04     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r10 == 0) goto L_0x0912
            byte[] r10 = r0.A04     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r10 != 0) goto L_0x0912
            java.util.UUID r10 = r0.A03     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            boolean r6 = r6.A00(r10)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r6 == 0) goto L_0x0912
            r3.remove(r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x08e3
        L_0x0912:
            int r7 = r7 + 1
            goto L_0x08f2
        L_0x0915:
            int r0 = r3.size()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9uV[] r0 = new X.C207069uV[r0]     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.Object[] r0 = r3.toArray(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9uV[] r0 = (X.C207069uV[]) r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.AXg r2 = new X.AXg     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r2.<init>(r13, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9en r0 = new X.9en     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0.<init>(r8)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0.A00(r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9uY r8 = new X.9uY     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r8.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x0933:
            java.util.ArrayList r2 = r1.A05     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r57
            r2.addAll(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r3 = r1.A02     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9RF r0 = r1.A01     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            boolean r1 = r0 instanceof X.AnonymousClass834     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r1 == 0) goto L_0x094d
            X.834 r0 = (X.AnonymousClass834) r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.82z r1 = new X.82z     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r1.<init>(r8, r0, r3, r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x0949:
            r12.add(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x0959
        L_0x094d:
            boolean r1 = r0 instanceof X.AnonymousClass833     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r1 == 0) goto L_0x0b9b
            X.833 r0 = (X.AnonymousClass833) r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.830 r1 = new X.830     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r1.<init>(r8, r0, r3, r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x0949
        L_0x0959:
            int r9 = r9 + 1
            goto L_0x08bb
        L_0x095d:
            X.9O1 r1 = new X.9O1     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r122 = r1
            r126 = r12
            r127 = r56
            r128 = r59
            r129 = r60
            r122.<init>(r123, r124, r125, r126, r127, r128, r129, r130, r131)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r69
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x0b0c
        L_0x0973:
            java.lang.String r10 = "EventStream"
            boolean r0 = X.C196299Yr.A01(r10, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0ace
            java.lang.String r0 = "schemeIdUri"
            r43 = r71
            r42 = r71
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0989
            r42 = r0
        L_0x0989:
            java.lang.String r0 = "value"
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0993
            r43 = r0
        L_0x0993:
            java.lang.String r2 = "timescale"
            r0 = 1
            long r13 = X.C22736Av0.A05(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = 512(0x200, float:7.175E-43)
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r9.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x09a6:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r8 = "Event"
            boolean r0 = X.C196299Yr.A01(r8, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0a93
            r1 = 0
            r0 = r64
            long r47 = X.C22736Av0.A05(r0, r4, r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r61
            long r49 = X.C22736Av0.A05(r0, r4, r6)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "presentationTime"
            long r0 = X.C22736Av0.A05(r0, r4, r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r51 = 1000(0x3e8, double:4.94E-321)
            r53 = r13
            long r45 = com.facebook.android.exoplayer2.util.Util.A07(r49, r51, r53)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            long r28 = com.facebook.android.exoplayer2.util.Util.A06(r0, r13)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "messageData"
            r7 = 0
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x09e0
            r7 = r0
        L_0x09e0:
            r9.reset()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            org.xmlpull.v1.XmlSerializer r0 = android.util.Xml.newSerializer()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0.setOutput(r9, r5)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r4.nextToken()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x09ed:
            boolean r1 = X.C196299Yr.A00(r8, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r1 != 0) goto L_0x0a72
            int r2 = r4.getEventType()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r1 = 0
            switch(r2) {
                case 0: goto L_0x09ff;
                case 1: goto L_0x0a07;
                case 2: goto L_0x0a0b;
                case 3: goto L_0x0a2e;
                case 4: goto L_0x0a3a;
                case 5: goto L_0x0a42;
                case 6: goto L_0x0a4a;
                case 7: goto L_0x0a52;
                case 8: goto L_0x0a5a;
                case 9: goto L_0x0a62;
                case 10: goto L_0x0a6a;
                default: goto L_0x09fb;
            }     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x09fb:
            r4.nextToken()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x09ed
        L_0x09ff:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r23)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0.startDocument(r5, r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x09fb
        L_0x0a07:
            r0.endDocument()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x09fb
        L_0x0a0b:
            java.lang.String r3 = r4.getNamespace()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r2 = r4.getName()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0.startTag(r3, r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x0a16:
            int r2 = r4.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r1 >= r2) goto L_0x09fb
            java.lang.String r6 = r4.getAttributeNamespace(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r3 = r4.getAttributeName(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r2 = r4.getAttributeValue(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0.attribute(r6, r3, r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            int r1 = r1 + 1
            goto L_0x0a16
        L_0x0a2e:
            java.lang.String r2 = r4.getNamespace()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r1 = r4.getName()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0.endTag(r2, r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x09fb
        L_0x0a3a:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0.text(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x09fb
        L_0x0a42:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0.cdsect(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x09fb
        L_0x0a4a:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0.entityRef(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x09fb
        L_0x0a52:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0.ignorableWhitespace(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x09fb
        L_0x0a5a:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0.processingInstruction(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x09fb
        L_0x0a62:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0.comment(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x09fb
        L_0x0a6a:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0.docdecl(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x09fb
        L_0x0a72:
            r0.flush()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            byte[] r44 = r9.toByteArray()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.Long r1 = java.lang.Long.valueOf(r28)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r7 == 0) goto L_0x0a85
            java.nio.charset.Charset r0 = X.C114085gc.A05     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            byte[] r44 = r7.getBytes(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x0a85:
            X.9zo r0 = new X.9zo     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r41 = r0
            r41.<init>(r42, r43, r44, r45, r47)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            android.util.Pair r0 = android.util.Pair.create(r1, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r12.add(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x0a93:
            boolean r0 = X.C196299Yr.A00(r10, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x09a6
            int r0 = r12.size()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            long[] r6 = new long[r0]     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            int r0 = r12.size()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9zo[] r3 = new X.C209319zo[r0]     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r1 = 0
        L_0x0aa6:
            int r0 = r12.size()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r1 >= r0) goto L_0x0ac3
            java.lang.Object r0 = r12.get(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.Object r2 = r0.first     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            long r7 = r2.longValue()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r6[r1] = r7     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.Object r0 = r0.second     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r3[r1] = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            int r1 = r1 + 1
            goto L_0x0aa6
        L_0x0ac3:
            X.9GJ r1 = new X.9GJ     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r1.<init>(r6, r3)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r70
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x0b0c
        L_0x0ace:
            java.lang.String r0 = "SegmentBase"
            boolean r0 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0add
            r0 = r65
            X.834 r24 = r11.A0H(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x0b0c
        L_0x0add:
            java.lang.String r0 = "SegmentList"
            boolean r0 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0aec
            r0 = r65
            X.831 r24 = r11.A0E(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x0b0c
        L_0x0aec:
            java.lang.String r0 = "SegmentTemplate"
            boolean r0 = X.C196299Yr.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0b0c
            r1 = r65
            r0 = r22
            X.832 r24 = r11.A0F(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x0b0c
        L_0x0afd:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r66
            java.lang.String r66 = X.C131676Qa.A00(r0, r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r25 = 1
        L_0x0b0c:
            r0 = r67
            boolean r0 = X.C196299Yr.A00(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0203
            r3 = 0
            r8 = 0
        L_0x0b16:
            int r0 = r69.size()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r3 >= r0) goto L_0x0b56
            r0 = r69
            java.lang.Object r1 = r0.get(r3)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9O1 r1 = (X.AnonymousClass9O1) r1     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.util.List r0 = r1.A05     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0b53
            r2 = 0
        L_0x0b29:
            java.util.List r0 = r1.A05     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            int r0 = r0.size()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r2 >= r0) goto L_0x0b53
            java.util.List r0 = r1.A05     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9Xo r0 = (X.C196079Xo) r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            boolean r6 = r0 instanceof X.C1690382z     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r6 == 0) goto L_0x0b3f
            r7 = 0
            goto L_0x0b4f
        L_0x0b3f:
            X.830 r0 = (X.AnonymousClass830) r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.833 r0 = r0.A00     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            boolean r6 = r0 instanceof X.AnonymousClass832     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r7 = 0
            if (r6 == 0) goto L_0x0b4f
            X.832 r0 = (X.AnonymousClass832) r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.9GK r0 = r0.A00     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0b4f
            r7 = 1
        L_0x0b4f:
            r8 = r8 | r7
            int r2 = r2 + 1
            goto L_0x0b29
        L_0x0b53:
            int r3 = r3 + 1
            goto L_0x0b16
        L_0x0b56:
            X.9RE r6 = new X.9RE     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r3 = r69
            r2 = r70
            r0 = r62
            r6.<init>(r3, r2, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            long r0 = r6.A00     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x0b68
            goto L_0x0b7c
        L_0x0b68:
            int r2 = (r26 > r17 ? 1 : (r26 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x0b72
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0b76
        L_0x0b72:
            long r0 = r0 + r26
            r19 = r0
        L_0x0b76:
            r0 = r73
            r0.add(r6)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x0b80
        L_0x0b7c:
            if (r22 == 0) goto L_0x0ba3
            r33 = 1
        L_0x0b80:
            r119 = r119 | r8
            goto L_0x0b92
        L_0x0b83:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r21
            java.lang.String r21 = X.C131676Qa.A00(r0, r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r32 = 1
        L_0x0b92:
            r0 = r74
            boolean r0 = X.C196299Yr.A00(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 == 0) goto L_0x0189
            goto L_0x0bb8
        L_0x0b9b:
            java.lang.String r0 = "segmentBase must be of type SingleSegmentBase or MultiSegmentBase"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x0c96
        L_0x0ba3:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r1 = "Unable to determine start of period "
            r0 = r73
            X.C36341k9.A1N(r1, r2, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.8xn r0 = X.C187398xn.A00(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x0c96
        L_0x0bb8:
            int r0 = (r35 > r17 ? 1 : (r35 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x0bc1
            int r0 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0bc1
            goto L_0x0bc3
        L_0x0bc1:
            r19 = r35
        L_0x0bc3:
            boolean r0 = r73.isEmpty()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r0 != 0) goto L_0x0c79
            boolean r7 = X.C22736Av0.A0C(r73)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "Before filterPeriod() for "
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r4 = r11.A03     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r1.append(r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r3 = "\n"
            r1.append(r3)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r73
            java.lang.String r2 = X.C22736Av0.A09(r11, r1, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r6 = "->"
            if (r7 == 0) goto L_0x0c0a
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = "filterPeriod() for "
            X.AnonymousClass000.A1D(r0, r4, r3, r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r0 = r73
            java.lang.String r3 = X.C22736Av0.A09(r11, r1, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            boolean r122 = X.C22736Av0.A0C(r73)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            long r0 = X.C36441kJ.A0A(r7)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r11.A00 = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = X.C90464aC.A0e(r2, r6, r3)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r11.A02 = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x0c1a
        L_0x0c0a:
            r0 = 0
            r11.A00 = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.StringBuilder r0 = X.C36331k8.A0k(r2, r6)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = X.AnonymousClass000.A0q(r2, r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r11.A02 = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r122 = 0
        L_0x0c1a:
            if (r39 != 0) goto L_0x0c20
            r117 = 0
            if (r118 == 0) goto L_0x0c22
        L_0x0c20:
            r117 = 1
        L_0x0c22:
            X.9XZ r0 = new X.9XZ     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r99 = r0
            r101 = r40
            r105 = r73
            r106 = r19
            r116 = r22
            r99.<init>(r100, r101, r102, r103, r104, r105, r106, r108, r110, r112, r114, r116, r117, r118, r119, r120, r121, r122)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r16 == 0) goto L_0x0c48
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            if (r1 != 0) goto L_0x0c48
            monitor-enter(r16)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0c94 }
            if (r1 != 0) goto L_0x0c47
            r1 = r16
            android.util.LruCache r1 = r1.A00     // Catch:{ all -> 0x0c94 }
            r1.put(r4, r0)     // Catch:{ all -> 0x0c94 }
        L_0x0c47:
            monitor-exit(r16)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x0c48:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ 8xn | RuntimeException -> 0x0cac, IOException -> 0x0c9e }
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ 8xn | RuntimeException -> 0x0cac, IOException -> 0x0c9e }
            java.lang.Object[] r3 = X.C36441kJ.A1Q()     // Catch:{ 8xn | RuntimeException -> 0x0cac, IOException -> 0x0c9e }
            long r1 = r1 - r37
            r6 = 0
            X.AnonymousClass000.A1M(r3, r6, r1)     // Catch:{ 8xn | RuntimeException -> 0x0cac, IOException -> 0x0c9e }
            long r1 = r11.A00     // Catch:{ 8xn | RuntimeException -> 0x0cac, IOException -> 0x0c9e }
            r6 = 1
            X.AnonymousClass000.A1M(r3, r6, r1)     // Catch:{ 8xn | RuntimeException -> 0x0cac, IOException -> 0x0c9e }
            java.lang.String r2 = r11.A02     // Catch:{ 8xn | RuntimeException -> 0x0cac, IOException -> 0x0c9e }
            r1 = 2
            r3[r1] = r2     // Catch:{ 8xn | RuntimeException -> 0x0cac, IOException -> 0x0c9e }
            java.lang.String r1 = "parse:%dms;filter:%dms;%s"
            java.lang.String.format(r4, r1, r3)     // Catch:{ 8xn | RuntimeException -> 0x0cac, IOException -> 0x0c9e }
            r77.close()     // Catch:{ IOException -> 0x0c6c }
            goto L_0x0c78
        L_0x0c6c:
            r4 = move-exception
            r1 = 0
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ 91X -> 0x0cd3, IOException -> 0x0cd2 }
            r2 = r76
            r1 = r75
            X.C165607th.A1L(r2, r1, r4, r3)     // Catch:{ 91X -> 0x0cd3, IOException -> 0x0cd2 }
            return r0
        L_0x0c78:
            return r0
        L_0x0c79:
            java.lang.String r0 = "No periods found."
            X.8xn r0 = X.C187398xn.A00(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x0c96
        L_0x0c80:
            java.lang.String r2 = "inputStream does not contain a valid media presentation description, start tag %s"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = r4.getName()     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            r1[r23] = r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            java.lang.String r0 = java.lang.String.format(r2, r1)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            X.8xn r0 = X.C187398xn.A00(r0)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
            goto L_0x0c96
        L_0x0c94:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x0c96:
            throw r0     // Catch:{ XmlPullParserException -> 0x0c97, 8xn | RuntimeException -> 0x0cac }
        L_0x0c97:
            r1 = move-exception
            X.8xn r0 = new X.8xn     // Catch:{ 8xn | RuntimeException -> 0x0cac, IOException -> 0x0c9e }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ 8xn | RuntimeException -> 0x0cac, IOException -> 0x0c9e }
            throw r0     // Catch:{ 8xn | RuntimeException -> 0x0cac, IOException -> 0x0c9e }
        L_0x0c9e:
            r3 = move-exception
            java.lang.String r2 = "I/O Error when parsing manifest: %s"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0cc1 }
            r1[r23] = r34     // Catch:{ all -> 0x0cc1 }
            r0 = r75
            X.C165607th.A1L(r2, r0, r3, r1)     // Catch:{ all -> 0x0cc1 }
            throw r3     // Catch:{ all -> 0x0cc1 }
        L_0x0cac:
            r3 = move-exception
            java.lang.String r2 = "Failed to parse manifest: %s"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0cc1 }
            r1[r23] = r34     // Catch:{ all -> 0x0cc1 }
            r0 = r75
            X.C165607th.A1L(r2, r0, r3, r1)     // Catch:{ all -> 0x0cc1 }
            X.91X r1 = new X.91X     // Catch:{ all -> 0x0cc1 }
            r0 = r34
            r1.<init>(r0, r3)     // Catch:{ all -> 0x0cc1 }
            throw r1     // Catch:{ all -> 0x0cc1 }
        L_0x0cc1:
            r4 = move-exception
            r77.close()     // Catch:{ IOException -> 0x0cc6 }
            goto L_0x0cd1
        L_0x0cc6:
            r3 = move-exception
            r0 = 0
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ 91X -> 0x0cd3, IOException -> 0x0cd2 }
            r1 = r76
            r0 = r75
            X.C165607th.A1L(r1, r0, r3, r2)     // Catch:{ 91X -> 0x0cd3, IOException -> 0x0cd2 }
        L_0x0cd1:
            throw r4     // Catch:{ 91X -> 0x0cd3, IOException -> 0x0cd2 }
        L_0x0cd2:
            return r5
        L_0x0cd3:
            r0 = move-exception
            throw r0
        L_0x0cd5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Z1.A01(android.net.Uri, X.Av0, java.lang.String):X.9XZ");
    }

    public static boolean A02(String str, XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue != null) {
            return attributeValue.equals("true");
        }
        return false;
    }

    public static long[] A03(AnonymousClass9XZ r15) {
        long[] jArr = {-1, -1, -1};
        if (r15 != null) {
            try {
                List list = r15.A0A;
                int size = list.size();
                AnonymousClass9RE A0B = C165617ti.A0B(list, 0);
                int i = size - 1;
                AnonymousClass9RE A0B2 = C165617ti.A0B(list, i);
                C196079Xo r1 = (C196079Xo) AnonymousClass9RE.A00(A0B, A0B.A01(2)).A05.get(0);
                C196079Xo r8 = (C196079Xo) AnonymousClass9RE.A00(A0B2, A0B2.A01(2)).A05.get(0);
                if ((r1 instanceof AnonymousClass830) && (r8 instanceof AnonymousClass830)) {
                    AnonymousClass830 r82 = (AnonymousClass830) r8;
                    AnonymousClass833 r7 = ((AnonymousClass830) r1).A00;
                    int i2 = (int) r7.A03;
                    long j = -9223372036854775807L;
                    if (i == C36431kI.A07(list)) {
                        long j2 = r15.A01;
                        if (j2 != -9223372036854775807L) {
                            j = j2 - C165617ti.A0B(list, i).A00;
                        }
                    } else {
                        j = C165617ti.A0B(list, i + 1).A00 - C165617ti.A0B(list, i).A00;
                    }
                    UUID uuid = AnonymousClass9B7.A04;
                    long A04 = Util.A04(j);
                    AnonymousClass833 r5 = r82.A00;
                    int A00 = (r5.A00(A04) + i2) - 1;
                    int i3 = (A00 - i2) + 1;
                    long j3 = (long) A00;
                    return new long[]{r7.A01((long) i2) / 1000, (r5.A01(j3) + r82.BBL(j3, -9223372036854775807L)) / 1000, (long) i3};
                }
            } catch (Exception e) {
                Log.w("DashManifestHelper2", "Could not get segment range from manifest", e);
            }
        }
        return jArr;
    }

    public static C199159en A00(String str, String str2, String str3, String str4, int i) {
        AnonymousClass7c0 r0 = C207099uY.CREATOR;
        C199159en r02 = new C199159en();
        r02.A0P = str;
        r02.A0O = str2;
        r02.A0R = str3;
        r02.A0N = str4;
        r02.A03 = i;
        return r02;
    }
}
