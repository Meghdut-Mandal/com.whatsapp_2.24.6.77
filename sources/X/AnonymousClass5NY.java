package X;

import android.net.Uri;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: X.5NY  reason: invalid class name */
public class AnonymousClass5NY extends C139176jM implements C25711Hj {
    public final C602437b A00;
    public final C146506vi A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5NY(android.content.Context r2, X.C146506vi r3, X.C602437b r4) {
        /*
            r1 = this;
            X.1Hk r0 = r3.A0A
            java.lang.Object r0 = r0.A00()
            X.5vB r0 = (X.C122635vB) r0
            if (r0 == 0) goto L_0x0018
            java.io.File r0 = r0.A01
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
        L_0x0010:
            r1.<init>(r2, r0)
            r1.A01 = r3
            r1.A00 = r4
            return
        L_0x0018:
            r0 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NY.<init>(android.content.Context, X.6vi, X.37b):void");
    }

    public long Bks(C202189lD r3) {
        this.A01.A0A.A03(this, (Executor) null);
        return super.Bks(r3);
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        File file = ((C122635vB) obj).A01;
        Uri fromFile = Uri.fromFile(file);
        synchronized (this.A04) {
            if (!fromFile.equals(this.A01)) {
                this.A01 = fromFile;
                this.A02 = true;
            }
        }
        C602437b r5 = this.A00;
        if (r5 != null) {
            if (!(r5.A01 == null || r5.A00 == file.length())) {
                C1497472p.A00(r5.A02, r5, 26);
            }
            r5.A00 = file.length();
        }
    }

    public void close() {
        this.A01.A0A.A02(this);
        super.close();
    }
}
