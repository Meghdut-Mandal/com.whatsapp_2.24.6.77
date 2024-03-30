package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.bonsai.commands.BotCommandsPickerView;
import com.whatsapp.interopui.compose.InteropComposeSelectIntegratorActivity;
import com.whatsapp.mentions.MentionPickerView;

/* renamed from: X.4Vh  reason: invalid class name and case insensitive filesystem */
public class C89114Vh extends C02740Bs {
    public Object A00;
    public final int A01;

    public C89114Vh(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A01() {
        switch (this.A01) {
            case 0:
                BotCommandsPickerView botCommandsPickerView = (BotCommandsPickerView) this.A00;
                C40571vl r0 = botCommandsPickerView.A00;
                if (r0 != null) {
                    botCommandsPickerView.A08(r0.A01.size());
                    return;
                }
                return;
            case 1:
                AnonymousClass3AS r2 = (AnonymousClass3AS) this.A00;
                r2.A01.A0i(0);
                r2.A05.A01.unregisterObserver(this);
                return;
            case 2:
                C225314u r22 = (C225314u) this.A00;
                C81093wS.A00(r22.A05, r22, 40);
                return;
            case 4:
                A07();
                return;
            case 5:
                MentionPickerView mentionPickerView = (MentionPickerView) this.A00;
                mentionPickerView.A04();
                mentionPickerView.A02.postDelayed(new C1497272n(mentionPickerView, 6), 250);
                return;
            case 6:
                ((View) this.A00).requestLayout();
                return;
            default:
                super.A01();
                return;
        }
    }

    public void A03(int i, int i2) {
        AnonymousClass0CP r1;
        int i3;
        switch (this.A01) {
            case 3:
                C40441vY r5 = (C40441vY) this.A00;
                RecyclerView recyclerView = r5.A00;
                LinearLayoutManager linearLayoutManager = null;
                if (recyclerView != null) {
                    r1 = recyclerView.getLayoutManager();
                } else {
                    r1 = null;
                }
                if (r1 instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) r1;
                }
                if (recyclerView != null) {
                    i3 = recyclerView.getScrollState();
                } else {
                    i3 = 0;
                }
                if (linearLayoutManager != null && i2 >= 0 && i == 0 && i3 == 0) {
                    int max = Math.max(linearLayoutManager.A1S(), 0);
                    if (max == 0 || max == 1) {
                        RecyclerView recyclerView2 = r5.A00;
                        if (recyclerView2 != null) {
                            recyclerView2.A0h(0);
                        }
                        RecyclerView recyclerView3 = r5.A00;
                        if (recyclerView3 != null) {
                            recyclerView3.postOnAnimationDelayed(C80223v3.A00(r5, 47), 128);
                            return;
                        }
                        return;
                    }
                    RecyclerView recyclerView4 = r5.A00;
                    if (recyclerView4 != null) {
                        recyclerView4.A0n(0, 10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                A07();
                return;
            default:
                super.A03(i, i2);
                return;
        }
    }

    public void A04(int i, int i2) {
        if (4 - this.A01 != 0) {
            super.A04(i, i2);
        } else {
            A07();
        }
    }

    public final void A07() {
        InteropComposeSelectIntegratorActivity interopComposeSelectIntegratorActivity = (InteropComposeSelectIntegratorActivity) this.A00;
        AnonymousClass1RJ r2 = interopComposeSelectIntegratorActivity.A03;
        if (r2 == null) {
            throw C36331k8.A0d("emptyViewStub");
        }
        C40601vo r0 = interopComposeSelectIntegratorActivity.A01;
        if (r0 == null) {
            throw C36331k8.A0d("integratorsAdapter");
        }
        int size = r0.A00.size();
        int i = 8;
        if (size == 0) {
            i = 0;
        }
        r2.A03(i);
        interopComposeSelectIntegratorActivity.invalidateOptionsMenu();
    }
}
