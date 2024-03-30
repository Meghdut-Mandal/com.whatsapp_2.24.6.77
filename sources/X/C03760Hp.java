package X;

import android.content.Context;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* renamed from: X.0Hp  reason: invalid class name and case insensitive filesystem */
public abstract class C03760Hp extends AnonymousClass0V4 {
    public final Executor A00;
    public volatile C12080hT A01;
    public volatile C12080hT A02;

    public abstract Object A06();

    public void A08() {
    }

    public void A0B(Object obj) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C03760Hp(Context context) {
        super(context);
        Executor executor = C12080hT.A08;
        this.A00 = executor;
    }

    public void A07() {
        if (this.A01 == null && this.A02 != null) {
            C12080hT r3 = this.A02;
            Executor executor = this.A00;
            if (r3.A05 != C023109s.A00) {
                int intValue = r3.A05.intValue();
                if (intValue == 1) {
                    throw AnonymousClass001.A09("Cannot execute task: the task is already running.");
                } else if (intValue != 2) {
                    throw AnonymousClass001.A09("We should never reach this state");
                } else {
                    throw AnonymousClass001.A09("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            } else {
                r3.A05 = C023109s.A01;
                executor.execute(r3.A01);
            }
        }
    }

    @Deprecated
    public void A05(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.A05(str, fileDescriptor, printWriter, strArr);
        if (this.A02 != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.A02);
            printWriter.print(" waiting=");
            printWriter.println(false);
        }
        if (this.A01 != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.A01);
            printWriter.print(" waiting=");
            printWriter.println(false);
        }
    }

    public void A09() {
        A00();
        this.A02 = new C12080hT(this);
        A07();
    }

    public void A0A(C12080hT r2, Object obj) {
        A0B(obj);
        if (this.A01 == r2) {
            if (this.A04) {
                if (this.A06) {
                    A09();
                } else {
                    this.A03 = true;
                }
            }
            SystemClock.uptimeMillis();
            this.A01 = null;
            A07();
        }
    }
}
