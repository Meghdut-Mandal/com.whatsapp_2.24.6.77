package X;

import com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType;

/* renamed from: X.7Mx  reason: invalid class name and case insensitive filesystem */
public final class C153067Mx extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C20810yC $abProps;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153067Mx(C20810yC r2) {
        super(0);
        this.$abProps = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass011[] r3 = new AnonymousClass011[5];
        C90464aC.A1E(GraphQLXWA2SuggestedContactsSignalType.PRESENCE, C90494aF.A0T(this.$abProps, 6205), r3);
        C90464aC.A1F(GraphQLXWA2SuggestedContactsSignalType.PROFILE_PICTURE, C90494aF.A0T(this.$abProps, 6204), r3);
        C90474aD.A1F(GraphQLXWA2SuggestedContactsSignalType.NEW_USER, C90494aF.A0T(this.$abProps, 7269), r3);
        C90474aD.A1G(GraphQLXWA2SuggestedContactsSignalType.LAST_ACTIVE, C90494aF.A0T(this.$abProps, 7270), r3);
        C90484aE.A1H(GraphQLXWA2SuggestedContactsSignalType.AREA_CODE, C90494aF.A0T(this.$abProps, 7520), r3);
        return C000400e.A05(r3);
    }
}
