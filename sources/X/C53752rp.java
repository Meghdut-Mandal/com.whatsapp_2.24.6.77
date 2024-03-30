package X;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.whatsapp.R;
import com.whatsapp.mediaview.PhotoView;
import java.util.HashSet;

/* renamed from: X.2rp  reason: invalid class name and case insensitive filesystem */
public class C53752rp implements C160527l9 {
    public int A00;
    public Object A01;
    public final int A02;

    public C53752rp(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public int BHb() {
        int i = this.A02;
        int i2 = this.A00;
        if (i == 0) {
            return (int) (((float) i2) * C36341k9.A00(((AnonymousClass3HB) this.A01).A03));
        }
        return i2;
    }

    public void Bte(Bitmap bitmap, View view, AnonymousClass3T1 r9) {
        Drawable drawable;
        switch (this.A02) {
            case 0:
                int A04 = C36361kB.A04(view, r9, 0);
                AnonymousClass2FY r3 = (AnonymousClass2FY) view;
                if (bitmap == null) {
                    r3.A02 = 0;
                    int i = r9.A1I;
                    if (i != 1) {
                        if (i != A04) {
                            if (i != 3) {
                                if (i != 9) {
                                    if (i != 13) {
                                        if (!(i == 23 || i == 25)) {
                                            if (i != 26) {
                                                if (!(i == 28 || i == 29)) {
                                                    r3.setImageResource(0);
                                                }
                                            }
                                        }
                                    }
                                }
                                drawable = AnonymousClass3MS.A00(view.getContext(), (C46972by) r9);
                            }
                            r3.setImageResource(R.drawable.media_video);
                        } else {
                            Drawable[] drawableArr = new Drawable[A04];
                            drawableArr[0] = new ColorDrawable(AnonymousClass00F.A00(view.getContext(), R.color.f6nameremoved));
                            drawableArr[1] = new InsetDrawable(AnonymousClass00E.A00(view.getContext(), R.drawable.gallery_audio_item), view.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
                            drawable = new LayerDrawable(drawableArr);
                        }
                        r3.setImageDrawable(drawable);
                    }
                    C36441kJ.A1D(r3);
                    C36391kE.A1C(((AnonymousClass3HB) this.A01).A03.getResources(), r3, R.color.f6nameremoved);
                    drawable = AnonymousClass3UF.A01(view.getContext(), R.drawable.camera, R.color.f6nameremoved);
                    r3.setImageDrawable(drawable);
                } else {
                    r3.setImageBitmap(bitmap);
                }
                HashSet hashSet = ((AnonymousClass3HB) this.A01).A0C;
                C64933Qa r1 = r9.A1J;
                if (!hashSet.contains(r1)) {
                    hashSet.add(r1);
                    AlphaAnimation A0D = C36351kA.A0D();
                    A0D.setDuration(300);
                    view.startAnimation(A0D);
                    return;
                }
                return;
            case 1:
                C47512et r12 = (C47512et) this.A01;
                r12.A05.A08(bitmap);
                r12.A02 = true;
                return;
            default:
                ((C47522eu) this.A01).A0G.A08(bitmap);
                return;
        }
    }

    public /* synthetic */ void Btu(View view) {
        switch (this.A02) {
            case 0:
                return;
            case 1:
                C47512et r2 = (C47512et) this.A01;
                PhotoView photoView = r2.A05;
                photoView.A0I = null;
                photoView.A04 = 0.0f;
                r2.A02 = false;
                return;
            default:
                PhotoView photoView2 = ((C47522eu) this.A01).A0G;
                photoView2.A0I = null;
                photoView2.A04 = 0.0f;
                return;
        }
    }

    public /* synthetic */ void BXv() {
    }
}
