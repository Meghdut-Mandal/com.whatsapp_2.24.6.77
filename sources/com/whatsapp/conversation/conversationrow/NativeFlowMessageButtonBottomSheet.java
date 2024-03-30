package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass2IR;
import X.AnonymousClass393;
import X.C012005e;
import X.C36331k8;
import X.C36381kD;
import X.C36401kF;
import X.C36441kJ;
import X.C604537x;
import X.C604637y;
import X.C63193Jc;
import X.C66963Xz;
import X.C70533fJ;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONArray;

public final class NativeFlowMessageButtonBottomSheet extends Hilt_NativeFlowMessageButtonBottomSheet {
    public C63193Jc A00;
    public AnonymousClass393 A01;
    public LinearLayout A02;
    public TextEmojiLabel A03;
    public WaImageButton A04;

    public void A1S(Bundle bundle, View view) {
        View view2 = view;
        AnonymousClass00C.A0D(view2, 0);
        super.A1S(bundle, view2);
        WaImageButton waImageButton = (WaImageButton) C012005e.A02(view2, R.id.button_bottom_sheet_close_button);
        this.A04 = waImageButton;
        if (waImageButton != null) {
            C66963Xz.A00(waImageButton, this, 3);
        }
        this.A03 = C36401kF.A0O(view2, R.id.nfm_button_bottom_sheet_title);
        this.A02 = (LinearLayout) C012005e.A02(view2, R.id.nfm_button_bottom_sheet_container);
        TextEmojiLabel textEmojiLabel = this.A03;
        if (textEmojiLabel != null) {
            C63193Jc r1 = this.A00;
            if (r1 != null) {
                C63193Jc.A00(A0a(), textEmojiLabel, r1);
            } else {
                throw C36331k8.A0d("conversationFont");
            }
        }
        AnonymousClass393 r0 = this.A01;
        if (r0 != null) {
            LinearLayout linearLayout = this.A02;
            TextEmojiLabel textEmojiLabel2 = this.A03;
            InteractiveButtonsRowContentLayout interactiveButtonsRowContentLayout = r0.A01;
            NativeFlowMessageButtonBottomSheet nativeFlowMessageButtonBottomSheet = r0.A02;
            List list = r0.A04;
            AnonymousClass2IR r9 = r0.A00;
            C604637y r12 = r0.A03;
            String str = r12.A02;
            if (!(textEmojiLabel2 == null || str == null)) {
                textEmojiLabel2.setText(str);
            }
            LinkedHashSet A17 = C36441kJ.A17();
            JSONArray jSONArray = r12.A03;
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof Integer) {
                        A17.add(obj);
                    }
                }
            }
            if (linearLayout != null) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    boolean A1Z = C36381kD.A1Z(A17, i2);
                    C604537x r8 = (C604537x) list.get(i2);
                    linearLayout.addView(InteractiveButtonsRowContentLayout.A00(AnonymousClass00F.A04(interactiveButtonsRowContentLayout.getContext(), R.color.f6nameremoved), AnonymousClass00F.A04(interactiveButtonsRowContentLayout.getContext(), R.color.f6nameremoved), r9, new C604537x(new C70533fJ(r8, nativeFlowMessageButtonBottomSheet), r8.A02, r8.A00, r8.A03), interactiveButtonsRowContentLayout, i2, true, A1Z, true));
                }
            }
        }
    }

    public void A1J() {
        super.A1J();
        this.A04 = null;
        this.A03 = null;
        LinearLayout linearLayout = this.A02;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        this.A02 = null;
    }

    public int A1i() {
        return R.layout.f9nameremoved;
    }
}
