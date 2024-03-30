package X;

import android.view.View;
import android.widget.EditText;

/* renamed from: X.3Yv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67183Yv implements View.OnFocusChangeListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ AnonymousClass3QT A01;

    public /* synthetic */ C67183Yv(EditText editText, AnonymousClass3QT r2) {
        this.A01 = r2;
        this.A00 = editText;
    }

    public final void onFocusChange(View view, boolean z) {
        AnonymousClass3QT r2 = this.A01;
        EditText editText = this.A00;
        AnonymousClass00C.A0D(editText, 1);
        r2.A08.A00();
        editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
    }
}
