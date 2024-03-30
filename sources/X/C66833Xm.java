package X;

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;

/* renamed from: X.3Xm  reason: invalid class name and case insensitive filesystem */
public abstract class C66833Xm implements TextWatcher {
    public C203679oW A00;
    public boolean A01;
    public int A02;
    public boolean A03 = false;

    public synchronized void afterTextChanged(Editable editable) {
        int i;
        boolean z = true;
        Editable editable2 = editable;
        if (this.A01) {
            if (editable2.length() == 0) {
                z = false;
            }
            this.A01 = z;
        } else if (!this.A03) {
            int selectionEnd = Selection.getSelectionEnd(editable2) - 1;
            C203679oW r4 = this.A00;
            r4.A0B();
            int length = editable2.length();
            String str = null;
            char c = 0;
            boolean z2 = false;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = editable2.charAt(i2);
                if (PhoneNumberUtils.isNonSeparator(charAt)) {
                    if (c != 0) {
                        boolean z3 = false;
                        if (z2) {
                            z3 = true;
                        }
                        str = C203679oW.A05(r4, c, z3);
                        r4.A04 = str;
                        z2 = false;
                    }
                    c = charAt;
                }
                if (i2 == selectionEnd) {
                    z2 = true;
                }
            }
            if (c != 0) {
                boolean z4 = false;
                if (z2) {
                    z4 = true;
                }
                str = C203679oW.A05(r4, c, z4);
                r4.A04 = str;
            }
            if (str != null) {
                if (!r4.A0C) {
                    i = r4.A00;
                } else {
                    int i3 = 0;
                    i = 0;
                    while (i3 < r4.A01 && i < r4.A04.length()) {
                        if (r4.A07.charAt(i3) == r4.A04.charAt(i)) {
                            i3++;
                        }
                        i++;
                    }
                }
                this.A03 = true;
                editable2.replace(0, editable2.length(), str, 0, str.length());
                if (str.equals(editable2.toString())) {
                    Selection.setSelection(editable2, i);
                }
                this.A03 = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r5 <= 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void beforeTextChanged(java.lang.CharSequence r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x0013
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0013
            if (r5 != 0) goto L_0x0014
            int r0 = r3.length()
            if (r0 != r4) goto L_0x0014
            r0 = 1
        L_0x0011:
            r2.A02 = r0
        L_0x0013:
            return
        L_0x0014:
            if (r6 != 0) goto L_0x0023
            int r1 = r4 + r5
            int r0 = r3.length()
            if (r1 != r0) goto L_0x0023
            r0 = 0
            if (r5 > 0) goto L_0x0011
        L_0x0021:
            r0 = 3
            goto L_0x0011
        L_0x0023:
            if (r5 <= 0) goto L_0x0021
            r1 = r4
        L_0x0026:
            int r0 = r4 + r5
            if (r1 >= r0) goto L_0x0037
            char r0 = r3.charAt(r1)
            boolean r0 = android.telephony.PhoneNumberUtils.isNonSeparator(r0)
            if (r0 == 0) goto L_0x0021
            int r1 = r1 + 1
            goto L_0x0026
        L_0x0037:
            r0 = 2
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66833Xm.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A03 && !this.A01) {
            if (this.A02 == 3 && i3 > 0) {
                int i4 = i;
                while (true) {
                    if (i4 < i + i3) {
                        if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                            break;
                        }
                        i4++;
                    } else {
                        this.A02 = 2;
                        break;
                    }
                }
            }
            if (this.A02 == 1 && i3 > 0) {
                int i5 = i;
                while (true) {
                    if (i5 < i + i3) {
                        if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i5))) {
                            break;
                        }
                        i5++;
                    } else {
                        break;
                    }
                }
            }
            if (this.A02 != 3) {
                return;
            }
            this.A01 = true;
            this.A00.A0B();
        }
    }

    public C66833Xm(String str) {
        boolean z = false;
        C18740tg.A0B(str != null ? true : z);
        C203559oI.A00();
        this.A00 = new C203679oW(str);
    }
}
