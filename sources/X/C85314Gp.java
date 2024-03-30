package X;

import android.os.Bundle;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Gp  reason: invalid class name and case insensitive filesystem */
public final class C85314Gp extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $key = "arg_contact_jid";
    public final /* synthetic */ AnonymousClass02E $this_jidArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85314Gp(AnonymousClass02E r2) {
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
            if ((A0i instanceof UserJid) && A0i != null) {
                return A0i;
            }
        }
        throw C82233yN.A00;
    }
}
