package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.whatsapp.WaEditText;
import com.whatsapp.polls.PollCreatorViewModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5LG  reason: invalid class name */
public class AnonymousClass5LG extends C66803Xj {
    public final /* synthetic */ C21060yb A00;
    public final /* synthetic */ AnonymousClass1N0 A01;
    public final /* synthetic */ AnonymousClass1H2 A02;
    public final /* synthetic */ AnonymousClass5HD A03;
    public final /* synthetic */ PollCreatorViewModel A04;
    public final /* synthetic */ C19890wg A05;

    public AnonymousClass5LG(C21060yb r1, AnonymousClass1N0 r2, AnonymousClass1H2 r3, AnonymousClass5HD r4, PollCreatorViewModel pollCreatorViewModel, C19890wg r6) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A05 = r6;
        this.A01 = r2;
        this.A04 = pollCreatorViewModel;
    }

    public void afterTextChanged(Editable editable) {
        AnonymousClass5HD r4 = this.A03;
        if (r4.A04() != -1) {
            String obj = editable.toString();
            String replace = obj.replace("\n", "");
            if (TextUtils.equals(obj, replace)) {
                String obj2 = editable.toString();
                WaEditText waEditText = r4.A02;
                Context context = waEditText.getContext();
                AnonymousClass1H2 r6 = this.A02;
                C21060yb r3 = this.A00;
                C19890wg r2 = this.A05;
                TextPaint paint = waEditText.getPaint();
                C36331k8.A1G(context, 1, r6);
                AnonymousClass3UG.A07(context, paint, editable, r6, 1.3f);
                AnonymousClass6YV.A0M(editable, false);
                AnonymousClass6YV.A09(r3, r2, editable, paint.getColor(), true);
                AnonymousClass3UG.A07(waEditText.getContext(), waEditText.getPaint(), editable, r6, 1.3f);
                int A042 = r4.A04() - 2;
                PollCreatorViewModel pollCreatorViewModel = this.A04;
                List list = pollCreatorViewModel.A0D;
                if (list.size() < pollCreatorViewModel.A06.A07(1408) && obj2.length() == 1) {
                    if (C36421kH.A06(list, 1) != A042) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((AnonymousClass5HF) it.next()).A00.isEmpty()) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    int i = pollCreatorViewModel.A01;
                    pollCreatorViewModel.A01 = i + 1;
                    list.add(new AnonymousClass5HF(i));
                    PollCreatorViewModel.A01(pollCreatorViewModel);
                    pollCreatorViewModel.A0B.A0C(C36441kJ.A11());
                }
                if (pollCreatorViewModel.A0T(obj2, A042)) {
                    boolean A0S = pollCreatorViewModel.A0S(A042);
                    int i2 = pollCreatorViewModel.A00;
                    if (A0S) {
                        if (A042 != i2) {
                            C36341k9.A17(pollCreatorViewModel.A02, C36431kI.A07(list));
                            pollCreatorViewModel.A00 = A042;
                            pollCreatorViewModel.A0B.A0C(C36441kJ.A11());
                        }
                    } else if (i2 != -1) {
                        C36341k9.A17(pollCreatorViewModel.A02, -1);
                        pollCreatorViewModel.A00 = -1;
                    }
                    int i3 = r4.A00;
                    int i4 = 0;
                    while (true) {
                        List list2 = pollCreatorViewModel.A0C;
                        if (i4 >= list2.size()) {
                            break;
                        } else if (i3 == C36351kA.A06(list2, i4)) {
                            list2.remove(i4);
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                Editable text = waEditText.getText();
                if (text != null) {
                    Drawable drawable = r4.A01;
                    boolean isEmpty = text.toString().isEmpty();
                    int i5 = 255;
                    if (isEmpty) {
                        i5 = 0;
                    }
                    drawable.setAlpha(i5);
                    return;
                }
                return;
            }
            editable.clear();
            editable.append(replace);
        }
    }
}
