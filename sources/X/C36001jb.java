package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.whatsapp.HomeActivity;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1jb  reason: invalid class name and case insensitive filesystem */
public class C36001jb extends C226815j {
    public Object A00;
    public final int A01;

    public C36001jb(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(ConversationsFragment conversationsFragment) {
        conversationsFragment.A1W.A02 = true;
        if (conversationsFragment.A1Q != null) {
            ConversationsFragment.A0I(conversationsFragment);
        }
    }

    public void A04(AnonymousClass11F r10) {
        C34751ha r1;
        C28981Uw r0;
        AnonymousClass9WC r02;
        AnonymousClass11F r5 = r10;
        switch (this.A01) {
            case 0:
                HomeActivity homeActivity = (HomeActivity) this.A00;
                if (homeActivity.A02.A0M(r10)) {
                    Log.i("HomeActivty/onProfilePhotoChanged");
                    HomeActivity.A11(homeActivity);
                    return;
                }
                return;
            case 1:
                Log.i("CallsHistoryDataSource/onProfilePhotoChanged");
                if (r10 != null && (r1 = ((C34621hN) this.A00).A07) != null) {
                    Log.i("CallsHistoryViewModel/onProfilePhotoChanged");
                    CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r1.A00;
                    if (!callsHistoryFragmentV2ViewModel.A0H) {
                        Log.i("CallsHistoryViewModel/onProfilePhotoChanged skip due to no active observer");
                        return;
                    }
                    AnonymousClass5MS r12 = callsHistoryFragmentV2ViewModel.A07;
                    if (r12 != null) {
                        r12.A0D(true);
                    }
                    Lock lock = callsHistoryFragmentV2ViewModel.A0n;
                    C34781hd r2 = callsHistoryFragmentV2ViewModel.A0R;
                    LinkedHashMap linkedHashMap = callsHistoryFragmentV2ViewModel.A0m;
                    AnonymousClass5MS r13 = new AnonymousClass5MS(r2, callsHistoryFragmentV2ViewModel, callsHistoryFragmentV2ViewModel.A0X, r5, callsHistoryFragmentV2ViewModel.A0k, linkedHashMap, lock);
                    callsHistoryFragmentV2ViewModel.A07 = r13;
                    C18670tX.A00(callsHistoryFragmentV2ViewModel, r13);
                    return;
                }
                return;
            case 2:
                ((C34471h6) this.A00).A00.A0L(r10);
                return;
            case 3:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
                ConversationsFragment.A0M(conversationsFragment, r10);
                C33341fA r3 = conversationsFragment.A1W;
                if (r3 instanceof C33361fC) {
                    C33351fB r32 = (C33351fB) r3;
                    if (r10 instanceof UserJid) {
                        String str = r10.user;
                        if (!AnonymousClass14B.A0F(str)) {
                            Map map = r32.A0A;
                            if (map.containsKey(str)) {
                                ImageView imageView = (ImageView) map.get(str);
                                AnonymousClass141 A08 = r32.A04.A08(r10);
                                if (!(A08 == null || imageView == null)) {
                                    r32.A0B.A08(imageView, A08);
                                }
                            }
                        }
                    }
                }
                A00(conversationsFragment);
                return;
            case 4:
                AnonymousClass1ZU r4 = (AnonymousClass1ZU) this.A00;
                AnonymousClass9WC r03 = r4.A00;
                if (r03 != null) {
                    r0 = r03.A00;
                } else {
                    r0 = null;
                }
                if (AnonymousClass00C.A0J(r10, r0) && r10 != null) {
                    Context context = r4.A09.A00;
                    AnonymousClass00C.A08(context);
                    AnonymousClass141 A0D = r4.A04.A0D(r10);
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(17104901);
                    if (r4.A08.A02(context, A0D, dimensionPixelSize, dimensionPixelSize) != null && (r02 = r4.A00) != null) {
                        r4.A03(r02.A00, r02.A01, r02.A02);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void A06(UserJid userJid) {
        switch (this.A01) {
            case 2:
                ((C34471h6) this.A00).A00.A0L(userJid);
                return;
            case 3:
                ConversationsFragment.A0M((ConversationsFragment) this.A00, userJid);
                return;
            default:
                return;
        }
    }

    public void A07(UserJid userJid) {
        switch (this.A01) {
            case 2:
                ((C34471h6) this.A00).A00.A0L(userJid);
                return;
            case 3:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
                ConversationsFragment.A0M(conversationsFragment, userJid);
                A00(conversationsFragment);
                return;
            default:
                return;
        }
    }

    public void A0A(Collection collection) {
        if (1 - this.A01 == 0) {
            C34621hN r1 = (C34621hN) this.A00;
            if (r1.A07 != null) {
                Collection collection2 = collection;
                if (collection != null && !collection.isEmpty()) {
                    C34751ha r12 = r1.A07;
                    Log.i("CallsHistoryViewModel/onContactsAddedOrUpdated");
                    CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r12.A00;
                    if (!callsHistoryFragmentV2ViewModel.A0H) {
                        Log.i("CallsHistoryViewModel/onContactsAddedOrUpdated skip due to no active observer");
                        return;
                    }
                    AnonymousClass5MP r13 = callsHistoryFragmentV2ViewModel.A0A;
                    if (r13 != null) {
                        r13.A0D(true);
                    }
                    C34791he r14 = callsHistoryFragmentV2ViewModel.A0S;
                    Lock lock = callsHistoryFragmentV2ViewModel.A0n;
                    AnonymousClass5MP r0 = new AnonymousClass5MP(r14, callsHistoryFragmentV2ViewModel, callsHistoryFragmentV2ViewModel.A0k, collection2, callsHistoryFragmentV2ViewModel.A0m, lock);
                    callsHistoryFragmentV2ViewModel.A0A = r0;
                    C18670tX.A00(callsHistoryFragmentV2ViewModel, r0);
                }
            }
        }
    }

    public void A0B(Collection collection) {
        switch (this.A01) {
            case 1:
                Log.i("CallsHistoryDataSource/onContactsChanged");
                C34751ha r0 = ((C34621hN) this.A00).A07;
                if (r0 != null && collection != null) {
                    CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r0.A00;
                    synchronized (callsHistoryFragmentV2ViewModel) {
                        callsHistoryFragmentV2ViewModel.A0E = null;
                    }
                    C34821hh r1 = callsHistoryFragmentV2ViewModel.A0T;
                    if (!TextUtils.isEmpty(r1.A01)) {
                        r1.filter(r1.A01);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                C34471h6 r02 = (C34471h6) this.A00;
                if (collection == null) {
                    C34421h1 r3 = r02.A00;
                    r3.A01.A0H(new C35671j4(r3, 21));
                    return;
                }
                r02.A00.A0M(new ArrayList(collection));
                return;
            case 3:
                if (collection == null || collection.isEmpty()) {
                    ConversationsFragment.A0H((ConversationsFragment) this.A00);
                    return;
                }
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ConversationsFragment.A0M((ConversationsFragment) this.A00, (AnonymousClass11F) it.next());
                }
                A00((ConversationsFragment) this.A00);
                return;
            case 5:
                ((C24481Cp) this.A00).A0A();
                return;
            default:
                return;
        }
    }

    public void A0C(Collection collection) {
        if (3 - this.A01 == 0) {
            ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
            if (!C20800yB.A01(C21000yV.A02, conversationsFragment.A21, 5868)) {
                return;
            }
            if (collection == null || collection.isEmpty()) {
                ConversationsFragment.A0H(conversationsFragment);
                return;
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ConversationsFragment.A0M(conversationsFragment, ((AnonymousClass141) it.next()).A0H);
            }
            A00(conversationsFragment);
        }
    }

    public void A0D(Collection collection) {
        if (3 - this.A01 == 0) {
            ((ConversationsFragment) this.A00).A2u.Boy(new C35691j6(this, 18));
        }
    }
}
