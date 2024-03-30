package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.conversation.selectlist.SelectListBottomSheet;

/* renamed from: X.3fP  reason: invalid class name and case insensitive filesystem */
public final class C70593fP implements C87734Py {
    public final AnonymousClass17Y A00;

    public C70593fP(AnonymousClass17Y r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BlQ(Context context, AnonymousClass3T1 r5, C207219uk r6, int i) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putParcelable("arg_select_list_content", r6);
        SelectListBottomSheet selectListBottomSheet = new SelectListBottomSheet();
        selectListBottomSheet.A17(A07);
        selectListBottomSheet.A00 = new AnonymousClass2tZ(context, this, r5, 0);
        Activity A002 = C18860tw.A00(context);
        if (A002 != null) {
            C65443Sb.A00(selectListBottomSheet, (AnonymousClass01I) A002);
        }
    }
}
