package androidx.car.app.model.signin;

import X.AnonymousClass000;
import X.C15650nl;
import X.C165597tg;
import X.C22743AvE;
import X.C36331k8;
import X.C36341k9;
import X.C90474aD;
import androidx.car.app.model.CarText;
import java.util.Objects;

public final class InputSignInMethod implements C15650nl {
    public final CarText mDefaultValue = null;
    public final CarText mErrorMessage = null;
    public final CarText mHint = null;
    public final C22743AvE mInputCallbackDelegate = null;
    public final int mInputType = 1;
    public final int mKeyboardType = 1;
    public final boolean mShowKeyboardByDefault = false;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputSignInMethod)) {
            return false;
        }
        InputSignInMethod inputSignInMethod = (InputSignInMethod) obj;
        return this.mInputType == inputSignInMethod.mInputType && this.mKeyboardType == inputSignInMethod.mKeyboardType && this.mShowKeyboardByDefault == inputSignInMethod.mShowKeyboardByDefault && Objects.equals(this.mHint, inputSignInMethod.mHint) && Objects.equals(this.mDefaultValue, inputSignInMethod.mDefaultValue) && Objects.equals(this.mErrorMessage, inputSignInMethod.mErrorMessage);
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.mHint;
        objArr[1] = this.mDefaultValue;
        C36331k8.A1V(objArr, this.mInputType);
        objArr[3] = this.mErrorMessage;
        C36341k9.A1U(objArr, this.mKeyboardType);
        return C165597tg.A06(Boolean.valueOf(this.mShowKeyboardByDefault), objArr, 5);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[inputType:");
        A0u.append(this.mInputType);
        A0u.append(", keyboardType: ");
        A0u.append(this.mKeyboardType);
        return C90474aD.A0g(A0u);
    }
}
