package X;

import android.os.Bundle;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: X.4FK  reason: invalid class name */
public final class AnonymousClass4FK extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $key = "subgroup_jid_list";
    public final /* synthetic */ AnonymousClass02E $this_jidListArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4FK(AnonymousClass02E r2) {
        super(0);
        this.$this_jidListArg = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ArrayList<String> stringArrayList;
        Bundle bundle = this.$this_jidListArg.A0A;
        if (bundle == null || (stringArrayList = bundle.getStringArrayList(this.$key)) == null) {
            C023409w r1 = C023409w.A00;
            Objects.requireNonNull(r1, "null cannot be cast to non-null type kotlin.collections.List<com.whatsapp.jid.PermanentGroupJid>");
            return r1;
        }
        ArrayList A06 = AnonymousClass143.A06(Jid.class, stringArrayList);
        if (A06 instanceof List) {
            return A06;
        }
        throw C82233yN.A00;
    }
}
