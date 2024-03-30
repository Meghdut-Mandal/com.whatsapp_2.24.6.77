package X;

import android.view.View;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;

/* renamed from: X.4o4  reason: invalid class name and case insensitive filesystem */
public final class C96894o4 extends AnonymousClass0D3 {
    public AnonymousClass2gA A00;
    public C66803Xj A01;
    public final AppCompatRadioButton A02;
    public final WaEditText A03;
    public final WaTextView A04;
    public final C21060yb A05;
    public final C18820ts A06;
    public final AnonymousClass1N0 A07;
    public final AnonymousClass1H2 A08;
    public final C19890wg A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96894o4(View view, C21060yb r3, C18820ts r4, AnonymousClass1N0 r5, AnonymousClass1H2 r6, C19890wg r7) {
        super(view);
        AnonymousClass00C.A0D(view, 1);
        this.A08 = r6;
        this.A05 = r3;
        this.A06 = r4;
        this.A09 = r7;
        this.A07 = r5;
        this.A04 = (WaTextView) C36361kB.A0F(view, R.id.counter);
        this.A03 = (WaEditText) C36361kB.A0F(view, R.id.text);
        this.A02 = (AppCompatRadioButton) C36361kB.A0F(view, R.id.reason);
    }
}
