package X;

import android.app.Activity;
import com.whatsapp.jid.UserJid;
import javax.crypto.SecretKey;

/* renamed from: X.6tm  reason: invalid class name and case insensitive filesystem */
public final class C145366tm implements C160037kM {
    public final Activity A00;
    public final AnonymousClass6MG A01;
    public final AnonymousClass17Y A02;
    public final C1258061i A03;
    public final C594233w A04;
    public final AnonymousClass6OE A05;
    public final C19970wo A06;
    public final C20310xM A07;
    public final AnonymousClass6TL A08;
    public final C20810yC A09;
    public final AnonymousClass1A1 A0A;
    public final C19770wU A0B;
    public final AnonymousClass67S A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final SecretKey A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final byte[] A0K;

    public static final void A00(Activity activity, C594233w r7, AnonymousClass2Uv r8, C145366tm r9, String str, String str2, String str3, boolean z, boolean z2) {
        String str4 = str3;
        r9.A02.Bp3(new AnonymousClass74E(activity, r9, r7, r8, str4, str2, str, 1, z, z2));
    }

    public void BV7(String str) {
        A00(this.A00, this.A04, (AnonymousClass2Uv) null, this, str, (String) null, (String) null, true, false);
    }

    public void BZU(boolean z, String str) {
    }

    public C145366tm(Activity activity, AnonymousClass6MG r3, AnonymousClass17Y r4, C1258061i r5, C594233w r6, AnonymousClass6OE r7, C19970wo r8, C20310xM r9, AnonymousClass6TL r10, C20810yC r11, AnonymousClass1A1 r12, C19770wU r13, AnonymousClass67S r14, String str, String str2, String str3, String str4, SecretKey secretKey, byte[] bArr, boolean z, boolean z2) {
        this.A00 = activity;
        this.A04 = r6;
        this.A0I = z;
        this.A03 = r5;
        this.A0G = str;
        this.A0F = str2;
        this.A0E = str3;
        this.A0D = str4;
        this.A0J = z2;
        this.A0H = secretKey;
        this.A0K = bArr;
        this.A0C = r14;
        this.A01 = r3;
        this.A02 = r4;
        this.A0B = r13;
        this.A07 = r9;
        this.A09 = r11;
        this.A08 = r10;
        this.A06 = r8;
        this.A05 = r7;
        this.A0A = r12;
    }

    public void BV8(UserJid userJid, String str, int i, boolean z, boolean z2) {
        C36321k7.A0w(userJid, str);
        C36421kH.A1G(this.A0B, this, userJid, str, 23);
    }
}
