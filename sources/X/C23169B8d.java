package X;

import com.whatsapp.TextEmojiLabel;
import com.whatsapp.status.advertise.AdvertiseViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.B8d  reason: case insensitive filesystem */
public class C23169B8d implements AnonymousClass4Q6 {
    public Object A00;
    public final int A01;

    public C23169B8d(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BU2(Object obj) {
        switch (this.A01) {
            case 0:
                C175208a1.A00((AnonymousClass9K1) obj, (C175208a1) this.A00);
                return;
            case 1:
                TextEmojiLabel textEmojiLabel = (TextEmojiLabel) this.A00;
                textEmojiLabel.setPlaceholder(0);
                textEmojiLabel.A0I((CharSequence) obj);
                return;
            default:
                AdvertiseViewModel advertiseViewModel = (AdvertiseViewModel) this.A00;
                List list = (List) obj;
                if (list != null) {
                    List list2 = advertiseViewModel.A01;
                    boolean z = false;
                    if (list.size() == list2.size()) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(C36331k8.A01(list2));
                        for (Object next : list2) {
                            linkedHashMap.put(((AnonymousClass3T1) next).A1J.A01, next);
                        }
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!linkedHashMap.containsKey(C36391kE.A0l(it).A1J.A01)) {
                                    }
                                }
                            }
                        }
                        z = true;
                    }
                    advertiseViewModel.A01 = list;
                    if (!z) {
                        advertiseViewModel.A03.A0C(list);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
