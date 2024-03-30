package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.polls.PollCreatorViewModel;
import java.util.List;

/* renamed from: X.6cL  reason: invalid class name and case insensitive filesystem */
public class C135216cL implements TextWatcher {
    public final /* synthetic */ C21060yb A00;
    public final /* synthetic */ AnonymousClass1N0 A01;
    public final /* synthetic */ AnonymousClass1H2 A02;
    public final /* synthetic */ AnonymousClass5HC A03;
    public final /* synthetic */ PollCreatorViewModel A04;
    public final /* synthetic */ C19890wg A05;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C135216cL(C21060yb r1, AnonymousClass1N0 r2, AnonymousClass1H2 r3, AnonymousClass5HC r4, PollCreatorViewModel pollCreatorViewModel, C19890wg r6) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A05 = r6;
        this.A01 = r2;
        this.A04 = pollCreatorViewModel;
    }

    public void afterTextChanged(Editable editable) {
        AnonymousClass5HC r1 = this.A03;
        List list = AnonymousClass0D3.A0I;
        WaEditText waEditText = r1.A00;
        Context context = waEditText.getContext();
        AnonymousClass1H2 r6 = this.A02;
        Editable editable2 = editable;
        AnonymousClass6YV.A0F(context, editable2, waEditText.getPaint(), this.A00, r6, this.A05, R.color.f6nameremoved, r1.A02);
        AnonymousClass3UG.A07(waEditText.getContext(), waEditText.getPaint(), editable, r6, 1.3f);
        this.A04.A07.A00 = editable.toString();
    }
}
