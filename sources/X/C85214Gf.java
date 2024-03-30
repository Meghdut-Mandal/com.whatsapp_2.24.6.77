package X;

import android.os.Bundle;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: X.4Gf  reason: invalid class name and case insensitive filesystem */
public final class C85214Gf extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $key = "invitee_jids";
    public final /* synthetic */ AnonymousClass02E $this_jidListArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85214Gf(AnonymousClass02E r2) {
        super(0);
        this.$this_jidListArg = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ArrayList<String> stringArrayList;
        Bundle bundle = this.$this_jidListArg.A0A;
        if (bundle == null || (stringArrayList = bundle.getStringArrayList(this.$key)) == null) {
            C023409w r1 = C023409w.A00;
            Objects.requireNonNull(r1, "null cannot be cast to non-null type kotlin.collections.MutableList<com.whatsapp.jid.UserJid>");
            return C07710Yz.A01(r1);
        }
        ArrayList A06 = AnonymousClass143.A06(Jid.class, stringArrayList);
        if ((A06 instanceof List) && (!(A06 instanceof AnonymousClass00W) || (A06 instanceof C004902e))) {
            return A06;
        }
        throw C82233yN.A00;
    }
}
