package X;

import android.os.Bundle;
import com.whatsapp.jid.Jid;

/* renamed from: X.4Fa  reason: invalid class name and case insensitive filesystem */
public final class C84904Fa extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $key = "jid";
    public final /* synthetic */ AnonymousClass02E $this_jidArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84904Fa(AnonymousClass02E r2) {
        super(0);
        this.$this_jidArg = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String string;
        Bundle bundle = this.$this_jidArg.A0A;
        if (bundle != null) {
            bundle.getString(this.$key);
        }
        Bundle bundle2 = this.$this_jidArg.A0A;
        if (!(bundle2 == null || (string = bundle2.getString(this.$key)) == null)) {
            Jid A0i = C36411kG.A0i(string);
            if ((A0i instanceof AnonymousClass11F) && A0i != null) {
                return A0i;
            }
        }
        throw C82233yN.A00;
    }
}
