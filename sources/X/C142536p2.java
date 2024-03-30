package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Iterator;

/* renamed from: X.6p2  reason: invalid class name and case insensitive filesystem */
public final class C142536p2 implements C159957kE {
    public final /* synthetic */ C133346Xy A00;
    public final /* synthetic */ C159957kE A01;
    public final /* synthetic */ String A02;

    public void B2m(RandomAccessFile randomAccessFile) {
        AnonymousClass00C.A0D(randomAccessFile, 0);
        Log.i("AccountSwitchingFileManager/removeAndSwitchAccount/checkpointOps");
        this.A01.B2m(randomAccessFile);
    }

    public C142536p2(C133346Xy r1, C159957kE r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public void Blr() {
        Log.i("AccountSwitchingFileManager/removeAndSwitchAccount/postCheckpointOps");
        this.A01.Blr();
        C133346Xy r3 = this.A00;
        String str = this.A02;
        StringBuilder A0u = AnonymousClass000.A0u();
        C36321k7.A1a(A0u, C90524aI.A0g("AccountSwitchingFileManager/deleteAccount/", str, A0u));
        AnonymousClass00T r1 = r3.A06;
        if (C90474aD.A1Y(r1)) {
            File A0L = C90464aC.A0L(str, r1);
            if (A0L.exists()) {
                Iterator A13 = C90514aH.A13(r3.A05.getValue());
                while (A13.hasNext()) {
                    String A0C = AnonymousClass001.A0C(A13);
                    boolean A07 = C133346Xy.A07(C90514aH.A0w(A0L), A0C);
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    C90464aC.A1A(A0L, "AccountSwitchingFileManager/deleteAccount/delete ", A0u2);
                    A0u2.append('/');
                    A0u2.append(A0C);
                    C36321k7.A1X(" directory: ", A0u2, A07);
                }
                A0L.delete();
                return;
            }
            C90464aC.A13(r3, "AccountSwitchingFileManager/deleteAccount/stagingDirLogString/", AnonymousClass000.A0u());
            StringBuilder A0u3 = AnonymousClass000.A0u();
            C90464aC.A1H("Account ", str, A0u3);
            throw AnonymousClass000.A0g(" directory does not exist", A0u3);
        }
        throw AnonymousClass001.A09("Staging Directory don't exist");
    }

    public void Bm0() {
        Log.i("AccountSwitchingFileManager/removeAndSwitchAccount/preCheckpointOps");
        this.A01.Bm0();
    }
}
