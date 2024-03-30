package X;

import android.view.View;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.whatsapp.R;

/* renamed from: X.1yB  reason: invalid class name and case insensitive filesystem */
public final class C42041yB extends AnonymousClass0D3 {
    public final AppCompatRadioButton A00;
    public final /* synthetic */ C40451vZ A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42041yB(View view, C40451vZ r4) {
        super(view);
        this.A01 = r4;
        AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) C36361kB.A0G(view, R.id.country_radio_button_item);
        this.A00 = appCompatRadioButton;
        C36371kC.A1F(appCompatRadioButton, r4, this, 13);
    }
}
