package X;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* renamed from: X.76l  reason: invalid class name */
public class AnonymousClass76l implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass6XM A01;
    public final /* synthetic */ AnonymousClass6QD A02;

    public AnonymousClass76l(AnonymousClass6XM r1, AnonymousClass6QD r2, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object call() {
        C109655Yk r6;
        C128956Eg A012;
        AnonymousClass6QD r3 = this.A02;
        boolean z = false;
        if (!(r3 == null || (A012 = r3.A01(AnonymousClass5TE.AUDIO, this.A00)) == null)) {
            try {
                z = C109715Yq.A00(((AnonymousClass6F1) C36441kJ.A15(A012.A01).get(0)).A01.getCanonicalPath(), C108365Tf.CODEC_ANDROID_AUDIO_AAC.value).equals(C108365Tf.CODEC_AUDIO_MP3.value);
            } catch (IOException e) {
                AnonymousClass6MV r0 = new AnonymousClass6MV();
                AnonymousClass6MV.A00(r0, e);
                Throwable th = r0.A01;
                if (th != null) {
                    throw new Exception(th);
                }
            }
        }
        AnonymousClass6XM r02 = this.A01;
        AnonymousClass64W r1 = r02.A0G;
        C125085zI r7 = r02.A08;
        C1271867h r32 = r02.A0E;
        ByteBuffer byteBuffer = C141346n5.A0K;
        C109645Yj r5 = r1.A04;
        AnonymousClass7ez r4 = r1.A03;
        if (z) {
            r6 = new C109655Yk();
        } else {
            r6 = r1.A05;
        }
        C141346n5 r2 = new C141346n5(r32, r4, r5, r6, r7);
        try {
            r2.B3P(this.A00);
            return r2;
        } catch (Throwable th2) {
            AnonymousClass6MV r12 = new AnonymousClass6MV();
            AnonymousClass6MV.A00(r12, th2);
            AnonymousClass60I.A00(new C162577oo(r12, (C160937lp) r2));
            Throwable th3 = r12.A01;
            if (th3 == null) {
                return r2;
            }
            throw new Exception(th3);
        }
    }
}
