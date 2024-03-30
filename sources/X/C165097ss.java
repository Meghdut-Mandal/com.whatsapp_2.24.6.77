package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.widget.Button;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.backup.encryptedbackup.PasswordInputFragment;
import com.whatsapp.biz.cart.view.fragment.PromotionApplicationFragment;
import java.util.ArrayList;
import org.npci.upi.security.pinactivitycomponent.w;
import org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText;

/* renamed from: X.7ss  reason: invalid class name and case insensitive filesystem */
public class C165097ss implements NoCopySpan, TextWatcher {
    public Object A00;
    public final int A01;

    public C165097ss(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void afterTextChanged(Editable editable) {
        String substring;
        Button button;
        Resources resources;
        int i;
        switch (this.A01) {
            case 0:
                TextInputLayout textInputLayout = (TextInputLayout) this.A00;
                TextInputLayout.A0A(textInputLayout, !textInputLayout.A0S, false);
                if (textInputLayout.A0M) {
                    textInputLayout.A0H(editable);
                }
                if (textInputLayout.A0R) {
                    TextInputLayout.A08(editable, textInputLayout);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                PromotionApplicationFragment.A03((C102194zS) null, (PromotionApplicationFragment) this.A00);
                return;
            default:
                C93104fl r3 = (C93104fl) this.A00;
                r3.A02 = editable.length();
                if (r3.A0I) {
                    if (editable.length() != 0) {
                        button = r3.A04;
                        button.setEnabled(true);
                        resources = r3.getResources();
                        i = R.color.f6nameremoved;
                    }
                    substring = editable.toString();
                    r3.A0E = substring;
                    return;
                }
                boolean z = r3.A0J;
                int length = editable.length();
                if (z) {
                    boolean z2 = r3.A0N;
                    if (length == 0) {
                        if (z2) {
                            r3.A04.setCompoundDrawablesWithIntrinsicBounds(r3.getResources().getDrawable(R.drawable.ic_visibility_off_blue_24px), (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        button = r3.A04;
                        button.setEnabled(false);
                        resources = r3.getResources();
                        i = R.color.f6nameremoved;
                    } else {
                        if (z2) {
                            r3.A04.setCompoundDrawablesWithIntrinsicBounds(r3.getResources().getDrawable(R.drawable.ic_visibility_off), (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        Button button2 = r3.A04;
                        C36351kA.A15(r3.getResources(), button2, R.color.f6nameremoved);
                        button2.setEnabled(true);
                        substring = editable.toString();
                        r3.A0E = substring;
                        return;
                    }
                } else {
                    boolean z3 = r3.A0N;
                    if (length == 0) {
                        if (z3) {
                            r3.A04.setCompoundDrawablesWithIntrinsicBounds(r3.getResources().getDrawable(R.drawable.ic_visibility_blue_24px), (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        Button button3 = r3.A04;
                        button3.setEnabled(false);
                        C36351kA.A15(r3.getResources(), button3, R.color.f6nameremoved);
                        r3.A0E = "";
                        return;
                    }
                    if (z3) {
                        r3.A04.setCompoundDrawablesWithIntrinsicBounds(r3.getResources().getDrawable(R.drawable.ic_visibility_on), (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                    Button button4 = r3.A04;
                    C36351kA.A15(r3.getResources(), button4, R.color.f6nameremoved);
                    button4.setEnabled(true);
                    if (r3.A0E.length() > editable.length()) {
                        String str = r3.A0E;
                        substring = str.substring(0, str.length() - 1);
                        r3.A0E = substring;
                        return;
                    }
                    char charAt = editable.toString().charAt(editable.length() - 1);
                    if (charAt != 9679) {
                        String concat = r3.A0E.concat(AnonymousClass000.A0t(AnonymousClass000.A0v(""), charAt));
                        r3.A0E = concat;
                        r3.A0G.setText(concat.replaceAll(".", "●"));
                        return;
                    }
                    r3.A0G.setSelection(editable.length());
                    return;
                }
                C36351kA.A15(resources, button, i);
                substring = editable.toString();
                r3.A0E = substring;
                return;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        switch (this.A01) {
            case 1:
                ((PasswordInputFragment) this.A00).A1a();
                return;
            case 3:
                if (charSequence.length() > 0) {
                    C93104fl r2 = (C93104fl) this.A00;
                    if (!r2.A0F.equals("CARDDETAILS")) {
                        r2.A04.setVisibility(0);
                    }
                }
                C93104fl r22 = (C93104fl) this.A00;
                if (r22.A0H != null) {
                    FormItemEditText formItemEditText = r22.A0G;
                    if (formItemEditText.getText() != null && C36381kD.A06(formItemEditText) >= r22.A00) {
                        AnonymousClass7dR r4 = r22.A0H;
                        int i5 = r22.A01;
                        formItemEditText.getText().toString();
                        w wVar = (w) r4;
                        int i6 = wVar.A00;
                        if ((i6 != -1 && i6 == i5) || wVar.A06) {
                            ArrayList arrayList = wVar.A04;
                            if (wVar.A06) {
                                i6--;
                            }
                            if (AnonymousClass000.A0Z(arrayList, i6).isShown()) {
                                boolean z = wVar.A06;
                                i4 = wVar.A00;
                                if (z) {
                                    i4--;
                                }
                            } else {
                                i4 = wVar.A00;
                            }
                            C93104fl A0o = C90494aF.A0o(arrayList, i4);
                            CountDownTimer countDownTimer = wVar.A03;
                            if (countDownTimer != null) {
                                try {
                                    countDownTimer.cancel();
                                } catch (Exception unused) {
                                }
                            }
                            A0o.A01();
                            A0o.A02("", false);
                            Drawable A002 = AnonymousClass00E.A00(wVar.A0h(), R.drawable.ic_tick_ok);
                            if (A002 != null) {
                                A0o.A05.setImageDrawable(A002);
                            }
                            A0o.A00(A0o.A05, true);
                            wVar.A0B = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
