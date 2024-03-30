package X;

import com.whatsapp.WaTextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AnV  reason: case insensitive filesystem */
public final class C22492AnV extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C178308fj $adapter;
    public final /* synthetic */ WaTextView $titleTextView;
    public final /* synthetic */ AnonymousClass80R this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22492AnV(WaTextView waTextView, C178308fj r3, AnonymousClass80R r4) {
        super(1);
        this.this$0 = r4;
        this.$titleTextView = waTextView;
        this.$adapter = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C195649Vk r6 = (C195649Vk) obj;
        AnonymousClass80R r3 = this.this$0;
        WaTextView waTextView = this.$titleTextView;
        AnonymousClass00C.A07(waTextView);
        AnonymousClass80R.A00(waTextView, r3, r6.A00);
        C178308fj r4 = this.$adapter;
        List<C195829We> list = r6.A01;
        ArrayList A0J = C36321k7.A0J(list);
        for (C195829We r1 : list) {
            A0J.add(new C178268ff(r1));
        }
        ArrayList A0q = C36361kB.A0q(A0J);
        if (A0q.isEmpty()) {
            A0q.add(C178288fh.A00);
        }
        A0q.add(C178278fg.A00);
        r4.A00.A00(A0q);
        return AnonymousClass0AJ.A00;
    }
}
