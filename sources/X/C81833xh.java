package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: X.3xh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C81833xh implements Callable {
    public final /* synthetic */ C65013Qj A00;
    public final /* synthetic */ C20310xM A01;
    public final /* synthetic */ AnonymousClass2bU A02;

    public /* synthetic */ C81833xh(C65013Qj r1, C20310xM r2, AnonymousClass2bU r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final Object call() {
        C20310xM r2 = this.A01;
        C65013Qj r1 = this.A00;
        AnonymousClass2bU r0 = this.A02;
        C24041Av r3 = r2.A09;
        File file = r1.A0I;
        int i = r0.A1I;
        Log.i("ReferenceCountedFileManager/deleteManagedFile actually deleting file");
        AnonymousClass1Ax r02 = r3.A03;
        AnonymousClass6YY.A0P(file);
        r02.A08(file, i);
        return C36371kC.A0m();
    }
}
