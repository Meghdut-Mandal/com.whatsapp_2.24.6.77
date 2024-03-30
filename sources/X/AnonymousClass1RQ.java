package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.1RQ  reason: invalid class name */
public final class AnonymousClass1RQ extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass1RO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1RQ(AnonymousClass1RO r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return new Handler(Looper.getMainLooper(), new C36091jk(this.this$0, 1));
    }
}
