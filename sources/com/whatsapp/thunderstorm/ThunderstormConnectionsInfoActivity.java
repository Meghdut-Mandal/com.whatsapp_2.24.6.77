package com.whatsapp.thunderstorm;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.C03570Gk;
import X.C203279ni;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36391kE;
import X.C40411vV;
import X.C430124e;
import X.C48772i1;
import X.C55612uu;
import X.C63313Jo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;

public final class ThunderstormConnectionsInfoActivity extends C430124e {
    public RecyclerView A00;
    public C40411vV A01;
    public C203279ni A02;
    public List A03 = AnonymousClass001.A0I();
    public String[] A04;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.A02 != null) {
            this.A04 = C203279ni.A05();
            C36391kE.A15(this, R.string.f12nameremoved);
            C36321k7.A0P(this);
            setContentView((int) R.layout.f9nameremoved);
            this.A01 = new C40411vV(new C55612uu());
            ViewStub viewStub = (ViewStub) findViewById(R.id.thunderstorm_contact_list_stub);
            if (viewStub != null && viewStub.findViewById(R.id.thunderstorm_contact_list_view) == null) {
                View inflate = viewStub.inflate();
                AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                RecyclerView recyclerView = (RecyclerView) inflate;
                this.A00 = recyclerView;
                if (recyclerView == null) {
                    throw C36331k8.A0d("contactListView");
                }
                C40411vV r0 = this.A01;
                if (r0 == null) {
                    throw C36331k8.A0d("contactListAdapter");
                }
                recyclerView.setAdapter(r0);
                RecyclerView recyclerView2 = this.A00;
                if (recyclerView2 == null) {
                    throw C36331k8.A0d("contactListView");
                }
                recyclerView2.setVisibility(0);
            }
            ArrayList A0I = AnonymousClass001.A0I();
            if (!C36331k8.A06(this).getBoolean("thunderstorm_has_contacts", false)) {
                String A0m = C36361kB.A0m(this, R.string.f12nameremoved);
                Integer valueOf = Integer.valueOf(R.drawable.avatar_contact);
                A0I.add(new C63313Jo(valueOf, (Integer) null, A0m, 0));
                A0I.add(new C63313Jo(valueOf, (Integer) null, C36361kB.A0m(this, R.string.f12nameremoved), 0));
                A0I.add(new C63313Jo(valueOf, (Integer) null, C36361kB.A0m(this, R.string.f12nameremoved), 0));
            }
            if (A0I.isEmpty()) {
                A0I.add(new C63313Jo((Integer) null, Integer.valueOf(R.string.f12nameremoved), C36361kB.A0m(this, R.string.f12nameremoved), 1));
            }
            this.A03 = A0I;
            C40411vV r02 = this.A01;
            if (r02 == null) {
                throw C36331k8.A0d("contactListAdapter");
            }
            r02.A0M(A0I);
            C48772i1.A00(findViewById(R.id.display_bottomsheet_button), this, 31);
            return;
        }
        throw C36331k8.A0d("thunderstormManager");
    }

    public void onStart() {
        super.onStart();
        if (this.A02 != null) {
            String[] strArr = this.A04;
            if (strArr == null) {
                throw C36331k8.A0d("requiredPermissions");
            }
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (AnonymousClass00F.A01(this, strArr[i]) != 0) {
                    int i2 = Build.VERSION.SDK_INT;
                    String[] strArr2 = this.A04;
                    if (i2 < 23) {
                        if (strArr2 == null) {
                            throw C36331k8.A0d("requiredPermissions");
                        }
                        C03570Gk.A0C(this, strArr2, 1);
                        return;
                    } else if (strArr2 == null) {
                        throw C36331k8.A0d("requiredPermissions");
                    } else {
                        requestPermissions(strArr2, 1);
                        return;
                    }
                } else {
                    i++;
                }
            }
            return;
        }
        throw C36331k8.A0d("thunderstormManager");
    }
}
