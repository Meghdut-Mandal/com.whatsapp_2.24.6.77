package X;

import android.os.Bundle;

/* renamed from: X.4GA  reason: invalid class name */
public final class AnonymousClass4GA extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $key;
    public final /* synthetic */ AnonymousClass02E $this_nullableStringArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4GA(AnonymousClass02E r2, String str) {
        super(0);
        this.$this_nullableStringArg = r2;
        this.$key = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Bundle bundle = this.$this_nullableStringArg.A0A;
        if (bundle != null) {
            return bundle.getString(this.$key);
        }
        return null;
    }
}
