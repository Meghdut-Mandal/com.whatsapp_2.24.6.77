package X;

import android.os.Bundle;

/* renamed from: X.4Hf  reason: invalid class name and case insensitive filesystem */
public final class C85474Hf extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ long $default = 0;
    public final /* synthetic */ String $key;
    public final /* synthetic */ AnonymousClass02E $this_longArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85474Hf(AnonymousClass02E r3, String str) {
        super(0);
        this.$this_longArg = r3;
        this.$key = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        long j;
        Bundle bundle = this.$this_longArg.A0A;
        if (bundle != null) {
            j = bundle.getLong(this.$key, this.$default);
        } else {
            j = this.$default;
        }
        return Long.valueOf(j);
    }
}
