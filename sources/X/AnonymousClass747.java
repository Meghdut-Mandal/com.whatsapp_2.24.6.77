package X;

import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.747  reason: invalid class name */
public final /* synthetic */ class AnonymousClass747 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass65Q A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ CountDownLatch A07;
    public final /* synthetic */ AtomicReference A08;

    public /* synthetic */ AnonymousClass747(AnonymousClass65Q r1, File file, String str, List list, List list2, CountDownLatch countDownLatch, AtomicReference atomicReference, int i, long j) {
        this.A02 = r1;
        this.A03 = file;
        this.A04 = str;
        this.A00 = i;
        this.A01 = j;
        this.A05 = list;
        this.A06 = list2;
        this.A08 = atomicReference;
        this.A07 = countDownLatch;
    }

    public final void run() {
        AnonymousClass65Q r13 = this.A02;
        File file = this.A03;
        String str = this.A04;
        int i = this.A00;
        long j = this.A01;
        List list = this.A05;
        List list2 = this.A06;
        AtomicReference atomicReference = this.A08;
        CountDownLatch countDownLatch = this.A07;
        CountDownLatch countDownLatch2 = countDownLatch;
        C36321k7.A13(list2, atomicReference, countDownLatch);
        try {
            AnonymousClass179 r14 = r13.A08;
            String A052 = C34191gb.A05(r14, file);
            if (A052 == null) {
                C36321k7.A1J(file, "gdrive/encrypted-re-upload/collect-files-to-be-uploaded/file-upload-path-is-null/ ", AnonymousClass000.A0u());
            } else {
                Map map = r13.A0K;
                C131526Pk r6 = (C131526Pk) map.get(A052);
                C33131el r27 = r13.A06;
                if (r27.A00()) {
                    r13.A0Q.incrementAndGet();
                    String A0w = C90514aH.A0w(file);
                    C20830yE r5 = r13.A0C;
                    if (AnonymousClass6YN.A00(r6, r14, r5, A0w) != 3 || r6 == null || AnonymousClass6YN.A0D(r6)) {
                        r13.A0O.incrementAndGet();
                        r13.A0N.addAndGet(file.length());
                        r27.A00();
                    } else {
                        Locale locale = Locale.ENGLISH;
                        Object[] objArr = new Object[2];
                        objArr[0] = A052;
                        AnonymousClass00C.A08(String.format(locale, "gdrive/encrypted-re-upload/get-files-to-be-uploaded fileUploadPath is %s, fileStatus is %s.", C90524aI.A0x("remote-file-same-as-local", objArr, 1, 2)));
                        AnonymousClass6FR r17 = new AnonymousClass6FR(r13.A00, r13.A02, r13.A04, r14, r13.A09, r5, file, str, A052);
                        AtomicLong atomicLong = r13.A0P;
                        if (atomicLong.get() < ((long) i) || r13.A0M.get() < j) {
                            list.add(r17);
                            if (!AnonymousClass00C.A0J(r6.A06, r17.A03)) {
                                list2.add(r6);
                                map.remove(r6.A01());
                            }
                            atomicLong.incrementAndGet();
                            r13.A0M.addAndGet(r17.A00());
                            r27.A00();
                        } else {
                            r13.A0L.set(false);
                            r27.A00();
                        }
                    }
                }
            }
        } catch (C101864yP e) {
            C36321k7.A1M(file, "gdrive/encrypted-re-upload/get-files-to-be-uploaded problem with a file ", AnonymousClass000.A0u(), e);
            atomicReference.set(e);
        } catch (Throwable th) {
            countDownLatch2.countDown();
            throw th;
        }
        countDownLatch2.countDown();
    }
}
