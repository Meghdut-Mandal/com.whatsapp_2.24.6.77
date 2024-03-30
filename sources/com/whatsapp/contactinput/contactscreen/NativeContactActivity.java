package com.whatsapp.contactinput.contactscreen;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass4AB;
import X.AnonymousClass4AC;
import X.AnonymousClass4FX;
import X.C224914p;
import X.C36361kB;
import X.C36441kJ;
import X.C39491sV;
import X.C40501ve;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.Collections;
import java.util.List;

public final class NativeContactActivity extends C224914p {
    public final AnonymousClass00T A00 = C36441kJ.A0a(new AnonymousClass4AC(this), new AnonymousClass4AB(this), new AnonymousClass4FX(this), C36441kJ.A1A(C39491sV.class));

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        List emptyList = Collections.emptyList();
        AnonymousClass00C.A08(emptyList);
        ((RecyclerView) C36361kB.A0H(this, R.id.form_recycler_view)).setAdapter(new C40501ve(emptyList));
    }
}
