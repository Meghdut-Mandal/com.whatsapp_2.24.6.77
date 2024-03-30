package com.whatsapp.backup.google;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass17Y;
import X.AnonymousClass3LW;
import X.AnonymousClass4X6;
import X.AnonymousClass4X8;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C38981qj;
import X.C39001qm;
import X.C88344Si;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class SingleChoiceListDialogFragment extends Hilt_SingleChoiceListDialogFragment {
    public AnonymousClass17Y A00;
    public C88344Si A01;
    public final AtomicBoolean A02 = C36431kI.A1H();

    public Dialog A1a(Bundle bundle) {
        String str;
        int length;
        int length2;
        Bundle bundle2 = this.A0A;
        if (bundle2.containsKey("dialog_id")) {
            int i = bundle2.getInt("dialog_id");
            this.A02.set(false);
            C39001qm A03 = AnonymousClass3LW.A03(this);
            A03.A0q(bundle2.getString("title"));
            A03.A0h((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
            if (bundle2.containsKey("items") && bundle2.containsKey("multi_line_list_items_key")) {
                throw AnonymousClass001.A09("Cannot provide both items and multi_line_list_items_key");
            } else if (bundle2.containsKey("items") || bundle2.containsKey("multi_line_list_items_key")) {
                int i2 = bundle2.getInt("selected_item_index", -1);
                if (bundle2.containsKey("items")) {
                    A03.A0U(new AnonymousClass4X6(bundle2, i, 1, this), bundle2.getStringArray("items"), i2);
                } else if (bundle2.containsKey("multi_line_list_items_key")) {
                    ArrayList A0I = AnonymousClass001.A0I();
                    String[] stringArray = bundle2.getStringArray("multi_line_list_items_key");
                    if (stringArray != null) {
                        String[] stringArray2 = bundle2.getStringArray("multi_line_list_item_values_key");
                        boolean[] booleanArray = bundle2.getBooleanArray("list_item_enabled_key");
                        String string = bundle2.getString("disabled_item_toast_key");
                        if (stringArray2 == null || (length = stringArray.length) == (length2 = stringArray2.length)) {
                            for (int i3 = 0; i3 < stringArray.length; i3++) {
                                HashMap A0J = AnonymousClass001.A0J();
                                A0J.put("line1", stringArray[i3]);
                                if (stringArray2 != null) {
                                    str = stringArray2[i3];
                                } else {
                                    str = null;
                                }
                                A0J.put("line2", str);
                                A0I.add(A0J);
                            }
                            int[] A1O = C36441kJ.A1O();
                            // fill-array-data instruction
                            A1O[0] = 16908308;
                            A1O[1] = 16908309;
                            A03.A0P(new AnonymousClass4X8(stringArray, this, booleanArray, string, i, 0), new C38981qj(A1D(), this, A0I, A1O, new String[]{"line1", "line2"}, stringArray, booleanArray, i2), i2);
                        } else {
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("keys.length = ");
                            A0u.append(length);
                            A0u.append(" ≠ ");
                            A0u.append(length2);
                            throw AnonymousClass000.A0c(" values.length", A0u);
                        }
                    } else {
                        throw AnonymousClass001.A08("Must provide multi_line_list_items_key");
                    }
                }
                return A03.create();
            } else {
                throw AnonymousClass001.A09("Must provide either items or multi_line_list_items_key");
            }
        } else {
            throw AnonymousClass001.A09("dialog_id should be provided.");
        }
    }

    public void A1O(Context context) {
        super.A1O(context);
        try {
            this.A01 = (C88344Si) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(AnonymousClass000.A0q(" must implement SingleChoiceListListener", C36381kD.A11(context)));
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Bundle bundle = this.A0A;
        if (this.A01 != null && !this.A02.get() && bundle.containsKey("dialog_id")) {
            this.A01.BVr(bundle.getInt("dialog_id"));
        }
    }
}
