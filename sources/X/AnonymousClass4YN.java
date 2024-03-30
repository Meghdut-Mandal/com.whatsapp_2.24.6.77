package X;

import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.status.advertise.UpdatesAdvertiseViewModel;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.4YN  reason: invalid class name */
public class AnonymousClass4YN implements AnonymousClass4Q6 {
    public Object A00;
    public final int A01;

    public AnonymousClass4YN(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BU2(Object obj) {
        List A0w;
        C51362nh r0;
        C48052gc r1;
        C001600r r02;
        switch (this.A01) {
            case 0:
                C42601z5 r7 = (C42601z5) this.A00;
                AnonymousClass38J r11 = (AnonymousClass38J) obj;
                if (r11 != null) {
                    C64373Ns r3 = r11.A00;
                    AnonymousClass37O r5 = r3.A00;
                    r7.A01 = r5.A01;
                    r7.A02 = r5.A02;
                    WebPagePreviewView webPagePreviewView = r7.A08;
                    int i = 0;
                    if (r7.A00 instanceof AnonymousClass2bO) {
                        i = 2;
                    }
                    webPagePreviewView.setLinkTitleTypeface(i);
                    webPagePreviewView.setLinkTitle(r11.A02);
                    webPagePreviewView.setLinkSnippet(r11.A01);
                    r7.A06.setText(r11.A03);
                    if (r3.A01.booleanValue()) {
                        r7.A0A.A08.A0D(webPagePreviewView.A0I, r7.A00, new C53702rk(r7, 12));
                    } else {
                        webPagePreviewView.A0I.setVisibility(0);
                        ThumbnailButton thumbnailButton = webPagePreviewView.A0I;
                        AnonymousClass3UF.A0B(thumbnailButton.getContext(), thumbnailButton, R.drawable.ic_group_invite_link, R.color.f6nameremoved);
                        webPagePreviewView.A0I.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        webPagePreviewView.A0I.setScaleX(1.5f);
                        webPagePreviewView.A0I.setScaleY(1.5f);
                        ThumbnailButton thumbnailButton2 = webPagePreviewView.A0I;
                        C36341k9.A0q(thumbnailButton2.getContext(), thumbnailButton2, R.color.f6nameremoved);
                    }
                    webPagePreviewView.setLinkHostname(r5.A00);
                    return;
                }
                return;
            case 1:
                r02 = ((AnonymousClass2EJ) this.A00).A08;
                break;
            case 2:
                r02 = (C001600r) this.A00;
                break;
            case 3:
                UpdatesViewModel updatesViewModel = (UpdatesViewModel) this.A00;
                Number number = (Number) obj;
                if (number != null) {
                    int intValue = number.intValue();
                    AnonymousClass08S r52 = updatesViewModel.A0P;
                    UpdatesAdvertiseViewModel updatesAdvertiseViewModel = updatesViewModel.A0c;
                    boolean z = updatesViewModel.A0C;
                    Object A04 = r52.A04();
                    if (intValue == 0) {
                        r1 = null;
                    } else {
                        AnonymousClass08M r8 = updatesAdvertiseViewModel.A00;
                        Boolean bool = (Boolean) r8.A03.get("KEY_STATUS_MAIN_HAS_SHOWN_ADVERTISE_BANNER");
                        if (bool == null) {
                            AnonymousClass005 r6 = updatesAdvertiseViewModel.A02.A00;
                            r8.A03("KEY_STATUS_MAIN_HAS_SHOWN_ADVERTISE_BANNER", Boolean.valueOf(C36391kE.A0H(r6).getBoolean("pref_advertise_banner_status_main_shown", false)));
                            bool = Boolean.valueOf(C36391kE.A0H(r6).getBoolean("pref_advertise_banner_status_main_shown", false));
                        }
                        if (bool.booleanValue() || !updatesAdvertiseViewModel.A03.A03(C51642o9.ADVERTISE)) {
                            r0 = C51362nh.Button;
                        } else {
                            r0 = C51362nh.Banner;
                        }
                        r1 = new C48052gc(r0);
                        if (z && A04 == null) {
                            updatesAdvertiseViewModel.A0S(r1);
                        }
                    }
                    r52.A0C(r1);
                    return;
                }
                return;
            case 4:
                UpdatesViewModel updatesViewModel2 = (UpdatesViewModel) this.A00;
                List list = (List) obj;
                if (list != null) {
                    List<Object> list2 = updatesViewModel2.A0l;
                    Set A0f = C007103b.A0f(list2);
                    C001700s r62 = updatesViewModel2.A0T;
                    ArrayList A0I = AnonymousClass001.A0I();
                    for (Object next : list) {
                        if (!A0f.contains(((C48162go) next).A04.A06())) {
                            A0I.add(next);
                        }
                    }
                    r62.A0D(A0I);
                    ArrayList A0I2 = AnonymousClass001.A0I();
                    for (Object next2 : list) {
                        if (A0f.contains(((C48162go) next2).A04.A06())) {
                            A0I2.add(next2);
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C36331k8.A01(A0I2));
                    for (Object next3 : A0I2) {
                        linkedHashMap.put(((C48162go) next3).A04.A06(), next3);
                    }
                    C001700s r32 = updatesViewModel2.A0S;
                    ArrayList A0I3 = AnonymousClass001.A0I();
                    for (Object obj2 : list2) {
                        Object obj3 = linkedHashMap.get(obj2);
                        if (obj3 != null) {
                            A0I3.add(obj3);
                        }
                    }
                    r32.A0D(A0I3);
                    C607039a r4 = updatesViewModel2.A0g;
                    boolean z2 = r4.A00;
                    r4.A00 = false;
                    if (z2) {
                        boolean z3 = updatesViewModel2.A0F;
                        boolean z4 = true;
                        if (updatesViewModel2.A09 || (A0w = C36401kF.A0w(r62)) == null || !A0w.isEmpty() || !C36331k8.A1b(r4.A04)) {
                            z4 = false;
                        }
                        updatesViewModel2.A0F = z4;
                        if (z4 != z3) {
                            UpdatesViewModel.A0A(updatesViewModel2, false);
                        }
                    }
                    if (C36401kF.A1a(list)) {
                        UpdatesViewModel.A08(updatesViewModel2);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                C36331k8.A13(((UpdatesViewModel) this.A00).A00);
                return;
            default:
                r02 = ((UpdatesViewModel) this.A00).A0R;
                break;
        }
        r02.A0C(obj);
    }
}
