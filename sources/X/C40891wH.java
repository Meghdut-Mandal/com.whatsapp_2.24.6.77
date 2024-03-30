package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.1wH  reason: invalid class name and case insensitive filesystem */
public class C40891wH extends AnonymousClass0CZ {
    public final Handler A00;
    public final AnonymousClass16L A01;
    public final C21060yb A02;
    public final C19630wG A03;
    public final AnonymousClass6N7 A04;
    public final AnonymousClass35W A05;
    public final C591732x A06;
    public final C19770wU A07;
    public final List A08;
    public final Map A09;

    public int A0J() {
        return this.A08.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r10, int i) {
        C132446Tt r2;
        String str;
        int i2;
        GradientDrawable gradientDrawable;
        ImageView.ScaleType scaleType;
        C42621z7 r102 = (C42621z7) r10;
        C48902iF.A00(r102.A0H, this, r102, 26);
        Integer num = (Integer) this.A08.get(i);
        if (r102 instanceof C47242eA) {
            C47242eA r5 = (C47242eA) r102;
            Context A0F = C36441kJ.A0F(r5);
            int intValue = num.intValue();
            Drawable drawable = null;
            if (intValue == 0) {
                str = A0F.getString(R.string.f12nameremoved);
                i2 = R.drawable.ic_wallpaper_thumb_bright;
                gradientDrawable = C36381kD.A0H(A0F, i2);
            } else if (intValue == 1) {
                str = A0F.getString(R.string.f12nameremoved);
                i2 = R.drawable.ic_wallpaper_thumb_dark;
                gradientDrawable = C36381kD.A0H(A0F, i2);
            } else if (intValue == 2) {
                str = A0F.getString(R.string.f12nameremoved);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setSize(1, 1);
                gradientDrawable2.setColor(AnonymousClass00F.A00(A0F, R.color.f6nameremoved));
                Drawable[] drawableArr = new Drawable[2];
                C36341k9.A1I(gradientDrawable2, AnonymousClass3UF.A08(C36381kD.A0H(A0F, R.drawable.whatsapp_doodle), AnonymousClass00F.A00(A0F, R.color.f6nameremoved)), drawableArr);
                gradientDrawable = new LayerDrawable(drawableArr);
            } else if (intValue == 3) {
                str = A0F.getString(R.string.f12nameremoved);
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setSize(1, 1);
                gradientDrawable3.setColor(AnonymousClass00F.A00(A0F, R.color.f6nameremoved));
                drawable = AnonymousClass3UF.A02(A0F, R.drawable.ic_attachment_gallery, R.color.f6nameremoved);
                gradientDrawable = gradientDrawable3;
            } else {
                throw new RuntimeException(AnonymousClass000.A0l(num, "Unknown categoryType: ", AnonymousClass000.A0u()));
            }
            C38621pP r1 = r5.A00;
            r1.A00(gradientDrawable, drawable, str);
            if (intValue == 2) {
                scaleType = ImageView.ScaleType.CENTER;
            } else {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            }
            r1.setPreviewScaleType(scaleType);
        } else if (r102 instanceof C47252eB) {
            C47252eB r3 = (C47252eB) r102;
            Context A0F2 = C36441kJ.A0F(r3);
            String string = A0F2.getString(R.string.f12nameremoved);
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            gradientDrawable4.setSize(1, 1);
            gradientDrawable4.setColor(AnonymousClass00F.A00(A0F2, R.color.f6nameremoved));
            r3.A05.A00(gradientDrawable4, AnonymousClass3UF.A02(A0F2, R.drawable.ic_attachment_gallery, R.color.f6nameremoved), string);
            if (!r3.A01 && r3.A00 == null) {
                C49142id r22 = new C49142id(r3.A03, new AnonymousClass35X(r3, string));
                r3.A00 = r22;
                r3.A06.Box(r22, new Object[0]);
            }
        }
        if ((r102 instanceof C47252eB) && (r2 = ((C47252eB) r102).A00) != null) {
            this.A09.put(Integer.valueOf(i), r2);
        }
    }

    public int getItemViewType(int i) {
        return C36351kA.A06(this.A08, i);
    }

    public C40891wH(Handler handler, AnonymousClass16L r4, C21060yb r5, C19630wG r6, AnonymousClass6N7 r7, AnonymousClass35W r8, C19770wU r9, List list) {
        HashMap A0J = AnonymousClass001.A0J();
        this.A09 = A0J;
        Objects.requireNonNull(A0J);
        this.A06 = new C591732x(A0J);
        this.A08 = list;
        this.A05 = r8;
        this.A00 = handler;
        this.A02 = r5;
        this.A01 = r4;
        this.A03 = r6;
        this.A07 = r9;
        this.A04 = r7;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        if (i == 5) {
            C591732x r2 = this.A06;
            List list = AnonymousClass0D3.A0I;
            return new AnonymousClass2e9(C36381kD.A0K(LayoutInflater.from(context), R.layout.f9nameremoved), r2);
        } else if (i == 4) {
            C591732x r22 = this.A06;
            List list2 = AnonymousClass0D3.A0I;
            return new AnonymousClass2e8(C36381kD.A0K(LayoutInflater.from(context), R.layout.f9nameremoved), r22);
        } else if (i == 3) {
            Handler handler = this.A00;
            C21060yb r23 = this.A02;
            AnonymousClass16L r1 = this.A01;
            C19630wG r5 = this.A03;
            C19770wU r10 = this.A07;
            AnonymousClass6N7 r6 = this.A04;
            C591732x r8 = this.A06;
            List list3 = AnonymousClass0D3.A0I;
            return new C47252eB(r5, r6, new AnonymousClass3K8(handler, r1, r23, "wallpaper-category"), r8, new C38621pP(context), r10);
        } else {
            C591732x r12 = this.A06;
            List list4 = AnonymousClass0D3.A0I;
            return new C47242eA(r12, new C38621pP(context));
        }
    }
}
