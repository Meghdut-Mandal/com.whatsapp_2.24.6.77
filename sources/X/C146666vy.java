package X;

import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.whatsapp.mediacomposer.doodle.ColorPickerView;

/* renamed from: X.6vy  reason: invalid class name and case insensitive filesystem */
public final class C146666vy implements C159547jX {
    public final /* synthetic */ C90694aZ A00;

    public C146666vy(C90694aZ r1) {
        this.A00 = r1;
    }

    public void BTy(int i, float f) {
        C90694aZ r2 = this.A00;
        r2.A0F.A00 = i;
        AnonymousClass6OU r1 = r2.A07;
        if (r1 == null) {
            throw C36331k8.A0d("penDialogController");
        }
        r1.A01((int) f, i);
        C91184bb r12 = r2.A08;
        if (r12 == null) {
            throw C36331k8.A0d("penButtonBackground");
        }
        r12.A01(i, f);
        C91184bb r13 = r2.A08;
        if (r13 == null) {
            throw C36331k8.A0d("penButtonBackground");
        }
        ColorPickerComponent colorPickerComponent = r2.A06;
        if (colorPickerComponent == null) {
            throw C36331k8.A0d("colorPicker");
        }
        r13.A04 = colorPickerComponent.A03.A07;
    }

    public void Bjs() {
        C90694aZ r5 = this.A00;
        C117425mF r1 = r5.A0F;
        ColorPickerComponent colorPickerComponent = r5.A06;
        if (colorPickerComponent == null) {
            throw C36331k8.A0d("colorPicker");
        }
        ColorPickerView colorPickerView = colorPickerComponent.A03;
        int i = colorPickerView.A01;
        r1.A00 = i;
        AnonymousClass6OU r12 = r5.A07;
        if (r12 == null) {
            throw C36331k8.A0d("penDialogController");
        }
        r12.A01((int) colorPickerView.A00, i);
        C91184bb r3 = r5.A08;
        if (r3 == null) {
            throw C36331k8.A0d("penButtonBackground");
        }
        ColorPickerComponent colorPickerComponent2 = r5.A06;
        if (colorPickerComponent2 == null) {
            throw C36331k8.A0d("colorPicker");
        }
        ColorPickerView colorPickerView2 = colorPickerComponent2.A03;
        r3.A01(colorPickerView2.A01, colorPickerView2.A00);
        C91184bb r13 = r5.A08;
        if (r13 == null) {
            throw C36331k8.A0d("penButtonBackground");
        }
        ColorPickerComponent colorPickerComponent3 = r5.A06;
        if (colorPickerComponent3 == null) {
            throw C36331k8.A0d("colorPicker");
        }
        r13.A04 = colorPickerComponent3.A03.A07;
    }
}
