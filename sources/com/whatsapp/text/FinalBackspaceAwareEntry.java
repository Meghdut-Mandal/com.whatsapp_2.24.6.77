package com.whatsapp.text;

import X.AnonymousClass000;
import X.AnonymousClass22Q;
import X.AnonymousClass4WJ;
import X.C117805mr;
import X.C36381kD;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.search.SearchViewModel;
import java.util.List;

public class FinalBackspaceAwareEntry extends AnonymousClass22Q {
    public static final char A04 = "​".charAt(0);
    public List A00;
    public boolean A01;
    public boolean A02;
    public TextView.BufferType A03;

    public static Editable A03(Editable editable) {
        Editable editable2 = editable;
        if (!A06(editable)) {
            return editable2;
        }
        Editable newEditable = Editable.Factory.getInstance().newEditable(editable);
        newEditable.replace(0, A06(newEditable) ? 1 : 0, "", 0, 0);
        return newEditable;
    }

    public static void A05(Editable editable, FinalBackspaceAwareEntry finalBackspaceAwareEntry) {
        Editable editable2;
        finalBackspaceAwareEntry.A01 = true;
        if (editable != null) {
            editable2 = Editable.Factory.getInstance().newEditable(editable);
            editable2.replace(0, 0, "​", 0, 1);
        } else {
            editable2 = null;
        }
        finalBackspaceAwareEntry.setText(editable2, finalBackspaceAwareEntry.A03);
        finalBackspaceAwareEntry.A01 = false;
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        SearchViewModel searchViewModel;
        List<C117805mr> list = this.A00;
        if (list != null) {
            for (C117805mr r2 : list) {
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (searchViewModel = r2.A00.A0G) != null) {
                    searchViewModel.A0r(false);
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public FinalBackspaceAwareEntry(Context context) {
        super(context);
        A0A();
        this.A01 = false;
        this.A03 = TextView.BufferType.EDITABLE;
        A04();
    }

    private int A02(int i) {
        int A06;
        if (TextUtils.isEmpty(getText())) {
            A06 = 0;
        } else {
            A06 = C36381kD.A06(this);
        }
        return Math.max(0, Math.min(i, A06));
    }

    private void A04() {
        if (!A06(getText())) {
            A05(getText(), this);
        }
        addTextChangedListener(new AnonymousClass4WJ(this, 19));
    }

    public static boolean A06(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence) || charSequence.charAt(0) != A04) {
            return false;
        }
        return true;
    }

    private void setTextWithBsPrefix(String str) {
        setText(AnonymousClass000.A0p("​", str, AnonymousClass000.A0u()));
    }

    public /* synthetic */ void A0F(String str) {
        Editable A032 = A03(getText());
        if (str != null && A032 != null && !str.equals(A032.toString())) {
            setTextWithBsPrefix(str);
            setSelection(str.length());
        }
    }

    public int getSelectionEnd() {
        Editable text = getText();
        if (TextUtils.isEmpty(A03(text))) {
            return A06(text) ? 1 : 0;
        }
        return super.getSelectionEnd();
    }

    public int getSelectionStart() {
        return Math.max(super.getSelectionStart(), A06(getText()) ? 1 : 0);
    }

    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        int A06 = A06(getText());
        if (min < A06) {
            setSelection(A02(Math.max(min, A06)), A02(max));
        }
    }

    public void setSelection(int i) {
        super.setSelection(A02(i + (A06(getText()) ? 1 : 0)));
    }

    public FinalBackspaceAwareEntry(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0A();
        this.A01 = false;
        this.A03 = TextView.BufferType.EDITABLE;
        A04();
    }

    public FinalBackspaceAwareEntry(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A0A();
    }

    public FinalBackspaceAwareEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0A();
        this.A01 = false;
        this.A03 = TextView.BufferType.EDITABLE;
        A04();
    }
}
