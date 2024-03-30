package X;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: X.4Ex  reason: invalid class name and case insensitive filesystem */
public final class C84874Ex extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $key = "call_log_message_key";
    public final /* synthetic */ AnonymousClass02E $this_parcelableArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84874Ex(AnonymousClass02E r2) {
        super(0);
        this.$this_parcelableArg = r2;
    }

    public final Object invoke() {
        Parcelable parcelable;
        boolean A09 = C19550w8.A09();
        Bundle bundle = this.$this_parcelableArg.A0A;
        if (!A09) {
            if (bundle != null) {
                parcelable = bundle.getParcelable(this.$key);
            } else {
                parcelable = null;
            }
            if (parcelable instanceof C135006by) {
                return parcelable;
            }
            return null;
        } else if (bundle == null) {
            return null;
        } else {
            return C05420Pq.A00(bundle, C135006by.class, this.$key);
        }
    }
}
