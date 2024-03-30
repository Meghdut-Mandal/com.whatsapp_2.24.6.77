package X;

import androidx.window.extensions.embedding.SplitInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Amv  reason: case insensitive filesystem */
public final class C22456Amv extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C22767Avd $embeddingCallback;
    public final /* synthetic */ C208109xf this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22456Amv(C208109xf r2, C22767Avd avd) {
        super(1);
        this.$embeddingCallback = avd;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        ArrayList A0l = C36341k9.A0l(list);
        for (Object next : list) {
            if (next instanceof SplitInfo) {
                A0l.add(next);
            }
        }
        C22767Avd avd = this.$embeddingCallback;
        List A00 = this.this$0.A00.A00(A0l);
        C208099xe r1 = (C208099xe) avd;
        AnonymousClass00C.A0D(A00, 0);
        r1.A00 = A00;
        Iterator it = r1.A01.A02.iterator();
        while (it.hasNext()) {
            ((C61903Dy) it.next()).A00(A00);
        }
        return AnonymousClass0AJ.A00;
    }
}
