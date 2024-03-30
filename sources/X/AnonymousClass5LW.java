package X;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5LW  reason: invalid class name */
public final class AnonymousClass5LW extends C132476Tw {
    public int A00 = 0;
    public C19700wN A01;
    public C117085lg A02;
    public C158577hj A03;
    public boolean A04;
    public boolean A05 = false;
    public boolean A06 = false;
    public final C204359ps A07;
    public final Uri A08;
    public final C202289lT A09;

    public AnonymousClass5LW(Context context, C20810yC r14, AnonymousClass6KH r15, File file, int i) {
        C204359ps r5;
        boolean z = false;
        Uri fromFile = Uri.fromFile(file);
        this.A08 = fromFile;
        this.A04 = false;
        C202289lT A012 = C202289lT.A01(context, AnonymousClass6KH.A00(r15), B44.A00, AnonymousClass001.A0J());
        this.A09 = A012;
        boolean A1b = C36331k8.A1b(r15.A01);
        AtomicInteger atomicInteger = C204359ps.A0T;
        if (A1b) {
            r5 = new C204359ps((Looper) r15.A00.getValue(), new C140986mU(this), A012, AnonymousClass6KH.A00(r15));
        } else {
            r5 = new C204359ps(new C140986mU(this), A012, AnonymousClass6KH.A00(r15));
        }
        this.A07 = r5;
        int i2 = 1;
        if (r14 != null && r14.A0E(6395)) {
            z = true;
        }
        AnonymousClass00C.A0D(fromFile, 0);
        AnonymousClass65L r0 = new AnonymousClass65L(AnonymousClass5RZ.IN_PLAY, C207239um.A00(fromFile, (Uri) null, String.valueOf(C113415fV.A00.addAndGet(1)), "WA_Player_Origin", "WA_Player_SubOrigin", AnonymousClass001.A0J()), "WA_MEDIA", 1);
        r0.A0C = true;
        r0.A0A = z;
        r5.A0K(r0.A00());
        i2 = i == 0 ? 2 : i2;
        C204359ps r3 = this.A07;
        Object[] A0L = AnonymousClass001.A0L();
        Integer valueOf = Integer.valueOf(i2);
        A0L[0] = valueOf;
        C204359ps.A06(r3, "setAudioUsage: %d", A0L);
        AnonymousClass000.A14(r3.A0C, valueOf, 23);
        AnonymousClass000.A14(this.A07.A0C, new C141036mZ(this), 44);
    }
}
