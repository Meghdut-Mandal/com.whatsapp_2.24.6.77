package X;

import android.os.Bundle;

/* renamed from: X.4Hd  reason: invalid class name and case insensitive filesystem */
public final class C85454Hd extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ boolean $default;
    public final /* synthetic */ String $key;
    public final /* synthetic */ AnonymousClass02E $this_booleanArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85454Hd(AnonymousClass02E r2, String str, boolean z) {
        super(0);
        this.$this_booleanArg = r2;
        this.$key = str;
        this.$default = z;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        Bundle bundle = this.$this_booleanArg.A0A;
        if (bundle != null) {
            z = bundle.getBoolean(this.$key, this.$default);
        } else {
            z = this.$default;
        }
        return Boolean.valueOf(z);
    }
}
