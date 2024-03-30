package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.4me  reason: invalid class name and case insensitive filesystem */
public class C96014me extends AnonymousClass0CZ {
    public boolean A00 = false;
    public Bitmap[] A01;
    public boolean[] A02;
    public boolean[] A03;
    public final float A04;
    public final float A05;
    public final Context A06;
    public final Drawable A07;
    public final C1032954s A08;
    public final AnonymousClass6WR A09;

    public void A0L(int i) {
        this.A00 = true;
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.A02;
            if (i2 < zArr.length) {
                if (!zArr[i2]) {
                    A07(i2);
                }
                i2++;
            } else {
                this.A08.A0I(new C145186tU(this), i);
                return;
            }
        }
    }

    public int A0J() {
        return C129876Iu.A00.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r25, int i) {
        float f;
        AnonymousClass5MX r14;
        C97054oK r8 = (C97054oK) r25;
        AnonymousClass6WR r7 = this.A09;
        int i2 = i;
        boolean booleanValue = Boolean.valueOf(AnonymousClass000.A1S(i2, r7.A01)).booleanValue();
        float f2 = 1.0f;
        if (booleanValue) {
            f = this.A05;
            f2 = this.A04;
        } else {
            f = 1.0f;
        }
        r8.A04.A04(booleanValue, false);
        View view = r8.A00;
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setPivotX(((float) r7.A0I) / 2.0f);
        view.setPivotY((float) r7.A0H);
        TextView textView = r8.A03;
        textView.setText(C129876Iu.A00(i2).A01);
        ImageView imageView = r8.A02;
        imageView.setBackground(this.A07);
        imageView.setImageDrawable((Drawable) null);
        View view2 = r8.A01;
        view2.setOnClickListener(r8);
        if (r7.A02 != null) {
            if (i == 0) {
                r14 = new AnonymousClass5MX(this.A06, this.A08, r7, r8, this, this.A01, this.A03, this.A02, 0);
            } else {
                boolean[] zArr = this.A02;
                if (zArr[i - 1]) {
                    Context context = this.A06;
                    Bitmap[] bitmapArr = this.A01;
                    boolean[] zArr2 = this.A03;
                    r14 = new AnonymousClass5MX(context, this.A08, r7, r8, this, bitmapArr, zArr2, zArr, i2);
                } else if (this.A00) {
                    textView.setText(R.string.f12nameremoved);
                    C36341k9.A0q(this.A06, imageView, R.color.f6nameremoved);
                    view2.setOnClickListener((View.OnClickListener) null);
                    imageView.setClickable(false);
                    return;
                } else {
                    textView.setText(R.string.f12nameremoved);
                    imageView.setClickable(true);
                    C135466ck.A00(view2, this, 39);
                    return;
                }
            }
            r14.A02.executeOnExecutor(r7.A0V, new Void[0]);
        }
    }

    public C96014me(Context context, C1032954s r5, AnonymousClass6WR r6) {
        this.A06 = context;
        this.A08 = r5;
        this.A09 = r6;
        this.A04 = context.getResources().getDimension(R.dimen.f7nameremoved) / ((float) r6.A0H);
        this.A05 = context.getResources().getDimension(R.dimen.f7nameremoved) / ((float) r6.A0I);
        this.A07 = new ColorDrawable(AnonymousClass00F.A00(context, R.color.f6nameremoved));
        int A072 = C36431kI.A07(C129876Iu.A00);
        this.A01 = new Bitmap[A072];
        this.A03 = new boolean[A072];
        this.A02 = new boolean[A072];
        A0L(0);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C97054oK(C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved), this);
    }
}
