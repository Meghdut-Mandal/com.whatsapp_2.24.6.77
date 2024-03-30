package X;

import android.widget.ImageButton;

/* renamed from: X.5LN  reason: invalid class name */
public final class AnonymousClass5LN extends C98104qs {
    public final /* synthetic */ AnonymousClass6VH A00;

    public void Bgx(AnonymousClass6E4 r8) {
        AnonymousClass00C.A0D(r8, 0);
        super.Bgx(r8);
        AnonymousClass6VH r0 = this.A00;
        ImageButton imageButton = r0.A00;
        imageButton.setAlpha((float) A00(r8, 0.0f, 1.0f));
        float A002 = (float) A00(r8, 1.0f, 0.0f);
        ImageButton imageButton2 = r0.A01;
        imageButton2.setScaleX(A002);
        imageButton2.setScaleY(A002);
        if (r8.A07.A00 >= ((double) this.A00)) {
            imageButton.setVisibility(4);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5LN(AnonymousClass6VH r3) {
        super(r3, 2.0f, 0.0f);
        this.A00 = r3;
    }
}
