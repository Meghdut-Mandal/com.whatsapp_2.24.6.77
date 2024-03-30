package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.6pb  reason: invalid class name and case insensitive filesystem */
public class C142866pb implements C160397kw {
    public final Drawable A00;
    public final Drawable A01;

    public /* bridge */ /* synthetic */ void BRN(C160797lb r3) {
        C142886pd r32 = (C142886pd) r3;
        ImageView BCZ = r32.BCZ();
        if (BCZ != null && A00(r32)) {
            Drawable drawable = r32.A01;
            if (drawable == null) {
                drawable = this.A01;
            }
            BCZ.setImageDrawable(drawable);
        }
    }

    public /* bridge */ /* synthetic */ void BZu(C160797lb r3) {
        C142886pd r32 = (C142886pd) r3;
        ImageView BCZ = r32.BCZ();
        if (BCZ != null && A00(r32)) {
            Drawable drawable = r32.A00;
            if (drawable == null) {
                drawable = this.A00;
            }
            BCZ.setImageDrawable(drawable);
        }
        C160197kc r0 = r32.A02;
        if (r0 != null) {
            r0.BZt();
        }
    }

    public /* bridge */ /* synthetic */ void Ba1(C160797lb r4) {
        C142886pd r42 = (C142886pd) r4;
        ImageView BCZ = r42.BCZ();
        if (BCZ != null) {
            BCZ.setTag(R.id.loaded_image_id, r42.A03);
        }
        C160197kc r0 = r42.A02;
        if (r0 != null) {
            r0.Bj4();
        }
    }

    public /* bridge */ /* synthetic */ void Ba5(Bitmap bitmap, C160797lb r7, boolean z) {
        Drawable drawable;
        C142886pd r72 = (C142886pd) r7;
        ImageView BCZ = r72.BCZ();
        if (BCZ != null && A00(r72)) {
            if ((BCZ.getDrawable() == null || (BCZ.getDrawable() instanceof ColorDrawable)) && !z) {
                Drawable[] drawableArr = new Drawable[2];
                if (BCZ.getDrawable() == null) {
                    drawable = new ColorDrawable(0);
                } else {
                    drawable = BCZ.getDrawable();
                }
                drawableArr[0] = drawable;
                drawableArr[1] = new BitmapDrawable(BCZ.getResources(), bitmap);
                TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
                transitionDrawable.setCrossFadeEnabled(true);
                transitionDrawable.startTransition(200);
                BCZ.setImageDrawable(transitionDrawable);
            } else {
                BCZ.setImageBitmap(bitmap);
            }
            C160197kc r0 = r72.A02;
            if (r0 != null) {
                r0.Bj5(bitmap);
            }
        }
    }

    public C142866pb(Drawable drawable, Drawable drawable2) {
        this.A00 = drawable2;
        this.A01 = drawable;
    }

    public static boolean A00(C142886pd r3) {
        ImageView BCZ = r3.BCZ();
        if (BCZ == null || BCZ.getTag(R.id.loaded_image_id) == null || !BCZ.getTag(R.id.loaded_image_id).equals(r3.A03)) {
            return false;
        }
        return true;
    }
}
