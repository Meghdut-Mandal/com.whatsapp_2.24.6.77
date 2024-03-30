package androidx.car.app.suggestion.model;

import X.AnonymousClass000;
import X.C165567td;
import X.C165597tg;
import android.app.PendingIntent;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.Objects;

public final class Suggestion {
    public final PendingIntent mAction;
    public final CarIcon mIcon;
    public final String mIdentifier = "";
    public final CarText mSubtitle;
    public final CarText mTitle;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Suggestion)) {
            return false;
        }
        Suggestion suggestion = (Suggestion) obj;
        return Objects.equals(this.mIdentifier, suggestion.mIdentifier) && Objects.equals(this.mTitle, suggestion.mTitle) && Objects.equals(this.mSubtitle, suggestion.mSubtitle) && Objects.equals(this.mAction, suggestion.mAction) && Objects.equals(this.mIcon, suggestion.mIcon);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mIdentifier;
        objArr[1] = this.mTitle;
        objArr[2] = this.mSubtitle;
        objArr[3] = this.mIcon;
        return C165597tg.A06(this.mAction, objArr, 4);
    }

    public Suggestion() {
        Objects.requireNonNull("");
        this.mTitle = new CarText((CharSequence) "");
        this.mSubtitle = null;
        this.mIcon = null;
        this.mAction = null;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[id: ");
        A0u.append(this.mIdentifier);
        A0u.append(", title: ");
        C165597tg.A14(this.mTitle, A0u);
        A0u.append(", subtitle: ");
        C165597tg.A14(this.mSubtitle, A0u);
        A0u.append(", pendingIntent: ");
        A0u.append(this.mAction);
        A0u.append(", icon: ");
        return C165567td.A0X(this.mIcon, A0u);
    }
}
