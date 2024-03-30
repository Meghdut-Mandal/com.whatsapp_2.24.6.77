package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.Map;

/* renamed from: X.2eD  reason: invalid class name and case insensitive filesystem */
public class C47272eD extends C42771zS {
    public final AnonymousClass11F A00;
    public final C597335b A01;
    public final C19770wU A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final Map A06 = AnonymousClass001.A0J();
    public final boolean A07;
    public final C64383Nt A08;

    public static void A00(C47222e3 r5, C47272eD r6, int i) {
        r5.A02.setVisibility(0);
        r5.A03.setVisibility(0);
        r5.A01.setVisibility(8);
        C49872jp r2 = new C49872jp(r5.getContext(), (Uri) r6.A03.get(i), r6.A08, new C61853Dr(r5, r6, i));
        C36331k8.A1E((C132446Tt) r6.A06.put(Integer.valueOf(i), r2));
        C36331k8.A1F(r2, r6.A02);
    }

    public int A0H() {
        int size = this.A03.size();
        List list = this.A05;
        if (list != null) {
            return size + list.size();
        }
        return size;
    }

    public void A0J(ViewGroup viewGroup, Object obj, int i) {
        viewGroup.removeView((View) obj);
        C36331k8.A1E((C132446Tt) this.A06.remove(Integer.valueOf(i)));
    }

    public C47272eD(Context context, Resources resources, AnonymousClass11F r4, C64383Nt r5, C597335b r6, C19770wU r7, List list, List list2, List list3, boolean z) {
        super(context, resources);
        this.A02 = r7;
        this.A08 = r5;
        this.A01 = r6;
        this.A03 = list;
        this.A05 = list2;
        this.A04 = list3;
        this.A00 = r4;
        this.A07 = z;
    }

    public boolean A0K(View view, Object obj) {
        return C36361kB.A1a(view, obj);
    }
}
