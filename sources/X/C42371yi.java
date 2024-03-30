package X;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.1yi  reason: invalid class name and case insensitive filesystem */
public class C42371yi extends AnonymousClass0D3 {
    public View A00;
    public TextView A01;
    public TextView A02;
    public AppCompatRadioButton A03;
    public AppCompatRadioButton A04;
    public WaImageView A05;
    public final /* synthetic */ C40721w0 A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42371yi(View view, C40721w0 r4) {
        super(view);
        this.A06 = r4;
        View view2 = this.A0H;
        this.A05 = C36421kH.A0J(view2, R.id.image);
        this.A03 = (AppCompatRadioButton) view2.findViewById(R.id.radio);
        this.A02 = C36351kA.A0E(view2);
        this.A01 = C36391kE.A0P(view2, R.id.description);
        this.A04 = (AppCompatRadioButton) view2.findViewById(R.id.right_radio);
        this.A00 = view2.findViewById(R.id.divider);
        this.A03.setClickable(false);
        this.A04.setClickable(false);
    }
}
