package X;

import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7sj  reason: invalid class name and case insensitive filesystem */
public class C165007sj implements C25711Hj {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C165007sj(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj4;
        this.A02 = obj3;
        this.A03 = obj2;
    }

    public final void accept(Object obj) {
        C128716Di r13;
        C133316Xv r5;
        AnonymousClass6E7 r4;
        C159657ji r3;
        Object obj2;
        String str;
        Object A11;
        Object obj3;
        Object obj4 = obj;
        switch (this.A04) {
            case 0:
                File file = (File) this.A01;
                C146506vi r52 = (C146506vi) this.A02;
                C121525tH r42 = (C121525tH) this.A03;
                Number number = (Number) obj4;
                C36321k7.A1K(number, "external-mutations-uploader: media-job-finished for upload, mediaJobResult: ", AnonymousClass000.A0u());
                long length = file.length();
                file.delete();
                r52.A05();
                int intValue = number.intValue();
                if (intValue == 0) {
                    C123865xD A042 = r52.A04();
                    if (A042 != null) {
                        C129146Fj r0 = A042.A02;
                        String A043 = r0.A04();
                        String A032 = r0.A03();
                        String A06 = r0.A06();
                        String A05 = r0.A05();
                        C132046Rx A002 = r0.A00();
                        if (A002 == null || TextUtils.isEmpty(A043) || TextUtils.isEmpty(A032) || TextUtils.isEmpty(A06) || TextUtils.isEmpty(A05)) {
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("create-external-blob-reference response is missing field/s; handle = ");
                            A0u.append(A043);
                            A0u.append("; directPath = ");
                            A0u.append(A032);
                            A0u.append("; mediaHash = ");
                            A0u.append(A06);
                            A0u.append("; mediaEncHash = ");
                            A0u.append(A05);
                            C36321k7.A1J(A002, "; mediaKey = ", A0u);
                        } else {
                            AnonymousClass8NN A0p = C100024uL.DEFAULT_INSTANCE.A0p();
                            AnonymousClass8I5 A0O = C90474aD.A0O(A0p, A002.A01);
                            C100024uL r32 = (C100024uL) A0p.A00;
                            r32.bitField0_ |= 1;
                            r32.mediaKey_ = A0O;
                            C100024uL r33 = (C100024uL) C90524aI.A0H(A0p);
                            A032.getClass();
                            r33.bitField0_ |= 2;
                            r33.directPath_ = A032;
                            C100024uL r34 = (C100024uL) C90524aI.A0H(A0p);
                            A043.getClass();
                            r34.bitField0_ |= 4;
                            r34.handle_ = A043;
                            C100024uL r35 = (C100024uL) C90524aI.A0H(A0p);
                            r35.bitField0_ |= 8;
                            r35.fileSizeBytes_ = length;
                            byte[] decode = Base64.decode(A06, 0);
                            AnonymousClass8I5 A012 = C21674AUx.A01(decode, 0, decode.length);
                            C100024uL r1 = (C100024uL) C90524aI.A0H(A0p);
                            r1.bitField0_ |= 16;
                            r1.fileSha256_ = A012;
                            byte[] decode2 = Base64.decode(A05, 0);
                            AnonymousClass8I5 A013 = C21674AUx.A01(decode2, 0, decode2.length);
                            C100024uL r12 = (C100024uL) C90524aI.A0H(A0p);
                            r12.bitField0_ |= 32;
                            r12.fileEncSha256_ = A013;
                            C100024uL r36 = (C100024uL) A0p.A0R();
                            if (r36 != null) {
                                C36321k7.A1K(r36, "external-mutations-uploader: media-job-finished for upload with response = ", AnonymousClass000.A0u());
                                C195199Sw r2 = r42.A02;
                                r2.A04 = r36;
                                r2.A07 = null;
                                r42.A01.A0C(r2.A00());
                                return;
                            }
                        }
                    }
                    Log.i("external-mutations-uploader: media-job-finished for upload but response has missing fields");
                } else if (AnonymousClass6H7.A01(intValue)) {
                    r42.A01.A0D(new C1032654p(AnonymousClass000.A1S(intValue, 8), "prepare-syncd-mutations-helper/startPrepareJob/onTransientFailure: Upload error"));
                    return;
                }
                r42.A01.A0D(new C1032554o("prepare-syncd-mutations-helper/startPrepareJob/onFailed: Upload error", (Exception) null));
                return;
            case 1:
                r5 = (C133316Xv) this.A00;
                r4 = (AnonymousClass6E7) this.A01;
                r13 = (C128716Di) this.A02;
                r3 = (C159657ji) this.A03;
                AnonymousClass011 r7 = (AnonymousClass011) obj4;
                AnonymousClass00C.A0D(r7, 5);
                AnonymousClass1KT r6 = r5.A0H;
                boolean A1X = AnonymousClass000.A1X(r7.first);
                int hashCode = r4.A05.hashCode();
                r6.A04(hashCode, "psl_cache_hit", A1X);
                if (AnonymousClass000.A1X(r7.first)) {
                    r5.A0K.A05(hashCode, 2);
                    obj2 = r7.second;
                    if (obj2 == null) {
                        throw C36381kD.A0k();
                    }
                } else {
                    C133316Xv.A01(r5, r4, r13, r3);
                    return;
                }
                break;
            default:
                r5 = (C133316Xv) this.A00;
                r4 = (AnonymousClass6E7) this.A01;
                r13 = (C128716Di) this.A02;
                r3 = (C159657ji) this.A03;
                AnonymousClass011 r72 = (AnonymousClass011) obj4;
                AnonymousClass00C.A0D(r72, 5);
                short s = 3;
                if (AnonymousClass000.A1X(r72.first)) {
                    s = 2;
                }
                r5.A0K.A05(r4.A05.hashCode(), s);
                if (AnonymousClass000.A1X(r72.first)) {
                    obj2 = r72.second;
                    if (obj2 == null) {
                        throw C36381kD.A0k();
                    }
                } else {
                    return;
                }
                break;
        }
        String str2 = (String) obj2;
        String str3 = r4.A05;
        C117105li r62 = r5.A09;
        UserJid userJid = r4.A02;
        UserJid userJid2 = userJid;
        String str4 = r4.A08;
        LinkedHashMap A07 = C000400e.A07(C36441kJ.A19("chat_jid", userJid), C36441kJ.A19("key_msg_id", str4));
        AnonymousClass00C.A0D(A07, 0);
        HashMap hashMap = r62.A00;
        hashMap.clear();
        hashMap.putAll(A07);
        AnonymousClass011[] r8 = new AnonymousClass011[17];
        String str5 = r4.A06;
        String str6 = r4.A04;
        if (C133316Xv.A07(str5, str6)) {
            str = "navigate";
        } else {
            str = "INIT";
        }
        C36341k9.A1J("action", str, r8, 0);
        if (C133316Xv.A07(str5, str6)) {
            Map map = r4.A0A;
            Object obj5 = null;
            if (map != null) {
                obj3 = map.get("screen");
            } else {
                obj3 = null;
            }
            if (map != null) {
                obj5 = map.get("data");
            }
            AnonymousClass011[] r15 = new AnonymousClass011[2];
            AnonymousClass011[] r14 = new AnonymousClass011[2];
            C36341k9.A1J(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, obj3, r14, 0);
            C36341k9.A1J(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "screen", r14, 1);
            C36341k9.A1J("next", C000400e.A07(r14), r15, 0);
            C36341k9.A1J("data", obj5, r15, 1);
            A11 = C000400e.A07(r15);
        } else {
            A11 = C36391kE.A11("business_payload", C36391kE.A11("action", "INIT"));
        }
        C36341k9.A1J("action_payload", A11, r8, 1);
        C36341k9.A1J("message_id", str4, r8, 2);
        String str7 = r4.A09;
        C90474aD.A1G("session_id", str7, r8);
        C90484aE.A1H("product_qpl_session_id", C132586Uj.A00(AnonymousClass000.A0p("wae", str7, AnonymousClass000.A0u())), r8);
        r8[5] = C36441kJ.A19("flow_token", r4.A07);
        r8[6] = C36441kJ.A19("flow_message_version", str5);
        r8[7] = C36441kJ.A19("extension_id", str3);
        r8[8] = C36441kJ.A19("business_jid", userJid2.getRawString());
        r8[9] = C36441kJ.A19("version", r4.A00);
        r8[10] = C36441kJ.A19("is_draft", Boolean.valueOf(r4.A0B));
        String str8 = r13.A00;
        r8[11] = C36441kJ.A19("extension_status", str8);
        r8[12] = C36441kJ.A19("user_locale", r5.A0D.A07());
        AnonymousClass011[] r142 = new AnonymousClass011[2];
        C36341k9.A1J(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "modal", r142, 0);
        C36341k9.A1J("modal_type", "bottom_sheet", r142, 1);
        r8[13] = C36441kJ.A19("overwrite_first_screen_presentation", C36391kE.A11("style", C000400e.A07(r142)));
        r8[14] = C36441kJ.A19("action_name", "galaxy_message");
        r8[15] = C36441kJ.A19("is_modal_on_screen", true);
        r8[16] = C36441kJ.A19("flow_json_version", Integer.valueOf(r13.A01));
        LinkedHashMap A072 = C000400e.A07(r8);
        boolean A0J = AnonymousClass00C.A0J(str8, "DRAFT");
        AnonymousClass691 A003 = C110485ak.A00(str4, str3);
        C1268565x r11 = r5.A0M;
        String str9 = A003.A00;
        AnonymousClass9XM A004 = r11.A00(str9);
        if (!(!A0J || A004 == null || A004.A00() == null)) {
            if (r5.A0L.A0E(4819)) {
                AnonymousClass6EW A022 = r5.A0N.A02(r4.A03);
                C19630wG r73 = r5.A0B;
                A022.A02(new AnonymousClass70B(C36371kC.A0v(r73, R.string.f12nameremoved), C36371kC.A0v(r73, R.string.f12nameremoved), C36371kC.A0v(r73, R.string.f12nameremoved), new C153567Ov(r5, r4, r3, A003, str2, A072), new C153577Ow(r5, r4, r3, A003, str2, A072)));
                return;
            }
            r11.A01(str9);
        }
        if (C133316Xv.A07(str5, str6)) {
            r5.A0F.A09(userJid2, str3, str4, str7, new AnonymousClass7Z2(r5, r4, r3, A003, str2, A072, A0J));
            return;
        }
        C133316Xv.A03(r5, r4, (AnonymousClass7hO) null, r3, A003, str2, A072, A0J);
    }
}
