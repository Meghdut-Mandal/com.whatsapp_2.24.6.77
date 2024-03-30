package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1KM  reason: invalid class name */
public final class AnonymousClass1KM {
    public long A00;
    public String A01;
    public String A02;
    public Map A03 = new HashMap();
    public final C19700wN A04;
    public final C19730wQ A05;
    public final AnonymousClass1KQ A06;
    public final AnonymousClass1KN A07;
    public final AnonymousClass1KO A08;
    public final AnonymousClass1KP A09;
    public final C19420v0 A0A;
    public final C20810yC A0B;
    public final AnonymousClass19A A0C;
    public final AnonymousClass17T A0D;

    public AnonymousClass1KM(C19700wN r2, C19730wQ r3, AnonymousClass1KQ r4, AnonymousClass1KN r5, AnonymousClass1KO r6, AnonymousClass1KP r7, C19420v0 r8, AnonymousClass17T r9, C20810yC r10, AnonymousClass19A r11) {
        AnonymousClass00C.A0D(r11, 1);
        AnonymousClass00C.A0D(r8, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r9, 5);
        AnonymousClass00C.A0D(r10, 7);
        AnonymousClass00C.A0D(r3, 9);
        this.A0C = r11;
        this.A0A = r8;
        this.A04 = r2;
        this.A07 = r5;
        this.A0D = r9;
        this.A08 = r6;
        this.A0B = r10;
        this.A09 = r7;
        this.A05 = r3;
        this.A06 = r4;
    }

    public final synchronized String A02(UserJid userJid) {
        String str;
        if (this.A02 == null || (str = this.A01) == null) {
            C19420v0 r0 = this.A0A;
            String rawString = userJid.getRawString();
            StringBuilder sb = new StringBuilder();
            sb.append("smb_business_direct_connection_enc_string_");
            sb.append(rawString);
            str = ((SharedPreferences) r0.A00.get()).getString(sb.toString(), (String) null);
        }
        return str;
    }

    public final synchronized void A03(C23021B0r b0r, C207109uZ r6, UserJid userJid, boolean z) {
        Map map = this.A03;
        List list = (List) map.get(userJid);
        if (list != null) {
            list.add(b0r);
        } else {
            map.put(userJid, AnonymousClass03T.A02(b0r));
            if (!C20800yB.A01(C21000yV.A02, this.A06.A00, 4281) || r6 == null || (!r6.A0Z)) {
                if (!z) {
                    String A012 = A01(userJid);
                    if (!(A012 == null || A012.length() == 0)) {
                        if (A02(userJid) == null || A06(userJid)) {
                            A00(this, r6, userJid);
                        }
                    }
                } else {
                    String rawString = userJid.getRawString();
                    C19420v0 r0 = this.A0A;
                    r0.A1M(rawString);
                    r0.A1K(rawString);
                    r0.A1L(rawString);
                    SharedPreferences.Editor A002 = C19420v0.A00(r0);
                    StringBuilder sb = new StringBuilder();
                    sb.append("dc_business_domain_");
                    sb.append(rawString);
                    A002.remove(sb.toString()).apply();
                }
                new AI6(userJid, this.A0C).A00(new C21107A8s(this, r6));
            }
            A05(userJid);
        }
    }

    public final synchronized void A04(UserJid userJid) {
        Map map = this.A03;
        List<C23021B0r> list = (List) map.get(userJid);
        if (list == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("DirectConnectionManager/onDirectConnectionInfoFailed/No listeners for jid - ");
            sb.append(userJid);
            Log.e(sb.toString());
        } else {
            for (C23021B0r b0r : list) {
                if (b0r != null) {
                    b0r.BVl(userJid);
                }
            }
            map.remove(userJid);
        }
    }

    public final synchronized void A05(UserJid userJid) {
        Map map = this.A03;
        List<C23021B0r> list = (List) map.get(userJid);
        if (list == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("DirectConnectionManager/onDirectConnectionInfoSucceeded/No listeners for jid - ");
            sb.append(userJid);
            Log.e(sb.toString());
        } else {
            for (C23021B0r b0r : list) {
                if (b0r != null) {
                    b0r.BVm(userJid);
                }
            }
            map.remove(userJid);
        }
    }

    public static final void A00(AnonymousClass1KM r11, C207109uZ r12, UserJid userJid) {
        AIA aia = new AIA(userJid, r11.A0C);
        aia.A00 = new C193009Jm(r11, r12, userJid);
        AnonymousClass19A r7 = aia.A02;
        String A092 = r7.A09();
        r7.A0E(aia, new C203399nx(new C203399nx("signed_user_info", new AnonymousClass1AL[]{new AnonymousClass1AL("biz_jid", aia.A01.getRawString())}), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) C177588e2.A00, "to"), new AnonymousClass1AL("xmlns", "w:biz:catalog"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092)}), A092, 287, 32000);
    }

    public final String A01(UserJid userJid) {
        C19420v0 r0 = this.A0A;
        String rawString = userJid.getRawString();
        StringBuilder sb = new StringBuilder();
        sb.append("smb_business_direct_connection_public_key_");
        sb.append(rawString);
        return ((SharedPreferences) r0.A00.get()).getString(sb.toString(), (String) null);
    }

    public final boolean A06(UserJid userJid) {
        long time = new Date().getTime();
        C19420v0 r0 = this.A0A;
        String rawString = userJid.getRawString();
        StringBuilder sb = new StringBuilder();
        sb.append("smb_business_direct_connection_enc_string_expired_timestamp_");
        sb.append(rawString);
        if (time > ((SharedPreferences) r0.A00.get()).getLong(sb.toString(), 0)) {
            return true;
        }
        return false;
    }
}
