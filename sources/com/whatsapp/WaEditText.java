package com.whatsapp;

import X.AnonymousClass00C;
import X.AnonymousClass14B;
import X.AnonymousClass1SC;
import X.AnonymousClass4P7;
import X.C1496972k;
import X.C18820ts;
import X.C21060yb;
import X.C36331k8;
import X.C36381kD;
import X.C39011qu;
import X.C65043Qm;
import X.C90364a2;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Selection;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.components.PhoneNumberEntry;

public class WaEditText extends C39011qu {
    public Rect A00;
    public AnonymousClass4P7 A01;
    public C21060yb A02;
    public C18820ts A03;
    public boolean A04;
    public final Runnable A05 = new C1496972k(this, 10);

    private void A07(Context context, AttributeSet attributeSet) {
        if (attributeSet != null && !isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1SC.A01);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                setContentDescription(this.A03.A0B(resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId2 != 0) {
                setHint(resourceId2);
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId3 != 0) {
                setImeActionLabel(this.A03.A0B(resourceId3), getImeActionId());
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId4 != 0) {
                setText(this.A03.A0B(resourceId4));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void A0B() {
        InputMethodManager A0N = this.A02.A0N();
        this.A04 = false;
        removeCallbacks(this.A05);
        if (A0N != null) {
            A0N.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    public void A0C(boolean z) {
        InputMethodManager A0N = this.A02.A0N();
        if (A0N == null) {
            return;
        }
        if (A0N.isFullscreenMode() && !z) {
            return;
        }
        if (A0N.isActive(this)) {
            this.A04 = false;
            removeCallbacks(this.A05);
            A0N.showSoftInput(this, 0);
            return;
        }
        requestFocus();
        this.A04 = true;
    }

    public boolean A0D(Point point) {
        int i;
        Rect rect = this.A00;
        if (rect == null) {
            return true;
        }
        int i2 = point.x;
        if (i2 < rect.left || i2 > rect.right || (i = point.y) < rect.top || i > rect.bottom) {
            return false;
        }
        return true;
    }

    public boolean onTextContextMenuItem(int i) {
        AnonymousClass4P7 r1 = this.A01;
        if (r1 != null) {
            C90364a2 r12 = (C90364a2) r1;
            if (r12.A01 != 0) {
                C65043Qm r5 = (C65043Qm) r12.A00;
                String[] A012 = PhoneNumberEntry.A01(r5.A07, r5.A0A, i, true);
                if (A012 != null) {
                    String str = A012[0];
                    AnonymousClass00C.A05(str);
                    r5.A06(str);
                    WaEditText waEditText = r5.A05;
                    if (waEditText == null) {
                        throw C36331k8.A0d("phoneField");
                    }
                    waEditText.setText(A012[1]);
                    WaEditText waEditText2 = r5.A05;
                    if (waEditText2 == null) {
                        throw C36331k8.A0d("phoneField");
                    }
                    waEditText2.setSelection(waEditText2.length());
                    return true;
                }
            } else {
                PhoneNumberEntry phoneNumberEntry = (PhoneNumberEntry) r12.A00;
                String[] A013 = PhoneNumberEntry.A01(phoneNumberEntry.A00, phoneNumberEntry.A04, i, false);
                if (A013 != null) {
                    phoneNumberEntry.A01.setText(A013[0]);
                    phoneNumberEntry.A02.setText(A013[1]);
                    return true;
                }
            }
        }
        if (super.onTextContextMenuItem(i)) {
            return true;
        }
        return false;
    }

    public void setKeyFilter(String str) {
        if (str != null) {
            setKeyListener(DigitsKeyListener.getInstance(str));
        }
    }

    public WaEditText(Context context) {
        super(context);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.A04) {
            Runnable runnable = this.A05;
            removeCallbacks(runnable);
            post(runnable);
        }
        return onCreateInputConnection;
    }

    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException unused) {
            setText(AnonymousClass14B.A02(getText()));
        }
    }

    public void setCursorPosition_internal(int i, int i2) {
        int A06 = C36381kD.A06(this);
        Selection.setSelection(getText(), Math.min(i, A06), Math.min(i2, A06));
    }

    public void setSpan_internal(Object obj, int i, int i2, int i3) {
        getText().setSpan(obj, i, Math.min(i2, C36381kD.A06(this)), i3);
    }

    public void setOnContextMenuListener(AnonymousClass4P7 r1) {
        this.A01 = r1;
    }

    public void setVisibleBounds(Rect rect) {
        this.A00 = rect;
    }

    public WaEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A07(context, attributeSet);
    }

    public WaEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A07(context, attributeSet);
    }
}
