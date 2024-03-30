package X;

import android.app.Activity;
import com.whatsapp.jid.UserJid;
import javax.crypto.SecretKey;

/* renamed from: X.6tl  reason: invalid class name and case insensitive filesystem */
public final class C145356tl implements C160037kM {
    public final Activity A00;
    public final AnonymousClass6MG A01;
    public final AnonymousClass17Y A02;
    public final C1260062e A03;
    public final AnonymousClass6OE A04;
    public final C20310xM A05;
    public final C20810yC A06;
    public final AnonymousClass1A1 A07;
    public final C19770wU A08;
    public final AnonymousClass67S A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final SecretKey A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final byte[] A0H;

    public static final void A00(Activity activity, C1260062e r7, AnonymousClass2Uv r8, C145356tl r9, String str, String str2, String str3, boolean z, boolean z2) {
        String str4 = str3;
        r9.A02.Bp3(new AnonymousClass74E(activity, r7, r9, r8, str4, str2, str, 0, z, z2));
    }

    public void BV7(String str) {
        A00(this.A00, this.A03, (AnonymousClass2Uv) null, this, str, (String) null, (String) null, true, false);
    }

    public void BZU(boolean z, String str) {
    }

    public C145356tl(Activity activity, AnonymousClass6MG r3, AnonymousClass17Y r4, C1260062e r5, AnonymousClass6OE r6, C20310xM r7, C20810yC r8, AnonymousClass1A1 r9, C19770wU r10, AnonymousClass67S r11, String str, String str2, String str3, String str4, SecretKey secretKey, byte[] bArr, boolean z, boolean z2) {
        this.A00 = activity;
        this.A03 = r5;
        this.A0F = z;
        this.A0D = str;
        this.A0C = str2;
        this.A0B = str3;
        this.A0A = str4;
        this.A0G = z2;
        this.A0E = secretKey;
        this.A0H = bArr;
        this.A09 = r11;
        this.A01 = r3;
        this.A02 = r4;
        this.A08 = r10;
        this.A05 = r7;
        this.A06 = r8;
        this.A04 = r6;
        this.A07 = r9;
    }

    public void BV8(UserJid userJid, String str, int i, boolean z, boolean z2) {
        C36321k7.A0w(userJid, str);
        C36421kH.A1G(this.A08, this, userJid, str, 22);
    }
}
