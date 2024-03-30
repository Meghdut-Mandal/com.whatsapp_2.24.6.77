package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet;
import java.util.List;

/* renamed from: X.80R  reason: invalid class name */
public final class AnonymousClass80R extends AnonymousClass07S {
    public List A00 = C023409w.A00;
    public final /* synthetic */ NewsletterReactionsSheet A01;

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0I(android.view.ViewGroup r21, int r22) {
        /*
            r20 = this;
            r8 = 0
            r5 = r21
            android.view.LayoutInflater r1 = X.C36341k9.A0J(r5, r8)
            r0 = 2131625660(0x7f0e06bc, float:1.8878534E38)
            android.view.View r2 = r1.inflate(r0, r5, r8)
            r0 = 2131433162(0x7f0b16ca, float:1.8488102E38)
            com.whatsapp.WaTextView r4 = X.C36411kG.A0Z(r2, r0)
            r0 = 2131433160(0x7f0b16c8, float:1.8488098E38)
            android.view.View r3 = r2.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r0 = 2131433161(0x7f0b16c9, float:1.84881E38)
            android.view.View r1 = r2.findViewById(r0)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r5.getContext()
            r7 = 1
            X.C36351kA.A1F(r3, r7)
            r0 = r20
            java.util.List r6 = r0.A00
            r9 = r22
            java.lang.Object r6 = r6.get(r9)
            X.8zQ r6 = (X.C188338zQ) r6
            int r6 = r6.ordinal()
            java.lang.String r10 = "reaction_senders_list_photo_loader"
            java.lang.String r11 = "viewModel"
            if (r6 == r8) goto L_0x00b8
            if (r6 != r7) goto L_0x0112
            com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet r6 = r0.A01
            X.7yf r8 = r6.A0B
            if (r8 != 0) goto L_0x0051
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r11)
            throw r0
        L_0x0051:
            java.util.List r9 = r6.A0C
            int r9 = r9.size()
            r19 = 1
            if (r9 > r7) goto L_0x005d
            r19 = 0
        L_0x005d:
            X.0Ab r13 = r6.A0m()
            X.1Pn r9 = r6.A07
            if (r9 == 0) goto L_0x00b1
            android.content.Context r7 = r6.A0a()
            X.1RY r16 = r9.A05(r7, r10)
            X.3ET r7 = r6.A0A
            if (r7 == 0) goto L_0x00aa
            X.171 r15 = r6.A06
            if (r15 == 0) goto L_0x00a3
            X.1Dv r14 = r6.A03
            if (r14 == 0) goto L_0x009c
            X.8fj r12 = new X.8fj
            r17 = r7
            r18 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r3.setAdapter(r12)
            X.7yf r3 = r6.A0B
            if (r3 != 0) goto L_0x008e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r11)
            throw r0
        L_0x008e:
            X.00s r9 = r3.A02
            X.0Ab r7 = r6.A0m()
            X.AnV r6 = new X.AnV
            r6.<init>(r4, r12, r0)
            r3 = 33
            goto L_0x010f
        L_0x009c:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00a3:
            java.lang.String r0 = "waContactNames"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00aa:
            java.lang.String r0 = "anonymousProfilePicLoader"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00b1:
            java.lang.String r0 = "contactPhotos"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00b8:
            com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet r8 = r0.A01
            X.7yf r9 = r8.A0B
            if (r9 != 0) goto L_0x00c3
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r11)
            throw r0
        L_0x00c3:
            java.util.List r6 = r8.A0C
            int r6 = r6.size()
            r19 = 1
            if (r6 > r7) goto L_0x00cf
            r19 = 0
        L_0x00cf:
            X.0Ab r13 = r8.A0m()
            X.1Pn r7 = r8.A07
            if (r7 == 0) goto L_0x0149
            android.content.Context r6 = r8.A0a()
            X.1RY r14 = r7.A05(r6, r10)
            X.3ET r7 = r8.A0A
            if (r7 == 0) goto L_0x0142
            X.0ts r15 = r8.A08
            if (r15 == 0) goto L_0x013d
            X.1GQ r6 = r8.A09
            if (r6 == 0) goto L_0x0136
            X.8fi r12 = new X.8fi
            r17 = r7
            r18 = r9
            r16 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r3.setAdapter(r12)
            X.7yf r3 = r8.A0B
            if (r3 != 0) goto L_0x0102
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r11)
            throw r0
        L_0x0102:
            X.00s r9 = r3.A00
            X.0Ab r7 = r8.A0m()
            X.AnU r6 = new X.AnU
            r6.<init>(r4, r12, r0)
            r3 = 32
        L_0x010f:
            X.BA8.A01(r7, r9, r6, r3)
        L_0x0112:
            com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet r6 = r0.A01
            X.7yf r4 = r6.A0B
            if (r4 != 0) goto L_0x011d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r11)
            throw r0
        L_0x011d:
            X.0Ab r3 = r6.A0m()
            androidx.lifecycle.LifecycleCoroutineScopeImpl r3 = X.C33311f5.A00(r3)
            r12 = 0
            com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet$TabsPagerAdapter$instantiateItem$3$1 r7 = new com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet$TabsPagerAdapter$instantiateItem$3$1
            r8 = r1
            r9 = r0
            r10 = r6
            r11 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            X.C36331k8.A1T(r7, r3)
            r5.addView(r2)
            return r2
        L_0x0136:
            java.lang.String r0 = "newsletterConfig"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x013d:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        L_0x0142:
            java.lang.String r0 = "anonymousProfilePicLoader"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0149:
            java.lang.String r0 = "contactPhotos"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass80R.A0I(android.view.ViewGroup, int):java.lang.Object");
    }

    public void A0J(ViewGroup viewGroup, Object obj, int i) {
        C36321k7.A0v(viewGroup, 0, obj);
        viewGroup.removeView((View) obj);
    }

    public AnonymousClass80R(NewsletterReactionsSheet newsletterReactionsSheet) {
        this.A01 = newsletterReactionsSheet;
    }

    public int A0H() {
        return this.A00.size();
    }

    public static final void A00(WaTextView waTextView, AnonymousClass80R r10, long j) {
        String str;
        Resources resources;
        Context context = waTextView.getContext();
        int i = 1;
        if (context == null || (resources = context.getResources()) == null) {
            str = null;
        } else {
            long j2 = j;
            if (j > 100) {
                j2 = 100;
            }
            str = resources.getQuantityString(R.plurals.f10nameremoved, (int) j2, new Object[]{waTextView.getWhatsAppLocale().A0M().format(j)});
        }
        waTextView.setText(str);
        C33511fU.A03(waTextView);
        boolean z = true;
        if (r10.A00.size() > 1) {
            z = false;
            i = 8388611;
        }
        waTextView.setGravity(i | 16);
        Resources resources2 = waTextView.getResources();
        int i2 = R.dimen.f7nameremoved;
        if (z) {
            i2 = R.dimen.f7nameremoved;
        }
        waTextView.setTextSize(0, resources2.getDimension(i2));
    }

    public boolean A0K(View view, Object obj) {
        C36321k7.A0w(view, obj);
        return view.equals(obj);
    }
}
