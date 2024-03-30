package X;

import android.view.View;
import android.widget.EditText;

/* renamed from: X.22v  reason: invalid class name and case insensitive filesystem */
public final class C429822v extends C429721s {
    public final /* synthetic */ C89004Uw A00;
    public final /* synthetic */ String A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C429822v(android.content.Context r7, X.AnonymousClass17Y r8, X.C32691e2 r9, X.C89004Uw r10, X.C21060yb r11, java.lang.String r12) {
        /*
            r6 = this;
            r0 = r6
            r5 = r12
            r6.A01 = r12
            r6.A00 = r10
            r1 = r7
            r3 = r8
            r2 = r9
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C429822v.<init>(android.content.Context, X.17Y, X.1e2, X.4Uw, X.0yb, java.lang.String):void");
    }

    public void onClick(View view) {
        C89004Uw r4 = this.A00;
        if (r4 != null) {
            String A05 = AnonymousClass098.A05(this.A01, "commands", "", false);
            EditText textEntryField = r4.getTextEntryField();
            if (textEntryField != null) {
                textEntryField.getText().append(A05);
            }
        }
    }
}
