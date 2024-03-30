package X;

import android.os.Bundle;

/* renamed from: X.4He  reason: invalid class name and case insensitive filesystem */
public final class C85464He extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ int $default;
    public final /* synthetic */ String $key;
    public final /* synthetic */ AnonymousClass02E $this_intArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85464He(AnonymousClass02E r2, String str, int i) {
        super(0);
        this.$this_intArg = r2;
        this.$key = str;
        this.$default = i;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i;
        Bundle bundle = this.$this_intArg.A0A;
        if (bundle != null) {
            i = bundle.getInt(this.$key, this.$default);
        } else {
            i = this.$default;
        }
        return Integer.valueOf(i);
    }
}
