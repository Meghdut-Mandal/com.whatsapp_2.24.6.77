package X;

import org.json.JSONObject;

/* renamed from: X.AmH  reason: case insensitive filesystem */
public final class C22416AmH extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C201259jD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22416AmH(C201259jD r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        B2T b2t = (B2T) obj;
        JSONObject A0q = C90464aC.A0q(b2t);
        A0q.put("code", b2t.B9n());
        A0q.put("detail", b2t.BB3());
        A0q.put("category", b2t.B9T());
        return C36381kD.A0y(A0q);
    }
}
