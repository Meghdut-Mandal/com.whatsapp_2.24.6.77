package X;

import android.os.Bundle;

/* renamed from: X.4GB  reason: invalid class name */
public final class AnonymousClass4GB extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $key;
    public final /* synthetic */ AnonymousClass02E $this_stringArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4GB(AnonymousClass02E r2, String str) {
        super(0);
        this.$this_stringArg = r2;
        this.$key = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String string;
        Bundle bundle = this.$this_stringArg.A0A;
        if (bundle != null && (string = bundle.getString(this.$key)) != null) {
            return string;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("No value for ");
        throw AnonymousClass001.A0A(AnonymousClass000.A0q(this.$key, A0u));
    }
}
