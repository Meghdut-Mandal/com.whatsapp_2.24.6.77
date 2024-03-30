package X;

import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.2er  reason: invalid class name and case insensitive filesystem */
public final class C47492er extends AnonymousClass3LJ {
    public final View A00;
    public final C63413Jy A01;

    public C47492er(AnonymousClass17Y r11, C32691e2 r12, C21060yb r13, C18820ts r14, AnonymousClass1SU r15, C63413Jy r16, AnonymousClass3G7 r17) {
        super(r12, r11, r13, r14, r15, r17);
        this.A01 = r16;
        View A0K = C36381kD.A0K(LayoutInflater.from(A0B()), R.layout.f9nameremoved);
        AnonymousClass00C.A08(A0K);
        this.A00 = A0K;
        C36391kE.A0O(A0K, R.id.status_playback_deleting_subtitle).setText(R.string.f12nameremoved);
    }

    public long A0A() {
        return this.A01.A00;
    }

    public void A0G() {
        AnonymousClass3LJ.A09(this.A01, this);
    }

    public void A0H() {
        this.A01.A02();
    }
}
