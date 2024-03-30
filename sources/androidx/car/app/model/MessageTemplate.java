package androidx.car.app.model;

import X.C15640nk;
import X.C165577te;
import X.C165597tg;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class MessageTemplate implements C15640nk {
    public final List mActionList = Collections.emptyList();
    public final ActionStrip mActionStrip = null;
    public final CarText mDebugMessage = null;
    public final Action mHeaderAction = null;
    public final CarIcon mIcon = null;
    public final boolean mIsLoading = false;
    public final CarText mMessage = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageTemplate)) {
            return false;
        }
        MessageTemplate messageTemplate = (MessageTemplate) obj;
        return this.mIsLoading == messageTemplate.mIsLoading && Objects.equals(this.mTitle, messageTemplate.mTitle) && Objects.equals(this.mMessage, messageTemplate.mMessage) && Objects.equals(this.mDebugMessage, messageTemplate.mDebugMessage) && Objects.equals(this.mHeaderAction, messageTemplate.mHeaderAction) && Objects.equals(this.mActionList, messageTemplate.mActionList) && Objects.equals(this.mIcon, messageTemplate.mIcon) && Objects.equals(this.mActionStrip, messageTemplate.mActionStrip);
    }

    public String toString() {
        return "MessageTemplate";
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        C165577te.A1V(objArr, this.mIsLoading);
        objArr[1] = this.mTitle;
        objArr[2] = this.mMessage;
        objArr[3] = this.mDebugMessage;
        objArr[4] = this.mHeaderAction;
        objArr[5] = this.mActionList;
        objArr[6] = this.mIcon;
        return C165597tg.A06(this.mActionStrip, objArr, 7);
    }
}
