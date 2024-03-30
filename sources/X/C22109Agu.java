package X;

import android.graphics.Rect;

/* renamed from: X.Agu  reason: case insensitive filesystem */
public final class C22109Agu extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C21121A9g this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22109Agu(C21121A9g a9g) {
        super(0);
        this.this$0 = a9g;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Rect rect = new Rect();
        C21121A9g a9g = this.this$0;
        rect.left = (int) C21121A9g.A03(a9g).A07;
        AnonymousClass00T r1 = a9g.A05;
        rect.right = (int) ((AnonymousClass9Xb) r1.getValue()).A08;
        rect.top = (int) ((AnonymousClass9Xb) r1.getValue()).A0C;
        rect.bottom = (int) ((AnonymousClass9Xb) r1.getValue()).A0D;
        return rect;
    }
}
