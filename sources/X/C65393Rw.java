package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.3Rw  reason: invalid class name and case insensitive filesystem */
public class C65393Rw {
    public ImageView A00;
    public ImageView A01;
    public ImageView A02;
    public AnonymousClass1RJ A03;
    public int A04;
    public final ViewGroup A05;
    public final ImageView A06;
    public final ImageView A07;
    public final TextView A08;
    public final /* synthetic */ AnonymousClass2IC A09;

    public C65393Rw(View view, AnonymousClass2IC r5, int i) {
        this.A09 = r5;
        this.A04 = i;
        this.A08 = C36391kE.A0O(view, R.id.date);
        this.A07 = C36391kE.A0N(view, R.id.album_thumb_status);
        ImageView A0G = C36401kF.A0G(view, R.id.thumb);
        this.A06 = A0G;
        C36331k8.A0q(view.getContext(), A0G, R.string.f12nameremoved);
        this.A05 = C36411kG.A0O(view, R.id.album_thumbnail_date_wrapper);
        View findViewById = view.findViewById(R.id.hd_icon);
        if (findViewById != null) {
            this.A03 = new AnonymousClass1RJ(findViewById);
        }
        C48812i6.A00(A0G, r5, this, 43);
        AnonymousClass2IR.A0W(A0G, r5);
    }

    public static void A01(C65393Rw r9) {
        Bundle bundle;
        AnonymousClass2IC r8 = r9.A09;
        Intent A0B = AnonymousClass2IC.A0B(r8);
        AnonymousClass01I r4 = (AnonymousClass01I) C24801Dv.A01(r8.getContext(), AnonymousClass01L.class);
        if (!AnonymousClass3U9.A00) {
            bundle = null;
        } else {
            ArrayList A0I = AnonymousClass001.A0I();
            int i = r9.A04;
            if (i < 3 || r8.A08.size() == 4) {
                A0B.putExtra("start_index", i);
                r9.A02((AnonymousClass2bU) r8.A08.get(i), A0I);
            } else {
                int i2 = 0;
                do {
                    ((C65393Rw) r8.A0E.get(i2)).A02((AnonymousClass2bU) r8.A08.get(i2), A0I);
                    i2++;
                } while (i2 < 3);
            }
            bundle = AnonymousClass0YW.A01(r4, (AnonymousClass00I[]) A0I.toArray(new AnonymousClass00I[0])).A00.toBundle();
            r4.A21(new C89054Vb(r4, r9, 0));
        }
        C05290Pd.A00(r4, A0B, bundle);
    }

    public void A02(AnonymousClass2bU r3, ArrayList arrayList) {
        C36341k9.A1H(this.A06, AnonymousClass3RL.A01(r3), arrayList);
        TextView textView = this.A08;
        if (textView.getVisibility() == 0) {
            C36341k9.A1H(textView, AnonymousClass3RL.A00(r3), arrayList);
        }
        ImageView imageView = this.A07;
        if (imageView != null) {
            C36341k9.A1H(imageView, AnonymousClass2IQ.A0N(r3), arrayList);
        }
    }

    public static void A00(ImageView imageView, C65393Rw r3, int i, int i2) {
        LinearLayout.LayoutParams A0N = C36371kC.A0N();
        A0N.gravity = 16;
        imageView.setLayoutParams(A0N);
        C36331k8.A0q(imageView.getContext(), imageView, i);
        AnonymousClass1JZ.A05(imageView, r3.A09.A0E, 0, i2);
    }
}
