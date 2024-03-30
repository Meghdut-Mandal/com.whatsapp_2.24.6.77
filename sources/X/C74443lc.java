package X;

import com.whatsapp.R;
import java.util.Set;

/* renamed from: X.3lc  reason: invalid class name and case insensitive filesystem */
public final class C74443lc implements AnonymousClass4U1 {
    public final C62213Ff A00;
    public final Set A01 = C36411kG.A15(Integer.valueOf(R.id.lazy_field_audio_data));

    public C74443lc(C62213Ff r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean BJq(C63503Kh r5) {
        AnonymousClass3T1 r2 = r5.A03;
        if (!(r2 instanceof C46812bi) || r2.A0H() == 2) {
            return false;
        }
        return AnonymousClass000.A1S(r2.A0A & 32768, 32768);
    }

    public void BOL(C63503Kh r4) {
        C62213Ff r2 = this.A00;
        AnonymousClass3T1 r1 = r4.A03;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageAudio");
        r2.A01((C46812bi) r1);
    }

    public Set BI3() {
        return this.A01;
    }
}
