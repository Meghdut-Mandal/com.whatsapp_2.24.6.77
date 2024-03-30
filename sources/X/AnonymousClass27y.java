package X;

import android.content.Context;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.whatsapp.WaEditText;

/* renamed from: X.27y  reason: invalid class name */
public final class AnonymousClass27y extends WaEditText {
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        AnonymousClass00C.A0D(editorInfo, 0);
        editorInfo.actionLabel = null;
        editorInfo.inputType = 0;
        BaseInputConnection baseInputConnection = new BaseInputConnection(this, false);
        try {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (onCreateInputConnection != null) {
                return new C37731n7(baseInputConnection, onCreateInputConnection);
            }
            return null;
        } catch (Exception unused) {
            return super.onCreateInputConnection(editorInfo);
        }
    }

    public AnonymousClass27y(Context context) {
        super(context);
    }
}
