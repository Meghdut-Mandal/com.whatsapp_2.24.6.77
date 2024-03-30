package X;

import com.whatsapp.R;

/* renamed from: X.3NZ  reason: invalid class name */
public class AnonymousClass3NZ {
    public final int A00;
    public final int A01;
    public final int A02;

    public static AnonymousClass3NZ A00(AnonymousClass3T1 r3, boolean z) {
        int i;
        int i2;
        int i3;
        if (C66013Ui.A0K(r3.A1I)) {
            i2 = R.string.f12nameremoved;
            if (z) {
                i2 = R.string.f12nameremoved;
            }
            i = R.drawable.msg_status_ephemeral_ring;
            i3 = R.color.f6nameremoved;
        } else {
            boolean z2 = r3 instanceof AnonymousClass2cY;
            int i4 = R.string.f12nameremoved;
            if (z2) {
                if (z) {
                    i4 = R.string.f12nameremoved;
                }
                i = R.drawable.msg_status_video;
            } else {
                if (z) {
                    i4 = R.string.f12nameremoved;
                }
                i = R.drawable.msg_status_mic;
            }
            i3 = R.color.f6nameremoved;
        }
        return new AnonymousClass3NZ(i2, i, i3);
    }

    public AnonymousClass3NZ(int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }
}
