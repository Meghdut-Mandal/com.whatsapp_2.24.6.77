package X;

import android.graphics.Bitmap;
import com.whatsapp.GifHelper;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.67y  reason: invalid class name and case insensitive filesystem */
public class C1273567y {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public int A04;
    public final File A05;
    public final boolean A06;
    public final boolean A07;

    public C1273567y(File file) {
        boolean z;
        C48712hu r0;
        String extractMetadata;
        String extractMetadata2;
        this.A05 = file;
        try {
            C21656ATx.A04(file);
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        this.A07 = z;
        if (z) {
            try {
                C121665tW A042 = C21656ATx.A04(file);
                this.A02 = A042.A01;
                this.A00 = A042.A00;
            } catch (Exception e) {
                C36321k7.A1M(file, "media_file not found: ", AnonymousClass000.A0u(), e);
                throw new AnonymousClass5LY();
            }
        } else {
            C37001le r3 = new C37001le();
            try {
                r3.setDataSource(file.getAbsolutePath());
                try {
                    this.A06 = GifHelper.A01(file);
                    String extractMetadata3 = r3.extractMetadata(9);
                    extractMetadata = r3.extractMetadata(18);
                    extractMetadata2 = r3.extractMetadata(19);
                    try {
                        long parseLong = Long.parseLong(extractMetadata3);
                        this.A03 = parseLong;
                        if (parseLong != 0) {
                            this.A02 = Integer.parseInt(extractMetadata);
                            this.A00 = Integer.parseInt(extractMetadata2);
                            try {
                                this.A04 = Integer.parseInt(r3.extractMetadata(20));
                            } catch (Exception unused2) {
                            }
                            try {
                                this.A01 = Integer.parseInt(r3.extractMetadata(24));
                            } catch (Exception unused3) {
                            }
                            r3.close();
                            return;
                        }
                        StringBuilder A0u = AnonymousClass000.A0u();
                        AnonymousClass000.A1D("videometa/no duration:", extractMetadata3, " ", A0u);
                        A0u.append(file.getAbsolutePath());
                        C90464aC.A19(file, " ", A0u);
                        C90504aG.A1G(A0u);
                        r0 = new C48712hu();
                        throw r0;
                    } catch (Exception e2) {
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        AnonymousClass000.A1D("videometa/cannot parse duration:", extractMetadata3, " ", A0u2);
                        A00(this, A0u2);
                        Log.e(A0u2.toString(), e2);
                        r0 = new C48712hu();
                    }
                } catch (Exception e3) {
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    C36321k7.A1O("videometa/cannot parse width (", extractMetadata, ") or height (", extractMetadata2, A0u3);
                    A0u3.append(") ");
                    A00(this, A0u3);
                    Log.w(A0u3.toString(), e3);
                    Bitmap bitmap = null;
                    try {
                        bitmap = r3.getFrameAtTime(0);
                    } catch (Exception | NoSuchMethodError unused4) {
                    }
                    if (bitmap != null) {
                        this.A02 = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        this.A00 = height;
                        if (this.A02 == 0 || height == 0) {
                            StringBuilder A0u4 = AnonymousClass000.A0u();
                            C36321k7.A1O("videometa/bad width (", extractMetadata, ") or height (", extractMetadata2, A0u4);
                            A0u4.append(") ");
                            A00(this, A0u4);
                            C90504aG.A1G(A0u4);
                            r0 = new C48712hu();
                        }
                    } else {
                        StringBuilder A0u5 = AnonymousClass000.A0u();
                        A0u5.append("videometa/cannot get frame");
                        A00(this, A0u5);
                        C90504aG.A1G(A0u5);
                        r0 = new C48712hu();
                    }
                } catch (Throwable th) {
                    try {
                        r3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Exception e4) {
                StringBuilder A0u6 = AnonymousClass000.A0u();
                A0u6.append("videometa/cannot process file:");
                A00(this, A0u6);
                A0u6.append(" ");
                Log.e(C36421kH.A0d(A0u6, this.A05.exists()), e4);
                r0 = new C48712hu();
            }
        }
    }

    public static void A00(C1273567y r3, StringBuilder sb) {
        File file = r3.A05;
        sb.append(file.getAbsolutePath());
        sb.append(" ");
        sb.append(file.length());
    }

    public int A01() {
        int i = this.A04;
        if (i != 0) {
            return i;
        }
        long j = this.A03;
        if (j != 0) {
            return (int) ((this.A05.length() * 8000) / j);
        }
        return 0;
    }

    public boolean A02() {
        return AnonymousClass000.A1S(Math.abs(this.A01 % 180), 90);
    }
}
