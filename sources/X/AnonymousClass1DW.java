package X;

import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.1DW  reason: invalid class name */
public class AnonymousClass1DW {
    public final C19460v5 A00;
    public final C20810yC A01;
    public final AnonymousClass1DU A02;
    public final C24671Di A03;
    public final C24591Da A04;
    public final C19460v5 A05;
    public final C24801Dv A06;
    public final C19730wQ A07;
    public final AnonymousClass1DX A08;
    public final AnonymousClass1DY A09;
    public final C24771Ds A0A;
    public final AnonymousClass12U A0B;
    public final AnonymousClass1DV A0C;
    public final C24781Dt A0D;

    private int A01(String str, String str2) {
        if (!"upi".equals(str)) {
            boolean equals = "br".equals(str);
            if (equals && "signup".equals(str2)) {
                return 19;
            }
            if ("virality".equals(str) || "virality".equals(str2)) {
                return 21;
            }
            if ("tpp".equals(str)) {
                if (C20800yB.A01(C21000yV.A02, this.A01, 848)) {
                    return 29;
                }
                return 1;
            } else if ("legal".equals(str)) {
                return 1;
            } else {
                if ("add-credential".equals(str2)) {
                    return 65;
                }
                if (equals && "merchant".equals(str2)) {
                    return 89;
                }
                if (this.A04.A03()) {
                    return 4;
                }
                return 1;
            }
        } else if (!"signup".equals(str2)) {
            return 1;
        } else {
            return 19;
        }
    }

    public static PhoneUserJid A04(Uri uri) {
        String queryParameter = uri.getQueryParameter("phoneNumber");
        if ("wa.me".equals(uri.getHost())) {
            boolean z = false;
            if (uri.getPathSegments().size() == 2) {
                z = true;
            }
            C18740tg.A0B(z);
            queryParameter = uri.getLastPathSegment();
        }
        if (queryParameter == null) {
            return null;
        }
        try {
            Parcelable.Creator creator = PhoneUserJid.CREATOR;
            return C222913s.A00(queryParameter);
        } catch (C19740wR unused) {
            return null;
        }
    }

    public static String A05(Uri uri) {
        String queryParameter = uri.getQueryParameter("phone");
        String host = uri.getHost();
        if (!TextUtils.isEmpty(host)) {
            host = host.toLowerCase(Locale.US);
        }
        if ("wa.me".equals(host)) {
            return uri.getLastPathSegment();
        }
        return queryParameter;
    }

    private boolean A07() {
        C19730wQ r0 = this.A07;
        r0.A0G();
        if (r0.A00 == null || !this.A0B.A03()) {
            return false;
        }
        return true;
    }

    public static boolean A08(Uri uri, C20810yC r4) {
        C21000yV r1 = C21000yV.A02;
        if ((C20800yB.A01(r1, r4, 1483) || C20800yB.A01(r1, r4, 1849)) && uri.isHierarchical() && !uri.getQueryParameterNames().isEmpty() && uri.getQueryParameterNames().contains(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE) && "business_profile".equals(uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE))) {
            return true;
        }
        return false;
    }

    public static boolean A09(C20810yC r4, String str) {
        Uri build;
        C21000yV r1 = C21000yV.A02;
        if (C20800yB.A01(r1, r4, 1483) || C20800yB.A01(r1, r4, 1849)) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("wa.me")) {
                lowerCase = lowerCase.replace("wa.me", "https://wa.me");
            }
            Uri parse = Uri.parse(lowerCase);
            String str2 = null;
            if (parse.getHost() != null) {
                str2 = parse.getHost().toLowerCase(Locale.US);
            }
            if ("wa.me".equals(str2) && (build = new Uri.Builder().scheme("https").encodedAuthority(str2).encodedPath(parse.getEncodedPath()).encodedQuery(parse.getEncodedQuery()).encodedFragment(parse.getEncodedFragment()).build()) != null) {
                String scheme = build.getScheme();
                if (!TextUtils.isEmpty(scheme)) {
                    String host = build.getHost();
                    if (!TextUtils.isEmpty(host) && A0B(scheme, host)) {
                        List<String> pathSegments = build.getPathSegments();
                        if (pathSegments.size() != 1 || !Pattern.matches("^(?![0-9.]+$)[a-zA-Z0-9.]{5,35}$", pathSegments.get(0))) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean A0B(String str, String str2) {
        if (("http".equals(str) || "https".equals(str)) && "wa.me".equals(str2)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01cf, code lost:
        if (r4.equals("send") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01d7, code lost:
        if (A08(r8, r3.A01) == false) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01d9, code lost:
        return 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0214, code lost:
        if (r4.equals("catalog") != false) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0216, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0266, code lost:
        if (r4.equals("message_yourself") != false) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0268, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x026f, code lost:
        if (r4.equals("message") != false) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0271, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0278, code lost:
        if (r4.equals("archive_settings") != false) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x027a, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0281, code lost:
        if (r4.equals("stickerpack") != false) goto L_0x029e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0283, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008a, code lost:
        if (android.text.TextUtils.isEmpty(r8.getQueryParameter("text")) != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x05ac, code lost:
        if (r4.equals("pay") != false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05ae, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05b5, code lost:
        if (r4.equals("status") != false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05b7, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05be, code lost:
        if (r4.equals("biztab") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x05c4, code lost:
        if (r1.size() < 1) goto L_0x05d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x05c6, code lost:
        r6 = ((java.lang.String) r1.get(0)).toLowerCase(java.util.Locale.US);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05d6, code lost:
        switch(r6.hashCode()) {
            case -1535436173: goto L_0x0603;
            case -1110417409: goto L_0x05f9;
            case -690411481: goto L_0x05ef;
            case 555704345: goto L_0x05e5;
            case 1078655016: goto L_0x05db;
            default: goto L_0x05d9;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05db, code lost:
        r0 = r6.equals("away-message");
        r1 = 71;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05e5, code lost:
        r0 = r6.equals("catalog");
        r1 = 59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05ef, code lost:
        r0 = r6.equals("advertise");
        r1 = 45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x05f9, code lost:
        r0 = r6.equals("labels");
        r1 = 69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0603, code lost:
        r0 = r6.equals("greeting-message");
        r1 = 70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0613, code lost:
        if (r4.equals("orders") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0619, code lost:
        if (r1.size() == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x061f, code lost:
        if (A07() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0621, code lost:
        r0 = "orders-video".equals(((java.lang.String) r1.get(0)).toLowerCase(java.util.Locale.US));
        r1 = 107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x063d, code lost:
        if (r4.equals("advertise") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0643, code lost:
        if (r1.isEmpty() == false) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0645, code lost:
        return 38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0648, code lost:
        r1 = (java.lang.String) r1.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0652, code lost:
        switch(r1.hashCode()) {
            case -934426579: goto L_0x07a1;
            case -892481550: goto L_0x0675;
            case -530685006: goto L_0x066b;
            case -309425751: goto L_0x0661;
            case 555704345: goto L_0x0657;
            default: goto L_0x0655;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0657, code lost:
        r0 = r1.equals("catalog");
        r1 = 44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0661, code lost:
        r0 = r1.equals("profile");
        r1 = 68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x066b, code lost:
        r0 = r1.equals("recently-added-media");
        r1 = 103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0675, code lost:
        r0 = r1.equals("status");
        r1 = 72;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0777, code lost:
        if (r4.equals("marketingmessages") != false) goto L_0x0794;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0779, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x07a1, code lost:
        r0 = r1.equals("resume");
        r1 = 54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x07b2, code lost:
        if (r4.equals("biztools") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x07b8, code lost:
        if (r1.size() != 1) goto L_0x07c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x07ba, code lost:
        r1 = r1.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x07f9, code lost:
        if (r4.equals("edit-ad") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x07fb, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0802, code lost:
        if (r4.equals("manage-ads") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0808, code lost:
        if (r1.size() < 1) goto L_0x0810;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x080a, code lost:
        r6 = (java.lang.String) r1.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x081c, code lost:
        if ("ad-details".equals(r6.toLowerCase(java.util.Locale.US)) == false) goto L_0x0827;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0822, code lost:
        if (r1.size() < 2) goto L_0x0827;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0824, code lost:
        return 40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0833, code lost:
        if ("edit-ad".equals(r6.toLowerCase(java.util.Locale.US)) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0839, code lost:
        if (r1.size() < 2) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0841, code lost:
        r0 = "directory";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x084a, code lost:
        if (r4.equals("biz-agents-onboarding") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x084c, code lost:
        return 109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0855, code lost:
        if (r4.equals("product") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0857, code lost:
        return 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0859, code lost:
        r0 = "updates";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0862, code lost:
        if (r4.equals("fpm") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0864, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x086b, code lost:
        if (r4.equals("tos") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0871, code lost:
        return A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0878, code lost:
        if (r4.equals("call") != false) goto L_0x0c49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x087a, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x087b, code lost:
        r0 = "guia";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0881, code lost:
        if (r4.equals(r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0883, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x088a, code lost:
        if (r4.equals("ctwa-messaging-guide") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x088c, code lost:
        return 83;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0895, code lost:
        if (r4.equals("ad-details") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0897, code lost:
        return 74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x08a0, code lost:
        if (r4.equals("calling") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x08a6, code lost:
        return A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x08ad, code lost:
        if (r4.equals("account_switcher") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x08af, code lost:
        return 75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x08b2, code lost:
        r0 = "channel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x08b8, code lost:
        if (r4.equals(r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x08ba, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x08c1, code lost:
        if (r4.equals("event-link") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x08c3, code lost:
        r3 = r3.A0D;
        r4 = X.AnonymousClass6XV.newArrayList("event_id", "event_name");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x08db, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r3.A00, 3989) == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x08dd, code lost:
        r1 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x08e5, code lost:
        if (r1.hasNext() == false) goto L_0x08f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x08f1, code lost:
        if (r8.getQueryParameter((java.lang.String) r1.next()) != null) goto L_0x08e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x08f3, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x08f4, code lost:
        return 66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x08fd, code lost:
        if (r4.equals("settings") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0903, code lost:
        return A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x090a, code lost:
        if (r4.equals("pending_ad") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x090c, code lost:
        return 84;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0915, code lost:
        if (r4.equals("disappearing_messages") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x091b, code lost:
        if (r1.size() != 0) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x092c, code lost:
        if (r4.equals("biz-edit-profile") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0932, code lost:
        if (r1.isEmpty() == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x093d, code lost:
        if (r4.equals("biz-edit-catalog") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0943, code lost:
        if (r1.isEmpty() == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x094e, code lost:
        if (r4.equals("biz-hours") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0954, code lost:
        if (r1.isEmpty() == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x095f, code lost:
        if (r4.equals("biz-location") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0965, code lost:
        if (r1.isEmpty() == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0970, code lost:
        if (r4.equals("biz-edit-description") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0976, code lost:
        if (r1.isEmpty() == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0981, code lost:
        if (r4.equals("biz-price-tier") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0987, code lost:
        if (r1.isEmpty() == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0992, code lost:
        if (r4.equals("biz-profile-completeness") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0998, code lost:
        if (r1.isEmpty() == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x09a3, code lost:
        if (r4.equals("privacy-settings") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x09a9, code lost:
        if (r1.isEmpty() == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x09b2, code lost:
        if (r4.equals("privacy") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x09b8, code lost:
        if (r1.size() < 1) goto L_0x09ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x09cc, code lost:
        if (((java.lang.String) r1.get(0)).toLowerCase(java.util.Locale.US).equals("checkup") == false) goto L_0x09ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x09d8, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r3.A01, 3815) == false) goto L_0x09ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x09e3, code lost:
        if (r4.equals("proxy") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x09e9, code lost:
        if (r1.isEmpty() == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x09f4, code lost:
        if (r4.equals("help") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x09fa, code lost:
        if (r1.size() != 1) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0a03, code lost:
        if (r1.size() != 1) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0a17, code lost:
        if (((java.lang.String) r1.get(0)).toLowerCase(java.util.Locale.US).equals("calls") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0a22, code lost:
        if (r4.equals("code-linking") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0a28, code lost:
        if (r1.isEmpty() == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0a36, code lost:
        if (r4.equals("biz-website") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0a3c, code lost:
        if (r1.isEmpty() == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0abc, code lost:
        if (r4.equals("bizsearch") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0ac2, code lost:
        if (r1.size() != 1) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0ad6, code lost:
        if (((java.lang.String) r1.get(0)).toLowerCase(java.util.Locale.US).equals("onboarding-sheet") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0ae2, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r3.A01, 5465) == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0c3e, code lost:
        if (r4.equals("biz-linked-accounts") == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0c44, code lost:
        if (r1.isEmpty() == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:600:?, code lost:
        return 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:?, code lost:
        return 82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:?, code lost:
        return 82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:?, code lost:
        return 39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:613:?, code lost:
        return 39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:614:?, code lost:
        return 46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:616:?, code lost:
        return 48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:?, code lost:
        return 49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:?, code lost:
        return 50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:?, code lost:
        return 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:?, code lost:
        return 63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:?, code lost:
        return 73;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:628:?, code lost:
        return 52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:630:?, code lost:
        return 58;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:632:?, code lost:
        return 61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:634:?, code lost:
        return 62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:636:?, code lost:
        return 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:?, code lost:
        return 77;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:?, code lost:
        return 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:642:?, code lost:
        return 57;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:644:?, code lost:
        return 76;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:646:?, code lost:
        return 98;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:?, code lost:
        return 51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:?, code lost:
        return 56;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015f, code lost:
        if (r14 == false) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0167, code lost:
        if ("https".equals(r13) != false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x016f, code lost:
        if ("www.whatsapp.com".equals(r4) == false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0175, code lost:
        if (r1.isEmpty() == false) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0177, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x017c, code lost:
        if (r1.size() <= 1) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x017e, code lost:
        r6 = (java.lang.String) r1.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0188, code lost:
        if ("pay".equals(r0) == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x018e, code lost:
        return A01(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x018f, code lost:
        r0 = (java.lang.String) r1.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x019c, code lost:
        if (com.whatsapp.SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equals(r13) != false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a4, code lost:
        if ("whatsapp-consumer".equals(r13) == false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01aa, code lost:
        switch(r4.hashCode()) {
            case -1992233120: goto L_0x0926;
            case -1888021818: goto L_0x07f3;
            case -1854767153: goto L_0x01ae;
            case -1801891768: goto L_0x07fc;
            case -1562078008: goto L_0x099d;
            case -1522518477: goto L_0x096a;
            case -1388591710: goto L_0x05b8;
            case -1127103024: goto L_0x0937;
            case -1045462584: goto L_0x0a1c;
            case -1008770331: goto L_0x060d;
            case -962584979: goto L_0x0841;
            case -947241760: goto L_0x097b;
            case -892481550: goto L_0x05af;
            case -690411481: goto L_0x0637;
            case -474713810: goto L_0x098c;
            case -436339243: goto L_0x0948;
            case -318452137: goto L_0x01b7;
            case -314498168: goto L_0x09ae;
            case -313324288: goto L_0x0844;
            case -309474065: goto L_0x084f;
            case -265966801: goto L_0x0959;
            case -234430262: goto L_0x0859;
            case 3617: goto L_0x01c0;
            case 101603: goto L_0x085c;
            case 110760: goto L_0x05a8;
            case 115032: goto L_0x0865;
            case 3045982: goto L_0x0872;
            case 3184262: goto L_0x087b;
            case 3198785: goto L_0x09ee;
            case 3526536: goto L_0x01c9;
            case 106941038: goto L_0x09dd;
            case 377921569: goto L_0x0884;
            case 436014744: goto L_0x088f;
            case 548640964: goto L_0x089a;
            case 555704345: goto L_0x020e;
            case 708933431: goto L_0x0262;
            case 734040243: goto L_0x08a7;
            case 738950403: goto L_0x08b2;
            case 937946957: goto L_0x08bb;
            case 954925063: goto L_0x0269;
            case 1059243776: goto L_0x0272;
            case 1298628776: goto L_0x07ac;
            case 1434631203: goto L_0x08f7;
            case 1519332396: goto L_0x090f;
            case 1564510331: goto L_0x0ab6;
            case 1597539542: goto L_0x027b;
            case 1698491339: goto L_0x0904;
            case 1708621281: goto L_0x0a30;
            case 1737180530: goto L_0x0771;
            case 1850498144: goto L_0x0c38;
            default: goto L_0x01ad;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ad, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b4, code lost:
        if (r4.equals("support") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b6, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01bd, code lost:
        if (r4.equals("premium") != false) goto L_0x0408;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01bf, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c6, code lost:
        if (r4.equals("qr") != false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01c8, code lost:
        return 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:594:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:609:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0C(android.net.Uri r22) {
        /*
            r21 = this;
            r8 = r22
            java.lang.String r1 = r8.getScheme()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r2 = 1
            if (r0 != 0) goto L_0x0c4d
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r13 = r1.toLowerCase(r0)
            java.util.List r1 = r8.getPathSegments()
            java.lang.String r3 = r8.getHost()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0c4d
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r3.toLowerCase(r0)
            r3 = r21
            X.1Di r5 = r3.A03
            boolean r0 = r5.A09(r8)
            if (r0 != 0) goto L_0x0c4a
            boolean r0 = r5.A0A(r8)
            if (r0 == 0) goto L_0x003a
            r1 = 113(0x71, float:1.58E-43)
        L_0x0039:
            return r1
        L_0x003a:
            boolean r0 = A0B(r13, r4)
            r20 = 26
            r19 = 13
            r18 = 5
            r17 = 6
            r16 = 80
            r14 = 35
            java.lang.String r12 = "message_yourself"
            java.lang.String r6 = ""
            r11 = 3
            java.lang.String r10 = "pay"
            java.lang.String r9 = "privacy"
            r15 = 10
            r7 = 2
            r5 = 0
            if (r0 == 0) goto L_0x00cc
            int r0 = r1.size()
            if (r0 != r2) goto L_0x0098
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "status"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0098
        L_0x0073:
            java.util.Set r3 = r8.getQueryParameterNames()
            if (r3 == 0) goto L_0x0095
            int r0 = r3.size()
            if (r0 != r2) goto L_0x008c
            java.lang.String r0 = "text"
            java.lang.String r0 = r8.getQueryParameter(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 == 0) goto L_0x008d
        L_0x008c:
            r1 = 0
        L_0x008d:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0095
            if (r1 == 0) goto L_0x07cd
        L_0x0095:
            r1 = 41
            return r1
        L_0x0098:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00b1
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r4.toLowerCase(r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x00ec
        L_0x00b1:
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0217
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "ph"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0217
            return r14
        L_0x00cc:
            java.lang.String r0 = "api.whatsapp.com"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x011e
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01da
            java.lang.Object r14 = r1.get(r5)
            java.lang.String r14 = (java.lang.String) r14
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r14.toLowerCase(r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x01da
        L_0x00ec:
            int r0 = r1.size()
            if (r0 < r7) goto L_0x0118
            int r0 = r1.size()
            java.util.List r1 = r1.subList(r2, r0)
        L_0x00fa:
            boolean r4 = r1.isEmpty()
            r0 = r6
            if (r4 != 0) goto L_0x0107
            java.lang.Object r6 = r1.get(r5)
            java.lang.String r6 = (java.lang.String) r6
        L_0x0107:
            int r4 = r1.size()
            if (r4 <= r2) goto L_0x0113
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0113:
            int r1 = r3.A01(r6, r0)
            return r1
        L_0x0118:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x00fa
        L_0x011e:
            java.lang.String r0 = "call.whatsapp.com"
            boolean r0 = r0.equals(r4)
            r18 = 33
            if (r0 != 0) goto L_0x0c49
            java.lang.String r0 = "http"
            boolean r14 = r0.equals(r13)
            if (r14 != 0) goto L_0x0138
            java.lang.String r0 = "https"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0161
        L_0x0138:
            java.lang.String r0 = "whatsapp.com"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0149
            boolean r0 = X.C24771Ds.A01(r8)
            if (r0 == 0) goto L_0x0149
        L_0x0146:
            r1 = 55
            return r1
        L_0x0149:
            java.lang.String r0 = "cross-link"
            java.lang.String r0 = r8.getQueryParameter(r0)
            if (r0 == 0) goto L_0x0154
            r1 = 97
            return r1
        L_0x0154:
            java.lang.String r0 = "chat.whatsapp.com"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x015f
            r1 = 8
            return r1
        L_0x015f:
            if (r14 != 0) goto L_0x0169
        L_0x0161:
            java.lang.String r0 = "https"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0196
        L_0x0169:
            java.lang.String r0 = "www.whatsapp.com"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0196
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x018f
            r0 = r6
        L_0x0178:
            int r4 = r1.size()
            if (r4 <= r2) goto L_0x0184
            java.lang.Object r6 = r1.get(r2)
            java.lang.String r6 = (java.lang.String) r6
        L_0x0184:
            boolean r1 = r10.equals(r0)
            if (r1 == 0) goto L_0x0c4d
            int r1 = r3.A01(r0, r6)
            return r1
        L_0x018f:
            java.lang.Object r0 = r1.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0178
        L_0x0196:
            java.lang.String r0 = "whatsapp"
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x01a6
            java.lang.String r0 = "whatsapp-consumer"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0c4d
        L_0x01a6:
            int r0 = r4.hashCode()
            switch(r0) {
                case -1992233120: goto L_0x0926;
                case -1888021818: goto L_0x07f3;
                case -1854767153: goto L_0x01ae;
                case -1801891768: goto L_0x07fc;
                case -1562078008: goto L_0x099d;
                case -1522518477: goto L_0x096a;
                case -1388591710: goto L_0x05b8;
                case -1127103024: goto L_0x0937;
                case -1045462584: goto L_0x0a1c;
                case -1008770331: goto L_0x060d;
                case -962584979: goto L_0x0841;
                case -947241760: goto L_0x097b;
                case -892481550: goto L_0x05af;
                case -690411481: goto L_0x0637;
                case -474713810: goto L_0x098c;
                case -436339243: goto L_0x0948;
                case -318452137: goto L_0x01b7;
                case -314498168: goto L_0x09ae;
                case -313324288: goto L_0x0844;
                case -309474065: goto L_0x084f;
                case -265966801: goto L_0x0959;
                case -234430262: goto L_0x0859;
                case 3617: goto L_0x01c0;
                case 101603: goto L_0x085c;
                case 110760: goto L_0x05a8;
                case 115032: goto L_0x0865;
                case 3045982: goto L_0x0872;
                case 3184262: goto L_0x087b;
                case 3198785: goto L_0x09ee;
                case 3526536: goto L_0x01c9;
                case 106941038: goto L_0x09dd;
                case 377921569: goto L_0x0884;
                case 436014744: goto L_0x088f;
                case 548640964: goto L_0x089a;
                case 555704345: goto L_0x020e;
                case 708933431: goto L_0x0262;
                case 734040243: goto L_0x08a7;
                case 738950403: goto L_0x08b2;
                case 937946957: goto L_0x08bb;
                case 954925063: goto L_0x0269;
                case 1059243776: goto L_0x0272;
                case 1298628776: goto L_0x07ac;
                case 1434631203: goto L_0x08f7;
                case 1519332396: goto L_0x090f;
                case 1564510331: goto L_0x0ab6;
                case 1597539542: goto L_0x027b;
                case 1698491339: goto L_0x0904;
                case 1708621281: goto L_0x0a30;
                case 1737180530: goto L_0x0771;
                case 1850498144: goto L_0x0c38;
                default: goto L_0x01ad;
            }
        L_0x01ad:
            return r2
        L_0x01ae:
            java.lang.String r0 = "support"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x037f
            return r2
        L_0x01b7:
            java.lang.String r0 = "premium"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0408
            return r2
        L_0x01c0:
            java.lang.String r0 = "qr"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0261
            return r2
        L_0x01c9:
            java.lang.String r0 = "send"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            X.0yC r0 = r3.A01
            boolean r0 = A08(r8, r0)
            if (r0 == 0) goto L_0x01f4
            return r15
        L_0x01da:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x01f5
            java.lang.Object r14 = r1.get(r5)
            java.lang.String r14 = (java.lang.String) r14
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r14 = r14.toLowerCase(r0)
            java.lang.String r0 = "send"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x01f5
        L_0x01f4:
            return r7
        L_0x01f5:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x011e
            java.lang.Object r14 = r1.get(r5)
            java.lang.String r14 = (java.lang.String) r14
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r14.toLowerCase(r0)
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x011e
            return r16
        L_0x020e:
            java.lang.String r0 = "catalog"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0231
            return r2
        L_0x0217:
            int r0 = r1.size()
            if (r0 != r7) goto L_0x0232
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "c"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0232
        L_0x0231:
            return r17
        L_0x0232:
            int r0 = r1.size()
            if (r0 != r11) goto L_0x024d
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "p"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x024d
            return r18
        L_0x024d:
            java.lang.String r4 = r8.toString()
            java.lang.String r0 = "https://wa.me/qr/"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x0284
            int r4 = r4.length()
            r0 = 17
            if (r4 <= r0) goto L_0x0284
        L_0x0261:
            return r11
        L_0x0262:
            boolean r0 = r4.equals(r12)
            if (r0 != 0) goto L_0x03ed
            return r2
        L_0x0269:
            java.lang.String r0 = "message"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x02b9
            return r2
        L_0x0272:
            java.lang.String r0 = "archive_settings"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0321
            return r2
        L_0x027b:
            java.lang.String r0 = "stickerpack"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x029e
            return r2
        L_0x0284:
            int r0 = r1.size()
            if (r0 != r7) goto L_0x029f
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "stickerpack"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x029f
        L_0x029e:
            return r19
        L_0x029f:
            int r0 = r1.size()
            if (r0 != r7) goto L_0x02ba
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x02ba
        L_0x02b9:
            return r15
        L_0x02ba:
            int r0 = r1.size()
            if (r0 < r2) goto L_0x02e0
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "biztools"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x02e0
            int r0 = r1.size()
            if (r0 <= r2) goto L_0x07c6
            java.lang.Object r1 = r1.get(r2)
            goto L_0x07be
        L_0x02e0:
            int r0 = r1.size()
            if (r0 < r2) goto L_0x0307
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "settings"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0307
            int r0 = r1.size()
            java.util.List r0 = r1.subList(r2, r0)
            int r1 = r3.A00(r8, r0)
            return r1
        L_0x0307:
            int r0 = r1.size()
            if (r0 < r2) goto L_0x0322
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "archive_settings"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0322
        L_0x0321:
            return r20
        L_0x0322:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x033e
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "disappearing_messages"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x033e
            goto L_0x091d
        L_0x033e:
            int r0 = r1.size()
            if (r0 < r2) goto L_0x0365
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "tos"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0365
            int r0 = r1.size()
            java.util.List r0 = r1.subList(r2, r0)
            int r1 = r3.A02(r0)
            return r1
        L_0x0365:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x0382
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "support"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0382
        L_0x037f:
            r1 = 30
            return r1
        L_0x0382:
            boolean r0 = X.C64053Ml.A00(r8)
            if (r0 != 0) goto L_0x0a2d
            int r0 = r1.size()
            if (r0 != r7) goto L_0x03d5
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "community"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x03d5
            X.0yC r5 = r3.A01
            r0 = 982(0x3d6, float:1.376E-42)
            X.0yV r4 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r4, r5, r0)
            if (r0 == 0) goto L_0x0c4d
            r0 = 5543(0x15a7, float:7.767E-42)
            boolean r0 = X.C20800yB.A01(r4, r5, r0)
            if (r0 != 0) goto L_0x0c4d
            X.0wQ r0 = r3.A07
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x0c4d
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "create"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0c4d
            r1 = 37
            return r1
        L_0x03d5:
            int r0 = r1.size()
            if (r0 < r2) goto L_0x03ee
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r4.toLowerCase(r0)
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x03ee
        L_0x03ed:
            return r16
        L_0x03ee:
            int r0 = r1.size()
            if (r0 < r2) goto L_0x0416
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "premium"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0416
        L_0x0408:
            X.0yC r2 = r3.A01
            r1 = 2562(0xa02, float:3.59E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            r1 = 42
            goto L_0x07a9
        L_0x0416:
            int r0 = r1.size()
            if (r0 < r2) goto L_0x0443
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "meta_verified"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0443
            X.0v5 r1 = r3.A00
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x07cd
            r1.A02()
            java.lang.String r1 = "isMetaVerifiedFeatureEnabled"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0443:
            r1.size()
            r1.size()
            r1.size()
            r1.size()
            r1.size()
            int r0 = r1.size()
            if (r0 != r2) goto L_0x046e
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "biz-edit-profile"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x046e
            goto L_0x0934
        L_0x046e:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x048a
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "biz-edit-catalog"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x048a
            goto L_0x0945
        L_0x048a:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x04a6
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "biz-hours"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x04a6
            goto L_0x0956
        L_0x04a6:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x04c2
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "biz-location"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x04c2
            goto L_0x0967
        L_0x04c2:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x04de
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "biz-edit-description"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x04de
            goto L_0x0978
        L_0x04de:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x04fa
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "biz-linked-accounts"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x04fa
            goto L_0x0c46
        L_0x04fa:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x0516
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "biz-website"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0516
            goto L_0x0a3e
        L_0x0516:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x0532
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "biz-price-tier"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0532
            goto L_0x0989
        L_0x0532:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x054e
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "biz-profile-completeness"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x054e
            goto L_0x099a
        L_0x054e:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x056a
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "privacy-settings"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x056a
            goto L_0x09ab
        L_0x056a:
            boolean r0 = X.C24771Ds.A01(r8)
            if (r0 != 0) goto L_0x0146
            int r0 = r1.size()
            if (r0 != r7) goto L_0x067f
            java.lang.Object r0 = r1.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r4)
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x067f
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = r0.toLowerCase(r4)
            java.lang.String r0 = "checkup"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x067f
            X.0yC r6 = r3.A01
            r4 = 3815(0xee7, float:5.346E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r6, r4)
            if (r0 == 0) goto L_0x067f
            goto L_0x09da
        L_0x05a8:
            boolean r0 = r4.equals(r10)
            if (r0 != 0) goto L_0x00fa
            return r2
        L_0x05af:
            java.lang.String r0 = "status"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0073
            return r2
        L_0x05b8:
            java.lang.String r0 = "biztab"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            int r0 = r1.size()
            if (r0 < r2) goto L_0x05d2
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r6 = r1.toLowerCase(r0)
        L_0x05d2:
            int r0 = r6.hashCode()
            switch(r0) {
                case -1535436173: goto L_0x0603;
                case -1110417409: goto L_0x05f9;
                case -690411481: goto L_0x05ef;
                case 555704345: goto L_0x05e5;
                case 1078655016: goto L_0x05db;
                default: goto L_0x05d9;
            }
        L_0x05d9:
            goto L_0x07cd
        L_0x05db:
            java.lang.String r0 = "away-message"
            boolean r0 = r6.equals(r0)
            r1 = 71
            goto L_0x07a9
        L_0x05e5:
            java.lang.String r0 = "catalog"
            boolean r0 = r6.equals(r0)
            r1 = 59
            goto L_0x07a9
        L_0x05ef:
            java.lang.String r0 = "advertise"
            boolean r0 = r6.equals(r0)
            r1 = 45
            goto L_0x07a9
        L_0x05f9:
            java.lang.String r0 = "labels"
            boolean r0 = r6.equals(r0)
            r1 = 69
            goto L_0x07a9
        L_0x0603:
            java.lang.String r0 = "greeting-message"
            boolean r0 = r6.equals(r0)
            r1 = 70
            goto L_0x07a9
        L_0x060d:
            java.lang.String r0 = "orders"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            int r0 = r1.size()
            if (r0 == 0) goto L_0x07cd
            boolean r0 = r3.A07()
            if (r0 == 0) goto L_0x07cd
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "orders-video"
            boolean r0 = r0.equals(r1)
            r1 = 107(0x6b, float:1.5E-43)
            goto L_0x07a9
        L_0x0637:
            java.lang.String r0 = "advertise"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0648
            r1 = 38
            return r1
        L_0x0648:
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            int r0 = r1.hashCode()
            switch(r0) {
                case -934426579: goto L_0x07a1;
                case -892481550: goto L_0x0675;
                case -530685006: goto L_0x066b;
                case -309425751: goto L_0x0661;
                case 555704345: goto L_0x0657;
                default: goto L_0x0655;
            }
        L_0x0655:
            goto L_0x07cd
        L_0x0657:
            java.lang.String r0 = "catalog"
            boolean r0 = r1.equals(r0)
            r1 = 44
            goto L_0x07a9
        L_0x0661:
            java.lang.String r0 = "profile"
            boolean r0 = r1.equals(r0)
            r1 = 68
            goto L_0x07a9
        L_0x066b:
            java.lang.String r0 = "recently-added-media"
            boolean r0 = r1.equals(r0)
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x07a9
        L_0x0675:
            java.lang.String r0 = "status"
            boolean r0 = r1.equals(r0)
            r1 = 72
            goto L_0x07a9
        L_0x067f:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x069b
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "proxy"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x069b
            goto L_0x09eb
        L_0x069b:
            int r0 = r1.size()
            if (r0 != r7) goto L_0x06b7
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "help"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x06b7
            goto L_0x09fc
        L_0x06b7:
            int r0 = r1.size()
            if (r0 != r7) goto L_0x06e3
            java.lang.Object r0 = r1.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r4)
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x06e3
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = r0.toLowerCase(r4)
            java.lang.String r0 = "calls"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x06e3
            goto L_0x0a19
        L_0x06e3:
            int r0 = r1.size()
            if (r0 != r7) goto L_0x071c
            java.lang.Object r0 = r1.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r4)
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x071c
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = r0.toLowerCase(r4)
            java.lang.String r0 = "groups"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x071c
            X.0yC r6 = r3.A01
            r4 = 3995(0xf9b, float:5.598E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r6, r4)
            if (r0 == 0) goto L_0x071c
            r1 = 91
            return r1
        L_0x071c:
            int r0 = r1.size()
            if (r0 != r7) goto L_0x0755
            java.lang.Object r0 = r1.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r4)
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0755
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = r0.toLowerCase(r4)
            java.lang.String r0 = "profile"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0755
            X.0yC r6 = r3.A01
            r4 = 3998(0xf9e, float:5.602E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r6, r4)
            if (r0 == 0) goto L_0x0755
            r1 = 92
            return r1
        L_0x0755:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x077a
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "code-linking"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x077a
            goto L_0x0a2a
        L_0x0771:
            java.lang.String r0 = "marketingmessages"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0794
            return r2
        L_0x077a:
            int r0 = r1.size()
            if (r0 < r2) goto L_0x0a41
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "marketingmessages"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0a41
        L_0x0794:
            X.0yC r2 = r3.A01
            r1 = 4674(0x1242, float:6.55E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            r1 = 78
            goto L_0x07a9
        L_0x07a1:
            java.lang.String r0 = "resume"
            boolean r0 = r1.equals(r0)
            r1 = 54
        L_0x07a9:
            if (r0 != 0) goto L_0x0039
            goto L_0x07cd
        L_0x07ac:
            java.lang.String r0 = "biztools"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            int r0 = r1.size()
            if (r0 != r2) goto L_0x07c6
            java.lang.Object r1 = r1.get(r5)
        L_0x07be:
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r6 = r1.toLowerCase(r0)
        L_0x07c6:
            int r0 = r6.hashCode()
            switch(r0) {
                case -2137146394: goto L_0x07ea;
                case -1814119737: goto L_0x07e1;
                case -962584979: goto L_0x07d8;
                case 1147181203: goto L_0x07cf;
                default: goto L_0x07cd;
            }
        L_0x07cd:
            r1 = 1
            return r1
        L_0x07cf:
            java.lang.String r0 = "business-platforms"
            boolean r0 = r6.equals(r0)
            r1 = 60
            goto L_0x07a9
        L_0x07d8:
            java.lang.String r0 = "directory"
            boolean r0 = r6.equals(r0)
            r1 = 31
            goto L_0x07a9
        L_0x07e1:
            java.lang.String r0 = "orders-home"
            boolean r0 = r6.equals(r0)
            r1 = 100
            goto L_0x07a9
        L_0x07ea:
            java.lang.String r0 = "accounts"
            boolean r0 = r6.equals(r0)
            r1 = 20
            goto L_0x07a9
        L_0x07f3:
            java.lang.String r0 = "edit-ad"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x083b
            return r2
        L_0x07fc:
            java.lang.String r0 = "manage-ads"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            int r0 = r1.size()
            if (r0 < r2) goto L_0x0810
            java.lang.Object r6 = r1.get(r5)
            java.lang.String r6 = (java.lang.String) r6
        L_0x0810:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r6.toLowerCase(r0)
            java.lang.String r0 = "ad-details"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0827
            int r0 = r1.size()
            if (r0 < r7) goto L_0x0827
            r1 = 40
            return r1
        L_0x0827:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r6.toLowerCase(r0)
            java.lang.String r0 = "edit-ad"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x083e
            int r0 = r1.size()
            if (r0 < r7) goto L_0x083e
        L_0x083b:
            r1 = 82
            return r1
        L_0x083e:
            r1 = 39
            return r1
        L_0x0841:
            java.lang.String r0 = "directory"
            goto L_0x087d
        L_0x0844:
            java.lang.String r0 = "biz-agents-onboarding"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            r1 = 109(0x6d, float:1.53E-43)
            return r1
        L_0x084f:
            java.lang.String r0 = "product"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            r1 = 5
            return r1
        L_0x0859:
            java.lang.String r0 = "updates"
            goto L_0x08b4
        L_0x085c:
            java.lang.String r0 = "fpm"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0a5b
            return r2
        L_0x0865:
            java.lang.String r0 = "tos"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            int r1 = r3.A02(r1)
            return r1
        L_0x0872:
            java.lang.String r0 = "call"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0c49
            return r2
        L_0x087b:
            java.lang.String r0 = "guia"
        L_0x087d:
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0a2d
            return r2
        L_0x0884:
            java.lang.String r0 = "ctwa-messaging-guide"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            r1 = 83
            return r1
        L_0x088f:
            java.lang.String r0 = "ad-details"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            r1 = 74
            return r1
        L_0x089a:
            java.lang.String r0 = "calling"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            int r1 = A03(r1)
            return r1
        L_0x08a7:
            java.lang.String r0 = "account_switcher"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            r1 = 75
            return r1
        L_0x08b2:
            java.lang.String r0 = "channel"
        L_0x08b4:
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0c4a
            return r2
        L_0x08bb:
            java.lang.String r0 = "event-link"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            X.1Dt r3 = r3.A0D
            java.lang.String r1 = "event_id"
            java.lang.String r0 = "event_name"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.ArrayList r4 = X.AnonymousClass6XV.newArrayList(r0)
            X.0yC r3 = r3.A00
            r1 = 3989(0xf95, float:5.59E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r3, r1)
            if (r0 == 0) goto L_0x0c4d
            java.util.Iterator r1 = r4.iterator()
        L_0x08e1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x08f4
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r8.getQueryParameter(r0)
            if (r0 != 0) goto L_0x08e1
            return r2
        L_0x08f4:
            r1 = 66
            return r1
        L_0x08f7:
            java.lang.String r0 = "settings"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            int r1 = r3.A00(r8, r1)
            return r1
        L_0x0904:
            java.lang.String r0 = "pending_ad"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            r1 = 84
            return r1
        L_0x090f:
            java.lang.String r0 = "disappearing_messages"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            int r0 = r1.size()
            if (r0 != 0) goto L_0x0c4d
        L_0x091d:
            boolean r0 = r3.A07()
            if (r0 == 0) goto L_0x0c4d
            r2 = 25
            return r2
        L_0x0926:
            java.lang.String r0 = "biz-edit-profile"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0c4d
        L_0x0934:
            r1 = 46
            return r1
        L_0x0937:
            java.lang.String r0 = "biz-edit-catalog"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0c4d
        L_0x0945:
            r1 = 48
            return r1
        L_0x0948:
            java.lang.String r0 = "biz-hours"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0c4d
        L_0x0956:
            r1 = 49
            return r1
        L_0x0959:
            java.lang.String r0 = "biz-location"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0c4d
        L_0x0967:
            r1 = 50
            return r1
        L_0x096a:
            java.lang.String r0 = "biz-edit-description"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0c4d
        L_0x0978:
            r1 = 53
            return r1
        L_0x097b:
            java.lang.String r0 = "biz-price-tier"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0c4d
        L_0x0989:
            r1 = 63
            return r1
        L_0x098c:
            java.lang.String r0 = "biz-profile-completeness"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0c4d
        L_0x099a:
            r1 = 73
            return r1
        L_0x099d:
            java.lang.String r0 = "privacy-settings"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0c4d
        L_0x09ab:
            r1 = 52
            return r1
        L_0x09ae:
            boolean r0 = r4.equals(r9)
            if (r0 == 0) goto L_0x0c4d
            int r0 = r1.size()
            if (r0 < r2) goto L_0x09ff
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "checkup"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x09ff
            X.0yC r4 = r3.A01
            r3 = 3815(0xee7, float:5.346E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r4, r3)
            if (r0 == 0) goto L_0x09ff
        L_0x09da:
            r1 = 58
            return r1
        L_0x09dd:
            java.lang.String r0 = "proxy"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0c4d
        L_0x09eb:
            r1 = 61
            return r1
        L_0x09ee:
            java.lang.String r0 = "help"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            int r0 = r1.size()
            if (r0 != r2) goto L_0x0c4d
        L_0x09fc:
            r1 = 62
            return r1
        L_0x09ff:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x0c4d
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "calls"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0c4d
        L_0x0a19:
            r1 = 64
            return r1
        L_0x0a1c:
            java.lang.String r0 = "code-linking"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0c4d
        L_0x0a2a:
            r1 = 77
            return r1
        L_0x0a2d:
            r1 = 32
            return r1
        L_0x0a30:
            java.lang.String r0 = "biz-website"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0c4d
        L_0x0a3e:
            r1 = 57
            return r1
        L_0x0a41:
            int r0 = r1.size()
            if (r0 < r2) goto L_0x0a5e
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "fpm"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0a5e
        L_0x0a5b:
            r1 = 76
            return r1
        L_0x0a5e:
            int r0 = r1.size()
            if (r0 < r2) goto L_0x0a7b
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "ais"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0a7b
            r1 = 93
            return r1
        L_0x0a7b:
            int r0 = r1.size()
            if (r0 != r7) goto L_0x0ae7
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "bizsearch"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0ae7
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "onboarding-sheet"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0ae7
            X.0yC r6 = r3.A01
            r4 = 5465(0x1559, float:7.658E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r6, r4)
            if (r0 == 0) goto L_0x0ae7
            goto L_0x0ae4
        L_0x0ab6:
            java.lang.String r0 = "bizsearch"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            int r0 = r1.size()
            if (r0 != r2) goto L_0x0c4d
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "onboarding-sheet"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            X.0yC r3 = r3.A01
            r1 = 5465(0x1559, float:7.658E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r3, r1)
            if (r0 == 0) goto L_0x0c4d
        L_0x0ae4:
            r1 = 98
            return r1
        L_0x0ae7:
            int r0 = r1.size()
            if (r0 <= r2) goto L_0x0b0e
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "calling"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0b0e
            int r0 = r1.size()
            java.util.List r0 = r1.subList(r2, r0)
            int r1 = A03(r0)
            return r1
        L_0x0b0e:
            X.0yC r4 = r3.A01
            java.lang.String r0 = r8.toString()
            boolean r0 = A09(r4, r0)
            if (r0 == 0) goto L_0x0b50
            X.1DX r1 = r3.A08
            java.lang.String r7 = "DeepLinkHelper"
            java.lang.String r6 = "fetch_biz_info"
            java.util.Map r5 = r1.A02
            java.lang.Object r2 = r5.get(r6)
            X.0zf r2 = (X.C21700zf) r2
            if (r2 != 0) goto L_0x0b4a
            X.173 r4 = r1.A00
            r0 = 701183835(0x29cb375b, float:9.0246136E-14)
            X.0zg r3 = new X.0zg
            r3.<init>(r0)
            X.0yC r2 = r1.A01
            r1 = 2560(0xa00, float:3.587E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0b43
            r0 = 1
            r3.A04 = r0
        L_0x0b43:
            X.0zf r2 = r4.A01(r3, r6)
            r5.put(r6, r2)
        L_0x0b4a:
            r0 = -1
            r2.A0D(r7, r0)
            return r15
        L_0x0b50:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x0b65
            java.lang.Object r3 = r1.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = "biz-"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x0b65
            return r2
        L_0x0b65:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x0b7a
            java.lang.Object r3 = r1.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = "event-link"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x0b7a
            return r2
        L_0x0b7a:
            int r0 = r1.size()
            if (r0 != r7) goto L_0x0bab
            java.lang.Object r3 = r1.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = "invite"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0bab
            java.lang.Object r3 = r1.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = "invite-a-friend"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0bab
            r1 = 112(0x70, float:1.57E-43)
            return r1
        L_0x0bab:
            int r0 = r1.size()
            if (r0 != r7) goto L_0x0bdc
            java.lang.Object r3 = r1.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = "contacts"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0bdc
            java.lang.Object r3 = r1.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = "permission"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0bdc
            r1 = 114(0x72, float:1.6E-43)
            return r1
        L_0x0bdc:
            int r0 = r1.size()
            if (r0 != r7) goto L_0x0c0d
            java.lang.Object r3 = r1.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = "notifications"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0c0d
            java.lang.Object r3 = r1.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = "permission"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0c0d
            r1 = 115(0x73, float:1.61E-43)
            return r1
        L_0x0c0d:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x0c2a
            java.lang.Object r3 = r1.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = "edit-profile-picture"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0c2a
            r1 = 47
            return r1
        L_0x0c2a:
            int r0 = r1.size()
            if (r0 == r2) goto L_0x0c36
            int r0 = r1.size()
            if (r0 != 0) goto L_0x0c4d
        L_0x0c36:
            r2 = 2
            return r2
        L_0x0c38:
            java.lang.String r0 = "biz-linked-accounts"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0c4d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0c4d
        L_0x0c46:
            r1 = 51
            return r1
        L_0x0c49:
            return r18
        L_0x0c4a:
            r1 = 56
            return r1
        L_0x0c4d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DW.A0C(android.net.Uri):int");
    }

    public AnonymousClass1DW(C19460v5 r1, C19460v5 r2, C24801Dv r3, C19730wQ r4, AnonymousClass1DX r5, AnonymousClass1DY r6, C20810yC r7, AnonymousClass1DU r8, C24671Di r9, C24591Da r10, C24771Ds r11, AnonymousClass12U r12, AnonymousClass1DV r13, C24781Dt r14) {
        this.A01 = r7;
        this.A07 = r4;
        this.A02 = r8;
        this.A08 = r5;
        this.A00 = r1;
        this.A09 = r6;
        this.A04 = r10;
        this.A03 = r9;
        this.A0B = r12;
        this.A0A = r11;
        this.A0D = r14;
        this.A05 = r2;
        this.A06 = r3;
        this.A0C = r13;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        r1 = r1.A01;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A00(android.net.Uri r6, java.util.List r7) {
        /*
            r5 = this;
            int r0 = r7.size()
            r2 = 1
            if (r0 == 0) goto L_0x0047
            X.0yC r4 = r5.A01
            r0 = 504(0x1f8, float:7.06E-43)
            X.0yV r3 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r3, r4, r0)
            if (r0 == 0) goto L_0x0047
            boolean r0 = r5.A07()
            if (r0 == 0) goto L_0x0047
            r0 = 0
            java.lang.Object r1 = r7.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "account"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00cf
            int r0 = r7.size()
            if (r0 <= r2) goto L_0x00cf
            java.lang.Object r1 = r7.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1711740600: goto L_0x0048;
                case -1335458389: goto L_0x0084;
                case 51309: goto L_0x008f;
                case 734040243: goto L_0x009a;
                case 1147181203: goto L_0x00a5;
                case 1302948958: goto L_0x00c4;
                default: goto L_0x0047;
            }
        L_0x0047:
            return r2
        L_0x0048:
            java.lang.String r0 = "verify-email"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0047
            X.1DY r1 = r5.A09
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x0047
            X.0v0 r1 = r1.A01
            java.lang.String r0 = r1.A0i()
            if (r0 == 0) goto L_0x0047
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0047
            X.005 r0 = r1.A00
            java.lang.Object r3 = r0.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r1 = "settings_verification_email_address_verified"
            r0 = 0
            boolean r0 = r3.getBoolean(r1, r0)
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = A06(r6)
            boolean r0 = X.AnonymousClass6RR.A00(r0)
            if (r0 != 0) goto L_0x0047
            r0 = 96
            return r0
        L_0x0084:
            java.lang.String r0 = "delete"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0047
            r0 = 22
            return r0
        L_0x008f:
            java.lang.String r0 = "2fa"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0047
            r0 = 67
            return r0
        L_0x009a:
            java.lang.String r0 = "account_switcher"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0047
            r0 = 75
            return r0
        L_0x00a5:
            java.lang.String r0 = "business-platforms"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = r6.getScheme()
            java.lang.String r0 = "whatsapp-smb"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0047
            r0 = 4705(0x1261, float:6.593E-42)
            boolean r0 = X.C20800yB.A01(r3, r4, r0)
            if (r0 == 0) goto L_0x0047
            r2 = 87
            return r2
        L_0x00c4:
            java.lang.String r0 = "request_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0047
            r0 = 23
            return r0
        L_0x00cf:
            java.lang.String r0 = "chats"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x012f
            int r0 = r7.size()
            if (r0 <= r2) goto L_0x00fc
            java.lang.Object r1 = r7.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "backup"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x013a
            java.lang.String r0 = "history"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00fc
            r0 = 24
            return r0
        L_0x00fc:
            java.lang.String r0 = "page"
            java.lang.String r1 = r6.getQueryParameter(r0)
            int r0 = r7.size()
            if (r0 != r2) goto L_0x0047
            java.util.Set r0 = r6.getQueryParameterNames()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x012c
            if (r1 == 0) goto L_0x0047
            java.lang.String r0 = "theme"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x012c
            java.lang.String r0 = "font"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x012c
            java.lang.String r0 = "language"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0047
        L_0x012c:
            r0 = 36
            return r0
        L_0x012f:
            java.lang.String r0 = "storage-management"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0047
            r0 = 88
            return r0
        L_0x013a:
            r0 = 110(0x6e, float:1.54E-43)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DW.A00(android.net.Uri, java.util.List):int");
    }

    private int A02(List list) {
        if (!list.isEmpty() && A07()) {
            Object obj = list.get(0);
            if (!C20800yB.A01(C21000yV.A02, this.A01, 728) || !"20210210".equals(obj)) {
                return 1;
            }
            return 27;
        }
        return 1;
    }

    public static int A03(List list) {
        if (list.size() != 2 || !((String) list.get(0)).toLowerCase(Locale.US).equals("awareness") || !((String) list.get(1)).toLowerCase(Locale.US).equals("group-call")) {
            return 1;
        }
        return 99;
    }

    public static String A06(Uri uri) {
        boolean equals;
        List<String> pathSegments;
        String str;
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            String lowerCase = scheme.toLowerCase(Locale.US);
            String host = uri.getHost();
            if (!TextUtils.isEmpty(host)) {
                Locale locale = Locale.US;
                if (A0B(lowerCase, host.toLowerCase(locale))) {
                    pathSegments = uri.getPathSegments().subList(1, uri.getPathSegments().size());
                } else {
                    if (SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equals(lowerCase)) {
                        equals = true;
                    } else {
                        equals = "whatsapp-consumer".equals(lowerCase);
                    }
                    if (equals) {
                        pathSegments = uri.getPathSegments();
                    }
                }
                if (pathSegments.size() < 3) {
                    str = "deeplinkhelper/parseVerifyEmailOtp/invalid uri";
                } else {
                    String lowerCase2 = pathSegments.get(2).toLowerCase(locale);
                    if (lowerCase2.length() == 6) {
                        try {
                            Integer.parseInt(lowerCase2);
                            return lowerCase2;
                        } catch (NumberFormatException e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("deeplinkhelper/parseVerifyEmailOtp/NumberFormatException: ");
                            sb.append(e);
                            Log.e(sb.toString());
                            return null;
                        }
                    } else {
                        str = "deeplinkhelper/parseVerifyEmailOtp/invalid length";
                    }
                }
                Log.e(str);
            }
        }
        return null;
    }

    public static boolean A0A(C20810yC r3, String str) {
        if (!A09(r3, str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str.toLowerCase(Locale.US));
            if (parse == null || parse.getQueryParameterNames().isEmpty() || !"1".equals(parse.getQueryParameter("qr"))) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0 != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0D(android.net.Uri r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = r3.getHost()
            boolean r0 = A0B(r0, r1)
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "api.whatsapp.com"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r1 = 1
        L_0x0018:
            java.util.List r0 = r3.getPathSegments()
            int r0 = r0.size()
            if (r0 > r1) goto L_0x0024
            r0 = 0
            return r0
        L_0x0024:
            java.util.List r0 = r3.getPathSegments()
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DW.A0D(android.net.Uri):java.lang.String");
    }

    public void A0E(Uri uri) {
        int i;
        List<String> pathSegments = uri.getPathSegments();
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            String host = uri.getHost();
            if (host == null || !A0B(scheme, host)) {
                if ((!SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equals(scheme) && !"whatsapp-consumer".equals(scheme)) || pathSegments.size() < 1) {
                    return;
                }
                if (pathSegments.size() == 1) {
                    i = 0;
                } else {
                    pathSegments.get(1);
                    return;
                }
            } else if (pathSegments.size() >= 3) {
                i = 2;
            } else {
                return;
            }
            pathSegments.get(i);
        }
    }

    public boolean A0F(String str) {
        if (TextUtils.isEmpty(str) || 33 != A0C(Uri.parse(str))) {
            return false;
        }
        return true;
    }

    public boolean A0G(String str) {
        if (TextUtils.isEmpty(str) || 6 != A0C(Uri.parse(str))) {
            return false;
        }
        return true;
    }

    public boolean A0H(String str) {
        if (TextUtils.isEmpty(str) || 5 != A0C(Uri.parse(str))) {
            return false;
        }
        return true;
    }

    public boolean A0I(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (33 != A0C(parse) || !parse.getPathSegments().get(0).equals("video")) {
            return false;
        }
        return true;
    }
}
