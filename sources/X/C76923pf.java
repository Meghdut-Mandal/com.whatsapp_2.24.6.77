package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.3pf  reason: invalid class name and case insensitive filesystem */
public class C76923pf implements C236119d {
    public final AnonymousClass11F A00;
    public final AnonymousClass19A A01;
    public final String A02;
    public final String A03;
    public final long A04 = SystemClock.elapsedRealtime();
    public final C19970wo A05;
    public final C20810yC A06;
    public final AnonymousClass4TE A07;

    public void BVN(String str) {
    }

    public static boolean A00(C76923pf r3) {
        String str = r3.A03;
        if ("preview".equals(str) && r3.A06.A0E(101)) {
            return true;
        }
        if (!"image".equals(str) || !r3.A06.A0E(102)) {
            return false;
        }
        return true;
    }

    public void BiM(C203399nx r13, String str) {
        byte[] bArr;
        String str2;
        String str3;
        int i;
        C203399nx A0c = r13.A0c("picture");
        String str4 = this.A02;
        URL url = null;
        if (A0c != null) {
            bArr = A0c.A01;
            if (A00(this)) {
                str3 = A0c.A0i("direct_path", (String) null);
                if (this.A06.A0E(4406)) {
                    str2 = A0c.A0i("hash", (String) null);
                } else {
                    str2 = null;
                }
            } else {
                str3 = null;
                str2 = null;
            }
            String A0i = A0c.A0i("url", (String) null);
            if (A0i != null) {
                try {
                    url = new URL(A0i);
                } catch (MalformedURLException unused) {
                    throw new C235919b("Malformed picture url");
                }
            }
            str4 = A0c.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
        } else {
            bArr = null;
            str3 = null;
            str2 = null;
        }
        if (str4 == null) {
            i = -1;
        } else {
            try {
                i = Integer.parseInt(str4);
            } catch (NumberFormatException unused2) {
                throw new C235919b(AnonymousClass000.A0p("Malformed photo id=", str4, AnonymousClass000.A0u()));
            }
        }
        this.A07.Bdf(new C124245xp(this.A00, str3, str2, url, bArr, i, C36371kC.A00("preview".equals(this.A03) ? 1 : 0)), this.A04);
    }

    public C76923pf(C19970wo r3, C20810yC r4, AnonymousClass4TE r5, AnonymousClass11F r6, AnonymousClass19A r7, String str, String str2) {
        this.A05 = r3;
        this.A06 = r4;
        this.A01 = r7;
        this.A03 = str;
        this.A00 = r6;
        this.A02 = str2;
        this.A07 = r5;
    }

    public void BWw(C203399nx r12, String str) {
        int A002 = AnonymousClass3ME.A00(r12);
        if (A002 == 404 || A002 == 410) {
            this.A07.Bdf(new C124245xp(this.A00, (String) null, (String) null, (URL) null, (byte[]) null, -1, C36371kC.A00("preview".equals(this.A03) ? 1 : 0)), this.A04);
        } else {
            this.A07.Bde(this.A00, this.A03, A002, this.A04);
        }
    }
}
