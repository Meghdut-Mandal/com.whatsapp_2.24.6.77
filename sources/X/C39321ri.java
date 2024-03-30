package X;

import android.content.Context;
import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextPaint;
import android.text.TextWatcher;
import com.whatsapp.WaEditText;
import com.whatsapp.events.EventCreateOrEditFragment;
import com.whatsapp.textstatus.AddTextStatusActivity;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.1ri  reason: invalid class name and case insensitive filesystem */
public class C39321ri implements NoCopySpan, TextWatcher {
    public Object A00;
    public final int A01;

    public C39321ri(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void afterTextChanged(Editable editable) {
        String str;
        switch (this.A01) {
            case 1:
                AnonymousClass00C.A0D(editable, 0);
                EventCreateOrEditFragment eventCreateOrEditFragment = (EventCreateOrEditFragment) this.A00;
                WaEditText waEditText = eventCreateOrEditFragment.A06;
                if (waEditText != null) {
                    Context context = waEditText.getContext();
                    TextPaint paint = waEditText.getPaint();
                    AnonymousClass1H2 r1 = eventCreateOrEditFragment.A0F;
                    if (r1 != null) {
                        AnonymousClass3UG.A07(context, paint, editable, r1, 1.3f);
                        return;
                    }
                    throw C36331k8.A0d("emojiLoader");
                }
                return;
            case 3:
                AddTextStatusActivity addTextStatusActivity = (AddTextStatusActivity) this.A00;
                boolean z = false;
                if (addTextStatusActivity.A0F) {
                    C40691vx r12 = addTextStatusActivity.A0C;
                    if (r12 == null) {
                        throw C36331k8.A0d("adapter");
                    }
                    r12.A01 = null;
                    r12.A06();
                    addTextStatusActivity.A0F = false;
                }
                AddTextStatusActivity.A07(addTextStatusActivity);
                String str2 = addTextStatusActivity.A0E;
                if (str2 == null || str2.length() == 0) {
                    addTextStatusActivity.A04.Bp1(C81183wb.A00(addTextStatusActivity, 19));
                }
                WDSButton wDSButton = addTextStatusActivity.A0D;
                if (wDSButton == null) {
                    throw C36331k8.A0d("clearButton");
                }
                if ((editable != null && editable.length() > 0) || ((str = addTextStatusActivity.A0E) != null && str.length() > 0)) {
                    z = true;
                }
                wDSButton.setEnabled(z);
                return;
            case 5:
                ((C006302t) this.A00).invoke(editable);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        r1 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r2.setVisibility(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r5 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r5.length() >= 4) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        r3.setEnabled(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r0.A0E == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r5.length() != 0) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x0031;
                case 1: goto L_0x0005;
                case 2: goto L_0x0040;
                case 3: goto L_0x0005;
                case 4: goto L_0x0006;
                case 5: goto L_0x0005;
                case 6: goto L_0x0012;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r0 = r4.A00
            com.whatsapp.wds.components.search.WDSConversationSearchView r0 = (com.whatsapp.wds.components.search.WDSConversationSearchView) r0
            android.widget.ImageButton r2 = r0.A02
            boolean r0 = r0.A0E
            r1 = 0
            if (r0 != 0) goto L_0x002b
            goto L_0x0023
        L_0x0012:
            java.lang.Object r2 = r4.A00
            com.whatsapp.wds.components.search.WDSSearchView r2 = (com.whatsapp.wds.components.search.WDSSearchView) r2
            X.33f r1 = r2.A01
            X.2mt r0 = X.C50942mt.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0005
            com.whatsapp.WaImageButton r2 = r2.A09
            r1 = 0
        L_0x0023:
            if (r5 == 0) goto L_0x002b
            int r0 = r5.length()
            if (r0 != 0) goto L_0x002d
        L_0x002b:
            r1 = 8
        L_0x002d:
            r2.setVisibility(r1)
            return
        L_0x0031:
            java.lang.Object r0 = r4.A00
            com.whatsapp.email.UpdateEmailActivity r0 = (com.whatsapp.email.UpdateEmailActivity) r0
            com.whatsapp.wds.components.button.WDSButton r3 = r0.A08
            if (r3 != 0) goto L_0x004f
            java.lang.String r0 = "nextButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0040:
            java.lang.Object r0 = r4.A00
            com.whatsapp.registration.email.RegisterEmail r0 = (com.whatsapp.registration.email.RegisterEmail) r0
            com.whatsapp.wds.components.button.WDSButton r3 = r0.A0B
            if (r3 != 0) goto L_0x004f
            java.lang.String r0 = "nextButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x004f:
            if (r5 == 0) goto L_0x0059
            int r2 = r5.length()
            r1 = 4
            r0 = 1
            if (r2 >= r1) goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            r3.setEnabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39321ri.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
