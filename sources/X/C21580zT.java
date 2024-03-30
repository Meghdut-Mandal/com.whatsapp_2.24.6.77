package X;

import java.io.File;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0zT  reason: invalid class name and case insensitive filesystem */
public class C21580zT {
    public static final long A07 = TimeUnit.DAYS.toMillis(5);
    public final C19630wG A00;
    public final C21540zP A01;
    public final C21500zL A02;
    public final C21470zI A03;
    public final Semaphore A04 = new Semaphore(1);
    public final C19970wo A05;
    public volatile File A06 = null;

    public static File[] A00(C21580zT r3, String str) {
        File[] listFiles;
        File file = new File(r3.A00.A00.getCacheDir(), "qpl");
        if (!file.exists() || (listFiles = file.listFiles(new C164267rX(str, 1))) == null) {
            return new File[0];
        }
        return listFiles;
    }

    public C21580zT(C19970wo r3, C19630wG r4, C21540zP r5, C21500zL r6, C21470zI r7) {
        this.A00 = r4;
        this.A05 = r3;
        this.A03 = r7;
        this.A01 = r5;
        this.A02 = r6;
    }

    public void A01(File file) {
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                this.A03.B6m(e.getMessage());
            }
        }
    }
}
