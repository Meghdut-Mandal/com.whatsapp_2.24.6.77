package androidx.car.app.navigation.model;

import X.C15660nm;
import X.C165597tg;
import X.C36441kJ;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.Objects;

public final class MessageInfo implements C15660nm {
    public final CarIcon mImage = null;
    public final CarText mText = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageInfo)) {
            return false;
        }
        MessageInfo messageInfo = (MessageInfo) obj;
        return Objects.equals(this.mTitle, messageInfo.mTitle) && Objects.equals(this.mText, messageInfo.mText) && Objects.equals(this.mImage, messageInfo.mImage);
    }

    public String toString() {
        return "MessageInfo";
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = this.mTitle;
        A1Q[1] = this.mText;
        return C165597tg.A06(this.mImage, A1Q, 2);
    }
}
