package X;

import android.widget.TextView;
import com.whatsapp.authentication.FingerprintBottomSheet;

/* renamed from: X.A8e  reason: case insensitive filesystem */
public class C21093A8e implements C160387kv {
    public final /* synthetic */ C160387kv A00;
    public final /* synthetic */ AnonymousClass8UY A01;

    public C21093A8e(C160387kv r1, AnonymousClass8UY r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* synthetic */ void A00() {
        this.A01.A03.Bgg();
    }

    public void BRY(int i, CharSequence charSequence) {
        this.A00.BRY(i, charSequence);
    }

    public void BRZ() {
        this.A00.BRZ();
    }

    public void BRb(int i, CharSequence charSequence) {
        this.A00.BRb(i, charSequence);
    }

    public void BRc(byte[] bArr) {
        FingerprintBottomSheet fingerprintBottomSheet = this.A01.A02;
        fingerprintBottomSheet.A1g(false);
        TextView textView = fingerprintBottomSheet.A01;
        if (textView != null) {
            textView.setEnabled(false);
        }
        TextView textView2 = fingerprintBottomSheet.A00;
        if (textView2 != null) {
            textView2.setEnabled(false);
        }
        this.A00.BRc(bArr);
    }
}
