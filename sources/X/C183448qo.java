package X;

import android.view.MenuItem;
import com.whatsapp.group.GroupAddBlacklistPickerActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.lastseen.LastSeenBlockListPickerActivity;
import com.whatsapp.profile.AboutStatusBlockListPickerActivity;
import com.whatsapp.profile.ProfilePhotoBlockListPickerActivity;
import com.whatsapp.status.audienceselector.StatusRecipientsActivity;
import com.whatsapp.status.audienceselector.StatusTemporalRecipientsActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8qo  reason: invalid class name and case insensitive filesystem */
public class C183448qo extends C132446Tt {
    public final Set A00;
    public final /* synthetic */ C173788Ta A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C183448qo(C173788Ta r2, Set set) {
        super(r2, true);
        this.A01 = r2;
        HashSet A16 = C36441kJ.A16();
        this.A00 = A16;
        A16.addAll(set);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Collection A3j;
        boolean z;
        C192969Ji r4 = new C192969Ji();
        ArrayList A0I = AnonymousClass001.A0I();
        r4.A00 = A0I;
        C173788Ta r5 = this.A01;
        r5.A08.A0i(A0I);
        if (!r5.A0F.A01.A0E(3763)) {
            Iterator it = r4.A00.iterator();
            while (it.hasNext()) {
                if (AnonymousClass143.A0I(C36391kE.A0f(it).A0H)) {
                    it.remove();
                }
            }
        }
        r4.A01 = new HashSet(r4.A00.size(), 1.0f);
        Iterator it2 = r4.A00.iterator();
        while (it2.hasNext()) {
            r4.A01.add(C36391kE.A0f(it2).A06(UserJid.class));
        }
        if (!r5.A0K) {
            A3j = r5.A3j();
        } else if (r5 instanceof StatusRecipientsActivity) {
            StatusRecipientsActivity statusRecipientsActivity = (StatusRecipientsActivity) r5;
            if (statusRecipientsActivity instanceof StatusTemporalRecipientsActivity) {
                A3j = StatusTemporalRecipientsActivity.A0y((StatusTemporalRecipientsActivity) statusRecipientsActivity).A02;
            } else {
                AnonymousClass16E r0 = statusRecipientsActivity.A03;
                if (r0 != null) {
                    A3j = r0.A0B();
                } else {
                    throw C36331k8.A0d("statusStore");
                }
            }
        } else if (r5 instanceof ProfilePhotoBlockListPickerActivity) {
            A3j = C36441kJ.A15(((ProfilePhotoBlockListPickerActivity) r5).A00.A04());
        } else if (r5 instanceof AboutStatusBlockListPickerActivity) {
            A3j = C36441kJ.A15(((AboutStatusBlockListPickerActivity) r5).A00.A04());
        } else if (r5 instanceof LastSeenBlockListPickerActivity) {
            A3j = C36441kJ.A15(((LastSeenBlockListPickerActivity) r5).A00.A04());
        } else if (r5 instanceof GroupAddBlacklistPickerActivity) {
            A3j = C36441kJ.A15(((GroupAddBlacklistPickerActivity) r5).A00.A04());
        } else {
            A3j = AnonymousClass001.A0I();
        }
        List<AnonymousClass11F> userJidsFromChatJids = UserJid.userJidsFromChatJids(A3j);
        r4.A02 = new HashSet(userJidsFromChatJids.size());
        for (AnonymousClass11F r2 : userJidsFromChatJids) {
            if (r5 instanceof StatusRecipientsActivity) {
                z = !r5.A0K;
            } else if ((r5 instanceof LastSeenBlockListPickerActivity) || (r5 instanceof GroupAddBlacklistPickerActivity)) {
                z = false;
            } else {
                z = true;
            }
            boolean contains = r4.A01.contains(r2);
            if (z) {
                if (!contains) {
                }
            } else if (!contains) {
                r4.A01.add(r2);
                r4.A00.add(r5.A08.A0D(r2));
            }
            r4.A02.add(r2);
        }
        Collections.sort(r4.A00, new C43192Fn(r4, this, r5.A0A, r5.A00));
        if (userJidsFromChatJids.size() != r4.A02.size()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C36371kC.A1R("statusrecipients/update old:", A0u, userJidsFromChatJids);
            A0u.append(" new:");
            C36321k7.A1Y(A0u, r4.A02.size());
            Set set = r4.A02;
            if (r5 instanceof StatusRecipientsActivity) {
                StatusRecipientsActivity statusRecipientsActivity2 = (StatusRecipientsActivity) r5;
                AnonymousClass00C.A0D(set, 0);
                AnonymousClass16E r22 = statusRecipientsActivity2.A03;
                if (r22 != null) {
                    r22.A0F(C36441kJ.A15(set), C36371kC.A00(statusRecipientsActivity2.A0K ? 1 : 0));
                    C144576sT r02 = statusRecipientsActivity2.A02;
                    if (r02 != null) {
                        r02.A01();
                    } else {
                        throw C36331k8.A0d("syncdUpdateHelper");
                    }
                } else {
                    throw C36331k8.A0d("statusStore");
                }
            } else if ((r5 instanceof ProfilePhotoBlockListPickerActivity) || (r5 instanceof AboutStatusBlockListPickerActivity)) {
                return r4;
            }
        }
        return r4;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C192969Ji r8 = (C192969Ji) obj;
        C173788Ta r4 = this.A01;
        r4.A03 = null;
        Set set = r4.A0S;
        set.clear();
        set.addAll(r8.A02);
        Set set2 = r4.A0Q;
        set2.clear();
        set2.addAll(set);
        Set set3 = this.A00;
        if (!set3.isEmpty()) {
            for (Object next : set3) {
                if (!(r4 instanceof StatusRecipientsActivity) ? !((r4 instanceof LastSeenBlockListPickerActivity) || (r4 instanceof GroupAddBlacklistPickerActivity)) : (!r4.A0K)) {
                    if (!r8.A01.contains(next)) {
                    }
                }
                set.add(next);
            }
            HashSet A16 = C36441kJ.A16();
            for (Object next2 : r8.A02) {
                if (!set3.contains(next2)) {
                    A16.add(next2);
                }
            }
            set.removeAll(A16);
        }
        r4.A3m();
        ArrayList arrayList = r8.A00;
        r4.A0I = arrayList;
        r4.A0J = r8.A01;
        MenuItem menuItem = r4.A00;
        if (menuItem != null) {
            menuItem.setVisible(C36411kG.A1a(arrayList));
        }
        C173788Ta.A0v(r4);
    }
}
