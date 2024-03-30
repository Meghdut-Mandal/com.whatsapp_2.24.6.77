package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6Xv  reason: invalid class name and case insensitive filesystem */
public final class C133316Xv {
    public int A00;
    public C203639oR A01;
    public final AnonymousClass1K9 A02;
    public final AnonymousClass17Y A03;
    public final AnonymousClass1KK A04;
    public final AnonymousClass16D A05;
    public final AnonymousClass185 A06;
    public final C27761Ps A07;
    public final AnonymousClass6OE A08;
    public final C117105li A09;
    public final C19970wo A0A;
    public final C19630wG A0B;
    public final AnonymousClass1KW A0C;
    public final C18820ts A0D;
    public final AnonymousClass6NP A0E;
    public final C26461Kg A0F;
    public final C26501Kk A0G;
    public final AnonymousClass1KT A0H;
    public final C1037856y A0I;
    public final C26451Kf A0J;
    public final C26551Kp A0K;
    public final C20810yC A0L;
    public final C1268565x A0M;
    public final C131376Ou A0N;
    public final C19770wU A0O;
    public final AnonymousClass005 A0P;
    public final AtomicBoolean A0Q = C36431kI.A1H();
    public final C19600wD A0R;
    public final C25851Hx A0S;
    public final C20310xM A0T;
    public final AnonymousClass1VZ A0U;
    public final AnonymousClass6MJ A0V;
    public final C26491Kj A0W;

    public static final void A02(C133316Xv r11, AnonymousClass6E7 r12, C128716Di r13, C159657ji r14) {
        C133316Xv r9 = r11;
        C26551Kp r1 = r11.A0K;
        String str = r12.A05;
        int hashCode = str.hashCode();
        AnonymousClass5TS r2 = AnonymousClass5TS.USER_INTERACTION;
        String str2 = r12.A08;
        String str3 = r12.A09;
        r1.A0C(r2, r12.A02, Boolean.valueOf(r12.A0B), str, str2, str3, hashCode);
        C128716Di r112 = r13;
        C159657ji r10 = r14;
        if (!AnonymousClass00C.A0J(r13.A00, "DRAFT")) {
            r9.A0G.A00(str, hashCode).A0B(new C165007sj(r9, r10, r112, r12, 1), r9.A03.A04);
            return;
        }
        r9.A0H.A04(hashCode, "psl_cache_hit", false);
        A01(r9, r12, r13, r14);
    }

    public static final boolean A07(String str, String str2) {
        try {
            if (Long.parseLong(str) >= 3) {
                if (str2 == null || str2.length() == 0 || "navigate".equals(str2)) {
                    return true;
                }
                return false;
            }
        } catch (NumberFormatException e) {
            Log.w(C36331k8.A0i("SExtensionsLogger/PhoenixExtensionsFlowManager/isExtensionInitWithoutDataChannel()/Error - ", AnonymousClass000.A0u(), e));
        }
        return false;
    }

    public static final void A00(C133316Xv r16, AnonymousClass6E7 r17, int i, boolean z) {
        int i2;
        String str;
        AnonymousClass6E7 r4 = r17;
        UserJid userJid = r4.A02;
        String str2 = r4.A08;
        int i3 = 0;
        C133316Xv r3 = r16;
        AnonymousClass3T1 A022 = r3.A0U.A02(new C64933Qa(userJid, str2, false));
        JSONObject A1B = C36441kJ.A1B();
        String A023 = C132586Uj.A00.A02(r3.A0C, str2, false);
        String A0b = C90464aC.A0b(r4.A09);
        AnonymousClass00C.A08(A0b);
        try {
            A1B.put("cta", "galaxy_message");
            A1B.put("flow_id", r4.A05);
            A1B.put("extensions_message_id", A023);
            A1B.put("session_id", A0b);
            A1B.put("data_channel_navigation", z);
            if (r4.A0C) {
                i3 = 1;
            }
            A1B.put("extension_restored_from_cache", i3);
        } catch (JSONException e) {
            Log.w(C36331k8.A0i("SExtensionsLogger/PhoenixExtensionsFlowMessage/reportWamEvent()/Error - ", AnonymousClass000.A0u(), e));
        }
        int A002 = C110465ai.A00(r3.A06.A01(userJid));
        AnonymousClass9Xu A012 = r3.A0S.A01.A01(userJid);
        if (A022 != null) {
            i2 = AnonymousClass6UH.A01(A022.A1I, A022.A09, C66013Ui.A0q(A022));
        } else {
            i2 = 1;
        }
        AnonymousClass6NP r11 = r3.A0E;
        String A0y = C36381kD.A0y(A1B);
        Integer valueOf = Integer.valueOf(A002);
        String str3 = null;
        if (A012 != null) {
            str3 = A012.A06;
            str = A012.A05;
        } else {
            str = null;
        }
        r11.A01(userJid, A022, valueOf, A0y, str3, str, str2, i);
        HashMap A0J2 = AnonymousClass001.A0J();
        A0J2.put("business_jid", userJid.user);
        A0J2.put("ext_session_id", A0b);
        A0J2.put("ext_message_id", A023);
        A0J2.put("message_media_type", C90514aH.A0l("biz_platform", valueOf, A0J2, i2));
        C203639oR r0 = r3.A01;
        if (r0 == null) {
            throw C36331k8.A0d("fdsManager");
        }
        r0.A0F(A0J2);
    }

    public static final void A01(C133316Xv r8, AnonymousClass6E7 r9, C128716Di r10, C159657ji r11) {
        C26491Kj r2 = r8.A0W;
        String str = r9.A05;
        String str2 = r10.A05;
        if (str2 != null) {
            r2.A0G(new C145236tZ(r8, r9, r10, r11), str, str2, r10.A06, AnonymousClass00C.A0J(r10.A00, "DRAFT"), false);
            return;
        }
        throw C36381kD.A0k();
    }

    public static final void A03(C133316Xv r13, AnonymousClass6E7 r14, AnonymousClass7hO r15, C159657ji r16, AnonymousClass691 r17, String str, Map map, boolean z) {
        Bitmap bitmap;
        String str2;
        r13.A01 = r13.A02.A00(r17);
        UserJid userJid = r14.A02;
        HashMap A0J2 = AnonymousClass001.A0J();
        AnonymousClass3L0 A012 = r13.A06.A01(userJid);
        if (!(A012 == null || (str2 = A012.A08) == null)) {
            A0J2.put("business_name", str2);
        }
        if (r13.A0L.A0E(4078)) {
            AnonymousClass141 A082 = r13.A05.A08(userJid);
            Context context = r13.A0B.A00;
            float A042 = C90494aF.A04(context);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            if (A082 != null) {
                bitmap = r13.A07.A05(context, A082, A042, dimensionPixelSize);
            } else {
                bitmap = null;
            }
            ByteArrayOutputStream A0Q2 = C90524aI.A0Q();
            if (bitmap != null) {
                C90514aH.A1F(bitmap, A0Q2);
            }
            String encodeToString = Base64.encodeToString(A0Q2.toByteArray(), 0);
            if (encodeToString != null) {
                A0J2.put("business_profile_logo", encodeToString);
            }
        }
        C203639oR r0 = r13.A01;
        if (r0 == null) {
            throw C36331k8.A0d("fdsManager");
        }
        r0.A0F(A0J2);
        A00(r13, r14, 0, !A07(r14.A06, r14.A04));
        r13.A0I.A08(Integer.valueOf(r13.A00), "startFlow");
        C134906bn r7 = null;
        boolean z2 = z;
        if (z) {
            r7 = new C134906bn(1000, "PHOENIX", false);
        }
        C203639oR r4 = r13.A01;
        if (r4 == null) {
            throw C36331k8.A0d("fdsManager");
        }
        r4.A0C(new C165387tL(r13, r15, 0), new C132826Vk(r14, r16, r13, 1), r7, r14.A05, str, r14.A03, map, z2);
    }

    public static final void A04(C133316Xv r6, AnonymousClass6E7 r7, boolean z) {
        C23043B1o b1o;
        C207219uk BA8;
        C207089uX r0;
        AnonymousClass3T1 A022 = r6.A0U.A02(C90504aG.A0T(r7.A02, r7.A08));
        Object obj = null;
        if ((A022 instanceof C23043B1o) && (b1o = (C23043B1o) A022) != null && (BA8 = b1o.BA8()) != null && BA8.A00 == 5 && (r0 = BA8.A04) != null) {
            Iterator it = r0.A03.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C90504aG.A1X(next, "galaxy_message")) {
                    obj = next;
                    break;
                }
            }
            C206569tc r3 = (C206569tc) obj;
            if (r3 != null) {
                r3.A00 = z;
            }
            r6.A0T.A0k(A022);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C133316Xv r7, X.C159657ji r8, java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "extensions-features-disabled"
            boolean r6 = r9.equals(r0)
            X.56y r3 = r7.A0I
            if (r6 == 0) goto L_0x0068
            int r0 = r7.A00
            X.C90504aG.A1D(r3, r0)
            X.1KT r4 = r7.A0H
            int r0 = r10.hashCode()
            X.C90504aG.A1D(r4, r0)
        L_0x0018:
            X.0wG r1 = r7.A0B
            r0 = 2131889639(0x7f120de7, float:1.9413947E38)
            java.lang.String r5 = X.C36371kC.A0v(r1, r0)
            X.0wD r0 = r7.A0R
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0052
            r0 = 2131889638(0x7f120de6, float:1.9413945E38)
        L_0x002c:
            java.lang.String r5 = X.C36371kC.A0v(r1, r0)
        L_0x0030:
            if (r8 == 0) goto L_0x004c
            X.2ov r0 = X.C52122ov.A02
            java.lang.String r1 = r0.key
            X.6Bf r0 = X.C128176Bf.A00(r5)
            java.util.Map r3 = X.C36391kE.A11(r1, r0)
            java.lang.Integer r2 = X.C90494aF.A0U()
            java.lang.String r1 = "ExtensionError"
            X.6PH r0 = new X.6PH
            r0.<init>(r2, r1, r5)
            r8.BXS(r0, r3)
        L_0x004c:
            X.0zE r0 = r4.A04
            r0.BpN()
            return
        L_0x0052:
            java.lang.String r0 = "extensions-banned-id-error"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0064
            if (r6 != 0) goto L_0x0064
            java.lang.String r0 = "extensions-integrity-check-failed"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0030
        L_0x0064:
            r0 = 2131889644(0x7f120dec, float:1.9413957E38)
            goto L_0x002c
        L_0x0068:
            int r1 = r7.A00
            java.lang.String r0 = "error_message"
            r3.A03(r1, r0, r9)
            int r0 = r7.A00
            r2 = 3
            r3.A05(r0, r2)
            X.1KT r4 = r7.A0H
            int r1 = r10.hashCode()
            r0 = 0
            r4.A0B(r1, r9, r0)
            r4.A0C(r1, r2)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133316Xv.A05(X.6Xv, X.7ji, java.lang.String, java.lang.String):void");
    }

    public static final boolean A06(C133316Xv r13, AnonymousClass6E7 r14, C128716Di r15, C121585tN r16, C159657ji r17) {
        String str;
        AnonymousClass5SG A012 = r13.A0V.A01(r15, r16.A01, r14.A06);
        if (A012.ordinal() == 0) {
            return false;
        }
        if (A012 == AnonymousClass5SG.UNKNOWN_VERSION) {
            str = "extensions-metadata-unknown-version";
        } else {
            str = "extensions-metadata-not-compatible";
        }
        String str2 = r14.A05;
        A05(r13, r17, str, str2);
        r13.A08.A02(r13.A06, r13.A0E, r14.A02, Boolean.valueOf(r14.A0C), "galaxy_message", str2, r14.A08, r14.A09, str, (String) null);
        return true;
    }

    public C133316Xv(AnonymousClass1K9 r23, AnonymousClass17Y r24, AnonymousClass1KK r25, C19600wD r26, AnonymousClass16D r27, AnonymousClass185 r28, C27761Ps r29, AnonymousClass6OE r30, C117105li r31, C19970wo r32, C19630wG r33, AnonymousClass1KW r34, C18820ts r35, C25851Hx r36, C20310xM r37, AnonymousClass1VZ r38, AnonymousClass6NP r39, C26461Kg r40, AnonymousClass6MJ r41, C26501Kk r42, C26491Kj r43, AnonymousClass1KT r44, C1037856y r45, C26451Kf r46, C26551Kp r47, C20810yC r48, C1268565x r49, C131376Ou r50, C19770wU r51, AnonymousClass005 r52) {
        C20810yC r0 = r48;
        C19770wU r3 = r51;
        C19970wo r15 = r32;
        C19630wG r14 = r33;
        AnonymousClass17Y r20 = r24;
        C36321k7.A1B(r15, r0, r20, r14, r3);
        AnonymousClass005 r2 = r52;
        C20310xM r13 = r37;
        AnonymousClass1K9 r21 = r23;
        C36321k7.A13(r21, r2, r13);
        C131376Ou r4 = r50;
        AnonymousClass00C.A0D(r4, 10);
        AnonymousClass1VZ r12 = r38;
        AnonymousClass185 r16 = r28;
        AnonymousClass1KK r19 = r25;
        C36321k7.A15(r12, r16, r19);
        C19600wD r18 = r26;
        AnonymousClass00C.A0D(r18, 15);
        C117105li r10 = r31;
        AnonymousClass00C.A0D(r10, 17);
        AnonymousClass6NP r6 = r39;
        C1268565x r5 = r49;
        AnonymousClass1KW r9 = r34;
        C18820ts r8 = r35;
        C90464aC.A1B(r9, r6, r8, r5);
        C27761Ps r11 = r29;
        AnonymousClass00C.A0D(r11, 26);
        AnonymousClass16D r17 = r27;
        AnonymousClass00C.A0D(r17, 27);
        C25851Hx r7 = r36;
        AnonymousClass00C.A0D(r7, 30);
        this.A0A = r15;
        this.A0L = r0;
        this.A03 = r20;
        this.A0B = r14;
        this.A0O = r3;
        this.A02 = r21;
        this.A0P = r2;
        this.A0T = r13;
        this.A08 = r30;
        this.A0N = r4;
        this.A0U = r12;
        this.A06 = r16;
        this.A04 = r19;
        this.A0F = r40;
        this.A0R = r18;
        this.A0G = r42;
        this.A09 = r10;
        this.A0I = r45;
        this.A0W = r43;
        this.A0C = r9;
        this.A0E = r6;
        this.A0D = r8;
        this.A0M = r5;
        this.A0J = r46;
        this.A0H = r44;
        this.A07 = r11;
        this.A05 = r17;
        this.A0K = r47;
        this.A0V = r41;
        this.A0S = r7;
    }
}
