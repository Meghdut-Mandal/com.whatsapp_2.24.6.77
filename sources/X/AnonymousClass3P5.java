package X;

import android.util.Base64;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3P5  reason: invalid class name */
public class AnonymousClass3P5 {
    public static final byte[] A08 = Base64.decode("UtfZhxytgNVaD5/UqJ8DNtx9FNSWzywusKGQuB+BmLY=", 2);
    public final C19970wo A00;
    public final C20810yC A01;
    public final C119665qF A02;
    public final C117325m5 A03;
    public final AnonymousClass32O A04;
    public final C19770wU A05;
    public final C237819v A06;
    public final C20400xV A07;

    public AnonymousClass3P5(C237819v r1, C19970wo r2, C20400xV r3, C20810yC r4, C119665qF r5, C117325m5 r6, AnonymousClass32O r7, C19770wU r8) {
        this.A00 = r2;
        this.A01 = r4;
        this.A05 = r8;
        this.A07 = r3;
        this.A04 = r7;
        this.A02 = r5;
        this.A06 = r1;
        this.A03 = r6;
    }

    public boolean A00(UserJid userJid) {
        if (AnonymousClass143.A0I(userJid)) {
            return false;
        }
        C20810yC r1 = this.A01;
        if (!r1.A0E(2966) || !r1.A0E(3336)) {
            return false;
        }
        if (userJid == null || !this.A07.A01(userJid)) {
            return true;
        }
        return false;
    }
}
