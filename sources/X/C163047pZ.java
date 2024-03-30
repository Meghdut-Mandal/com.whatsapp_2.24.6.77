package X;

import android.app.Activity;
import com.whatsapp.R;
import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.7pZ  reason: invalid class name and case insensitive filesystem */
public class C163047pZ implements AnonymousClass4PH {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public C163047pZ(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A04 = i;
        this.A00 = obj3;
        this.A03 = str;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void Ben(String str) {
        int i;
        Activity activity;
        int i2 = this.A04;
        Object obj = this.A00;
        String str2 = str;
        if (i2 != 0) {
            AnonymousClass6VK r0 = (AnonymousClass6VK) obj;
            String str3 = this.A03;
            Activity activity2 = (Activity) this.A02;
            AnonymousClass9Y1 r3 = (AnonymousClass9Y1) r0.A0H.get();
            r3.A01(3);
            String str4 = r3.A02;
            UserJid A0b = C36401kF.A0b((Jid) this.A01);
            C18740tg.A06(A0b);
            AnonymousClass9N9 r5 = new AnonymousClass9N9(A0b, str3, str2, str4, r3.A0C.get(), (long) r3.A0D.getAndIncrement());
            C202279lS r4 = (C202279lS) r0.A0I.get();
            r4.A0O.add(new C142986pn(activity2, r4, r0));
            i = 0;
            activity = activity2;
            if (!r4.A09(r5)) {
                r4.A07(r5, false);
                return;
            }
        } else {
            FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = (FlowsWebBottomSheetContainer) obj;
            String str5 = this.A03;
            UserJid userJid = (UserJid) this.A01;
            AnonymousClass01I r1 = (AnonymousClass01I) this.A02;
            i = 0;
            AnonymousClass005 r2 = flowsWebBottomSheetContainer.A0K;
            if (r2 != null) {
                ((AnonymousClass9Y1) r2.get()).A01(3);
                AnonymousClass005 r22 = flowsWebBottomSheetContainer.A0K;
                if (r22 != null) {
                    String str6 = ((AnonymousClass9Y1) r22.get()).A02;
                    AnonymousClass005 r23 = flowsWebBottomSheetContainer.A0K;
                    if (r23 != null) {
                        long andIncrement = (long) ((AnonymousClass9Y1) r23.get()).A0D.getAndIncrement();
                        AnonymousClass005 r24 = flowsWebBottomSheetContainer.A0K;
                        if (r24 != null) {
                            AnonymousClass9N9 r52 = new AnonymousClass9N9(userJid, str5, str2, str6, ((AnonymousClass9Y1) r24.get()).A0C.get(), andIncrement);
                            AnonymousClass005 r25 = flowsWebBottomSheetContainer.A0L;
                            if (r25 != null) {
                                ((C202279lS) r25.get()).A0O.add(new C142976pm(r1, flowsWebBottomSheetContainer, str5));
                                AnonymousClass005 r26 = flowsWebBottomSheetContainer.A0L;
                                if (r26 != null) {
                                    activity = r1;
                                    if (!((C202279lS) r26.get()).A09(r52)) {
                                        AnonymousClass005 r02 = flowsWebBottomSheetContainer.A0L;
                                        if (r02 != null) {
                                            ((C202279lS) r02.get()).A07(r52, false);
                                            return;
                                        }
                                        throw C36331k8.A0d("catalogManagerLazy");
                                    }
                                } else {
                                    throw C36331k8.A0d("catalogManagerLazy");
                                }
                            } else {
                                throw C36331k8.A0d("catalogManagerLazy");
                            }
                        } else {
                            throw C36331k8.A0d("catalogAnalyticManagerLazy");
                        }
                    } else {
                        throw C36331k8.A0d("catalogAnalyticManagerLazy");
                    }
                } else {
                    throw C36331k8.A0d("catalogAnalyticManagerLazy");
                }
            } else {
                throw C36331k8.A0d("catalogAnalyticManagerLazy");
            }
        }
        ((C225014r) activity).Bu2(i, R.string.f12nameremoved);
    }
}
