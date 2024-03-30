package X;

import android.view.KeyEvent;
import android.view.View;
import com.whatsapp.search.views.TokenizedSearchInput;

/* renamed from: X.6d3  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135656d3 implements View.OnKeyListener {
    public final /* synthetic */ TokenizedSearchInput A00;

    public /* synthetic */ C135656d3(TokenizedSearchInput tokenizedSearchInput) {
        this.A00 = tokenizedSearchInput;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        TokenizedSearchInput tokenizedSearchInput = this.A00;
        if (tokenizedSearchInput.A0G == null || keyEvent == null) {
            return false;
        }
        if ((keyEvent.getKeyCode() != 66 && keyEvent.getKeyCode() != 160) || keyEvent.getAction() != 1) {
            return false;
        }
        tokenizedSearchInput.A0G.A0r(false);
        return true;
    }
}
