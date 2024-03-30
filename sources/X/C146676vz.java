package X;

import com.whatsapp.mediacomposer.doodle.ColorPickerView;

/* renamed from: X.6vz  reason: invalid class name and case insensitive filesystem */
public class C146676vz implements C159547jX {
    public final /* synthetic */ C117425mF A00;
    public final /* synthetic */ C146806wC A01;
    public final /* synthetic */ C129126Fh A02;

    public C146676vz(C117425mF r1, C146806wC r2, C129126Fh r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0.A0O() == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BTy(int r8, float r9) {
        /*
            r7 = this;
            X.5mF r6 = r7.A00
            r6.A00 = r8
            X.6wC r5 = r7.A01
            X.6FV r0 = r5.A0T
            X.6Ft r0 = r0.A01
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.A0O()
            r4 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r4 = 0
        L_0x0014:
            X.6Fh r3 = r7.A02
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r5.A0K
            com.whatsapp.mediacomposer.doodle.ColorPickerView r2 = r0.A03
            float r1 = r2.A00
            boolean r0 = r2.A07
            r3.A06(r1, r8, r0, r4)
            X.C146806wC.A00(r6, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146676vz.BTy(int, float):void");
    }

    public void Bjs() {
        C117425mF r7 = this.A00;
        C146806wC r6 = this.A01;
        ColorPickerView colorPickerView = r6.A0K.A03;
        r7.A00 = colorPickerView.A01;
        C146806wC.A03(r6);
        this.A02.A06(colorPickerView.A00, r7.A00, colorPickerView.A07, false);
        C146806wC.A00(r7, colorPickerView, r6);
    }
}
