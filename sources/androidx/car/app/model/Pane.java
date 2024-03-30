package androidx.car.app.model;

import X.AnonymousClass000;
import X.C165567td;
import X.C165587tf;
import X.C165597tg;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class Pane {
    public final List mActionList = Collections.emptyList();
    public final CarIcon mImage = null;
    public final boolean mIsLoading = false;
    public final List mRows = Collections.emptyList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pane)) {
            return false;
        }
        Pane pane = (Pane) obj;
        return this.mIsLoading == pane.mIsLoading && Objects.equals(this.mActionList, pane.mActionList) && Objects.equals(this.mRows, pane.mRows) && Objects.equals(this.mImage, pane.mImage);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.mRows;
        objArr[1] = this.mActionList;
        C165587tf.A1X(objArr, this.mIsLoading);
        return C165597tg.A06(this.mImage, objArr, 3);
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ rows: ");
        List list = this.mRows;
        if (list != null) {
            str = list.toString();
        } else {
            str = null;
        }
        A0u.append(str);
        A0u.append(", action list: ");
        return C165567td.A0X(this.mActionList, A0u);
    }
}
