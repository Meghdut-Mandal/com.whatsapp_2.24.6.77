package X;

import android.os.Build;
import android.os.Process;
import com.facebook.systrace.Systrace;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: X.9Z0  reason: invalid class name */
public abstract class AnonymousClass9Z0 {
    public static final AnonymousClass9Z0 $redex_init_class = null;

    static {
        C1895294d r3 = new C1895294d();
        C198819eF r2 = C201899kg.A01;
        synchronized (r2.A01) {
            r2.A02.add(r3);
            if (r2.A00) {
                A00();
            }
        }
    }

    public static void A00() {
        BufferedReader bufferedReader;
        if ((64 & C201899kg.A02) != 0) {
            Systrace.A02("thread_name", Process.myTid(), Thread.currentThread().getName());
        }
        if ((1 & C201899kg.A02) != 0) {
            StringBuilder A0h = C90524aI.A0h(127);
            A0h.append("Android trace tags: ");
            A0h.append(C21760zl.A00("debug.atrace.tags.enableflags"));
            A0h.append(", Facebook trace tags: ");
            Systrace.A02("process_labels", 0, C36411kG.A11(A0h, C201899kg.A02));
        }
        if ((64 & C201899kg.A02) != 0) {
            try {
                FileReader fileReader = new FileReader("/proc/self/cmdline");
                try {
                    bufferedReader = new BufferedReader(fileReader);
                    String readLine = bufferedReader.readLine();
                    int indexOf = readLine.indexOf(0);
                    if (indexOf >= 0) {
                        readLine = readLine.substring(0, indexOf);
                    }
                    bufferedReader.close();
                    fileReader.close();
                    Systrace.A02("process_name", 0, readLine);
                    String A02 = C21760zl.A02("dalvik.vm.heapgrowthlimit");
                    String A022 = C21760zl.A02("dalvik.vm.heapmaxfree");
                    String A023 = C21760zl.A02("dalvik.vm.heapminfree");
                    String A024 = C21760zl.A02("dalvik.vm.heapstartsize");
                    String A025 = C21760zl.A02("dalvik.vm.heaptargetutilization");
                    Object[] objArr = new Object[6];
                    objArr[0] = Build.MODEL;
                    C90464aC.A1D(A02, A024, A022, objArr);
                    C36381kD.A1L(A023, A025, objArr);
                    Systrace.A02("process_labels", 0, String.format("device=%s,heapgrowthlimit=%s,heapstartsize=%s,heapminfree=%s,heapmaxfree=%s,heaptargetutilization=%s", objArr));
                    return;
                } catch (Throwable th) {
                    fileReader.close();
                    throw th;
                }
            } catch (IOException e) {
                throw AnonymousClass001.A0B(e);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            return;
        }
        throw th;
    }
}
