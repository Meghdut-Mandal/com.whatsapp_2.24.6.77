package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3Xo  reason: invalid class name and case insensitive filesystem */
public final class C66853Xo implements TextWatcher {
    public int A00 = -1;
    public int A01 = -1;
    public String A02 = "";
    public boolean A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final WaEditText A07;
    public final WaEditText A08;
    public final WaEditText A09;
    public final AnonymousClass4RZ A0A;
    public final C63643Kv A0B;
    public final List A0C;

    public C66853Xo(WaEditText waEditText, WaEditText waEditText2, WaEditText waEditText3, AnonymousClass4RZ r5, C63643Kv r6, List list, int i, int i2, int i3) {
        AnonymousClass00C.A0D(waEditText2, 5);
        this.A0B = r6;
        this.A0A = r5;
        this.A0C = list;
        this.A09 = waEditText;
        this.A07 = waEditText2;
        this.A08 = waEditText3;
        this.A05 = i;
        this.A06 = i2;
        this.A04 = i3;
    }

    public void afterTextChanged(Editable editable) {
        int i;
        boolean isDigit;
        String str;
        boolean isDigit2;
        Editable text;
        AnonymousClass00C.A0D(editable, 0);
        int i2 = 0;
        if (AnonymousClass000.A1R(this.A02.length())) {
            WaEditText waEditText = this.A07;
            waEditText.removeTextChangedListener(this);
            waEditText.setText("");
            waEditText.addTextChangedListener(this);
        }
        if (editable.length() != 0 || this.A00 != 0) {
            int i3 = this.A00;
            WaEditText waEditText2 = this.A07;
            if (i3 == 1) {
                waEditText2.removeTextChangedListener(this);
                char charAt = editable.charAt(this.A01);
                int i4 = this.A04;
                if (i4 != 0) {
                    isDigit2 = Character.isLetterOrDigit(charAt);
                } else {
                    isDigit2 = Character.isDigit(charAt);
                }
                if (isDigit2) {
                    String valueOf = String.valueOf(editable.charAt(this.A01));
                    if (i4 == 1) {
                        valueOf = valueOf.toUpperCase(Locale.ROOT);
                        AnonymousClass00C.A08(valueOf);
                    }
                    waEditText2.setText(valueOf);
                    WaEditText waEditText3 = this.A08;
                    if (!(waEditText3 == null || (text = waEditText2.getText()) == null || text.length() == 0)) {
                        waEditText3.requestFocus();
                    }
                } else {
                    waEditText2.setText("");
                }
                waEditText2.addTextChangedListener(this);
            } else {
                waEditText2.removeTextChangedListener(this);
                int i5 = 0;
                while (true) {
                    i = this.A06;
                    if (i2 >= i || i5 >= editable.length()) {
                        waEditText2.addTextChangedListener(this);
                        int i6 = this.A00;
                    } else {
                        char charAt2 = editable.charAt(i5);
                        int i7 = this.A04;
                        if (i7 != 0) {
                            isDigit = Character.isLetterOrDigit(charAt2);
                        } else {
                            isDigit = Character.isDigit(charAt2);
                        }
                        if (!isDigit) {
                            i2--;
                        } else {
                            if (i5 < this.A00) {
                                str = String.valueOf(editable.charAt(i5));
                            } else {
                                str = "";
                            }
                            TextView textView = (TextView) this.A0C.get(i2);
                            if (i7 == 1) {
                                str = str.toUpperCase(Locale.ROOT);
                                AnonymousClass00C.A08(str);
                            }
                            textView.setText(str);
                        }
                        i2++;
                        i5++;
                    }
                }
                waEditText2.addTextChangedListener(this);
                int i62 = this.A00;
                if (i62 < i) {
                    ((View) this.A0C.get(i62)).requestFocus();
                }
                if (this.A05 != C36421kH.A06(this.A0C, 1)) {
                    return;
                }
            }
            String A002 = this.A0B.A00();
            if (A002.length() == this.A0C.size()) {
                waEditText2.A0B();
                AnonymousClass4RZ r1 = this.A0A;
                if (r1 == null) {
                    Log.e("CodeInputBoxManager/CodeInputBoxTextWatcher/afterTextChanged/invalid callback");
                    return;
                }
                Log.i("CodeInputBoxManager/CodeInputBoxTextWatcher/afterTextChanged trigger callback");
                r1.BTv(A002);
            }
        } else if (this.A07.hasFocus() && this.A03) {
            WaEditText waEditText4 = this.A09;
            if (waEditText4 != null) {
                waEditText4.setText("");
                waEditText4.requestFocus();
                return;
            }
            throw C36381kD.A0l();
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        AnonymousClass00C.A0D(charSequence, 0);
        Editable text = this.A07.getText();
        boolean z = true;
        if (text == null || text.length() == 0) {
            if (this.A09 == null) {
                z = false;
            }
            this.A03 = z;
            return;
        }
        this.A02 = charSequence.toString();
        this.A03 = false;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A00 = i3;
        this.A01 = i;
    }
}
