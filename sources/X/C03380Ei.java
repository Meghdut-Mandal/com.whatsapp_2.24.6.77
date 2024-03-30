package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* renamed from: X.0Ei  reason: invalid class name and case insensitive filesystem */
public class C03380Ei extends CheckedTextView {
    public static final int[] A01 = {16843016};
    public final C015906w A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C03380Ei(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16843720);
        context.getResources();
        context.getResources();
        C015606t.A04(this);
        C015906w r0 = new C015906w(this);
        this.A00 = r0;
        r0.A0A(attributeSet, 16843720);
        r0.A04();
        C010404j A002 = C010404j.A00(getContext(), attributeSet, A01, 16843720, 0);
        setCheckMarkDrawable(A002.A02(0));
        A002.A02.recycle();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C015906w r0 = this.A00;
        if (r0 != null) {
            r0.A04();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AnonymousClass0PC.A00(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AnonymousClass02X.A02(this, i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass088.A00(callback, this));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C015906w r0 = this.A00;
        if (r0 != null) {
            r0.A07(context, i);
        }
    }
}
