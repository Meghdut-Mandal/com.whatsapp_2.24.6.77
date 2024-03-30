package X;

import com.whatsapp.util.Log;
import java.io.RandomAccessFile;

/* renamed from: X.6p3  reason: invalid class name and case insensitive filesystem */
public final class C142546p3 implements C159957kE {
    public final /* synthetic */ C133346Xy A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public void B2m(RandomAccessFile randomAccessFile) {
        AnonymousClass00C.A0D(randomAccessFile, 0);
        Log.i("AccountSwitchingFileManager/switchAccount/checkpointOps");
        C133346Xy r1 = this.A00;
        C133346Xy.A02(r1, randomAccessFile, this.A02);
        C133346Xy.A01(r1, randomAccessFile, this.A01);
    }

    public void Bm0() {
    }

    public C142546p3(C133346Xy r1, String str, String str2) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = str2;
    }

    public void Blr() {
        Log.i("AccountSwitchingFileManager/switchAccount/postCheckpointOps");
        C133346Xy r4 = this.A00;
        String str = this.A02;
        C36321k7.A1X("AccountSwitchingFileManager/switchAccount/moveLogsBackToActiveDirectory: ", AnonymousClass000.A0u(), C133346Xy.A06(r4, str, false));
        C36321k7.A1X("AccountSwitchingFileManager/switchAccount/copyGoogleGcmFile:", AnonymousClass000.A0u(), C133346Xy.A05(r4, str));
        C36321k7.A1X("AccountSwitchingFileManager/switchAccount/copyDbFile:", AnonymousClass000.A0u(), C133346Xy.A04(r4, str));
    }
}
