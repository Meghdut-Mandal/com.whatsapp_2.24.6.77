package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealReason;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ViolationCategory;

/* renamed from: X.3Ww  reason: invalid class name and case insensitive filesystem */
public final class C66673Ww implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        GraphQLXWA2AppealReason valueOf;
        GraphQLXWA2AppealState valueOf2 = GraphQLXWA2AppealState.valueOf(C36341k9.A0g(parcel));
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = GraphQLXWA2AppealReason.valueOf(parcel.readString());
        }
        return new AnonymousClass2Z0(valueOf, valueOf2, GraphQLXWA2ViolationCategory.valueOf(parcel.readString()), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass2Z0[i];
    }
}
