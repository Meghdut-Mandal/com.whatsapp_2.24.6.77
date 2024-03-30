package X;

import java.util.ArrayList;

/* renamed from: X.4Dd  reason: invalid class name and case insensitive filesystem */
public final class C84414Dd extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass3QP this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84414Dd(AnonymousClass3QP r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        byte[] bArr = this.this$0.A05;
        if (bArr == null) {
            return null;
        }
        ArrayList A14 = C36441kJ.A14(r4);
        for (byte b : bArr) {
            A14.add(Float.valueOf(((float) b) / 100.0f));
        }
        return A14;
    }
}
