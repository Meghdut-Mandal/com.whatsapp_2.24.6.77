package X;

import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: X.5C1  reason: invalid class name */
public class AnonymousClass5C1 extends AnonymousClass5C2 implements C160107kT, C159697jm {
    public File A00;
    public final C135066c4 A01;
    public final AnonymousClass777 A02 = new AnonymousClass777();
    public final File A03;
    public final C19700wN A04;
    public final C20690y0 A05;
    public final C24041Av A06;
    public final C20810yC A07;
    public final AnonymousClass1ST A08;
    public final C23981Ap A09;
    public final WebpUtils A0A;
    public final boolean A0B;

    public /* synthetic */ void BW4(long j) {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5C1(X.C19700wN r10, X.C20690y0 r11, X.AnonymousClass17Y r12, X.C24041Av r13, X.C20050ww r14, X.C19970wo r15, X.C20060wx r16, X.C20810yC r17, X.AnonymousClass1BV r18, X.AnonymousClass1ST r19, X.AnonymousClass1BS r20, X.C135066c4 r21, X.C23981Ap r22, com.whatsapp.stickers.WebpUtils r23, java.io.File r24, boolean r25) {
        /*
            r9 = this;
            java.util.concurrent.Executor r8 = r12.A04
            r1 = r9
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.A07 = r5
            r0 = r21
            r9.A01 = r0
            r9.A04 = r10
            r0 = r23
            r9.A0A = r0
            r9.A05 = r11
            X.777 r0 = new X.777
            r0.<init>()
            r9.A02 = r0
            r0 = r24
            r9.A03 = r0
            r0 = r25
            r9.A0B = r0
            r0 = r22
            r9.A09 = r0
            r0 = r19
            r9.A08 = r0
            r9.A06 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5C1.<init>(X.0wN, X.0y0, X.17Y, X.1Av, X.0ww, X.0wo, X.0wx, X.0yC, X.1BV, X.1ST, X.1BS, X.6c4, X.1Ap, com.whatsapp.stickers.WebpUtils, java.io.File, boolean):void");
    }

    public C133136Wx B5v() {
        AnonymousClass1ST r11 = this.A08;
        C164007r7 r1 = new C164007r7(this, 1);
        C135066c4 r9 = this.A01;
        if (r11.A0F(r1, this, (AnonymousClass68C) null, (AnonymousClass2bU) null, r9.A0E, false)) {
            try {
                return (C133136Wx) this.A02.get();
            } catch (InterruptedException | ExecutionException e) {
                Log.e("DuplicateStickerDownloadListener/waitForResult ", e);
            }
        } else {
            B0M(this);
            C133136Wx r13 = A02().A00;
            if (r13.A03()) {
                C23981Ap r12 = this.A09;
                File file = this.A03;
                AnonymousClass3S2 A022 = r12.A02(file, "image/webp");
                if (!(A022 == null && (A022 = r9.A04) == null)) {
                    AnonymousClass1XQ[] r17 = A022.A0D;
                    String str = A022.A03;
                    String str2 = A022.A04;
                    String str3 = A022.A06;
                    String str4 = A022.A05;
                    String str5 = A022.A02;
                    boolean z = A022.A0B;
                    boolean z2 = A022.A0C;
                    String str6 = A022.A01;
                    boolean z3 = A022.A07;
                    boolean z4 = A022.A08;
                    AnonymousClass1XQ[] r23 = r17;
                    int i = A022.A00;
                    String str7 = str5;
                    String str8 = str6;
                    String str9 = str3;
                    String str10 = str4;
                    String str11 = str;
                    String str12 = str2;
                    this.A0A.A02(file, new AnonymousClass3S2(str11, str12, str9, str10, str7, str8, r23, i, z, z2, true, z3, z4, A022.A09).A02());
                }
                try {
                    String A002 = AnonymousClass6UG.A00(file);
                    r9.A0B = A002;
                    r9.A0E = A002;
                    if (r9.A00 == 0) {
                        r9.A00 = (int) file.length();
                    }
                    if (!this.A0B) {
                        File A042 = this.A06.A04(r9.A0E, r9.A0D);
                        this.A00 = A042;
                        this.A05.A0f(file, A042);
                        return r13;
                    }
                    this.A00 = file;
                    return r13;
                } catch (IOException unused) {
                    return new C133136Wx(9);
                }
            }
            return new C133136Wx(1);
        }
    }

    public File BB2() {
        return this.A00;
    }

    public void BW6(boolean z) {
    }

    public void BW7(C133136Wx r1, C129166Fp r2) {
    }
}
