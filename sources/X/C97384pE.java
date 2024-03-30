package X;

import android.os.Build;
import androidx.work.OverwritingInputMerger;

/* renamed from: X.4pE  reason: invalid class name and case insensitive filesystem */
public final class C97384pE extends AnonymousClass6FP {
    public /* bridge */ /* synthetic */ C120745s0 A01() {
        if (!this.A02 || Build.VERSION.SDK_INT < 23 || !this.A00.A09.A00()) {
            return new C97404pG(this);
        }
        throw AnonymousClass001.A08("Cannot set backoff criteria on an idle mode job");
    }

    public C97384pE(Class cls) {
        super(cls);
        this.A00.A0F = OverwritingInputMerger.class.getName();
    }
}
