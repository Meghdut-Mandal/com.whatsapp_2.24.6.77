package X;

import com.whatsapp.R;

/* renamed from: X.2bv  reason: invalid class name and case insensitive filesystem */
public abstract class C46942bv extends AnonymousClass2bU {
    public final C63503Kh A00 = A0U(R.id.lazy_field_audio_data);

    public void A1j(AnonymousClass3QP r2) {
        this.A00.A01(r2);
        if (r2 == null) {
            A0k(32768);
        } else {
            A0j(32768);
        }
    }

    public C46942bv(C64933Qa r2, int i, long j) {
        super(r2, i, j);
    }

    public C46942bv(C65013Qj r10, C64933Qa r11, C46942bv r12, long j, boolean z) {
        super(r10, r11, r12, r12.A1I, j, z);
        Object obj = r12.A00.A00;
        if (obj != null) {
            AnonymousClass3QP r0 = (AnonymousClass3QP) obj;
            A1j(new AnonymousClass3QP(r0.A05, r0.A00, r0.A02, r0.A01, r0.A03));
        }
    }
}
