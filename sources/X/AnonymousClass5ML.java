package X;

import android.graphics.Bitmap;

/* renamed from: X.5ML  reason: invalid class name */
public class AnonymousClass5ML extends C132446Tt {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ AnonymousClass6WR A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ Runnable A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5ML(Bitmap bitmap, AnonymousClass012 r3, AnonymousClass6WR r4, Runnable runnable, Runnable runnable2, int i) {
        super(r3, true);
        this.A02 = r4;
        this.A01 = bitmap;
        this.A00 = i;
        this.A04 = runnable;
        this.A03 = runnable2;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            AnonymousClass6WR r3 = this.A02;
            r3.A03 = bitmap;
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
            r3.A01 = this.A00;
            r3.A0T.A00();
            r3.A0Q.A0D(r3.A0X, r3.A03);
            return;
        }
        Bitmap bitmap2 = this.A01;
        if (bitmap2 != null) {
            AnonymousClass6WR r32 = this.A02;
            r32.A03 = bitmap2;
            r32.A0T.A00();
            r32.A0Q.A0D(r32.A0X, r32.A03);
        }
        this.A03.run();
    }
}
