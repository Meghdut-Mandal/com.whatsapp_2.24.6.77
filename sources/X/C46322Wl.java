package X;

import com.whatsapp.infra.graphql.BaseMexCallback;
import com.whatsapp.infra.graphql.generated.registration.enums.GraphQLXWA2RegUpsell;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.registration.passkeys.PasskeyFacade;
import com.whatsapp.util.Log;

/* renamed from: X.2Wl  reason: invalid class name and case insensitive filesystem */
public final class C46322Wl extends BaseMexCallback {
    public final /* synthetic */ C61593Cr A00;
    public final /* synthetic */ C61933Eb A01;

    public /* bridge */ /* synthetic */ void A02(AnonymousClass9Y8 r8) {
        C61933Eb r3;
        String str;
        String A0i;
        StringBuilder A0t = C36401kF.A0t(r8, 0);
        A0t.append("RegistrationUpsellProtocolHelper/getRegistrationUpsell/onData/screen: ");
        GraphQLXWA2RegUpsell graphQLXWA2RegUpsell = GraphQLXWA2RegUpsell.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        C36321k7.A1N(r8.A06(graphQLXWA2RegUpsell, "xwa2_reg_upsell"), A0t);
        int ordinal = ((GraphQLXWA2RegUpsell) r8.A06(graphQLXWA2RegUpsell, "xwa2_reg_upsell")).ordinal();
        if (ordinal == 2) {
            r3 = this.A01;
            PasskeyFacade B40 = r3.A03.B40(r3.A04.B41(1));
            if (!C36371kC.A1U(C36341k9.A0E(r3.A02.A00), "reg_abprop_passkey_create_education_screen") || !B40.A03()) {
                str = "RegistrationUpsellProtocolHelper/getRegistrationUpsell/onData/failed passkey client checks";
                Log.i(str);
                this.A00.A00(GraphQLXWA2RegUpsell.NONE);
                r3.A00("NONE");
                return;
            }
        } else if (ordinal == 1) {
            r3 = this.A01;
            AnonymousClass1DY r2 = r3.A00;
            if (!r2.A03.A0E(6114) || r2.A00.A0L() || !((A0i = r2.A01.A0i()) == null || A0i.length() == 0)) {
                str = "RegistrationUpsellProtocolHelper/getRegistrationUpsell/onData/failed email eligibility check";
                Log.i(str);
                this.A00.A00(GraphQLXWA2RegUpsell.NONE);
                r3.A00("NONE");
                return;
            }
        } else if (ordinal == 0 || ordinal == 3) {
            C61593Cr r1 = this.A00;
            GraphQLXWA2RegUpsell graphQLXWA2RegUpsell2 = (GraphQLXWA2RegUpsell) r8.A06(graphQLXWA2RegUpsell, "xwa2_reg_upsell");
            AnonymousClass00C.A08(graphQLXWA2RegUpsell2);
            r1.A00(graphQLXWA2RegUpsell2);
            this.A01.A00("NONE");
            return;
        } else {
            return;
        }
        C61593Cr r12 = this.A00;
        GraphQLXWA2RegUpsell graphQLXWA2RegUpsell3 = (GraphQLXWA2RegUpsell) r8.A06(graphQLXWA2RegUpsell, "xwa2_reg_upsell");
        AnonymousClass00C.A08(graphQLXWA2RegUpsell3);
        r12.A00(graphQLXWA2RegUpsell3);
    }

    public boolean A06(C201259jD r5) {
        C36321k7.A1J(r5, "RegistrationUpsellProtocolHelper/getRegistrationUpsell/onError : ", C36401kF.A0t(r5, 0));
        C61593Cr r1 = this.A00;
        Log.e("RegisterName/showNextScreen/getRegistrationUpsell/onFailure");
        RegisterName registerName = r1.A00;
        registerName.A1R.A00(C81143wX.A00(registerName, 21));
        return false;
    }

    public C46322Wl(C61593Cr r1, C61933Eb r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
