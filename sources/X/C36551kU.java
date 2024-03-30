package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.doodle.textentry.TextEntryView;

/* renamed from: X.1kU  reason: invalid class name and case insensitive filesystem */
public final class C36551kU extends Dialog implements AnonymousClass4R5 {
    public int A00;
    public C21060yb A01;
    public TextEntryView A02;
    public final C75643nZ A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36551kU(Activity activity, C21060yb r3, C146806wC r4, AnonymousClass3A1 r5, TextEntryView textEntryView, int i) {
        super(activity, R.style.f13nameremoved);
        AnonymousClass00C.A0D(textEntryView, 5);
        this.A01 = r3;
        this.A02 = textEntryView;
        this.A00 = i;
        this.A03 = new C75643nZ(r4, r5, textEntryView);
    }

    public static final void A00(C36551kU r3) {
        r3.setContentView(r3.A02);
        C90104Zc.A00(r3.A02.getViewTreeObserver(), r3, 24);
        Window window = r3.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setFlags(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
            window.clearFlags(256);
            if (C19550w8.A05()) {
                window.getAttributes().layoutInDisplayCutoutMode = 1;
            }
            AnonymousClass6YG.A00(r3.A02, window, r3.A01);
            window.setSoftInputMode(5);
        }
        C75643nZ r2 = r3.A03;
        r2.A00 = r3;
        r2.A01.A02(r2, r2.A03);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A00(this);
    }
}
