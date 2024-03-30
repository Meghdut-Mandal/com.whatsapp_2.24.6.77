package X;

import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: X.0Ye  reason: invalid class name and case insensitive filesystem */
public class C07540Ye {
    public final AnonymousClass012 A00;
    public final C03740Hn A01;

    public static C07540Ye A00(AnonymousClass012 r2) {
        return new C07540Ye(r2, ((AnonymousClass016) r2).BJ7());
    }

    private void A01(Bundle bundle, C17210qu r8, AnonymousClass0V4 r9) {
        try {
            C03740Hn r5 = this.A01;
            r5.A01 = true;
            AnonymousClass0V4 BUt = r8.BUt(bundle, 0);
            Class<?> cls = BUt.getClass();
            if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
                C03730Hm r3 = new C03730Hm(bundle, BUt, r9);
                r5.A00.A02(0, r3);
                r5.A01 = false;
                AnonymousClass012 r2 = this.A00;
                C09900dL r1 = new C09900dL(r8, r3.A04);
                r3.A08(r2, r1);
                C09900dL r0 = r3.A01;
                if (r0 != null) {
                    r3.A0B(r0);
                }
                r3.A00 = r2;
                r3.A01 = r1;
                return;
            }
            throw AnonymousClass001.A08(AnonymousClass000.A0l(BUt, "Object returned from onCreateLoader must not be a non-static inner member class: ", AnonymousClass000.A0u()));
        } catch (Throwable th) {
            this.A01.A01 = false;
            throw th;
        }
    }

    public void A02(Bundle bundle, C17210qu r6) {
        C03740Hn r2 = this.A01;
        if (r2.A01) {
            throw AnonymousClass001.A09("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C03730Hm r1 = (C03730Hm) C06840Vh.A00(r2.A00, 0);
            AnonymousClass0V4 r0 = null;
            if (r1 != null) {
                r0 = r1.A0E(false);
            }
            A01(bundle, r6, r0);
        } else {
            throw AnonymousClass001.A09("restartLoader must be called on the main thread");
        }
    }

    public void A03(C17210qu r6) {
        C03740Hn r2 = this.A01;
        if (r2.A01) {
            throw AnonymousClass001.A09("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C03730Hm r3 = (C03730Hm) C06840Vh.A00(r2.A00, 0);
            if (r3 == null) {
                A01((Bundle) null, r6, (AnonymousClass0V4) null);
                return;
            }
            AnonymousClass012 r22 = this.A00;
            C09900dL r1 = new C09900dL(r6, r3.A04);
            r3.A08(r22, r1);
            C09900dL r0 = r3.A01;
            if (r0 != null) {
                r3.A0B(r0);
            }
            r3.A00 = r22;
            r3.A01 = r1;
        } else {
            throw AnonymousClass001.A09("initLoader must be called on the main thread");
        }
    }

    @Deprecated
    public void A04(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C10890fO r5 = this.A01.A00;
        if (r5.A00 > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String A0q = AnonymousClass000.A0q("    ", AnonymousClass000.A0v(str));
            for (int i = 0; i < r5.A00; i++) {
                C03730Hm r6 = (C03730Hm) r5.A02[i];
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(r5.A01[i]);
                printWriter.print(": ");
                printWriter.println(r6.toString());
                printWriter.print(A0q);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println(r6.A03);
                printWriter.print(A0q);
                printWriter.print("mLoader=");
                AnonymousClass0V4 r1 = r6.A04;
                printWriter.println(r1);
                r1.A05(AnonymousClass000.A0q("  ", AnonymousClass000.A0v(A0q)), fileDescriptor, printWriter, strArr);
                if (r6.A01 != null) {
                    printWriter.print(A0q);
                    printWriter.print("mCallbacks=");
                    printWriter.println(r6.A01);
                    C09900dL r12 = r6.A01;
                    printWriter.print(AnonymousClass000.A0p(A0q, "  ", AnonymousClass000.A0u()));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(r12.A00);
                }
                printWriter.print(A0q);
                printWriter.print("mData=");
                Object A04 = r6.A04();
                StringBuilder sb = new StringBuilder(64);
                C05500Py.A00(A04, sb);
                printWriter.println(AnonymousClass000.A0q("}", sb));
                printWriter.print(A0q);
                printWriter.print("mStarted=");
                printWriter.println(AnonymousClass000.A1R(r6.A00));
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        AnonymousClass000.A1B(this, sb);
        sb.append(" in ");
        C05500Py.A00(this.A00, sb);
        return AnonymousClass000.A0q("}}", sb);
    }

    public C07540Ye(AnonymousClass012 r4, AnonymousClass04J r5) {
        this.A00 = r4;
        AnonymousClass04G r2 = C03740Hn.A02;
        AnonymousClass00C.A0D(r5, 1);
        this.A01 = (C03740Hn) new AnonymousClass04H(r2, r5, AnonymousClass04M.A00).A00(C03740Hn.class);
    }

    public C07540Ye() {
    }
}
