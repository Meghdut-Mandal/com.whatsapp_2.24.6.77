package X;

import android.app.Activity;
import android.content.Intent;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4GX  reason: invalid class name */
public final class AnonymousClass4GX extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $key = "jid";
    public final /* synthetic */ Activity $this_jidArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4GX(Activity activity) {
        super(0);
        this.$this_jidArg = activity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String stringExtra;
        Intent intent = this.$this_jidArg.getIntent();
        if (intent != null) {
            intent.getStringExtra(this.$key);
        }
        Intent intent2 = this.$this_jidArg.getIntent();
        if (!(intent2 == null || (stringExtra = intent2.getStringExtra(this.$key)) == null)) {
            Jid A0i = C36411kG.A0i(stringExtra);
            if ((A0i instanceof UserJid) && A0i != null) {
                return A0i;
            }
        }
        throw C82233yN.A00;
    }
}
