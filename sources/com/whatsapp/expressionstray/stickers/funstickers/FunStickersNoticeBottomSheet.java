package com.whatsapp.expressionstray.stickers.funstickers;

import X.AnonymousClass00C;
import X.AnonymousClass01z;
import X.AnonymousClass3TE;
import X.AnonymousClass3YY;
import X.AnonymousClass4BV;
import X.AnonymousClass4G7;
import X.C000800j;
import X.C001400p;
import X.C10830fI;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36431kI;
import X.C36441kJ;
import X.C63563Kn;
import X.C65203Rd;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

public final class FunStickersNoticeBottomSheet extends Hilt_FunStickersNoticeBottomSheet {
    public C65203Rd A00;

    public void A1S(Bundle bundle, View view) {
        int i;
        TextView A0E;
        View view2 = view;
        AnonymousClass00C.A0D(view2, 0);
        super.A1S(bundle, view2);
        Object value = C001400p.A00(C000800j.NONE, new AnonymousClass4G7(this)).getValue();
        int A02 = C36331k8.A02(AnonymousClass3TE.A02(this, "stickerOrigin", 10));
        C65203Rd r11 = this.A00;
        if (r11 != null) {
            AnonymousClass01z supportFragmentManager = A0i().getSupportFragmentManager();
            AnonymousClass00C.A08(supportFragmentManager);
            Integer valueOf = Integer.valueOf(A02);
            AnonymousClass4BV r12 = new AnonymousClass4BV(this);
            C63563Kn r4 = r11.A01;
            if (r4.A02() && (A0E = C36351kA.A0E(view2)) != null) {
                A0E.setText(R.string.f12nameremoved);
            }
            LinearLayout A0U = C36441kJ.A0U(view2, R.id.disclosure_bullet);
            if (A0U != null) {
                int dimensionPixelSize = A0U.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                List<C10830fI> list = r11.A02;
                int i2 = 0;
                for (C10830fI r8 : list) {
                    int i3 = i2 + 1;
                    if (i2 == C36431kI.A07(list)) {
                        i = A0U.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                    } else {
                        i = dimensionPixelSize;
                    }
                    C65203Rd.A01(C65203Rd.A00(C36371kC.A0B(A0U), r8, -1.0f), A0U, r11, (Integer) null, dimensionPixelSize, i);
                    i2 = i3;
                }
                View inflate = C36351kA.A0C(view2).inflate(R.layout.f9nameremoved, A0U, false);
                AnonymousClass00C.A0B(inflate);
                C65203Rd r18 = r11;
                LinearLayout linearLayout = A0U;
                C65203Rd.A01(inflate, linearLayout, r18, (Integer) null, 0, A0U.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
                int A06 = C36441kJ.A06(A0U.getResources(), R.dimen.f7nameremoved, dimensionPixelSize);
                if (r4.A02()) {
                    C65203Rd.A01(C65203Rd.A00(C36371kC.A0B(A0U), new C10830fI((Object) null, (Object) null, Integer.valueOf(R.string.f12nameremoved)), 12.0f), linearLayout, r18, Integer.valueOf(A06), dimensionPixelSize, C36371kC.A03(A0U, R.dimen.f7nameremoved));
                }
                LinearLayout linearLayout2 = A0U;
                C65203Rd r5 = r11;
                C65203Rd.A01(C65203Rd.A00(C36371kC.A0B(A0U), new C10830fI((Object) null, (Object) null, Integer.valueOf(R.string.f12nameremoved)), 12.0f), linearLayout2, r5, Integer.valueOf(A06), dimensionPixelSize, 0);
            }
            View findViewById = view2.findViewById(R.id.get_started);
            if (findViewById != null) {
                findViewById.setOnClickListener(new AnonymousClass3YY(r11, r12, value, supportFragmentManager, valueOf, 2));
                return;
            }
            return;
        }
        throw C36331k8.A0d("noticeBuilder");
    }

    public int A1i() {
        return R.layout.f9nameremoved;
    }
}
