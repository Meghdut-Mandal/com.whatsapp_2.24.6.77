package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import com.whatsapp.R;

/* renamed from: X.074  reason: invalid class name */
public class AnonymousClass074 extends EditText implements C012105f {
    public final C015706u A00;
    public final AnonymousClass07Q A01;
    public final C015906w A02;
    public final C09760ct A03;

    public boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        int i2 = 0;
        if ((i != 16908322 && i != 16908337) || C012005e.A0g(this) == null) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() <= 0) {
            return true;
        }
        AnonymousClass0WI r0 = new AnonymousClass0WI(primaryClip, 1);
        if (i != 16908322) {
            i2 = 1;
        }
        C17280r1 r02 = r0.A00;
        r02.Bqs(i2);
        C012005e.A06(this, r02.B20());
        return true;
    }

    public AnonymousClass0X6 BeF(AnonymousClass0X6 r2) {
        return this.A03.BeE(this, r2);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C015806v r0;
        C015706u r02 = this.A00;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A00;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C015806v r0;
        C015706u r02 = this.A00;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A01;
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public TextClassifier getTextClassifier() {
        AnonymousClass07Q r0;
        if (Build.VERSION.SDK_INT >= 28 || (r0 = this.A01) == null) {
            return super.getTextClassifier();
        }
        return r0.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Can't handle drop: no activity: view=");
        r1.append(r3);
        android.util.Log.i("ReceiveContent", r1.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onDragEvent(android.view.DragEvent r4) {
        /*
            r3 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0063
            java.lang.Object r0 = r4.getLocalState()
            if (r0 != 0) goto L_0x0063
            java.lang.String[] r0 = X.C012005e.A0g(r3)
            if (r0 == 0) goto L_0x0063
            android.content.Context r2 = r3.getContext()
        L_0x0016:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x004d
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0046
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L_0x004d
            int r1 = r4.getAction()
            r0 = 1
            if (r1 != r0) goto L_0x0031
            boolean r0 = r3 instanceof android.widget.TextView
            r0 = r0 ^ 1
        L_0x002d:
            if (r0 == 0) goto L_0x0063
            r0 = 1
            return r0
        L_0x0031:
            int r1 = r4.getAction()
            r0 = 3
            if (r1 != r0) goto L_0x0063
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x0041
            boolean r0 = X.AnonymousClass0VB.A01(r2, r4, r3)
            goto L_0x002d
        L_0x0041:
            boolean r0 = X.AnonymousClass0VB.A00(r2, r4, r3)
            goto L_0x002d
        L_0x0046:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto L_0x0016
        L_0x004d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Can't handle drop: no activity: view="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ReceiveContent"
            android.util.Log.i(r0, r1)
        L_0x0063:
            boolean r0 = super.onDragEvent(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass074.onDragEvent(android.view.DragEvent):boolean");
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A03(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A04(mode);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        AnonymousClass07Q r0;
        if (Build.VERSION.SDK_INT >= 28 || (r0 = this.A01) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            r0.A01(textClassifier);
        }
    }

    public AnonymousClass074(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        C015906w r02 = this.A02;
        if (r02 != null) {
            r02.A04();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C015906w.A03(editorInfo, onCreateInputConnection, this);
        AnonymousClass0PC.A00(this, editorInfo, onCreateInputConnection);
        String[] A0g = C012005e.A0g(this);
        if (onCreateInputConnection == null || A0g == null) {
            return onCreateInputConnection;
        }
        EditorInfoCompat.setContentMimeTypes(editorInfo, A0g);
        return InputConnectionCompat.createWrapper(onCreateInputConnection, editorInfo, (InputConnectionCompat.OnCommitContentListener) new C09820cz(this));
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A02(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass088.A00(callback, this));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C015906w r0 = this.A02;
        if (r0 != null) {
            r0.A07(context, i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass074(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        C015606t.A03(getContext(), this);
        C015706u r0 = new C015706u(this);
        this.A00 = r0;
        r0.A05(attributeSet, i);
        C015906w r02 = new C015906w(this);
        this.A02 = r02;
        r02.A0A(attributeSet, i);
        r02.A04();
        this.A01 = new AnonymousClass07Q(this);
        this.A03 = new C09760ct();
    }
}
