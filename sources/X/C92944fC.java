package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;
import org.npci.upi.security.pinactivitycomponent.s;

/* renamed from: X.4fC  reason: invalid class name and case insensitive filesystem */
public class C92944fC extends FrameLayout implements C88984Uu {
    public int A00;
    public int A01;
    public Object A02;
    public ArrayList A03;

    public C92944fC(Context context) {
        super(context);
    }

    public void Azo(Drawable drawable, View.OnClickListener onClickListener, String str, int i, boolean z, boolean z2) {
        String str2;
        Drawable drawable2;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A03;
            if (i2 < arrayList.size()) {
                boolean equals = C90494aF.A0o(arrayList, i2).A0F.equals("CARDDETAILS");
                C93104fl r7 = (C93104fl) arrayList.get(i2);
                if (equals) {
                    r7.A0I = true;
                    if (i2 == 0) {
                        r7 = C90494aF.A0o(arrayList, i2);
                        str2 = getContext().getString(R.string.f12nameremoved);
                    } else if (i2 == 1) {
                        drawable2 = AnonymousClass00E.A00(getContext(), R.drawable.ic_edit_icon);
                        C90494aF.A0o(this.A03, i2).setTitle(C36391kE.A0v(getContext(), C90494aF.A0o(this.A03, 0).getInputValue(), new Object[1], 0, R.string.f12nameremoved));
                        r7 = C90494aF.A0o(this.A03, i2);
                        str2 = getContext().getString(R.string.f12nameremoved);
                        r7.Azo(drawable2, onClickListener, str2, 0, z, z2);
                        i2++;
                    } else {
                        i2++;
                    }
                } else {
                    str2 = str;
                }
                drawable2 = drawable;
                r7.Azo(drawable2, onClickListener, str2, 0, z, z2);
                i2++;
            } else {
                return;
            }
        }
    }

    public int B6H() {
        return getInputValue().length();
    }

    public void setFormDataTag(Object obj) {
        this.A02 = obj;
    }

    public void setText(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A03;
            if (i < arrayList.size()) {
                C90494aF.A0o(arrayList, i).setText(str);
                i++;
            } else {
                return;
            }
        }
    }

    public void A00(ArrayList arrayList, AnonymousClass7dR r5) {
        this.A03 = arrayList;
        addView(AnonymousClass000.A0Z(arrayList, 0));
        C90494aF.A0o(this.A03, 0).A0H = r5;
        this.A00 = 0;
        this.A01 = C36361kB.A0B(this).widthPixels;
        int i = 1;
        while (true) {
            ArrayList arrayList2 = this.A03;
            if (i < arrayList2.size()) {
                C93104fl A0o = C90494aF.A0o(arrayList2, i);
                A0o.A0H = r5;
                A0o.setX((float) this.A01);
                addView(A0o);
                i++;
            } else {
                return;
            }
        }
    }

    public void Azm(String str) {
        ((s) ((C93104fl) C36441kJ.A12(this.A03)).A0H).A1Z(str);
    }

    public boolean Azn() {
        AnonymousClass7dR r4;
        Context context;
        int i;
        String inputValue = C90494aF.A0o(this.A03, this.A00).getInputValue();
        ArrayList arrayList = this.A03;
        int i2 = this.A00;
        if (C90494aF.A0o(arrayList, i2).A00 == inputValue.length()) {
            if (i2 == arrayList.size() - 1) {
                AnonymousClass000.A0Z(arrayList, i2).requestFocus();
                int i3 = 0;
                while (true) {
                    ArrayList arrayList2 = this.A03;
                    if (i3 >= arrayList2.size()) {
                        break;
                    } else if (C90494aF.A0o(arrayList2, 0).A0F.equals("CARDDETAILS")) {
                        C90494aF.A0o(arrayList2, this.A00).A0L = true;
                        break;
                    } else if (!C90494aF.A0o(arrayList2, i3).getInputValue().equals(inputValue)) {
                        int i4 = 0;
                        while (true) {
                            ArrayList arrayList3 = this.A03;
                            if (i4 >= arrayList3.size()) {
                                break;
                            }
                            C90494aF.A0o(arrayList3, i4).setText("");
                            i4++;
                        }
                        int i5 = this.A00;
                        if (i5 != 0) {
                            TextView A0P = C36391kE.A0P(AnonymousClass000.A0Z(this.A03, i5 - 1), R.id.form_item_button);
                            A0P.setEnabled(false);
                            A0P.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(R.drawable.ic_visibility_blue_24px), (Drawable) null, (Drawable) null, (Drawable) null);
                            A0P.setText(R.string.f12nameremoved);
                            ArrayList arrayList4 = this.A03;
                            int i6 = this.A00;
                            C90494aF.A0o(arrayList4, i6).A0J = false;
                            AnonymousClass000.A0Z(arrayList4, i6).animate().x((float) this.A01);
                            AnonymousClass000.A0Z(this.A03, this.A00 - 1).animate().x(0.0f);
                            int i7 = this.A00 - 1;
                            this.A00 = i7;
                            AnonymousClass000.A0Z(this.A03, i7).requestFocus();
                        }
                        r4 = C90494aF.A0o(this.A03, i3).A0H;
                        context = getContext();
                        i = R.string.f12nameremoved;
                    } else {
                        i3++;
                    }
                }
            } else if (!C90494aF.A0o(arrayList, i2).A0K) {
                C90494aF.A0o(arrayList, i2).A0L = true;
                int i8 = this.A00;
                ArrayList arrayList5 = this.A03;
                boolean z = false;
                if (i8 < arrayList5.size() - 1) {
                    TextView A0P2 = C36391kE.A0P(AnonymousClass000.A0Z(arrayList5, i8 + 1), R.id.form_item_button);
                    A0P2.setEnabled(false);
                    A0P2.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(R.drawable.ic_visibility_blue_24px), (Drawable) null, (Drawable) null, (Drawable) null);
                    A0P2.setText(R.string.f12nameremoved);
                    ArrayList arrayList6 = this.A03;
                    int i9 = this.A00;
                    C90494aF.A0o(arrayList6, i9).A0J = false;
                    AnonymousClass000.A0Z(arrayList6, i9).animate().x((float) (-this.A01));
                    AnonymousClass000.A0Z(this.A03, this.A00 + 1).animate().x(0.0f);
                    int i10 = this.A00 + 1;
                    this.A00 = i10;
                    AnonymousClass000.A0Z(this.A03, i10).requestFocus();
                    z = true;
                }
                return !z;
            }
            return true;
        }
        boolean equals = C90494aF.A0o(arrayList, 0).A0F.equals("CARDDETAILS");
        r4 = C90494aF.A0o(arrayList, 0).A0H;
        context = getContext();
        if (equals) {
            i = R.string.f12nameremoved;
            if (i2 == 0) {
                i = R.string.f12nameremoved;
            }
        } else {
            ((s) r4).A1Z(context.getString(R.string.f12nameremoved));
            AnonymousClass000.A0Z(this.A03, this.A00).requestFocus();
            return false;
        }
        ((s) r4).A1Z(context.getString(i));
        return false;
    }

    public void B1f() {
        int i = this.A00;
        if (i != 0) {
            AnonymousClass000.A0Z(this.A03, i).animate().x((float) this.A01);
            AnonymousClass000.A0Z(this.A03, this.A00 - 1).animate().x(0.0f);
            int i2 = this.A00 - 1;
            this.A00 = i2;
            AnonymousClass000.A0Z(this.A03, i2).requestFocus();
        }
    }

    public boolean B28() {
        return C90494aF.A0o(this.A03, this.A00).B28();
    }

    public boolean B54() {
        return C90494aF.A0o(this.A03, this.A00).B54();
    }

    public Object getFormDataTag() {
        Object obj = this.A02;
        if (obj == null) {
            return ((C93104fl) C36441kJ.A12(this.A03)).A0C;
        }
        return obj;
    }

    public String getInputValue() {
        StringBuilder A0v;
        String inputValue;
        ArrayList arrayList = this.A03;
        if (!C90494aF.A0o(arrayList, 0).A0F.equals("CARDDETAILS")) {
            return C90494aF.A0o(arrayList, 0).getInputValue();
        }
        String str = "";
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.A03;
            if (i >= arrayList2.size()) {
                return str;
            }
            if (i != 1 || !C90494aF.A0o(arrayList2, 0).A0K) {
                A0v = AnonymousClass000.A0v(str);
                inputValue = C90494aF.A0o(arrayList2, i).getInputValue();
            } else {
                A0v = AnonymousClass000.A0v(str);
                inputValue = "0149";
            }
            str = AnonymousClass000.A0q(inputValue, A0v);
            i++;
        }
    }

    public boolean getTextEntered() {
        return C90494aF.A0o(this.A03, this.A00).A0L;
    }

    public boolean getToggleCheckBox() {
        return C90494aF.A0o(this.A03, this.A00).A0K;
    }

    public void setTextEntered(boolean z) {
        C90494aF.A0o(this.A03, this.A00).A0L = z;
    }

    public void setToggleCheckBox(boolean z) {
        C90494aF.A0o(this.A03, this.A00).A0K = z;
    }
}
