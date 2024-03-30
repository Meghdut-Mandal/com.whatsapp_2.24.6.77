package X;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;

/* renamed from: X.2HC  reason: invalid class name */
public abstract class AnonymousClass2HC extends AnonymousClass22i {
    public static final Editable.Factory A05 = new C37191ly();
    public C19730wQ A00;
    public C87624Pn A01;
    public C19420v0 A02;
    public AnonymousClass1N2 A03;
    public Runnable A04;

    public void setInputEnterDone(boolean z) {
        int i = 0;
        if (z) {
            i = 6;
        }
        setInputEnterAction(i);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        C87624Pn r0 = this.A01;
        if (r0 != null) {
            r0.BZV(keyEvent, i);
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public boolean onTextContextMenuItem(int i) {
        if (Build.VERSION.SDK_INT >= 23 && i == 16908322) {
            i = 16908337;
        }
        return super.onTextContextMenuItem(i);
    }

    public void setupEnterIsSend(Runnable runnable) {
        this.A04 = runnable;
        boolean z = C36341k9.A0E(this.A02).getBoolean("input_enter_send", true);
        if (C36441kJ.A1J(this.A00)) {
            int i = 0;
            if (z) {
                i = 4;
            }
            setInputEnterAction(i);
        }
        setOnKeyListener(new AnonymousClass4ZW(this, 1));
    }

    public AnonymousClass2HC(Context context) {
        super(context);
        setEditableFactory(A05);
        setCustomSelectionActionModeCallback(new AnonymousClass4YR(this, 1));
    }

    public void setOnKeyPreImeListener(C87624Pn r1) {
        this.A01 = r1;
    }

    public AnonymousClass2HC(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setEditableFactory(A05);
        setCustomSelectionActionModeCallback(new AnonymousClass4YR(this, 1));
    }

    public AnonymousClass2HC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setEditableFactory(A05);
        setCustomSelectionActionModeCallback(new AnonymousClass4YR(this, 1));
    }
}
