package X;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.List;
import java.util.Map;

/* renamed from: X.7zb  reason: invalid class name and case insensitive filesystem */
public class C168037zb extends AnonymousClass0CZ {
    public final Map A00 = AnonymousClass001.A0J();
    public final C196089Xp A01;
    public final C18820ts A02;
    public final C207199ui A03;

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new AnonymousClass805(C36331k8.A09(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false), this.A01);
        }
        if (i == 1) {
            return new AnonymousClass80J(C36331k8.A09(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false));
        }
        throw C90464aC.A0R("Unsupported view type - ", AnonymousClass000.A0u(), i);
    }

    public int A0J() {
        return this.A03.A09.A09.size() + 1;
    }

    public void BSE(AnonymousClass0D3 r23, int i) {
        String str;
        String str2;
        AnonymousClass0D3 r10 = r23;
        C207199ui r5 = this.A03;
        C207009uP r6 = r5.A09;
        List list = r6.A09;
        int i2 = i;
        if (i2 < list.size()) {
            C206959uJ r7 = (C206959uJ) list.get(i2);
            AnonymousClass805 r102 = (AnonymousClass805) r10;
            C18820ts r9 = this.A02;
            C206759tv r12 = (C206759tv) this.A00.get(r7.A00());
            C206979uM r8 = r7.A02;
            long j = r8.A01;
            int i3 = r7.A01;
            String A07 = r5.A07(r9, new C206979uM(j * ((long) i3), r8.A00, r8.A02));
            WaImageView waImageView = r102.A00;
            Resources A0F = C36341k9.A0F(waImageView);
            r102.A03.setText(r7.A04);
            WaTextView waTextView = r102.A02;
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1J(A0L, i3);
            waTextView.setText(A0F.getString(R.string.f12nameremoved, A0L));
            r102.A01.setText(A07);
            if (r12 == null) {
                waImageView.setImageDrawable(new ColorDrawable(A0F.getColor(R.color.f6nameremoved)));
            } else {
                r102.A04.A02(waImageView, r12, (C22914AyQ) null, C143066pv.A00, 2);
            }
        } else {
            AnonymousClass80J r103 = (AnonymousClass80J) r10;
            C18820ts r92 = this.A02;
            C206979uM r2 = r6.A06;
            String A072 = r5.A07(r92, r2);
            C206979uM r3 = r6.A03;
            String A073 = r5.A07(r92, r3);
            C206979uM r4 = r6.A04;
            String A074 = r5.A07(r92, r4);
            String A075 = r5.A07(r92, r6.A05);
            String A06 = r5.A06(r92);
            String str3 = null;
            if (r2 == null) {
                str = null;
            } else {
                str = r2.A02;
            }
            if (r3 == null) {
                str2 = null;
            } else {
                str2 = r3.A02;
            }
            if (r4 != null) {
                str3 = r4.A02;
            }
            if (!TextUtils.isEmpty(A072) || !TextUtils.isEmpty(A073) || !TextUtils.isEmpty(A074)) {
                AnonymousClass80J.A01(r103, 0);
                AnonymousClass80J.A00(r103.A04, r103.A05, r92, r103, (String) null, A075, R.string.f12nameremoved);
                AnonymousClass80J.A00(r103.A06, r103.A07, r92, r103, str, A072, R.string.f12nameremoved);
                AnonymousClass80J.A00(r103.A00, r103.A01, r92, r103, str2, A073, R.string.f12nameremoved);
                AnonymousClass80J.A00(r103.A02, r103.A03, r92, r103, str3, A074, R.string.f12nameremoved);
            } else {
                AnonymousClass80J.A01(r103, 8);
            }
            r103.A08.setText(A06);
        }
    }

    public int getItemViewType(int i) {
        return AnonymousClass000.A1S(i, this.A03.A09.A09.size()) ? 1 : 0;
    }

    public C168037zb(C196089Xp r2, C18820ts r3, C207199ui r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }
}
