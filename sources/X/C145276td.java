package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.whatsapp.superpack.WhatsAppObiInputStream;
import com.whatsapp.superpack.WhatsAppOpenboxArchive;
import java.io.IOException;

/* renamed from: X.6td  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C145276td implements AnonymousClass7gX {
    public final /* synthetic */ AnonymousClass1H2 A00;

    public /* synthetic */ C145276td(AnonymousClass1H2 r1) {
        this.A00 = r1;
    }

    public final Bitmap BOG(Resources resources, int i) {
        IllegalArgumentException th;
        Bitmap bitmap;
        WhatsAppObiInputStream openOpenboxArchiveFile;
        AnonymousClass1H2 r5 = this.A00;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i > 0) {
            try {
                AnonymousClass1H6 r6 = r5.A08;
                if (r5.A0B == null) {
                    synchronized (r5) {
                        try {
                            if (r5.A0B == null) {
                                r5.A0B = new WhatsAppOpenboxArchive(resources.getAssets().openFd("compressed/emojis/emojis.oba"));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                WhatsAppOpenboxArchive whatsAppOpenboxArchive = r5.A0B;
                C18740tg.A06(whatsAppOpenboxArchive);
                C120235rB file = whatsAppOpenboxArchive.getFile(i - 1);
                try {
                    AnonymousClass1H7 r1 = r6.A03;
                    openOpenboxArchiveFile = WhatsAppObiInputStream.openOpenboxArchiveFile(file);
                    bitmap = AnonymousClass6IZ.A00(r1, openOpenboxArchiveFile);
                    openOpenboxArchiveFile.close();
                } catch (IOException e) {
                    String obj = e.toString();
                    C45062Px r4 = new C45062Px();
                    r4.A02 = obj;
                    r4.A01 = "regular_emoji";
                    r6.A02.Blx(r4, AnonymousClass1H6.A05);
                    bitmap = null;
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                Boolean bool = r5.A01;
                if (bool == null) {
                    bool = C36391kE.A0q(r5.A06, 3562);
                    r5.A01 = bool;
                }
                if (!bool.booleanValue() || !r5.A00.A00()) {
                    return bitmap;
                }
                C45682Sh r42 = new C45682Sh();
                r42.A05 = 13;
                r42.A0B = C90504aG.A0h(SystemClock.uptimeMillis(), uptimeMillis);
                r5.A07.Blz(r42, 100000);
                return bitmap;
            } catch (IOException unused) {
                return null;
            }
        } else {
            th = new IllegalArgumentException();
            throw th;
        }
        throw th;
    }
}
