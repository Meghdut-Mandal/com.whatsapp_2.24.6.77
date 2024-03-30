package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.5zw  reason: invalid class name and case insensitive filesystem */
public abstract class C125455zw {
    public void A00() {
        C132476Tw r1;
        C001700s r12;
        AnonymousClass5LS r0;
        if (this instanceof AnonymousClass5LS) {
            C148856zX.A00(((AnonymousClass5LS) this).A00);
            return;
        }
        if (this instanceof AnonymousClass5LR) {
            C148856zX r2 = ((AnonymousClass5LR) this).A00;
            C132476Tw r13 = r2.A02;
            if (r13 != null) {
                Object A04 = r2.A07.A04();
                if (A04 != null) {
                    r13.A0A(AnonymousClass000.A0I(A04));
                } else {
                    throw C36381kD.A0k();
                }
            }
            C132476Tw r02 = r2.A02;
            if (r02 != null) {
                r02.A07();
            }
            AnonymousClass3QH r03 = r2.A0I;
            r03.A03();
            r03.A02();
            r12 = r2.A08;
            r0 = new AnonymousClass5LS(r2);
        } else if (this instanceof AnonymousClass5LQ) {
            C148856zX r4 = ((AnonymousClass5LQ) this).A00;
            try {
                r1 = C132476Tw.A00(r4.A0D, r4.A0E, (AnonymousClass6KH) r4.A0J.get(), r4.A0K, 3);
                r1.A05();
            } catch (IOException | IllegalStateException e) {
                r4.A0B.A0E("VoiceRecordingPreviewController/failed to prepare audio player", e.toString(), true);
                throw e;
            } catch (IOException e2) {
                Log.e((Throwable) e2);
                r1 = null;
            }
            r4.A02 = r1;
            if (r1 != null) {
                try {
                    Object A042 = r4.A07.A04();
                    if (A042 != null) {
                        r1.A0A(AnonymousClass000.A0I(A042));
                        r1.A08();
                        AnonymousClass3QH r22 = r4.A0I;
                        r22.A03();
                        r4.A04.post(r4.A03);
                        r22.A02();
                        r12 = r4.A08;
                        r0 = new AnonymousClass5LS(r4);
                    } else {
                        throw C36381kD.A0k();
                    }
                } catch (IOException e3) {
                    Log.e((Throwable) e3);
                }
            }
            r4.A0C.A06(R.string.f12nameremoved, 0);
            return;
        } else {
            return;
        }
        r12.A0D(r0);
    }
}
