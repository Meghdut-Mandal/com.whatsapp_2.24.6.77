package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;

/* renamed from: X.5Bs  reason: invalid class name */
public class AnonymousClass5Bs extends C104865Bt implements C160107kT, C159697jm {
    public final C24041Av A00;
    public final C135066c4 A01;
    public final AnonymousClass777 A02;
    public final File A03;
    public final AnonymousClass1ST A04;

    public C133136Wx B5v() {
        if (this.A04.A0F(new C164007r7(this, 2), this, (AnonymousClass68C) null, (AnonymousClass2bU) null, this.A01.A0E, false)) {
            try {
                return (C133136Wx) this.A02.get();
            } catch (InterruptedException | ExecutionException e) {
                Log.e("DuplicateStickerDownloadListener/waitForResult ", e);
                return new C133136Wx(1);
            }
        } else {
            B0M(this);
            return A02().A00;
        }
    }

    public /* synthetic */ void BW4(long j) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r1.equals("application/was") == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5Bs(X.AnonymousClass17Y r12, X.C24041Av r13, X.C20050ww r14, X.C19970wo r15, X.C20060wx r16, X.C20810yC r17, X.AnonymousClass1BV r18, X.AnonymousClass1ST r19, X.AnonymousClass1BS r20, X.C135066c4 r21, java.io.File r22) {
        /*
            r11 = this;
            java.util.concurrent.Executor r10 = r12.A04
            r3 = r11
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2 = r21
            java.lang.String r1 = r2.A0D
            if (r1 == 0) goto L_0x001f
            java.lang.String r0 = "application/was"
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r2.A0N = r0
            r11.A01 = r2
            X.777 r0 = new X.777
            r0.<init>()
            r11.A02 = r0
            r0 = r22
            r11.A03 = r0
            r0 = r19
            r11.A04 = r0
            r11.A00 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Bs.<init>(X.17Y, X.1Av, X.0ww, X.0wo, X.0wx, X.0yC, X.1BV, X.1ST, X.1BS, X.6c4, java.io.File):void");
    }

    public File BB2() {
        return this.A03;
    }

    public void BW6(boolean z) {
    }

    public void BW7(C133136Wx r1, C129166Fp r2) {
    }
}
