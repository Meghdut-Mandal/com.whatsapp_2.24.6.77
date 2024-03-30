package X;

import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.79Q  reason: invalid class name */
public class AnonymousClass79Q extends FutureTask {
    public final String A00;
    public final ArrayList A01 = AnonymousClass001.A0I();
    public final UUID A02;
    public final /* synthetic */ C200199gr A03;

    public synchronized void A02(AnonymousClass9T8 r5) {
        if (isDone()) {
            if (C112775eR.A00) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("performing callback: ");
                Log.d("OpticFutureTask", AnonymousClass000.A0q(this.A00, A0u));
            }
            try {
                A00(r5, (Exception) null, get(), true);
            } catch (CancellationException e) {
                A00(r5, e, (Object) null, false);
            } catch (InterruptedException | ExecutionException e2) {
                A00(r5, e2, (Object) null, false);
            }
        } else {
            this.A01.add(r5);
        }
        return;
    }

    public void done() {
        String str;
        UUID uuid = C200199gr.A06;
        super.done();
        boolean z = C112775eR.A00;
        if (z) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("completed task: ");
            A0u.append(this.A00);
            if (isCancelled()) {
                str = " was cancelled";
            } else {
                str = "";
            }
            Log.d("OpticFutureTask", AnonymousClass000.A0q(str, A0u));
        }
        synchronized (this) {
            if (z) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("performing callbacks: ");
                Log.d("OpticFutureTask", AnonymousClass000.A0q(this.A00, A0u2));
            }
            ArrayList arrayList = this.A01;
            ArrayList A15 = C36441kJ.A15(arrayList);
            arrayList.clear();
            try {
                Object obj = get();
                Iterator it = A15.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                A01((Exception) null, obj, A15, true);
            } catch (CancellationException e) {
                A01(e, (Object) null, A15, false);
            } catch (InterruptedException | ExecutionException e2) {
                if (A15.isEmpty()) {
                    Looper looper = this.A03.A04.getLooper();
                    Objects.requireNonNull(looper);
                    if (looper.getThread() != Thread.currentThread()) {
                        C202389lj.A01(e2);
                    }
                } else {
                    Iterator it2 = A15.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                    A01(e2, (Object) null, A15, false);
                }
            }
        }
        synchronized (this) {
            Trace.endSection();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass79Q(C200199gr r3, String str, UUID uuid, Callable callable) {
        super(callable);
        this.A03 = r3;
        AnonymousClass0YM.A02(uuid, AnonymousClass000.A0p("SessionId is null! Attempting to schedule task: ", str, AnonymousClass000.A0u()));
        this.A02 = uuid;
        this.A00 = str;
    }

    private void A00(AnonymousClass9T8 r9, Exception exc, Object obj, boolean z) {
        this.A03.A05(new AnonymousClass755(r9, obj, exc, 0, z), this.A02);
    }

    private void A01(Exception exc, Object obj, ArrayList arrayList, boolean z) {
        this.A03.A05(new AnonymousClass755(arrayList, exc, obj, 1, z), this.A02);
    }

    public void run() {
        String str;
        UUID uuid = C200199gr.A06;
        synchronized (this) {
            str = this.A00;
            Trace.beginSection(str);
        }
        if (C112775eR.A00) {
            Log.d("OpticFutureTask", AnonymousClass000.A0p("run task: ", str, AnonymousClass000.A0u()));
        }
        super.run();
    }

    public boolean runAndReset() {
        String str;
        String str2;
        UUID uuid = C200199gr.A06;
        synchronized (this) {
            str = this.A00;
            Trace.beginSection(str);
        }
        boolean runAndReset = super.runAndReset();
        if (C112775eR.A00) {
            StringBuilder A0u = AnonymousClass000.A0u();
            if (runAndReset) {
                str2 = "runAndReset: ";
            } else {
                str2 = "runAndReset failed: ";
            }
            Log.d("OpticFutureTask", AnonymousClass000.A0p(str2, str, A0u));
        }
        return runAndReset;
    }

    public boolean cancel(boolean z) {
        String str;
        boolean cancel = super.cancel(z);
        if (C112775eR.A00) {
            StringBuilder A0u = AnonymousClass000.A0u();
            if (cancel) {
                str = "cancelled: ";
            } else {
                str = "cancel failed: ";
            }
            A0u.append(str);
            Log.d("OpticFutureTask", AnonymousClass000.A0q(this.A00, A0u));
        }
        return cancel;
    }
}
