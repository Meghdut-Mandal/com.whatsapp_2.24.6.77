package X;

import com.whatsapp.Mp4Ops;
import com.whatsapp.R;
import java.io.File;

/* renamed from: X.75G  reason: invalid class name */
public final class AnonymousClass75G implements Runnable, AnonymousClass4PA {
    public final C19700wN A00;
    public final AnonymousClass1AV A01;
    public final C19630wG A02;
    public final C121645tU A03;
    public volatile boolean A04;

    public synchronized void cancel() {
        this.A04 = true;
    }

    public void run() {
        AnonymousClass5Bb r1;
        C121645tU r4 = this.A03;
        File file = r4.A02;
        try {
            Mp4Ops.A03(this.A01, file, false);
            r1 = new AnonymousClass5Bb(file, AnonymousClass000.A1Q(this.A04 ? 1 : 0));
        } catch (AnonymousClass5V4 unused) {
            if (!this.A04) {
                r4.A01.B5i(R.string.f12nameremoved);
            }
            r1 = new AnonymousClass5Bb(file, false);
        }
        r4.A00.BY1(r1);
    }

    public AnonymousClass75G(C19700wN r1, AnonymousClass1AV r2, C19630wG r3, C121645tU r4) {
        C36321k7.A11(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }
}
