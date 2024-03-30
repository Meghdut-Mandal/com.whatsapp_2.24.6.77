package X;

import java.nio.ByteBuffer;

/* renamed from: X.An2  reason: case insensitive filesystem */
public final class C22463An2 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass9Y3 $lifecycleState;
    public final /* synthetic */ AnonymousClass8AH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22463An2(AnonymousClass9Y3 r2, AnonymousClass8AH r3) {
        super(1);
        this.this$0 = r3;
        this.$lifecycleState = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        AnonymousClass00C.A0D(byteBuffer, 0);
        AnonymousClass8AH r2 = this.this$0;
        r2.A0B(new C22251AjC(this.$lifecycleState, r2, byteBuffer));
        return AnonymousClass0AJ.A00;
    }
}
