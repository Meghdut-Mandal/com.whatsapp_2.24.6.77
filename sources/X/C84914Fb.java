package X;

import android.animation.ObjectAnimator;
import android.widget.ListView;

/* renamed from: X.4Fb  reason: invalid class name and case insensitive filesystem */
public final class C84914Fb extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass4V7 $conversation;
    public final /* synthetic */ AnonymousClass2HL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84914Fb(AnonymousClass4V7 r2, AnonymousClass2HL r3) {
        super(0);
        this.$conversation = r2;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ListView listView = this.$conversation.getListView();
        AnonymousClass2HL r3 = this.this$0;
        int[] A1O = C36441kJ.A1O();
        A1O[0] = listView.getTop();
        A1O[1] = listView.getTop() - r3.A01.getHeight();
        return ObjectAnimator.ofInt(listView, "Top", A1O);
    }
}
