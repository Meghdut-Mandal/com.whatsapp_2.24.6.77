package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.mediacomposer.GifComposerFragment;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.StickerComposerFragment;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.4vd  reason: invalid class name and case insensitive filesystem */
public abstract class C100764vd extends C42791zU {
    public AnonymousClass09Y A00 = null;
    public AnonymousClass02E A01 = null;
    public final C000700i A02 = new C000700i();
    public final C000700i A03 = new C000700i();
    public final AnonymousClass01z A04;

    public long A0Q(int i) {
        C1031053t r3 = (C1031053t) this;
        MediaComposerActivity mediaComposerActivity = r3.A00;
        return C36431kI.A09(C90514aH.A0o(AnonymousClass6VT.A03(mediaComposerActivity).get(C1031053t.A00(r3, i)), mediaComposerActivity.A1v));
    }

    public AnonymousClass02E A0R(int i) {
        AnonymousClass02E imageComposerFragment;
        Bundle A07;
        AnonymousClass02E r2;
        Bundle bundle;
        C1031053t r3 = (C1031053t) this;
        MediaComposerActivity mediaComposerActivity = r3.A00;
        Uri uri = (Uri) AnonymousClass6VT.A03(mediaComposerActivity).get(C1031053t.A00(r3, i));
        int A002 = AnonymousClass6QO.A00(mediaComposerActivity.A1r.A03(uri), mediaComposerActivity.A0m);
        if (A002 != 1) {
            if (A002 == 3) {
                AnonymousClass00C.A0D(uri, 0);
                bundle = AnonymousClass001.A07();
                bundle.putParcelable("uri", uri);
                r2 = new VideoComposerFragment();
            } else if (A002 != 13) {
                return null;
            } else {
                AnonymousClass00C.A0D(uri, 0);
                bundle = AnonymousClass001.A07();
                bundle.putParcelable("uri", uri);
                r2 = new GifComposerFragment();
            }
            r2.A17(bundle);
            return r2;
        }
        if (C111075bh.A00(mediaComposerActivity.A0s.A01)) {
            int A003 = C1031053t.A00(r3, i);
            AnonymousClass00C.A0D(uri, 0);
            A07 = AnonymousClass001.A07();
            A07.putParcelable("uri", uri);
            A07.putInt("position", A003);
            imageComposerFragment = new StickerComposerFragment();
        } else {
            imageComposerFragment = new ImageComposerFragment();
            A07 = AnonymousClass001.A07();
            A07.putParcelable("uri", uri);
        }
        imageComposerFragment.A17(A07);
        return imageComposerFragment;
    }

    public Parcelable A08() {
        Bundle bundle;
        C000700i r7 = this.A03;
        int i = 0;
        if (r7.A00() > 0) {
            bundle = AnonymousClass001.A07();
            long[] jArr = new long[r7.A00()];
            for (int i2 = 0; i2 < r7.A00(); i2++) {
                long A022 = r7.A02(i2);
                jArr[i2] = A022;
                bundle.putParcelable(Long.toString(A022), (C08740bF) r7.A04(i2));
            }
            bundle.putLongArray("states", jArr);
        } else {
            bundle = null;
        }
        while (true) {
            C000700i r1 = this.A02;
            if (i >= r1.A00()) {
                return bundle;
            }
            AnonymousClass02E r3 = (AnonymousClass02E) r1.A04(i);
            if (r3 != null && r3.A12()) {
                if (bundle == null) {
                    bundle = AnonymousClass001.A07();
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("f");
                this.A04.A0Y(bundle, r3, C36411kG.A11(A0u, r1.A02(i)));
            }
            i++;
        }
    }

    public void A0C(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            long[] longArray = bundle.getLongArray("states");
            C000700i r7 = this.A03;
            r7.A07();
            C000700i r5 = this.A02;
            r5.A07();
            if (longArray != null) {
                for (long j : longArray) {
                    r7.A0A(j, bundle.getParcelable(Long.toString(j)));
                }
            }
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                String A0C = AnonymousClass001.A0C(it);
                if (A0C.startsWith("f")) {
                    AnonymousClass02E A0M = this.A04.A0M(bundle, A0C);
                    if (A0M != null) {
                        A0M.A11(false);
                        r5.A0A(Long.parseLong(A0C.substring(1)), A0M);
                    } else {
                        C36321k7.A1R("FragmentPagerAdapter/Bad fragment at key ", A0C, AnonymousClass000.A0u());
                    }
                }
            }
        }
    }

    public void A0G(ViewGroup viewGroup) {
        try {
            AnonymousClass09Y r0 = this.A00;
            if (r0 != null) {
                r0.A04();
                this.A00 = null;
            }
        } catch (IllegalStateException e) {
            Log.e("UpdatableFragmentPagerAdapter/finishUpdate", e);
        }
    }

    public /* bridge */ /* synthetic */ void A0O(ViewGroup viewGroup, Object obj, int i) {
        AnonymousClass02E r4 = (AnonymousClass02E) obj;
        AnonymousClass02E r0 = this.A01;
        if (r4 != r0) {
            if (r0 != null) {
                r0.A11(false);
                this.A01.A1V(false);
            }
            r4.A11(true);
            r4.A1V(true);
            this.A01 = r4;
        }
    }

    public /* bridge */ /* synthetic */ boolean A0P(View view, Object obj) {
        return C36361kB.A1a(((AnonymousClass02E) obj).A0F, view);
    }

    public C100764vd(AnonymousClass01z r2) {
        this.A04 = r2;
    }

    public void A0D(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("ViewPager with adapter ");
            A0u.append(this);
            throw AnonymousClass000.A0g(" requires a view id", A0u);
        }
    }

    public /* bridge */ /* synthetic */ Object A0M(ViewGroup viewGroup, int i) {
        long A0Q = A0Q(i);
        C000700i r4 = this.A02;
        Object A05 = r4.A05(A0Q);
        AnonymousClass02E r6 = A05;
        if (A05 == null) {
            if (this.A00 == null) {
                this.A00 = new AnonymousClass09Y(this.A04);
            }
            AnonymousClass02E A0R = A0R(i);
            C08740bF r0 = (C08740bF) this.A03.A05(A0Q);
            if (r0 != null) {
                A0R.A0x(r0);
            }
            A0R.A11(false);
            A0R.A1V(false);
            r4.A0A(A0Q, A0R);
            this.A00.A0E(A0R, C36381kD.A0z("f", AnonymousClass000.A0u(), A0Q), viewGroup.getId());
            r6 = A0R;
        }
        return r6;
    }

    /* renamed from: A0S */
    public void A0N(ViewGroup viewGroup, AnonymousClass02E r13, int i) {
        long j;
        int A0L = A0L(r13);
        C000700i r7 = this.A02;
        int i2 = 0;
        if (r7.A01) {
            int i3 = r7.A00;
            long[] jArr = r7.A02;
            Object[] objArr = r7.A03;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != AnonymousClass045.A00) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            r7.A01 = false;
            r7.A00 = i4;
        }
        int i6 = r7.A00;
        while (true) {
            if (i2 >= i6) {
                break;
            } else if (r7.A03[i2] != r13) {
                i2++;
            } else if (i2 != -1) {
                j = r7.A02(i2);
                Object[] objArr2 = r7.A03;
                Object obj2 = objArr2[i2];
                Object obj3 = AnonymousClass045.A00;
                if (obj2 != obj3) {
                    objArr2[i2] = obj3;
                    r7.A01 = true;
                }
            }
        }
        j = -1;
        if (!r13.A12() || A0L == -2) {
            this.A03.A08(j);
        } else {
            this.A03.A0A(j, this.A04.A0K(r13));
        }
        AnonymousClass09Y r1 = this.A00;
        if (r1 == null) {
            r1 = new AnonymousClass09Y(this.A04);
            this.A00 = r1;
        }
        r1.A08(r13);
    }
}
