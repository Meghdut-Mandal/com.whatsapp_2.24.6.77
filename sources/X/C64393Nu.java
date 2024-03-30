package X;

import java.net.HttpURLConnection;

/* renamed from: X.3Nu  reason: invalid class name and case insensitive filesystem */
public class C64393Nu {
    public final C19630wG A00;
    public final C20810yC A01;
    public final AnonymousClass13E A02;
    public final C24121Be A03;
    public final C21080yd A04;

    public static C146096v1 A00(AnonymousClass13E r3, C64393Nu r4, String str) {
        C146096v1 A012 = r3.A01(r4.A04, str);
        HttpURLConnection httpURLConnection = A012.A01;
        if (httpURLConnection.getResponseCode() >= 400) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("WallpaperDownloader/download/Error, code=");
            C36351kA.A1R(A0u, httpURLConnection.getResponseCode());
            return null;
        }
        httpURLConnection.getResponseCode();
        return A012;
    }

    public C64393Nu(C19630wG r1, C20810yC r2, AnonymousClass13E r3, C24121Be r4, C21080yd r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
    }
}
