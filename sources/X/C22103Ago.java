package X;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: X.Ago  reason: case insensitive filesystem */
public final class C22103Ago extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C21121A9g this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22103Ago(C21121A9g a9g) {
        super(0);
        this.this$0 = a9g;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C21121A9g a9g = this.this$0;
        AnonymousClass9Xb A03 = C21121A9g.A03(a9g);
        Matrix A0B = C90524aI.A0B();
        A0B.setTranslate(0.0f, A03.A0G);
        Path path = new Path((Path) a9g.A06.getValue());
        path.transform(A0B);
        path.close();
        return path;
    }
}
