package X;

import android.widget.CompoundButton;

/* renamed from: X.3Zm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67353Zm implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ String A00;
    public final /* synthetic */ C10810fG A01;

    public /* synthetic */ C67353Zm(String str, C10810fG r2) {
        this.A01 = r2;
        this.A00 = str;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C10810fG r1 = this.A01;
        String str = this.A00;
        C36321k7.A0w(r1, str);
        if (z) {
            r1.element = str;
        }
    }
}
