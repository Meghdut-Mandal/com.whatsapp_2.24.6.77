package X;

import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.7SE  reason: invalid class name */
public final class AnonymousClass7SE extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass51F this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7SE(AnonymousClass51F r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C121385t3 r14 = (C121385t3) obj;
        if (r14 != null) {
            AnonymousClass51F r3 = this.this$0;
            AnonymousClass5DR r1 = r3.A03;
            if (r1 == null) {
                throw C36331k8.A0d("businessDirectorySharedPrefs");
            } else if (r1.A03.A00().getBoolean("location_access_granted", r1.A00.A07())) {
                C95404kp A3i = r3.A3i();
                if (A3i.A0D) {
                    C28201Rs r6 = A3i.A0U;
                    LatLng latLng = r14.A01;
                    double d = latLng.A00;
                    double d2 = latLng.A01;
                    r6.A0D(new C1274368h(C1264964g.A00(C134976bv.A00(d, d2), A3i.A04.A01)));
                    A3i.A0D = false;
                    A3i.A0K.A01(C90524aI.A0F(d, d2), A3i, (C132406Tm) null, r14.A02, "device", r14.A00);
                }
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
