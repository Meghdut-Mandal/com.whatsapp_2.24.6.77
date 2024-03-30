package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7zg  reason: invalid class name and case insensitive filesystem */
public class C168087zg extends AnonymousClass0CZ {
    public final Resources A00;
    public final C591832y A01;
    public final C19770wU A02;
    public final List A03 = AnonymousClass001.A0I();
    public final Map A04 = AnonymousClass001.A0J();

    public int A0J() {
        return this.A03.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r5, int i) {
        C168207zs r52 = (C168207zs) r5;
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            C182728pa r53 = (C182728pa) r52;
            C36331k8.A1E(r53.A00);
            C49332iw r1 = new C49332iw(C36441kJ.A0F(r53), r53.A01, (File) ((AnonymousClass9IV) this.A03.get(i)).A01);
            r53.A00 = r1;
            C36331k8.A1F(r1, r53.A02);
            C90504aG.A1K(r53.A00, this.A04, i);
        } else if (itemViewType == 1) {
            C182728pa r54 = (C182728pa) r52;
            int A0I = AnonymousClass000.A0I(((AnonymousClass9IV) this.A03.get(i)).A01);
            Resources resources = this.A00;
            C18740tg.A06(resources);
            Drawable drawable = resources.getDrawable(A0I);
            C49332iw r12 = r54.A00;
            if (r12 != null) {
                r12.A0D(true);
                r54.A00 = null;
            }
            r54.A01.setImageDrawable(drawable);
        } else if (itemViewType == 2) {
            C182718pZ r55 = (C182718pZ) r52;
            int i2 = 4;
            if (AnonymousClass000.A1X(((AnonymousClass9IV) this.A03.get(i)).A01)) {
                i2 = 0;
            }
            r55.A00.setVisibility(i2);
            r55.A01.setVisibility(i2);
        }
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass9IV) this.A03.get(i)).A00;
    }

    public C168087zg(Resources resources, C591832y r3, C19770wU r4) {
        this.A02 = r4;
        this.A00 = resources;
        this.A01 = r3;
    }

    public void A0L(AnonymousClass00I r5, List list, int i) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0I.add(new C182748pc((File) it.next()));
        }
        if (i != 0) {
            if (i == 1) {
                A0I.add(new C182768pe(true));
                A0I.add(new C182758pd());
            } else {
                A0I.add(new C182768pe(C36381kD.A0j()));
                Object obj = r5.A00;
                C18740tg.A06(obj);
                Iterator A13 = C90514aH.A13(obj);
                while (A13.hasNext()) {
                    A0I.add(new C182738pb((Integer) A13.next()));
                }
            }
        }
        List list2 = this.A03;
        AnonymousClass0X4 A002 = C06880Vl.A00(new C167907zO(list2, A0I));
        list2.clear();
        list2.addAll(A0I);
        A002.A02(this);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass0D3 r3;
        View view;
        View.OnClickListener onClickListener;
        Context context = viewGroup.getContext();
        if (i == 0 || i == 1) {
            C19770wU r2 = this.A02;
            List list = AnonymousClass0D3.A0I;
            C39041qx r1 = new C39041qx(context);
            r1.setScaleType(ImageView.ScaleType.CENTER_CROP);
            r3 = new C182728pa(r1, r2);
            view = r3.A0H;
            onClickListener = new C48902iF(this, r3, 27);
        } else {
            List list2 = AnonymousClass0D3.A0I;
            LayoutInflater from = LayoutInflater.from(context);
            if (i == 3) {
                return new C182708pY(from.inflate(R.layout.f9nameremoved, (ViewGroup) null));
            }
            r3 = new C182718pZ(from.inflate(R.layout.f9nameremoved, (ViewGroup) null));
            view = r3.A0H;
            onClickListener = new AnonymousClass3Y8(this, 39);
        }
        view.setOnClickListener(onClickListener);
        return r3;
    }
}
