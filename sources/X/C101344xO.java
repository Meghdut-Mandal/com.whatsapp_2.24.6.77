package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.4xO  reason: invalid class name and case insensitive filesystem */
public abstract class C101344xO extends C79593ty implements Runnable, AnonymousClass4PA {
    public final C25721Hk A00 = C90524aI.A0I();
    public final CountDownLatch A01 = C90484aE.A0u();
    public final FutureTask A02 = new AnonymousClass79P(this, new C163727qf(this, 3));

    public Object A0F() {
        C146506vi A04;
        int i;
        boolean A1Q;
        int i2;
        if (this instanceof C101324xM) {
            C101324xM r1 = (C101324xM) this;
            Boolean A002 = r1.A00.A00();
            WeakReference weakReference = r1.A01;
            if (!(weakReference == null || weakReference.get() == null)) {
                boolean equals = Boolean.TRUE.equals(A002);
                AnonymousClass7hB r12 = (AnonymousClass7hB) weakReference.get();
                if (equals) {
                    i2 = 3;
                } else {
                    i2 = 8;
                }
                r12.Biz(i2);
            }
            return A002;
        } else if (this instanceof C101314xL) {
            return ((C101314xL) this).A0I();
        } else {
            if (this instanceof C101304xK) {
                C101304xK r4 = (C101304xK) this;
                C02680Bk r5 = r4.A01;
                r5.A04();
                ArrayList A0I = AnonymousClass001.A0I();
                Iterator it = r4.A04.iterator();
                while (it.hasNext()) {
                    File[] listFiles = C90504aG.A0a(it).listFiles();
                    r5.A04();
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (file.isFile()) {
                                long abs = Math.abs(file.lastModified() - r4.A00);
                                if (abs <= 3600000) {
                                    A0I.add(new C119745qO(file, abs));
                                }
                            }
                        }
                    }
                }
                r5.A04();
                Collections.sort(A0I, AnonymousClass767.A00);
                A0I.size();
                r5.A04();
                Iterator it2 = A0I.iterator();
                while (it2.hasNext()) {
                    File file2 = ((C119745qO) it2.next()).A01;
                    r5.A04();
                    try {
                        if (r4.A03.equals(AnonymousClass6UG.A00(file2))) {
                            return file2;
                        }
                    } catch (IOException e) {
                        Log.e("mediafilefindjob/run/ioexception", e);
                    }
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("file not found for hash ");
                A0u.append(r4.A03);
                throw C90524aI.A0V(AnonymousClass000.A0l(r4, "; job=", A0u));
            }
            C101294xJ r3 = (C101294xJ) this;
            Iterator it3 = r3.A00.iterator();
            while (it3.hasNext()) {
                AnonymousClass2bU A0r = C36441kJ.A0r(it3);
                AnonymousClass1Y4 r8 = r3.A02;
                boolean z = r3.A01;
                if (A0r.A0D != 1) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("mediajobmanager/trycancelmessageandmediajob ");
                    A0u2.append(A0r.A1J);
                    A0u2.append(" status:");
                    C36321k7.A1Y(A0u2, A0r.A0D);
                } else {
                    AnonymousClass3SC A003 = AnonymousClass1Y4.A00(r8, A0r);
                    if (!(A003 == null || (A04 = r8.A04(A003)) == null)) {
                        C101314xL r0 = (C101314xL) r8.A0K.A03(A04);
                        if (r0 != null) {
                            r8.A0D.A02(A0r.A01, r0.A0X, A0r);
                        }
                        synchronized (A04.A0U) {
                            A003.A03(A0r.A1J);
                            if (A003.A02.size() == 0) {
                                AnonymousClass1Y4.A01(r8, (C146506vi) null, A003);
                            }
                        }
                        synchronized (r8.A0Q) {
                            Iterator A10 = C36371kC.A10(r8.A0R);
                            i = 0;
                            while (A10.hasNext()) {
                                Map.Entry A11 = AnonymousClass000.A11(A10);
                                AnonymousClass3SC r2 = (AnonymousClass3SC) A11.getKey();
                                synchronized (r2) {
                                    A1Q = AnonymousClass000.A1Q(r2.A02.size());
                                }
                                boolean z2 = false;
                                if (!A1Q) {
                                    z2 = true;
                                }
                                C18740tg.A0C(z2);
                                if (A11.getValue() == A04) {
                                    i += ((AnonymousClass3SC) A11.getKey()).A02.size();
                                }
                            }
                        }
                        if (i == 0) {
                            AnonymousClass1D0 r22 = r8.A0C;
                            A04.A04 = true;
                            if (z) {
                                A04.A0N.A06();
                            }
                            r22.A0B.A02(A04, A04.A03().A08);
                            AnonymousClass1GN r13 = r22.A0D;
                            r13.A08(A04);
                            C146496vh r02 = A04.A02;
                            if (r02 != null) {
                                r13.A08(r02);
                            }
                        }
                    }
                }
            }
            return C36371kC.A0m();
        }
    }

    public void A0G() {
        if (this.A02.isCancelled()) {
            throw new CancellationException();
        }
    }

    public void cancel() {
        this.A02.cancel(true);
    }

    public void run() {
        Throwable e;
        Throwable e2;
        try {
            FutureTask futureTask = this.A02;
            futureTask.run();
            try {
                boolean interrupted = Thread.interrupted();
                this.A01.await();
                if (interrupted) {
                    C90484aE.A0z();
                }
                Object obj = futureTask.get();
                C18740tg.A06(obj);
                A0C(obj);
            } catch (InterruptedException | CancellationException e3) {
                e2 = e3;
                A0D(e2);
            } catch (ExecutionException e4) {
                e2 = e4.getCause();
                A0D(e2);
            }
        } catch (Throwable th) {
            try {
                boolean interrupted2 = Thread.interrupted();
                this.A01.await();
                if (interrupted2) {
                    C90484aE.A0z();
                }
                Object obj2 = this.A02.get();
                C18740tg.A06(obj2);
                A0C(obj2);
                throw th;
            } catch (InterruptedException | CancellationException e5) {
                e = e5;
                A0D(e);
                throw th;
            } catch (ExecutionException e6) {
                e = e6.getCause();
                A0D(e);
                throw th;
            }
        }
    }

    public void A0E() {
        super.A0E();
        this.A00.A01();
    }
}
