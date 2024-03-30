package com.whatsapp.conversation.selectlist;

import X.AnonymousClass001;
import X.AnonymousClass34M;
import X.AnonymousClass3WE;
import X.AnonymousClass3YG;
import X.AnonymousClass4Q5;
import X.C012005e;
import X.C18740tg;
import X.C206689to;
import X.C206729ts;
import X.C207219uk;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36441kJ;
import X.C40791w7;
import X.C41161wl;
import X.C64193Na;
import X.C66963Xz;
import X.C89144Vk;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;

public class SelectListBottomSheet extends Hilt_SelectListBottomSheet {
    public AnonymousClass4Q5 A00;
    public C207219uk A01;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1J() {
        super.A1J();
        this.A00 = null;
    }

    public void A1S(Bundle bundle, View view) {
        String str;
        super.A1S(bundle, view);
        C207219uk r0 = (C207219uk) A0b().getParcelable("arg_select_list_content");
        this.A01 = r0;
        if (r0 == null || this.A00 == null) {
            A1b();
            return;
        }
        if (A1o()) {
            view.setBackground((Drawable) null);
        }
        C66963Xz.A00(view.findViewById(R.id.close), this, 34);
        if (this.A01.A00 == 8) {
            C36391kE.A0O(view, R.id.select_list_button).setText(R.string.f12nameremoved);
        }
        C36401kF.A0P(view, R.id.select_list_title).A0I(this.A01.A08);
        RecyclerView A0c = C36441kJ.A0c(view, R.id.select_list_items);
        A0c.A0v(new C89144Vk(this, 1));
        A0c.setNestedScrollingEnabled(true);
        A0c.A0t(new C41161wl());
        C40791w7 r2 = new C40791w7();
        A0c.setAdapter(r2);
        C207219uk r02 = this.A01;
        C18740tg.A06(r02);
        List<C206689to> list = r02.A0C;
        ArrayList A0I = AnonymousClass001.A0I();
        for (C206689to r6 : list) {
            String str2 = r6.A01;
            if (!TextUtils.isEmpty(str2)) {
                A0I.add(new C64193Na(str2));
            }
            int i = 0;
            while (true) {
                List list2 = r6.A02;
                if (i < list2.size()) {
                    C206729ts r4 = (C206729ts) list2.get(i);
                    if (i == 0) {
                        str = r6.A00;
                    } else {
                        str = null;
                    }
                    A0I.add(new C64193Na(r4, str));
                    i++;
                }
            }
        }
        if (this.A01.A00 == 8) {
            int i2 = 0;
            while (true) {
                if (i2 >= A0I.size()) {
                    break;
                } else if (C36421kH.A1a(((C64193Na) A0I.get(i2)).A02)) {
                    i2++;
                } else if (i2 != -1) {
                    r2.A00 = i2;
                    C012005e.A02(view, R.id.select_list_button).setVisibility(0);
                    C36351kA.A19(view, R.id.tab_to_select);
                }
            }
        }
        List list3 = r2.A02;
        list3.clear();
        list3.addAll(A0I);
        r2.A06();
        AnonymousClass3YG.A00(view.findViewById(R.id.select_list_button), this, r2, 2);
        r2.A01 = new AnonymousClass34M(view, this);
        this.A02.setOnShowListener(AnonymousClass3WE.A00);
    }
}
