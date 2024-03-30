package X;

import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.2ZM  reason: invalid class name */
public class AnonymousClass2ZM extends C19590wC {
    public void A00(AnonymousClass3T1 r7) {
        Log.i("messageaudio/play");
        Iterator A0s = C36361kB.A0s(this);
        while (A0s.hasNext()) {
            C70803fk r4 = ((AnonymousClass3N2) A0s.next()).A00;
            AnonymousClass6YP r0 = r4.A5Z;
            if (r0 != null) {
                boolean A0V = r0.A0V();
                AnonymousClass6YP r02 = r4.A5Z;
                if (A0V) {
                    r02.A0K();
                } else {
                    C132476Tw r03 = r02.A0G;
                    if (r03 != null && r03.A0D()) {
                        r4.A5Z.A0L();
                    }
                }
            }
            C70803fk.A0d(r4);
            for (AnonymousClass38r r04 : r4.A5V.A00.A08) {
                r04.hashCode();
                AnonymousClass31D r05 = r04.A00;
                if (r05 != null) {
                    C50372ke r2 = r05.A00;
                    if (!r2.A00.A06) {
                        r2.A0f(false);
                    }
                }
            }
            AnonymousClass1V6 messageAudioPlayerProvider = r4.A2l.getMessageAudioPlayerProvider();
            if (messageAudioPlayerProvider.A00 != null && !messageAudioPlayerProvider.A0D(r7)) {
                messageAudioPlayerProvider.A00.A0H(false, false);
            }
        }
    }
}
