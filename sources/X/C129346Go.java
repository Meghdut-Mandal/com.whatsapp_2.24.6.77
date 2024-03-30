package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6Go  reason: invalid class name and case insensitive filesystem */
public abstract class C129346Go {
    public static final void A01(FileOutputStream fileOutputStream, InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.e("ARDAssetDownloader Exception when cleaning up input stream.", e);
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.flush();
                FileDescriptor fd = fileOutputStream.getFD();
                if (fd != null) {
                    fd.sync();
                }
                fileOutputStream.close();
            } catch (IOException e2) {
                Log.e("ARDAssetDownloader Exception when cleaning up output stream.", e2);
            }
        }
    }

    public static final void A00(C118525oC r9, C135056c3 r10, AnonymousClass5VK r11, File file, AtomicBoolean atomicBoolean) {
        Throwable th;
        ArrayList A00;
        boolean A1Z = C90504aG.A1Z(atomicBoolean);
        StringBuilder A0u = AnonymousClass000.A0u();
        C135056c3 r8 = r10;
        if (A1Z) {
            A0u.append("ARDAssetDownloader Download completed for ");
            A0u.append(r10.A01.A0A);
            A0u.append(". Exception = ");
            AnonymousClass5VK r6 = r11;
            C36321k7.A1N(r11, A0u);
            C118525oC r7 = r9;
            C132556Ug r2 = r9.A01;
            synchronized (r2.A03) {
                AnonymousClass6NA r0 = r2.A00;
                AnonymousClass6NA r5 = r9.A00;
                if (r0 == r5) {
                    r2.A00 = null;
                    Map map = r2.A06;
                    String str = r5.A04.A08;
                    if (map.remove(str) == r5) {
                        r2.A05.remove(r5);
                        r5.A00(C023109s.A0G);
                        r2.A04.add(new C1503474x((Object) r6, (Object) r7, (Object) r8, (Object) file, 4));
                        try {
                            C132556Ug.A01(r2);
                            A00 = C132556Ug.A00(r2);
                        } catch (IllegalArgumentException e) {
                            StringBuilder A0u2 = AnonymousClass000.A0u();
                            A0u2.append("old currentDownload uri=");
                            A0u2.append(str);
                            A0u2.append(" result=");
                            A0u2.append(file);
                            th = C90524aI.A0e(AnonymousClass000.A0l(r11, " old download exception=", A0u2), e);
                        }
                    } else {
                        th = new IllegalStateException();
                    }
                } else {
                    th = new IllegalStateException();
                }
                throw th;
            }
            C132556Ug.A02(r2, A00);
            return;
        }
        A0u.append("ARDAssetDownloader Request canceled for ");
        A0u.append(r10.A01.A0A);
        C36321k7.A1a(A0u, ", ignoring failure callback.");
    }
}
