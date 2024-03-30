package X;

import android.graphics.Bitmap;
import android.os.Process;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.5N0  reason: invalid class name */
public class AnonymousClass5N0 extends C19950wm {
    public final /* synthetic */ C131566Po A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5N0(C131566Po r3, String str) {
        super(AnonymousClass000.A0p("PhotosDisk-", str, AnonymousClass000.A0u()));
        this.A00 = r3;
    }

    public void run() {
        Process.setThreadPriority(10);
        do {
            try {
                C131566Po r6 = this.A00;
                Stack stack = r6.A0A;
                synchronized (stack) {
                    try {
                        if (stack.size() == 0) {
                            stack.wait();
                        }
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                        }
                        throw th;
                    }
                }
                if (stack.size() != 0) {
                    C124415y9 r5 = null;
                    Object obj = r6.A05;
                    synchronized (obj) {
                        try {
                            if (stack.size() != 0) {
                                r5 = (C124415y9) stack.pop();
                            }
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                                break;
                            }
                        }
                    }
                    if (r5 != null) {
                        ConcurrentMap concurrentMap = r5.A05;
                        if (concurrentMap.size() != 0) {
                            String str = r5.A03;
                            String A04 = C18750th.A04(str);
                            C18740tg.A06(A04);
                            C132416Tn r7 = r6.A03;
                            Bitmap A02 = r7.A02(A04, r5.A01, r5.A00, r5.A06);
                            if (A02 == null) {
                                synchronized (obj) {
                                    try {
                                        Iterator A0z = AnonymousClass000.A0z(concurrentMap);
                                        while (A0z.hasNext()) {
                                            C160797lb r1 = (C160797lb) A0z.next();
                                            if (r1.B7A()) {
                                                if (r1.getId().equals(str)) {
                                                    concurrentMap.remove(r1);
                                                }
                                                r6.A02.A0H(new C1503374w((Object) null, Collections.singletonList(r1), r6, 35));
                                            }
                                        }
                                        if (!r5.A07.get() && concurrentMap.size() != 0) {
                                            Stack stack2 = r6.A0B;
                                            stack2.remove(r5);
                                            stack2.push(r5);
                                            C25471Gl r2 = C25471Gl.A0D;
                                            AnonymousClass00C.A0D(r2, 1);
                                            r5.A02 = new AnonymousClass6Fk(r2, 0);
                                            synchronized (stack2) {
                                                stack2.notify();
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw th;
                                    }
                                }
                            } else {
                                r7.A03(A02, str);
                                synchronized (obj) {
                                    try {
                                        r6.A09.remove(str);
                                        if (concurrentMap.size() != 0) {
                                            ArrayList A0g = C90494aF.A0g(concurrentMap);
                                            concurrentMap.clear();
                                            r6.A02.A0H(new C1503374w(A02, A0g, r6, 35));
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                return;
            }
        } while (!Thread.interrupted());
    }
}
