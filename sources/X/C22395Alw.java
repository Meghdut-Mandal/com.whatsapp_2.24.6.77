package X;

import android.view.Surface;

/* renamed from: X.Alw  reason: case insensitive filesystem */
public final class C22395Alw extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C203169nR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22395Alw(C203169nR r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Surface surface = (Surface) obj;
        AnonymousClass00C.A0D(surface, 0);
        Surface surface2 = this.this$0.A01;
        if (surface2 != null) {
            surface2.release();
        }
        this.this$0.A01 = surface;
        AnonymousClass9AO.A01.A02("sup:SUPDelegate", "Configuring new surface");
        C200219gt r2 = this.this$0.A0B;
        if (r2.A0M) {
            r2.A02().A09(false);
            r2.A02().A05(surface);
        }
        return AnonymousClass0AJ.A00;
    }
}
