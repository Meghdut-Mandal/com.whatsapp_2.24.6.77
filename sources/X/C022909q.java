package X;

import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.09q  reason: invalid class name and case insensitive filesystem */
public class C022909q {
    public int A00 = -1;
    public boolean A01 = false;
    public final AnonymousClass02E A02;
    public final AnonymousClass025 A03;
    public final AnonymousClass021 A04;

    public static Bundle A00(C022909q r4) {
        Bundle bundle = new Bundle();
        AnonymousClass02E r2 = r4.A02;
        r2.A0u(bundle);
        r4.A03.A01(bundle, r2);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (r2.A0F != null) {
            r4.A02();
        }
        if (r2.A0D != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", r2.A0D);
        }
        if (r2.A0C != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", r2.A0C);
        }
        if (!r2.A0l) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", r2.A0l);
        }
        return bundle;
    }

    public void A01() {
        AnonymousClass02E r5 = this.A02;
        if (r5.A0b && r5.A0e && !r5.A0h) {
            if (AnonymousClass01z.A0E(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(r5);
                Log.d("FragmentManager", sb.toString());
            }
            LayoutInflater A1E = r5.A1E(r5.A0B);
            r5.A0E = A1E;
            r5.A0w(r5.A0B, A1E, (ViewGroup) null);
            View view = r5.A0F;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                r5.A0F.setTag(R.id.fragment_container_view_tag, r5);
                if (r5.A0d) {
                    r5.A0F.setVisibility(8);
                }
                r5.A1S(r5.A0B, r5.A0F);
                AnonymousClass01z.A09(r5.A0L, 2);
                this.A03.A00(r5.A0B, r5.A0F, r5, false);
                r5.A08 = 2;
            }
        }
    }

    public void A02() {
        AnonymousClass02E r2 = this.A02;
        if (r2.A0F != null) {
            if (AnonymousClass01z.A0E(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Saving view state for fragment ");
                sb.append(r2);
                sb.append(" with view ");
                sb.append(r2.A0F);
                Log.v("FragmentManager", sb.toString());
            }
            SparseArray sparseArray = new SparseArray();
            r2.A0F.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                r2.A0D = sparseArray;
            }
            Bundle bundle = new Bundle();
            r2.A0N.A01.A02(bundle);
            if (!bundle.isEmpty()) {
                r2.A0C = bundle;
            }
        }
    }

    public void A03() {
        int i;
        View view;
        View view2;
        AnonymousClass021 r0 = this.A04;
        AnonymousClass02E r6 = this.A02;
        ViewGroup viewGroup = r6.A0G;
        if (viewGroup != null) {
            ArrayList arrayList = r0.A01;
            int indexOf = arrayList.indexOf(r6);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AnonymousClass02E r1 = (AnonymousClass02E) arrayList.get(indexOf);
                        if (r1.A0G == viewGroup && (view = r1.A0F) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AnonymousClass02E r12 = (AnonymousClass02E) arrayList.get(i2);
                    if (r12.A0G == viewGroup && (view2 = r12.A0F) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
            r6.A0G.addView(r6.A0F, i);
        }
        i = -1;
        r6.A0G.addView(r6.A0F, i);
    }

    public void A05(ClassLoader classLoader) {
        boolean z;
        AnonymousClass02E r3 = this.A02;
        Bundle bundle = r3.A0B;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            r3.A0D = r3.A0B.getSparseParcelableArray("android:view_state");
            r3.A0C = r3.A0B.getBundle("android:view_registry_state");
            String string = r3.A0B.getString("android:target_state");
            r3.A0V = string;
            if (string != null) {
                r3.A09 = r3.A0B.getInt("android:target_req_state", 0);
            }
            Boolean bool = r3.A01;
            if (bool != null) {
                z = bool.booleanValue();
                r3.A0l = z;
                r3.A01 = null;
            } else {
                z = r3.A0B.getBoolean("android:user_visible_hint", true);
                r3.A0l = z;
            }
            if (!z) {
                r3.A0Z = true;
            }
        }
    }

    public C022909q(AnonymousClass02E r4, AnonymousClass025 r5, C08820bN r6, AnonymousClass021 r7) {
        String str;
        this.A03 = r5;
        this.A04 = r7;
        this.A02 = r4;
        r4.A0D = null;
        r4.A0C = null;
        r4.A04 = 0;
        r4.A0e = false;
        r4.A0X = false;
        AnonymousClass02E r0 = r4.A0J;
        if (r0 != null) {
            str = r0.A0W;
        } else {
            str = null;
        }
        r4.A0V = str;
        r4.A0J = null;
        Bundle bundle = r6.A00;
        r4.A0B = bundle == null ? new Bundle() : bundle;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04d6, code lost:
        r3.A08 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04db, code lost:
        r3.A08 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x05eb, code lost:
        r3.A08 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x06a5, code lost:
        if (r3.A04 > 0) goto L_0x06a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x003d, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098 A[Catch:{ all -> 0x0ad3 }, LOOP:1: B:27:0x0092->B:29:0x0098, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f0 A[Catch:{ all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0856 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r15 = this;
            boolean r0 = r15.A01
            r6 = 2
            java.lang.String r5 = "FragmentManager"
            if (r0 == 0) goto L_0x0024
            boolean r0 = X.AnonymousClass01z.A0E(r6)
            if (r0 == 0) goto L_0x0023
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Ignoring re-entrant call to moveToExpectedState() for "
            r1.append(r0)
            X.02E r0 = r15.A02
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r5, r0)
        L_0x0023:
            return
        L_0x0024:
            r2 = 0
            r4 = 1
            r15.A01 = r4     // Catch:{ all -> 0x0ad3 }
            r14 = 0
        L_0x0029:
            X.02E r3 = r15.A02     // Catch:{ all -> 0x0ad3 }
            X.01z r0 = r3.A0M     // Catch:{ all -> 0x0ad3 }
            if (r0 != 0) goto L_0x0755
            int r8 = r3.A08     // Catch:{ all -> 0x0ad3 }
        L_0x0031:
            int r1 = r3.A08     // Catch:{ all -> 0x0ad3 }
            r7 = 3
            if (r8 == r1) goto L_0x0a0b
            if (r8 <= r1) goto L_0x043e
            int r0 = r1 + 1
            switch(r0) {
                case 0: goto L_0x003f;
                case 1: goto L_0x023a;
                case 2: goto L_0x011a;
                case 3: goto L_0x0290;
                case 4: goto L_0x01fc;
                case 5: goto L_0x0325;
                case 6: goto L_0x0237;
                case 7: goto L_0x037c;
                default: goto L_0x003d;
            }     // Catch:{ all -> 0x0ad3 }
        L_0x003d:
            r14 = 1
            goto L_0x0029
        L_0x003f:
            boolean r0 = X.AnonymousClass01z.A0E(r7)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0059
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "moveto ATTACHED: "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x0059:
            X.02E r1 = r3.A0J     // Catch:{ all -> 0x0ad3 }
            java.lang.String r8 = " that does not belong to this FragmentManager!"
            java.lang.String r9 = " declared target fragment "
            java.lang.String r7 = "Fragment "
            r10 = 0
            if (r1 == 0) goto L_0x00a2
            X.021 r0 = r15.A04     // Catch:{ all -> 0x0ad3 }
            java.lang.String r1 = r1.A0W     // Catch:{ all -> 0x0ad3 }
            java.util.HashMap r0 = r0.A02     // Catch:{ all -> 0x0ad3 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0ad3 }
            X.09q r1 = (X.C022909q) r1     // Catch:{ all -> 0x0ad3 }
            if (r1 == 0) goto L_0x0871
            X.02E r0 = r3.A0J     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r0.A0W     // Catch:{ all -> 0x0ad3 }
            r3.A0V = r0     // Catch:{ all -> 0x0ad3 }
            r3.A0J = r10     // Catch:{ all -> 0x0ad3 }
        L_0x007a:
            r1.A04()     // Catch:{ all -> 0x0ad3 }
        L_0x007d:
            X.01z r1 = r3.A0M     // Catch:{ all -> 0x0ad3 }
            X.01y r0 = r1.A07     // Catch:{ all -> 0x0ad3 }
            r3.A0K = r0     // Catch:{ all -> 0x0ad3 }
            X.02E r0 = r1.A05     // Catch:{ all -> 0x0ad3 }
            r3.A0I = r0     // Catch:{ all -> 0x0ad3 }
            X.025 r8 = r15.A03     // Catch:{ all -> 0x0ad3 }
            r8.A07(r3)     // Catch:{ all -> 0x0ad3 }
            java.util.ArrayList r9 = r3.A0m     // Catch:{ all -> 0x0ad3 }
            java.util.Iterator r1 = r9.iterator()     // Catch:{ all -> 0x0ad3 }
        L_0x0092:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0ad3 }
            X.09b r0 = (X.C021409b) r0     // Catch:{ all -> 0x0ad3 }
            r0.A00()     // Catch:{ all -> 0x0ad3 }
            goto L_0x0092
        L_0x00a2:
            java.lang.String r1 = r3.A0V     // Catch:{ all -> 0x0ad3 }
            if (r1 == 0) goto L_0x007d
            X.021 r0 = r15.A04     // Catch:{ all -> 0x0ad3 }
            java.util.HashMap r0 = r0.A02     // Catch:{ all -> 0x0ad3 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0ad3 }
            X.09q r1 = (X.C022909q) r1     // Catch:{ all -> 0x0ad3 }
            if (r1 != 0) goto L_0x007a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            r1.append(r7)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            r1.append(r9)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r3.A0V     // Catch:{ all -> 0x0ad3 }
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r8)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0ad3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0a0a
        L_0x00d3:
            r9.clear()     // Catch:{ all -> 0x0ad3 }
            X.01z r9 = r3.A0L     // Catch:{ all -> 0x0ad3 }
            X.01y r1 = r3.A0K     // Catch:{ all -> 0x0ad3 }
            X.01w r0 = r3.A0j()     // Catch:{ all -> 0x0ad3 }
            r9.A0g(r3, r1, r0)     // Catch:{ all -> 0x0ad3 }
            r3.A08 = r2     // Catch:{ all -> 0x0ad3 }
            r3.A0Y = r2     // Catch:{ all -> 0x0ad3 }
            X.01y r0 = r3.A0K     // Catch:{ all -> 0x0ad3 }
            android.content.Context r0 = r0.A01     // Catch:{ all -> 0x0ad3 }
            r3.A1O(r0)     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r3.A0Y     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0856
            X.01z r7 = r3.A0M     // Catch:{ all -> 0x0ad3 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r7.A0Y     // Catch:{ all -> 0x0ad3 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0ad3 }
        L_0x00f8:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0108
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0ad3 }
            X.01x r0 = (X.C004301x) r0     // Catch:{ all -> 0x0ad3 }
            r0.BRR(r3, r7)     // Catch:{ all -> 0x0ad3 }
            goto L_0x00f8
        L_0x0108:
            X.01z r1 = r3.A0L     // Catch:{ all -> 0x0ad3 }
            r1.A0I = r2     // Catch:{ all -> 0x0ad3 }
            r1.A0J = r2     // Catch:{ all -> 0x0ad3 }
            X.04X r0 = r1.A09     // Catch:{ all -> 0x0ad3 }
            r0.A01 = r2     // Catch:{ all -> 0x0ad3 }
            X.AnonymousClass01z.A09(r1, r2)     // Catch:{ all -> 0x0ad3 }
            r8.A05(r3)     // Catch:{ all -> 0x0ad3 }
            goto L_0x003d
        L_0x011a:
            r15.A01()     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r3.A0b     // Catch:{ all -> 0x0ad3 }
            if (r0 != 0) goto L_0x003d
            boolean r0 = X.AnonymousClass01z.A0E(r7)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x013b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "moveto CREATE_VIEW: "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x013b:
            android.os.Bundle r0 = r3.A0B     // Catch:{ all -> 0x0ad3 }
            android.view.LayoutInflater r10 = r3.A1E(r0)     // Catch:{ all -> 0x0ad3 }
            r3.A0E = r10     // Catch:{ all -> 0x0ad3 }
            r9 = 0
            android.view.ViewGroup r0 = r3.A0G     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x014a
            r9 = r0
            goto L_0x0190
        L_0x014a:
            int r1 = r3.A05     // Catch:{ all -> 0x0ad3 }
            if (r1 == 0) goto L_0x0190
            r0 = -1
            if (r1 == r0) goto L_0x08d1
            X.01z r0 = r3.A0M     // Catch:{ all -> 0x0ad3 }
            X.01w r0 = r0.A08     // Catch:{ all -> 0x0ad3 }
            android.view.View r9 = r0.A00(r1)     // Catch:{ all -> 0x0ad3 }
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9     // Catch:{ all -> 0x0ad3 }
            if (r9 != 0) goto L_0x0163
            boolean r0 = r3.A0j     // Catch:{ all -> 0x0ad3 }
            if (r0 != 0) goto L_0x0190
            goto L_0x0892
        L_0x0163:
            boolean r0 = r9 instanceof androidx.fragment.app.FragmentContainerView     // Catch:{ all -> 0x0ad3 }
            if (r0 != 0) goto L_0x0190
            X.09h r0 = X.C022009h.A01     // Catch:{ all -> 0x0ad3 }
            X.0Aa r8 = new X.0Aa     // Catch:{ all -> 0x0ad3 }
            r8.<init>(r9, r3)     // Catch:{ all -> 0x0ad3 }
            X.C022009h.A03(r8)     // Catch:{ all -> 0x0ad3 }
            X.09i r7 = X.C022009h.A00(r3)     // Catch:{ all -> 0x0ad3 }
            java.util.Set r1 = r7.A01     // Catch:{ all -> 0x0ad3 }
            X.09l r0 = X.C022409l.DETECT_WRONG_FRAGMENT_CONTAINER     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0190
            java.lang.Class r1 = r3.getClass()     // Catch:{ all -> 0x0ad3 }
            java.lang.Class r0 = r8.getClass()     // Catch:{ all -> 0x0ad3 }
            boolean r0 = X.C022009h.A04(r7, r1, r0)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0190
            X.C022009h.A02(r7, r8)     // Catch:{ all -> 0x0ad3 }
        L_0x0190:
            r3.A0G = r9     // Catch:{ all -> 0x0ad3 }
            android.os.Bundle r0 = r3.A0B     // Catch:{ all -> 0x0ad3 }
            r3.A0w(r0, r10, r9)     // Catch:{ all -> 0x0ad3 }
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x04d6
            r0.setSaveFromParentEnabled(r2)     // Catch:{ all -> 0x0ad3 }
            android.view.View r1 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            r0 = 2131430413(0x7f0b0c0d, float:1.8482526E38)
            r1.setTag(r0, r3)     // Catch:{ all -> 0x0ad3 }
            if (r9 == 0) goto L_0x01ab
            r15.A03()     // Catch:{ all -> 0x0ad3 }
        L_0x01ab:
            boolean r0 = r3.A0d     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x01b6
            android.view.View r1 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            r0 = 8
            r1.setVisibility(r0)     // Catch:{ all -> 0x0ad3 }
        L_0x01b6:
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            boolean r0 = X.C011304x.A02(r0)     // Catch:{ all -> 0x0ad3 }
            android.view.View r1 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x01ef
            X.AnonymousClass09G.A00(r1)     // Catch:{ all -> 0x0ad3 }
        L_0x01c3:
            android.view.View r1 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            android.os.Bundle r0 = r3.A0B     // Catch:{ all -> 0x0ad3 }
            r3.A1S(r0, r1)     // Catch:{ all -> 0x0ad3 }
            X.01z r0 = r3.A0L     // Catch:{ all -> 0x0ad3 }
            X.AnonymousClass01z.A09(r0, r6)     // Catch:{ all -> 0x0ad3 }
            X.025 r7 = r15.A03     // Catch:{ all -> 0x0ad3 }
            android.view.View r1 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            android.os.Bundle r0 = r3.A0B     // Catch:{ all -> 0x0ad3 }
            r7.A00(r0, r1, r3, r2)     // Catch:{ all -> 0x0ad3 }
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            int r7 = r0.getVisibility()     // Catch:{ all -> 0x0ad3 }
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            float r1 = r0.getAlpha()     // Catch:{ all -> 0x0ad3 }
            X.09r r0 = X.AnonymousClass02E.A01(r3)     // Catch:{ all -> 0x0ad3 }
            r0.A00 = r1     // Catch:{ all -> 0x0ad3 }
            android.view.ViewGroup r0 = r3.A0G     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x04d6
            goto L_0x01f8
        L_0x01ef:
            X.0t1 r0 = new X.0t1     // Catch:{ all -> 0x0ad3 }
            r0.<init>(r1, r15, r4)     // Catch:{ all -> 0x0ad3 }
            r1.addOnAttachStateChangeListener(r0)     // Catch:{ all -> 0x0ad3 }
            goto L_0x01c3
        L_0x01f8:
            if (r7 != 0) goto L_0x04d6
            goto L_0x04a0
        L_0x01fc:
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0234
            android.view.ViewGroup r0 = r3.A0G     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0234
            r3.A0l()     // Catch:{ all -> 0x0ad3 }
            X.0BU r8 = X.AnonymousClass0BU.A00(r0)     // Catch:{ all -> 0x0ad3 }
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            int r0 = r0.getVisibility()     // Catch:{ all -> 0x0ad3 }
            java.lang.Integer r7 = X.C02670Bj.A00(r0)     // Catch:{ all -> 0x0ad3 }
            boolean r0 = X.AnonymousClass01z.A0E(r6)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x022f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "SpecialEffectsController: Enqueuing add operation for fragment "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x022f:
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ all -> 0x0ad3 }
            X.AnonymousClass0BU.A02(r15, r8, r7, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x0234:
            r0 = 4
            goto L_0x04db
        L_0x0237:
            r0 = 6
            goto L_0x04db
        L_0x023a:
            boolean r0 = X.AnonymousClass01z.A0E(r7)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0254
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "moveto CREATED: "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x0254:
            boolean r0 = r3.A0f     // Catch:{ all -> 0x0ad3 }
            if (r0 != 0) goto L_0x05e6
            X.025 r8 = r15.A03     // Catch:{ all -> 0x0ad3 }
            android.os.Bundle r0 = r3.A0B     // Catch:{ all -> 0x0ad3 }
            r8.A04(r0, r3)     // Catch:{ all -> 0x0ad3 }
            android.os.Bundle r7 = r3.A0B     // Catch:{ all -> 0x0ad3 }
            X.01z r0 = r3.A0L     // Catch:{ all -> 0x0ad3 }
            r0.A0U()     // Catch:{ all -> 0x0ad3 }
            r3.A08 = r4     // Catch:{ all -> 0x0ad3 }
            r3.A0Y = r2     // Catch:{ all -> 0x0ad3 }
            X.01N r1 = r3.A0P     // Catch:{ all -> 0x0ad3 }
            androidx.fragment.app.Fragment$6 r0 = new androidx.fragment.app.Fragment$6     // Catch:{ all -> 0x0ad3 }
            r0.<init>(r3)     // Catch:{ all -> 0x0ad3 }
            r1.A04(r0)     // Catch:{ all -> 0x0ad3 }
            X.01T r0 = r3.A0R     // Catch:{ all -> 0x0ad3 }
            r0.A01(r7)     // Catch:{ all -> 0x0ad3 }
            r3.A1Q(r7)     // Catch:{ all -> 0x0ad3 }
            r3.A0f = r4     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r3.A0Y     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x08ee
            X.01N r1 = r3.A0P     // Catch:{ all -> 0x0ad3 }
            X.05R r0 = X.AnonymousClass05R.ON_CREATE     // Catch:{ all -> 0x0ad3 }
            r1.A06(r0)     // Catch:{ all -> 0x0ad3 }
            android.os.Bundle r0 = r3.A0B     // Catch:{ all -> 0x0ad3 }
            r8.A03(r0, r3)     // Catch:{ all -> 0x0ad3 }
            goto L_0x003d
        L_0x0290:
            boolean r0 = X.AnonymousClass01z.A0E(r7)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x02aa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "moveto ACTIVITY_CREATED: "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x02aa:
            android.os.Bundle r1 = r3.A0B     // Catch:{ all -> 0x0ad3 }
            X.01z r0 = r3.A0L     // Catch:{ all -> 0x0ad3 }
            r0.A0U()     // Catch:{ all -> 0x0ad3 }
            r3.A08 = r7     // Catch:{ all -> 0x0ad3 }
            r3.A0Y = r2     // Catch:{ all -> 0x0ad3 }
            r3.A1P(r1)     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r3.A0Y     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0928
            boolean r0 = X.AnonymousClass01z.A0E(r7)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x02d6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "moveto RESTORE_VIEW_STATE: "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x02d6:
            android.view.View r1 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            if (r1 == 0) goto L_0x030b
            android.os.Bundle r8 = r3.A0B     // Catch:{ all -> 0x0ad3 }
            android.util.SparseArray r0 = r3.A0D     // Catch:{ all -> 0x0ad3 }
            r7 = 0
            if (r0 == 0) goto L_0x02e6
            r1.restoreHierarchyState(r0)     // Catch:{ all -> 0x0ad3 }
            r3.A0D = r7     // Catch:{ all -> 0x0ad3 }
        L_0x02e6:
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x02f5
            X.0Ab r0 = r3.A0N     // Catch:{ all -> 0x0ad3 }
            android.os.Bundle r1 = r3.A0C     // Catch:{ all -> 0x0ad3 }
            X.01T r0 = r0.A01     // Catch:{ all -> 0x0ad3 }
            r0.A01(r1)     // Catch:{ all -> 0x0ad3 }
            r3.A0C = r7     // Catch:{ all -> 0x0ad3 }
        L_0x02f5:
            r3.A0Y = r2     // Catch:{ all -> 0x0ad3 }
            r3.A1A(r8)     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r3.A0Y     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x090b
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x030b
            X.0Ab r0 = r3.A0N     // Catch:{ all -> 0x0ad3 }
            X.05R r1 = X.AnonymousClass05R.ON_CREATE     // Catch:{ all -> 0x0ad3 }
            X.01N r0 = r0.A00     // Catch:{ all -> 0x0ad3 }
            r0.A06(r1)     // Catch:{ all -> 0x0ad3 }
        L_0x030b:
            r0 = 0
            r3.A0B = r0     // Catch:{ all -> 0x0ad3 }
            X.01z r1 = r3.A0L     // Catch:{ all -> 0x0ad3 }
            r1.A0I = r2     // Catch:{ all -> 0x0ad3 }
            r1.A0J = r2     // Catch:{ all -> 0x0ad3 }
            X.04X r0 = r1.A09     // Catch:{ all -> 0x0ad3 }
            r0.A01 = r2     // Catch:{ all -> 0x0ad3 }
            r0 = 4
            X.AnonymousClass01z.A09(r1, r0)     // Catch:{ all -> 0x0ad3 }
            X.025 r1 = r15.A03     // Catch:{ all -> 0x0ad3 }
            android.os.Bundle r0 = r3.A0B     // Catch:{ all -> 0x0ad3 }
            r1.A02(r0, r3)     // Catch:{ all -> 0x0ad3 }
            goto L_0x003d
        L_0x0325:
            boolean r0 = X.AnonymousClass01z.A0E(r7)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x033f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "moveto STARTED: "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x033f:
            X.01z r0 = r3.A0L     // Catch:{ all -> 0x0ad3 }
            r0.A0U()     // Catch:{ all -> 0x0ad3 }
            X.01z r0 = r3.A0L     // Catch:{ all -> 0x0ad3 }
            r0.A0q(r4)     // Catch:{ all -> 0x0ad3 }
            r0 = 5
            r3.A08 = r0     // Catch:{ all -> 0x0ad3 }
            r3.A0Y = r2     // Catch:{ all -> 0x0ad3 }
            r3.A1M()     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r3.A0Y     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0945
            X.01N r0 = r3.A0P     // Catch:{ all -> 0x0ad3 }
            X.05R r1 = X.AnonymousClass05R.ON_START     // Catch:{ all -> 0x0ad3 }
            r0.A06(r1)     // Catch:{ all -> 0x0ad3 }
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0367
            X.0Ab r0 = r3.A0N     // Catch:{ all -> 0x0ad3 }
            X.01N r0 = r0.A00     // Catch:{ all -> 0x0ad3 }
            r0.A06(r1)     // Catch:{ all -> 0x0ad3 }
        L_0x0367:
            X.01z r1 = r3.A0L     // Catch:{ all -> 0x0ad3 }
            r1.A0I = r2     // Catch:{ all -> 0x0ad3 }
            r1.A0J = r2     // Catch:{ all -> 0x0ad3 }
            X.04X r0 = r1.A09     // Catch:{ all -> 0x0ad3 }
            r0.A01 = r2     // Catch:{ all -> 0x0ad3 }
            r0 = 5
            X.AnonymousClass01z.A09(r1, r0)     // Catch:{ all -> 0x0ad3 }
            X.025 r0 = r15.A03     // Catch:{ all -> 0x0ad3 }
            r0.A08(r3)     // Catch:{ all -> 0x0ad3 }
            goto L_0x003d
        L_0x037c:
            boolean r0 = X.AnonymousClass01z.A0E(r7)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0396
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "moveto RESUMED: "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x0396:
            X.09r r0 = r3.A0H     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x03f4
            android.view.View r8 = r0.A06     // Catch:{ all -> 0x0ad3 }
            if (r8 == 0) goto L_0x03f4
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            if (r8 == r0) goto L_0x03b1
            android.view.ViewParent r1 = r8.getParent()     // Catch:{ all -> 0x0ad3 }
        L_0x03a6:
            if (r1 == 0) goto L_0x03f4
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            if (r1 == r0) goto L_0x03b1
            android.view.ViewParent r1 = r1.getParent()     // Catch:{ all -> 0x0ad3 }
            goto L_0x03a6
        L_0x03b1:
            boolean r7 = r8.requestFocus()     // Catch:{ all -> 0x0ad3 }
            boolean r0 = X.AnonymousClass01z.A0E(r6)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x03f4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "requestFocus: Restoring focused view "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r8)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            if (r7 == 0) goto L_0x03d2
            java.lang.String r0 = "succeeded"
            goto L_0x03d4
        L_0x03d2:
            java.lang.String r0 = "failed"
        L_0x03d4:
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = " on Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = " resulting in focused view "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            android.view.View r0 = r0.findFocus()     // Catch:{ all -> 0x0ad3 }
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x03f4:
            r7 = 0
            X.09r r0 = X.AnonymousClass02E.A01(r3)     // Catch:{ all -> 0x0ad3 }
            r0.A06 = r7     // Catch:{ all -> 0x0ad3 }
            X.01z r0 = r3.A0L     // Catch:{ all -> 0x0ad3 }
            r0.A0U()     // Catch:{ all -> 0x0ad3 }
            X.01z r0 = r3.A0L     // Catch:{ all -> 0x0ad3 }
            r0.A0q(r4)     // Catch:{ all -> 0x0ad3 }
            r0 = 7
            r3.A08 = r0     // Catch:{ all -> 0x0ad3 }
            r3.A0Y = r2     // Catch:{ all -> 0x0ad3 }
            r3.A1L()     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r3.A0Y     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x09ef
            X.01N r0 = r3.A0P     // Catch:{ all -> 0x0ad3 }
            X.05R r1 = X.AnonymousClass05R.ON_RESUME     // Catch:{ all -> 0x0ad3 }
            r0.A06(r1)     // Catch:{ all -> 0x0ad3 }
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0423
            X.0Ab r0 = r3.A0N     // Catch:{ all -> 0x0ad3 }
            X.01N r0 = r0.A00     // Catch:{ all -> 0x0ad3 }
            r0.A06(r1)     // Catch:{ all -> 0x0ad3 }
        L_0x0423:
            X.01z r1 = r3.A0L     // Catch:{ all -> 0x0ad3 }
            r1.A0I = r2     // Catch:{ all -> 0x0ad3 }
            r1.A0J = r2     // Catch:{ all -> 0x0ad3 }
            X.04X r0 = r1.A09     // Catch:{ all -> 0x0ad3 }
            r0.A01 = r2     // Catch:{ all -> 0x0ad3 }
            r0 = 7
            X.AnonymousClass01z.A09(r1, r0)     // Catch:{ all -> 0x0ad3 }
            X.025 r0 = r15.A03     // Catch:{ all -> 0x0ad3 }
            r0.A0D(r3, r2)     // Catch:{ all -> 0x0ad3 }
            r3.A0B = r7     // Catch:{ all -> 0x0ad3 }
            r3.A0D = r7     // Catch:{ all -> 0x0ad3 }
            r3.A0C = r7     // Catch:{ all -> 0x0ad3 }
            goto L_0x003d
        L_0x043e:
            int r1 = r1 - r4
            switch(r1) {
                case -1: goto L_0x04df;
                case 0: goto L_0x0683;
                case 1: goto L_0x0564;
                case 2: goto L_0x049d;
                case 3: goto L_0x0444;
                case 4: goto L_0x05ef;
                case 5: goto L_0x04da;
                case 6: goto L_0x063c;
                default: goto L_0x0442;
            }     // Catch:{ all -> 0x0ad3 }
        L_0x0442:
            goto L_0x003d
        L_0x0444:
            boolean r0 = X.AnonymousClass01z.A0E(r7)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x045e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "movefrom ACTIVITY_CREATED: "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x045e:
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0469
            android.util.SparseArray r0 = r3.A0D     // Catch:{ all -> 0x0ad3 }
            if (r0 != 0) goto L_0x0469
            r15.A02()     // Catch:{ all -> 0x0ad3 }
        L_0x0469:
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0499
            android.view.ViewGroup r0 = r3.A0G     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0499
            r3.A0l()     // Catch:{ all -> 0x0ad3 }
            X.0BU r8 = X.AnonymousClass0BU.A00(r0)     // Catch:{ all -> 0x0ad3 }
            boolean r0 = X.AnonymousClass01z.A0E(r6)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0492
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "SpecialEffectsController: Enqueuing remove operation for fragment "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x0492:
            java.lang.Integer r1 = X.C023109s.A00     // Catch:{ all -> 0x0ad3 }
            java.lang.Integer r0 = X.C023109s.A0C     // Catch:{ all -> 0x0ad3 }
            X.AnonymousClass0BU.A02(r15, r8, r1, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x0499:
            r3.A08 = r7     // Catch:{ all -> 0x0ad3 }
            goto L_0x003d
        L_0x049d:
            r3.A0e = r2     // Catch:{ all -> 0x0ad3 }
            goto L_0x04d6
        L_0x04a0:
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            android.view.View r7 = r0.findFocus()     // Catch:{ all -> 0x0ad3 }
            if (r7 == 0) goto L_0x04d0
            X.09r r0 = X.AnonymousClass02E.A01(r3)     // Catch:{ all -> 0x0ad3 }
            r0.A06 = r7     // Catch:{ all -> 0x0ad3 }
            boolean r0 = X.AnonymousClass01z.A0E(r6)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x04d0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "requestFocus: Saved focused view "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r7)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = " for Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x04d0:
            android.view.View r1 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            r0 = 0
            r1.setAlpha(r0)     // Catch:{ all -> 0x0ad3 }
        L_0x04d6:
            r3.A08 = r6     // Catch:{ all -> 0x0ad3 }
            goto L_0x003d
        L_0x04da:
            r0 = 5
        L_0x04db:
            r3.A08 = r0     // Catch:{ all -> 0x0ad3 }
            goto L_0x003d
        L_0x04df:
            boolean r0 = X.AnonymousClass01z.A0E(r7)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x04f9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "movefrom ATTACHED: "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x04f9:
            r0 = -1
            r3.A08 = r0     // Catch:{ all -> 0x0ad3 }
            r3.A0Y = r2     // Catch:{ all -> 0x0ad3 }
            r3.A19()     // Catch:{ all -> 0x0ad3 }
            r0 = 0
            r3.A0E = r0     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r3.A0Y     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0962
            X.01z r1 = r3.A0L     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r1.A0E     // Catch:{ all -> 0x0ad3 }
            if (r0 != 0) goto L_0x0518
            r1.A0S()     // Catch:{ all -> 0x0ad3 }
            X.020 r0 = new X.020     // Catch:{ all -> 0x0ad3 }
            r0.<init>()     // Catch:{ all -> 0x0ad3 }
            r3.A0L = r0     // Catch:{ all -> 0x0ad3 }
        L_0x0518:
            X.025 r0 = r15.A03     // Catch:{ all -> 0x0ad3 }
            r0.A0B(r3, r2)     // Catch:{ all -> 0x0ad3 }
            r0 = -1
            r3.A08 = r0     // Catch:{ all -> 0x0ad3 }
            r0 = 0
            r3.A0K = r0     // Catch:{ all -> 0x0ad3 }
            r3.A0I = r0     // Catch:{ all -> 0x0ad3 }
            r3.A0M = r0     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r3.A0i     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x052f
            int r0 = r3.A04     // Catch:{ all -> 0x0ad3 }
            if (r0 <= 0) goto L_0x0545
        L_0x052f:
            X.021 r0 = r15.A04     // Catch:{ all -> 0x0ad3 }
            X.04X r8 = r0.A00     // Catch:{ all -> 0x0ad3 }
            java.util.HashMap r1 = r8.A03     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r3.A0W     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r1.containsKey(r0)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0545
            boolean r0 = r8.A05     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0545
            boolean r0 = r8.A00     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x003d
        L_0x0545:
            boolean r0 = X.AnonymousClass01z.A0E(r7)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x055f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "initState called for fragment: "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x055f:
            r3.A0p()     // Catch:{ all -> 0x0ad3 }
            goto L_0x003d
        L_0x0564:
            boolean r0 = X.AnonymousClass01z.A0E(r7)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x057e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "movefrom CREATE_VIEW: "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x057e:
            android.view.ViewGroup r1 = r3.A0G     // Catch:{ all -> 0x0ad3 }
            if (r1 == 0) goto L_0x0589
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0589
            r1.removeView(r0)     // Catch:{ all -> 0x0ad3 }
        L_0x0589:
            X.01z r0 = r3.A0L     // Catch:{ all -> 0x0ad3 }
            X.AnonymousClass01z.A09(r0, r4)     // Catch:{ all -> 0x0ad3 }
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x05ac
            X.0Ab r0 = r3.A0N     // Catch:{ all -> 0x0ad3 }
            r0.A00()     // Catch:{ all -> 0x0ad3 }
            X.01N r0 = r0.A00     // Catch:{ all -> 0x0ad3 }
            X.01P r1 = r0.A02     // Catch:{ all -> 0x0ad3 }
            X.01P r0 = X.AnonymousClass01P.CREATED     // Catch:{ all -> 0x0ad3 }
            int r0 = r1.compareTo(r0)     // Catch:{ all -> 0x0ad3 }
            if (r0 < 0) goto L_0x05ac
            X.0Ab r0 = r3.A0N     // Catch:{ all -> 0x0ad3 }
            X.05R r1 = X.AnonymousClass05R.ON_DESTROY     // Catch:{ all -> 0x0ad3 }
            X.01N r0 = r0.A00     // Catch:{ all -> 0x0ad3 }
            r0.A06(r1)     // Catch:{ all -> 0x0ad3 }
        L_0x05ac:
            r3.A08 = r4     // Catch:{ all -> 0x0ad3 }
            r3.A0Y = r2     // Catch:{ all -> 0x0ad3 }
            r3.A1J()     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r3.A0Y     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x097f
            X.0Ye r0 = X.C07540Ye.A00(r3)     // Catch:{ all -> 0x0ad3 }
            X.0Hn r0 = r0.A01     // Catch:{ all -> 0x0ad3 }
            X.0fO r8 = r0.A00     // Catch:{ all -> 0x0ad3 }
            int r7 = r8.A00     // Catch:{ all -> 0x0ad3 }
            r1 = 0
        L_0x05c2:
            if (r1 >= r7) goto L_0x05d0
            java.lang.Object[] r0 = r8.A02     // Catch:{ all -> 0x0ad3 }
            r0 = r0[r1]     // Catch:{ all -> 0x0ad3 }
            X.0Hm r0 = (X.C03730Hm) r0     // Catch:{ all -> 0x0ad3 }
            r0.A0F()     // Catch:{ all -> 0x0ad3 }
            int r1 = r1 + 1
            goto L_0x05c2
        L_0x05d0:
            r3.A0h = r2     // Catch:{ all -> 0x0ad3 }
            X.025 r0 = r15.A03     // Catch:{ all -> 0x0ad3 }
            r0.A0A(r3)     // Catch:{ all -> 0x0ad3 }
            r1 = 0
            r3.A0G = r1     // Catch:{ all -> 0x0ad3 }
            r3.A0F = r1     // Catch:{ all -> 0x0ad3 }
            r3.A0N = r1     // Catch:{ all -> 0x0ad3 }
            X.00s r0 = r3.A0Q     // Catch:{ all -> 0x0ad3 }
            r0.A0D(r1)     // Catch:{ all -> 0x0ad3 }
            r3.A0e = r2     // Catch:{ all -> 0x0ad3 }
            goto L_0x05eb
        L_0x05e6:
            android.os.Bundle r0 = r3.A0B     // Catch:{ all -> 0x0ad3 }
            r3.A0v(r0)     // Catch:{ all -> 0x0ad3 }
        L_0x05eb:
            r3.A08 = r4     // Catch:{ all -> 0x0ad3 }
            goto L_0x003d
        L_0x05ef:
            boolean r0 = X.AnonymousClass01z.A0E(r7)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0609
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "movefrom STARTED: "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x0609:
            X.01z r1 = r3.A0L     // Catch:{ all -> 0x0ad3 }
            r1.A0J = r4     // Catch:{ all -> 0x0ad3 }
            X.04X r0 = r1.A09     // Catch:{ all -> 0x0ad3 }
            r0.A01 = r4     // Catch:{ all -> 0x0ad3 }
            r0 = 4
            X.AnonymousClass01z.A09(r1, r0)     // Catch:{ all -> 0x0ad3 }
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0622
            X.0Ab r0 = r3.A0N     // Catch:{ all -> 0x0ad3 }
            X.05R r1 = X.AnonymousClass05R.ON_STOP     // Catch:{ all -> 0x0ad3 }
            X.01N r0 = r0.A00     // Catch:{ all -> 0x0ad3 }
            r0.A06(r1)     // Catch:{ all -> 0x0ad3 }
        L_0x0622:
            X.01N r1 = r3.A0P     // Catch:{ all -> 0x0ad3 }
            X.05R r0 = X.AnonymousClass05R.ON_STOP     // Catch:{ all -> 0x0ad3 }
            r1.A06(r0)     // Catch:{ all -> 0x0ad3 }
            r0 = 4
            r3.A08 = r0     // Catch:{ all -> 0x0ad3 }
            r3.A0Y = r2     // Catch:{ all -> 0x0ad3 }
            r3.A1B()     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r3.A0Y     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x099b
            X.025 r0 = r15.A03     // Catch:{ all -> 0x0ad3 }
            r0.A09(r3)     // Catch:{ all -> 0x0ad3 }
            goto L_0x003d
        L_0x063c:
            boolean r0 = X.AnonymousClass01z.A0E(r7)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0656
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "movefrom RESUMED: "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x0656:
            X.01z r1 = r3.A0L     // Catch:{ all -> 0x0ad3 }
            r0 = 5
            X.AnonymousClass01z.A09(r1, r0)     // Catch:{ all -> 0x0ad3 }
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0669
            X.0Ab r0 = r3.A0N     // Catch:{ all -> 0x0ad3 }
            X.05R r1 = X.AnonymousClass05R.ON_PAUSE     // Catch:{ all -> 0x0ad3 }
            X.01N r0 = r0.A00     // Catch:{ all -> 0x0ad3 }
            r0.A06(r1)     // Catch:{ all -> 0x0ad3 }
        L_0x0669:
            X.01N r1 = r3.A0P     // Catch:{ all -> 0x0ad3 }
            X.05R r0 = X.AnonymousClass05R.ON_PAUSE     // Catch:{ all -> 0x0ad3 }
            r1.A06(r0)     // Catch:{ all -> 0x0ad3 }
            r0 = 6
            r3.A08 = r0     // Catch:{ all -> 0x0ad3 }
            r3.A0Y = r2     // Catch:{ all -> 0x0ad3 }
            r3.A1K()     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r3.A0Y     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x09b7
            X.025 r0 = r15.A03     // Catch:{ all -> 0x0ad3 }
            r0.A0C(r3, r2)     // Catch:{ all -> 0x0ad3 }
            goto L_0x003d
        L_0x0683:
            boolean r0 = X.AnonymousClass01z.A0E(r7)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x069d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "movefrom CREATED: "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x069d:
            boolean r0 = r3.A0i     // Catch:{ all -> 0x0ad3 }
            r7 = 1
            if (r0 == 0) goto L_0x06a7
            int r0 = r3.A04     // Catch:{ all -> 0x0ad3 }
            r11 = 1
            if (r0 <= 0) goto L_0x06a8
        L_0x06a7:
            r11 = 0
        L_0x06a8:
            r10 = 0
            if (r11 == 0) goto L_0x06ac
            goto L_0x06d6
        L_0x06ac:
            X.021 r8 = r15.A04     // Catch:{ all -> 0x0ad3 }
            X.04X r9 = r8.A00     // Catch:{ all -> 0x0ad3 }
            java.util.HashMap r1 = r9.A03     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r3.A0W     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r1.containsKey(r0)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x06df
            boolean r0 = r9.A05     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x06df
            boolean r0 = r9.A00     // Catch:{ all -> 0x0ad3 }
            if (r0 != 0) goto L_0x06df
            java.lang.String r0 = r3.A0V     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x06d2
            X.02E r1 = r8.A00(r0)     // Catch:{ all -> 0x0ad3 }
            if (r1 == 0) goto L_0x06d2
            boolean r0 = r1.A0k     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x06d2
            r3.A0J = r1     // Catch:{ all -> 0x0ad3 }
        L_0x06d2:
            r3.A08 = r2     // Catch:{ all -> 0x0ad3 }
            goto L_0x003d
        L_0x06d6:
            X.021 r8 = r15.A04     // Catch:{ all -> 0x0ad3 }
            java.lang.String r1 = r3.A0W     // Catch:{ all -> 0x0ad3 }
            java.util.HashMap r0 = r8.A03     // Catch:{ all -> 0x0ad3 }
            r0.remove(r1)     // Catch:{ all -> 0x0ad3 }
        L_0x06df:
            X.01y r1 = r3.A0K     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r1 instanceof X.AnonymousClass016     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x06ea
            X.04X r0 = r8.A00     // Catch:{ all -> 0x0ad3 }
            boolean r7 = r0.A00     // Catch:{ all -> 0x0ad3 }
            goto L_0x06f8
        L_0x06ea:
            android.content.Context r1 = r1.A01     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r1 instanceof android.app.Activity     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x06f8
            android.app.Activity r1 = (android.app.Activity) r1     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r1.isChangingConfigurations()     // Catch:{ all -> 0x0ad3 }
            r7 = r0 ^ 1
        L_0x06f8:
            if (r11 != 0) goto L_0x06fc
            if (r7 == 0) goto L_0x0701
        L_0x06fc:
            X.04X r0 = r8.A00     // Catch:{ all -> 0x0ad3 }
            r0.A0T(r3)     // Catch:{ all -> 0x0ad3 }
        L_0x0701:
            X.01z r0 = r3.A0L     // Catch:{ all -> 0x0ad3 }
            r0.A0S()     // Catch:{ all -> 0x0ad3 }
            X.01N r1 = r3.A0P     // Catch:{ all -> 0x0ad3 }
            X.05R r0 = X.AnonymousClass05R.ON_DESTROY     // Catch:{ all -> 0x0ad3 }
            r1.A06(r0)     // Catch:{ all -> 0x0ad3 }
            r3.A08 = r2     // Catch:{ all -> 0x0ad3 }
            r3.A0Y = r2     // Catch:{ all -> 0x0ad3 }
            r3.A0f = r2     // Catch:{ all -> 0x0ad3 }
            r3.A1H()     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r3.A0Y     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x09d3
            X.025 r0 = r15.A03     // Catch:{ all -> 0x0ad3 }
            r0.A06(r3)     // Catch:{ all -> 0x0ad3 }
            java.util.ArrayList r0 = r8.A02()     // Catch:{ all -> 0x0ad3 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0ad3 }
        L_0x0727:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0746
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0ad3 }
            X.09q r0 = (X.C022909q) r0     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0727
            X.02E r7 = r0.A02     // Catch:{ all -> 0x0ad3 }
            java.lang.String r1 = r3.A0W     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r7.A0V     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0727
            r7.A0J = r3     // Catch:{ all -> 0x0ad3 }
            r7.A0V = r10     // Catch:{ all -> 0x0ad3 }
            goto L_0x0727
        L_0x0746:
            java.lang.String r0 = r3.A0V     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0750
            X.02E r0 = r8.A00(r0)     // Catch:{ all -> 0x0ad3 }
            r3.A0J = r0     // Catch:{ all -> 0x0ad3 }
        L_0x0750:
            r8.A07(r15)     // Catch:{ all -> 0x0ad3 }
            goto L_0x003d
        L_0x0755:
            int r8 = r15.A00     // Catch:{ all -> 0x0ad3 }
            r11 = r8
            X.01P r0 = r3.A0O     // Catch:{ all -> 0x0ad3 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0ad3 }
            r9 = -1
            r7 = 5
            r10 = 3
            r1 = 4
            if (r0 == r1) goto L_0x077d
            if (r0 == r10) goto L_0x0774
            if (r0 == r6) goto L_0x076f
            if (r0 == r4) goto L_0x0779
            int r8 = java.lang.Math.min(r8, r9)     // Catch:{ all -> 0x0ad3 }
            goto L_0x077d
        L_0x076f:
            int r8 = java.lang.Math.min(r8, r4)     // Catch:{ all -> 0x0ad3 }
            goto L_0x077d
        L_0x0774:
            int r8 = java.lang.Math.min(r8, r7)     // Catch:{ all -> 0x0ad3 }
            goto L_0x077d
        L_0x0779:
            int r8 = java.lang.Math.min(r8, r2)     // Catch:{ all -> 0x0ad3 }
        L_0x077d:
            boolean r0 = r3.A0b     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0797
            boolean r0 = r3.A0e     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x07ec
            int r8 = java.lang.Math.max(r11, r6)     // Catch:{ all -> 0x0ad3 }
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0797
            android.view.ViewParent r0 = r0.getParent()     // Catch:{ all -> 0x0ad3 }
            if (r0 != 0) goto L_0x0797
            int r8 = java.lang.Math.min(r8, r6)     // Catch:{ all -> 0x0ad3 }
        L_0x0797:
            boolean r0 = r3.A0X     // Catch:{ all -> 0x0ad3 }
            if (r0 != 0) goto L_0x079f
            int r8 = java.lang.Math.min(r8, r4)     // Catch:{ all -> 0x0ad3 }
        L_0x079f:
            r11 = 0
            android.view.ViewGroup r0 = r3.A0G     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0802
            r3.A0l()     // Catch:{ all -> 0x0ad3 }
            X.0BU r12 = X.AnonymousClass0BU.A00(r0)     // Catch:{ all -> 0x0ad3 }
            java.util.ArrayList r0 = r12.A03     // Catch:{ all -> 0x0ad3 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x0ad3 }
        L_0x07b1:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x07ea
            java.lang.Object r11 = r13.next()     // Catch:{ all -> 0x0ad3 }
            X.0Bl r11 = (X.AnonymousClass0Bl) r11     // Catch:{ all -> 0x0ad3 }
            X.02E r0 = r11.A04     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x07b1
            boolean r0 = r11.A02     // Catch:{ all -> 0x0ad3 }
            if (r0 != 0) goto L_0x07b1
            java.lang.Integer r11 = r11.A01     // Catch:{ all -> 0x0ad3 }
        L_0x07cb:
            java.util.ArrayList r0 = r12.A04     // Catch:{ all -> 0x0ad3 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x0ad3 }
        L_0x07d1:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0802
            java.lang.Object r12 = r13.next()     // Catch:{ all -> 0x0ad3 }
            X.0Bl r12 = (X.AnonymousClass0Bl) r12     // Catch:{ all -> 0x0ad3 }
            X.02E r0 = r12.A04     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x07d1
            boolean r0 = r12.A02     // Catch:{ all -> 0x0ad3 }
            if (r0 != 0) goto L_0x07d1
            goto L_0x07fa
        L_0x07ea:
            r11 = 0
            goto L_0x07cb
        L_0x07ec:
            if (r11 >= r1) goto L_0x07f5
            int r0 = r3.A08     // Catch:{ all -> 0x0ad3 }
            int r8 = java.lang.Math.min(r8, r0)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0797
        L_0x07f5:
            int r8 = java.lang.Math.min(r8, r4)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0797
        L_0x07fa:
            if (r11 == 0) goto L_0x0800
            java.lang.Integer r0 = X.C023109s.A00     // Catch:{ all -> 0x0ad3 }
            if (r11 != r0) goto L_0x0802
        L_0x0800:
            java.lang.Integer r11 = r12.A01     // Catch:{ all -> 0x0ad3 }
        L_0x0802:
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ all -> 0x0ad3 }
            if (r11 != r0) goto L_0x083b
            r0 = 6
            int r8 = java.lang.Math.min(r8, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x080b:
            boolean r0 = r3.A0Z     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0817
            int r0 = r3.A08     // Catch:{ all -> 0x0ad3 }
            if (r0 >= r7) goto L_0x0817
            int r8 = java.lang.Math.min(r8, r1)     // Catch:{ all -> 0x0ad3 }
        L_0x0817:
            boolean r0 = X.AnonymousClass01z.A0E(r6)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0031
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "computeExpectedState() of "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r8)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = " for "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0031
        L_0x083b:
            java.lang.Integer r0 = X.C023109s.A0C     // Catch:{ all -> 0x0ad3 }
            if (r11 != r0) goto L_0x0844
            int r8 = java.lang.Math.max(r8, r10)     // Catch:{ all -> 0x0ad3 }
            goto L_0x080b
        L_0x0844:
            boolean r0 = r3.A0i     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x080b
            int r0 = r3.A04     // Catch:{ all -> 0x0ad3 }
            if (r0 <= 0) goto L_0x0851
            int r8 = java.lang.Math.min(r8, r4)     // Catch:{ all -> 0x0ad3 }
            goto L_0x080b
        L_0x0851:
            int r8 = java.lang.Math.min(r8, r9)     // Catch:{ all -> 0x0ad3 }
            goto L_0x080b
        L_0x0856:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            r1.append(r7)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = " did not call through to super.onAttach()"
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            X.0EA r1 = new X.0EA     // Catch:{ all -> 0x0ad3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0a0a
        L_0x0871:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            r1.append(r7)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            r1.append(r9)     // Catch:{ all -> 0x0ad3 }
            X.02E r0 = r3.A0J     // Catch:{ all -> 0x0ad3 }
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r8)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0ad3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0a0a
        L_0x0892:
            android.content.Context r0 = r3.A0a()     // Catch:{ NotFoundException -> 0x08a1 }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ NotFoundException -> 0x08a1 }
            int r0 = r3.A05     // Catch:{ NotFoundException -> 0x08a1 }
            java.lang.String r4 = r1.getResourceName(r0)     // Catch:{ NotFoundException -> 0x08a1 }
            goto L_0x08a3
        L_0x08a1:
            java.lang.String r4 = "unknown"
        L_0x08a3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "No view found for id 0x"
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            int r0 = r3.A05     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = " ("
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r4)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = ") for fragment "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0ad3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0a0a
        L_0x08d1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "Cannot create fragment "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = " for a container view with no id"
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0ad3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0a0a
        L_0x08ee:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = " did not call through to super.onCreate()"
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            X.0EA r1 = new X.0EA     // Catch:{ all -> 0x0ad3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0a0a
        L_0x090b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = " did not call through to super.onViewStateRestored()"
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            X.0EA r1 = new X.0EA     // Catch:{ all -> 0x0ad3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0a0a
        L_0x0928:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = " did not call through to super.onActivityCreated()"
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            X.0EA r1 = new X.0EA     // Catch:{ all -> 0x0ad3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0a0a
        L_0x0945:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = " did not call through to super.onStart()"
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            X.0EA r1 = new X.0EA     // Catch:{ all -> 0x0ad3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0a0a
        L_0x0962:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = " did not call through to super.onDetach()"
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            X.0EA r1 = new X.0EA     // Catch:{ all -> 0x0ad3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0a0a
        L_0x097f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = " did not call through to super.onDestroyView()"
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            X.0EA r1 = new X.0EA     // Catch:{ all -> 0x0ad3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0a0a
        L_0x099b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = " did not call through to super.onStop()"
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            X.0EA r1 = new X.0EA     // Catch:{ all -> 0x0ad3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0a0a
        L_0x09b7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = " did not call through to super.onPause()"
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            X.0EA r1 = new X.0EA     // Catch:{ all -> 0x0ad3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0a0a
        L_0x09d3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = " did not call through to super.onDestroy()"
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            X.0EA r1 = new X.0EA     // Catch:{ all -> 0x0ad3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0a0a
        L_0x09ef:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = " did not call through to super.onResume()"
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            X.0EA r1 = new X.0EA     // Catch:{ all -> 0x0ad3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0ad3 }
        L_0x0a0a:
            throw r1     // Catch:{ all -> 0x0ad3 }
        L_0x0a0b:
            if (r14 != 0) goto L_0x0a59
            r0 = -1
            if (r1 != r0) goto L_0x0a59
            boolean r0 = r3.A0i     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0a59
            int r0 = r3.A04     // Catch:{ all -> 0x0ad3 }
            if (r0 > 0) goto L_0x0a59
            boolean r0 = X.AnonymousClass01z.A0E(r7)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0a32
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "Cleaning up state of never attached fragment: "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x0a32:
            X.021 r1 = r15.A04     // Catch:{ all -> 0x0ad3 }
            X.04X r0 = r1.A00     // Catch:{ all -> 0x0ad3 }
            r0.A0T(r3)     // Catch:{ all -> 0x0ad3 }
            r1.A07(r15)     // Catch:{ all -> 0x0ad3 }
            boolean r0 = X.AnonymousClass01z.A0E(r7)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0a56
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "initState called for fragment: "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x0a56:
            r3.A0p()     // Catch:{ all -> 0x0ad3 }
        L_0x0a59:
            boolean r0 = r3.A03     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0ad0
            android.view.View r0 = r3.A0F     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0a91
            android.view.ViewGroup r0 = r3.A0G     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0a91
            r3.A0l()     // Catch:{ all -> 0x0ad3 }
            X.0BU r7 = X.AnonymousClass0BU.A00(r0)     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r3.A0d     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0aae
            boolean r0 = X.AnonymousClass01z.A0E(r6)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0a8a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "SpecialEffectsController: Enqueuing hide operation for fragment "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x0a8a:
            java.lang.Integer r1 = X.C023109s.A0C     // Catch:{ all -> 0x0ad3 }
            java.lang.Integer r0 = X.C023109s.A00     // Catch:{ all -> 0x0ad3 }
            X.AnonymousClass0BU.A02(r15, r7, r1, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x0a91:
            X.01z r1 = r3.A0M     // Catch:{ all -> 0x0ad3 }
            if (r1 == 0) goto L_0x0aa1
            boolean r0 = r3.A0X     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0aa1
            boolean r0 = X.AnonymousClass01z.A0F(r3)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0aa1
            r1.A0H = r4     // Catch:{ all -> 0x0ad3 }
        L_0x0aa1:
            r3.A03 = r2     // Catch:{ all -> 0x0ad3 }
            boolean r0 = r3.A0d     // Catch:{ all -> 0x0ad3 }
            r3.A18(r0)     // Catch:{ all -> 0x0ad3 }
            X.01z r0 = r3.A0L     // Catch:{ all -> 0x0ad3 }
            r0.A0R()     // Catch:{ all -> 0x0ad3 }
            goto L_0x0ad0
        L_0x0aae:
            boolean r0 = X.AnonymousClass01z.A0E(r6)     // Catch:{ all -> 0x0ad3 }
            if (r0 == 0) goto L_0x0ac8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad3 }
            r1.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = "SpecialEffectsController: Enqueuing show operation for fragment "
            r1.append(r0)     // Catch:{ all -> 0x0ad3 }
            r1.append(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ad3 }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0ad3 }
        L_0x0ac8:
            java.lang.Integer r1 = X.C023109s.A01     // Catch:{ all -> 0x0ad3 }
            java.lang.Integer r0 = X.C023109s.A00     // Catch:{ all -> 0x0ad3 }
            X.AnonymousClass0BU.A02(r15, r7, r1, r0)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0a91
        L_0x0ad0:
            r15.A01 = r2
            return
        L_0x0ad3:
            r0 = move-exception
            r15.A01 = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C022909q.A04():void");
    }

    public C022909q(AnonymousClass02E r2, AnonymousClass025 r3, AnonymousClass021 r4) {
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
    }

    public C022909q(AnonymousClass025 r4, AnonymousClass029 r5, C08820bN r6, AnonymousClass021 r7, ClassLoader classLoader) {
        this.A03 = r4;
        this.A04 = r7;
        AnonymousClass02E A002 = r5.A00(r6.A05);
        Bundle bundle = r6.A04;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        A002.A17(bundle);
        A002.A0W = r6.A07;
        A002.A0b = r6.A09;
        A002.A0j = true;
        A002.A07 = r6.A02;
        A002.A05 = r6.A01;
        A002.A0U = r6.A06;
        A002.A0k = r6.A0C;
        A002.A0i = r6.A0B;
        A002.A0a = r6.A08;
        A002.A0d = r6.A0A;
        A002.A0O = AnonymousClass01P.values()[r6.A03];
        Bundle bundle2 = r6.A00;
        A002.A0B = bundle2 == null ? new Bundle() : bundle2;
        this.A02 = A002;
        if (AnonymousClass01z.A0E(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(A002);
            Log.v("FragmentManager", sb.toString());
        }
    }
}
