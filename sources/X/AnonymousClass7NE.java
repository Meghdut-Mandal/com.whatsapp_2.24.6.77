package X;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;

/* renamed from: X.7NE  reason: invalid class name */
public final class AnonymousClass7NE extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass6SX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7NE(AnonymousClass6SX r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Paint A0L = C36441kJ.A0L(1);
        AnonymousClass6SX r1 = this.this$0;
        C36421kH.A0q(A0L);
        A0L.setDither(true);
        PorterDuffXfermode porterDuffXfermode = AnonymousClass6SX.A0Q;
        A0L.setStrokeWidth(r1.A04.A01);
        A0L.setStrokeCap(Paint.Cap.ROUND);
        C112005dC r2 = r1.A05;
        if (r2 instanceof AnonymousClass5QJ) {
            C36381kD.A16(r1.A08, A0L, ((AnonymousClass5QJ) r2).A00.statusColor);
        }
        return A0L;
    }
}
