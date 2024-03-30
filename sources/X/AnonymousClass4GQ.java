package X;

import android.app.Activity;
import android.content.Intent;
import com.whatsapp.jid.Jid;

/* renamed from: X.4GQ  reason: invalid class name */
public final class AnonymousClass4GQ extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $key = "group_jid";
    public final /* synthetic */ Activity $this_jidArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4GQ(Activity activity) {
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
            if ((A0i instanceof AnonymousClass147) && A0i != null) {
                return A0i;
            }
        }
        throw C82233yN.A00;
    }
}
