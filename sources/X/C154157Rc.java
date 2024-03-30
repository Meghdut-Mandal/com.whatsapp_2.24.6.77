package X;

import android.content.res.Configuration;

/* renamed from: X.7Rc  reason: invalid class name and case insensitive filesystem */
public final class C154157Rc extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C161547n5 $configuration$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154157Rc(C161547n5 r2) {
        super(1);
        this.$configuration$delegate = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.$configuration$delegate.setValue(new Configuration((Configuration) obj));
        return AnonymousClass0AJ.A00;
    }
}
