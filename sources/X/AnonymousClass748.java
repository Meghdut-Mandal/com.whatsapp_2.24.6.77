package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.748  reason: invalid class name */
public final /* synthetic */ class AnonymousClass748 implements Runnable {
    public final /* synthetic */ C125095zJ A00;
    public final /* synthetic */ C131526Pk A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ CountDownLatch A05;
    public final /* synthetic */ AtomicBoolean A06;
    public final /* synthetic */ AtomicReference A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ AnonymousClass748(C125095zJ r1, C131526Pk r2, File file, String str, List list, CountDownLatch countDownLatch, AtomicBoolean atomicBoolean, AtomicReference atomicReference, boolean z) {
        this.A00 = r1;
        this.A06 = atomicBoolean;
        this.A08 = z;
        this.A02 = file;
        this.A01 = r2;
        this.A03 = str;
        this.A04 = list;
        this.A07 = atomicReference;
        this.A05 = countDownLatch;
    }

    public final void run() {
        C125095zJ r8 = this.A00;
        AtomicBoolean atomicBoolean = this.A06;
        boolean z = this.A08;
        File file = this.A02;
        C131526Pk r11 = this.A01;
        String str = this.A03;
        List list = this.A04;
        AtomicReference atomicReference = this.A07;
        CountDownLatch countDownLatch = this.A05;
        try {
            if (!r8.A07.A00()) {
                atomicBoolean.set(false);
            } else if (z || !file.exists() || file.length() <= 0) {
                int A002 = AnonymousClass6YN.A00(r11, r8.A09, r8.A0A, file.getAbsolutePath());
                if (A002 != 1) {
                    if (A002 == 2) {
                        Log.e(String.format("restore>MediaRestoreAction/get-files-to-be-downloaded received '%s' from gdrive file map which does not exist.", new Object[]{str}));
                    } else if (A002 == 3) {
                        C1041458l r1 = r8.A0E;
                        C18740tg.A06(r1);
                        r1.A01 = false;
                    }
                }
                list.add(str);
            }
        } catch (C101864yP e) {
            atomicReference.set(e);
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
