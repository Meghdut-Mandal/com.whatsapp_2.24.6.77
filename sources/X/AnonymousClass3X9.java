package X;

import android.os.Parcelable;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState;

/* renamed from: X.3X9  reason: invalid class name */
public abstract class AnonymousClass3X9 implements Parcelable {
    public GraphQLXWA2AppealState A00() {
        if (this instanceof AnonymousClass2Z0) {
            return ((AnonymousClass2Z0) this).A00;
        }
        if (this instanceof AnonymousClass2Z2) {
            return ((AnonymousClass2Z2) this).A00;
        }
        return ((AnonymousClass2Z1) this).A00;
    }

    public String A01() {
        if (this instanceof AnonymousClass2Z0) {
            return ((AnonymousClass2Z0) this).A02;
        }
        if (this instanceof AnonymousClass2Z2) {
            return ((AnonymousClass2Z2) this).A02;
        }
        return ((AnonymousClass2Z1) this).A02;
    }
}
