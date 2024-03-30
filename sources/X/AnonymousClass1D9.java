package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.SecureRandom;

/* renamed from: X.1D9  reason: invalid class name */
public class AnonymousClass1D9 {
    public static final AnonymousClass1DB A06 = new AnonymousClass1DB(4, 5, false);
    public SecureRandom A00;
    public final C19700wN A01;
    public final C19970wo A02;
    public final AnonymousClass1A1 A03;
    public final C24051Aw A04;
    public final AnonymousClass1DC A05;

    public static C1256460s A01(C121555tK r3, InputStream inputStream, int i) {
        AnonymousClass54L r2;
        try {
            r2 = new AnonymousClass54L(r3, inputStream, i);
            do {
            } while (r2.read(new byte[DefaultCrypto.BUFFER_SIZE]) >= 0);
            C1256460s r0 = r2.A04;
            r2.close();
            return r0;
        } catch (IOException e) {
            Log.e("mediaupload/calculate-sidecar/ioexception", e);
            throw e;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static InputStream A02(C131516Pj r3, AnonymousClass1D9 r4, File file) {
        if (r3 instanceof AnonymousClass5BQ) {
            return new C107745Qr((AnonymousClass5BQ) r3, r4, r3.A01());
        }
        C18740tg.A06(file);
        FileInputStream A0J = AnonymousClass1GW.A0J(file);
        C25471Gl r1 = r3.A02.A06;
        if (!(AnonymousClass6Y1.A07(r1) || r1 == C25471Gl.A0B || r1 == C25471Gl.A0E || r1 == C25471Gl.A0j || r1 == C25471Gl.A0C || r1 == C25471Gl.A0K || r1 == C25471Gl.A0W)) {
            r4.A04.A05(A0J);
        }
        return new BufferedInputStream(A0J);
    }

    public C1495471q A05(AnonymousClass7gS r5, InputStream inputStream) {
        C107775Qv r3 = new C107775Qv(inputStream, MessageDigest.getInstance("SHA-256"));
        return new C1495471q(r3, new C107775Qv(r5.B6T(r3), MessageDigest.getInstance("SHA-256")), (C107775Qv) null, this);
    }

    public C121695tZ A06(C159427jL r6, C131516Pj r7, C119775qR r8) {
        C107775Qv r1;
        C132046Rx r0 = r8.A00;
        C18740tg.A06(r0);
        C1495471q A032 = A03(r6.BBX(r0.A01), r7, r7.A01());
        try {
            byte[] bArr = new byte[16384];
            do {
                r1 = A032.A01;
            } while (r1.read(bArr) >= 0);
            C121695tZ r02 = new C121695tZ(new AnonymousClass621(A032.A02.A00(), false), new AnonymousClass621(r1.A00(), false), r8);
            A032.close();
            return r02;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public AnonymousClass1D9(C19700wN r1, C19970wo r2, AnonymousClass1A1 r3, C24051Aw r4, AnonymousClass1DC r5) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
    }

    public static int A00(AnonymousClass3SC r3) {
        AnonymousClass11F r2 = r3.A01().A1J.A00;
        boolean z = true;
        if (r2 == null) {
            return 1;
        }
        if (r3.A02.size() <= 1) {
            z = false;
        }
        return C203229nZ.A01(r2, z);
    }

    public C1495471q A03(AnonymousClass7gS r4, C131516Pj r5, File file) {
        if (!r5.A02()) {
            C107775Qv r2 = new C107775Qv(A02(r5, this, file), MessageDigest.getInstance("SHA-256"));
            return new C1495471q(r2, r2, (C107775Qv) null, this);
        }
        int[] iArr = r5.A02.A0H;
        if (iArr == null || iArr.length <= 0) {
            return A05(r4, A02(r5, this, file));
        }
        return A04(r4, file, iArr);
    }

    public C1495471q A04(AnonymousClass7gS r8, File file, int[] iArr) {
        C18740tg.A06(file);
        FileInputStream A0J = AnonymousClass1GW.A0J(file);
        this.A04.A05(A0J);
        if (iArr.length == 4) {
            long j = (long) (iArr[0] + iArr[1] + iArr[2]);
            if (j != -1) {
                C107775Qv r4 = new C107775Qv(new BufferedInputStream(A0J), MessageDigest.getInstance("SHA-256"));
                C107775Qv r3 = new C107775Qv(new AnonymousClass5RB(r4, j), MessageDigest.getInstance("SHA-256"));
                return new C1495471q(r4, new C107775Qv(r8.B6T(new AnonymousClass5RC(r3, r4)), MessageDigest.getInstance("SHA-256")), r3, this);
            }
        }
        return A05(r8, new BufferedInputStream(A0J));
    }

    public String A07(C25471Gl r3, File file, boolean z) {
        AnonymousClass1DB A032;
        C18740tg.A0C(A08(r3, file, z));
        if (AnonymousClass6Y1.A03(r3)) {
            if (z) {
                A032 = A06;
            } else {
                A032 = AnonymousClass1DC.A03(file);
            }
            return AnonymousClass1DC.A06(A032);
        } else if (!AnonymousClass6Y1.A09(r3)) {
            return null;
        } else {
            int i = AnonymousClass1DC.A04(file).A01;
            if (i == 7) {
                return "video/quicktime";
            }
            if (i == 3) {
                return "video/3gpp";
            }
            return "video/mp4";
        }
    }

    public boolean A08(C25471Gl r3, File file, boolean z) {
        if (AnonymousClass6Y1.A03(r3)) {
            if (z || this.A05.A0F(file)) {
                return true;
            }
            return false;
        } else if (AnonymousClass6Y1.A09(r3)) {
            return this.A05.A0G(file);
        } else {
            return true;
        }
    }
}
