package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealReason;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ViolationCategory;

/* renamed from: X.2Z2  reason: invalid class name */
public final class AnonymousClass2Z2 extends AnonymousClass3X9 {
    public static final Parcelable.Creator CREATOR = new C66663Wv();
    public final GraphQLXWA2AppealState A00;
    public final GraphQLXWA2ViolationCategory A01;
    public final String A02;
    public final String A03;
    public final GraphQLXWA2AppealReason A04;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2Z2) {
                AnonymousClass2Z2 r5 = (AnonymousClass2Z2) obj;
                if (!(this.A00 == r5.A00 && this.A04 == r5.A04 && this.A01 == r5.A01 && AnonymousClass00C.A0J(this.A02, r5.A02) && AnonymousClass00C.A0J(this.A03, r5.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        C36391kE.A1E(parcel, this.A00);
        GraphQLXWA2AppealReason graphQLXWA2AppealReason = this.A04;
        if (graphQLXWA2AppealReason == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C36391kE.A1E(parcel, graphQLXWA2AppealReason);
        }
        C36391kE.A1E(parcel, this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public int hashCode() {
        return ((C36351kA.A05(this.A01, (C36391kE.A0A(this.A00) + AnonymousClass000.A0H(this.A04)) * 31) + C36421kH.A05(this.A02)) * 31) + this.A03.hashCode();
    }

    public AnonymousClass2Z2(GraphQLXWA2AppealReason graphQLXWA2AppealReason, GraphQLXWA2AppealState graphQLXWA2AppealState, GraphQLXWA2ViolationCategory graphQLXWA2ViolationCategory, String str, String str2) {
        C36321k7.A0y(graphQLXWA2AppealState, graphQLXWA2ViolationCategory);
        AnonymousClass00C.A0D(str2, 5);
        this.A00 = graphQLXWA2AppealState;
        this.A04 = graphQLXWA2AppealReason;
        this.A01 = graphQLXWA2ViolationCategory;
        this.A02 = str;
        this.A03 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MessageEnforcement(appealState=");
        A0u.append(this.A00);
        A0u.append(", appealReason=");
        A0u.append(this.A04);
        A0u.append(", violationCategory=");
        A0u.append(this.A01);
        A0u.append(", creationTime=");
        A0u.append(this.A02);
        A0u.append(", serverMsgId=");
        return C36321k7.A0E(this.A03, A0u);
    }
}
