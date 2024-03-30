package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: X.5vk  reason: invalid class name and case insensitive filesystem */
public class C122985vk {
    public final Paint A00;
    public final Path A01 = C36441kJ.A0M();
    public final C118475nx A02 = new C118475nx();
    public final C118475nx A03 = new C118475nx();
    public final C118475nx A04 = new C118475nx();

    public C122985vk() {
        Paint A0K = C36441kJ.A0K();
        this.A00 = A0K;
        C90474aD.A0w(A0K);
        A0K.setColor(-14298266);
        A0K.setMaskFilter(new BlurMaskFilter(175.0f, BlurMaskFilter.Blur.NORMAL));
    }
}
